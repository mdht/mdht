/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - Handle element wrappers (artf3238)
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.common.ui.filters.WrapperAwareFilter;
import org.eclipse.uml2.uml.Element;

/**
 * Filters UML elements in user interface.
 */
public abstract class AbstractFilter extends WrapperAwareFilter {

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
