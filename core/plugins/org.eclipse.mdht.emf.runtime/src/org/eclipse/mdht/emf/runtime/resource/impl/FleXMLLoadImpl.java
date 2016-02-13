/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - flexible XML resource implementation (artf3367)
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.resource.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.eclipse.mdht.emf.runtime.internal.Logger;
import org.eclipse.mdht.emf.runtime.resource.DOMDocumentHandler;
import org.eclipse.mdht.emf.runtime.resource.DOMElementHandler;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResource;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResourceSet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

public class FleXMLLoadImpl extends XMLLoadImpl {
	private DOMElementHandler.Registry elementHandlerRegistry;

	public FleXMLLoadImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new FleXMLHandler(resource, helper, options);
	}

	@Override
	public void load(XMLResource resource, InputStream inputStream, Map<?, ?> options) throws IOException {
		try {
			load(resource, newDocumentBuilder().parse(inputStream), options);
		} catch (SAXException e) {
			// throw new IOException("Failed to create DOM.", e);
			throw new Resource.IOWrappedException(e);
		}
	}

	@Override
	public void load(XMLResource resource, InputSource inputSource, Map<?, ?> options) throws IOException {
		try {
			load(resource, newDocumentBuilder().parse(inputSource), options);
		} catch (SAXException e) {
			// throw new IOException("Failed to create DOM.", e);
			throw new Resource.IOWrappedException(e);
		}
	}

	@Override
	public void load(XMLResource resource, Node node, Map<?, ?> options) throws IOException {
		Document doc = null;
		DOMDocumentHandler docHandler = (DOMDocumentHandler) options.get(FleXMLResource.OPTION_DOM_DOCUMENT_HANDLER);

		if (docHandler != null) {
			// try to give it a document
			doc = (node instanceof Document)
					? (Document) node
					: node.getOwnerDocument();

			if (doc != null) {
				try {
					docHandler.aboutToLoadDOM(doc);
				} catch (Exception e) {
					Logger.logException("Uncaught exception in pre-load DOM document handler.", e);
				}
			}
		}

		super.load(resource, node, options);

		if ((doc != null) && (docHandler != null)) {
			try {
				docHandler.afterDOMLoaded(doc);
			} catch (Exception e) {
				Logger.logException("Uncaught exception in post-load DOM document handler.", e);
			}
		}
	}

	private static DocumentBuilder newDocumentBuilder() throws IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		try {
			return factory.newDocumentBuilder();
		} catch (Exception e) {
			// throw new IOException("Failed to create XML document builder.", e);
			throw new Resource.IOWrappedException(e);
		}
	}

	@Override
	protected void traverse(Node node, XMLLoadImpl.AttributesProxy attributesProxy, DefaultHandler handler,
			LexicalHandler lexicalHandler) throws SAXException {

		processNode(node, handler);
		super.traverse(node, attributesProxy, handler, lexicalHandler);
	}

	@Override
	protected void traverseElement(Element element, XMLLoadImpl.AttributesProxy attributesProxy, DefaultHandler handler,
			LexicalHandler lexicalHandler) throws SAXException {

		processNode(element, handler);
		super.traverseElement(element, attributesProxy, handler, lexicalHandler);
	}

	private void processNode(Node node, DefaultHandler handler) {
		if (node instanceof Element) {
			FleXMLHandler flexHandler = (FleXMLHandler) handler;
			Element element = (Element) node;
			Element root = element.getOwnerDocument().getDocumentElement();

			String namespaceURI = element.getNamespaceURI();
			EPackage epackage = (namespaceURI == null)
					? helper.getNoNamespacePackage()
					: flexHandler.getPackageForURI(namespaceURI);

			if (epackage != null) {
				for (DOMElementHandler next : getElementHandlers(epackage)) {
					if (next.handleElement(element, root, helper)) {
						break;
					}
				}
			}
		}
	}

	private Iterable<DOMElementHandler> getElementHandlers(EPackage epackage) {
		if (elementHandlerRegistry == null) {
			if (resource.getResourceSet() instanceof FleXMLResourceSet) {
				elementHandlerRegistry = ((FleXMLResourceSet) resource.getResourceSet()).getDOMElementHandlerRegistry();
			}

			if (elementHandlerRegistry == null) {
				elementHandlerRegistry = DOMElementHandler.Registry.INSTANCE;
			}
		}

		return elementHandlerRegistry.getHandlers(epackage);
	}

	@Override
	protected void handleErrors() throws IOException {
		if (!resource.getErrors().isEmpty()) {
			Resource.Diagnostic error = resource.getErrors().get(0);
			if (error instanceof Exception) {
				if (shouldThrow((Exception) error)) {
					throw new Resource.IOWrappedException((Exception) error);
				}
			} else {
				throw new IOException(error.getMessage());
			}
		}
	}

	protected boolean shouldThrow(Exception exception) {
		return true;
	}
}
