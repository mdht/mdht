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
package org.openhealthtools.mdht.uml.hdf.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.uml2.uml.Element;

/**
 * Defines utility method to get the testable element from the object to filter
 * on. In RSM the object is IAdaptable - in Papyrus the object is of type
 * element;
 * 
 * The order of the check might be of significanse if the IAdapable is also an
 * element so we are checking for IAdaptable first.
 */
public class HDFFilterUtil {

	public static Element getElement(Object object) {
		
		Element element = null;

		if (object instanceof IAdaptable) {
			element = (Element) ((IAdaptable) object).getAdapter(Element.class);
		} else {
			if (object instanceof Element) {
				element = (Element) object;
			}
		}

		return element;
	}

}
