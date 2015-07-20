/*******************************************************************************
 * Copyright (c) 2015 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.fhir.profile2uml.popup.actions;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.uml2.uml.Package;

import org.eclipse.mdht.fhir.profile2uml.importer.ProfileImporter;

public class ImportProfileAction implements IObjectActionDelegate {
	
	protected IWorkbenchPart activePart;
	private Package umlPackage;

	public ImportProfileAction() {
		super();
	}
	
	private IContainer getProfileFolder() {
		IContainer profileFolder = null;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResource resource = workspace.getRoot().findMember("FHIR-DSTU2/current");
		if (resource instanceof IContainer) {
			profileFolder = (IContainer) resource;
		}
		
		return profileFolder;
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlPackage);
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Import FHIR Profiles") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					// Prompt for workspace folder containing CEMs
					IContainer profileFolder = getProfileFolder();
					if (profileFolder != null) {
						ProfileImporter umlImporter = new ProfileImporter(umlPackage, profileFolder);
//						umlImporter.importProfile("Observation");
						umlImporter.importProfile("Condition");
						umlImporter.importProfile("StructureDefinition");
						umlImporter.importProfile("Conformance");
						umlImporter.importProfile("ImplementationGuide");
//						umlImporter.importProfile("observation-daf-results-dafresultobsquantity");
//						umlImporter.importProfile("observation-hspc-standardlabobs-quantitative-stdqty");
						
//						umlImporter.importAllProfiles();
					}

					return Status.OK_STATUS;
				}
			};

			try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
				commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

			} catch (ExecutionException ee) {
				ee.printStackTrace();
			}

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		umlPackage = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof Package) {
				umlPackage = (Package) selected;
			}
		}

		action.setEnabled(umlPackage != null);
	}

}
