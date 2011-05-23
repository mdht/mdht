/*******************************************************************************
 * Copyright (c) 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.wizards.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.openhealthtools.mdht.uml.cda.wizards.NewC32ProjectWizard;

/**
 * Temporary menu item for creating projects - need to add to new projects (or
 * add to a CDA perspective)
 */
public class NewC32ProjectAction implements IWorkbenchWindowActionDelegate {

	@SuppressWarnings("unused")
	private IWorkbenchWindow window;

	public NewC32ProjectAction() {
	}

	public void run(IAction action) {

		NewC32ProjectWizard wizard = new NewC32ProjectWizard();
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
