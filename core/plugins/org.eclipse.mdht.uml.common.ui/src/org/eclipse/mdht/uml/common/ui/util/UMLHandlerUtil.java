/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.util;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Utilities for working with UML-oriented command handlers.
 */
public class UMLHandlerUtil {

	/**
	 * Not instantiable by clients.
	 */
	private UMLHandlerUtil() {
		super();
	}

	public static <T extends EObject> T getSelectedElement(ExecutionEvent event,
			java.lang.Class<? extends T> selectionType) {

		T result = null;

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			result = getSelectedElement((IStructuredSelection) selection, selectionType);
		}

		return result;
	}

	public static <T extends EObject> T getSelectedElementChecked(ExecutionEvent event,
			java.lang.Class<? extends T> selectionType) throws ExecutionException {

		T result = null;

		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if (selection instanceof IStructuredSelection) {
			result = getSelectedElement((IStructuredSelection) selection, selectionType);
		}

		if (result == null) {
			throw new ExecutionException(
				NLS.bind("No selected element of type {0} available.", selectionType.getSimpleName()));
		}

		return result;
	}

	public static <T extends EObject> T getSelectedElement(IStructuredSelection selection,
			java.lang.Class<? extends T> selectionType) {

		T result = null;

		for (Iterator<?> iter = selection.iterator(); (result == null) && iter.hasNext();) {
			Object next = iter.next();

			// adapt (Eclipse-ishly)
			if (next instanceof IAdaptable) {
				next = ((IAdaptable) next).getAdapter(EObject.class);
			}

			// unwrap (EMF-ishly)
			next = AdapterFactoryEditingDomain.unwrap(next);

			// unview (GMF-ishly)
			if (next instanceof View) {
				next = ((View) next).getElement();
			}

			if (selectionType.isInstance(next)) {
				@SuppressWarnings("unchecked")
				T t = (T) next;
				result = t;
			}
		}

		return result;
	}
}
