/*****************************************************************************
 * Copyright (c) 2009 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Yann TANGUY (CEA LIST) yann.tanguy@cea.fr - Initial API and implementation
 *
 *****************************************************************************/
package org.eclipse.mdht.uml.common.util;

import org.eclipse.uml2.uml.MultiplicityElement;

/**
 * Utility class for <code>org.eclipse.uml2.uml.MultiplicityElement</code><BR>
 */
public class MultiplicityElementUtil {

	/**
	 * Return the multiplicity of the element "[x..y]"
	 *
	 * @return the string representing the multiplicity
	 */
	public static String getMultiplicityAsString(MultiplicityElement element) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(" [");
		buffer.append(getMultiplicityAsStringWithoutSquareBrackets(element));
		buffer.append("]");
		return buffer.toString();
	}

	/**
	 * Returns the String corresponding to the multiplicity without square
	 * brackets
	 *
	 * @return the string representing the multiplicity, without square brackets
	 */
	private static String getMultiplicityAsStringWithoutSquareBrackets(MultiplicityElement element) {
		StringBuffer buffer = new StringBuffer();
		// special case for [1] and [*]
		int lower = element.getLower();
		int upper = element.getUpper();

		if (lower == upper) {
			buffer.append(lower);
		} else if ((lower == 0) && (upper == -1)) {
			buffer.append("0..*");
		} else if (upper == -1) {
			buffer.append(lower);
			buffer.append("..*");
		} else {
			buffer.append(lower);
			buffer.append("..");
			buffer.append(upper);
		}

		return buffer.toString();
	}
}
