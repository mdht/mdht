/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cts.ui.filters;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cts.core.util.CTSProfileUtil;
import org.openhealthtools.mdht.uml.cts.core.util.ICTSProfileConstants;

/**
 * Selects an object if it is a UML Property with 
 * ValueSetConstraint stereotype applied.
 */
public class ValueSetFilter extends CTSFilter {

	public boolean select(Object object) {
		Element element = getElement(object);
		
		if (element instanceof Property) {
			Stereotype stereotype = CTSProfileUtil.getAppliedCTSStereotype(
					element, ICTSProfileConstants.VALUE_SET_CONSTRAINT);
			return stereotype != null;
		}
		return false;
	}

}
