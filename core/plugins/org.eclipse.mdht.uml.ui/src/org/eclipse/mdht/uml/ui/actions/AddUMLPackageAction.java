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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

public class AddUMLPackageAction extends UML2AbstractAction {

	public AddUMLPackageAction() {
		super();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		if (isReadOnly()) {
			action.setEnabled(false);
		}
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			final Element element = getSelectedElement();
			if (element != null) {
				IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, UML2UIMessages.AddUMLPackage_operation_title) {
					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						if (Package.class.isInstance(element)) {
							String name = getUniquePackageName(
								(Package) element, UML2UIMessages.AddUMLPackage_default_name);
							((Package) element).createNestedPackage(name);

							return Status.OK_STATUS;
						}

						return Status.CANCEL_STATUS;
					}
				};

				try {
					IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
					operation.addContext(commandStack.getDefaultUndoContext());
					commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), activePart);

				} catch (ExecutionException ee) {
					Logger.logException(ee);
				}
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

}
