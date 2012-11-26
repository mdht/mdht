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

package org.openhealthtools.mdht.uml.hl7.validation.internal.properties;

import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.modelconstraints.MissingTypeConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.rimconstraints.AbstractDatatypeConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.rimconstraints.PropertyMultiplicityConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.rimconstraints.ValidPropertyTypeConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.vocabularyconstraints.PropertyVocabularyConstraint;

/**
 * 
 * $Id: $
 */
public class Properties extends HL7AbstractConstraint {

	private static void initialize() {
		AbstractDatatypeConstraint.register();
		MissingTypeConstraint.register();
		PropertyMultiplicityConstraint.register();
		ValidPropertyTypeConstraint.register();
		PropertyVocabularyConstraint.register();
	}

	private static HashMap<String, AbstractModelConstraint> constraints = new HashMap<String, AbstractModelConstraint>();

	public static void registerConstraints(String id, AbstractModelConstraint constraint) {
		if (id != null && constraint != null) {
			constraints.put(id, constraint);
		}
	}

	@Override
	public IStatus validate(IValidationContext context) {

		IStatus result = null; // context.createSuccessStatus();

		if (constraints.size() == 0) {
			initialize();
		}

		if (constraints.containsKey(context.getCurrentConstraintId())) {
			try {
				result = constraints.get(context.getCurrentConstraintId()).validate(context);
			} catch (RuntimeException re) {
				Object[] data = new Object[1];
				data[0] = "<<<< Runtime Exception Encountered >> " + re.getMessage() + " for constraint " +
						context.getCurrentConstraintId();
				result = context.createFailureStatus(data);
				re.printStackTrace();
			}
		} else {
			/*
			 * There does not seem to be away to replace the message on the fly
			 * but we can inject a big message with the hopes the constraint has
			 * a value in the message
			 */
			Object[] data = new Object[1];
			data[0] = "<<<< The Following Warning Constraint Not Registered Properly Register >>" +
					context.getCurrentConstraintId();
			result = context.createFailureStatus(data);
		}

		return result;

	}
}
