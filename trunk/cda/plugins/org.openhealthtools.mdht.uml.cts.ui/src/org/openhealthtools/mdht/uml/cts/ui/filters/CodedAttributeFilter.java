/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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

import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

/**
 * Selects an object if it is a UML Property where type is specialization of HL7 CD.
 */
public class CodedAttributeFilter extends CTSFilter {

	public boolean select(Object object) {
		Element element = getElement(object);
		
		if (element instanceof Property
				&& ((Property)element).getType() instanceof Classifier) {
			Classifier type = (Classifier) ((Property)element).getType();
			if (UMLUtil.isTemplateBinding(type)) {
				List<Classifier> params = UMLUtil.getTemplateBindingParameters(type);
				if (params.size() == 1)
					type = params.get(0);
			}
			
			List<String> allParentNames = UMLUtil.getAllParentNames(type);
			return allParentNames.contains("CD")
					|| allParentNames.contains("SC");
		}
		return false;
	}

}
