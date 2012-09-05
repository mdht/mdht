/*******************************************************************************
 * Copyright (c) 2012 ramakrishnanr.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Rama Ramakrishnan - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.PluginPropertiesUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.AnnotationsUtil;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.openhealthtools.mdht.uml.transform.ecore.TransformInlinedProperties;

/**
 * @author ramakrishnanr
 * 
 */
public class TransformCDAInlineProperties extends TransformInlinedProperties {

	PluginPropertiesUtil properties = null;

	/**
	 * @param options
	 * @param baseModelReflection
	 */
	public TransformCDAInlineProperties(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
		properties = transformerOptions.getPluginPropertiesUtil();
	}

	@Override
	public Object caseProperty(Property property) {
		HashMap<String, ArrayList<String>> constraints = new HashMap<String, ArrayList<String>>();

		final Class owner = property.getClass_();

		Association association = null;
		Class baseDatatype = null;

		// supported types are only classes, and not the class that defines the property (reflexive association). Only transform
		// properties owned by classes (not by associations; note that we do not use association classes)
		if ((owner != null) && !(owner instanceof Association) && (property.getType() instanceof Class) &&
				(property.getOwner() != property.getType())) {

			Class propertyType = (Class) property.getType();
			association = property.getAssociation();
			baseDatatype = getBaseDatatype(propertyType, property);

			// is it either an in-line associated type or a local datatype subclass?
			if (((association != null) && isInlineClass(propertyType)) || (baseDatatype != null)) {
				Class baseOwner = null;
				if (owner != null) {
					baseOwner = getBaseClass(owner);
					if (baseOwner == null) {
						// maybe it's a local datatype subclass
						baseOwner = getBaseDatatype(owner, property);
					}
				}

				if (baseOwner != null) {
					AnnotationsUtil bucketAnnotations = getEcoreProfile().annotate(owner);
					Element validationElement = (association != null)
							? association
							: property;
					collectConstraints(
						property.getClass_(), bucketAnnotations, (Class) property.getType(),
						getEcoreProfile().getValidationMessage(validationElement, ValidationStereotypeKind.ANY),
						"self." + getNullSafePath(baseOwner, propertyType, property) + getInlineFilter(propertyType),
						owner.getName(), constraints, property.getName(), property);

					bucketAnnotations.saveAnnotations();
				} else {
					Logger.log(Logger.ERROR, String.format(
						"Unsupported inlined association or datatype property %s from %s; %s has no base element",
						property.getName(), property.getNamespace().getQualifiedName(),
						property.getNamespace().getQualifiedName()));
				}
			}

		}

		return property;
	}

