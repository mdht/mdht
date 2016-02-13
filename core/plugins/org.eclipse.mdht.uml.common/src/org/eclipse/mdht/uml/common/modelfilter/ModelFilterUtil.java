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
package org.eclipse.mdht.uml.common.modelfilter;

import org.eclipse.mdht.uml.common.util.NamedElementUtil;
import org.eclipse.uml2.uml.NamedElement;

/**
 * @author dcarlson
 *
 */
public class ModelFilterUtil {

	protected static final String FILTER_HIDE = "hide";

	protected static final String FILTER_SHOW = "show";

	protected static final String FILTER_COLLAPSE = "collapse";

	/**
	 * Returns whether the named element is hidden, false if not defined.
	 *
	 * @param namedElement
	 *            The named element.
	 * @return true if filtered property is "hide", otherwise false.
	 */
	public static boolean isHidden(NamedElement namedElement) {
		if (isHiddenByUser(namedElement)) {
			return true;
		} else if (isShownByUser(namedElement)) {
			return false;
		} else if (isCollapsedByUser(namedElement)) {
			return false;
		} else {
			return false;
			// return isHiddenByFilterProvider(namedElement);
		}
	}

	protected static boolean isHiddenByUser(NamedElement namedElement) {
		String value = NamedElementUtil.getPropertyValue(namedElement, "filter");
		return FILTER_HIDE.equals(value)
				? true
				: false;
	}

	protected static boolean isHiddenByFilterProvider(NamedElement namedElement) {
		IModelFilterProvider provider = ModelFilterRegistry.INSTANCE.getModelFilterProvider(namedElement);
		if (provider != null) {
			return provider.isHidden(namedElement);
		}

		return false;
	}

	public static boolean isShown(NamedElement namedElement) {
		return isShownByUser(namedElement);
	}

	protected static boolean isShownByUser(NamedElement namedElement) {
		String value = NamedElementUtil.getPropertyValue(namedElement, "filter");
		return FILTER_SHOW.equals(value)
				? true
				: false;
	}

	/**
	 * Returns whether the named element is collapsed, false if not defined.
	 *
	 * @param namedElement
	 *            The named element.
	 * @return true if filtered property is "collapse", otherwise false.
	 */
	public static boolean isCollapsed(NamedElement namedElement) {
		return isCollapsedByUser(namedElement)
				? true
				: isCollapsedByFilterProvider(namedElement);
	}

	protected static boolean isCollapsedByUser(NamedElement namedElement) {
		String value = NamedElementUtil.getPropertyValue(namedElement, "filter");
		return FILTER_COLLAPSE.equals(value)
				? true
				: false;
	}

	protected static boolean isCollapsedByFilterProvider(NamedElement namedElement) {
		IModelFilterProvider provider = ModelFilterRegistry.INSTANCE.getModelFilterProvider(namedElement);
		if (provider != null) {
			return provider.isCollapsed(namedElement);
		}

		return false;
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

	public static void setTypeReplacement(NamedElement namedElement, String qualifiedName) {
		setTypeProperty(namedElement, qualifiedName);
	}

	public static String getTypeReplacement(NamedElement namedElement) {
		return NamedElementUtil.getPropertyValue(namedElement, "type");
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

	/**
	 * Sets the 'type' property for the specified named element.
	 *
	 * @param namedElement
	 *            The named element.
	 * @param typeQName
	 *            qualified name for model element
	 */
	protected static void setTypeProperty(NamedElement namedElement, String typeQName) {
		NamedElementUtil.setPropertyValue(namedElement, "type", typeQName);
	}

}
