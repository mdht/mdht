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
package org.openhealthtools.mdht.uml.cda.ui.papyrus.providers;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;

/**
* This class provides custom edit parsers for HL7 class diagrams.
 * It applies only to models with the HDF profile applied and within Papyrus environment.
 * 
 * Similar extension in CDA 
 * 
 * 
 */
public class PapyrusCustomUMLParserProvider extends org.openhealthtools.mdht.uml.cda.ui.providers.CustomUMLParserProvider
{
	final static String PROPERTYVISUALID = "3012";
	
	protected IParser getParser(String visualID) {
	
		IParser parser = null;
		if (PROPERTYVISUALID.equals(visualID)) {
			parser = getCustomPropertyParser();
		}
		return parser;
	}
}