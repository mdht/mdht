/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.internal.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.openhealthtools.mdht.uml.cda.internal.registry.CDARegistry;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

public class CDALoadImpl extends XMLLoadImpl {
	private Map<String, String> partTypes = new HashMap<String, String>();
	private Map<String, String> nsPrefixMap = new HashMap<String, String>();
	private int nsPrefixIndex = 0;
	
	public CDALoadImpl(XMLHelper helper) {
		super(helper);
		populatePartTypes();
	}
	
	private void populatePartTypes() {
		// address part types
		partTypes.put("delimiter", "DEL");
		partTypes.put("country", "CNT");
		partTypes.put("state", "STA");
		partTypes.put("county", "CPA");
		partTypes.put("city", "CTY");
		partTypes.put("postalCode", "ZIP");
		partTypes.put("streetAddressLine", "SAL");
		partTypes.put("houseNumber", "BNR");
		partTypes.put("houseNumberNumeric", "BNN");
		partTypes.put("direction", "DIR");
		partTypes.put("streetName", "STR");
		partTypes.put("streetNameBase", "STB");
		partTypes.put("streetNameType", "STTYP");
		partTypes.put("additionalLocator", "ADL");
		partTypes.put("unitID", "UNID");
		partTypes.put("unitType", "UNIT");
		partTypes.put("careOf", "CAR");
		partTypes.put("censusTract", "CEN");
		partTypes.put("deliveryAddressLine", "DAL");
		partTypes.put("deliveryInstallationType", "DINST");
		partTypes.put("deliveryInstallationArea", "DINSTA");
		partTypes.put("deliveryInstallationQualifier", "DINSTQ");
		partTypes.put("deliveryMode", "DMOD");
		partTypes.put("deliveryModeIdentifier", "DMODID");
		partTypes.put("buildingNumberSuffix", "BNS");
		partTypes.put("postBox", "POB");
		partTypes.put("precinct", "PRE");

		// entity name part types
		partTypes.put("delimiter", "DEL");
		partTypes.put("family", "FAM");
		partTypes.put("given", "GIV");
		partTypes.put("prefix", "PFX");
		partTypes.put("suffix", "SFX");
	}

	private String getNsPrefix(String namespaceURI) {
		String prefix = nsPrefixMap.get(namespaceURI);
		if (prefix == null) {
			prefix = "ns" + nsPrefixIndex;
			nsPrefixMap.put(namespaceURI, prefix);
			nsPrefixIndex++;
		}
		return prefix;
	}
	
	@Override
	protected void traverse(Node node, XMLLoadImpl.AttributesProxy attributesProxy, DefaultHandler handler, LexicalHandler lexicalHandler) throws SAXException {
		processNode(node);
		super.traverse(node, attributesProxy, handler, lexicalHandler);
	}

	@Override
	protected void traverseElement(Element element, XMLLoadImpl.AttributesProxy attributesProxy, DefaultHandler handler, LexicalHandler lexicalHandler) throws SAXException {
		processNode(element);
		super.traverseElement(element, attributesProxy, handler, lexicalHandler);
	}

	private void processNode(Node node) {
		if (node instanceof Element) {
			Element element = (Element) node;
			Element root = element.getOwnerDocument().getDocumentElement();
			handlePartType(element);
			handleDataType(element, root);
			handleTemplate(element, root);
		}
	}
	
	private void handlePartType(Element element) {
		String partType = partTypes.get(element.getLocalName());
		if (partType != null) {
			element.setAttribute("partType", partType);
		}
	}
	
	private void handleDataType(Element element, Element root) {
		if (element.hasAttributeNS(XMLResource.XSI_URI, "type")) {
			String type = element.getAttributeNS(XMLResource.XSI_URI, "type");
			if (type != null && !type.contains(":")) {
				String nsPrefix = getNsPrefix(DatatypesPackage.eNS_URI);
				if (helper.getPrefix(DatatypesPackage.eNS_URI) == null) {
					helper.addPrefix(nsPrefix, DatatypesPackage.eNS_URI);
					root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:" + nsPrefix, DatatypesPackage.eNS_URI);
				}
				element.setAttributeNS(XMLResource.XSI_URI, "xsi:type", nsPrefix + ":" + type);
			}
		}
	}
	
	private void handleTemplate(Element element, Element root) {
		EClass result = null;
		int last = 0;
		NodeList nodeList = element.getChildNodes();
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element e = (Element) nodeList.item(i);
				if (e.getLocalName().equals("templateId")) {
					EClass eClass = CDARegistry.INSTANCE.getEClass(e.getAttribute("root"));
					if (eClass != null && eClass.getEAllSuperTypes().size() > last) {
						result = eClass;
						last = eClass.getEAllSuperTypes().size();
					}
				}
			}
		}
		
		if (result != null) {
			if (helper.getPrefix(XMLResource.XSI_URI) == null) {
				helper.addPrefix("xsi", XMLResource.XSI_URI);
				root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:xsi", XMLResource.XSI_URI);
			}
			
			EPackage ePackage = result.getEPackage();
			String nsURI = ePackage.getNsURI();
			String nsPrefix = getNsPrefix(nsURI);
			
			if (helper.getPrefix(nsURI) == null) {
				helper.addPrefix(nsPrefix, nsURI);
				root.setAttributeNS(ExtendedMetaData.XMLNS_URI, "xmlns:" + nsPrefix, nsURI);
			}
			
			element.setAttributeNS(XMLResource.XSI_URI, "xsi:type", nsPrefix + ":" + getName(result));
		}
	}
	
	private String getName(EClass eClass) {
		String result = EcoreUtil.getAnnotation(eClass, ExtendedMetaData.ANNOTATION_URI, "name");
		if (result != null) {
			return result;
		}
		return eClass.getName();
	}
}
