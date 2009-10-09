/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ui.rsm.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

/**
 * This class provides custom edit parsers for HL7 class diagrams.
 * It applies only to models with the HDF profile applied within RSM environment.
 * 
 * 
 */
public class RSMCustomUMLParserProvider extends org.openhealthtools.mdht.uml.cda.ui.providers.CustomUMLParserProvider
{
	// RSM Visual Property ID for UML Properties is actually empty string ""
	final static String PROPERTYVISUALID = "";
	
	protected IParser getParser(String visualID) {
	
		IParser parser = null;
		if (PROPERTYVISUALID.equals(visualID)) {
			parser = getCustomPropertyParser();
		}
		return parser;
	}
}