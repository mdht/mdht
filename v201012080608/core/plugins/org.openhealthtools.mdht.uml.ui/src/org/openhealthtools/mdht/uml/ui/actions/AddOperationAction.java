/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.internal.l10n.UML2UIMessages;

public class AddOperationAction extends UML2AbstractAction {

	public AddOperationAction() {
		super();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		if (isReadOnly()) {
			action.setEnabled(false);
		}
	}
	
	public void run(IAction action) {
		try {
			final Element element = getSelectedElement();
			if (Classifier.class.isInstance(element)) {
				IUndoableOperation operation = new AbstractEMFOperation(
						editingDomain, UML2UIMessages.AddUMLOperation_operation_title) {
				    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						Operation umlOperation = UMLFactory.eINSTANCE.createOperation();
						
						String name = getUniqueMemberName((Classifier)element, 
								UML2UIMessages.AddUMLOperation_default_name);
						umlOperation.setName(name);
						
						if (element instanceof Class) {
							((Class)element).getOwnedOperations().add(umlOperation);
						}
						else if (element instanceof Interface) {
							((Interface)element).getOwnedOperations().add(umlOperation);
						}
						else if (element instanceof DataType) {
							((DataType)element).getOwnedOperations().add(umlOperation);
						}
						else {
							return Status.CANCEL_STATUS;
						}
						
						if (activePart instanceof ISetSelectionTarget) {
							((ISetSelectionTarget)activePart).selectReveal(new StructuredSelection(umlOperation));
						}
						
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
