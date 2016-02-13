/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
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
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;

public class AddNestedSubclassAction extends UML2AbstractAction {

	public AddNestedSubclassAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			final Element selectedElement = getSelectedElement();

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Create Nested Subclass") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					Property property = null;

					if (selectedElement instanceof Association) {
						Association association = (Association) selectedElement;
						property = UMLUtil.getNavigableEnd(association);
					} else if (selectedElement instanceof Property) {
						property = (Property) selectedElement;
					}

					if (property == null || !(property.getType() instanceof Class)) {
						return Status.CANCEL_STATUS;
					}

					Class baseClass = (Class) property.getType();

					// prompt for new class name
					String className = null;
					InputDialog inputDialog = new InputDialog(
						activePart.getSite().getShell(), "Nested Class", "Enter class name", baseClass.getName(), null);
					if (inputDialog.open() == Window.OK) {
						className = inputDialog.getValue();
					}
					if (className == null || className.length() == 0) {
						return Status.CANCEL_STATUS;
					}

					Class newClass = UMLFactory.eINSTANCE.createClass();
					property.getClass_().getNestedClassifiers().add(newClass);
					newClass.setName(className);
					property.setType(newClass);

					// create new generalization
					newClass.createGeneralization(baseClass);

					// prompt for selection of redefined properties
					// TODO customize dialog title and prompt
					SubclassHandler subclassHandler = new SubclassHandler(activePart.getSite().getShell(), newClass);
					subclassHandler.openSubclassDialog();

					// TODO this does not select in CommonNavigator. maybe need a refresh first?
					if (activePart instanceof ISetSelectionTarget) {
						((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(newClass));
					}

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
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);

		Element element = getSelectedElement();
		if (element instanceof Property || element instanceof Association) {
			action.setEnabled(true);
		} else {
			action.setEnabled(false);
		}
	}
}
