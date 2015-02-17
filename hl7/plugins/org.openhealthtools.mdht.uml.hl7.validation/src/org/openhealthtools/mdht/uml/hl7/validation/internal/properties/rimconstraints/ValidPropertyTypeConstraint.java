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
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.RIMConstraintsUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.Properties;

public class ValidPropertyTypeConstraint extends HL7AbstractConstraint {

	private static final String ID_VALIDPROPERTYTYPE = PROPERTIES_GROUP + "validPropertyType";

	public static void register() {
		Properties.registerConstraints(ID_VALIDPROPERTYTYPE, new ValidPropertyTypeConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {

		Property property = null;
		if (context.getTarget() instanceof Property) {
			property = (Property) context.getTarget();
		}

		Property rimSupplier = RIMConstraintsUtil.getRIMSupplier(property);

		if (property != null && rimSupplier != null) {
			Classifier propertyType = (Classifier) property.getType();
			Classifier rimType = (Classifier) rimSupplier.getType();

			if (propertyType != null && rimType != null) {
				if (!hasCompatibleTypes(property, rimSupplier)) {

					Object[] arguments = {
							property.getName() + " : " + propertyType.getName(),
							rimSupplier.getName() + " : " + rimType.getName() };
					return context.createFailureStatus(arguments);
				}
			}
		}

		return context.createSuccessStatus();
	}

	/**
	 * The source type is compatible with the supplier type.
	 */
	private boolean hasCompatibleTypes(Property source, Property supplier) {
		Classifier sourceType = (Classifier) source.getType();
		Classifier supplierType = (Classifier) supplier.getType();
		if (sourceType != null && supplierType != null) {
			String rimClassName = null;
			if ("RIM".equals(supplierType.getModel().getName())) {
				rimClassName = supplierType.getName();
			} else {
				Stereotype supplierStereotype = RIMProfileUtil.getRIMStereotype(supplierType);
				if (supplierStereotype != null) {
					rimClassName = supplierStereotype.getName();
				}
			}

			if (sourceType.equals(supplierType) || sourceType.getGenerals().contains(supplierType) ||
					RIMProfileUtil.isRIMType(sourceType, rimClassName)) {

				return true;
			}
		}

		return false;
	}

}
