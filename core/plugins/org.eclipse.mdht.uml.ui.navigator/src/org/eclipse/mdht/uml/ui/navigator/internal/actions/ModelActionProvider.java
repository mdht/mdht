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

package org.eclipse.mdht.uml.ui.navigator.internal.actions;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.mdht.uml.ui.navigator.actions.EditCommandsFactory;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;

/**
 *
 */
public class ModelActionProvider extends CommonActionProvider {

	private EditCommandsFactory editCommandsFactory = new EditCommandsFactory();

	private CloseModelAction closeAction;

	private CloseModelAction closeAllAction;

	/**
	 * Construct Property Action provider.
	 */
	public ModelActionProvider() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator.ICommonActionExtensionSite)
	 */
	@Override
	public void init(ICommonActionExtensionSite aSite) {
		ICommonViewerSite viewSite = aSite.getViewSite();
		if (viewSite instanceof ICommonViewerWorkbenchSite) {
			ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewSite;
			closeAction = new CloseModelAction(workbenchSite.getPage(), workbenchSite.getSelectionProvider());
			closeAllAction = new CloseAllModelsAction(workbenchSite.getPage(), workbenchSite.getSelectionProvider());

			editCommandsFactory.setActivePart(workbenchSite.getPart());
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.actions.ActionGroup#fillActionBars(org.eclipse.ui.IActionBars)
	 */
	@Override
	public void fillActionBars(IActionBars actionBars) {
		editCommandsFactory.shareGlobalActions(actionBars, false);

		// the action bars Close is for editors...
		// if(closeAction.isEnabled())
		// actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN, closeAction);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.actions.ActionGroup#fillContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void fillContextMenu(IMenuManager menu) {
		editCommandsFactory.fillContextMenu(menu);

		if (closeAction.isEnabled()) {
			menu.appendToGroup(ICommonMenuConstants.GROUP_OPEN, closeAction);
		}
		if (closeAllAction.isEnabled()) {
			menu.appendToGroup(ICommonMenuConstants.GROUP_OPEN, closeAllAction);
		}
	}

}
