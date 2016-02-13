/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.util;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

/**
 * Utility methods for working with {@link ISelection}s and {@link IStructuredSelection}s.
 */
public class Selections {

	/**
	 * Not instantiable by clients.
	 */
	private Selections() {
		super();
	}

	/**
	 * Queries whether a given {@code selection} includes an object wrapper, such as is used for including cross-referenced content or attribute
	 * values in in the tree under referencing objects.
	 *
	 * @param selection
	 *            a selection
	 * @return whether it contains any wrapper item-providers
	 *
	 * @see #includesWrappers(ISelection, Class)
	 */
	public static boolean includesWrappers(ISelection selection) {
		return (selection instanceof IStructuredSelection) && includesWrappers((IStructuredSelection) selection);
	}

	/**
	 * Queries whether a given {@code selection} includes an object wrapper, such as is used for including cross-referenced content or attribute
	 * values in in the tree under referencing objects.
	 *
	 * @param selection
	 *            a selection
	 * @return whether it contains any wrapper item-providers
	 *
	 * @see #includesWrappers(IStructuredSelection, Class)
	 */
	public static boolean includesWrappers(IStructuredSelection selection) {
		boolean result = false;

		for (Iterator<?> iter = selection.iterator(); !result && iter.hasNext();) {
			Object next = iter.next();
			if (unwrap(next) != next) {
				result = true;
			}
		}

		return result;
	}

	/**
	 * Queries whether a given {@code selection} includes a wrapper for an object of the specified {@code type}.
	 *
	 * @param selection
	 *            a selection
	 * @param type
	 *            the type of wrapped object
	 * @return whether the {@code selection} contains any wrapper item-providers for objects of the given {@code type}
	 */
	public static boolean includesWrappers(ISelection selection, Class<?> type) {
		return (selection instanceof IStructuredSelection) && includesWrappers((IStructuredSelection) selection, type);
	}

	/**
	 * Queries whether a given {@code selection} includes a wrapper for an object of the specified {@code type}.
	 *
	 * @param selection
	 *            a selection
	 * @param type
	 *            the type of wrapped object
	 * @return whether the {@code selection} contains any wrapper item-providers for objects of the given {@code type}
	 */
	public static boolean includesWrappers(IStructuredSelection selection, Class<?> type) {
		boolean result = false;

		for (Iterator<?> iter = selection.iterator(); !result && iter.hasNext();) {
			Object next = iter.next();
			Object unwrapped = unwrap(next);
			if ((unwrapped != next) && type.isInstance(unwrapped)) {
				result = true;
			}
		}

		return result;
	}

	/**
	 * Unwraps the given object, if it is a wrapper.
	 *
	 * @param possibleWrapper
	 *            an object that may or may not be a wrapper
	 *
	 * @return the unwrapped object
	 */
	public static Object unwrap(Object possibleWrapper) {
		Object result = AdapterFactoryEditingDomain.unwrap(possibleWrapper);

		// deeper in the tree, we have wrappers of wrappers
		while (result != possibleWrapper) {
			possibleWrapper = result;
			result = AdapterFactoryEditingDomain.unwrap(possibleWrapper);
		}

		return result;
	}

	/**
	 * Unwraps the given object, if it is a wrapper, to yield a wrapped object of the specified {@code type}.
	 *
	 * @param possibleWrapper
	 *            an object that may or may not be a wrapper
	 * @param type
	 *            the type of the object that is expected to be wrapped
	 *
	 * @return the unwrapped object, or <code>null</code> if it is not of the required {@code type}
	 */
	@SuppressWarnings("unchecked")
	public static <T> T unwrap(Object possibleWrapper, Class<? extends T> type) {
		Object result = AdapterFactoryEditingDomain.unwrap(possibleWrapper);

		// deeper in the tree, we have wrappers of wrappers
		while (result != possibleWrapper) {
			possibleWrapper = result;
			result = AdapterFactoryEditingDomain.unwrap(possibleWrapper);
		}

		return type.isInstance(result)
				? (T) result
				: null;
	}

	/**
	 * Unwraps the elements in a selection.
	 *
	 * @param selection
	 *            a selection that may or may not include wrappers
	 *
	 * @return the unwrapped selection, or the original {@code selection} if it doesn't have any wrappers anyways
	 *
	 * @see #includesWrappers(ISelection)
	 */
	public static ISelection unwrap(final ISelection selection) {
		return (selection instanceof IStructuredSelection)
				? unwrap((IStructuredSelection) selection)
				: selection;
	}

	/**
	 * Unwraps the elements in a selection.
	 *
	 * @param selection
	 *            a selection that may or may not include wrappers
	 *
	 * @return the unwrapped selection, or the original {@code selection} if it doesn't have any wrappers anyways
	 *
	 * @see #includesWrappers(IStructuredSelection)
	 */
	public static IStructuredSelection unwrap(final IStructuredSelection selection) {
		List<Object> result = null;
		List<Object> unwrappedElements = new java.util.ArrayList<Object>(selection.size());

		for (Object next : selection.toList()) {
			Object unwrapped = unwrap(next);
			unwrappedElements.add(unwrapped);

			if (unwrapped != next) {
				// need to create and return a new selection
				result = unwrappedElements;
			}
		}

		return (result == null)
				? selection
				: new StructuredSelection(result);
	}
}
