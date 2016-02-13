/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.transform.ecore;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * Partial implementation of the Ecore profile reflection protocol.
 */
public abstract class AbstractEcoreProfileReflection implements IEcoreProfileReflection {
	public AbstractEcoreProfileReflection() {
		super();
	}

	protected abstract String getValidationSeverityAttributeName();

	protected abstract String getValidationMessageAttributeName();

	protected abstract String getAnnotationURI();

	public Stereotype getAppliedValidationStereotype(Element element) {
		return getAppliedValidationStereotype(element, ValidationStereotypeKind.ANY);
	}

	public boolean hasValidationSupport(Element element) {
		return getAppliedValidationStereotype(element) != null;
	}

	public ValidationSeverityKind getValidationSeverity(Element element, ValidationStereotypeKind stereotypeKind) {
		String result = null;

		Stereotype stereotype = getAppliedValidationStereotype(element, stereotypeKind);
		if (stereotype != null) {
			Object value = element.getValue(stereotype, getValidationSeverityAttributeName());
			if (value instanceof String) {
				result = (String) value;
			} else if (value instanceof EnumerationLiteral) {
				result = ((EnumerationLiteral) value).getName();
			} else if (value instanceof Enumerator) {
				result = ((Enumerator) value).getName();
			}
		}

		return (result == null)
				? null
				: ValidationSeverityKind.valueOf(result.toUpperCase());
	}

	public String getValidationMessage(Element element, ValidationStereotypeKind stereotypeKind) {
		String result = null;

		Stereotype stereotype = getAppliedValidationStereotype(element, stereotypeKind);
		if (stereotype != null) {
			Object value = element.getValue(stereotype, getValidationMessageAttributeName());
			if (value instanceof String) {
				result = (String) value;
			} else if (value instanceof ValueSpecification) {
				result = ((ValueSpecification) value).stringValue();
			} else if (value != null) {
				result = String.valueOf(value);
			}
		}

		if ((result == null) || (result.length() == 0)) {
			result = getDefaultValidationMessage(element, stereotype);
		}

		return result;
	}

	protected String getDefaultValidationMessage(Element element, Stereotype stereotype) {
		return null;
	}

	public AnnotationsUtil annotate(Element element) {
		return new AnnotationsUtil(element, getAnnotationURI());
	}

	public AnnotationsUtil annotate(Element element, String path) {
		while (path.startsWith("/")) {
			path = path.substring(1);
		}

		return new AnnotationsUtil(element, getAnnotationURI() + "/" + path);
	}
}
