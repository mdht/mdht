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
package org.openhealthtools.mdht.uml.hl7.core.util;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;

/**
 * Common utility methods for working with the HL7 RIM model.
 */
public class RIMUtil {

	/**
	 * Search all nested packages in the RIM library for the given class name.
	 * This search does not consider qualified names, but only looks for a matching
	 * local name.
	 * 
	 * @param basePackage
	 *            base package for the model in which library is imported
	 * @param className
	 *            RIM class name
	 * @return a Class, or null if not found
	 */
	public static Class getClassByName(Package basePackage, String localName) {
		// import the library
		Package library = UMLUtil.importLibrary(basePackage, RIMConstants.HL7_RIM_LIBRARY_URI);

		return UMLUtil.getClassByName(library, localName);
	}

	/**
	 * Search for the specified property within a RIM class.
	 * 
	 * @param basePackage
	 *            base package for the model in which library is imported
	 * @param className
	 *            RIM class name
	 * @param propertyName
	 *            RIM property name
	 * @return
	 */
	public static Property getRIMProperty(Package basePackage, String className, String propertyName) {
		Class rimClass = getClassByName(basePackage, className);
		if (rimClass != null) {
			return rimClass.getAttribute(propertyName, null);
		}
		return null;
	}

	/**
	 * Test if the given model attribute name is a RIM structural attribute.
	 * 
	 * @param name
	 *            attribute name
	 * @return true if given name is structural
	 */
	public static boolean isStructuralAttribute(String name) {
		return (IRIMProfileConstants.CLASS_CODE.equals(name) || IRIMProfileConstants.TYPE_CODE.equals(name) ||
				IRIMProfileConstants.MOOD_CODE.equals(name) || IRIMProfileConstants.DETERMINER_CODE.equals(name));
	}

}
