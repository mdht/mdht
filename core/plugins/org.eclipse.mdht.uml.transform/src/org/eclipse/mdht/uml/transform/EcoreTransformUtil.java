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
package org.eclipse.mdht.uml.transform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

public abstract class EcoreTransformUtil {

	public static Stereotype getAppliedEcoreStereotype(Element element, String name) {
		return element.getAppliedStereotype("Ecore" //$NON-NLS-1$
			+ NamedElement.SEPARATOR + name);
	}

	public static Stereotype getEcoreStereotype(EObject eObject, String name) {
		Profile ecoreProfile = getEcoreProfile(eObject);

		return ecoreProfile != null
				? ecoreProfile.getOwnedStereotype(name)
				: null;
	}

	public static Profile getEcoreProfile(EObject eObject) {
		Resource eResource = eObject.eResource();

		if (eResource != null) {
			ResourceSet resourceSet = eResource.getResourceSet();

			if (resourceSet != null) {
				return (Profile) UML2Util.load(
					resourceSet, URI.createURI(UMLResource.ECORE_PROFILE_URI), UMLPackage.Literals.PROFILE);
			}
		}

		return null;
	}

}
