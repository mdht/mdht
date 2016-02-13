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
 *     Dan Brown (Audacious Inquiry) - implement fix for artf3818 : Errata 384 Incorporate No Information Section Fixes
 *     								 - support overriding associations for the sake of removal
 *
 * $Id$
 */
package org.eclipse.mdht.uml.transform.ecore;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.eclipse.mdht.uml.transform.internal.Logger;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.UMLPackage;

public abstract class TransformAssociation extends TransformAbstract {

	private String getName(Class theClass) {
		return theClass != null
				? theClass.getQualifiedName()
				: "CLASS NOT FOUND!";
	}

	protected void logUnsupportedAssociation(Class sourceClass, Class baseSourceClass, Class targetClass,
			Class baseTargetClass, int level) {
		String message = "Unsupported association: " + getName(baseSourceClass) + "(" + getName(sourceClass) + ")" +
				" -> " + getName(baseTargetClass) + "(" + getName(targetClass) + ")";

		Logger.log(level, message);
	}

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
			logUnsupportedAssociation(sourceClass, baseSourceClass, targetClass, baseTargetClass, Logger.ERROR);
			removeModelElement(sourceProperty);
			removeModelElement(association);
			return null;
		}

		// Support target class without templateId by using its superclass template.
		// For untemplated classes (subclasses of CDA), use the base CDA class (last parent).
		Class constraintTarget = targetClass;
		if (!enableVariation_UseOriginalType()) {
			List<Classifier> parents = new ArrayList<Classifier>(targetClass.getGenerals());
			while (!parents.isEmpty() && !getEcoreProfile().isPrimaryEClass(constraintTarget)) {
				if (parents.get(0) instanceof Class) {
					constraintTarget = (Class) parents.remove(0);
				}
			}
		}

		// if we still don't have a template ID and we're a nested class (which will get tossed away),
		// then the nearest non-nested parent
		if (!getEcoreProfile().isPrimaryEClass(constraintTarget) &&
				TransformInlinedProperties.isInlineClassLocal(constraintTarget)) {
			for (Classifier next : constraintTarget.allParents()) {
				if ((next instanceof Class) && !TransformInlinedProperties.isInlineClassLocal((Class) next)) {
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

				logUnsupportedAssociation(sourceClass, baseSourceClass, targetClass, baseTargetClass, Logger.ERROR);

				removeModelElement(sourceProperty);
				removeModelElement(association);
				return null;
			}

			final String selector = !TransformInlinedProperties.isInlineClassLocal(targetClass)
					? null
					: TransformInlinedProperties.getInlineFilterLocal(targetClass);

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
					: Math.max(enableVariation_UseOriginalLowerbound()
							? 0
							: 1,
						sourceProperty.getLower());

			// can't use quantifiers like 'one' and 'exists' with a selector because it filters a collection.
			// Note that 'exists' isn't applicable to lower bounds greater than 1
			// open - is association open or closed
			final boolean open = isOpen(association);
			final boolean one = (((selector == null) || (selector.length() == 0)) && (upper == 1)) && open &&
					(enableVariation_UseOriginalLowerbound()
							? lower == 1
							: true);
			final boolean notEmpty = (lower == 1) && (upper == LiteralUnlimitedNatural.UNLIMITED);
			final boolean exists = (notEmpty && ((selector == null) || (selector.length() == 0))) && open;

			final String comparator;
			final String upperComparator;
			if (one || exists || isEmpty || notEmpty) { // special cases
				comparator = null;
				upperComparator = null;
				// range = null;
			} else if (upper == lower) {
				comparator = " = " + lower;
				// range = null;
				upperComparator = null;
			} else if (upper > lower) {
				// don't use %d in case locale introduces a thousands separator
				// range = String.format("%s..%s", lower, upper);
				// range = null;
				comparator = lower == 0
						? null
						: " >= " + lower;
				upperComparator = " <= " + upper;
			} else {
				// if the upper < lower, then it only makes sense if upper is -1 (*)
				comparator = " >= " + lower;
				// range = null;
				upperComparator = null;
			}

			constraintBody.append(addPrefix(baseSourceClass) + associationEnd + "->");
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
			appendAssociationStereotypeConditions(
				constraintBody, association, associationEnd, sourceClass, targetClass);

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

					if (upperComparator == null) {
						// compare the cardinality against some number
						constraintBody.append(comparator);
					} else if (comparator == null) {
						// compare the cardinality against some number
						constraintBody.append(upperComparator);
					} else {
						String select = constraintBody.toString();
						constraintBody.append(comparator).append(" and ").append(select).append(upperComparator);
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
		String constraintName = createConstraintName(sourceProperty);
		String validationMessage = getEcoreProfile().getValidationMessage(association, ValidationStereotypeKind.ANY);
		if (severity != null) {
			setupConstraint(sourceClass, constraintName, constraintBody, false);
			if (severity == ValidationSeverityKind.INFO) {
				addValidationInfo(sourceClass, constraintName, validationMessage);
			} else if (severity == ValidationSeverityKind.WARNING) {
				addValidationWarning(sourceClass, constraintName, validationMessage);
			} else {
				addValidationError(sourceClass, constraintName, validationMessage);
			}
		} else {
			// association severity is empty
			EList<RedefinableElement> elements = sourceProperty.getRedefinedElements();
			// System.out.println("Attempting to add association override removal: " + constraintName +
			// System.lineSeparator() + "elements: " + elements);
			if (elements != null && !elements.isEmpty()) {
				// association severity is empty and it redefines something
				setupConstraint(sourceClass, constraintName, constraintBody, true);
				// System.out.println("Adding association override removal:");
				// System.out.printf(
				// "%s, %s, %s, %s", sourceClass, constraintName, validationMessage, System.lineSeparator());
				addValidationError(sourceClass, constraintName, validationMessage);
			}
			// else {
			// System.out.println("!Did NOT add " + constraintName + " since it does not redefine anything");
			// }
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

	/**
	 *
	 * by default - all constraints are open
	 *
	 * @param association
	 * @return
	 */
	protected boolean isOpen(Association association) {
		return true;
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
	 * Also make sure the the class name is valid for Java - so no spaces, etc
	 *
	 * @param constraintTarget
	 * @return
	 */
	public String getConstraintTargetQualifiedName(Class constraintTarget) {

		String retVal = constraintTarget.getQualifiedName().replace(
			constraintTarget.getName(),
			org.eclipse.uml2.common.util.UML2Util.getValidJavaIdentifier(constraintTarget.getName()));

		if (enableVariation_UseOriginalType()) {
			return retVal;
		}

		String[] arrStr = retVal.split("::");
		if (arrStr.length > 2) {
			retVal = getBaseClass(constraintTarget).getQualifiedName();
		}
		return retVal;
	}

	/**
	 *
	 * Returns the OCL prefix required based on the implementation.
	 * The String returned for the base class is simply "self." as to not interfere with this generic version.
	 * However, for the child class TransformCDAAssociation.java -
	 * It is overridden to provide more complex OCL based on a specific scenario.
	 * The scenario is Errata 384:
	 * For all sections requiring entries, If nullFlavor = NI is NOT present, or a different (incorrect) nullFLavor type is present:
	 * The entry requirement is enforced.
	 * Otherwise, if there is no nullFlavor = NI specified on the section:
	 * The entry is required as defined by the existing OCL constraint.
	 *
	 * In the future, other subclasses could override the method for their own prefix requirements as well.
	 *
	 * @param baseSourceClass
	 *            used for sub class overrides to determine what type of element we are dealing with.
	 *            If the subclass is calling the method, pass in null since it is not used in the (this) super.
	 * @return OCL prefix in String form to be appended
	 */
	protected String addPrefix(Class baseSourceClass) {
		return "self.";
	}

	private static void setupConstraint(Class sourceClass, String constraintName, StringBuilder constraintBody,
			boolean isRemovalOverride) {
		Constraint constraint = sourceClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(sourceClass);

		OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(
			null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(isRemovalOverride
				? "true"
				: constraintBody.toString());
	}
}
