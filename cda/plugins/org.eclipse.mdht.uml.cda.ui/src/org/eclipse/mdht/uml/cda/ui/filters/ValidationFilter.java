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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;

/**
 * Selects an object if it is a UML Class or Package with
 * HL7Template stereotype applied.
 */
public class ValidationFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = null;
		if (object instanceof Element) {
			element = (Element) object;
		} else if (object instanceof IAdaptable) {
			element = ((IAdaptable) object).getAdapter(Element.class);
		}

		Class templateClass = null;
		if (element instanceof Class) {
			templateClass = (Class) element;
		} else if (element instanceof Property) {
			templateClass = ((Property) element).getClass_();
		} else if (element instanceof Association) {
			templateClass = ((Association) element).getMemberEnds().get(0).getClass_();
		} else if (element instanceof Constraint && ((Constraint) element).getContext() instanceof Class) {
			templateClass = (Class) ((Constraint) element).getContext();
		} else if (element instanceof Generalization && ((Generalization) element).getSpecific() instanceof Class) {
			templateClass = (Class) ((Generalization) element).getSpecific();
		}

		if (templateClass != null && (CDAModelUtil.getCDAClass(templateClass) != null ||
				CDAModelUtil.getCDADatatype(templateClass) != null)) {
			return true;
		}
		return false;
	}

}
