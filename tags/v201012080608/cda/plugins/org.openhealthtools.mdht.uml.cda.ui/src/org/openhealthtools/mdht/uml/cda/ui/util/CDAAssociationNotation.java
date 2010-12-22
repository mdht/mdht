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
package org.openhealthtools.mdht.uml.cda.ui.util;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;

/**
 * Utility class to display HL7 CDA association string.
 */
public class CDAAssociationNotation {

	/**
	 * Return the custom label of the association, given CDA specification and a custom style.
	 * 
	 * @param style
	 *            the integer representing the style of the label
	 * 
	 * @return the string corresponding to the label of the association
	 */
	public static String getCustomLabel(Association association, int style) {
		StringBuffer buffer = new StringBuffer();
		
		// visibility
		if ((style & IUMLNotation.DISP_VISIBILITY) != 0) {
			buffer.append(NamedElementUtil.getVisibilityAsSign(association));
		}

		// name
		if ((style & IUMLNotation.DISP_NAME) != 0) {
			buffer.append(" ");
			buffer.append(association.getName());
		}

		boolean showBrackets = buffer.length() > 0;
		
		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			boolean multiLine = ((style & IUMLNotation.DISP_MULTI_LINE) != 0);
			// class modifiers
			String modifiers = getModifiersAsString(association, multiLine);
			if (!modifiers.equals("")) {
				if (multiLine) {
					buffer.append("\n");
				}
				buffer.append(showBrackets ? " {" : "");
				buffer.append(modifiers);
				buffer.append(showBrackets ? "}" : "");
			}
		}

		String hl7Metadata = getHL7Metadata(association, style);
		if (hl7Metadata.length() > 0) {
			buffer.append(showBrackets ? " {" : "");
			buffer.append(hl7Metadata);
			buffer.append(showBrackets ? "}" : "");
		}
		
		return buffer.toString();
	}

	protected static String getModifiersAsString(Association association, boolean multiLine) {
		StringBuffer buffer = new StringBuffer();
		boolean needsComma = false;

		if (association.isAbstract()) {
			buffer.append("abstract");
			needsComma = true;
		}
		if (association.isLeaf()) {
			if (needsComma) {
				buffer.append(",");
			}
			buffer.append("leaf");
			needsComma = true;
		}
		
		return buffer.toString();
	}
	
	private static String getHL7Metadata(Association association, int style) {
		StringBuffer buffer = new StringBuffer();

		// vocabulary
		if ((style & IHL7Appearance.DISP_VOCABULARY) != 0) {
			String vocab = getVocabulary(association);
			if (vocab != null && vocab.length() > 0) {
				if (buffer.length() > 0)
					buffer.append(" ");
				buffer.append(vocab);
			}
		}

		return buffer.toString();
	}

	private static String getVocabulary(Association association) {
		StringBuffer value = new StringBuffer();
		Stereotype entry = CDAProfileUtil.getAppliedCDAStereotype(
				association, ICDAProfileConstants.ENTRY);
		Stereotype entryRelationship = CDAProfileUtil.getAppliedCDAStereotype(
				association, ICDAProfileConstants.ENTRY_RELATIONSHIP);
		
		try {
			if (entry != null) {
				Object literal = association.getValue(entry, ICDAProfileConstants.ENTRY_TYPE_CODE);
				String typeCode = null;
				if (literal instanceof EnumerationLiteral) {
					typeCode = ((EnumerationLiteral)literal).getLabel();
				}
				else if (literal instanceof Enumerator) {
					typeCode = ((Enumerator)literal).getName();
					
					Enumeration entryKind = (Enumeration) entry.getProfile().getOwnedType(ICDAProfileConstants.ENTRY_KIND);
					if (entryKind != null) {
						typeCode = entryKind.getOwnedLiteral(typeCode).getLabel();
					}
				}

				if (typeCode != null) {
					value.append(typeCode);
				}
			}
			else if (entryRelationship != null) {
				Object literal = association.getValue(entryRelationship, 
						ICDAProfileConstants.ENTRY_RELATIONSHIP_TYPE_CODE);
				String typeCode = null;
				if (literal instanceof EnumerationLiteral) {
					typeCode = ((EnumerationLiteral)literal).getLabel();
				}
				else if (literal instanceof Enumerator) {
					typeCode = ((Enumerator)literal).getName();
					
					Enumeration entryRelKind = (Enumeration) entryRelationship.getProfile().getOwnedType(ICDAProfileConstants.ENTRY_RELATIONSHIP_KIND);
					if (entryRelKind != null) {
						typeCode = entryRelKind.getOwnedLiteral(typeCode).getLabel();
					}
				}

				if (typeCode != null) {
					value.append(typeCode);
				}
			}
		}
		catch (IllegalArgumentException ex) {
			// ignore invalid property names
		}
		
		return value.toString();
	}

}
