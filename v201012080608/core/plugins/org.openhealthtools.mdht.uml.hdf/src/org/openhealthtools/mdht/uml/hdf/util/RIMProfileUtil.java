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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

public class RIMProfileUtil {

	/**
	 * Returns the first RIM stereotype that is applied, or null if none are applied.
	 */
	public static Stereotype getRIMStereotype(Element element) {
		Profile rimProfile = HL7ResourceUtil.getAppliedRIMProfile(element);
		if (rimProfile == null) {
			return null;
		}
		
		Stereotype stereotype = null;
		for (Iterator iter = element.getAppliedStereotypes().iterator(); iter.hasNext();) {
			Stereotype s = (Stereotype) iter.next();
			if (s.getProfile() == rimProfile) {
				stereotype = s;
				break;
			}
		}
		return stereotype;
	}
	
	/**
	 * Returns true if the given RIM type is applied as a stereotype to this element.
	 * 
	 * @param rimType	RIM type, e.g. Act, Entity, Role.
	 */
	public static boolean isRIMType(Element element, String rimType)  {
		Stereotype stereotype = getRIMStereotype(element);
		if (stereotype != null)
			return getAllParentNames(stereotype).contains(rimType);
		
		return false;
	}
	
	public static List<String> getAllParentNames(Stereotype stereotype) {
		List<String> parentNames = new ArrayList();
		parentNames.add(stereotype.getName());
		for (Iterator iter = stereotype.getGenerals().iterator(); iter.hasNext();) {
			Stereotype parent = (Stereotype) iter.next();
			parentNames.addAll(getAllParentNames(parent));
		}
		return parentNames;
	}
	
}
