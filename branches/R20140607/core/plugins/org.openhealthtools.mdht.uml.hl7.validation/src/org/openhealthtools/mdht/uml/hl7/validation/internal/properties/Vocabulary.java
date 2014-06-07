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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.openhealthtools.mdht.uml.hl7.validation.internal.HL7AbstractConstraint;

/**
 * 
 * $Id: $
 */
public class Vocabulary extends HL7AbstractConstraint {

	@Override
	public IStatus validate(IValidationContext context) {
		// test valid facet names and values, relative to xsd datatype

		return context.createSuccessStatus();
	}

}
