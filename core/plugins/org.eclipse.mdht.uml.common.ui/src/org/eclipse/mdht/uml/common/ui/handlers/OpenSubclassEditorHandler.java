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
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.eclipse.mdht.uml.common.ui.util.UMLHandlerUtil;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;

public class OpenSubclassEditorHandler extends AbstractHandler {

	public OpenSubclassEditorHandler() {
		super();
	}

	protected SubclassEditorViewContentProvider getContentProvider() {
		return new SubclassEditorViewContentProvider();
	}

	protected SubclassEditorViewLabelProvider getLabelProvider() {
		return new SubclassEditorViewLabelProvider();
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// these APIs throw if the requested thing isn't available
		Class selectedClass = UMLHandlerUtil.getSelectedElementChecked(event, Class.class);
		IWorkbenchPart activePart = HandlerUtil.getActivePartChecked(event);

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

		IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
		operation.addContext(commandStack.getDefaultUndoContext());
		commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		return null;
	}

}
