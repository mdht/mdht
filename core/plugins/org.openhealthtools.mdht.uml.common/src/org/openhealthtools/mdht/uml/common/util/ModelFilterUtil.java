/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.common.util;

import org.eclipse.uml2.uml.NamedElement;

/**
 * @author dcarlson
 * 
 */
public class ModelFilterUtil {

	public static final String FILTER_HIDE = "hide";

	public static final String FILTER_SHOW = "show";

	public static final String FILTER_COLLAPSE = "collapse";

	/**
	 * Returns whether the named element is hidden, false if not defined.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @return true if filtered property is "hide", otherwise false.
	 */
	public static boolean isHidden(NamedElement namedElement) {
		String value = NamedElementUtil.getPropertyValue(namedElement, "filter");
		return FILTER_HIDE.equals(value)
				? true
				: false;
	}

	public static boolean isShown(NamedElement namedElement) {
		return !isHidden(namedElement);
	}

	/**
	 * Returns whether the named element is collapsed, false if not defined.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @return true if filtered property is "collapse", otherwise false.
	 */
	public static boolean isCollapsed(NamedElement namedElement) {
		String value = NamedElementUtil.getPropertyValue(namedElement, "filter");
		return FILTER_COLLAPSE.equals(value)
				? true
				: false;
	}

	/**
	 * Returns whether the named element has filter state defined.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @return true if filtered property is defined.
	 */
	public static boolean hasFilterState(NamedElement namedElement) {
		String value = NamedElementUtil.getPropertyValue(namedElement, "filter");
		return value != null;
	}

	/**
	 * Removes the "filter" property that is currently set for the specified named
	 * element, if any.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @return The "filter" value that was set for the element (if one
	 *         existed); otherwise <code>null</code>.
	 */
	public static String removeFilterState(NamedElement namedElement) {
		return NamedElementUtil.removePropertyValue(namedElement, "filter");
	}

	public static void setAsHidden(NamedElement namedElement) {
		setFilterProperty(namedElement, FILTER_HIDE);
	}

	public static void setAsShown(NamedElement namedElement) {
		setFilterProperty(namedElement, FILTER_SHOW);
	}

	public static void setAsCollapsed(NamedElement namedElement) {
		setFilterProperty(namedElement, FILTER_COLLAPSE);
	}

	/**
	 * Sets filter state for the specified named element.
	 * 
	 * @param namedElement
	 *            The named element.
	 * @param filterState
	 *            enumerated value
	 */
	protected static void setFilterProperty(NamedElement namedElement, String filterState) {
		NamedElementUtil.setPropertyValue(namedElement, "filter", filterState);
	}

}
