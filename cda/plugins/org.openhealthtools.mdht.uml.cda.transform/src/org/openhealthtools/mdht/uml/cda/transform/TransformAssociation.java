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
import org.eclipse.uml2.uml.Class;
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
		
		Class sourceClass = null;
		Class targetClass = null;
		
		Property targetProperty = null;
		
		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {
				sourceClass = property.getClass_();
				targetClass = (Class) property.getType();
				targetProperty = property;
				break;
			}
		}
		
		if (sourceClass == null || targetClass == null || targetProperty == null) {
			return null;
		}

		Class cdaSourceClass = getCDAClass(sourceClass);
		Class cdaTargetClass = getCDAClass(targetClass);
		
		if (cdaSourceClass == null || cdaTargetClass == null) {
			return null;
		}
		
		// TODO: Add support to validate target and source classes to allow only valid relationships:
		//       Document -> Section, Section -> Section, Section -> { Act, Encounter, ... }, { Act, Encounter, ... } -> { Act, Encounter, ... }

		String cdaSourceName = cdaSourceClass.getName();
		
		String cdaTargetName = cdaTargetClass.getName();
		String cdaTargetLowerName = cdaTargetName.substring(0, 1).toLowerCase() + cdaTargetName.substring(1);
//		String cdaTargetQName = cdaTargetClass.getQualifiedName();
		
		String associationEnd = "Section".equals(cdaSourceName) ? "entry" : "entryRelationship";
		String variableDeclaration = "Section".equals(cdaSourceName) ? "entry : cda::Entry" : "entryRelationship : cda::EntryRelationship";
		
		String targetName = targetClass.getName();
		String targetLowerName = targetName.substring(0, 1).toLowerCase() + targetName.substring(1);
		String targetQName = targetClass.getQualifiedName();
		
		StringBuffer body = new StringBuffer();
//		body.append("self.get" + cdaTargetName + "()->");
		body.append("self." + associationEnd + "->");
		body.append((targetProperty.getUpper() == 1) ? "one(" : "exists(");
//		body.append(cdaTargetLowerName);
		body.append(variableDeclaration);
//		body.append(" : " + cdaTargetQName + " | ");
		body.append(" | " + associationEnd + "." + cdaTargetLowerName);
//		body.append(cdaTargetLowerName);
//		body.append(".oclIsTypeOf(" + targetQName + "))");
		body.append(".oclIsTypeOf(" + targetQName + ")");
		
		Stereotype entry = EcoreTransformUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY);
		if (entry != null) {
			EnumerationLiteral literal = (EnumerationLiteral) association.getValue(entry, ICDAProfileConstants.ENTRY_TYPE_CODE);
			if (literal != null) {
				body.append(" and " + associationEnd + ".typeCode = vocab::x_ActRelationshipEntry::" + literal.getName());
			}
		}
		
		Stereotype entryRelationship = EcoreTransformUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY_RELATIONSHIP);
		if (entryRelationship != null) {
			EnumerationLiteral literal = (EnumerationLiteral) association.getValue(entryRelationship, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
			if (literal != null) {
				body.append(" and " + associationEnd + ".typeCode = vocab::x_ActRelationshipEntryRelationship::" + literal.getName());
			}
		}
		
		body.append(")");
		
		String constraintName = sourceClass.getName() + "_" + targetLowerName;
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
