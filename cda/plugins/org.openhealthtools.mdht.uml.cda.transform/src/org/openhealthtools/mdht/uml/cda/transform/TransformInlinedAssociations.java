/**
 * Copyright (c) 2011 JKM Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.transform;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class TransformInlinedAssociations extends TransformAbstract {

	private void appendInlinedOCLConstraint(Class classToBeConstrained, String constraintName, String severity,
			String validationMessage, String oclConstraint) {

		int ctr = 1;
		while (classToBeConstrained.getOwnedRule(constraintName) != null) {
			constraintName += constraintName + ctr++;
		}
		Constraint inlinedConstraint = classToBeConstrained.createOwnedRule(
			constraintName, UMLPackage.eINSTANCE.getConstraint());

		inlinedConstraint.getConstrainedElements().add(classToBeConstrained);

		OpaqueExpression expression = (OpaqueExpression) inlinedConstraint.createSpecification(
			null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");

		expression.getBodies().add(oclConstraint);
		if (severity != null) {
			if ("INFO".equals(severity)) {
				addValidationInfo(classToBeConstrained, constraintName, validationMessage);
			} else if ("WARNING".equals(severity)) {
				addValidationWarning(classToBeConstrained, constraintName, validationMessage);
			} else {
				addValidationError(classToBeConstrained, constraintName, validationMessage);
			}
		} else {
			addValidationError(classToBeConstrained, constraintName, validationMessage);
		}

	}

	public TransformInlinedAssociations(TransformerOptions options) {
		super(options);
		properties = transformerOptions.getPluginPropertiesUtil();
	}

	PluginPropertiesUtil properties = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.uml2.uml.util.UMLSwitch#casePackage(org.eclipse.uml2.uml.Package)
	 */

	private static boolean isInlineClass(Class _class) {

		boolean inline = false;
		for (Comment comment : _class.getOwnedComments()) {
			if (comment.getBody().startsWith("INLINE")) {
				inline = true;
				break;
			}
		}

		return inline;

	}

	private static String getInlineFilter(Class inlineClass) {
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

		return filter;

	}

	private static String getScopeFilter(Class inlineClass) {
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
	public Object caseAssociation(Association association) {

		HashMap<String, ArrayList<String>> constraints = new HashMap<String, ArrayList<String>>();

		for (Property property : association.getMemberEnds()) {

			if (property.isNavigable()) {

				if (property.getType() != null && property.getType() instanceof Class &&
						isInlineClass((Class) property.getType())) {

					collectConstraints(
						property.getClass_(), (Class) property.getType(),
						CDAModelUtil.getValidationSeverity(association),
						CDAModelUtil.getValidationMessage(association),
						"self." + getPath(getCDAClass(property.getClass_()), (Class) property.getType(), property) +
								getInlineFilter((Class) property.getType()), property.getClass_().getName(),
						constraints, property.getName());
				}

			}

		}

		return association;

	}

	private String getPath(Class cdaSourceClass, Class targetClass, Property sourceProperty) {
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
	 * TODO After supporting OCL query replace for all with reject to get better location of issue
	 * TODO Message munging to get a readable validation message is bound to the current validation generation which needs to change, after dynamic
	 * validation message generation should be able to create better message
	 * 
	 * @param bucketClass
	 * @param inlineClass
	 * @param severity
	 * @param message
	 * @param path
	 * @param stack
	 * @param constraints
	 * @param associationName
	 */
	private void collectConstraints(Class bucketClass, Class inlineClass, String severity, String message, String path,
			String stack, HashMap<String, ArrayList<String>> constraints, String associationName) {

		String splitName = CDAModelUtil.getPrefixedSplitName(inlineClass);

		for (Association association : inlineClass.getAssociations()) {
			for (Property property : association.getMemberEnds()) {
				if (property.isNavigable() && property.getType() instanceof Class &&
						!inlineClass.equals(property.getType()) && !CDAModelUtil.isCDAModel(property.getType()) &&
						!CDAModelUtil.isDatatypeModel(property.getType()) &&
						CDAModelUtil.getTemplateId((Class) property.getType()) == null) {

					String associationMessage = CDAModelUtil.getValidationMessage(association);

					associationMessage = associationMessage.replaceAll(
						"its type is " + UMLUtil.splitName(property.getType()), "");

					Class propertyCDAClass = CDAModelUtil.getCDAClass((Class) property.getType());
					if (associationMessage != null && propertyCDAClass != null) {
						associationMessage = associationMessage.replaceAll(
							CDAModelUtil.getPrefixedSplitName(property.getType()),
							propertyCDAClass.getName().toLowerCase());

						associationMessage = associationMessage.replaceAll(
							UMLUtil.splitName(property.getType()), propertyCDAClass.getName().toLowerCase());

						associationMessage = associationMessage.replaceAll(
							CDAModelUtil.getPrefixedSplitName(property.getClass_()), "each");

					}
					collectConstraints(
						bucketClass, (Class) property.getType(), severity, message + " " + associationMessage, path +
								"." + getPath(getCDAClass(property.getClass_()), (Class) property.getType(), property),
						stack + property.getClass_().getName(), constraints, property.getName());
				}
			}
		}

		for (Constraint constraint : inlineClass.getOwnedRules()) {

			String relativeOCL = getRelativeOCL(constraint);

			if (relativeOCL != null) {
				String constraintMessage = properties.getProperty(constraint.getName());

				if (constraintMessage != null) {
					constraintMessage = constraintMessage.replaceAll(splitName, associationName);
				}
				appendInlinedOCLConstraint(bucketClass, stack + constraint.getName(), severity, message +
						constraintMessage, path + getScopeFilter(inlineClass) +
						"->select(not oclIsUndefined())->forAll(" + relativeOCL + ")");
			}

		}

	}
}
