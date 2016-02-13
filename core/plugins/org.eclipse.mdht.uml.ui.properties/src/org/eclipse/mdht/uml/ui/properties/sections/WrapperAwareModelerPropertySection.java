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
package org.eclipse.mdht.uml.ui.properties.sections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractModelerPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.common.ui.util.Selections;
import org.eclipse.mdht.uml.ui.properties.internal.Logger;
import org.eclipse.mdht.uml.ui.properties.internal.UML2UIPlugin;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.IStatusAdapterConstants;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * Abstract superclass for property sections that can handle wrapper item providers by providing a read-only
 * view on the wrapped element.
 */
public abstract class WrapperAwareModelerPropertySection extends AbstractModelerPropertySection {

	private boolean inputIsWrapper;

	@Override
	protected boolean isReadOnly() {
		return super.isReadOnly() || inputIsWrapper;
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		ISelection unwrapped = Selections.unwrap(selection);
		inputIsWrapper = unwrapped != selection;

		super.setInput(part, unwrapped);
	}

	protected void errorDialog(IStatus status, String title, String message) {
		StatusAdapter adapter = new StatusAdapter(status);

		if (title != null) {
			adapter.setProperty(IStatusAdapterConstants.TITLE_PROPERTY, title);
		}
		if (message != null) {
			adapter.setProperty(IStatusAdapterConstants.EXPLANATION_PROPERTY, message);
		}

		adapter.setProperty(IStatusAdapterConstants.TIMESTAMP_PROPERTY, System.currentTimeMillis());

		StatusManager.getManager().handle(adapter, StatusManager.SHOW);
	}

	protected void execute(IUndoableOperation operation) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getEObject());

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				IStatus result = commandStack.getOperationHistory().execute(
					operation, new NullProgressMonitor(), getPart());

				if ((result != null) && (result.getSeverity() == IStatus.ERROR)) {
					errorDialog(
						result, "Live Model Validation",
						"Violation of one or more live model validation rules has caused the latest edit(s) to be rolled back.");

					// roll-back means changes didn't take, so we should refresh to see what has or hasn't changed
					refresh();
				}
			} catch (ExecutionException ee) {
				Logger.logException(ee);

				IStatus status;
				if (ee.getCause() instanceof CoreException) {
					status = ((CoreException) ee.getCause()).getStatus();
				} else {
					status = new Status(
						IStatus.ERROR, UML2UIPlugin.getPluginId(), "Execution of the latest model edit(s) failed.", ee);
				}

				// something else is borked
				errorDialog(
					status, "Unhandled Exception",
					"An unexpected exception occurred during execution of a model edit command.");

				// some kind of roll-back or incomplete change probably means we should refresh to see what has or hasn't changed
				refresh();
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}
}
