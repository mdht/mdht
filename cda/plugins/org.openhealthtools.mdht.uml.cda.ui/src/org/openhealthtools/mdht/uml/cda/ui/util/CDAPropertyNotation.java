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
package org.openhealthtools.mdht.uml.cda.ui.util;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.common.notation.PropertyNotationUtil;
import org.openhealthtools.mdht.uml.common.util.MultiplicityElementUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ConceptDomainConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

/**
 * Utility class to display HL7 CDA property string.
 */
public class CDAPropertyNotation extends PropertyNotationUtil {

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

		if ((style & IHL7Appearance.DISP_DFLT_VALUE) != 0) {
			// default value
			if (property.getDefault() != null) {
				buffer.append(" = ");
				buffer.append(property.getDefault());
			}
		}

		boolean showBrackets = buffer.length() > 0;
		
		if ((style & IHL7Appearance.DISP_MOFIFIERS) != 0) {
			boolean multiLine = ((style & IHL7Appearance.DISP_MULTI_LINE) != 0);
			// property modifiers
			String modifiers = CDAPropertyNotation.getModifiersAsString(property, multiLine);
			if (!modifiers.equals("")) {
				if (multiLine) {
					buffer.append("\n");
				}
				buffer.append(showBrackets ? " {" : "");
				buffer.append(modifiers);
				buffer.append(showBrackets ? "}" : "");
			}
		}
		
		String hl7Metadata = getHL7Metadata(property, style);
		if (hl7Metadata.length() > 0) {
			buffer.append(showBrackets ? " {" : "");
			buffer.append(hl7Metadata);
			buffer.append(showBrackets ? "}" : "");
		}
		
		return buffer.toString();
	}
	
	private static String getHL7Metadata(Property property, int style) {
		StringBuffer buffer = new StringBuffer();

		// vocabBinding
		if ((style & IHL7Appearance.DISP_VOCABULARY) != 0) {
			String vocab = null;
			if (TermProfileUtil.getConceptDomainConstraint(property) != null) {
				vocab = getConceptDomainAnnotation(property);
			}
			else if (TermProfileUtil.getCodeSystemConstraint(property) != null) {
				vocab = getCodeSystemAnnotation(property);
			}
			else if (TermProfileUtil.getValueSetConstraint(property) != null) {
				vocab = getValueSetAnnotation(property);
			}
			else {
				vocab = getVocabularySpecification(property);
			}
			
			if (vocab != null && vocab.length() > 0) {
				if (buffer.length() > 0)
					buffer.append(" ");
				buffer.append(vocab);
			}
		}
		// other template constraints
		if ((style & IHL7Appearance.DISP_TEMPLATE_CONSTRAINTS) != 0) {
			String value = null;
			Stereotype stereotype = CDAProfileUtil.getAppliedCDAStereotype(property, ICDAProfileConstants.TEXT_VALUE);
			if (stereotype != null) {
				value = (String) property.getValue(stereotype, ICDAProfileConstants.TEXT_VALUE_VALUE);
			}

			if (value != null && value.length() > 0) {
				if (buffer.length() > 0)
					buffer.append(" ");
				buffer.append(value);
			}
		}
		
		// fixedValue
		if (property.isReadOnly()) {
			if (buffer.length() > 0)
				buffer.append(" ");
			buffer.append("fixed");
		}
		
		// nullFlavor
		Stereotype nullFlavorStereotype = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.NULL_FLAVOR);
		if (nullFlavorStereotype != null) {
			Object value = property.getValue(nullFlavorStereotype, 
					ICDAProfileConstants.NULL_FLAVOR_NULL_FLAVOR);

			String nullFlavor = null;
			if (value instanceof EnumerationLiteral) {
				nullFlavor = ((EnumerationLiteral)value).getName();
			}
			else if (value instanceof Enumerator) {
				nullFlavor = ((Enumerator)value).getName();
			}
			
			if (nullFlavor != null) {
				if (buffer.length() > 0)
					buffer.append(" ");
				buffer.append("nullFlavor=" + nullFlavor);
			}
		}
		
		return buffer.toString();
	}

	private static String getConceptDomainAnnotation(Property property) {
		StringBuffer value = new StringBuffer();
		ConceptDomainConstraint conceptDomainConstraint = TermProfileUtil.getConceptDomainConstraint(property);
		
		if (conceptDomainConstraint != null) {
			String id = conceptDomainConstraint.getIdentifier();
			String name = conceptDomainConstraint.getName();

			StringBuffer annotation = getVocabularyString(id, name, null, null);
			if (annotation != null) {
				value.append("CD:" + annotation);
			}
		}
		
		return value.toString();
	}

	private static String getCodeSystemAnnotation(Property property) {
		StringBuffer value = new StringBuffer();
		CodeSystemConstraint codeSystemConstraint = TermProfileUtil.getCodeSystemConstraint(property);
		
		String id = null;
		String name = null;
		String code = null;
		String version = null;
		if (codeSystemConstraint != null) {
			if (codeSystemConstraint.getReference() != null) {
				CodeSystemVersion codeSystemVersion = codeSystemConstraint.getReference();
				id = codeSystemVersion.getIdentifier();
				name = codeSystemVersion.getBase_Enumeration().getName();
				version = codeSystemVersion.getVersion();
			}
			else {
				id = codeSystemConstraint.getIdentifier();
				name = codeSystemConstraint.getName();
				version = codeSystemConstraint.getVersion();
			}

			code = codeSystemConstraint.getCode();
		}

		StringBuffer annotation = getVocabularyString(id, name, version, code);
		if (annotation != null && annotation.length() > 0) {
			value.append("C:" + annotation);
		}
		return value.toString();
	}

	private static String getValueSetAnnotation(Property property) {
		StringBuffer value = new StringBuffer();
		ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(property);

		String id = null;
		String name = null;
		String version = null;
		if (valueSetConstraint != null) {
			if (valueSetConstraint.getReference() != null) {
				ValueSetVersion valueSetVersion = valueSetConstraint.getReference();
				id = valueSetVersion.getIdentifier();
				name = valueSetVersion.getBase_Enumeration().getName();
				version = valueSetVersion.getVersion();
			}
			else {
				id = valueSetConstraint.getIdentifier();
				name = valueSetConstraint.getName();
				version = valueSetConstraint.getVersion();
			}
		}

		StringBuffer annotation = getVocabularyString(id, name, version, null);
		if (annotation != null && annotation.length() > 0) {
			value.append("V:" + annotation);
		}
		return value.toString();
	}
	
	/**
	 * @deprecated
	 */
	private static String getVocabularySpecification(Property property) {
		StringBuffer value = new StringBuffer();
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		
		try {
			if (vocabSpecification != null) {
				String id = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
				String name = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
				String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
				String version = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);

				value.append(getVocabularyString(id, name, version, code));
			}
		}
		catch (IllegalArgumentException ex) {
			// ignore invalid property names
		}
		
		return value.toString();
	}
	
	private static StringBuffer getVocabularyString(String id, String name, String version, String code) {
		StringBuffer value = new StringBuffer();
		if (name != null) {
			value.append(name);
		}
		else if (id != null) {
			value.append(id);
		}
		
		if (code != null) {
			value.append("#" + code);
		}
//		if (version != null) {
//			value.append("#" + version);
//		}
		
		return value;
	}

}
