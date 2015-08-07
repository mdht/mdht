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

import java.util.List;

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
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.fhir.profile2uml.importer.ProfileImporter;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Package;

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
		
		if (profileFolder == null) {
			IContainer[] containers = WorkspaceResourceDialog.openFolderSelection(activePart.getSite().getShell(), 
					"Select Profile Folder", "Folder containing reference profiles", false, null, null);
			if (containers.length > 0) {
				profileFolder = containers[0];
			}
		}
		
		return profileFolder;
	}
	
	private List<URI> selectProfileFiles() {
		ResourceDialog dialog = new ResourceDialog(activePart.getSite().getShell(), "Select FHIR Profiles", SWT.OPEN|SWT.MULTI);
		dialog.open();
		return dialog.getURIs();
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		// select the profile folder first, then optionally a list of profiles
		IContainer profileFolder = getProfileFolder();
//		List<URI> profiles = selectProfileFiles();
		
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlPackage);
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Import FHIR Profiles") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (profileFolder != null) {
						ProfileImporter umlImporter = new ProfileImporter(umlPackage, profileFolder);
//						for (URI profileURI : profiles) {
//							umlImporter.importProfile(profileURI);
//						}

						umlImporter.importProfile("extension-definitions");
						
//						umlImporter.importProfile("Observation");
						umlImporter.importProfile("Condition");
						umlImporter.importProfile("StructureDefinition");
						umlImporter.importProfile("Conformance");
						umlImporter.importProfile("ImplementationGuide");
						umlImporter.importProfile("observation-daf-results-dafresultobsquantity");
						umlImporter.importProfile("observation-hspc-standardlabobs-quantitative-stdqty");
						umlImporter.importProfile("observation-hspc-heartrate-hspcheartrate");
						
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
