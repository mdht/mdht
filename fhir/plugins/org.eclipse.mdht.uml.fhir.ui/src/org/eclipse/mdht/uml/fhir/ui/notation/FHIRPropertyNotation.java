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

import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.TypeChoice;
import org.eclipse.mdht.uml.fhir.util.ProfileUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.notation.IUMLNotation;
import org.openhealthtools.mdht.uml.common.notation.PropertyNotationUtil;
import org.openhealthtools.mdht.uml.common.util.MultiplicityElementUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;


/**
 * Utility class to display FHIR property annotations.
 */
public class FHIRPropertyNotation extends PropertyNotationUtil {

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

		if ((style & IUMLNotation.DISP_MOFIFIERS) != 0) {
			// property modifiers
			String modifiers = PropertyNotationUtil.getModifiersAsString(property, multiLine);
			if (!modifiers.equals("")) {
				annotations.append(modifiers);
			}
		}

		if ((style & INotationConstants.DISP_VOCABULARY) != 0) {
			String termMetadata = getTerminologyAnnotations(property);
			if (termMetadata.length() > 0) {
				if (annotations.length() > 0) {
					annotations.append(", ");
				}
				annotations.append(termMetadata);
			}
		}

		if ((style & INotationConstants.DISP_TYPE_CHOICE) != 0) {
			String typeChoice = getPropertyTypeChoice(property);
			if (typeChoice.length() > 0) {
				if (annotations.length() > 0) {
					annotations.append(", ");
				}
				annotations.append(typeChoice);
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
		StringBuffer value = new StringBuffer();
		//TODO delegate to Terminology profile notation

		return value.toString();
	}

}
