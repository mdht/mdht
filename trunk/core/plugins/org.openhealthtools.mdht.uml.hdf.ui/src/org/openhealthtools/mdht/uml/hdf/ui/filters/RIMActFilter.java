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
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;

/**
 * Selects an object if it is a UML Class with applied RIM Act stereotype (or specialization).
 */
public class RIMActFilter implements IFilter {

	public boolean select(Object object) {
		Element element = null;
		if (object instanceof IAdaptable)
			element = (Element) ((IAdaptable)object).getAdapter(Element.class);
		
		return element instanceof Class
				&& RIMProfileUtil.isRIMType(element, IRIMProfileConstants.ACT);
	}

}
