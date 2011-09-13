/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.openhealthtools.mdht.uml.term.ui.util;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.openhealthtools.mdht.uml.common.notation.INotationProvider;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemVersion;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetCode;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class TermAnnotationProvider implements INotationProvider, IExecutableExtension {

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

	public String getAnnotation(Element element) {
		String annotation = null;

		if (element instanceof Enumeration) {
			annotation = getMetadata((Enumeration) element);
		} else if (element instanceof EnumerationLiteral) {
			annotation = getMetadata((EnumerationLiteral) element);
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

		if (element instanceof NamedElement) {
			printString = ((NamedElement) element).getName();
		}

		return printString;
	}

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		// do nothing
	}

}
