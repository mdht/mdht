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
package org.eclipse.mdht.uml.fhir.transform.popup.actions;

import java.io.IOException;
import java.util.HashMap;

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
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.fhir.transform.ModelExporter;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Class;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.util.FhirResourceFactoryImpl;

public class ExportFhirAction implements IObjectActionDelegate {
	
	protected IWorkbenchPart activePart;
	private Class umlClass;

	public ExportFhirAction() {
		super();
	}
	
	private IContainer getProfileFolder() {
		IContainer profileFolder = null;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResource resource = workspace.getRoot().findMember("FHIR-DSTU2/generated");
		if (resource instanceof IContainer) {
			profileFolder = (IContainer) resource;
		}
		
		if (profileFolder == null) {
			IContainer[] containers = WorkspaceResourceDialog.openFolderSelection(activePart.getSite().getShell(), 
					"Select Profile Folder", "Folder for generated profiles", false, null, null);
			if (containers.length > 0) {
				profileFolder = containers[0];
			}
		}
		
		return profileFolder;
	}
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IContainer profileFolder = getProfileFolder();
		
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(umlClass);
			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Export FHIR Profiles") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {
					if (profileFolder != null) {
						ModelExporter umlExporter = new ModelExporter();
						StructureDefinition structureDef = umlExporter.createStrucureDefinition(umlClass);

						String structureId = structureDef.getId().getValue();
						URI resourceURI = URI.createFileURI(profileFolder.getLocation() + "/" + structureId + ".xml");
						
						FhirResourceFactoryImpl fhirResourceFactory = new FhirResourceFactoryImpl();
						Resource resource = fhirResourceFactory.createResource(resourceURI);
						resource.getContents().add(structureDef);
						try {
							resource.save(new HashMap<String,String>());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						return Status.OK_STATUS;
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
		umlClass = null;

		if (((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof Class) {
				umlClass = (Class) selected;
			}
		}

		action.setEnabled(umlClass != null);
	}

}
