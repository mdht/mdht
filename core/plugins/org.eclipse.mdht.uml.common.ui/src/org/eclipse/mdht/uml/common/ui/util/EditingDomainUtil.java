/*******************************************************************************
 * Copyright (c) 2004, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.common.ui.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.jface.viewers.IStructuredSelection;

public class EditingDomainUtil {

	public static TransactionalEditingDomain getEditingDomain(Collection elements) {
		TransactionalEditingDomain editingDomain = null;
		Iterator it = elements.iterator();
		while (it.hasNext() && (editingDomain == null)) {
			Object element = unwrap(it.next());
			editingDomain = TransactionUtil.getEditingDomain(element);
			if (editingDomain == null && element instanceof EObject && ((EObject) element).eResource() != null) {
				editingDomain = WorkspaceEditingDomainFactory.INSTANCE.createEditingDomain(
					((EObject) element).eResource().getResourceSet());
			}
		}
		return editingDomain;
	}

	private static Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return unwrap(((IStructuredSelection) element).getFirstElement());
		}
		if (element instanceof IAdaptable) {
			EObject eObject = ((IAdaptable) element).getAdapter(EObject.class);
			if (eObject != null) {
				return eObject;
			}
		}
		return element;
	}

}
