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
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.common.ui.dialogs.DialogLaunchUtil;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassHandler;
import org.eclipse.mdht.uml.common.ui.search.GeneralizationTypeFilter;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;

public class AddUMLClassAction extends UML2AbstractAction {

	public AddUMLClassAction() {
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
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open dialog containing all available classes.
	 */
	protected String getClassName() {
		String className = null;

		InputDialog inputDialog = new InputDialog(
			activePart.getSite().getShell(), "New Class", "Enter class name", "", null);
		if (inputDialog.open() == Window.OK) {
			className = inputDialog.getValue();
		}
		return className;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open dialog containing all available classes.
	 *
	 * @param new
	 *            class
	 */
	protected Class selectSuperClass(Class newClass) {
		Class superClass = (Class) DialogLaunchUtil.chooseElement(
			new GeneralizationTypeFilter(newClass), UMLUtil.getTopPackage(newClass), activePart.getSite().getShell(),
			"Class Selection", "Select base class (Cancel for none):");

		return superClass;
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Default is to open subclass redefinition dialog.
	 *
	 * @param new
	 *            class
	 */
	protected void addProperties(Class newClass, Class superClass) {
		if (superClass != null) {
			// prompt for selection of redefined properties
			// TODO customize dialog title and prompt
			SubclassHandler subclassHandler = new SubclassHandler(activePart.getSite().getShell(), newClass);
			subclassHandler.openSubclassDialog();
		}
	}

	/**
	 * Subclass may override to customize domain-specific processing.
	 * Do nothing by default.
	 *
	 * @param new
	 *            class
	 */
	protected void postProcess(Class newClass) {
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
					editingDomain, UML2UIMessages.AddUMLClass_operation_title) {
					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

						// prompt for new class name
						String className = getClassName();
						if (className == null || className.length() == 0) {
							return Status.CANCEL_STATUS;
						}

						Class newClass = UMLFactory.eINSTANCE.createClass();
						newClass.setName(className);

						if (element instanceof Package) {
							((Package) element).getOwnedTypes().add(newClass);
						} else if (element instanceof Class) {
							((Class) element).getNestedClassifiers().add(newClass);
						}

						Class superClass = selectSuperClass(newClass);
						if (superClass != null) {
							newClass.createGeneralization(superClass);
						}

						addProperties(newClass, superClass);

						postProcess(newClass);

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
