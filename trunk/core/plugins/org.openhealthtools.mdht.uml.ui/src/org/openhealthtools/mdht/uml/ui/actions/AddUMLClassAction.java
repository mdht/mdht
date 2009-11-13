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
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.openhealthtools.mdht.uml.ui.internal.Logger;
import org.openhealthtools.mdht.uml.ui.internal.l10n.UML2UIMessages;


public class AddUMLClassAction extends UML2AbstractAction {

	public AddUMLClassAction() {
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
			if (element != null) {
				IUndoableOperation operation = new AbstractEMFOperation(
						editingDomain, UML2UIMessages.AddUMLClass_operation_title) {
				    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
						Class class_ = UMLFactory.eINSTANCE.createClass();
						
						if (element instanceof Package) {
							String name = getUniqueTypeName((Package)element, 
									UML2UIMessages.AddUMLClass_default_name);
							class_.setName(name);
							((Package)element).getOwnedTypes().add(class_);
						}
						else if (element instanceof Class) {
							String name = getUniqueTypeName((Class)element, 
									UML2UIMessages.AddUMLClass_default_name);
							class_.setName(name);
							((Class)element).getNestedClassifiers().add(class_);
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
