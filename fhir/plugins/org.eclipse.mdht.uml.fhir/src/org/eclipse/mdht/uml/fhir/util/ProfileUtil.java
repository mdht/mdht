/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

/*
 * TODO move this to org.eclipse.mdht.uml.common
 */
public class ProfileUtil {

	/**
	 * Returns stereotype application, if applied, or first sub-stereotype applied that is a
	 * specialization of the given stereotype.
	 * 
	 * @return stereotype application, or null if not applied
	 */
	public static EObject getStereotypeApplication(Element element, EClass stereotypeEClass) {
		EObject stereotypeApplication = null;
		for (EObject stereoApp : element.getStereotypeApplications()) {
			if (stereotypeEClass.isInstance(stereoApp)) {
				stereotypeApplication = stereoApp;
				break;
			}
		}
		
		return stereotypeApplication;
	}
	
	/**
	 * Load root profile into provided resource set and return Profile.
	 */
//	public static Profile getProfile(ResourceSet resourceSet) {
//		return getProfile(resourceSet, null);
//	}
	
	/**
	 * Load profile into provided resource set and return Profile.
	 */
	/*
	public static Profile getProfile(ResourceSet resourceSet, String profileName) {
		Profile profile = null;
		Resource profileResource = resourceSet.getResource(URI.createURI(MDRProfileConstants.PROFILE_URI), true);

		if (profileResource != null) {
			profile = (Profile) EcoreUtil.getObjectByType(
				profileResource.getContents(), UMLPackage.eINSTANCE.getProfile());
		}
		
		// find nested profile package
		if (profile != null && profileName != null) {
			profile = (Profile) profile.getMember(profileName, false, UMLPackage.eINSTANCE.getProfile());
		}

		return profile;
	}

	public static boolean isProfileApplied(String profileName, Element element) {
		Profile profile = getProfile(element.eResource().getResourceSet(), profileName);
		if (profile == null) {
			return false;
		}

		try {
			Package pkg = element.getNearestPackage();
			while (pkg != null) {
				if (pkg.isProfileApplied(profile)) {
					return true;
				} else {
					pkg = pkg.getNestingPackage();
				}
			}
		} catch (IllegalArgumentException e) {
			// false
		}

		return false;
	}
	*/

}
