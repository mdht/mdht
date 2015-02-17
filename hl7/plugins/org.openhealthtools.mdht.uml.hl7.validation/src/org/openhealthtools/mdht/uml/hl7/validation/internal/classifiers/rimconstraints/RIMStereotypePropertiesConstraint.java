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
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.Classes;

/**
 * RIMStereotypePropertiesConstraint implements the constraint to make sure all
 * the properties on the RIM stereotype are populated. Currently we check for
 * type code on participations and class code on the others. As the requirements
 * become defined - implementing using a matrix of stereotypes and required
 * values should be considered.
 * 
 */
@Deprecated
public class RIMStereotypePropertiesConstraint extends HL7AbstractConstraint {

	private static final String ID_RIMSTEREOTYPEPROPERTY = CLASSES_GROUP + "RIMStereotypesProperties";

	public static void register() {
		Classes.registerConstraints(ID_RIMSTEREOTYPEPROPERTY, new RIMStereotypePropertiesConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {
		final Class rimClass = (Class) context.getTarget();

		IStatus result = context.createSuccessStatus();

		// No need to flag invalid stereotype properties when the stereotype is invalid
		if (Classes.getRIMCount(rimClass) == 1) {

			Stereotype rimStereotype = null;

			for (Stereotype stereotype : rimClass.getAppliedStereotypes()) {
				if (IRIMProfileConstants.RIM_PROFILE_NAME.equals(stereotype.getProfile().getName())) {
					rimStereotype = stereotype;
					break;
				}
			}

			if (rimStereotype != null) {
				if (IRIMProfileConstants.PARTICIPATION.equals(rimStereotype.getName()) ||
						IRIMProfileConstants.MANAGED_PARTICIPATION.equals(rimStereotype.getName())) {
					if (rimClass.getValue(rimStereotype, IRIMProfileConstants.TYPE_CODE) == null) {
						Object[] data = new Object[3];
						data[0] = IRIMProfileConstants.TYPE_CODE;
						data[1] = rimStereotype.getName();
						data[2] = rimClass.getName();

						result = context.createFailureStatus(data);
					}

				} else {
					if (rimClass.getValue(rimStereotype, IRIMProfileConstants.CLASS_CODE) == null) {
						Object[] data = new Object[3];
						data[0] = IRIMProfileConstants.CLASS_CODE;
						data[1] = rimStereotype.getName();
						data[2] = rimClass.getName();

						result = context.createFailureStatus(data);
					}
				}

			}
		}
		return result;
	}

}
