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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;

/**
 * Selects an object if it is a UML Class or Package with 
 * HL7Template stereotype applied.
 */
public class HL7TemplateFilter implements IFilter {

	public boolean select(Object object) {
		Element element = null;
		if (object instanceof IAdaptable)
			element = (Element) ((IAdaptable)object).getAdapter(Element.class);
		
		if (element instanceof Class || element instanceof Package) {
			Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
					element, IHDFProfileConstants.HL7_TEMPLATE);
			if (stereotype != null) {
				return true;
			}
			else if (element instanceof Class) {
				// Enable for any class whose parent has RIM stereotype,
				// implying that this is a RIM restriction and may be a template.
				for (Classifier parent : ((Class)element).parents()) {
					if (RIMProfileUtil.getRIMStereotype(parent) != null) {
						Stereotype group = HL7ResourceUtil.getAppliedHDFStereotype(
								parent, IHDFProfileConstants.CHOICE_GROUP);
						// cannot have ChoiceGroup applied
						return group == null;
					}
				}
			}
		}
		return false;
	}

}
