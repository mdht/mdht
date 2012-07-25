/**
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     
 */
package org.openhealthtools.mdht.uml.validation.tests.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.NamedElement;
import org.openhealthtools.mdht.uml.validation.provider.AbstractMultiConstraint;

/**
 * Test constraints on named elements.
 */
public class NamedElementConstraints extends AbstractMultiConstraint {

	public NamedElementConstraints() {
		super();
	}

	public IStatus validateMustHaveName(IValidationContext ctx) {
		IStatus result;

		NamedElement named = (NamedElement) ctx.getTarget();
		String name = named.getName();

		if ((name == null) || name.trim().equals("")) {
			result = ctx.createFailureStatus(named);
		} else {
			result = ctx.createSuccessStatus();
		}

		return result;
	}
}
