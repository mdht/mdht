/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.resource.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.emf.ecore.xmi.impl.XMLHandler;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResource;

/**
 * Custom {@link XMLHandler} for the {@link FleXMLResource} implementation.
 */
public class FleXMLHandler extends SAXXMLHandler {

	public FleXMLHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
		super(xmiResource, helper, options);
	}

	// just need to make the inherited method accessible to other classes in the package
	@Override
	protected EPackage getPackageForURI(String uriString) {
		return super.getPackageForURI(uriString);
	}
}
