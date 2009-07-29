/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * Abstract base class for model transformations.
 */
public abstract class TransformAbstract extends UMLSwitch {
	
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
		annotationsUtil.addAnnotation(VALIDATION_ERROR, constraintName);
		annotationsUtil.saveAnnotations();
		
		addValidationMessage(constrainedClass, constraintName, message);
	}

	public void addValidationInfo(Class constrainedClass, String constraintName, String message) {
		AnnotationsUtil annotationsUtil = new AnnotationsUtil(constrainedClass);
		annotationsUtil.addAnnotation(VALIDATION_ERROR, constraintName);
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
	
}
