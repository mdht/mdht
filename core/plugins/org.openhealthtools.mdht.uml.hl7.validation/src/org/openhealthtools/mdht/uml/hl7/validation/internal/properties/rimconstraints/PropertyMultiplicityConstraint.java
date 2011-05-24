/*******************************************************************************
 * Copyright (c) 2008, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Sean Muir (JKM Software) - Refactored constraint structure
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.validation.internal.properties.rimconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.RIMConstraintsUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.Properties;

/**
 * PropertyMultiplicityConstraint validates that the RIM based property cardinality has not materially altered the cardinality defined in the RIM
 * attribute.
 * 
 * The constraints are
 * 
 * 1 Defined Property lower cardinality is less then corresponding RIM cardinality lower cardinality
 * 2 Defined Property upper cardinality is more then corresponding RIM cardinality upper cardinality
 * 
 * @author eclipse
 * 
 */
public class PropertyMultiplicityConstraint extends HL7AbstractConstraint {

	private static final String ID_PROPERTYMULTIPLICITY = PROPERTIES_GROUP + "propertyMultiplicity";

	public static void register() {
		Properties.registerConstraints(ID_PROPERTYMULTIPLICITY, new PropertyMultiplicityConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {

		IStatus result = context.createSuccessStatus();

		Property property = null;

		if (context.getTarget() instanceof Property) {
			property = (Property) context.getTarget();
		} else if (context.getTarget() instanceof ValueSpecification) {
			if (context.getTarget().eContainer() instanceof Property) {
				property = (Property) context.getTarget().eContainer();
			}
		}

		Property rimSupplier = RIMConstraintsUtil.getRIMSupplier(property);

		if (property != null && rimSupplier != null) {

			// UML/Rational is using -1 for * or unbounded in model - convert to MAX_VALUE for comparisons
			int propertyUpper = property.getUpper() != -1
					? property.getUpper()
					: Integer.MAX_VALUE;

			int rimUpper = rimSupplier.getUpper() != -1
					? rimSupplier.getUpper()
					: Integer.MAX_VALUE;

			if (property.getLower() < rimSupplier.getLower() || propertyUpper > rimUpper) {
				Object[] arguments = {
						getMultiplicityString(property.getName(), property),
						getMultiplicityString(rimSupplier.getName(), rimSupplier) };

				result = context.createFailureStatus(arguments);
			}

		}

		return result;
	}

	private String getMultiplicityString(String propertyName, Property property) {
		StringBuffer display = new StringBuffer();
		display.append(propertyName);
		display.append(" [");
		display.append(property.getLower());
		display.append("..");
		String upper = (property.getUpper()) == -1
				? "*"
				: Integer.toString(property.getUpper());
		display.append(upper);
		display.append("]");
		return display.toString();
	}

}
