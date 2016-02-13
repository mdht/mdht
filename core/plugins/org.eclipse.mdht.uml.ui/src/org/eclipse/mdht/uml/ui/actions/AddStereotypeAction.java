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
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;

public class AddStereotypeAction extends UML2AbstractAction {

	public AddStereotypeAction() {
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
			if (element instanceof Profile) {
				final Profile profile = (Profile) element;

				IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, UML2UIMessages.AddStereotype_operation_title) {
					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

						// prompt for new stereotype name
						String stereotypeName = null;
						InputDialog inputDialog = new InputDialog(
							activePart.getSite().getShell(), "New Stereotype", "Enter stereotype name", "", null);
						if (inputDialog.open() == Window.OK) {
							stereotypeName = inputDialog.getValue();
						}
						if (stereotypeName == null || stereotypeName.length() == 0) {
							return Status.CANCEL_STATUS;
						}

						Stereotype newStereotype = UMLFactory.eINSTANCE.createStereotype();
						newStereotype.setName(stereotypeName);
						profile.getOwnedTypes().add(newStereotype);

						// prompt for meta class and create extension
						Class metaclass = DialogLaunchUtil.chooseUMLMetaclass(
							element.eResource().getResourceSet(), activePart.getSite().getShell(),
							"Metaclass Selection", "Select UML metaclass for extension:");
						if (metaclass != null) {
							// assure that metaclass is imported
							if (!profile.getReferencedMetaclasses().contains(metaclass) &&
									!profile.getReferencedMetamodels().contains(metaclass.getModel())) {
								profile.createMetaclassReference(metaclass);
							}

							// create new extension
							newStereotype.createExtension(metaclass, false);
						}

						if (activePart instanceof ISetSelectionTarget) {
							((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(newStereotype));
						}

						return Status.OK_STATUS;
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
