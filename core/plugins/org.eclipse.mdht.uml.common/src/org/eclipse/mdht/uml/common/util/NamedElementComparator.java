/*******************************************************************************
 * Copyright (c) 2006, 2010 David A Carlson.
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
package org.eclipse.mdht.uml.common.util;

import java.util.Comparator;

import org.eclipse.uml2.uml.NamedElement;

/**
 * Compare two NamedElement objects, for sorting collections by name.
 *
 * @version $Id: $
 */
public class NamedElementComparator implements Comparator<NamedElement> {

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(NamedElement o1, NamedElement o2) {
		String name1 = (o1).getName();
		String name2 = (o2).getName();
		if (name1 != null && name2 != null) {
			return name1.compareToIgnoreCase(name2);
		} else {
			return 0;
		}
	}

}
