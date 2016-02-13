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
package org.eclipse.mdht.uml.ui.properties.filters;

import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * Selects an object if it is a UML NamedElement, but not an Association.
 */
public class NamedElementNonNavAssociationFilter extends EObjectFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		// true for non-navigable or non-directed associations
		if (element instanceof Association) {
			Property navEnd = UMLUtil.getNavigableEnd((Association) element);
			return navEnd == null;
		}

		return (element instanceof NamedElement);
	}

}
