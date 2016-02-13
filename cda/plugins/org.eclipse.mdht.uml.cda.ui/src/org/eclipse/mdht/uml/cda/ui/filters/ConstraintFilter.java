/*******************************************************************************
 * Copyright (c) 2010, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - support for local CDA datatype subclasses (artf3350)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.filters;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;

/**
 * Selects an object if it is UML Constraint.
 */
public class ConstraintFilter extends CDAFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);
		boolean result = (element instanceof Constraint);

		if (result) {
			Constraint constraint = (Constraint) element;

			// constraint context must be a classifier derived from CDA
			Namespace context = constraint.getContext();
			result = (context instanceof Classifier);
			if (result) {
				Classifier classifier = (Classifier) context;
				result = (CDAModelUtil.getCDAClass(classifier) != null) ||
						(CDAModelUtil.getCDADatatype(classifier) != null);
			}
		}

		return result;
	}

}
