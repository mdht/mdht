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
package org.eclipse.mdht.uml.cda.validation.internal.classifiers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.mdht.uml.validation.provider.AbstractMultiConstraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * Constraints on properties of CDA templates and other classes.
 */
public class PropertyConstraints extends AbstractMultiConstraint {

	public PropertyConstraints() {
		super();
	}

	public IStatus validateEnumPropertyDefaultIsValidLiteral(IValidationContext context) {
		IStatus result = null;

		Property property = (Property) context.getTarget();
		if ((property.getType() instanceof Enumeration) && (property.getDefaultValue() != null)) {
			Enumeration enumeration = (Enumeration) property.getType();
			ValueSpecification defaultValue = property.getDefaultValue();
			boolean ok;

			if (defaultValue instanceof InstanceValue) {
				InstanceSpecification instance = ((InstanceValue) defaultValue).getInstance();
				if (!(instance instanceof EnumerationLiteral)) {
					ok = false;
				} else {
					EnumerationLiteral literal = (EnumerationLiteral) instance;
					ok = literal.getEnumeration() == enumeration;
				}
			} else {
				String stringValue = defaultValue.stringValue();
				ok = (stringValue != null) && (enumeration.getOwnedLiteral(stringValue) != null);
			}

			if (!ok) {
				// Default value "{1}" of property "{0}" is not a literal of enumeration "{2}".
				result = context.createFailureStatus(property, defaultValue.stringValue(), enumeration);
			}
		}

		return (result == null)
				? context.createSuccessStatus()
				: result;
	}

}
