/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
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
package org.eclipse.mdht.uml.ui.properties.filters;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

/**
 * Selects an object if it is a UML Classifier, but not an Association.
 */
public class ClassifierNotAssociationFilter extends EObjectFilter {

	@Override
	public boolean select(Object object) {
		Element element = getElement(object);

		return (element instanceof Classifier) && !(element instanceof Association);
	}

}
