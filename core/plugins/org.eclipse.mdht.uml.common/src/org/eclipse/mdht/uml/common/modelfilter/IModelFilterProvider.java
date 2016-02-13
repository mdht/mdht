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
 *******************************************************************************/
package org.eclipse.mdht.uml.common.modelfilter;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;

/**
 * @author dcarlson
 *
 */
public interface IModelFilterProvider {

	/**
	 * Returns whether the named element is hidden, false if not defined.
	 */
	public boolean isHidden(NamedElement namedElement);

	/**
	 * Returns whether the named element is collapsed, false if not defined.
	 */
	public boolean isCollapsed(NamedElement namedElement);

	public Classifier getFilteredType(Property property);

}
