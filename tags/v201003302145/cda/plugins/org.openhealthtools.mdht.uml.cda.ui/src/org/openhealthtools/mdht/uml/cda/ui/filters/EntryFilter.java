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

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;

/**
 * Selects an object if it is an association applicable to <<Entry>> stereotype.
 */
public class EntryFilter extends CDAFilter {
	
	public boolean select(Object object) {
		Element element = getElement(object);
		
		if (element instanceof Association && isEntry((Association) element)) {
			return true;
		}
		return false;
	}
	
	private boolean isEntry(Association association) {
		Type srcType = null;
		Type targetType = null;
		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable())
				targetType = property.getType();
			else
				srcType = property.getType();
		}
		
		return CDAModelUtil.isSection(srcType) && 
			(CDAModelUtil.isSection(targetType) || CDAModelUtil.isClinicalStatement(targetType));
	}

}