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
package org.openhealthtools.mdht.uml.cda.ui.util;

import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.common.util.MultiplicityElementUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.common.util.PropertyNotationUtil;

/**
 * Utility class to display HL7 CDA property string.
 */
public class CDAPropertyUtil extends PropertyNotationUtil {

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
		if ((style & IHL7Appearance.DISP_VISIBILITY) != 0) {
			buffer.append(NamedElementUtil.getVisibilityAsSign(property));
		}

		// derived property
		if ((style & IHL7Appearance.DISP_DERIVE) != 0) {
			if (property.isDerived()) {
				buffer.append("/");
			}
		}
		
		// name
		if ((style & IHL7Appearance.DISP_NAME) != 0) {
			buffer.append(" ");
			buffer.append(property.getName());
		}

		if ((style & IHL7Appearance.DISP_TYPE) != 0) {
			// type
			if (property.getType() != null) {
				buffer.append(" : " + property.getType().getName());
			} else {
				buffer.append(" : " + UNDEFINED_TYPE_NAME);
			}
		}

		if ((style & IHL7Appearance.DISP_MULTIPLICITY) != 0) {
			// multiplicity -> do not display [1]
			String multiplicity = MultiplicityElementUtil.getMultiplicityAsString(property);
			if (!multiplicity.trim().equals("[1]")) {
				buffer.append(multiplicity);
			}
		}

		// default value
		if (property.getDefault() != null) {
			buffer.append(" = ");
			buffer.append(property.getDefault());
		}

		if ((style & IHL7Appearance.DISP_MOFIFIERS) != 0) {
			boolean multiLine = ((style & IHL7Appearance.DISP_MULTI_LINE) != 0);
			// property modifiers
			String modifiers = CDAPropertyUtil.getModifiersAsString(property, multiLine);
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
//		Boolean isMandatory = (Boolean) getPropertyValidationValue(property, ICDAProfileConstants.IS_MANDATORY);
//		String conformance = getPropertyValidationString(property, ICDAProfileConstants.CONFORMANCE);
//		if (Boolean.TRUE.equals(isMandatory)) {
//			buffer.append("M");
//		}
//		else if (conformance != null) {
//			buffer.append(conformance);
//		}

		// vocabBinding
		if ((style & IHL7Appearance.DISP_VOCABULARY) != 0) {
			String vocab = getVocabularySpecification(property);
			if (vocab != null && vocab.length() > 0) {
				if (buffer.length() > 0)
					buffer.append(" ");
				buffer.append(vocab);
			}
		}

		// fixedValue
		if (property.isReadOnly()) {
			if (buffer.length() > 0)
				buffer.append(" ");
			buffer.append("fixed");
		}
		
		return buffer.toString();
	}

//	private static String getPropertyValidationString(Property property, String cdaProperty) {
//		Object value = getPropertyValidationValue(property, cdaProperty);
//		if (value instanceof EnumerationLiteral) {
//			if (!"null".equals(((EnumerationLiteral)value).getName()))
//				return ((EnumerationLiteral)value).getName();
//			else
//				return "";
//		}
//		else {
//			return (value!=null) ? value.toString() : "";
//		}
//	}
//	
//	private static Object getPropertyValidationValue(Property property, String cdaProperty) {
//		Object value = null;
//		Stereotype propertyValidation = CDAProfileUtil.getAppliedCDAStereotype(
//				property, ICDAProfileConstants.PROPERTY_VALIDATION);
//		if (propertyValidation != null) {
//			try {
//				value = property.getValue(propertyValidation, cdaProperty);
//			}
//			catch (IllegalArgumentException ex) {
//				// ignore invalid property names
//			}
//		}
//		
//		return value;
//	}
	
	private static String getVocabularySpecification(Property property) {
		StringBuffer value = new StringBuffer();
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		
		try {
			// Code System
			if (vocabSpecification != null) {
				String codeSystem = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
				String codeSystemName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
				String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
				Object version = property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);

				if (codeSystemName != null) {
					value.append(codeSystemName);
				}
				else if (codeSystem != null) {
					value.append(codeSystem);
				}
				
				if (code != null) {
					value.append("#" + code);
				}
				if (version != null) {
					value.append("#" + version);
				}

			}
		}
		catch (IllegalArgumentException ex) {
			// ignore invalid property names
		}
		
		return value.toString();
	}

}
