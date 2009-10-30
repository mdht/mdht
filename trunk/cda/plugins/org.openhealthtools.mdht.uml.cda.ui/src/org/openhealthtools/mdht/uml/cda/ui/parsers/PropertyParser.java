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
package org.openhealthtools.mdht.uml.cda.ui.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.cda.ui.internal.Activator;
import org.openhealthtools.mdht.uml.cda.ui.util.IHL7Appearance;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAPropertyUtil;

/**
 * Parser for editing and displaying properties.
 */
public class PropertyParser implements IParser {

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		return null;
	}

	public String getEditString(final IAdaptable element, int flags) {
		if (element instanceof EObjectAdapter) {
			final Property property = ((Property) ((EObjectAdapter) element)
					.getRealObject());
			return CDAPropertyUtil.getCustomLabel(property,
					IHL7Appearance.DEFAULT_UML_PROPERTY);
		}
		return "";
	}

	public ICommand getParseCommand(IAdaptable element, String newString,
			int flags) {
		return null;
	}

	public String getPrintString(IAdaptable element, int flags) {
		if (element instanceof EObjectAdapter) {
			Property property = ((Property) ((EObjectAdapter) element)
					.getRealObject());
			return CDAPropertyUtil.getCustomLabel(property,
					IHL7Appearance.DEFAULT_HL7_PROPERTY);
		}
		return null;
	}

	public boolean isAffectingEvent(Object event, int flags) {
		return true;
	}

	public IParserEditStatus isValidEditString(IAdaptable element,
			String editString) {

		return new ParserEditStatus(Activator.PLUGIN_ID,
				IParserEditStatus.ERROR, "Not Supported");
	}
}
