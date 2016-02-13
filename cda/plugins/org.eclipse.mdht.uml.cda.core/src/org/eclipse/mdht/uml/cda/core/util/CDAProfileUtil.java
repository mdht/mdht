/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - added missing utilities
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.core.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.cda.core.profile.ActRelationship;
import org.eclipse.mdht.uml.cda.core.profile.CDATemplate;
import org.eclipse.mdht.uml.cda.core.profile.ConformsTo;
import org.eclipse.mdht.uml.cda.core.profile.Entry;
import org.eclipse.mdht.uml.cda.core.profile.EntryRelationship;
import org.eclipse.mdht.uml.cda.core.profile.Inline;
import org.eclipse.mdht.uml.cda.core.profile.LogicalConstraint;
import org.eclipse.mdht.uml.cda.core.profile.Participation;
import org.eclipse.mdht.uml.cda.core.profile.TextValue;
import org.eclipse.mdht.uml.cda.core.profile.Validation;
import org.eclipse.mdht.uml.cda.core.profile.VocabSpecification;
import org.eclipse.mdht.uml.cda.resources.util.CDAResource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CDAProfileUtil {

	public static ActRelationship getActRelationship(Association association) {
		ActRelationship actRelationship = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			association, ICDAProfileConstants.ACT_RELATIONSHIP);
		if (stereotype != null) {
			actRelationship = (ActRelationship) association.getStereotypeApplication(stereotype);
		}
		return actRelationship;
	}

	public static LogicalConstraint getLogicalConstraint(Constraint constraint) {
		LogicalConstraint logicalClassifier = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			constraint, ICDAProfileConstants.LOGICAL_CONSTRAINT);
		if (stereotype != null) {
			logicalClassifier = (LogicalConstraint) constraint.getStereotypeApplication(stereotype);
		}
		return logicalClassifier;
	}

	public static Participation getParticipation(Association association) {
		Participation participation = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.PARTICIPATION);
		if (stereotype != null) {
			participation = (Participation) association.getStereotypeApplication(stereotype);
		}
		return participation;
	}

	public static TextValue getTextValue(Property property) {
		TextValue textValue = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(property, ICDAProfileConstants.TEXT_VALUE);
		if (stereotype != null) {
			textValue = (TextValue) property.getStereotypeApplication(stereotype);
		}
		return textValue;
	}

	public static ConformsTo getConformsTo(Generalization generalization) {
		ConformsTo conformsTo = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			generalization, ICDAProfileConstants.CONFORMS_TO);
		if (stereotype != null) {
			conformsTo = (ConformsTo) generalization.getStereotypeApplication(stereotype);
		}
		return conformsTo;
	}

	public static Inline getInline(org.eclipse.uml2.uml.Class theClass) {
		Inline inline = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(theClass, ICDAProfileConstants.INLINE);
		if (stereotype != null) {
			inline = (Inline) theClass.getStereotypeApplication(stereotype);
		}
		return inline;
	}

	public static EntryRelationship getEntryRelationship(Association association) {
		EntryRelationship entryRelationship = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			association, ICDAProfileConstants.ENTRY_RELATIONSHIP);
		if (stereotype != null) {
			entryRelationship = (EntryRelationship) association.getStereotypeApplication(stereotype);
		}
		return entryRelationship;
	}

	public static Entry getEntry(Association association) {
		Entry entry = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(association, ICDAProfileConstants.ENTRY);
		if (stereotype != null) {
			entry = (Entry) association.getStereotypeApplication(stereotype);
		}
		return entry;
	}

	public static CDATemplate getCDATemplate(org.eclipse.uml2.uml.Class clazz) {
		CDATemplate cdaTemplate = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(clazz, ICDAProfileConstants.CDA_TEMPLATE);
		if (stereotype != null) {
			cdaTemplate = (CDATemplate) clazz.getStereotypeApplication(stereotype);
		}
		return cdaTemplate;
	}

	public static Validation getValidation(Element element) {
		Validation validation = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(element, ICDAProfileConstants.VALIDATION);
		if (stereotype != null) {
			validation = (Validation) element.getStereotypeApplication(stereotype);
		}
		return validation;
	}

	public static boolean isMandatory(Element element) {
		boolean result = false;

		// if any validation stereotype indicates a mandatory property, then
		// the property is mandatory
		for (Iterator<?> iter = element.getStereotypeApplications().iterator(); !result && iter.hasNext();) {
			Object next = iter.next();
			result = (next instanceof Validation) && ((Validation) next).isMandatory();
		}

		return result;
	}

	public static VocabSpecification getVocabSpecification(Property property) {
		VocabSpecification vocabSpecification = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
			property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		if (stereotype != null) {
			vocabSpecification = (VocabSpecification) property.getStereotypeApplication(stereotype);
		}
		return vocabSpecification;
	}

	/**
	 * Load CDA profile into provided resource set and return Profile.
	 */
	public static Profile getCDAProfile(ResourceSet resourceSet) {
		Profile profile = null;
		Resource profileResource = resourceSet.getResource(URI.createURI(CDAResource.CDA_PROFILE_URI), true);

		if (profileResource != null) {
			profile = (Profile) EcoreUtil.getObjectByType(
				profileResource.getContents(), UMLPackage.eINSTANCE.getProfile());
		}

		return profile;
	}

	/**
	 * Returns stereotype if applied, or first sub-stereotype applied that is a
	 * specialization of the given stereotype.
	 *
	 * @return stereotype, or null if not applied
	 */
	public static Stereotype getAppliedCDAStereotype(Element element, String stereotypeName) {
		Stereotype stereotype = null;
		if (element == null || element.eResource() == null) {
			// this occurs when resource is unloaded or element was removed
			return null;
		}
		Profile profile = getCDAProfile(element.eResource().getResourceSet());
		if (profile != null) {
			stereotype = profile.getOwnedStereotype(stereotypeName);
			if (stereotype != null) {
				if (!element.isStereotypeApplied(stereotype)) {
					List<Stereotype> stereotypes = element.getAppliedSubstereotypes(stereotype);
					if (!stereotypes.isEmpty()) {
						stereotype = stereotypes.get(0);
					}
				}
			}
		}

		return element.isStereotypeApplied(stereotype)
				? stereotype
				: null;
	}

	/**
	 * Returns all applied stereotypes, including sub-stereotype applied that is a
	 * specialization of the given stereotype.
	 *
	 * @return stereotypes, or null if not applied
	 */
	public static List<Stereotype> getAppliedStereotypes(Element element, String stereotypeName) {
		List<Stereotype> appliedStereotypes = new ArrayList<Stereotype>();

		if (element == null || element.eResource() == null) {
			// this occurs when resource is unloaded or element was removed
			return null;
		}
		Profile profile = getCDAProfile(element.eResource().getResourceSet());
		if (profile != null) {
			Stereotype stereotype = profile.getOwnedStereotype(stereotypeName);
			if (stereotype != null) {
				if (!element.isStereotypeApplied(stereotype)) {
					List<Stereotype> stereotypes = element.getAppliedSubstereotypes(stereotype);
					appliedStereotypes.addAll(stereotypes);
				}
			}
		}

		return appliedStereotypes;
	}

	/**
	 * Applies stereotype if it is not already applied to given model element,
	 * and applies CDA profile if necessary.
	 */
	public static Stereotype applyCDAStereotype(Element element, String stereotypeName) {
		Stereotype stereotype = null;
		Profile profile = getCDAProfile(element.eResource().getResourceSet());
		if (profile != null) {
			stereotype = profile.getOwnedStereotype(stereotypeName);
			if (stereotype != null && !element.isStereotypeApplied(stereotype)) {
				UMLUtil.safeApplyStereotype(element, stereotype);
			}
		}
		return stereotype;
	}

	public static void unapplyCDAStereotype(Element element, String stereotypeName) {
		String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR + stereotypeName;
		Stereotype stereotype = element.getApplicableStereotype(qname);
		if (stereotype != null && element.isStereotypeApplied(stereotype)) {
			element.unapplyStereotype(stereotype);
		}
	}

	/**
	 * Check all containing packages for applied profile.
	 */
	public static Profile getAppliedCDAProfile(Element element) {
		return org.eclipse.mdht.uml.common.util.UMLUtil.getAppliedProfile(CDAResource.CDA_PROFILE_URI, element);

	}

	/**
	 * Is the specified stereotype a CDA validation stereotype?
	 *
	 * @param stereotype
	 *            a stereotype applied to a model element
	 * @return whether it specializes (possibly indirectly) the <tt>cda::Validation</tt> stereotype
	 */
	public static boolean isValidationStereotype(Stereotype stereotype) {
		final String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR +
				ICDAProfileConstants.VALIDATION;
		boolean result = qname.equals(stereotype.getQualifiedName());

		if (!result) {
			for (Classifier next : stereotype.allParents()) {
				if (qname.equals(next.getQualifiedName())) {
					result = true;
					break;
				}
			}
		}

		return result;
	}
}
