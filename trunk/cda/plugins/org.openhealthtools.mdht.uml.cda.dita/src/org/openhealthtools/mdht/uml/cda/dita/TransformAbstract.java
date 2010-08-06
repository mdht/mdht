/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added template parameter
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.dita;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.util.UMLSwitch;

/**
 * Abstract base class for model transformations.
 */
public abstract class TransformAbstract extends UMLSwitch<Object> {
	
	public static final String LF = System.getProperty("line.separator");
	
	protected DitaTransformerOptions transformerOptions;

	public TransformAbstract(DitaTransformerOptions options) {
		transformerOptions = options;
	}
	
	protected void removeModelElement(Element element) {
		if (!isRemoved(element)) {
			transformerOptions.getDeletedElementList().add(element);
		}
	}
	
	protected boolean isRemoved(Element element) {
		return transformerOptions.getDeletedElementList().contains(element);
	}

	protected String validFileName(String fileName) {
		StringBuffer validName = new StringBuffer();
		for (int i=0; i<fileName.length(); i++) {
			if (fileName.charAt(i) == '/')
				validName.append(" ");
			else if (fileName.charAt(i) == '\\')
				validName.append(" ");
			else if (fileName.charAt(i) == '?')
				validName.append("");
			else
				validName.append(fileName.charAt(i));
		}
		
		return validName.toString();
	}

	protected String fixNonXMLCharacters(String text) {
		if (text == null) {
			return null;
		}
		
		StringBuffer newText = new StringBuffer();
		for (int i=0; i<text.length(); i++) {
			if (text.charAt(i) == '“')
				newText.append("\"");
			else if (text.charAt(i) == '”')
				newText.append("\"");
			else if (text.charAt(i) == '‘')
				newText.append("'");
			else if (text.charAt(i) == '’')
				newText.append("'");
			else if (text.charAt(i) == '<')
				newText.append("&lt;");
			else if (text.charAt(i) == '>')
				newText.append("&gt;");
			else if (text.charAt(i) == '&')
				newText.append("&amp;");
			else if (text.charAt(i) == '"')
				newText.append(" ");
			else
				newText.append(text.charAt(i));
		}
		
		return newText.toString();
	}

}
