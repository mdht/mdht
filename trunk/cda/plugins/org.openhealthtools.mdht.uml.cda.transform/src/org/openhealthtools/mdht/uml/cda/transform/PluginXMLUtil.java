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
package org.openhealthtools.mdht.uml.cda.transform;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class PluginXMLUtil {
	public static final String CDA_EXTENSION_POINT = "org.openhealthtools.mdht.uml.cda.extension";
	public static final String CDA_ENTRY = "entry";
	
	private IFile pluginXML;
	
	public PluginXMLUtil(IFile pluginXML) {
		this.pluginXML = pluginXML;
	}

	/*
   <extension point="org.openhealthtools.mdht.uml.cda.extension">
      <entry
            eClass="MedicalDocument"
            id="1.3.6.1.4.1.19376.1.5.3.1.1.1"
            nsURI="http://www.openhealthtools.org/mdht/uml/cda/ccd/ihe"/>
   </extension>
	 */
	public void addTemplateExtension(String eClass, String templateId, String nsURI) {
		if (pluginXML == null || !pluginXML.exists()) {
			// create a new file
			
		}
		
		try {
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = docBuilder.parse(pluginXML.getLocation().toFile());
			
			Element plugin = document.getDocumentElement();
			if (plugin == null) {
				plugin = document.createElement("plugin");
				document.appendChild(plugin);
			}
			if (!"plugin".equals(plugin.getNodeName())) {
				throw new IllegalArgumentException("File is not valid plugin.xml: " + pluginXML.getFullPath());
			}
			
			// find CDA extenion point element in DOM
			Element cdaExtensionPoint = findCDAExtensionPoint(document);
	
			// add entry to existing extension point, if it exists
			// don't duplicate tempateId entry, modify if different
			Element entry = findEntry(document, cdaExtensionPoint, eClass);
			if (entry == null) {
				entry = document.createElement("entry");
				cdaExtensionPoint.appendChild(entry);
				entry.setAttribute("eClass", eClass);
				entry.setAttribute("id", templateId);
				entry.setAttribute("nsURI", nsURI);
			}
			else {
				if (!templateId.equals(entry.getAttribute("id"))) {
					// update the templateiId
					entry.setAttribute("id", templateId);
					System.out.println(eClass + ": Change template Id to: " + templateId);
				}
				if (!nsURI.equals(entry.getAttribute("nsURI"))) {
					// update the nsURI
					entry.setAttribute("nsURI", nsURI);
					System.out.println(eClass + ": Change nsURI to: " + nsURI);
				}
			}
			
			//save the document
			save(document, pluginXML.getLocation());
		
		}
		catch (Exception e) {
			Logger.logException(e);
		}
	}
	
	/**
	 * Find CDA extension point, or add new element if not found.
	 * @param document
	 * @return DOM element for CDA extension point
	 */
	private Element findCDAExtensionPoint(Document document) {
		Element extPoint = null;
		NodeList nodeList = document.getElementsByTagName("extension");
		for (int i=0; i<nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element element = (Element) nodeList.item(i);
				if (CDA_EXTENSION_POINT.equals(element.getAttribute("point"))) {
					extPoint = element;
				}
			}
		}
		
		if (extPoint == null) {
			extPoint = document.createElement("extension");
			extPoint.setAttribute("point", CDA_EXTENSION_POINT);
			document.getDocumentElement().appendChild(extPoint);
		}
		
		return extPoint;
	}
	
	private Element findEntry(Document document, Element extPoint, String eClass) {
		Element entry = null;
		NodeList nodeList = extPoint.getElementsByTagName("entry");
		for (int i=0; i<nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element element = (Element) nodeList.item(i);
				if (eClass.equals(element.getAttribute("eClass"))) {
					entry = element;
				}
			}
		}
		
		return entry;
	}
	
	private void save(Document doc, IPath filePath) {
		try {
			Transformer serializer = TransformerFactory.newInstance().newTransformer();
            serializer.setOutputProperty(OutputKeys.INDENT, "yes");
            serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");

            serializer.transform(new DOMSource(doc), new StreamResult(
					new FileOutputStream(filePath.toFile())));
		}
		catch (Exception e) {
			Logger.logException(e);
		}
	}
	
}
