/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - more flexible contribution/filtering of actions (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.actions;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.eclipse.mdht.uml.common.ui.handlers.OpenSubclassEditorHandler;
import org.eclipse.mdht.uml.common.ui.internal.Logger;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;

/**
 * @deprecated Use the {@link OpenSubclassEditorHandler} with a command definition, instead.
 */
@Deprecated
public class OpenSubclassEditorAction implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	protected Class selectedClass;

	public OpenSubclassEditorAction() {
		super();
	}

	protected SubclassEditorViewContentProvider getContentProvider() {
		return new SubclassEditorViewContentProvider();
	}

	protected SubclassEditorViewLabelProvider getLabelProvider() {
		return new SubclassEditorViewLabelProvider();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(selectedClass);

			final SubclassHandler subclassHandler = new SubclassHandler(
				activePart.getSite().getShell(), selectedClass, getContentProvider(), getLabelProvider());

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Edit subclass properties") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					subclassHandler.openSubclassDialog();
					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				Logger.logException(ee);
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		selectedClass = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof View) {
				selected = ((View) selected).getElement();
			}

			if (selected instanceof Class) {
				selectedClass = (Class) selected;
			}
		}

		if (selectedClass != null) {
			action.setEnabled(true);
		} else {
			action.setEnabled(false);
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}
}
