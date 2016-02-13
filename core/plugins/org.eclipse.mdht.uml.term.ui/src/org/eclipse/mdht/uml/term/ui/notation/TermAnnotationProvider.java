/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
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
package org.eclipse.mdht.uml.term.ui.notation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.mdht.uml.common.notation.INotationProvider;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.mdht.uml.term.core.util.TermProfileUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;

public class TermAnnotationProvider implements INotationProvider, IExecutableExtension {

	public final static int TERM_PROPERTY_ANNOTATION = ITermAppearance.DISP_VOCABULARY | ITermAppearance.DISP_MOFIFIERS;

	public String getAnnotation(Element element) {
		String annotation = null;

		if (element instanceof Enumeration) {
			annotation = getMetadata((Enumeration) element);
		} else if (element instanceof EnumerationLiteral) {
			annotation = getMetadata((EnumerationLiteral) element);
		} else if (element instanceof Property) {
			annotation = TermPropertyNotation.getCustomLabel((Property) element, TERM_PROPERTY_ANNOTATION);
		} else if (element instanceof Association) {
			Property navigableEnd = UMLUtil.getNavigableEnd((Association) element);
			if (navigableEnd != null) {
				annotation = TermPropertyNotation.getCustomLabel(navigableEnd, TERM_PROPERTY_ANNOTATION);
			}
		}

		return annotation;
	}

	public Object getAnnotationImage(Element element) {
		return null;
	}

	public Object getElementImage(Element element) {
		return null;
	}

	public String getPrintString(Element element) {
		String printString = null;

		if (element instanceof Property) {
			printString = TermPropertyNotation.getCustomLabel(
				(Property) element, ITermAppearance.DEFAULT_UML_PROPERTY | ITermAppearance.DISP_VOCABULARY);
		}

		return printString;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

	private static String getMetadata(Enumeration enumeration) {
		StringBuffer value = new StringBuffer();
		CodeSystemVersion codeSystemVersion = TermProfileUtil.getCodeSystemVersion(enumeration);
		ValueSetVersion valueSetVersion = TermProfileUtil.getValueSetVersion(enumeration);

		String identifier = null;
		if (codeSystemVersion != null) {
			identifier = codeSystemVersion.getIdentifier();
		} else if (valueSetVersion != null) {
			identifier = valueSetVersion.getIdentifier();
		}

		if (identifier != null) {
			value.append(identifier);
		}

		return value.toString();
	}

	private static String getMetadata(EnumerationLiteral literal) {
		StringBuffer value = new StringBuffer();
		ValueSetCode valueSetCode = TermProfileUtil.getValueSetCode(literal);

		if (valueSetCode != null && valueSetCode.getConceptName() != null) {
			value.append(valueSetCode.getConceptName());
		}

		return value.toString();
	}

}
