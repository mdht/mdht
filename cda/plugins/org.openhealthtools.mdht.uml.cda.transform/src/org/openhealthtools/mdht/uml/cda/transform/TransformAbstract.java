/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added template parameter
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * Abstract base class for model transformations.
 */
public abstract class TransformAbstract extends UMLSwitch<Object> {
	
	public static final String LF = System.getProperty("line.separator");
	
	public static final String VALIDATION_ERROR = "constraints.validation.error";
	public static final String VALIDATION_WARNING = "constraints.validation.warning";
	public static final String VALIDATION_INFO = "constraints.validation.info";

	protected EcoreTransformerOptions transformerOptions;

	public TransformAbstract(EcoreTransformerOptions options) {
		transformerOptions = options;
	}
	
	public void removeModelElement(Element element) {
		if (!isRemoved(element)) {
			transformerOptions.getDeletedElementList().add(element);
		}
	}
	
	public boolean isRemoved(Element element) {
		return transformerOptions.getDeletedElementList().contains(element);
	}
	
	public void addValidationError(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_ERROR, constraintName);
		annotationsUtil.saveAnnotations();
		
		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationWarning(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_WARNING, constraintName);
		annotationsUtil.saveAnnotations();
		
		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationInfo(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_INFO, constraintName);
		annotationsUtil.saveAnnotations();
		
		addValidationMessage(constrainedClass, constraintName, message);
	}
	
	public void addValidationMessage(Class constrainedClass, String constraintName, String message) {
		if (message == null) {
			message = constraintName + " error message";
		}
		
		PluginPropertiesUtil properties = transformerOptions.getPluginPropertiesUtil();
		if (properties != null) {
			properties.addProperty(constraintName, message);
		}
	}

	protected Property getCDAProperty(Property templateProperty) {
		if (templateProperty.getClass_() == null) {
			return null;
		}
		
		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(templateProperty.getName())
						&& "cda".equals(inherited.getNearestPackage().getName())) {
					return inherited;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Returns the nearest inherited property with the same name, or null if not found.
	 */
	protected Property getInheritedProperty(Property templateProperty) {
		if (templateProperty.getClass_() == null) {
			return null;
		}
		
		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(templateProperty.getName())) {
					return inherited;
				}
			}
		}
		
		return null;
	}
	
	protected void addOCLConstraint(Property property, StringBuffer body) {
		String constraintName = property.getClass_().getName() + "_" + property.getName();
		Constraint constraint = property.getClass_().createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(property.getClass_());

		OpaqueExpression expression = (OpaqueExpression)constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(body.toString());

		//TODO get severity level and message from stereotype
		addValidationError(property.getClass_(), constraintName, null);
	}
	
	protected org.eclipse.uml2.uml.Class getCDAClass(org.eclipse.uml2.uml.Class templateClass) {
		for (Classifier parent : templateClass.allParents()) {
			if ("cda".equals(parent.getNearestPackage().getName()) 
					&& parent instanceof org.eclipse.uml2.uml.Class) {
				return (org.eclipse.uml2.uml.Class) parent;
			}
		}
		
		return null;
	}
}
