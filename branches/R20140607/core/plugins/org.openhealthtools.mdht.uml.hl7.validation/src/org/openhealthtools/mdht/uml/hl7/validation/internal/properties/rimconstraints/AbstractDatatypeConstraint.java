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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hl7.core.util.DatatypeUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.Properties;

public class AbstractDatatypeConstraint extends HL7AbstractConstraint {

	private static final String ID_ABSTRACTDATATYPE = PROPERTIES_GROUP + "abstractDataType";

	public static void register() {
		Properties.registerConstraints(ID_ABSTRACTDATATYPE, new AbstractDatatypeConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {

		IStatus result = context.createSuccessStatus();
		Property property = (Property) context.getTarget();

		// Null property is a failure but validated elsewhere
		if (property.getType() != null) {

			Element owner = property.getType().getOwner();

			// Check to make sure we have an attribute of the class versus a association
			if (property.getAssociation() == null) {

				if (!DatatypeUtil.isAbstractDatatype(owner)) {

					if (property.getType() instanceof org.eclipse.uml2.uml.Class) {

						org.eclipse.uml2.uml.Class clazz = (org.eclipse.uml2.uml.Class) property.getType();

						Classifier classifier = UMLUtil.getTemplate(clazz);

						// and the template is not abstract - then we have invalid property
						if (!DatatypeUtil.isAbstractDatatype(classifier)) {

							Object[] data = {
									property.getName(), property.getType().getQualifiedName(),
									owner.eResource().getURI().toString() };
							result = context.createFailureStatus(data);

						} else {
							// we iterate over the template parameters to see if they are all valid
							if (!checkTemplateParameters(clazz)) {
								Object[] data = {
										property.getName(), property.getType().getQualifiedName(),
										owner.eResource().getURI().toString() };
								result = context.createFailureStatus(data);
							}

						}

					}

				}

			}
		}

		return result;
	}

	/**
	 * checkTemplateParameters is recursive method to check that the template parameters are valid
	 * for instance SET < RTO > where RTO is defined as SET <PQ,PQ> is valid
	 * 
	 * The templates must all be from hl7 abstract data types
	 * 
	 * @param classifier
	 * @return
	 */
	private static final boolean checkTemplateParameters(Classifier classifier) {
		// Iterate over the parameters to the template
		for (Classifier parameter : UMLUtil.getTemplateBindingParameters(classifier)) {

			// If the parameter is not abstract
			if (!DatatypeUtil.isAbstractDatatype(parameter)) {

				// Check to see if it is in fact a template
				Classifier parameterTemplate = UMLUtil.getTemplate(parameter);

				// If it is not an abstract template - return false
				if (!DatatypeUtil.isAbstractDatatype(parameterTemplate)) {
					return false;
				} else {
					// If we are an abstract template - check the parameters
					return checkTemplateParameters(parameterTemplate);
				}
			}
		}
		// If we make it here - we are good to go
		return true;
	}
}
