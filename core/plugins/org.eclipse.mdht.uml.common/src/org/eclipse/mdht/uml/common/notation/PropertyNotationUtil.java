/*****************************************************************************
 * Copyright (c) 2009 CEA LIST and others.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann TANGUY (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *  David Carlson (XMLmodeling.com) - modified from Eclipse Papyrus source
 *
 *****************************************************************************/
package org.eclipse.mdht.uml.common.notation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.mdht.uml.common.util.MultiplicityElementUtil;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * Utility class for <code>org.eclipse.uml2.uml.Property</code><BR>
 */
public class PropertyNotationUtil {

	public final static String UNDEFINED_TYPE_NAME = "<Undefined>";

	/**
	 * Get all properties that can be subset by this {@link Property} checks the
	 * type and the multiplicity.
	 *
	 * @return all properties that can be subset
	 */
	public static List<Property> getSubsettablesProperties(Property property) {
		List<Property> list = new ArrayList<Property>();

		// subset properties:
		Iterator<NamedElement> it = property.getClass_().getMembers().iterator();
		while (it.hasNext()) {

			NamedElement element = it.next();
			if (element instanceof Property) {
				boolean isValid = true;
				Property subsettableProperty = (Property) element;

				// check it is not itself....
				if (subsettableProperty.equals(property)) {
					isValid = false;
				}

				// check types conformity
				if (property.getType() != null && subsettableProperty.getType() != null) {
					if (!property.getType().conformsTo(subsettableProperty.getType())) {
						isValid = false;
					}
				} else {
					isValid = false;
				}

				// check multiplicity (only upper bound has an OCL rule)
				if ((subsettableProperty.getUpper() != -1) && (property.getUpper() > subsettableProperty.getUpper())) {
					isValid = false;
				}

				if (isValid) {
					list.add(subsettableProperty);
				}
			}
		}
		return list;
	}

	/**
	 * Get all properties that can be redefined by this {@link Property}.
	 *
	 * @return all properties that can be redefined
	 */
	public static List<Property> getRedefinableProperties(Property property) {
		List<Property> list = new ArrayList<Property>();

		// redefine-able properties:
		Iterator<NamedElement> it = property.getClass_().getMembers().iterator();
		while (it.hasNext()) {
			NamedElement element = it.next();
			if (element instanceof Property) {
				Property redefinableProperty = (Property) element;
				if (!redefinableProperty.equals(property)) {
					list.add(redefinableProperty);
				}
			}
		}

		return list;
	}

	/**
	 * return the full label of the property, given UML2 specification.
	 *
	 * @return the string corresponding to the label of the property
	 */
	public static String getLabel(Property property) {
		StringBuffer buffer = new StringBuffer();
		// visibility
		buffer.append(" ");
		buffer.append(NamedElementUtil.getVisibilityAsSign(property));

		// derived property
		if (property.isDerived()) {
			buffer.append("/");
		}

		// name
		buffer.append(" ");
		buffer.append(property.getName());

		// type
		if (property.getType() != null) {
			buffer.append(": " + property.getType().getName());
		} else {
			buffer.append(": " + UNDEFINED_TYPE_NAME);
		}

		// multiplicity -> do not display [1]
		String multiplicity = MultiplicityElementUtil.getMultiplicityAsString(property);
		if (!multiplicity.trim().equals("[1]")) {
			buffer.append(multiplicity);
		}

		// default value
		if (property.getDefault() != null) {
			buffer.append(" = ");
			buffer.append(property.getDefault());
		}

		// property modifiers
		String modifiers = PropertyNotationUtil.getModifiersAsString(property, false);
		if (!modifiers.equals("")) {
			buffer.append(" {");
			buffer.append(modifiers);
			buffer.append("}");
		}
		return buffer.toString();
	}

	/**
	 * return the custom label of the property, given UML2 specification and a
	 * custom style.
	 *
	 * @param style
	 *            the integer representing the style of the label
	 *
	 * @return the string corresponding to the label of the property
	 */
	public static String getCustomLabel(Property property, int style) {
		StringBuffer buffer = new StringBuffer();

		// visibility
		if ((style & IUMLNotation.DISP_VISIBILITY) != 0) {
			buffer.append(NamedElementUtil.getVisibilityAsSign(property));
		}

		// derived property
		if ((style & IUMLNotation.DISP_DERIVE) != 0) {
			if (property.isDerived()) {
				buffer.append("/");
			}
		}

		// name
		if ((style & IUMLNotation.DISP_NAME) != 0) {
			buffer.append(" ");
			buffer.append(property.getName());
		}

		if ((style & IUMLNotation.DISP_TYPE) != 0) {
			// type
			if (property.getType() != null) {
				buffer.append(" : " + property.getType().getName());
			} else {
				buffer.append(" : " + UNDEFINED_TYPE_NAME);
			}
		}

		if ((style & IUMLNotation.DISP_MULTIPLICITY) != 0) {
			// multiplicity -> do not display [1]
			String multiplicity = MultiplicityElementUtil.getMultiplicityAsString(property);
			if (!multiplicity.trim().equals("[1]")) {
				buffer.append(multiplicity);
			}
		}

		if ((style & IUMLNotation.DISP_DFLT_VALUE) != 0) {
			// default value
			if (property.getDefault() != null) {
				buffer.append(" = ");
				buffer.append(property.getDefault());
			}
		}

		boolean showBrackets = buffer.length() > 0;

		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			boolean multiLine = ((style & IUMLNotation.DISP_MULTI_LINE) != 0);
			// property modifiers
			String modifiers = getModifiersAsString(property, multiLine);
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
	 * Returns the modifier of the property, separated by a comma, as as single
	 * line if <code>multiline</code> is <code>false</code> or as a multiline
	 * string if <code>multiline</code> is <code>false</code>.
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
		if (property.isDerivedUnion()) {
			if (needsComma) {
				buffer.append(",");
				buffer.append(NL);
			}
			buffer.append("union");
			needsComma = true;
		}
		if (!property.isOrdered() && property.upperBound() != 1 && property.upperBound() != 0) {
			if (needsComma) {
				buffer.append(",");
				buffer.append(NL);
			}
			buffer.append("unordered");
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
			if (!redefinedProperty.eIsProxy()) {
				if (needsComma) {
					buffer.append(", ");
					buffer.append(NL);
				}
				needsComma = true;

				if (redefinedProperty.getName().equals(property.getName())) {
					buffer.append("redefined");
				} else {
					buffer.append("redefines ");
					buffer.append(redefinedProperty.getName());
				}
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
