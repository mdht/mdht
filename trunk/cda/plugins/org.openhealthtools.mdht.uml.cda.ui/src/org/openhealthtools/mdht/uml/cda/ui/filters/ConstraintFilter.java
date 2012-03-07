/*******************************************************************************
 * Copyright (c) 2010 David A Carlson and others.
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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;

/**
 * Selects an object if it is UML Constraint.
 */
public class ConstraintFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		// constraint context must be a classifier derived from CDA
		if (element instanceof Constraint && (((Constraint) element).getContext() instanceof Classifier)) {
			return CDAModelUtil.getCDAClass((Classifier) ((Constraint) element).getContext()) != null;
		}
		return element instanceof Constraint;
	}

}
