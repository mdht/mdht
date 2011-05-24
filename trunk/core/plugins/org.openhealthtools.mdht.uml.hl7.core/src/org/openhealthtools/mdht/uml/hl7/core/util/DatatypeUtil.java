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

import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

/**
 * 
 * @version $Id: $
 */
public class DatatypeUtil {

	/**
	 * @param element
	 * @return true if element is contained in abstract data types resource.
	 */
	public static boolean isAbstractDatatype(Element element) {
		// the resource is null for error conditions where proxy is not resolved
		if (element == null || element.eResource() == null) {
			return false;
		}

		URI uri = element.eResource().getURI();
		return DatatypeConstants.HL7_DATATYPES_1_0_LIBRARY_URI.equals(uri.toString()) ||
				DatatypeConstants.HL7_DATATYPES_2_0_LIBRARY_URI.equals(uri.toString());
	}

	/**
	 * Search all nested packages in the datatypes library for the given classifier name.
	 * This search does not consider qualified names, but only looks for a matching
	 * local classifer name.
	 * 
	 * @param basePackage
	 *            base package for the model in which library is imported
	 * @param localName
	 * @return a Classifier, or null if not found
	 */
	public static Classifier getDatatypeByName(Package basePackage, final String localName) {
		// import the library
		Package library = UMLUtil.importLibrary(basePackage, DatatypeConstants.HL7_DATATYPES_1_0_LIBRARY_URI);

		return UMLUtil.getClassifierByName(library, localName);
	}

}
