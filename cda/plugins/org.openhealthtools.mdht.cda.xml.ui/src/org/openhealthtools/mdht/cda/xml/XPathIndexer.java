/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.cda.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 * XPathIndexer creates and index of line and column number of all ellements
 * within an XML document as supplied by the SAX Locator. The locator is not
 * 100% accurate regarding values but this is currently only used to approximate
 * mark locations as part of the CDA validation within the eclipse Validator2
 * framework.
 * 
 * @author Sean Muir (JKM Software)
 * 
 */
public class XPathIndexer implements ContentHandler {
	
	/**
	 * ElementEntry is used to maintain a bottom up stack of elements found within the CDA document.
	 *
	 */
	static private class ElementEntry {
		
		final String elementName;
		
		final int elementIndex;
		
		final ElementEntry elementParent;

		ElementEntry(String elementName, int elementIndex, ElementEntry next) {
			
			this.elementName = elementName;
			
			this.elementIndex = elementIndex;
			
			this.elementParent = next;
		}
	};

	/**
	 * ElementLocationData is used to cache the location of each element
	 *
	 */
	public static class ElementLocationData {
		public ElementLocationData(int line, int column) {
			super();
			this.line = line;
			this.column = column;
		}

		public int line;
		public int column;
	};

	private ElementEntry currentXMLElement = null;
	
	/*
	 * ELementIndexes Structure supports [Parent][Element][Location*]
	 * Where
	 * Parent is the xpath to elements location
	 * Element is the element name
	 * Location* is sequential array for location for the named element
	 * 
	 * It is designed to support an incremental count approach of elements so
	 * <Root>
	 *       <Parent>
	 *           <Element />
	 *           <Element />
	 *           <Element />
	 *       </Parent>
	 * </Root>
	 * 
	 * would have one Parent index pointing to a hashmap
	 * in that hash map you have Element index pointing to an array
	 * in the array you would have 3 sequential locations, one for each element found
	 * 
	 * 
	 * The structure and indexElement track element instances to supply running total of element document indexes 
	 * 
	 */
	public HashMap<String, HashMap<String, ArrayList<Locator>>> elementIndexes = new HashMap<String, HashMap<String, ArrayList<Locator>>>();
	
	/*
	 * xpathLocations is a map between xpath and corresponding xml location
	 */
	public HashMap<String, ElementLocationData> xpathLocations = new HashMap<String, ElementLocationData>();
	
	
	/*
	 * SAX Locator
	 */
	Locator locator = null;

	/*
	 * Populates elementIndexes based on parent and element
	 */
	private int indexElement(String parent, String element) {
		
		// if new parent, create index
		if (!elementIndexes.containsKey(parent)) {
			elementIndexes.put(parent, new HashMap<String, ArrayList<Locator>>());
		}
		
		// if new element for parent, create index
		if (!elementIndexes.get(parent).containsKey(element)) {
			elementIndexes.get(parent).put(element, new ArrayList<Locator>());
		}
		
		// add sequential location based on SAX location
		elementIndexes.get(parent).get(element).add(locator);
		
		// return index count - used in ElementEntry to recreate xpath
		return elementIndexes.get(parent).get(element).size();
	}

	public void setDocumentLocator(Locator locator) {
		this.locator = locator;
	}

	public void startDocument() throws SAXException {
	}

	public void endDocument() throws SAXException {
	}

	public void characters(char[] text, int start, int length) throws SAXException {
	}

	public void ignorableWhitespace(char[] text, int start, int length) throws SAXException {
	}

	public void processingInstruction(String target, String data) throws SAXException {
	}

	

	public void startElement(String namespace, String local, String name, Attributes attrs) throws SAXException {
		
		int index = indexElement(getXPathFromEntry(currentXMLElement), name);
		
		currentXMLElement = new ElementEntry(name, index, currentXMLElement);
		
		xpathLocations.put(getXPathFromEntry(currentXMLElement).toUpperCase(), new ElementLocationData(locator.getLineNumber(), locator.getColumnNumber()));
	}

	private String getXPathFromEntry(ElementEntry elementEntry) {
		
		Stack<String> path = new Stack<String>();
		
		while (elementEntry != null) {
		
			path.push("/" + elementEntry.elementName + "[" + elementEntry.elementIndex + "]");
			
			elementEntry = elementEntry.elementParent;
		}
		
		String result = "";
		
		while (!path.isEmpty()) {
			result += path.pop();
		}
		
		return result;
	}

	public void endElement(String namespace, String local, String name) throws SAXException {
		currentXMLElement = currentXMLElement.elementParent;
	}

	public void startPrefixMapping(String prefix, String uri) throws SAXException {
	}

	public void endPrefixMapping(String prefix) throws SAXException {
	}

	public void skippedEntity(String name) throws SAXException {
	}

	/**
	 * getElementLocationByPath
	 * Returns ElementLocationData - 
	 * Convert xpath to all upper case to avoid some subtle differences in EMF validation and actual xml content
	 * 
	 */
	public ElementLocationData getElementLocationByPath(String xpath) {
		
		ElementLocationData elementLocationData = null;
		
		String upperXPath = xpath.toUpperCase();
		
		if (xpathLocations.containsKey(upperXPath )) {
			elementLocationData = xpathLocations.get(upperXPath);
		}
		return elementLocationData;
	}

}
