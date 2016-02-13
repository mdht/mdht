/*******************************************************************************
 * Copyright (c) 2015
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sarp Kaya (NEHTA) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.common.util;

import java.util.Comparator;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

/**
 * Compare two NamedElement objects, for sorting collections by name.
 *
 * @version $Id: $
 */
public class PropertyComparator implements Comparator<Property> {

	/*
	 * (non-Javadoc)
	 * Compares the associations
	 *
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Property o1, Property o2) {
		Association assoc1 = o1.getAssociation();
		Association assoc2 = o2.getAssociation();
		if (assoc1 == null && assoc2 != null) {
			return -1;
		} else if (assoc1 != null && assoc2 == null) {
			return 1;
		}
		return 0;
	}

}
