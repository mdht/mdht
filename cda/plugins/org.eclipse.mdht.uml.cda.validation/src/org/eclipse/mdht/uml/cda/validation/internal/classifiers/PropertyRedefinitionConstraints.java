/*******************************************************************************
 * Copyright (c) 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.validation.internal.classifiers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.mdht.uml.validation.provider.AbstractMultiConstraint;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

/**
 * Constraints on implicit property redefinition.
 */
public class PropertyRedefinitionConstraints extends AbstractMultiConstraint {

	public PropertyRedefinitionConstraints() {
		super();
	}

	public IStatus validateImplicitPropertyRedefinitionIsValid(IValidationContext context) {
		IStatus result = null;

		Property property = (Property) context.getTarget();
		// Property is owned by a Class
		// Does not have explicit redefinition (no duplication of UML2 validation)
		if (property.getClass_() != null && property.getRedefinedElements().isEmpty()) {
			boolean ok = true;
			Property parentProperty = null;

			for (Classifier parent : property.getClass_().allParents()) {
				parentProperty = parent.getAttribute(property.getName(), null);
				if (parentProperty != null && !parentProperty.isConsistentWith(property)) {
					ok = false;
					break;
				}
			}

			if (!ok) {
				// Property "{0}" is not a valid implicit redefinition of Property "{1}".
				result = context.createFailureStatus(property.getQualifiedName(), parentProperty.getQualifiedName());
			}
		}

		return (result == null)
				? context.createSuccessStatus()
				: result;
	}

}
