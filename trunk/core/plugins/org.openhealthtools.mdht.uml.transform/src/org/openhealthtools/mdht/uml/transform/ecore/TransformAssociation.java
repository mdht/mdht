/**
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - more accurate association multiplicity constraints (artf3100)
 *                        - support local datatype subclasses (artf3350)
 *     Rama Ramakrishnan  - Getting the correct qualified anme for multiple level inline nested clasees (artf3410)                   
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.transform.ecore;

import static org.openhealthtools.mdht.uml.transform.ecore.TransformInlinedProperties.getInlineFilter;
import static org.openhealthtools.mdht.uml.transform.ecore.TransformInlinedProperties.isInlineClass;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.openhealthtools.mdht.uml.transform.internal.Logger;

public abstract class TransformAssociation extends TransformAbstract {

	public TransformAssociation(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public Object caseAssociation(Association association) {

		if (isRemoved(association)) {
			return null;
		}

		boolean firstOrderAssociation = false;

		Class sourceClass = null;
		Class targetClass = null;

		Property sourceProperty = null;

		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {
				sourceClass = property.getClass_();
				// Fix for artf2708
				// Primitive types are sub types of DataType interface. Hence need
				// to validate if the property.getType() can be cast to Class type.
				if (property.getType() instanceof Class) {
					targetClass = (Class) property.getType();
					sourceProperty = property;
				}
				break;
			}
		}

		if (sourceClass == null || targetClass == null || sourceProperty == null) {
			removeModelElement(sourceProperty);
			removeModelElement(association);
			return null;
		}

		Class baseSourceClass = getBaseClass(sourceClass);
		Class baseTargetClass = getBaseClass(targetClass);

		if (baseSourceClass == null || baseTargetClass == null) {
			String message = "Unsupported association: " + sourceClass.getQualifiedName() + " -> " +
					sourceProperty.getType().getQualifiedName();
			Logger.log(Logger.ERROR, message);

			removeModelElement(sourceProperty);
			removeModelElement(association);
			return null;
		}

		// Support target class without templateId by using its superclass template.
		// For untemplated classes (subclasses of CDA), use the base CDA class (last parent).
		Class constraintTarget = targetClass;
		List<Classifier> parents = new ArrayList<Classifier>(targetClass.getGenerals());
		while (!parents.isEmpty() && !getEcoreProfile().isPrimaryEClass(constraintTarget)) {
			if (parents.get(0) instanceof Class) {
				constraintTarget = (Class) parents.remove(0);
			}
		}

		// if we still don't have a template ID and we're a nested class (which will get tossed away),
		// then the nearest non-nested parent
		if (!getEcoreProfile().isPrimaryEClass(constraintTarget) && isInlineClass(constraintTarget)) {
			for (Classifier next : constraintTarget.allParents()) {
				if ((next instanceof Class) && !isInlineClass((Class) next)) {
					constraintTarget = (Class) next;
					break;
				}
			}
		}

		// Validate target and source classes to include only supported relationships:
		// ClinicalDocument -> Section, Section -> Section
		// Section -> { Act, Encounter, ... }
		// Organizer -> { Act, Encounter, ... }
		// { Act, Encounter, ... } -> { Act, Encounter, ... }

		String baseTargetName = baseTargetClass.getName();
		String baseTargetLowerName = baseTargetName.substring(0, 1).toLowerCase() + baseTargetName.substring(1);
		String baseTargetQName = baseTargetClass.getQualifiedName();

		// Get the qualified name of the targetClass. If nested to more than 2 levels get the
		// qualified name of the base class.
		String constraintTargetQName = getConstraintTargetQualifiedName(constraintTarget);

		StringBuilder constraintBody = new StringBuilder();
		StringBuilder operationBody = new StringBuilder();

		if (!handleSpecialAssociation(
			constraintBody, operationBody, sourceProperty, sourceClass, targetClass, constraintTargetQName)) {

			String[] associationEndOut = new String[1];
			String[] variableDeclarationOut = new String[1];
			if (getAssociationEndAndIteratorDeclaration(
				sourceProperty, sourceClass, baseSourceClass, targetClass, baseTargetClass, associationEndOut,
				variableDeclarationOut)) {
				firstOrderAssociation = true;
			}
			String associationEnd = associationEndOut[0];
			String variableDeclaration = variableDeclarationOut[0];

			if ((associationEnd == null) || (variableDeclaration == null)) {
				String message = "Unsupported association: " + sourceClass.getQualifiedName() + " -> " +
						targetClass.getQualifiedName();
				Logger.log(Logger.ERROR, message);

				removeModelElement(sourceProperty);
				removeModelElement(association);
				return null;
			}

			final String selector = !isInlineClass(targetClass)
					? null
					: getInlineFilter(targetClass);

			//
			// The only associations that can have a 0 lower bound are those that implement
			// SHOULD or MAY constraints, because these imply optionality. Even so, to
			// check these constraints, the OCL condition must require the presence of the
			// object. Otherwise, absence of a SHOULD association would not report anything.
			//
			// UNLESS the upper bound is zero, in which case we are constraining an
			// association not to exist. Then, the lower bound must zero and an isEmpty()
			// operation is most appropriate.
			//
			final int upper = sourceProperty.upperBound();
			final boolean isEmpty = (upper == 0);
			final int lower = isEmpty
					? 0
					: Math.max(1, sourceProperty.getLower());

			// can't use quantifiers like 'one' and 'exists' with a selector because it filters a collection.
			// Note that 'exists' isn't applicable to lower bounds greater than 1
			final boolean one = ((selector == null) || (selector.length() == 0)) && (upper == 1);
			final boolean notEmpty = (lower == 1) && (upper == LiteralUnlimitedNatural.UNLIMITED);
			final boolean exists = notEmpty && ((selector == null) || (selector.length() == 0));
			final String comparator;
			final String range;
			if (one || exists || isEmpty || notEmpty) { // special cases
				comparator = null;
				range = null;
			} else if (upper == lower) {
				comparator = " = " + lower;
				range = null;
			} else if (upper > lower) {
				// don't use %d in case locale introduces a thousands separator
				range = String.format("%s..%s", lower, upper);
				comparator = null;
			} else {
				// if the upper < lower, then it only makes sense if upper is -1 (*)
				comparator = " >= " + lower;
				range = null;
			}

			if (range != null) {
				constraintBody.append(range).append("->includes(");
			}

			constraintBody.append("self." + associationEnd + "->");
			constraintBody.append(one
					? "one("
					: exists
							? "exists("
							: "select(");
			constraintBody.append(variableDeclaration);
			constraintBody.append(" | ");

			String reference = associationEnd;
			if (!firstOrderAssociation && !isImplicitAssociation(sourceProperty, sourceClass, targetClass)) {
				reference += "." + baseTargetLowerName;
			}
			constraintBody.append("not " + reference + ".oclIsUndefined() and ");
			constraintBody.append(reference + ".oclIsKindOf(" + constraintTargetQName + ")");

			// handle any stereotypes that may be applied to the association
			appendAssociationStereotypeConditions(constraintBody, association, associationEnd, sourceClass, targetClass);

			// close off the 'select' or 'exists' or 'one' iterator
			constraintBody.append(")");

			// is the association inlined and, if so, does it have a selector?
			if ((selector != null) && (selector.length() > 0)) {
				// append the selector to re-filter for the members of the derived subset
				constraintBody.append(selector);
			}

			if (isEmpty) {
				constraintBody.append("->isEmpty()");
			} else if (!(one || exists)) { // otherwise, we already closed the 'one' or 'exists' iterator
				if (notEmpty) {
					// can use the more meaningful (and possibly more efficient, depending) 'notEmpty' operation
					constraintBody.append("->notEmpty()");
				} else {
					// constrain the cardinality explicitly
					constraintBody.append("->size()");

					if (range != null) {
						// close the 'includes' operation
						constraintBody.append(")");
					} else {
						// compare the cardinality against some number
						constraintBody.append(comparator);
					}
				}
			}

			// start building "getter" operation body
			operationBody.append("self.get" + pluralize(baseTargetName) + "()->select(");
			operationBody.append(baseTargetLowerName + " : " + baseTargetQName + " | ");
			operationBody.append("not " + baseTargetLowerName + ".oclIsUndefined() and ");
			operationBody.append(baseTargetLowerName + ".oclIsKindOf(" + constraintTargetQName + "))");
		}

		ValidationSeverityKind severity = getEcoreProfile().getValidationSeverity(
			association, ValidationStereotypeKind.ANY);
		if (severity != null) {
			String constraintName = createConstraintName(sourceProperty);
			Constraint constraint = sourceClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
			constraint.getConstrainedElements().add(sourceClass);

			OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(
				null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
			expression.getLanguages().add("OCL");
			expression.getBodies().add(constraintBody.toString());

			String validationMessage = getEcoreProfile().getValidationMessage(association, ValidationStereotypeKind.ANY);
			if (severity == ValidationSeverityKind.INFO) {
				addValidationInfo(sourceClass, constraintName, validationMessage);
			} else if (severity == ValidationSeverityKind.WARNING) {
				addValidationWarning(sourceClass, constraintName, validationMessage);
			} else {
				addValidationError(sourceClass, constraintName, validationMessage);
			}
		}

		// create "getter" operation (only if not producing a domain interface)
		if ((!(targetClass.getOwner() instanceof Class)) && !firstOrderAssociation &&
				!transformerOptions.isGenerateDomainInterface()) {
			// finish building "getter" operation body
			if (sourceProperty.getUpper() == 1) {
				// artf3203: Eclipse OCL 3.1 now returns invalid when trying to get the first element of an empty sequence
				operationBody.append("->asSequence()->any(true)");
			}
			operationBody.append(".oclAsType(" + constraintTargetQName + ")");

			String operationName = "get";
			if (!UMLUtil.getRedefinedProperties(sourceProperty).isEmpty()) {
				operationName += getEcoreProfile().getModelPrefix(sourceProperty);
			}
			operationName += ((sourceProperty.getUpper() == 1)
					? capitalize(sourceProperty.getName())
					: capitalize(pluralize(sourceProperty.getName())));
			Operation operation = sourceClass.createOwnedOperation(operationName, null, null, constraintTarget);
			operation.setIsQuery(true); // make this a query method
			operation.setUpper(sourceProperty.getUpper());

			// create body constraint for "getter" operation
			Constraint bodyConstraint = operation.createBodyCondition("body");
			bodyConstraint.getConstrainedElements().add(operation);

			OpaqueExpression bodyExpression = (OpaqueExpression) bodyConstraint.createSpecification(
				null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
			bodyExpression.getLanguages().add("OCL");
			bodyExpression.getBodies().add(operationBody.toString());
		}

		removeModelElement(sourceProperty);
		removeModelElement(association);

		return association;
	}

	protected boolean isImplicitAssociation(Property sourceProperty, Class sourceClass, Class targetClass) {
		return false;
	}

	protected boolean handleSpecialAssociation(StringBuilder constraintBody, StringBuilder operationBody,
			Property sourceProperty, Class sourceClass, Class targetClass, String constraintTargetQName) {

		return false;
	}

	protected abstract boolean getAssociationEndAndIteratorDeclaration(Property sourceProperty, Class sourceClass,
			Class baseSourceClass, Class targetClass, Class baseTargetClass, String[] associationEndOut,
			String[] variableDeclarationOut);

	protected boolean appendAssociationStereotypeConditions(StringBuilder constraintBody, Association association,
			String associationEnd, Class sourceClass, Class targetClass) {

		return false;
	}

	/**
	 * Get the qualified name for the class. In cases where the association end class
	 * can be nested multiple levels deep. In such cases, the OCL's should reference the
	 * base class. This method would return the qualified name of the base class, if the
	 * nesting is more than 2 levels deep.
	 * 
	 * e.g : A class with a qualified name
	 * consol::GeneralHeaderConstraints::RecordTarget::PatientRole should
	 * be referenced as cda::PatientRole
	 * 
	 * @param constraintTarget
	 * @return
	 */
	public String getConstraintTargetQualifiedName(Class constraintTarget) {
		String retVal = constraintTarget.getQualifiedName();

		String[] arrStr = retVal.split("::");
		if (arrStr.length > 2) {
			retVal = getBaseClass(constraintTarget).getQualifiedName();
		}
		return retVal;
	}
}
