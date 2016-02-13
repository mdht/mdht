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
package org.eclipse.mdht.uml.cda.ui.filters;

import java.util.List;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

/**
 * Selects an object if it is a UML Property where type is specialization of HL7 EN.
 */
public class TextAttributeFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {

		Element element = getElement(object);

		// property is owned by a class derived from CDA, and type is a Classifier
		if (element instanceof Property &&
				(CDAModelUtil.getCDAClass(((Property) element).getClass_()) != null ||
						CDAModelUtil.getCDADatatype(((Property) element).getClass_()) != null) &&
				((Property) element).getType() instanceof Classifier) {
			Classifier type = (Classifier) ((Property) element).getType();
			List<String> allParentNames = UMLUtil.getAllParentNames(type);
			return allParentNames.contains("ED") || allParentNames.contains("EN") || allParentNames.contains("AD") ||
					allParentNames.contains("ON");
		}
		return false;
	}

}
