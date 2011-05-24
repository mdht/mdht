/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hl7.core.util.RIMUtil;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.Classes;

/**
 * RIMMandatoryAttribtuesConstraint implements the constraint to make sure all
 * the required attributes based on the rim derivation are present on the class.
 * 
 */
public class RIMAttributeRedifinitionConstraint extends HL7AbstractConstraint {

	private static final String ID_RIMATTRIBUTEREDIFINITION = CLASSES_GROUP + "RIMAttributeRedifinition";

	public static void register() {
		Classes.registerConstraints(ID_RIMATTRIBUTEREDIFINITION, new RIMAttributeRedifinitionConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {
		final Class rimClass = (Class) context.getTarget();

		IStatus result = context.createSuccessStatus();

		// No need to flag invalid stereotype properties when the stereotype is invalid
		// and choice groups are not bound by this constraint
		if (Classes.getRIMCount(rimClass) == 1 &&
				HL7ResourceUtil.getAppliedHDFStereotype(rimClass, IHDFProfileConstants.CHOICE_GROUP) == null) {

			Stereotype rimStereotype = null;

			for (Stereotype stereotype : rimClass.getAppliedStereotypes()) {
				if (IRIMProfileConstants.RIM_PROFILE_NAME.equals(stereotype.getProfile().getName())) {
					rimStereotype = stereotype;
					break;
				}
			}

			if (rimStereotype != null) {

				// Get the RIM derivation based on the value
				Class rimDerivedClass = RIMUtil.getClassByName(rimClass.getNearestPackage(), rimStereotype.getName());

				// All HL7 classes are derived from the rim indirectly through
				// the use of rim stereotypes. All uml derived classes must
				// contain at least all of the rim required attributes.
				if (rimDerivedClass != null) {

					for (Property rimProperty : rimClass.getAllAttributes()) {
						if (rimProperty.getAssociation() == null) {
							Property baseProperty = rimDerivedClass.getAttribute(rimProperty.getName(), null);
							// if baseProperty is null - it only means that this class did not potentially redifine it.
							// There are other validations to make sure that all required attributes are implemented.
							if (baseProperty != null && !rimProperty.isConsistentWith(baseProperty)) {
								Object[] data = new Object[3];
								data[0] = baseProperty.getName();
								data[1] = rimProperty.getName();
								data[2] = rimStereotype.getName();
								result = context.createFailureStatus(data);
							}

						}

					}

				}

			}
		}
		return result;
	}

}
