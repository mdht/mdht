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
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class PluginXMLUtil {
	public static final String CDA_EXTENSION_POINT = "org.openhealthtools.mdht.uml.cda.extension";

	public static final String CDA_ENTRY = "entry";

	private IFile pluginXML;

	public PluginXMLUtil(IFile pluginXML) {
		this.pluginXML = pluginXML;
	}

	/*
	 * <extension point="org.openhealthtools.mdht.uml.cda.extension">
	 * <entry
	 * eClass="MedicalDocument"
	 * id="1.3.6.1.4.1.19376.1.5.3.1.1.1"
	 * nsURI="http://www.openhealthtools.org/mdht/uml/cda/ccd/ihe"/>
	 * </extension>
	 */
	public void addTemplateExtension(String eClass, String templateId, String nsURI) {
		try {
			DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = null;
			if (pluginXML.exists()) {
				document = docBuilder.parse(pluginXML.getLocation().toFile());
			} else {
				// create a new file
				document = docBuilder.newDocument();
			}

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
			} else {
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

			// save the document
			save(document, pluginXML.getLocation());

		} catch (Exception e) {
			Logger.logException(e);
		}
	}

	/**
	 * Find CDA extension point, or add new element if not found.
	 * 
	 * @param document
	 * @return DOM element for CDA extension point
	 */
	private Element findCDAExtensionPoint(Document document) {
		Element extPoint = null;
		NodeList nodeList = document.getElementsByTagName("extension");
		for (int i = 0; i < nodeList.getLength(); i++) {
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
		for (int i = 0; i < nodeList.getLength(); i++) {
			if (nodeList.item(i) instanceof Element) {
				Element element = (Element) nodeList.item(i);
				if (eClass.equals(element.getAttribute("eClass"))) {
					entry = element;
				}
			}
		}

		return entry;
	}

	private void save(Document document, IPath filePath) {
		try {
			removeWhitespaceNodes(document);

			TransformerFactory factory = TransformerFactory.newInstance();
			factory.setAttribute("indent-number", new Integer(3));
			Transformer transformer = factory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

			FileOutputStream out = new FileOutputStream(filePath.toFile());
			transformer.transform(new DOMSource(document), new StreamResult(new OutputStreamWriter(out, "utf-8")));
			out.close();

			// refresh the workspace file
			pluginXML.getParent().refreshLocal(IResource.DEPTH_ONE, null);
		} catch (Exception e) {
			Logger.logException(e);
		}
	}

	/**
	 * Remove whitespace-only text nodes.
	 */
	private void removeWhitespaceNodes(Node node) {
		List<Node> removeList = new ArrayList<Node>();
		NodeList childNodes = node.getChildNodes();
		for (int i = 0; i < childNodes.getLength(); i++) {
			Node child = childNodes.item(i);
			if (child instanceof Text) {
				Text text = (Text) child;
				if (text.getData().trim().length() == 0) {
					removeList.add(child);
				}
			} else if (child.hasChildNodes()) {
				removeWhitespaceNodes(child);
			}
		}
		for (int i = 0; i < removeList.size(); i++) {
			Node n = removeList.get(i);
			Node p = n.getParentNode();
			if (p != null) {
				p.removeChild(n);
			}
		}
	}
}
