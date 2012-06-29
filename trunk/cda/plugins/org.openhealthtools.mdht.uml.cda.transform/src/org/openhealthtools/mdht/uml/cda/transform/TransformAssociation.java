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
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.transform;

import static org.openhealthtools.mdht.uml.cda.transform.TransformInlinedAssociations.getInlineFilter;
import static org.openhealthtools.mdht.uml.cda.transform.TransformInlinedAssociations.isInlineClass;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

public class TransformAssociation extends TransformAbstract {

	public TransformAssociation(TransformerOptions options) {
		super(options);
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

		Class cdaSourceClass = getCDAClass(sourceClass);
		Class cdaTargetClass = getCDAClass(targetClass);

		if (cdaSourceClass == null || cdaTargetClass == null) {
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
		while (!parents.isEmpty() && CDAModelUtil.getTemplateId(constraintTarget) == null) {
			if (parents.get(0) instanceof Class) {
				constraintTarget = (Class) parents.remove(0);
			}
		}

		// Validate target and source classes to include only supported relationships:
		// ClinicalDocument -> Section, Section -> Section
		// Section -> { Act, Encounter, ... }
		// Organizer -> { Act, Encounter, ... }
		// { Act, Encounter, ... } -> { Act, Encounter, ... }

		String cdaTargetName = cdaTargetClass.getName();
		String cdaTargetLowerName = cdaTargetName.substring(0, 1).toLowerCase() + cdaTargetName.substring(1);
		String cdaTargetQName = cdaTargetClass.getQualifiedName();

		String constraintTargetQName = constraintTarget.getQualifiedName();

		StringBuffer constraintBody = new StringBuffer();
		Stereotype stereotype = null;

		StringBuffer operationBody = new StringBuffer();

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
				CDAModelUtil.isSection(targetClass)) {
			// ClinicalDocument -> Section || Section -> Section
			constraintBody.append("self.getAllSections()->");
			constraintBody.append((sourceProperty.getUpper() == 1)
					? "one("
					: "exists(");
			constraintBody.append("section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(" +
					constraintTargetQName + "))");

			// start building "getter" operation body
			operationBody.append(constraintBody.toString().replace("one", "select").replace("exists", "select"));
		} else {
			String associationEnd = null;
			String variableDeclaration = null;
			// if (CDAModelUtil.isSection(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
			if (CDAModelUtil.isSection(sourceClass) &&
					(CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
				associationEnd = "entry";
				variableDeclaration = "entry : cda::Entry";
			} else if (CDAModelUtil.isOrganizer(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
				associationEnd = "component";
				variableDeclaration = "component : cda::Component4";
			} else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
				associationEnd = "entryRelationship";
				variableDeclaration = "entryRelationship : cda::EntryRelationship";
			} else if (CDAModelUtil.isClinicalStatement(sourceClass) &&
					"ParticipantRole".equals(cdaTargetClass.getName())) {
				associationEnd = "participant";
				variableDeclaration = "participant : cda::Participant2";
			} else if (CDAModelUtil.isClinicalStatement(sourceClass) &&
					"AssignedEntity".equals(cdaTargetClass.getName())) {
				associationEnd = "performer";
				variableDeclaration = "performer : cda::Performer2";
			} else {

				// See if we have a property with the same class type
				Property property = cdaSourceClass.getOwnedAttribute(null, targetClass, true, null, false);

				// If not - walk the hierarchy and check for properties
				if (property == null) {
					for (Classifier c : targetClass.allParents()) {

						property = cdaSourceClass.getOwnedAttribute(null, c, true, null, false);

						if (property != null || CDAModelUtil.isCDAModel(c)) {
							break;
						}

					}
				}

				// If we still can not find - use the name - this is not optimal but CDA has some hop scotch hierarchies such as consumable and
				// manufactured product
				if (property == null) {
					property = cdaSourceClass.getOwnedAttribute(sourceProperty.getName(), null, true, null, false);
				}

				// If we found it, process it
				if (property != null) {
					associationEnd = property.getName();

					variableDeclaration = property.getName() + " : cda::" + property.getType().getName();

					// do not generate a getter already there
					firstOrderAssociation = true;

				} else {

					String message = "Unsupported association: " + sourceClass.getQualifiedName() + " -> " +
							targetClass.getQualifiedName();
					Logger.log(Logger.ERROR, message);

					removeModelElement(sourceProperty);
					removeModelElement(association);
					return null;
				}

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
			if (!firstOrderAssociation && !CDAModelUtil.isEntry(targetClass)) {
				reference += "." + cdaTargetLowerName;
			}
			constraintBody.append("not " + reference + ".oclIsUndefined() and ");
			constraintBody.append(reference + ".oclIsKindOf(" + constraintTargetQName + ")");

			if (CDAModelUtil.isSection(sourceClass) &&
					(CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
				// Section -> Entry, Section -> clinicalStatement (entry)
				stereotype = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY);
			} else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass) &&
					!CDAModelUtil.isOrganizer(sourceClass)) {
				// clinicalStatement (not Organizer) -> clinicalStatement (entryRelationship)
				stereotype = CDAProfileUtil.getAppliedCDAStereotype(
					association, ICDAProfileConstants.ENTRY_RELATIONSHIP);
			} else {
				stereotype = null;
			}

			if (stereotype != null) {
				Object value = association.getValue(stereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
				String typeCode = null;
				if (value instanceof EnumerationLiteral) {
					typeCode = ((EnumerationLiteral) value).getName();
				} else if (value instanceof Enumerator) {
					typeCode = ((Enumerator) value).getName();
				}

				if (typeCode != null) {
					String enumerationQName = CDAModelUtil.isSection(sourceClass)
							? "vocab::x_ActRelationshipEntry"
							: "vocab::x_ActRelationshipEntryRelationship";
					constraintBody.append(" and " + associationEnd + ".typeCode = " + enumerationQName + "::" +
							typeCode);
				}
			}

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
			operationBody.append("self.get" + pluralize(cdaTargetName) + "()->select(");
			operationBody.append(cdaTargetLowerName + " : " + cdaTargetQName + " | ");
			operationBody.append("not " + cdaTargetLowerName + ".oclIsUndefined() and ");
			operationBody.append(cdaTargetLowerName + ".oclIsKindOf(" + constraintTargetQName + "))");
		}

		// if (CDAModelUtil.getTemplateId(sourceClass) == null
		// || CDAModelUtil.getTemplateId(targetClass) == null) {
		// String message = "Source or target is not a template: "
		// + sourceClass.getQualifiedName()
		// + " -> " + targetClass.getQualifiedName();
		// Logger.log(Logger.WARNING, message);
		// }

		String severity = CDAModelUtil.getValidationSeverity(association);
		if (severity != null) {
			String constraintName = createConstraintName(sourceProperty);
			Constraint constraint = sourceClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
			constraint.getConstrainedElements().add(sourceClass);

			OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(
				null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
			expression.getLanguages().add("OCL");
			expression.getBodies().add(constraintBody.toString());

			String validationMessage = CDAModelUtil.getValidationMessage(association);
			if ("INFO".equals(severity)) {
				addValidationInfo(sourceClass, constraintName, validationMessage);
			} else if ("WARNING".equals(severity)) {
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
				operationName += CDAModelUtil.getModelPrefix(sourceProperty);
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
}
