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
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.internal.l10n.UML2UIMessages;


public class AddUMLAttributeAction extends UML2AbstractAction {

	public AddUMLAttributeAction() {
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
			if (element instanceof Classifier) {
				IUndoableOperation operation = new AbstractEMFOperation(
						editingDomain, UML2UIMessages.AddUMLAttribute_operation_title) {
				    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
				    	Property newProperty = null;
						if (element instanceof Class) {
							String name = getUniqueMemberName((Class)element, 
									UML2UIMessages.AddUMLAttribute_default_name);
							newProperty = ((Class)element).createOwnedAttribute(name, null);
						}
						else if (element instanceof DataType) {
							String name = getUniqueMemberName((DataType)element, 
									UML2UIMessages.AddUMLAttribute_default_name);
							newProperty = ((DataType)element).createOwnedAttribute(name, null);
						}

						if (newProperty != null && activePart instanceof ISetSelectionTarget) {
							((ISetSelectionTarget)activePart).selectReveal(new StructuredSelection(newProperty));
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
