/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.ui.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.NamedElement;

/**
 * Open a simple dialog to search for and open model elements.
 */
public class OpenElementDelegate implements IActionDelegate, IEditorActionDelegate, IWorkbenchWindowActionDelegate {

	private EObject selectedEObject;

	private IEditorPart editor;

	protected IWorkbenchWindow activeWindow = null;

	public OpenElementDelegate() {
		super();
	}

	public void run(IAction action) {
		if (selectedEObject == null) {
			action.setEnabled(false);
			return;
		}
		final NamedElement element = DialogLaunchUtil.chooseElement(
			new java.lang.Class[] { Classifier.class }, selectedEObject.eResource().getResourceSet(),
			activeWindow.getShell());

		if (element != null) {
			activeWindow.getPartService().getActivePart().getSite().getSelectionProvider().setSelection(
				new StructuredSelection(element));
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selectedEObject = null;
		try {
			if (selection instanceof IStructuredSelection) {
				List selectionList = unwrap(((IStructuredSelection) selection).toList());

				if (!selectionList.isEmpty() && selectionList.get(0) instanceof EObject) {
					this.selectedEObject = (EObject) selectionList.get(0);
				}
			}
		} finally {
			action.setEnabled((null != selectedEObject));
		}
	}

	private List unwrap(List adaptables) {
		List unwrapped = new ArrayList();
		for (Iterator iter = adaptables.iterator(); iter.hasNext();) {
			Object item = iter.next();
			if (item instanceof IAdaptable) {
				EObject eObject = ((IAdaptable) item).getAdapter(EObject.class);
				if (eObject != null) {
					unwrapped.add(eObject);
				} else {
					unwrapped.add(item);
				}
			} else if (item instanceof EObject) {
				unwrapped.add(item);
			}
		}

		return unwrapped;
	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		editor = targetEditor;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		activeWindow = window;
	}

	/*
	 * @see org.eclipse.ui.IActionDelegate2#dispose()
	 */
	public void dispose() {
		// No-op
	}

}
