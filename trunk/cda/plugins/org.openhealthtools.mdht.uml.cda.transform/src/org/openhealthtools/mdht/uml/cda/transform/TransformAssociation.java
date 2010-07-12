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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
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

		String severity = CDAModelUtil.getValidationSeverity(association);
		if (severity == null) {
			// not a conformance rule
			removeModelElement(sourceProperty);
			removeModelElement(association);
			return null;
		}
		
		Class cdaSourceClass = getCDAClass(sourceClass);
		Class cdaTargetClass = getCDAClass(targetClass);
		
		if (cdaSourceClass == null || cdaTargetClass == null) {
			String message = "Unsupported association: " + sourceClass.getQualifiedName() 
								+ " -> " + sourceProperty.getType().getQualifiedName();
			Logger.log(Logger.ERROR, message);

			removeModelElement(sourceProperty);
			removeModelElement(association);
			return null;
		}

		// Support target class without templateId by using its superclass template.
		// For untemplated classes (subclasses of CDA), use the base CDA class (last parent).
		Class constraintTarget = targetClass;
		List<Classifier> parents = new ArrayList<Classifier>(targetClass.getGenerals());
		while (!parents.isEmpty() && CDAModelUtil.getTemplateId(constraintTarget) == null) {
			if (parents.get(0) instanceof Class)
				constraintTarget = (Class) parents.remove(0);
		}
		
		// Validate target and source classes to include only supported relationships:
		//		ClinicalDocument -> Section, Section -> Section
		//		Section -> { Act, Encounter, ... }
		//		Organizer -> { Act, Encounter, ... }
		//		{ Act, Encounter, ... } -> { Act, Encounter, ... }

		String cdaTargetName = cdaTargetClass.getName();
		String cdaTargetLowerName = cdaTargetName.substring(0, 1).toLowerCase() + cdaTargetName.substring(1);
		String cdaTargetQName = cdaTargetClass.getQualifiedName();
		
		String targetName = targetClass.getName();
		String constraintTargetQName = constraintTarget.getQualifiedName();
		
		StringBuffer constraintBody = new StringBuffer();
		Stereotype stereotype = null;
		
		StringBuffer operationBody = new StringBuffer();

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass))
				&& CDAModelUtil.isSection(targetClass)) {
			// ClinicalDocument -> Section || Section -> Section
			constraintBody.append("self.getAllSections()->");
			constraintBody.append((sourceProperty.getUpper() == 1) ? "one(" : "exists(");
			constraintBody.append("section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(" + constraintTargetQName + "))");
			
			// start building "getter" operation body
			operationBody.append(constraintBody.toString().replace("one", "select").replace("exists", "select"));
		} 
		else {
			String associationEnd = null;
			String variableDeclaration = null;
//			if (CDAModelUtil.isSection(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
			if (CDAModelUtil.isSection(sourceClass) && (CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
				associationEnd = "entry";
				variableDeclaration = "entry : cda::Entry";
			} 
			else if (CDAModelUtil.isOrganizer(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
				associationEnd = "component";
				variableDeclaration = "component : cda::Component4";
			} 
			else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
				associationEnd = "entryRelationship";
				variableDeclaration = "entryRelationship : cda::EntryRelationship";
			} 
			else if (CDAModelUtil.isClinicalStatement(sourceClass) && "ParticipantRole".equals(cdaTargetClass.getName())) {
				associationEnd = "participant";
				variableDeclaration = "participant : cda::Participant2";
			} 
			else if (CDAModelUtil.isClinicalStatement(sourceClass) && "AssignedEntity".equals(cdaTargetClass.getName())) {
				associationEnd = "performer";
				variableDeclaration = "performer : cda::Performer2";
			} 
			else {
				String message = "Unsupported association: " + sourceClass.getQualifiedName() 
						+ " -> " + targetClass.getQualifiedName();
				Logger.log(Logger.ERROR, message);

				removeModelElement(sourceProperty);
				removeModelElement(association);
				return null;
			}

			constraintBody.append("self." + associationEnd + "->");
			constraintBody.append((sourceProperty.getUpper() == 1) ? "one(" : "exists(");
			constraintBody.append(variableDeclaration);
			constraintBody.append(" | ");
			
			String reference = associationEnd;
			if (!CDAModelUtil.isEntry(targetClass)) {
				reference += "." + cdaTargetLowerName;
			}
			constraintBody.append("not " + reference + ".oclIsUndefined() and ");
			constraintBody.append(reference + ".oclIsKindOf(" + constraintTargetQName + ")");
			
			if (CDAModelUtil.isSection(sourceClass) && (CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
				// Section -> Entry, Section -> clinicalStatement (entry)
				stereotype = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY);
			} 
			else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass) && !CDAModelUtil.isOrganizer(sourceClass)) {
				// clinicalStatement (not Organizer) -> clinicalStatement (entryRelationship)
				stereotype = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY_RELATIONSHIP);
			} 
			else {
				stereotype = null;
			}
			
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
					constraintBody.append(" and " + associationEnd + ".typeCode = " + enumerationQName + "::" + typeCode);
				}
			}

			constraintBody.append(")");
			
			// start building "getter" operation body
			operationBody.append("self.get" + pluralize(cdaTargetName) + "()->select(");
			operationBody.append(cdaTargetLowerName + " : " + cdaTargetQName + " | ");
			operationBody.append("not " + cdaTargetLowerName + ".oclIsUndefined() and ");
			operationBody.append(cdaTargetLowerName + ".oclIsKindOf(" + constraintTargetQName + "))");
		}
		
