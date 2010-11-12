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
package org.openhealthtools.mdht.uml.cda.core.util;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.Participation;
import org.openhealthtools.mdht.uml.cda.core.profile.TextValue;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAResource;

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

	public static Participation getParticipation(Association association) {
		Participation participation = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				association, ICDAProfileConstants.PARTICIPATION);
		if (stereotype != null) {
			participation = (Participation) association.getStereotypeApplication(stereotype);
		}
		return participation;
	}
	
	public static TextValue getTextValue(Property property) {
		TextValue textValue = null;
		Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.TEXT_VALUE);
		if (stereotype != null) {
			textValue = (TextValue) property.getStereotypeApplication(stereotype);
		}
		return textValue;
	}
	
	/**
	 * Load CDA profile into provided resource set and return Profile.
	 */
	public static Profile getCDAProfile(ResourceSet resourceSet) {
		Profile profile = null;
		Resource profileResource = resourceSet.getResource(URI
				.createURI(CDAResource.CDA_PROFILE_URI), true);
		
		if (profileResource != null) {
			profile = (Profile) EcoreUtil.getObjectByType(
					profileResource.getContents(), 
					UMLPackage.eINSTANCE.getProfile());
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
		if (element.eResource() == null) {
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
		
		return element.isStereotypeApplied(stereotype) ? stereotype : null;
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
		return org.openhealthtools.mdht.uml.common.util.UMLUtil.getAppliedProfile(CDAResource.CDA_PROFILE_URI,element);
				
	}
}
