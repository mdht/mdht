/*******************************************************************************
 * Copyright (c) 2010 Sean Muir
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

package org.openhealthtools.mdht.uml.cda.validation.internal.classifiers;

import java.util.HashMap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

/**
 * 
 * $Id: $
 */
public class Associations extends AbstractModelConstraint {

	private static void initialize() {

	}

	private static HashMap<String, AbstractModelConstraint> constraints = new HashMap<String, AbstractModelConstraint>();

	public static void registerConstraints(String id, AbstractModelConstraint constraint) {

		if (id != null && constraint != null) {
			constraints.put(id, constraint);
		}
	}

	@Override
	public IStatus validate(IValidationContext context) {

		IStatus result = context.createSuccessStatus();

		if (constraints.size() == 0) {
			initialize();
		}

		if (constraints.containsKey(context.getCurrentConstraintId())) {
			result = constraints.get(context.getCurrentConstraintId()).validate(context);
		} else {
			Object[] data = new Object[1];
			data[0] = "<<<< The Following Warning Constraint Not Registered Properly Register >>" +
					context.getCurrentConstraintId();
			result = context.createFailureStatus(data);
		}

		return result;

	}

}
