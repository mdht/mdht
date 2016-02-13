/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
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
package org.eclipse.mdht.uml.common.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.common.ui.util.Selections;
import org.eclipse.uml2.uml.Element;

/**
 * Defines utility method to get the testable element from the object to filter
 * on. The order of the check might be of significant if the IAdapable is also an
 * element so we are checking for IAdaptable first.
 */
public class FilterUtil {

	public static Element getElement(Object object) {

		Element element = null;

		if (object instanceof IAdaptable) {
			element = ((IAdaptable) object).getAdapter(Element.class);
		} else {
			EObject eobject = Selections.unwrap(object, EObject.class);
			if (eobject instanceof Element) {
				element = (Element) eobject;
			}
		}

		return element;
	}

}
