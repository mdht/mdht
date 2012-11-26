/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf.util;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.internal.Activator;
import org.openhealthtools.mdht.uml.hdf.internal.Logger;

/**
 * 
 * @version $Id: $
 */
public class HL7ResourceUtil {

	public static boolean getBooleanPreference(String stereotypeName, String propertyName) {
		Preferences store = Activator.getDefault().getPluginPreferences();

		// use preference key: StereotypeName.propertyName
		return store.getBoolean(stereotypeName + "." + propertyName);
	}

	public static String getStringPreference(String stereotypeName, String propertyName) {
		Preferences store = Activator.getDefault().getPluginPreferences();

		return store.getString(stereotypeName + "." + propertyName);
	}

	public static long getLongPreference(String stereotypeName, String propertyName) {
		Preferences store = Activator.getDefault().getPluginPreferences();

		return store.getLong(stereotypeName + "." + propertyName);
	}

	/**
	 * Returns null if stereotype is not applied to element.
	 */
	public static Stereotype getAppliedHDFStereotype(Element element, String stereotypeName) {
		String qname = IHDFProfileConstants.HDF_PROFILE_NAME + "::" + stereotypeName;
		return element.getAppliedStereotype(qname);
	}

	public static Stereotype applyHDFStereotype(Element element, String stereotypeName) {
		// apply the HDF profile, if necessary
		applyHDFProfile(UMLUtil.getTopPackage(element.getNearestPackage()));

		String qname = IHDFProfileConstants.HDF_PROFILE_NAME + "::" + stereotypeName;
		Stereotype stereotype = element.getApplicableStereotype(qname);
		if (stereotype != null && !element.isStereotypeApplied(stereotype)) {
			element.applyStereotype(stereotype);
		}
		return stereotype;
	}

	public static void unapplyHDFStereotype(Element element, String stereotypeName) {
		String qname = IHDFProfileConstants.HDF_PROFILE_NAME + "::" + stereotypeName;
		Stereotype stereotype = element.getApplicableStereotype(qname);
		if (stereotype != null && element.isStereotypeApplied(stereotype)) {
			element.unapplyStereotype(stereotype);
		}
	}

	/**
	 * Check all containing packages for applied profile.
	 */

	/**
	 * Check all containing packages for applied profile.
	 */
	public static Profile getAppliedHDFProfile(Element element) {
		return UMLUtil.getAppliedProfile(HL7Resource.HDF_PROFILE_URI, element);
	}

	public static Profile applyHDFProfile(Package pkg) {
		Profile hdfProfile = null;

		try {
			ResourceSet resourceSet = pkg.eResource().getResourceSet();
			Resource hdfProfileResource = resourceSet.getResource(URI.createURI(HL7Resource.HDF_PROFILE_URI), true);

			if (hdfProfileResource != null) {
				hdfProfile = (Profile) EcoreUtil.getObjectByType(
					hdfProfileResource.getContents(), UMLPackage.eINSTANCE.getProfile());

				if (hdfProfile != null && !pkg.isProfileApplied(hdfProfile)) {
					pkg.applyProfile(hdfProfile);
				}
			}

			// import the HL7 standard datatype library
			// importHL7DatatypesLibrary(model);

		} catch (WrappedException we) {
			Logger.logException(we);
		}

		return hdfProfile;
	}

	/**
	 * Returns null if stereotype is not applied to element.
	 */
	public static Stereotype getAppliedRIMStereotype(Element element, String stereotypeName) {
		String qname = IRIMProfileConstants.RIM_PROFILE_NAME + "::" + stereotypeName;
		return element.getAppliedStereotype(qname);
	}

	public static Stereotype applyRIMStereotype(Element element, String stereotypeName) {
		// apply the RIM profile, if necessary
		applyRIMProfile(UMLUtil.getTopPackage(element.getNearestPackage()));

		String qname = IRIMProfileConstants.RIM_PROFILE_NAME + "::" + stereotypeName;
		Stereotype stereotype = element.getApplicableStereotype(qname);
		if (stereotype != null && !element.isStereotypeApplied(stereotype)) {
			element.applyStereotype(stereotype);
		}
		return stereotype;
	}

	/**
	 * Check all containing packages for applied profile.
	 */
	public static Profile getAppliedRIMProfile(Element element) {
		return UMLUtil.getAppliedProfile(HL7Resource.RIM_PROFILE_URI, element);
	}

	public static Profile applyRIMProfile(Package pkg) {
		Profile rimProfile = null;

		try {
			ResourceSet resourceSet = pkg.eResource().getResourceSet();
			Resource rimProfileResource = resourceSet.getResource(URI.createURI(HL7Resource.RIM_PROFILE_URI), true);

			if (rimProfileResource != null) {
				rimProfile = (Profile) EcoreUtil.getObjectByType(
					rimProfileResource.getContents(), UMLPackage.eINSTANCE.getProfile());

				if (rimProfile != null && !pkg.isProfileApplied(rimProfile)) {
					pkg.applyProfile(rimProfile);
				}
			}

		} catch (WrappedException we) {
			Logger.logException(we);
		}

		return rimProfile;
	}

}
