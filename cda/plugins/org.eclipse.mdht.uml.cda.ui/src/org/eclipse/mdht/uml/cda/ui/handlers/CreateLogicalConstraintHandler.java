/*******************************************************************************
 * Copyright (c) 2014 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.handlers;

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
import org.eclipse.mdht.uml.cda.core.profile.LogicalOperator;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.eclipse.mdht.uml.common.ui.util.UMLHandlerUtil;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Class;

/**
 * @author seanmuir
 *
 */
public class CreateLogicalConstraintHandler extends AbstractHandler {

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

		final SubclassHandler subclassHandler = new LogicalSubclassHandler(
			activePart.getSite().getShell(), selectedClass, getContentProvider(), getLabelProvider(),
			LogicalOperator.get(event.getParameter("org.eclipse.mdht.uml.cda.ui.commands.logical.operator")));

		IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Create Logical Constraint") {
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
