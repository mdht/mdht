/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.openhealthtools.mdht.uml.term.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Element;

/**
 * Filters UML elements in user interface.
 */
public abstract class CTSFilter implements IFilter {

	protected Element getElement(Object object) {
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
