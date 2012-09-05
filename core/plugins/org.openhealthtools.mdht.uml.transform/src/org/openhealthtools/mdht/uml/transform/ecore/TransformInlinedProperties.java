/**
 * Copyright (c) 2011, 2012 JKM Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Sean Muir (JKM Software) - initial API and implementation
 *    Christian W. Damus - generate query invariants for in-line associations (artf3100)
 *                       - spurious constraint-name substring matches for severity (artf3185)
 *                       - implement terminology constraint dependencies (artf3030)
 *                       - support nested datatype subclasses (artf3350)
 *    Rama Ramakrishnan  - Made some operations public for access by sub classes
 *    					 - Also updated appendInlinedOCLConstraint to not create multiple constraints, when a constraint
 *    					   already exists for a  Property                   
 * $Id$
 */
package org.openhealthtools.mdht.uml.transform.ecore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.PluginPropertiesUtil;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationSeverityKind;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;
import org.openhealthtools.mdht.uml.transform.internal.Logger;

public class TransformInlinedProperties extends TransformAbstract {

	PluginPropertiesUtil properties = null;

	public TransformInlinedProperties(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
		properties = transformerOptions.getPluginPropertiesUtil();
	}

	public Constraint appendInlinedOCLConstraint(Class classToBeConstrained, String constraintName,
			ValidationSeverityKind severity, String validationMessage, String oclConstraint) {

		// Avoiding to duplicate the owned rule and returning the constraint.
		// Causes some situations to create multiple constraints..
		// If a case of inline Section -> Encounter -> AssignedEntity association,
		// duplicate constraints get generated for the Document having associations to Section.
		// e.g TestDocumentTestAllergySectionTestEncounterAssignedEntity &
		// TestDocumentTestAllergySectionTestEncounterAssignedEntityTestDocumentTestAllergySectionTestEncounterAssignedEntity1

		// int ctr = 1;
		// while (classToBeConstrained.getOwnedRule(constraintName) != null) {
		// constraintName += constraintName + ctr++;
		// }
		if (classToBeConstrained.getOwnedRule(constraintName) != null) {
			return classToBeConstrained.getOwnedRule(constraintName);
		}

		Constraint inlinedConstraint = classToBeConstrained.createOwnedRule(
			constraintName, UMLPackage.eINSTANCE.getConstraint());

		inlinedConstraint.getConstrainedElements().add(classToBeConstrained);

		OpaqueExpression expression = (OpaqueExpression) inlinedConstraint.createSpecification(
			null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");

		expression.getBodies().add(oclConstraint);

		switch (severity) {
			case INFO:
				addValidationInfo(classToBeConstrained, constraintName, validationMessage);
				break;
			case WARNING:
				addValidationWarning(classToBeConstrained, constraintName, validationMessage);
				break;
			default:
				addValidationError(classToBeConstrained, constraintName, validationMessage);
				break;

		}

		// designate the constraint as a query-style invariant
		annotateQueryConstraint(inlinedConstraint, classToBeConstrained);

		return inlinedConstraint;
	}

	public static boolean isInlineClass(Class _class) {

		boolean inline = false;
		for (Comment comment : _class.getOwnedComments()) {
			if (comment.getBody().startsWith("INLINE")) {
				inline = true;
				break;
			}
		}

		return inline;

	}

	public static String getInlineFilter(Class inlineClass) {
		String filter = "";
		for (Comment comment : inlineClass.getOwnedComments()) {
			if (comment.getBody().startsWith("INLINE&")) {
				String[] temp = comment.getBody().split("&");
				if (temp.length == 2) {
					filter = String.format("->select(%s)", temp[1]);
				}
				break;
			}
		}

		if ("".equals(filter)) {
			// search hierarchy
			for (Classifier next : inlineClass.getGenerals()) {
				if (next instanceof Class) {
					filter = getInlineFilter((Class) next);
					if (!"".equals(filter)) {
						break;
					}
				}
			}
		}

		return filter;

	}

	public static String getScopeFilter(Class inlineClass) {
		String filter = "";
		for (Comment comment : inlineClass.getOwnedComments()) {
			if (comment.getBody().startsWith("SCOPE&")) {
				String[] temp = comment.getBody().split("&");
				if (temp.length == 2) {
					filter = String.format("->select(%s)", temp[1]);
				}
				break;
			}
		}

		return filter;

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
						owner.getName(), constraints, property.getName());

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

	private String getNullSafePath(Class baseSourceClass, Class targetClass, Property sourceProperty) {
		String result = getPath(baseSourceClass, targetClass, sourceProperty);

		if (result.length() > 0) {
			result = result + "->excluding(null)";
		}

		return result;
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
		} else {
			return "";
		}
	}

	private String getRelativeOCL(Constraint constraint) {

		if (constraint.getSpecification() instanceof OpaqueExpression) {
			OpaqueExpression oe = (OpaqueExpression) constraint.getSpecification();
			int index = 0;
			for (String language : oe.getLanguages()) {
				if ("OCL".equals(language)) {
					return oe.getBodies().get(index).replaceAll("self.", "");
				}
				index++;
			}
		}
		return null;
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
			HashMap<String, ArrayList<String>> constraints, String associationName) {

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
					constraints, property.getName());
			}
		}

		for (Constraint constraint : inlineClass.getOwnedRules()) {

			ValidationSeverityKind constraintSeverity = ValidationSeverityKind.ERROR;

			if (infos.contains(constraint.getName())) {
				constraintSeverity = ValidationSeverityKind.INFO;
			} else if (warnings.contains(constraint.getName())) {
				constraintSeverity = ValidationSeverityKind.WARNING;
			}

			String relativeOCL = getRelativeOCL(constraint);

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

}
