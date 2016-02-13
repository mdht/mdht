/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.common.ui.search;

import org.eclipse.uml2.uml.Element;

/**
 * Used by ModelSearch to filter search results.
 */
public interface IElementFilter {

	/**
	 * Returns true if this element is acceptable to the filter.
	 *
	 * @param element
	 * @return true if accepted
	 */
	public boolean accept(Element element);

}
