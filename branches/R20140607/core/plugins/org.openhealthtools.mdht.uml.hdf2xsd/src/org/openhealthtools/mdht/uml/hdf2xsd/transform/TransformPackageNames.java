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
package org.openhealthtools.mdht.uml.hdf2xsd.transform;

import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLSwitch;

public class TransformPackageNames extends UMLSwitch {

	private XSDTransformerOptions transformerOptions;

	public TransformPackageNames(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	public Object casePackage(Package umlPackage) {
		// transform package names to XSD friendly, for use as complexType prefix
		umlPackage.setName(XSDTransformUtil.getValidXMLName(umlPackage.getName()));

		return umlPackage;
	}

}
