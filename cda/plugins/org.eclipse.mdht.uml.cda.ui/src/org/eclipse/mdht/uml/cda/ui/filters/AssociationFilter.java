/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
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
package org.eclipse.mdht.uml.cda.ui.filters;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * Selects an object if it is a UML Property with
 * a Terminology stereotype applied.
 */
public class AssociationFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		if (element instanceof Association) {
			Property navEnd = CDAModelUtil.getNavigableEnd((Association) element);
			return (navEnd != null && CDAModelUtil.getCDAClass(navEnd.getClass_()) != null);
		}

		return false;
	}

}
