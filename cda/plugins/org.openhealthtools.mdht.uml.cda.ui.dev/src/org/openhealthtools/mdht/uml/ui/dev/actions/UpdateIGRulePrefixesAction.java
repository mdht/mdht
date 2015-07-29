/*******************************************************************************
 * Copyright (c) 2015 Dan Brown.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   Dan Brown (Audacious Inquiry) - initial API and implementation
 *    
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.dev.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.cda.ui.dev.util.ConfRulesUtil;
import org.openhealthtools.mdht.uml.cda.ui.dev.util.ConfRulesUtil.ConfUpdateType;

public class UpdateIGRulePrefixesAction implements IObjectActionDelegate {

	private static final String OPERATION_NAME = "Update IG Rule Prefixes";

	protected IWorkbenchPart activePart;

	protected ISelection currentSelection;

	protected Element selectedElement;

	public UpdateIGRulePrefixesAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		ConfRulesUtil.run(action, selectedElement, OPERATION_NAME, ConfUpdateType.UPDATE_PREFIX_ONLY);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;
		selectedElement = ConfRulesUtil.selectionChanged(action, currentSelection);
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}
}
