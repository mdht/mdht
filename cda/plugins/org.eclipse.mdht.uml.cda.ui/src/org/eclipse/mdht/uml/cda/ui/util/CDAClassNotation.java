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
package org.eclipse.mdht.uml.cda.ui.util;

import org.eclipse.mdht.uml.cda.core.util.CDAProfileUtil;
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.common.notation.ClassNotationUtil;
import org.eclipse.mdht.uml.common.notation.IUMLNotation;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Utility class to display HL7 CDA class string.
 */
public class CDAClassNotation extends ClassNotationUtil {

	/**
	 * Return the custom label of the class, given CDA specification and a custom style.
	 *
	 * @param style
	 *            the integer representing the style of the label
	 *
	 * @return the string corresponding to the label of the class
	 */
	public static String getCustomLabel(Class clazz, int style) {
		StringBuffer buffer = new StringBuffer();

		// visibility
		if ((style & IUMLNotation.DISP_VISIBILITY) != 0) {
			buffer.append(NamedElementUtil.getVisibilityAsSign(clazz));
		}

		// name
		if ((style & IUMLNotation.DISP_NAME) != 0) {
			buffer.append(" ");
			buffer.append(clazz.getName());
		}

		boolean showBrackets = buffer.length() > 0;

		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			boolean multiLine = ((style & IUMLNotation.DISP_MULTI_LINE) != 0);
			// class modifiers
			String modifiers = getModifiersAsString(clazz, multiLine);
			if (!modifiers.equals("")) {
				if (multiLine) {
					buffer.append("\n");
				}
				buffer.append(showBrackets
						? " {"
						: "");
				buffer.append(modifiers);
				buffer.append(showBrackets
						? "}"
						: "");
			}
		}

		String hl7Metadata = getHL7Metadata(clazz, style);
		if (hl7Metadata.length() > 0) {
			buffer.append(showBrackets
					? " {"
					: "");
			buffer.append(hl7Metadata);
			buffer.append(showBrackets
					? "}"
					: "");
		}

		return buffer.toString();
	}

	private static String getHL7Metadata(Class clazz, int style) {
		StringBuffer buffer = new StringBuffer();

		// templateId
		if ((style & IHL7Appearance.DISP_TEMPLATE_ID) != 0) {
			String templateId = getTemplateId(clazz);
			if (templateId != null && templateId.length() > 0) {
				if (buffer.length() > 0) {
					buffer.append(" ");
				}
				buffer.append(templateId);
			}
		}

		return buffer.toString();
	}

	private static String getTemplateId(Class clazz) {
		StringBuffer value = new StringBuffer();
		Stereotype cdaTemplate = CDAProfileUtil.getAppliedCDAStereotype(clazz, ICDAProfileConstants.CDA_TEMPLATE);

		try {
			if (cdaTemplate != null) {
				String templateId = (String) clazz.getValue(cdaTemplate, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);

				if (templateId != null) {
					value.append(templateId);
				}
			}
		} catch (IllegalArgumentException ex) {
			// ignore invalid property names
		}

		return value.toString();
	}

}
