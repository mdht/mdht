package org.openhealthtools.mdht.uml.cda.ui.builder;

import java.io.IOException;
import java.util.Iterator;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.openhealthtools.mdht.uml.cda.ui.util.CDAUIUtil;
import org.eclipse.core.resources.ICommand;

public class ToggleNatureAction implements IObjectActionDelegate {

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
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (project != null) {
					toggleNature(project);
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action
	 * .IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;

		boolean enabled = false;
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;
			if (!structuredSelection.isEmpty()) {
				if (structuredSelection.getFirstElement() instanceof IProject) {
					IProject project = (IProject) structuredSelection.getFirstElement();
					try {
						if (project.hasNature(CDANature.NATURE_ID)) {
							enabled = true;
						} else {
							Manifest projectManifest;
							projectManifest = new Manifest(CDAUIUtil.getManifest(project).getContents());
							Attributes attributes = projectManifest.getMainAttributes();
							String requiredBundles = attributes.getValue("Require-Bundle");
							if (requiredBundles.contains("org.openhealthtools.mdht.uml.cda") && CDAUIUtil.getProjectFile(project, ".genmodel") != null) {
								enabled = true;
							}
						}
					} catch (IOException e) {
					} catch (CoreException e) {
					}
				}

			}
		}

		action.setEnabled(enabled);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IObjectActionDelegate#setActivePart(org.eclipse.jface.
	 * action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * Toggles sample nature on a project
	 * 
	 * @param project
	 *            to have sample nature added or removed
	 */
	private void toggleNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();

			for (int i = 0; i < natures.length; ++i) {
				if (CDANature.NATURE_ID.equals(natures[i])) {
					// Remove the nature
					String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
					return;
				}
			}

			// Add the nature
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 1, natures.length);
			newNatures[0] = CDANature.NATURE_ID;
			description.setNatureIds(newNatures);

			project.setDescription(description, null);
			// Make the CDA Build Command first
			description = project.getDescription();

			ICommand[] commands = description.getBuildSpec();

			ICommand[] newCommands = new ICommand[commands.length];

			System.arraycopy(commands, 0, newCommands, 1, commands.length - 1);

			newCommands[0] = commands[commands.length - 1];

			description.setBuildSpec(newCommands);

			project.setDescription(description, null);
		} catch (CoreException e) {
		}
	}

}
