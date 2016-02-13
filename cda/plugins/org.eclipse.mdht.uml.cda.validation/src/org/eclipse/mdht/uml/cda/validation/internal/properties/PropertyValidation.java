/*******************************************************************************
 * Copyright (c) 2014 eclipse.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eclipse - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.validation.internal.properties;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.validation.provider.AbstractMultiConstraint;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * @author eclipse
 *
 */
public class PropertyValidation extends AbstractMultiConstraint {

	public IStatus validatePropertyRedefinition(IValidationContext context) {
		IStatus result = null;

		if (context.getTarget() instanceof Property) {
			Property property = (Property) context.getTarget();
			if (property.getAssociation() == null && property.getRedefinedProperties().isEmpty() &&
					property.getSubsettedProperties().isEmpty() && (CDAModelUtil.getCDAProperty(property) == null)) {
				result = context.createFailureStatus(property, property.getQualifiedName());
			} else {
				// If property is defined through an association and the assocition is not from clinical document or section
				// and the association is not from clinical document to clinical document
				// make sure we are properly redefining or subsetting
				if (property.getOwner() instanceof Class) {
					if (!CDAModelUtil.isSection((Type) property.getOwner()) &&
							!CDAModelUtil.isClinicalDocument((Type) property.getOwner())) {
						if (!CDAModelUtil.isClinicalStatement((Type) property.getOwner()) &&
								!CDAModelUtil.isClinicalStatement(property.getType())) {
							if (property.getRedefinedProperties().isEmpty() &&
									property.getSubsettedProperties().isEmpty() &&
									(CDAModelUtil.getCDAProperty(property) == null)) {
								result = context.createFailureStatus(property, property.getQualifiedName());
							}
						}

					}
				}

			}
		}

		return (result == null)
				? context.createSuccessStatus()
				: result;
	}

}
