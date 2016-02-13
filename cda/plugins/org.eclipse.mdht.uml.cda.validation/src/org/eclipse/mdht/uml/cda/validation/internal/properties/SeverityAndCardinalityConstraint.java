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
import org.eclipse.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.eclipse.mdht.uml.validation.provider.AbstractMultiConstraint;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * @author eclipse
 *
 */
public class SeverityAndCardinalityConstraint extends AbstractMultiConstraint {

	private boolean checkSeverityAndCardinality(Property property) {
		return checkSeverityAndCardinality(
			property, CDAModelUtil.getValidationSeverity(property, ICDAProfileConstants.PROPERTY_VALIDATION));
	}

	private boolean checkSeverityAndCardinality(Property property, String severity) {
		if (CDAModelUtil.SEVERITY_ERROR.equals(severity) &&
				(property.lowerBound() == 0 && property.upperBound() != 0)) {
			return false;
		} else if ((CDAModelUtil.SEVERITY_INFO.equals(severity) || CDAModelUtil.SEVERITY_WARNING.equals(severity)) &&
				property.lowerBound() == 1) {
			return false;
		}
		return true;
	}

	public IStatus validateSeverityAndCardinalityConstraint(IValidationContext context) {
		IStatus result = null;

		if (context.getTarget() instanceof Association) {
			Association association = (Association) context.getTarget();
			String severity = CDAModelUtil.getValidationSeverity(
				association, ICDAProfileConstants.ASSOCIATION_VALIDATION);
			for (Property property : association.getMemberEnds()) {
				if (property.getOwner() instanceof org.eclipse.uml2.uml.Class &&
						!checkSeverityAndCardinality(property, severity)) {
					result = context.createFailureStatus(property, ((property.getOwner() instanceof NamedElement)
							? ((NamedElement) property.getOwner()).getQualifiedName()
							: property.getQualifiedName()));
					break;
				}
			}
		} else if (context.getTarget() instanceof Property) {
			Property property = (Property) context.getTarget();
			if (!checkSeverityAndCardinality(property)) {
				result = context.createFailureStatus(property, ((property.getOwner() instanceof NamedElement)
						? ((NamedElement) property.getOwner()).getQualifiedName()
						: property.getQualifiedName()));
			}

		}

		return (result == null)
				? context.createSuccessStatus()
				: result;

	}

}
