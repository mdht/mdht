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
package org.openhealthtools.mdht.uml.cda.resources.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CDAProfileUtil {

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
	 * Returns null if stereotype is not applied to element.
	 */
	public static Stereotype getAppliedCDAStereotype(Element element, String stereotypeName) {		
		String qname = ICDAProfileConstants.CDA_PROFILE_NAME + NamedElement.SEPARATOR + stereotypeName;
		return element.getAppliedStereotype(qname);
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

}
