/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;

/**
 * Selects an object if it is a UML Class or Package with
 * HL7Template stereotype applied.
 */
public class InlineFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = null;
		if (object instanceof Element) {
			element = (Element) object;
		} else if (object instanceof IAdaptable) {
			element = ((IAdaptable) object).getAdapter(Element.class);
		}

		if (element instanceof Class &&
				(element.getOwner() instanceof Class || CDAModelUtil.isInlineClass((Class) element))) {
			return true;
		}
		return false;
	}

}
