/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - flexible XML resource implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.resource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.w3c.dom.Element;

/**
 * A {@link DOMElementHandler} that updates the <tt>xsi:type</tt> of an element.
 */
public class XSITypeHandler implements DOMElementHandler {
	private final EPackage epackage;

	public XSITypeHandler(EPackage epackage) {
		this.epackage = epackage;
	}

	public boolean handleElement(Element element, Element root, XMLHelper helper) {
		XSITypeProvider provider = getXSITypeProviderRegistry(helper).getXSITypeProvider(epackage);
		EClass eclass = (provider == null)
				? null
				: provider.getXSIType(element);

		if (eclass != null) {
			if (helper.getPrefix(XMLResource.XSI_URI) == null) {
				helper.addPrefix("xsi", XMLResource.XSI_URI);
				root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:xsi", XMLResource.XSI_URI);
			}

			EPackage ePackage = eclass.getEPackage();
			String nsURI = ePackage.getNsURI();
			String nsPrefix = helper.getPrefix(nsURI);

			if (helper.getPrefix(nsURI) == null) {
				helper.addPrefix(nsPrefix, nsURI);
				root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:" + nsPrefix, nsURI);
			}

			element.setAttributeNS(XMLResource.XSI_URI, "xsi:type", nsPrefix + ":" + helper.getName(eclass));
		}

		return false;
	}

	private XSITypeProvider.Registry getXSITypeProviderRegistry(XMLHelper helper) {
		XSITypeProvider.Registry result = null;

		ResourceSet rset = helper.getResource().getResourceSet();
		if (rset instanceof FleXMLResourceSet) {
			result = ((FleXMLResourceSet) rset).getXSITypeProviderRegistry();
		}

		return (result != null)
				? result
				: XSITypeProvider.Registry.INSTANCE;
	}
}
