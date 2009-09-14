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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * Selects an object if it is a UML Class or Package with 
 * HL7Template stereotype applied.
 */
public class ValidationFilter implements IFilter {

	public static final String CDA_PACKAGE_NAME = "cda";
	
	public boolean select(Object object) {
		Element element = null;
		if (object instanceof Element)
			element = (Element) object;
		else if (object instanceof IAdaptable) {
			element = (Element) ((IAdaptable)object).getAdapter(Element.class);
		}
		
		Class templateClass = null;
		if (element instanceof Class) {
			templateClass = (Class) element;
		}
		else if (element instanceof Property) {
			templateClass = ((Property)element).getClass_();
		}
		
		if (templateClass != null && getCDAClass(templateClass) != null) {
			return true;
		}
		return false;
	}

	private Class getCDAClass(Class templateClass) {
		for (Classifier parent : templateClass.allParents()) {
			if (CDA_PACKAGE_NAME.equals(parent.getNearestPackage().getName()) 
					&& parent instanceof Class) {
				return (Class) parent;
			}
		}
		
		return null;
	}
	
}
