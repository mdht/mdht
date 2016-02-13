/*******************************************************************************
 * Copyright (c) 2010 David A Carlson and others.
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

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;

/**
 * Selects an object if it is an association applicable to <<ActRelationship>> stereotype.
 */
public class ConformsToFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		Class templateClass = null;
		if (element instanceof Generalization && ((Generalization) element).getSpecific() instanceof Class) {
			templateClass = (Class) ((Generalization) element).getSpecific();
		}

		if (templateClass != null && CDAModelUtil.getCDAClass(templateClass) != null) {
			return true;
		}

		return false;
	}

}
