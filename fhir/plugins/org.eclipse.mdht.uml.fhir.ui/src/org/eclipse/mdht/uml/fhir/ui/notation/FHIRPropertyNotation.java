/*******************************************************************************
 * Copyright (c) 2015 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *     
 *******************************************************************************/
package org.eclipse.mdht.uml.fhir.ui.notation;

import org.eclipse.mdht.uml.fhir.BindingStrengthKind;
import org.eclipse.mdht.uml.fhir.ElementDefinition;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.ValueSetBinding;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;
import org.openhealthtools.mdht.uml.common.notation.PropertyNotationUtil;
import org.openhealthtools.mdht.uml.common.util.MultiplicityElementUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;


/**
 * Utility class to display FHIR property annotations.
 */
public class FHIRPropertyNotation extends PropertyNotationUtil {

	public static final String FLAG_MODIFYING_ELEMENT = "?!";
	public static final String FLAG_MUST_BE_SUPPORTED = "S";
	public static final String FLAG_SUMMARY_SET = "Σ";
	public static final String FLAG_INVARIANT = "I";
	public static final String FLAG_CANNOT_HAVE_EXTENSIONS = "NE";
	
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

		String flags = getFlags(property);
		if (flags.length() > 0) {
			annotations.append(flags);
		}
		
		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			// property modifiers
			String modifiers = PropertyNotationUtil.getModifiersAsString(property, multiLine);
			if (!modifiers.equals("")) {
				annotations.append(annotations.length() > 0 ? " ": "");
				annotations.append(modifiers);
			}
		}

		if ((style & INotationConstants.DISP_TYPE_CHOICE) != 0) {
			String typeChoice = getPropertyTypeChoice(property);
			if (typeChoice.length() > 0) {
				annotations.append(annotations.length() > 0 ? " ": "");
				annotations.append(typeChoice);
			}
		}

		if ((style & INotationConstants.DISP_VOCABULARY) != 0) {
			String termMetadata = getTerminologyAnnotations(property);
			if (termMetadata.length() > 0) {
				annotations.append(annotations.length() > 0 ? " ": "");
				annotations.append(termMetadata);
			}
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

	protected static String getFlags(Property property) {
		StringBuffer label = new StringBuffer();
		ElementDefinition elementDef = (ElementDefinition) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getElementDefinition());
		if (elementDef != null) {
			if (Boolean.TRUE == elementDef.getIsModifier()) {
				label.append(FLAG_MODIFYING_ELEMENT);
			}
			if (Boolean.TRUE == elementDef.getMustSupport()) {
				label.append(label.length() > 0 ? " ": "");
				label.append(FLAG_MUST_BE_SUPPORTED);
			}
			if (Boolean.TRUE == elementDef.getIsSummary()) {
				label.append(label.length() > 0 ? " ": "");
				label.append(FLAG_SUMMARY_SET);
			}
//			if (hasInvariant(property)) {
//				label.append(label.length() > 0 ? " ": "");
//				label.append(FLAG_INVARIANT);
//			}
		}
		
		return label.toString();
	}
	
	private static boolean hasInvariant(Property property) {
		for (Constraint constraint : property.getClass_().getOwnedRules()) {
			for (Element element : constraint.getConstrainedElements()) {
				if (property.equals(element)) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected static String getPropertyTypeChoice(Property property) {
		StringBuffer typeLabel = new StringBuffer();
		TypeChoice typeChoice = (TypeChoice) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getTypeChoice());
		if (typeChoice != null) {
			if (!typeChoice.getTypes().isEmpty()) {
				typeLabel.append("(");
			}
			for (Classifier choice : typeChoice.getTypes()) {
				if (typeLabel.length() > 1) {
					typeLabel.append(" | ");
				}
				typeLabel.append(choice.getName());
			}
			if (!typeChoice.getTypes().isEmpty()) {
				typeLabel.append(")");
			}
		}
		
		return typeLabel.toString();
	}

	protected static String getTerminologyAnnotations(Property property) {
		StringBuffer annotation = new StringBuffer();
		ValueSetBinding binding = (ValueSetBinding) ProfileUtil.getStereotypeApplication(property, FHIRPackage.eINSTANCE.getValueSetBinding());
		if (binding != null) {
//			if (binding.getDescription() != null) {
//				annotation.append(" " + binding.getDescription());
//			}
			String valueSetName = null;
			if (binding.getValueSetReference() != null) {
				valueSetName = binding.getValueSetReference();
			}
			else if (binding.getValueSetUri() != null) {
				valueSetName = binding.getValueSetUri();
			}

			if (valueSetName != null) {
			valueSetName = valueSetName.substring(valueSetName.lastIndexOf("/") + 1);
			annotation.append(" [");
			annotation.append(valueSetName);
			annotation.append("]");
			}

			if (binding.getStrength() != null) {
				//TODO toUpperCamelCase
				BindingStrengthKind bindingStrength = binding.getStrength();
//				String strengthName = binding.getStrength().getName();
//				StringBuffer camelCaseNameBuffer = new StringBuffer();
//				camelCaseNameBuffer.append(strengthName.substring(0, 1).toUpperCase());
//				camelCaseNameBuffer.append(strengthName.substring(1));
//				strengthName = camelCaseNameBuffer.toString();
//				
//				annotation.append(" (");
//				annotation.append(strengthName);
//				annotation.append(")");
				
				if (BindingStrengthKind.EXAMPLE == bindingStrength) {
					annotation.append("?");
				}
				else if (BindingStrengthKind.PREFERRED == bindingStrength) {
					annotation.append("#");
				}
				else if (BindingStrengthKind.REQUIRED == bindingStrength) {
					annotation.append("!");
				}
				else if (BindingStrengthKind.EXTENSIBLE == bindingStrength) {
					annotation.append("+");
				}
			}
		}

		return annotation.toString();
	}

}
