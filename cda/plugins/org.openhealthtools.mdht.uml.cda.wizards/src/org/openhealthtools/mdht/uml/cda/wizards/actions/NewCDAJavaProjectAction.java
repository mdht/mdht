package org.openhealthtools.mdht.uml.cda.wizards.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.openhealthtools.mdht.uml.cda.wizards.NewCDAJavaProjectWizard;

/**
 * Temporary menu item for creating projects - need to add to new projects (or
 * add to a CDA perspective)
 */
public class NewCDAJavaProjectAction implements IWorkbenchWindowActionDelegate {

	@SuppressWarnings("unused")
	private IWorkbenchWindow window;

	public NewCDAJavaProjectAction() {
	}

	public void run(IAction action) {

		NewCDAJavaProjectWizard wizard = new NewCDAJavaProjectWizard();
		WizardDialog dialog = new WizardDialog(wizard.getShell(), wizard);
		dialog.create();
		dialog.open();

	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}