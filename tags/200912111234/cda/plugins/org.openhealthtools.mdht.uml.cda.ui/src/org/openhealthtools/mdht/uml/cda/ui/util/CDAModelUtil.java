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
package org.openhealthtools.mdht.uml.cda.ui.util;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

public class CDAModelUtil {

	public static final String CDA_PACKAGE_NAME = "cda";

	public static Class getCDAClass(Class templateClass) {
		for (Classifier parent : templateClass.allParents()) {
			if (CDA_PACKAGE_NAME.equals(parent.getNearestPackage().getName()) 
					&& parent instanceof Class) {
				return (Class) parent;
			}
		}
		
		return null;
	}
	
	public static Property getCDAProperty(Property templateProperty) {
		if (templateProperty.getClass_() == null) {
			return null;
		}
		
		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(templateProperty.getName())
						&& CDA_PACKAGE_NAME.equals(inherited.getNearestPackage().getName())) {
					return inherited;
				}
			}
		}
		
		return null;
	}
	
	/**
	 * Returns the nearest inherited property with the same name, or null if not found.
	 */
	public static Property getInheritedProperty(Property templateProperty) {
		if (templateProperty.getClass_() == null) {
			return null;
		}
		
		for (Classifier parent : templateProperty.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(templateProperty.getName())) {
					return inherited;
				}
			}
		}
		
		return null;
	}
	
}
