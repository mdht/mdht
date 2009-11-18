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
package org.openhealthtools.mdht.uml.common.notation;

import org.eclipse.uml2.uml.Element;

public interface INotationProvider {

	/**
	 * Returns the complete print string for displaying a model element.
	 */
	public String getPrintString(Element element);
	
	/**
	 * Returns only the annotations for a model element.
	 */
	public String getAnnotation(Element element);

}
