/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

public class TransformAssociation extends TransformAbstract {

	public TransformAssociation(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseAssociation(Association association) {
		if (isRemoved(association)) {
			return null;
		}
		
		org.eclipse.uml2.uml.Class sourceClass = null;
		org.eclipse.uml2.uml.Class targetClass = null;
		
		Property targetProperty = null;
		
		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {
				sourceClass = property.getClass_();
				targetClass = (org.eclipse.uml2.uml.Class) property.getType();
				targetProperty = property;
				break;
			}
		}
		
		if (sourceClass == null || targetClass == null || targetProperty == null) {
			return null;
		}

		org.eclipse.uml2.uml.Class cdaTargetClass = getCDAClass(targetClass);
		
		if (cdaTargetClass == null) {
			return null;
		}
		
		// TODO: Add support to validate target and source classes to allow only valid relationships:
		//       Document -> Section, Section -> Section, Section -> { Act, Entry, ... }, { Act, Entry, ... } -> { Act, Entry, ... }
		
		String name = cdaTargetClass.getName();
		String lowerName = name.substring(0, 1).toLowerCase() + name.substring(1);
		String qualifiedName = cdaTargetClass.getQualifiedName();
		String targetQName = targetClass.getQualifiedName();
		
		StringBuffer body = new StringBuffer();
		body.append("self.get" + name + "()->");
		body.append((targetProperty.getUpper() == 1) ? "one(" : "exists(");
		body.append(lowerName);
		body.append(" : " + qualifiedName + " | ");
		body.append(lowerName);
		body.append(".oclIsTypeOf(" + targetQName + "))");
		
		String constraintName = sourceClass.getName() + "_" + targetClass.getName().substring(0, 1).toLowerCase() + targetClass.getName().substring(1);
		Constraint constraint = sourceClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(sourceClass);
		
		OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(body.toString());
		
		Stereotype validationSupport = EcoreTransformUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.VALIDATION_SUPPORT);
		if (validationSupport != null) {
			String message = (String) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SUPPORT_MESSAGE);
			EnumerationLiteral literal = (EnumerationLiteral) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SUPPORT_SEVERITY);
			String severity = (literal != null) ? literal.getName() : "ERROR";
			
			if ("INFO".equals(severity)) {
				addValidationInfo(sourceClass, constraintName, message);
			} else if ("WARNING".equals(severity)) {
				addValidationWarning(sourceClass, constraintName, message);
			} else {
				addValidationError(sourceClass, constraintName, message);
			}
		}
		
		removeModelElement(targetProperty);
		removeModelElement(association);
		
		return association;
	}

}
