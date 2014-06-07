/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.validation.tests.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.validation.provider.AbstractMultiConstraint;

/**
 * Constraints on associations.
 */
public class AssociationConstraints extends AbstractMultiConstraint {

	public IStatus validateAssocIsDirected(IValidationContext ctx) {
		IStatus result;

		Association assoc = (Association) ctx.getTarget();

		int navigable = 0;
		int nonNavigable = 0;

		for (Property next : assoc.getMemberEnds()) {
			if (!assoc.getOwnedEnds().contains(next) || assoc.getNavigableOwnedEnds().contains(next)) {
				navigable++;
			} else {
				nonNavigable++;
			}
		}

		if (navigable + nonNavigable != 1) {
			result = ctx.createFailureStatus(assoc);
		} else {
			result = ctx.createSuccessStatus();
		}

		return result;
	}

}
