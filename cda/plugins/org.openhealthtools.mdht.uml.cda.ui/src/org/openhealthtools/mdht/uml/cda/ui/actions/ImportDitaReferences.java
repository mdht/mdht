/*******************************************************************************
 * Copyright (c) 2015 National E-Health Transition Authority (NEHTA).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (National E-Health Transition Authority (NEHTA)) - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.util.Iterator;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * ImportDitaReferences - Currently dita does can not include relative addressed content as references that are not directly under parent dita
 * directory (../../content)
 * This action will copy (overwrite) over the content from another dita project to include; The dita transformation looks for this content when
 * creating references
 * 
 * @author seanmuir
 * 
 */
public class ImportDitaReferences implements IObjectActionDelegate {

	protected IWorkbenchPart activePart;

	private ISelection selection;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	@SuppressWarnings("rawtypes")
	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
				Object element = it.next();
				IProject selectedProject = null;
				if (element instanceof IProject) {
					selectedProject = (IProject) element;
				} else if (element instanceof IAdaptable) {
					selectedProject = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (selectedProject != null) {

					LabelProvider projectLabelProvider = new LabelProvider() {
						@Override
						public String getText(Object element) {
							IProject p = (IProject) element;
							return p.getName();
						}
					};

					ElementListSelectionDialog dialog = new ElementListSelectionDialog(
						activePart.getSite().getShell(), projectLabelProvider);

					IWorkspace workspace = ResourcesPlugin.getWorkspace();
					dialog.setMultipleSelection(true);
					dialog.setElements(workspace.getRoot().getProjects());
					dialog.setTitle("Dita Projects to Import");
					dialog.open();

					dialog.getResult();

					for (Object object : dialog.getResult()) {

						IProject includeFrom = (IProject) object;
						IFolder ditaFolder = selectedProject.getFolder("dita/classes/" + includeFrom.getName());

						try {
							// Do a delete and copy to make sure content is up todate
							if (ditaFolder.exists()) {
								ditaFolder.delete(true, null);
							}
							ditaFolder.create(true, true, null);
							IResource[] resources = new IResource[1];
							resources[0] = includeFrom.getFolder("dita/classes/");
							workspace.copy(
								resources, workspace.getRoot().getFolder(ditaFolder.getFullPath()).getFullPath(), true,
								null);

							// Refresh
							selectedProject.refreshLocal(IResource.DEPTH_INFINITE, null);

						} catch (CoreException e) {
							e.printStackTrace();
						}

					}

				}
			}
		}
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction arg0, ISelection selection) {
		this.selection = selection;

	}

}
