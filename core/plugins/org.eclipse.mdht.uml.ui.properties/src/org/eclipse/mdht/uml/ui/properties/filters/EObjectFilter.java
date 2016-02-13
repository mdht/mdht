/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.properties.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.common.ui.filters.WrapperAwareFilter;
import org.eclipse.uml2.uml.Element;

/**
 * Abstract class for filters that are UML Elements or implement IAdaptable to get an Element.
 */
public abstract class EObjectFilter extends WrapperAwareFilter {

	public abstract boolean select(Object object);

	/**
	 * Defines utility method to get the testable element from the object to filter on.
	 *
	 * The order of the check might be of significant if the IAdapable is also an
	 * element so we are checking for IAdaptable first.
	 */
	protected Element getElement(Object object) {
		Element element = null;
		if (object instanceof IAdaptable) {
			element = ((IAdaptable) object).getAdapter(Element.class);
		} else {
			EObject eobject = getEObject(object);
			if (eobject instanceof Element) {
				element = (Element) eobject;
			}
		}

		return element;
	}

}
