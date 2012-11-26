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
package org.openhealthtools.mdht.uml.cda.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.common.ui.filters.WrapperAwareFilter;

/**
 * Abstract class for filters that are based on CDA parent type.
 */
public abstract class CDAFilter extends WrapperAwareFilter {

	public static final String CDA_PACKAGE_NAME = "cda";

	public abstract boolean select(Object object);

	/**
	 * Defines utility method to get the testable element from the object to filter
	 * on. In RSM the object is IAdaptable - in Papyrus the object is of type
	 * element;
	 * 
	 * The order of the check might be of significant if the IAdapable is also an
	 * element so we are checking for IAdaptable first.
	 */
	protected Element getElement(Object object) {
		Element element = null;
		if (object instanceof IAdaptable) {
			element = (Element) ((IAdaptable) object).getAdapter(Element.class);
		} else {
			EObject eobject = getEObject(object);
			if (eobject instanceof Element) {
				element = (Element) eobject;
			}
		}

		return element;
	}

}
