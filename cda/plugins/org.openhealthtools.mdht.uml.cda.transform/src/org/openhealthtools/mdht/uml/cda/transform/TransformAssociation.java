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

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;

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
			removeModelElement(sourceProperty);
			removeModelElement(association);
			return null;
		}

		Class cdaSourceClass = getCDAClass(sourceClass);
		Class cdaTargetClass = getCDAClass(targetClass);
		
		if (cdaSourceClass == null || cdaTargetClass == null) {
			removeModelElement(sourceProperty);
			removeModelElement(association);
			return null;
		}
		
		// Validate target and source classes to include only supported relationships:
		//		ClinicalDocument -> Section, Section -> Section
		//		Section -> { Act, Encounter, ... }
		//		Organizer -> { Act, Encounter, ... }
		//		{ Act, Encounter, ... } -> { Act, Encounter, ... }

		String cdaTargetName = cdaTargetClass.getName();
		String cdaTargetLowerName = cdaTargetName.substring(0, 1).toLowerCase() + cdaTargetName.substring(1);
		
		String targetName = targetClass.getName();
//		String targetLowerName = targetName.substring(0, 1).toLowerCase() + targetName.substring(1);
		String targetQName = targetClass.getQualifiedName();
		
		StringBuffer body = new StringBuffer();
		Stereotype stereotype = null;

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass))
				&& CDAModelUtil.isSection(targetClass)) {
			// ClinicalDocument -> Section || Section -> Section
			body.append("self.getSections()->");
			body.append((sourceProperty.getUpper() == 1) ? "one(" : "exists(");
			body.append("section : cda::Section | section.oclIsKindOf(" + targetQName + "))");
		} else {
			String associationEnd = null;
			String variableDeclaration = null;
			if (CDAModelUtil.isSection(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
				associationEnd = "entry";
				variableDeclaration = "entry : cda::Entry";
			} else if (CDAModelUtil.isOrganizer(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
				associationEnd = "component";
				variableDeclaration = "component : cda::Component4";
			} else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
				associationEnd = "entryRelationship";
				variableDeclaration = "entryRelationship : cda::EntryRelationship";
			} else {
				String message = "Unsupported association: " + sourceClass.getQualifiedName() 
						+ " -> " + targetClass.getQualifiedName();
				Logger.log(Logger.ERROR, message);

				removeModelElement(sourceProperty);
				removeModelElement(association);
				return null;
			}

			body.append("self." + associationEnd + "->");
			body.append((sourceProperty.getUpper() == 1) ? "one(" : "exists(");
			body.append(variableDeclaration);
			body.append(" | " + associationEnd);
			if (!"Entry".equals(cdaTargetName)) {
				body.append("." + cdaTargetLowerName);
			}
			body.append(".oclIsKindOf(" + targetQName + ")");
			
			String stereotypeName = CDAModelUtil.isSection(sourceClass) ? ICDAProfileConstants.ENTRY : ICDAProfileConstants.ENTRY_RELATIONSHIP;
			stereotype = CDAProfileUtil.getAppliedCDAStereotype(association, stereotypeName);
			if (stereotype != null) {
				Object value = association.getValue(stereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
				String typeCode = null;
				if (value instanceof EnumerationLiteral) {
					typeCode = ((EnumerationLiteral)value).getName();
				}
				else if (value instanceof Enumerator) {
					typeCode = ((Enumerator)value).getName();
				}
				
				if (typeCode != null) {
					String enumerationQName = CDAModelUtil.isSection(sourceClass) ? "vocab::x_ActRelationshipEntry" : "vocab::x_ActRelationshipEntryRelationship";
					body.append(" and " + associationEnd + ".typeCode = " + enumerationQName + "::" + typeCode);
				}
			}

			body.append(")");
		}
		
		if (CDAModelUtil.getTemplateId(sourceClass) == null 
				|| CDAModelUtil.getTemplateId(targetClass) == null) {
			String message = "Source or target is not a template: " 
					+ sourceClass.getQualifiedName() 
					+ " -> " + targetClass.getQualifiedName();
			Logger.log(Logger.WARNING, message);
		}
		
		String constraintName = createConstraintName(sourceClass, targetName);
		Constraint constraint = sourceClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(sourceClass);
		
		OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(body.toString());

		Stereotype validationSupport = stereotype != null ? stereotype : CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ASSOCIATION_VALIDATION);
		if (validationSupport != null) {
			Object value = association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_SEVERITY);
			String severity = "ERROR";
			if (value instanceof EnumerationLiteral) {
				severity = ((EnumerationLiteral)value).getName();
			}
			else if (value instanceof Enumerator) {
				severity = ((Enumerator)value).getName();
			}
			String message = (String) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE);
			
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
