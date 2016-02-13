/*******************************************************************************
 * Copyright (c) 2014 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.core.profile.LogicalConstraint;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.cda.transform.internal.Logger;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.transform.EcoreTransformUtil;
import org.eclipse.mdht.uml.transform.IBaseModelReflection;
import org.eclipse.mdht.uml.transform.TransformerOptions;
import org.eclipse.mdht.uml.transform.ecore.TransformConstraint;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.eclipse.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @author seanmuir
 *
 */
public class TransformLogicalConstraint extends TransformConstraint {

	@SuppressWarnings("deprecation")
	private Stereotype getAssociationStereotype(Association association, Class sourceClass, Class targetClass) {
		Stereotype result = null;

		if (CDAModelUtil.isSection(sourceClass) &&
				(CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
			// Section -> Entry, Section -> clinicalStatement (entry)
			result = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY);
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass) &&
				!CDAModelUtil.isOrganizer(sourceClass)) {
			// clinicalStatement (not Organizer) -> clinicalStatement (entryRelationship)
			result = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY_RELATIONSHIP);
		}

		return result;
	}

	protected boolean appendAssociationStereotypeConditions(StringBuilder constraintBody, Association association,
			String associationEnd, Class sourceClass, Class targetClass) {

		boolean result = false;
		Stereotype stereotype = getAssociationStereotype(association, sourceClass, targetClass);

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
				constraintBody.append(" and " + associationEnd + ".typeCode = " + enumerationQName + "::" + typeCode);
			}

			result = true;
		}

		return result;
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

		String[] arrStr = retVal.split("::");
		if (arrStr.length > 2) {
			retVal = getBaseClass(constraintTarget).getQualifiedName();
		}
		return retVal;
	}

	protected boolean isImplicitAssociation(Property sourceProperty, Class sourceClass, Class targetClass) {
		return CDAModelUtil.isEntry(targetClass);
	}

	protected boolean handleSpecialAssociation(StringBuilder constraintBody, StringBuilder operationBody,
			Property sourceProperty, Class sourceClass, Class targetClass, String constraintTargetQName) {
		boolean result = false;

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
				CDAModelUtil.isSection(targetClass)) {
			// ClinicalDocument -> Section || Section -> Section
			constraintBody.append("self.getAllSections()->");
			constraintBody.append((sourceProperty.getUpper() == 1)
					? "one("
					: "exists(");
			constraintBody.append(
				"section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(" +
						constraintTargetQName + "))");

			// start building "getter" operation body
			operationBody.append(constraintBody.toString().replace("one", "select").replace("exists", "select"));

			result = true;
		}

		return result;
	}

	protected boolean getAssociationEndAndIteratorDeclaration(Property sourceProperty, Class sourceClass,
			Class baseSourceClass, Class targetClass, Class baseTargetClass, String[] associationEndOut,
			String[] variableDeclarationOut) {

		boolean result = false;

		// if (CDAModelUtil.isSection(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
		if (CDAModelUtil.isSection(sourceClass) &&
				(CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
			associationEndOut[0] = "entry";
			variableDeclarationOut[0] = "entry : cda::Entry";
		} else if (CDAModelUtil.isOrganizer(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
			associationEndOut[0] = "component";
			variableDeclarationOut[0] = "component : cda::Component4";
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
			associationEndOut[0] = "entryRelationship";
			variableDeclarationOut[0] = "entryRelationship : cda::EntryRelationship";
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) &&
				"ParticipantRole".equals(baseTargetClass.getName())) {
			associationEndOut[0] = "participant";
			variableDeclarationOut[0] = "participant : cda::Participant2";
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) &&
				"AssignedEntity".equals(baseTargetClass.getName())) {
			associationEndOut[0] = "performer";
			variableDeclarationOut[0] = "performer : cda::Performer2";
		} else {
			// See if we have a property with the same class type
			Property property = baseSourceClass.getOwnedAttribute(null, targetClass, true, null, false);

			// If not - walk the hierarchy and check for properties
			if (property == null) {
				for (Classifier c : targetClass.allParents()) {

					property = baseSourceClass.getOwnedAttribute(null, c, true, null, false);

					if (property != null || isBaseModel(targetClass, c)) {
						break;
					}

				}
			}

			// If we still can not find - use the name - this is not optimal but CDA has some hop scotch hierarchies such as consumable and
			// manufactured product
			if (property == null) {
				property = baseSourceClass.getOwnedAttribute(sourceProperty.getName(), null, true, null, false);
			}

			// If we found it, process it
			if (property != null) {
				associationEndOut[0] = property.getName();

				variableDeclarationOut[0] = property.getName() + " : cda::" + property.getType().getName();

				// do not generate a getter already there
				result = true;
			}
		}

		return result;
	}

	public String generateAssociationOCL(Association association) {

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
			// removeModelElement(sourceProperty);
			// removeModelElement(association);
			return null;
		}

		Class baseSourceClass = getBaseClass(sourceClass);
		Class baseTargetClass = getBaseClass(targetClass);

		if (baseSourceClass == null || baseTargetClass == null) {
			String message = "Unsupported association: " + sourceClass.getQualifiedName() + " -> " +
					sourceProperty.getType().getQualifiedName();
			Logger.log(Logger.ERROR, message);

			// removeModelElement(sourceProperty);
			// removeModelElement(association);
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
		if (!getEcoreProfile().isPrimaryEClass(constraintTarget) && CDAModelUtil.isInlineClass(constraintTarget)) {
			for (Classifier next : constraintTarget.allParents()) {
				if ((next instanceof Class) && !CDAModelUtil.isInlineClass((Class) next)) {
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

				// removeModelElement(sourceProperty);
				// removeModelElement(association);
				return null;
			}

			final String selector = !CDAModelUtil.isInlineClass(targetClass)
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

			String validationMessage = getEcoreProfile().getValidationMessage(
				association, ValidationStereotypeKind.ANY);
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

		// removeModelElement(sourceProperty);
		// removeModelElement(association);

		return constraintBody.toString();
	}

	/**
	 * @param targetClass
	 * @return
	 */
	private String getInlineFilter(Class targetClass) {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean isTypeString(Type type) {
		Stereotype eDataType = EcoreTransformUtil.getEcoreStereotype(
			type, org.eclipse.uml2.uml.util.UMLUtil.STEREOTYPE__E_DATA_TYPE);
		String instanceClassName = null;
		if (type.isStereotypeApplied(eDataType)) {
			instanceClassName = (String) type.getValue(
				eDataType, org.eclipse.uml2.uml.util.UMLUtil.TAG_DEFINITION__INSTANCE_CLASS_NAME);
		}
		return UMLUtil.isTypeString(type) || "java.lang.String".equals(instanceClassName);
	}

	private Classifier getNormalizedType(Property property) {
		Classifier result = (property.getType() instanceof Classifier)
				? (Classifier) property.getType()
				: null;

		if (result != null) {
			Classifier baseDatatype = getBaseDatatype(result, property);
			if (baseDatatype != null) {
				// we have already or will copy constraints from the subclass; we don't need the subclass, here
				result = baseDatatype;
			}
		}

		return result;
	}

	private boolean isEDType(Property property) {
		Classifier type = (Classifier) property.getType();
		if (type == null) {
			Property cdaProperty = getBaseProperty(property);
			if (cdaProperty != null) {
				type = (Classifier) cdaProperty.getType();
			} else {
				return false;
			}
		}

		List<Classifier> allTypes = new ArrayList<Classifier>(type.allParents());
		allTypes.add(0, type);

		for (Classifier classifier : allTypes) {
			if ("datatypes::ED".equals(classifier.getQualifiedName())) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Method was lifted from
	 * org.eclipse.mdht.uml.cda.transform.TransformCDAPropertyConstraint.PropertyValidationHandler.addConstraint(PropertyContext)
	 * It was not a simple task to extract the ocl generation from the some of the other functionality
	 *
	 * @param property
	 * @return
	 */
	private StringBuffer generateOCL(Property property) {

		StringBuffer body = new StringBuffer();

		// if (property.getAssociation() != null) {
		// return body.append("false");
		// }

		Property cdaProperty = null;
		Property inheritedProperty = null;
		if (CDAModelUtil.isCDAModel(property)) {
			cdaProperty = property;
			inheritedProperty = property;
		} else {
			cdaProperty = getBaseProperty(property);
			inheritedProperty = getInheritedProperty(property);
		}

		if (cdaProperty == null) {
			String message = "Cannot find CDA property for: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);

			return body.append("aaaa");
		}
		if (inheritedProperty == null) {
			String message = "Cannot find inherited property for: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);

			return body.append("bbbb");
		}
		if (inheritedProperty.getType() == null) {
			String message = "Redefined property has no type: " + inheritedProperty.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			// if property type is null, use type from redefined property
		}
		if (property.getType() == null) {
			String message = "Property has no type: " + property.getQualifiedName();
			Logger.log(Logger.WARNING, message);

			return body.append("cccc");
		}

		final Classifier inheritedPropertyType = getNormalizedType(inheritedProperty);
		final Classifier propertyType = getNormalizedType(property);

		String selfName = "self." + cdaProperty.getName();
		String inheritedTypeQName = inheritedPropertyType.getQualifiedName();
		String templateTypeQName = (propertyType == null)
				? inheritedTypeQName
				: propertyType.getQualifiedName();

		// inherited property may also have non-conformant type
		if (!inheritedPropertyType.conformsTo(cdaProperty.getType())) {
			// use the CDA property type
			inheritedTypeQName = cdaProperty.getType().getQualifiedName();
			templateTypeQName = inheritedTypeQName;
		} else if ((propertyType != null) && !propertyType.conformsTo(inheritedPropertyType)) {
			// don't log error for structural attributes with enumeration type
			if (!(propertyType instanceof Enumeration)) {
				String message = "Property type does not conform to redefined property type: " +
						property.getQualifiedName();
				Logger.log(Logger.ERROR, message);
			}

			// use the inherited property type
			templateTypeQName = inheritedTypeQName;
		}

		/*
		 * Test for multiplicity restriction
		 */
		// if (property.getLower() != inheritedProperty.getLower() || property.getUpper() != inheritedProperty.getUpper()) {

		if (property.getUpper() == 0) {
			// element is prohibited in redefinition
			// place-holder for when this is supported in UML 2.2
		} else if (cdaProperty.getUpper() == 1) {
			// single-valued CDA property
			// if (property.getLower() == 1) {
			if (propertyType instanceof Enumeration) {
				body.append("isDefined('" + cdaProperty.getName() + "')");
			} else {
				body.append("not " + selfName + ".oclIsUndefined()");
			}
			// }
		} else if (cdaProperty.getUpper() > 0 || cdaProperty.getUpper() == LiteralUnlimitedNatural.UNLIMITED) {
			// multi-valued CDA property
			if (property.getUpper() == 1) {
				body.append(selfName + "->size() = 1");
			} else {
				body.append("not " + selfName + "->isEmpty()");
			}
		}
		// }

		/*
		 * Test for type restriction
		 */
		if (!templateTypeQName.equals(inheritedTypeQName)) {
			if (body.length() > 0) {
				body.append(" and ");
			}

			if (cdaProperty.getUpper() == 1) {
				body.append(selfName + ".oclIsTypeOf(" + templateTypeQName + ")");
			} else {
				body.append(selfName + "->forAll(element | element.oclIsTypeOf(" + templateTypeQName + "))");
			}
		}

		/*
		 * Test for enumeration or primitive type with default value.
		 */
		if (((propertyType instanceof Enumeration) || (propertyType instanceof PrimitiveType)) &&
				(property.getDefault() != null)) {
			//
			// AnnotationsUtil annotationsUtil = getEcoreProfile().annotate(property.getClass_());
			// annotationsUtil.setAnnotation(property.getName(), property.getDefault());
			// annotationsUtil.saveAnnotations();

			// read only (fixed) properties also generate an OCL constraint
			if (property.isReadOnly()) {
				if (body.length() > 0) {
					body.append(" and ");
				}
				if (propertyType instanceof Enumeration) {
					body.append(selfName + "=" + templateTypeQName + "::" + property.getDefault());
				} else if (isTypeString(propertyType)) {
					body.append(selfName + "='" + property.getDefault() + "'");
				} else {
					body.append(selfName + "=" + property.getDefault());
				}
			}

		}

		/*
		 * Test for <<nullFlavor>> stereotype
		 */
		// String constraintName = null;
		Stereotype nullFlavor = getEcoreProfile().getAppliedValidationStereotype(
			property, ValidationStereotypeKind.NULL_FLAVOR);
		if (nullFlavor != null) {
			Object value = property.getValue(nullFlavor, ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR);
			String nullFlavorValue = null;
			if (value instanceof EnumerationLiteral) {
				nullFlavorValue = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				nullFlavorValue = ((Enumerator) value).getName();
			}
			if (nullFlavorValue != null) {
				Class class_ = property.getClass_();
				if (class_ != null) {
					if (body.length() > 0) {
						body.append(" and ");
					}
					body.append("self." + property.getName() + ".nullFlavor = vocab::NullFlavor::" + nullFlavorValue);

					// AnnotationsUtil annotationUtil = getEcoreProfile().annotate(class_);
					// annotationUtil.setAnnotation(property.getName() + ".nullFlavor", nullFlavorValue);
					// annotationUtil.saveAnnotations();

					// constraintName = class_.getName() + "_" + property.getName() + "_nullFlavor";
					// constraintName = class_.getName() + property.getName().substring(0, 1).toUpperCase() +
					// property.getName().substring(1) + "NullFlavor";
					// constraintName = createConstraintName(class_, property.getName().substring(0, 1).toUpperCase() +
					// property.getName().substring(1) + "NullFlavor");
				}
			}
		}

		/*
		 * Test for <<textValue>> stereotype
		 */
		Stereotype textValue = getEcoreProfile().getAppliedValidationStereotype(
			property, ValidationStereotypeKind.TEXT_VALUE);
		if (textValue != null && isEDType(property)) {
			String value = (String) property.getValue(textValue, ICDAProfileConstants.TEXT_VALUE_VALUE);
			if (value != null) {
				Class class_ = property.getClass_();
				if (class_ != null) {
					if (body.length() > 0) {
						body.append(" and ");
					}
					body.append("self." + property.getName() + ".getText() = " + "'" + value + "'");
					//
					// AnnotationsUtil annotationUtil = getEcoreProfile().annotate(class_);
					// annotationUtil.setAnnotation(property.getName() + ".mixed", value);
					// annotationUtil.saveAnnotations();
				}
			}
		}

		/*
		 * Only add OCL constraint if severity level is set.
		 */
		ValidationSeverityKind severity = getEcoreProfile().getValidationSeverity(
			property, ValidationStereotypeKind.PROPERTY);
		if (severity != null) {
			if (body.length() == 0) {

			} else {
				// Constraints that have no multiplicity or type restriction
				// TODO is this adequate to catch MAY or SHOULD constraints?
				if (cdaProperty.getUpper() == 1) {
					if (propertyType instanceof Enumeration) {
						body.append("isDefined('" + cdaProperty.getName() + "')");
					} else {
						body.append("not " + selfName + ".oclIsUndefined()");
					}
				} else {
					// body.append(selfName + "->exists(value : datatypes::ANY | not value.oclIsUndefined())");
					body.append("not " + selfName + "->isEmpty()");
				}

			}
		}

		return body;
	}

	TransformSwitch transformSwitch = null;

	private class TransformSwitch extends org.eclipse.mdht.uml.cda.core.profile.util.CDASwitch<String> {

		Constraint constraint;

		/**
		 * @param constraint
		 */
		public TransformSwitch(Constraint constraint) {
			super();
			this.constraint = constraint;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see org.eclipse.mdht.uml.cda.core.profile.util.CDASwitch#caseLogicalConstraint(org.eclipse.mdht.uml.cda.core.profile.
		 * LogicalConstraint)
		 */
		@Override
		public String caseLogicalConstraint(LogicalConstraint logicalConstraint) {
			StringBuilder body = new StringBuilder();
			switch (logicalConstraint.getOperation()) {
				case AND:

					for (Element element : constraint.getConstrainedElements()) {
						if (element instanceof Property) {
							if (body.length() > 0) {
								body.append(" and ");
							}
							Property p = (Property) element;
							if (p.getAssociation() != null) {
								body.append(" (").append(generateAssociationOCL(p.getAssociation())).append(") ");
							} else {
								body.append(" (").append(generateOCL(p)).append(") ");
							}

						}

					}
					break;
				case OR:
					for (Element element : constraint.getConstrainedElements()) {
						if (element instanceof Property) {
							if (body.length() > 0) {
								body.append(" or ");
							}
							body.append(" (").append(generateOCL((Property) element)).append(") ");
						}

					}
					break;
				case XOR:
					if (constraint.getConstrainedElements().size() == 2) {
						for (Element element : constraint.getConstrainedElements()) {
							if (element instanceof Property) {

								if (body.length() > 0) {
									body.append(" xor ");
								}
								body.append(" (").append(generateOCL((Property) element)).append(") ");
							}

						}

					} else {
						body.append("true");
					}
					break;
				case IFTHEN:
					if (constraint.getConstrainedElements().size() == 2) {
						Property property1 = (Property) constraint.getConstrainedElements().get(0);
						Property property2 = (Property) constraint.getConstrainedElements().get(0);

						body.append(generateOCL(property1)).append(") ").append(" implies ").append(
							generateOCL(property2)).append(") ");

					} else {
						body.append("true");
					}
					break;
				case NOTBOTH:
					for (Element element : constraint.getConstrainedElements()) {
						if (element instanceof Property) {
							if (body.length() > 0) {
								body.append(" and ");
							}
							body.append(" (").append(generateOCL((Property) element)).append(") ");
						}

					}
					body.insert(0, "not (").append(")");
					break;
				default:
					break;

			}

			return body.toString();
		}
	}

	/**
	 * @param options
	 * @param baseModelReflection
	 */
	public TransformLogicalConstraint(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.mdht.uml.transform.ecore.TransformConstraint#caseConstraint(org.eclipse.uml2.uml.Constraint)
	 */
	@Override
	public Object caseConstraint(Constraint constraint) {
		TransformSwitch transformSwitch = new TransformSwitch(constraint);
		for (EObject eObject : constraint.getStereotypeApplications()) {
			String ocl = transformSwitch.doSwitch(eObject);
			if (ocl != null) {
				OpaqueExpression opaqueExpression = UMLFactory.eINSTANCE.createOpaqueExpression();
				opaqueExpression.getLanguages().add("OCL");
				opaqueExpression.getBodies().add(ocl);
				constraint.setSpecification(opaqueExpression);
			}
		}
		return super.caseConstraint(constraint);
	}
}
