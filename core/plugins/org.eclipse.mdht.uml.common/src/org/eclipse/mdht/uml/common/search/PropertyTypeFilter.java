/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.common.search;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @author dcarlson
 *
 */
public class PropertyTypeFilter implements IElementFilter {

	public boolean accept(Element element) {
		// don't accept all subclasses of Class
		return (element.eClass() == UMLPackage.Literals.CLASS || element.eClass() == UMLPackage.Literals.DATA_TYPE ||
				element.eClass() == UMLPackage.Literals.ENUMERATION ||
				element.eClass() == UMLPackage.Literals.PRIMITIVE_TYPE);
	}

}
