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
package org.eclipse.mdht.uml.common.notation;

import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.uml2.uml.Class;

/**
 * Utility class for <code>org.eclipse.uml2.uml.Class</code><BR>
 */
public class ClassNotationUtil {

	/**
	 * return the full label of the class, given UML2 specification.
	 *
	 * @return the string corresponding to the label of the class
	 */
	public static String getLabel(Class clazz) {
		StringBuffer buffer = new StringBuffer();

		// name
		buffer.append(" ");
		buffer.append(clazz.getName());

		// property modifiers
		String modifiers = getModifiersAsString(clazz, false);
		if (!modifiers.equals("")) {
			buffer.append(" {");
			buffer.append(modifiers);
			buffer.append("}");
		}
		return buffer.toString();
	}

	/**
	 * Return the custom label of the class, given UML2 specification and a custom style.
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

		return buffer.toString();
	}

	/**
	 * Returns the modifier of the class, separated by a comma, as as single
	 * line if <code>multiline</code> is <code>false</code> or as a multiline
	 * string if <code>multiline</code> is <code>false</code>.
	 *
	 * @param multiLine
	 *            boolean that indicates if the string should have several lines
	 *            when set to <code>true</code> or only one line when set to <code>false</code>.
	 *
	 * @return a string giving all modifiers for the class
	 */
	protected static String getModifiersAsString(Class clazz, boolean multiLine) {
		StringBuffer buffer = new StringBuffer();
		boolean needsComma = false;

		if (clazz.isAbstract()) {
			buffer.append("abstract");
			needsComma = true;
		}
		if (clazz.isLeaf()) {
			if (needsComma) {
				buffer.append(",");
			}
			buffer.append("leaf");
			needsComma = true;
		}
		if (clazz.isActive()) {
			if (needsComma) {
				buffer.append(",");
			}
			buffer.append("active");
			needsComma = true;
		}

		return buffer.toString();
	}
}
