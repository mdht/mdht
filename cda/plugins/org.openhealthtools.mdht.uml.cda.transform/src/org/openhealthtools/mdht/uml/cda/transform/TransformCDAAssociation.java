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
 *     Dan Brown (Audacious Inquiry) - Implement fix for artf3818 : Errata 384 Incorporate No Information Section Fixes
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.TransformAssociation;

public class TransformCDAAssociation extends TransformAssociation {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.openhealthtools.mdht.uml.transform.ecore.TransformAssociation#isOpen(org.eclipse.uml2.uml.Association)
	 */
	@Override
	protected boolean isOpen(Association association) {

		Validation validation = org.eclipse.uml2.uml.util.UMLUtil.getStereotypeApplication(
			association, Validation.class);

		if (validation != null && validation.getKind().equals(ValidationKind.CLOSED)) {
			return false;
		} else {
			return true;
		}
	}

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

			operationBody.append("self.getAllSections()->select(");
			operationBody.append(
				"section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(" +
						constraintTargetQName + "))");

			if (sourceProperty.getUpper() == 1) {
				constraintBody.append(operationBody.toString().replace("select", "one"));
			} else {
				constraintBody.append(operationBody.toString()).append("->size() >= ").append(
					sourceProperty.getLower() == 0
							? "1"
							: sourceProperty.getLower());
				if (sourceProperty.getUpper() != LiteralUnlimitedNatural.UNLIMITED) {
					constraintBody.append(" and ").append(operationBody.toString()).append("->size() <= ").append(
						sourceProperty.getUpper());
				}

			}
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
		} else
			if (CDAModelUtil.isClinicalStatement(sourceClass) && "ParticipantRole".equals(baseTargetClass.getName())) {
			associationEndOut[0] = "participant";
			variableDeclarationOut[0] = "participant : cda::Participant2";
		} else if (CDAModelUtil.isClinicalStatement(sourceClass) &&
				"AssignedEntity".equals(baseTargetClass.getName())) {
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

	/**
	 *
	 * Returns the OCL prefix required based on the implementation.
	 * Overrides the parent TransformAssociation.java method to provide more complex OCL based on a specific scenario.
	 * The scenario is Errata 384:
	 * For all sections requiring entries, If nullFlavor = NI is NOT present, or a different (incorrect) nullFLavor type is present:
	 * The entry requirement is enforced.
	 * Otherwise, if there is no nullFlavor = NI specified on the section:
	 * The entry is required as defined by the existing OCL constraint.
	 *
	 * @param baseSourceClass
	 *            used for sub class overrides to determine what type of element we are dealing with.
	 *            If the subclass is calling the method, pass in null since it is not used in the super.
	 * @return OCL prefix in String form to be appended
	 */
	@Override
	protected String addPrefix(Class baseSourceClass) {
		if (CDAModelUtil.isSection(baseSourceClass)) {
			return "self.nullFlavor <> vocab::NullFlavor::NI implies ";
		}

		return super.addPrefix(null);
	}
}
