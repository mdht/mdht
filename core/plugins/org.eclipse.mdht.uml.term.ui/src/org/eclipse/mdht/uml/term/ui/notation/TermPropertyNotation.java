/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.term.ui.notation;

import org.eclipse.mdht.uml.common.notation.IUMLNotation;
import org.eclipse.mdht.uml.common.notation.PropertyNotationUtil;
import org.eclipse.mdht.uml.common.util.MultiplicityElementUtil;
import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomainConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.uml.Property;

/**
 * Utility class to display terminology in property notation.
 */
public class TermPropertyNotation extends PropertyNotationUtil {

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

		boolean multiLine = ((style & IUMLNotation.DISP_MULTI_LINE) != 0);
		StringBuffer annotations = new StringBuffer();

		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			// property modifiers
			String modifiers = PropertyNotationUtil.getModifiersAsString(property, multiLine);
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

	public static String getTerminologyAnnotations(Property property, int style) {
		StringBuffer buffer = new StringBuffer();

		// vocabBinding
		if ((style & ITermAppearance.DISP_VOCABULARY) != 0) {
			String vocab = null;
			if (TermProfileUtil.getConceptDomainConstraint(property) != null) {
				vocab = getConceptDomainAnnotation(property);
			} else if (TermProfileUtil.getCodeSystemConstraint(property) != null) {
				vocab = getCodeSystemAnnotation(property);
			} else if (TermProfileUtil.getValueSetConstraint(property) != null) {
				vocab = getValueSetAnnotation(property);
			}

			if (vocab != null && vocab.length() > 0) {
				if (buffer.length() > 0) {
					buffer.append(" ");
				}
				buffer.append(vocab);
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

				if (codeSystemVersion.getBase_Enumeration() != null) {
					name = codeSystemVersion.getEnumerationName();
				} else {
					name = "Error:No Base Enumeration";
				}

				version = codeSystemVersion.getVersion();
			} else {
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
				name = valueSetVersion.getEnumerationName();
				version = valueSetVersion.getVersion();
			} else {
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

	private static StringBuffer getVocabularyString(String id, String name, String version, String code) {
		StringBuffer value = new StringBuffer();
		if (name != null) {
			value.append(name);
		} else if (id != null) {
			value.append(id);
		}

		if (code != null) {
			value.append("#" + code);
		}
		// if (version != null) {
		// value.append("#" + version);
		// }

		return value;
	}

}
