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
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.InstanceGenerator;
import org.openhealthtools.mdht.uml.cda.ui.internal.Logger;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class AddPublicationSample implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	org.eclipse.uml2.uml.Class clinicalDocument = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		try {

			final Package topPackage = UMLUtil.getTopPackage(clinicalDocument);

			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(topPackage);

			IUndoableOperation operation = new AbstractEMFOperation(editingDomain, "Create New Sample") {
				@Override
				protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

					String documentSampleArtifact = String.format("%sSample", clinicalDocument.getName());

					String documentSampleArtifactFileName = String.format("%s.xml", documentSampleArtifact);

					Type type = topPackage.getOwnedType(documentSampleArtifact);

					Artifact artifact = null;
					if (type != null && type instanceof Artifact) {
						artifact = (Artifact) type;
					} else {
						artifact = (Artifact) topPackage.createOwnedType(
							clinicalDocument.getName() + "Sample", UMLPackage.eINSTANCE.getArtifact());
					}

					artifact.setFileName(documentSampleArtifactFileName);

					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

					IProject docProject = root.getProject(topPackage.eResource().getURI().segment(1).replace(
						".model", ".doc"));

					if (docProject.exists()) {

						IFolder samplesFolder = docProject.getFolder("samples");

						if (!samplesFolder.exists()) {
							try {
								samplesFolder.create(false, true, null);
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}

						IFile samplesFile = samplesFolder.getFile(documentSampleArtifactFileName);

						if (!samplesFile.exists()) {

							OutputStream out;
							try {
								InstanceGenerator ig = new InstanceGenerator();
								EObject instance = ig.createInstance(clinicalDocument, -1);
								out = new FileOutputStream(
									root.getLocation().append(samplesFile.getFullPath()).toFile());
								CDAUtil.save((ClinicalDocument) instance, out);

								docProject.refreshLocal(IResource.DEPTH_INFINITE, null);
							} catch (FileNotFoundException e) {
								e.printStackTrace();
							} catch (Exception e) {
								e.printStackTrace();
							}

						}
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {

		if (((IStructuredSelection) selection).size() == 1) {

			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof Type) {

				if (CDAModelUtil.isClinicalDocument((Type) selected)) {
					action.setEnabled(true);
					clinicalDocument = (Class) selected;

					clinicalDocument.eResource();

					return;
				}
			}
		}

		action.setEnabled(false);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}
}
