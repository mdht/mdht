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
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

public class TransformAssociation extends TransformAbstract {
	public TransformAssociation(EcoreTransformerOptions options) {
		super(options);
	}
	
	@Override
	public Object caseAssociation(Association association) {
		if (isRemoved(association)) {
			return null;
		}
		
		Class sourceClass = null;
		Class targetClass = null;
		
		Property sourceProperty = null;
		
		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {
				sourceClass = property.getClass_();
				targetClass = (Class) property.getType();
				sourceProperty = property;
				break;
			}
		}
		
		if (sourceClass == null || targetClass == null || sourceProperty == null) {
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
		
		String targetName = targetClass.getName();
//		String targetLowerName = targetName.substring(0, 1).toLowerCase() + targetName.substring(1);
		String targetQName = targetClass.getQualifiedName();
		
		StringBuffer body = new StringBuffer();
		Stereotype stereotype = null;
		
		if (("ClinicalDocument".equals(cdaSourceName) || "Section".equals(cdaSourceName)) && "Section".equals(cdaTargetName)) {
			// Document -> Section || Section -> Section
			body.append("self.getSections()->");
			body.append((sourceProperty.getUpper() == 1) ? "one(" : "exists(");
			body.append("section : cda::Section | section.oclIsKindOf(" + targetQName + "))");
		} else {
			// Section || Entry || { Act, Encounter, ... }
//			String associationEnd = "Section".equals(cdaSourceName) ? "entry" : "entryRelationship";
//			String variableDeclaration = "Section".equals(cdaSourceName) ? "entry : cda::Entry" : "entryRelationship : cda::EntryRelationship";
			String associationEnd = null;
			String variableDeclaration = null;
			if ("Section".equals(cdaSourceName)) {
				associationEnd = "entry";
				variableDeclaration = "entry : cda::Entry";
			} else if ("Organizer".equals(cdaSourceName)) {
				associationEnd = "component";
				variableDeclaration = "component : cda::Component4";
			} else {
				associationEnd = "entryRelationship";
				variableDeclaration = "entryRelationship : cda::EntryRelationship";
			}

			body.append("self." + associationEnd + "->");
			body.append((sourceProperty.getUpper() == 1) ? "one(" : "exists(");
			body.append(variableDeclaration);
			body.append(" | " + associationEnd);
			if (!"Entry".equals(cdaTargetName)) {
				body.append("." + cdaTargetLowerName);
			}
			body.append(".oclIsKindOf(" + targetQName + ")");
			
			String stereotypeName = "Section".equals(cdaSourceName) ? ICDAProfileConstants.ENTRY : ICDAProfileConstants.ENTRY_RELATIONSHIP;
//			Stereotype stereotype = EcoreTransformUtil.getAppliedCDAStereotype(association, stereotypeName);
			stereotype = CDAProfileUtil.getAppliedCDAStereotype(association, stereotypeName);
			if (stereotype != null) {
				EnumerationLiteral literal = (EnumerationLiteral) association.getValue(stereotype, "typeCode");
				if (literal != null) {
					String enumerationQName = "Section".equals(cdaSourceName) ? "vocab::x_ActRelationshipEntry" : "vocab::x_ActRelationshipEntryRelationship";
					body.append(" and " + associationEnd + ".typeCode = " + enumerationQName + "::" + literal.getName());
				}
			}

			body.append(")");
		}
		
//		String constraintName = sourceClass.getName() + "_" + targetLowerName;
//		String constraintName = sourceClass.getName() + targetName;
		String constraintName = createConstraintName(sourceClass, targetName);
		Constraint constraint = sourceClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(sourceClass);
		
		OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(body.toString());

//		Stereotype validationSupport = EcoreTransformUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.VALIDATION_SUPPORT);
		Stereotype validationSupport = stereotype != null ? stereotype : CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ASSOCIATION_VALIDATION);
		if (validationSupport != null) {
//			String message = (String) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SUPPORT_MESSAGE);
			String message = (String) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE);
//			EnumerationLiteral literal = (EnumerationLiteral) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SUPPORT_SEVERITY);
			EnumerationLiteral literal = (EnumerationLiteral) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SEVERITY);
			String severity = (literal != null) ? literal.getName() : "ERROR";
			
			if ("INFO".equals(severity)) {
				addValidationInfo(sourceClass, constraintName, message);
			} else if ("WARNING".equals(severity)) {
				addValidationWarning(sourceClass, constraintName, message);
			} else {
				addValidationError(sourceClass, constraintName, message);
			}
		}
		
		removeModelElement(sourceProperty);
		removeModelElement(association);
		
		return association;
	}
}