	/**
	 * 
	 * collectConstraints walks the untemplated associations recursively to create a for->all() ocl
	 * 
	 * TODO Message munging to get a readable validation message is bound to the current validation generation which needs to change, after dynamic
	 * validation message generation should be able to create better message
	 */
	private void collectConstraints(final Class bucketClass, final AnnotationsUtil bucketAnnotations,
			Class inlineClass, String message, String path, String stack,
			HashMap<String, ArrayList<String>> constraints, String associationName, Property transformationProperty) {

		AnnotationsUtil inlineClassAnnotations = getEcoreProfile().annotate(inlineClass);

		String warningsAnnotation = inlineClassAnnotations.getAnnotation(VALIDATION_WARNING);
		String infosAnnotation = inlineClassAnnotations.getAnnotation(VALIDATION_INFO);
		final Set<String> warnings = (warningsAnnotation == null)
				? Collections.<String> emptySet()
				: new java.util.HashSet<String>(Arrays.asList(warningsAnnotation.split(" ")));
		final Set<String> infos = (infosAnnotation == null)
				? Collections.<String> emptySet()
				: new java.util.HashSet<String>(Arrays.asList(infosAnnotation.split(" ")));

		String splitName = getEcoreProfile().getPrefixedSplitName(inlineClass);

		for (Property property : inlineClass.getOwnedAttributes()) {
			final Class propertyType = (property.getType() instanceof Class)
					? (Class) property.getType()
					: null;

			if ((propertyType != null) && (inlineClass != propertyType) && !isBaseModel(bucketClass, propertyType) &&
					!isDatatypesModel(bucketClass, propertyType) && !getEcoreProfile().isPrimaryEClass(propertyType) &&
					(property.getOwner() != propertyType) &&
					((getBaseClass(inlineClass) != null) || getBaseDatatype(inlineClass, bucketClass) != null)) {

				Element validationElement = (property.getAssociation() != null)
						? property.getAssociation()
						: property;
				String associationMessage = getEcoreProfile().getValidationMessage(
					validationElement, ValidationStereotypeKind.ANY);

				associationMessage = associationMessage.replaceAll(
					"its type is " + UMLUtil.splitName(property.getType()), "");

				Class propertyBaseType = getBaseClass(propertyType);
				if (propertyBaseType == null) {
					// OK, it's a datatype
					propertyBaseType = getBaseDatatype(propertyType, inlineClass);
				}

				if ((associationMessage != null) && (propertyBaseType != null)) {
					associationMessage = associationMessage.replaceAll(
						getEcoreProfile().getPrefixedSplitName(property.getType()),
						propertyBaseType.getName().toLowerCase());

					associationMessage = associationMessage.replaceAll(
						UMLUtil.splitName(property.getType()), propertyBaseType.getName().toLowerCase());

					associationMessage = associationMessage.replaceAll(
						getEcoreProfile().getPrefixedSplitName(property.getClass_()), "each");
				}

				// get the owner base type
				Class ownerBaseType = getBaseClass(inlineClass);
				if (ownerBaseType == null) {
					// OK, it's a datatype
					ownerBaseType = getBaseDatatype(inlineClass, bucketClass);
				}

				collectConstraints(
					bucketClass, bucketAnnotations, propertyType, message + " " + associationMessage, path + "." +
							getNullSafePath(ownerBaseType, propertyType, property), stack + inlineClass.getName(),
					constraints, property.getName(), transformationProperty);
			}
		}

		for (Constraint constraint : inlineClass.getOwnedRules()) {

			ValidationSeverityKind constraintSeverity = ValidationSeverityKind.ERROR;

			if (infos.contains(constraint.getName())) {
				constraintSeverity = ValidationSeverityKind.INFO;
			} else if (warnings.contains(constraint.getName())) {
				constraintSeverity = ValidationSeverityKind.WARNING;
			}

			String propertyOperationName = getOperationName(transformationProperty) + "()";
			String relativeOCL = "";
			if (path.contains(propertyOperationName)) {
				relativeOCL = getRelativeOCL(constraint, propertyOperationName);
			} else {
				relativeOCL = getRelativeOCL(constraint, null);
			}

			if (relativeOCL != null) {
				String constraintMessage = properties.getProperty(constraint.getName());

				if (constraintMessage != null) {
					constraintMessage = constraintMessage.replaceAll(splitName, associationName);
				}

				/*
				 * TODO Fix constraint messages implementation - currently only setting the specific rule with out the path to the rule
				 */
				Constraint inlinedConstraint = appendInlinedOCLConstraint(
					bucketClass, stack + constraint.getName(), constraintSeverity, message + " " + constraintMessage,
					path + getScopeFilter(inlineClass) + "->reject(" + relativeOCL + ")");

				// handle constraint dependencies
				String dependency = getConstraintDependency(inlineClassAnnotations, constraint.getName());
				if (dependency != null) {
					setConstraintDependency(bucketAnnotations, inlinedConstraint.getName(), stack + dependency);
				}
			}

		}

	}

	private String getPath(Class baseSourceClass, Class targetClass, Property sourceProperty) {
		Property property = null;
		for (Property rededfinedProperty : sourceProperty.getRedefinedProperties()) {
			property = baseSourceClass.getOwnedAttribute(
				rededfinedProperty.getName(), rededfinedProperty.getType(), true, null, false);
		}

		if (property == null) {
			property = baseSourceClass.getOwnedAttribute(null, targetClass, true, null, false);
		}
		//
		// If not - walk the hierarchy and check for properties
		if (property == null) {
			for (Classifier c : targetClass.allParents()) {
				property = baseSourceClass.getOwnedAttribute(null, c, true, null, false);

				if ((property != null) || isBaseModel(targetClass, c)) {
					break;
				}
			}
		}

		// If we still can not find - use the name - this is not optimal but CDA has some hop scotch hierarchies such as consumable and
		// manufactured product
		if (property == null) {
			property = baseSourceClass.getOwnedAttribute(sourceProperty.getName(), null, true, null, false);
		}

		if (property != null) {
			return property.getName();
		}

		// Handle special CDA processings.

		return handleSpecialAssociation(baseSourceClass, targetClass, sourceProperty);

	}

