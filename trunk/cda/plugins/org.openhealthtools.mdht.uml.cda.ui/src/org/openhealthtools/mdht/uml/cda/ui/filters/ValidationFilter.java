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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.ui.filters.HDFFilterUtil;

/**
 * Selects an object if it is a UML Class or Package with 
 * HL7Template stereotype applied.
 */
public class ValidationFilter extends CDAFilter {


	
	public boolean select(Object object) {
		
		Element element = getElement(object);
		
		Class templateClass = null;
		if (element instanceof Class) {
			templateClass = (Class) element;
		}
		else if (element instanceof Property) {
			templateClass = ((Property)element).getClass_();
		}
		else if (element instanceof Association) {
			templateClass = ((Association)element).getMemberEnds().get(0).getClass_();
		}
		else if (element instanceof Constraint
				&& ((Constraint)element).getContext() instanceof Class) {
			templateClass = (Class) ((Constraint)element).getContext();
		}
		
		if (templateClass != null && getCDAClass(templateClass) != null) {
			return true;
		}
		return false;
	}

	
	
}
