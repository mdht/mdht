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
package org.openhealthtools.mdht.uml.hdf.ui.filters;

import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.common.ui.filters.HDFFilterUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

/**
 * Selects an object if it is a UML Property with 
 * ValueSetConstraint stereotype applied.
 */
public class ValueSetFilter implements IFilter {

	public boolean select(Object object) {
		Element element = HDFFilterUtil.getElement(object);
		
		if (element instanceof Property) {
			Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
					element, IHDFProfileConstants.VALUE_SET_CONSTRAINT);
			return stereotype != null;
		}
		return false;
	}

}
