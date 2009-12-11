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
package org.openhealthtools.mdht.uml.cda.ui.filters;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;

/**
 * Selects an object if it is a UML Class or Package with 
 * HL7Template stereotype applied.
 */
public class TemplateFilter extends CDAFilter {
	
	public boolean select(Object object) {
		Element element = null;
		if (object instanceof Element)
			element = (Element) object;
		else if (object instanceof IAdaptable)
			element = (Element) ((IAdaptable)object).getAdapter(Element.class);
		
		if (element instanceof Class && getCDAClass((Class) element) != null) {
			return true;
		}
		return false;
	}

}
