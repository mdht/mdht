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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.internal.l10n.UML2UIMessages;


public class AddReturnParameterAction extends UML2AbstractAction {

	public AddReturnParameterAction() {
		super();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		if (isReadOnly()) {
			action.setEnabled(false);
		}

		Element element = getSelectedElement();
		if (Operation.class.isInstance(element)) {
			for (Parameter param : ((Operation)element).getOwnedParameters()) {
				if (ParameterDirectionKind.RETURN_LITERAL == param.getDirection()) {
					action.setEnabled(false);
					break;
				}
			}
		}
	}
	
	public void run(final IAction action) {
		try {
			final Element element = getSelectedElement();
			if (Operation.class.isInstance(element)) {
				IUndoableOperation operation = new AbstractEMFOperation(
						editingDomain, UML2UIMessages.AddUMLReturnParameter_operation_title) {
				    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						Parameter parameter = UMLFactory.eINSTANCE.createParameter();
						parameter.setDirection(ParameterDirectionKind.RETURN_LITERAL);
						
						String name = UML2UIMessages.AddUMLReturnParameter_default_name;
						parameter.setName(name);
						((Operation)element).getOwnedParameters().add(parameter);

						if (activePart instanceof ISetSelectionTarget) {
							((ISetSelectionTarget)activePart).selectReveal(new StructuredSelection(parameter));
						}
						
						// without this, user must click away and back to fire selectionChanged()
						action.setEnabled(false);
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
