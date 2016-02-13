/*******************************************************************************
 * Copyright (c) 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - support nested datatype subclasses (artf3350)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.filters;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * Selects an object if it is a UML Property.
 */
public class PropertyFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		if (element instanceof Property) {
			Class ownerClass = ((Property) element).getClass_();
			return (ownerClass != null) && ((CDAModelUtil.getCDAClass(ownerClass) != null) ||
					(CDAModelUtil.getCDADatatype(ownerClass) != null));
		}

		return false;
	}

}
