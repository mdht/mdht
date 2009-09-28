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
import org.eclipse.uml2.uml.Type;

/**
 * Abstract class for filters that are based on CDA parent type.
 */
public abstract class CDAFilter implements IFilter {

	public static final String CDA_PACKAGE_NAME = "cda";
	
	public abstract boolean select(Object object);

	protected Element getElement(Object object) {
		Element element = null;
		if (object instanceof Element)
			element = (Element) object;
		else if (object instanceof IAdaptable)
			element = (Element) ((IAdaptable)object).getAdapter(Element.class);
		
		return element;
	}

	protected Class getCDAClass(Class templateClass) {
		Class cdaClass = null;
		
		// if the provided class is from CDA and not a template
		if (CDA_PACKAGE_NAME.equals(templateClass.getNearestPackage().getName()))
			return templateClass;
		
		for (Classifier parent : templateClass.allParents()) {
			// nearest package may be null if CDA model is not available
			if (parent.getNearestPackage() != null) {
				if (CDA_PACKAGE_NAME.equals(parent.getNearestPackage().getName()) && parent instanceof Class) {
					cdaClass = (Class) parent;
					break;
				}
			}
		}
		
		return cdaClass;
	}

	protected boolean isSection(Type templateClass) {
		if (templateClass instanceof Class) {
			Class cdaClass = getCDAClass((Class)templateClass);
			if (cdaClass != null && "Section".equals(cdaClass.getName()))
				return true;
		}
		
		return false;
	}
	
	protected boolean isClinicalStatement(Type templateClass) {
		if (templateClass instanceof Class) {
			Class cdaClass = getCDAClass((Class)templateClass);
			String cdaName = cdaClass==null ? null : cdaClass.getName();
			if (cdaClass != null && (
					"Act".equals(cdaName) || "Encounter".equals(cdaName)
					|| "Observation".equals(cdaName) || "ObservationMedia".equals(cdaName)
					|| "Organizer".equals(cdaName) || "Procedure".equals(cdaName)
					|| "RegionOfInterest".equals(cdaName) || "SubstanceAdministration".equals(cdaName)
					|| "Supply".equals(cdaName))) {
				return true;
			}
		}
		
		return false;
	}
	
}