	protected String handleSpecialAssociation(Class sourceClass, Class targetClass, Property sourceProperty) {
		StringBuilder retVal = new StringBuilder().append("");

		// ClinicalDocument -> Section || Section -> Section
		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
				CDAModelUtil.isSection(targetClass)) {

			retVal.append(getOperationName(sourceProperty) + "()");
		}

		return retVal.toString();
	}

	private String getOperationName(Property sProperty) {
		String retVal = "";
		retVal = "get" + ((sProperty.getUpper() == 1)
				? capitalize(sProperty.getName())
				: capitalize(pluralize(sProperty.getName())));
		return retVal;
	}

	private String getNullSafePath(Class baseSourceClass, Class targetClass, Property sourceProperty) {
		String result = getPath(baseSourceClass, targetClass, sourceProperty);

		if (result.length() > 0) {
			result = result + "->excluding(null)";
		}

		return result;
	}

	/**
	 * The relative OCL is modified to prepend the path, in lieu of the 'self.'
	 * 
	 * @param constraint
	 * @param replaceSelfString
	 * @return
	 */
	private String getRelativeOCL(Constraint constraint, String replaceSelfString) {

		String retVal = null;
		if (constraint.getSpecification() instanceof OpaqueExpression) {
			OpaqueExpression oe = (OpaqueExpression) constraint.getSpecification();
			int index = 0;
			for (String language : oe.getLanguages()) {
				if ("OCL".equals(language)) {
					if (null == replaceSelfString) {
						retVal = oe.getBodies().get(index).replaceAll("self.", "");
						break;
					} else {
						retVal = oe.getBodies().get(index).replaceAll("self.", replaceSelfString + ".");
						break;
					}

				}
				index++;
			}
		}

		// Check and strip nested level inline paths
		retVal = updateMultipleLevelInlinePath(retVal);
		return retVal;
	}

	/**
	 * Returns the relative paths in the OCL String
	 * Most of the nested paths occur in the oclKindOf function call
	 * 
	 * @param relativeOcl
	 * @return
	 */
	private List<String> getRelativePaths(String relativeOcl) {
		List<String> retVal = new ArrayList<String>();

		if (null != relativeOcl && (relativeOcl.length() > 0)) {
			int strLength = relativeOcl.length();
			int i = 0;

			while (i < strLength) {
				if (relativeOcl.indexOf("oclIsKindOf(", i) != -1) {
					int intStart = relativeOcl.indexOf("oclIsKindOf(", i);
					int intEnd = relativeOcl.indexOf(")", intStart);
					String str = relativeOcl.substring(intStart + 12, intEnd);
					retVal.add(str);
					i = intEnd;

				} else {
					i = strLength;
				}
			}
		}

		return retVal;
	}

	/**
	 * Updates the relative OCL by modifying the multiple level of nesting
	 * with the appropriate base type
	 * 
	 * e.g. consol::GeneralHeaderConstraints::RecordTarget::PatientRole needs to be
	 * modified to cda::PatientRole
	 * 
	 * This method needs to be refactored to insert this logic in the CDA Association
	 * transformation, so that the OCL generated in the inline class removes the nested
	 * dependency
	 * 
	 * @param relativeOcl
	 * @return
	 */
	private String updateMultipleLevelInlinePath(String relativeOcl) {
		String retVal = null;
		if (null != relativeOcl) {
			retVal = relativeOcl;
			List<String> arrList = getRelativePaths(relativeOcl);
			for (String itemStr : arrList) {
				String[] arrStr = itemStr.split("::");
				if (arrStr.length > 2) {
					String updateStr = "cda::" + arrStr[arrStr.length - 1];

					// Update the relativeOCL
					retVal = retVal.replaceFirst(itemStr, updateStr);
				}
			}
		}
		return retVal;
	}
}
