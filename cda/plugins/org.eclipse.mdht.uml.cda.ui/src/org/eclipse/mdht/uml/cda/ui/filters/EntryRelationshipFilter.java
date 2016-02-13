/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added check for Organizer
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.filters;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * Selects an object if it is an association applicable to <<EntryRelationship>> stereotype.
 */
public class EntryRelationshipFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		if (element instanceof Association && isEntryRelationship((Association) element)) {
			return true;
		}
		return false;
	}

	private boolean isEntryRelationship(Association association) {
		Type srcType = null;
		Type targetType = null;
		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {
				targetType = property.getType();
			} else {
				srcType = property.getType();
			}
		}

		return CDAModelUtil.isClinicalStatement(srcType) && CDAModelUtil.isClinicalStatement(targetType) &&
				!CDAModelUtil.isOrganizer(srcType);
	}

}