//		if (CDAModelUtil.getTemplateId(sourceClass) == null 
//				|| CDAModelUtil.getTemplateId(targetClass) == null) {
//			String message = "Source or target is not a template: " 
//					+ sourceClass.getQualifiedName() 
//					+ " -> " + targetClass.getQualifiedName();
//			Logger.log(Logger.WARNING, message);
//		}
		
		String constraintName = createConstraintName(sourceClass, targetName);
		Constraint constraint = sourceClass.createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(sourceClass);
		
		OpaqueExpression expression = (OpaqueExpression) constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		expression.getLanguages().add("OCL");
		expression.getBodies().add(constraintBody.toString());

		Stereotype validationSupport = stereotype != null ? stereotype : CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ASSOCIATION_VALIDATION);
		if (validationSupport != null) {
			String message = (String) association.getValue(validationSupport, ICDAProfileConstants.VALIDATION_MESSAGE);
			
			if ("INFO".equals(severity)) {
				addValidationInfo(sourceClass, constraintName, message);
			} else if ("WARNING".equals(severity)) {
				addValidationWarning(sourceClass, constraintName, message);
			} else {
				addValidationError(sourceClass, constraintName, message);
			}
		}
		
		// finish building "getter" operation body
		if (sourceProperty.getUpper() == 1) {
			operationBody.append("->asSequence()->first()");
		}
		operationBody.append(".oclAsType(" + constraintTargetQName + ")");
		
		// create "getter" operation
		String operationName = "get" + ((sourceProperty.getUpper() == 1) ? targetName : pluralize(targetName));
		Operation operation = sourceClass.createOwnedOperation(operationName, null, null, constraintTarget);
		operation.setUpper(sourceProperty.getUpper());
		
		// create body constraint for "getter" operation
		Constraint bodyConstraint = operation.createBodyCondition("body");
		bodyConstraint.getConstrainedElements().add(operation);
		
		OpaqueExpression bodyExpression = (OpaqueExpression) bodyConstraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		bodyExpression.getLanguages().add("OCL");
		bodyExpression.getBodies().add(operationBody.toString());
		
		removeModelElement(sourceProperty);
		removeModelElement(association);
		
		return association;
	}

	private String pluralize(String name) {
		if (name.endsWith("y")) {
			return name.substring(0, name.length() - 1) + "ies";
		}
		if (name.endsWith("ia")) {
			return name;
		}
		return name + "s";
	}
}
