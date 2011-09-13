/*****************************************************************************
 * Copyright (c) 2006, 2011 CEA LIST, IBM Corporation, and others.
 *
 *    
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann TANGUY (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *  Kenn Hussey - added utilities to get, remove, and set "business name"
 *  
 *****************************************************************************/
package org.openhealthtools.mdht.uml.common.util;

import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Utility class for <code>org.eclipse.uml2.uml.NamedElement</code><BR>
 */
public class NamedElementUtil extends UMLUtil {

	public static final String QUALIFIED_NAME_SEPARATOR = "::";

	private final static String PUBLIC_STRING = "+";

	private final static String PROTECTED_STRING = "#";

	private final static String PRIVATE_STRING = "-";

	private final static String PACKAGE_STRING = "~";

	/**
	 * A helper method to calculate the max depth of an element
	 * 
	 * @param the
	 *            named element
	 * @return the maximum depth found in qualified name
	 */
	public static int getQualifiedNameMaxDepth(NamedElement namedElement) {
		int d = 0;
		String s = namedElement.getQualifiedName();
		if (s == null) {
			return 0;
		}
		int n = 0;
		while ((n = s.indexOf(QUALIFIED_NAME_SEPARATOR, n)) != -1) {
			n += 2;
			d++;
		}
		return d;
	}

	/**
	 * Give the visibility of the {@link NamedElement} as a string, as defined
	 * in the UML2 standard.
	 * 
	 * @return A String representing the visibility of the {@link NamedElement}.
	 *         Possible values:
	 *         <ul>
	 *         <li>public: <code>"+"</code>
	 *         <li>private: <code>"-"</code>
	 *         <li>protected: <code>"#"</code>
	 *         <li>package: <code>"~"</code>
	 *         </ul>
	 */
	public static String getVisibilityAsSign(NamedElement element) {
		String vKindValue = "";

		switch (element.getVisibility().getValue()) {
			case org.eclipse.uml2.uml.VisibilityKind.PUBLIC:
				vKindValue = PUBLIC_STRING;
				break;
			case org.eclipse.uml2.uml.VisibilityKind.PRIVATE:
				vKindValue = PRIVATE_STRING;
				break;
			case org.eclipse.uml2.uml.VisibilityKind.PACKAGE:
				vKindValue = PACKAGE_STRING;
				break;
			case org.eclipse.uml2.uml.VisibilityKind.PROTECTED:
				vKindValue = PROTECTED_STRING;
				break;
		}
		return vKindValue;
	}

	/**
	 * Returns a (model) properties file key for the specified named element.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @return A propert key for the named element.
	 */
	public static String getPropertyKey(NamedElement namedElement) {
		String qualifiedName = namedElement.getQualifiedName();
		return "_label_" + UML2Util.getValidJavaIdentifier(UML2Util.isEmpty(qualifiedName)
				? UML2Util.EMPTY_STRING
				: qualifiedName.replace(':', '_'));
	}

	/**
	 * Returns the "business name" for the specified named element, or the name
	 * if none exists. The "business name" of a named element corresponds to the
	 * (potentially localized) label that is stored in a properties file and
	 * returned for the element by {@link NamedElement#getLabel()}.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @return The "business name" for the element (if one exists); otherwise,
	 *         the name of the element.
	 */
	public static String getBusinessName(NamedElement namedElement) {
		String properties = readProperties(getPropertiesURI(namedElement.eResource()));

		if (properties != null) {
			String property = parseProperties(properties).get(getPropertyKey(namedElement));

			if (property != null) {
				int index = property.indexOf('=');

				if (index > 0) {
					return property.substring(index + 1).trim();
				}
			}
		}

		return namedElement.getName();
	}

	/**
	 * Removes the "business name" that is currently set for the specified named
	 * element, if any.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @return The "business name" that was set for the element (if one
	 *         existed); otherwise <code>null</code>.
	 */
	public static String removeBusinessName(NamedElement namedElement) {
		URI uri = getPropertiesURI(namedElement.eResource());
		String properties = readProperties(uri);

		if (properties != null) {
			Map<String, String> parsedProperties = parseProperties(properties);
			String property = parsedProperties.remove(getPropertyKey(namedElement));

			if (property != null && writeProperties(uri, parsedProperties)) {
				int index = property.indexOf('=');

				if (index > 0) {
					return property.substring(index + 1).trim();
				}
			}
		}

		return null;
	}

	/**
	 * Sets the "business name" for the specified named element to the given
	 * string.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @param businessName
	 *            The new "business name" for the element.
	 * @return Whether the "business name" was successfully set.
	 */
	public static boolean setBusinessName(NamedElement namedElement, String businessName) {
		URI uri = getPropertiesURI(namedElement.eResource());
		String properties = readProperties(uri);
		Map<String, String> parsedProperties = properties != null
				? parseProperties(properties)
				: new LinkedHashMap<String, String>();
		String key = getPropertyKey(namedElement);
		String property = parsedProperties.get(key);
		int index = property != null
				? property.indexOf('=')
				: -1;
		parsedProperties.put(key, (index != -1 && property.indexOf('#') != -1
				? "#"
				: "") + key + " = " + businessName + System.getProperty("line.separator"));
		return writeProperties(uri, parsedProperties);
	}

}
