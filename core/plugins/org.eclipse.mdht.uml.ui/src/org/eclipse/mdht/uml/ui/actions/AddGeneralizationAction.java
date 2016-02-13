/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.search.GeneralizationTypeFilter;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;

public class AddGeneralizationAction extends UML2AbstractAction {

	public AddGeneralizationAction() {
		super();
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open dialog containing all available classes.
	 *
	 * @param new
	 *            class
	 */
	protected Classifier selectGeneralClassifier(Classifier child) {
		// prompt for parent class
		Classifier parent = (Classifier) DialogLaunchUtil.chooseElement(
			new GeneralizationTypeFilter(child), UMLUtil.getTopPackage(child), activePart.getSite().getShell(),
			UML2UIMessages.GeneralizationSelectionDialog_title, UML2UIMessages.GeneralizationSelectionDialog_message);

		return parent;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Do nothing by default.
	 *
	 * @param new
	 *            property
	 */
	protected void postProcess(Generalization generalization) {
		// do nothing by default
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			final Element element = getSelectedElement();
			if (element != null) {
				IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, UML2UIMessages.AddUMLGeneralization_operation_title) {
					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						if (Classifier.class.isInstance(element)) {
							Classifier child = (Class) element;

							// prompt for parent class
							Classifier parent = selectGeneralClassifier(child);
							if (parent == null) {
								return Status.CANCEL_STATUS;
							}

							Generalization generalization = child.createGeneralization(parent);

							postProcess(generalization);

							if (activePart instanceof ISetSelectionTarget) {
								((ISetSelectionTarget) activePart).selectReveal(new StructuredSelection(child));
								((ISetSelectionTarget) activePart).selectReveal(
									new StructuredSelection(generalization));
							}

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
