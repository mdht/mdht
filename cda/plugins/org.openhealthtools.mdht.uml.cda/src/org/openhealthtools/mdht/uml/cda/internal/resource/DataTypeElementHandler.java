/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - refactored CDAResource, CDAUtil, CDARegistry on the new flexible XML resource (artf3367)
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.resource;

import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.openhealthtools.mdht.emf.runtime.resource.DOMElementHandler;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.w3c.dom.Element;

/**
 * Element handler for CDA elements of data-type type.
 */
public class DataTypeElementHandler implements DOMElementHandler {
	public DataTypeElementHandler() {
		super();
	}

	public boolean handleElement(Element element, Element root, XMLHelper helper) {
		if (element.hasAttributeNS(XMLResource.XSI_URI, "type")) {
			String type = element.getAttributeNS(XMLResource.XSI_URI, "type");
			if (type != null) {
				if (type.contains(":")) {
					type = type.substring(type.indexOf(":") + 1);
				}
				String nsPrefix = helper.getPrefix(DatatypesPackage.eNS_URI);
				if (helper.getPrefix(DatatypesPackage.eNS_URI) == null) {
					helper.addPrefix(nsPrefix, DatatypesPackage.eNS_URI);
					root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:" + nsPrefix, DatatypesPackage.eNS_URI);
				}
				element.setAttributeNS(XMLResource.XSI_URI, "xsi:type", nsPrefix + ":" + type);
			}
		}

		return false;
	}

}
