/**
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - more accurate association multiplicity constraints (artf3100)
 *                        - support local datatype subclasses (artf3350)
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.TransformAssociation;

public class TransformCDAAssociation extends TransformAssociation {

	public TransformCDAAssociation(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	protected boolean isImplicitAssociation(Property sourceProperty, Class sourceClass, Class targetClass) {
		return CDAModelUtil.isEntry(targetClass);
	}

	@Override
	protected boolean handleSpecialAssociation(StringBuilder constraintBody, StringBuilder operationBody,
			Property sourceProperty, Class sourceClass, Class targetClass, String constraintTargetQName) {
		boolean result = false;

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
				CDAModelUtil.isSection(targetClass)) {
			// ClinicalDocument -> Section || Section -> Section
			constraintBody.append("self.getAllSections()->");
			constraintBody.append((sourceProperty.getUpper() == 1)
					? "one("
					: "exists(");
			constraintBody.append("section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(" +
					constraintTargetQName + "))");

			// start building "getter" operation body
			operationBody.append(constraintBody.toString().replace("one", "select").replace("exists", "select"));

			result = true;
		}

		return result;
	}

	@Override
	protected boolean getAssociationEndAndIteratorDeclaration(Property sourceProperty, Class sourceClass,
			Class baseSourceClass, Class targetClass, Class baseTargetClass, String[] associationEndOut,
			String[] variableDeclarationOut) {

		boolean result = false;

		// if (CDAModelUtil.isSection(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
		if (CDAModelUtil.isSection(sourceClass) &&
				(CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
			associationEndOut[0] = "entry";
			variableDeclarationOut[0] = "entry : cda::Entry";
		} else if (CDAModelUtil.isOrganizer(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
			associationEndOut[0] = "component";
			variableDeclarationOut[0] = "component : cda::Component4";
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass)) {
			associationEndOut[0] = "entryRelationship";
			variableDeclarationOut[0] = "entryRelationship : cda::EntryRelationship";
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) && "ParticipantRole".equals(baseTargetClass.getName())) {
			associationEndOut[0] = "participant";
			variableDeclarationOut[0] = "participant : cda::Participant2";
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) && "AssignedEntity".equals(baseTargetClass.getName())) {
			associationEndOut[0] = "performer";
			variableDeclarationOut[0] = "performer : cda::Performer2";
		} else {
			// See if we have a property with the same class type
			Property property = baseSourceClass.getOwnedAttribute(null, targetClass, true, null, false);

			// If not - walk the hierarchy and check for properties
			if (property == null) {
				for (Classifier c : targetClass.allParents()) {

					property = baseSourceClass.getOwnedAttribute(null, c, true, null, false);

					if (property != null || isBaseModel(targetClass, c)) {
						break;
					}

				}
			}

			// If we still can not find - use the name - this is not optimal but CDA has some hop scotch hierarchies such as consumable and
			// manufactured product
			if (property == null) {
				property = baseSourceClass.getOwnedAttribute(sourceProperty.getName(), null, true, null, false);
			}

			// If we found it, process it
			if (property != null) {
				associationEndOut[0] = property.getName();

				variableDeclarationOut[0] = property.getName() + " : cda::" + property.getType().getName();

				// do not generate a getter already there
				result = true;
			}
		}

		return result;
	}

	@SuppressWarnings("deprecation")
	private Stereotype getAssociationStereotype(Association association, Class sourceClass, Class targetClass) {
		Stereotype result = null;

		if (CDAModelUtil.isSection(sourceClass) &&
				(CDAModelUtil.isClinicalStatement(targetClass) || CDAModelUtil.isEntry(targetClass))) {
			// Section -> Entry, Section -> clinicalStatement (entry)
			result = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY);
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(targetClass) &&
				!CDAModelUtil.isOrganizer(sourceClass)) {
			// clinicalStatement (not Organizer) -> clinicalStatement (entryRelationship)
			result = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY_RELATIONSHIP);
		}

		return result;
	}

	@SuppressWarnings("deprecation")
	@Override
	protected boolean appendAssociationStereotypeConditions(StringBuilder constraintBody, Association association,
			String associationEnd, Class sourceClass, Class targetClass) {

		boolean result = false;
		Stereotype stereotype = getAssociationStereotype(association, sourceClass, targetClass);

		if (stereotype != null) {
			Object value = association.getValue(stereotype, ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
			String typeCode = null;
			if (value instanceof EnumerationLiteral) {
				typeCode = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				typeCode = ((Enumerator) value).getName();
			}

			if (typeCode != null) {
				String enumerationQName = CDAModelUtil.isSection(sourceClass)
						? "vocab::x_ActRelationshipEntry"
						: "vocab::x_ActRelationshipEntryRelationship";
				constraintBody.append(" and " + associationEnd + ".typeCode = " + enumerationQName + "::" + typeCode);
			}

			result = true;
		}

		return result;
	}
}
