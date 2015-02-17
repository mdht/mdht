/*******************************************************************************
 * Copyright (c) 2009, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hl7.validation.internal.properties.modelconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;
import org.openhealthtools.mdht.uml.hl7.validation.internal.properties.Properties;

public class MissingTypeConstraint extends HL7AbstractConstraint {

	private static final String ID_MISSINGTYPE = PROPERTIES_GROUP + "missingType";

	public static void register() {
		Properties.registerConstraints(ID_MISSINGTYPE, new MissingTypeConstraint());
	}

	@Override
	public IStatus validate(IValidationContext context) {

		Property property = (Property) context.getTarget();

		IStatus result = null;

		if (property.getType() == null) {
			Object[] data = { property.getName() };
			result = context.createFailureStatus(data);
		} else {
			result = context.createSuccessStatus();
		}

		return result;
	}

}
