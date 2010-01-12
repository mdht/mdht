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
package org.openhealthtools.mdht.uml.ui.actions;

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
import org.eclipse.ui.IActionDelegate;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.openhealthtools.mdht.uml.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.internal.l10n.UML2UIMessages;


public class AddUMLConstraintAction extends UML2AbstractAction {

	public AddUMLConstraintAction() {
		super();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		if (isReadOnly())
			action.setEnabled(false);
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			final Element element = getSelectedElement();
			if (element instanceof Element) {
				IUndoableOperation operation = new AbstractEMFOperation(
						editingDomain, UML2UIMessages.AddUMLConstraint_operation_title) {
				    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						Constraint constraint = null;
						
						if (element instanceof Namespace) {
							constraint = ((Namespace)element).createOwnedRule(null);
						}
						else if (element.getOwner() instanceof Namespace) {
							Namespace ns = (Namespace) element.getOwner();
							constraint = ns.createOwnedRule(null);
							if (element instanceof NamedElement) {
								constraint.setName(((NamedElement)element).getName());
							}
						}
						constraint.getConstrainedElements().add(element);

				        return Status.OK_STATUS;
				    }};

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
