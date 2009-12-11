/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/

package org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers;

import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.MultipleRIMStereotypeConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.RIMAttributeRedifinitionConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.RIMMandatoryAttributesConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.classifiers.rimconstraints.SingleRIMStereotypeConstraint;

/**
 * 
 * $Id: $
 */
public class Classes extends HL7AbstractConstraint {

	/*
	 * In order to keep Classes from getting to cumbersome - Each constraint is
	 * its own extension of HL7AbstractConstraint. In order to not have a
	 * if/switch statement - Classes has a static constraints map. Each
	 * subsequent constraint must register with classes to fire. The result is
	 * some level of open/closed except that the static section of classes are
	 * not fired unless the class loader for the constraint class is fired. We
	 * therefore need to have static init in the claseses class but this is a
	 * more manageable solution that have a deeply nested if statements.
	 */

	private static void initialize() {
		SingleRIMStereotypeConstraint.register();
		MultipleRIMStereotypeConstraint.register();
		RIMMandatoryAttributesConstraint.register();
		RIMAttributeRedifinitionConstraint.register();

	}

	private static HashMap<String, AbstractModelConstraint> constraints = new HashMap<String, AbstractModelConstraint>();

	public static void registerConstraints(String id, AbstractModelConstraint constraint) {
		if (id != null && constraint != null) {
			constraints.put(id, constraint);
		}
	}

	/*
	 * TODO: -
	 */

	public IStatus validate(IValidationContext context) {

		IStatus result = context.createSuccessStatus();

		if (constraints.size() == 0) {
			initialize();
		}

		if (constraints.containsKey(context.getCurrentConstraintId())) {
			result = constraints.get(context.getCurrentConstraintId()).validate(context);
		} else {
			/*
			 * There does not seem to be away to replace the message on the fly
			 * but we can inject a big message with the hopes the constraint has
			 * a value in the message
			 */
			Object[] data = new Object[1];
			data[0] = "<<<< The Following Warning Constraint Not Registered Properly Register >>" + context.getCurrentConstraintId();
			result = context.createFailureStatus(data);
		}

		return result;

	}

	public static int getRIMCount(final Class rimClass) {

		int rimCount = 0;
		for (Stereotype stereotype : rimClass.getAppliedStereotypes()) {
			if (IRIMProfileConstants.RIM_PROFILE_NAME.equals(stereotype.getProfile().getName())) {
				rimCount++;
			}
		}
		return rimCount;
	}

}
