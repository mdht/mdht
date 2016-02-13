/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.util;

import java.util.Iterator;

import org.eclipse.mdht.uml.common.notation.IUMLNotation;
import org.eclipse.mdht.uml.term.ui.notation.TermPropertyNotation;
import org.eclipse.uml2.uml.Property;

/**
 * Utility class to display CDA property notation, simplified from default UML annotations.
 */
public class CDAPropertyNotation extends TermPropertyNotation {

	public static String getCustomLabel(Property property, int style) {
		StringBuffer buffer = new StringBuffer();

		boolean multiLine = ((style & IUMLNotation.DISP_MULTI_LINE) != 0);
		StringBuffer annotations = new StringBuffer();

		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			// property modifiers
			String modifiers = getModifiersAsString(property, multiLine);
			if (!modifiers.equals("")) {
				annotations.append(modifiers);
			}
		}

		String termMetadata = getTerminologyAnnotations(property, style);
		if (termMetadata.length() > 0) {
			if (annotations.length() > 0) {
				annotations.append(", ");
			}
			annotations.append(termMetadata);
		}

		if (annotations.length() > 0) {
			if (multiLine) {
				buffer.append("\n");
			}

			boolean showBrackets = buffer.length() > 0;
			buffer.append(showBrackets
					? " {"
					: "");
			buffer.append(annotations);
			buffer.append(showBrackets
					? "}"
					: "");
		}

		return buffer.toString().trim();
	}

	/**
	 * Returns the modifier of the property, separated by a comma.
	 *
	 * @param multiLine
	 *            boolean that indicates if the string should have several lines
	 *            when set to <code>true</code> or only one line when set to <code>false</code>.
	 *
	 * @return a string giving all modifiers for the property
	 */
	protected static String getModifiersAsString(Property property, boolean multiLine) {
		StringBuffer buffer = new StringBuffer();
		boolean needsComma = false;
		String NL = (multiLine)
				? "\n"
				: "";

		// Return property modifiers
		if (property.isReadOnly()) {
			buffer.append("readOnly");
			needsComma = true;
		}
		if (property.isOrdered()) {
			if (needsComma) {
				buffer.append(",");
				buffer.append(NL);
			}
			buffer.append("ordered");
			needsComma = true;
		}
		if (property.isUnique() && property.getUpper() > 1) {
			if (needsComma) {
				buffer.append(",");
				buffer.append(NL);
			}
			buffer.append("unique");
			needsComma = true;
		}

		// is the property redefining another property ?
		Iterator<org.eclipse.uml2.uml.Property> it;
		it = property.getRedefinedProperties().iterator();
		while (it.hasNext()) {
			org.eclipse.uml2.uml.Property redefinedProperty = it.next();
			// display only if redefined property has a different name (i.e., not "implicit")
			if (!redefinedProperty.eIsProxy() && !redefinedProperty.getName().equals(property.getName())) {
				if (needsComma) {
					buffer.append(", ");
					buffer.append(NL);
				}

				buffer.append("redefines ");
				buffer.append(redefinedProperty.getName());
				needsComma = true;
			}
		}

		// is the property subsetting another property ?
		it = property.getSubsettedProperties().iterator();
		while (it.hasNext()) {
			Property current = it.next();
			if (!current.eIsProxy()) {
				if (needsComma) {
					buffer.append(", ");
					buffer.append(NL);
				}
				buffer.append("subsets ");
				buffer.append(current.getName());
				needsComma = true;
			}
		}

		return buffer.toString();
	}
}
