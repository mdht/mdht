/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.ui.dev.actions;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class AssignIdAction implements IObjectActionDelegate {
	private NamedElement element;
	
	public AssignIdAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(element);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Assign XMI IDs") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					// Restore all generated UUIDs (else, reapplying this action does not work)
					TreeIterator iterator = EcoreUtil.getAllContents(
							Collections.singletonList(element));
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof NamedElement) {
							UMLUtil.setEObjectID((NamedElement)child, EcoreUtil.generateUUID());
						}
					}

					// Assign XMI IDs to selection and its children
					iterator = EcoreUtil.getAllContents(
							Collections.singletonList(element));
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof Package) {
							UMLUtil.setEObjectID((NamedElement)child);
						}
						else if (child instanceof Class || child instanceof DataType) {
							UMLUtil.setEObjectID((NamedElement)child);
						}
						else if (child instanceof Property
								&& ((Property)child).getClass_() != null) {
							UMLUtil.setEObjectID((NamedElement)child);
						}
						else if (child instanceof EnumerationLiteral) {
							UMLUtil.setEObjectID((NamedElement)child);
						}
					}

			        return Status.OK_STATUS;
			    }};

		    try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
		        commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		    } catch (ExecutionException ee) {
//			        Logger.logException(ee);
		    }

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		element = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof NamedElement) {
				element = (NamedElement) selected;
			}
		}
		
		action.setEnabled(element != null);
	}

}
