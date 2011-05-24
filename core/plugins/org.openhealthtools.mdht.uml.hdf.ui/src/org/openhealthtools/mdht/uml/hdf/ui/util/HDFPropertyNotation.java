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
package org.openhealthtools.mdht.uml.hdf.ui.util;

import java.util.List;

import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;
import org.openhealthtools.mdht.uml.common.notation.PropertyNotationUtil;
import org.openhealthtools.mdht.uml.common.util.MultiplicityElementUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * Utility class for <code>org.eclipse.uml2.uml.Property</code><BR>
 */
public class HDFPropertyNotation extends PropertyNotationUtil {

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
			// omit default value for immutable attributes with code
			if (!hasImmutableCode(property)) {
				// default value
				if (property.getDefault() != null) {
					buffer.append(" = ");
					buffer.append(property.getDefault());
				}
			}
		}

		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			boolean multiLine = ((style & IUMLNotation.DISP_MULTI_LINE) != 0);
			// property modifiers
			String modifiers = PropertyNotationUtil.getModifiersAsString(property, multiLine);
			if (!modifiers.equals("")) {
				if (multiLine) {
					buffer.append("\n");
				}
				buffer.append(" {");
				buffer.append(modifiers);
				buffer.append("}");
			}
		}

		String hl7Metadata = getHL7Metadata(property, style);
		if (hl7Metadata.length() > 0) {
			buffer.append(" { ");
			buffer.append(hl7Metadata);
			buffer.append(" }");
		}

		return buffer.toString();
	}

	private static String getHL7Metadata(Property property, int style) {
		StringBuffer buffer = new StringBuffer();

		// mandatoryConf
		Boolean isMandatory = (Boolean) getHDFAttributeValue(property, IHDFProfileConstants.IS_MANDATORY);
		String conformance = getHDFAttributeString(property, IHDFProfileConstants.CONFORMANCE);
		if (Boolean.TRUE.equals(isMandatory)) {
			buffer.append("M");
		} else if (conformance != null) {
			buffer.append(conformance);
		}

		// vocabBinding
		if ((style & IHL7Appearance.DISP_VOCABULARY) != 0) {
			String vocab = getHDFVocabularyConstraint(property);
			if (vocab != null && vocab.length() > 0) {
				if (buffer.length() > 0) {
					buffer.append(" ");
				}
				buffer.append(vocab);
			}
		}

		// fixedValue
		if (property.isReadOnly()) {
			if (buffer.length() > 0) {
				buffer.append(" ");
			}
			buffer.append("fixed");
		}

		// enumeration
		// allowedRange
		// lengthLimits

		// updateMode
		if ((style & IHL7Appearance.DISP_UPDATE_MODE) != 0) {
			String updateMode = getHDFUpdateMode(property);
			if (updateMode != null && updateMode.length() > 0) {
				if (buffer.length() > 0) {
					buffer.append(" ");
				}
				buffer.append(updateMode);
			}
		}

		// businessNames

		return buffer.toString();
	}

	private static String getHDFAttributeString(Property property, String hdfProperty) {
		Object value = getHDFAttributeValue(property, hdfProperty);
		if (value instanceof EnumerationLiteral) {
			if (!"null".equals(((EnumerationLiteral) value).getName())) {
				return ((EnumerationLiteral) value).getName();
			} else {
				return "";
			}
		} else {
			return (value != null)
					? value.toString()
					: "";
		}
	}

	private static Object getHDFAttributeValue(Property property, String hdfProperty) {
		Object value = null;
		Stereotype hdfAttribute = HL7ResourceUtil.getAppliedHDFStereotype(property, IHDFProfileConstants.HDF_ATTRIBUTE);
		if (hdfAttribute != null) {
			try {
				value = property.getValue(hdfAttribute, hdfProperty);
			} catch (IllegalArgumentException ex) {
				// ignore invalid property names
			}
		}

		return value;
	}

	private static boolean hasImmutableCode(Property property) {
		Stereotype codeSystem = HL7ResourceUtil.getAppliedHDFStereotype(
			property, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);

		if (codeSystem != null) {
			Boolean isImmutable = (Boolean) getHDFAttributeValue(property, IHDFProfileConstants.IS_IMMUTABLE);
			String code = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE);

			if (Boolean.TRUE.equals(isImmutable) && code != null) {
				return true;
			}
		}

		return false;
	}

	private static String getHDFVocabularyConstraint(Property property) {
		StringBuffer value = new StringBuffer();
		Stereotype conceptDomain = HL7ResourceUtil.getAppliedHDFStereotype(
			property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		Stereotype codeSystem = HL7ResourceUtil.getAppliedHDFStereotype(
			property, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);
		Stereotype valueSet = HL7ResourceUtil.getAppliedHDFStereotype(
			property, IHDFProfileConstants.VALUE_SET_CONSTRAINT);
		Stereotype enumeration = HL7ResourceUtil.getAppliedHDFStereotype(
			property, IHDFProfileConstants.ENUMERATION_CONSTRAINT);

		try {
			// Local Enumeration
			if (enumeration != null) {
				Enumeration umlEnum = (Enumeration) property.getValue(
					enumeration, IHDFProfileConstants.ENUMERATION_VALUE);

				if (umlEnum != null) {
					value.append("< ");
					value.append(umlEnum.getName());
				}
			}
			// Value Set
			else if (valueSet != null) {
				Object rootCode = property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_ROOT_CODE);
				if (rootCode != null) {
					value.append("<= ");
					value.append(rootCode);
				} else {
					value.append("< V:");

					Object name = property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_NAME);
					Object oid = property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_OID);
					if (name != null) {
						value.append(name);
					} else if (oid != null) {
						value.append(oid);
					}

					Object versionDate = property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_VERSION_DATE);
					Object versionTime = property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_VERSION_TIME);
					if (versionDate != null) {
						value.append("#" + versionDate);
						if (versionTime != null) {
							value.append(versionTime);
						}
					}

					String strength = getHDFCodingStrength(property);
					if (strength != null) {
						value.append(" " + strength);
					}
				}
			}
			// Code System
			else if (codeSystem != null) {
				Boolean isImmutable = (Boolean) getHDFAttributeValue(property, IHDFProfileConstants.IS_IMMUTABLE);
				String code = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE);

				if (Boolean.TRUE.equals(isImmutable) && code != null) {
					value.append("= ");
					value.append(code);
				} else {
					String name = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_NAME);
					String oid = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_OID);

					value.append("= C:");
					if (name != null) {
						value.append(name);
					} else if (oid != null) {
						value.append(oid);
					}

					if (code != null) {
						value.append("#");
						value.append(code);
					}
				}
			}
			// Concept Domain
			else if (conceptDomain != null) {
				Object name = property.getValue(conceptDomain, IHDFProfileConstants.CONCEPT_DOMAIN_NAME);
				if (name != null) {
					value.append("< CD:" + name);
				}
			}
		} catch (IllegalArgumentException ex) {
			// ignore invalid property names
		}

		return value.toString();
	}

	private static String getHDFCodingStrength(Property property) {
		Object value = null;
		Stereotype valueSet = HL7ResourceUtil.getAppliedHDFStereotype(
			property, IHDFProfileConstants.VALUE_SET_CONSTRAINT);
		if (valueSet != null) {
			try {
				value = property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_CODING_STRENGTH);
			} catch (IllegalArgumentException ex) {
				// ignore invalid property names
			}
		}

		if (value instanceof EnumerationLiteral) {
			EnumerationLiteral literal = (EnumerationLiteral) value;
			if (!"null".equals(literal.getName())) {
				return literal.getName();
			}
		}
		return null;
	}

	private static String getHDFUpdateMode(Property property) {
		StringBuffer value = new StringBuffer();
		String mode = getHDFAttributeString(property, IHDFProfileConstants.UPDATE_MODE_DEFAULT);
		List modeList = (List) getHDFAttributeValue(property, IHDFProfileConstants.UPDATE_MODES_ALLOWED);

		if (mode != null && mode.length() > 0 || (modeList != null && !modeList.isEmpty())) {
			value.append("{");
			value.append(mode);

			if (modeList != null && !modeList.isEmpty()) {
				value.append(": ");
				for (int i = 0; i < modeList.size(); i++) {
					EEnumLiteral aMode = (EEnumLiteral) modeList.get(i);
					if (i > 0) {
						value.append(",");
					}
					value.append(aMode.getName());
				}
			}

			value.append("}");
		}

		return value.toString();
	}

}
