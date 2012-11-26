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

import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.openhealthtools.mdht.emf.runtime.resource.DOMElementHandler;
import org.w3c.dom.Element;

/**
 * Element handler for CDA parts.
 */
public class PartElementHandler implements DOMElementHandler {
	private Map<String, String> partTypes = initPartTypes();

	public PartElementHandler() {
		super();
	}

	private static Map<String, String> initPartTypes() {
		Map<String, String> result = new java.util.HashMap<String, String>();

		// address part types
		result.put("delimiter", "DEL");
		result.put("country", "CNT");
		result.put("state", "STA");
		result.put("county", "CPA");
		result.put("city", "CTY");
		result.put("postalCode", "ZIP");
		result.put("streetAddressLine", "SAL");
		result.put("houseNumber", "BNR");
		result.put("houseNumberNumeric", "BNN");
		result.put("direction", "DIR");
		result.put("streetName", "STR");
		result.put("streetNameBase", "STB");
		result.put("streetNameType", "STTYP");
		result.put("additionalLocator", "ADL");
		result.put("unitID", "UNID");
		result.put("unitType", "UNIT");
		result.put("careOf", "CAR");
		result.put("censusTract", "CEN");
		result.put("deliveryAddressLine", "DAL");
		result.put("deliveryInstallationType", "DINST");
		result.put("deliveryInstallationArea", "DINSTA");
		result.put("deliveryInstallationQualifier", "DINSTQ");
		result.put("deliveryMode", "DMOD");
		result.put("deliveryModeIdentifier", "DMODID");
		result.put("buildingNumberSuffix", "BNS");
		result.put("postBox", "POB");
		result.put("precinct", "PRE");

		// entity name part types
		result.put("delimiter", "DEL");
		result.put("family", "FAM");
		result.put("given", "GIV");
		result.put("prefix", "PFX");
		result.put("suffix", "SFX");

		return result;
	}

	public boolean handleElement(Element element, Element root, XMLHelper helper) {
		String partType = partTypes.get(element.getLocalName());
		if (partType != null) {
			element.setAttributeNS(null, "partType", partType);
		}

		return false;
	}

}
