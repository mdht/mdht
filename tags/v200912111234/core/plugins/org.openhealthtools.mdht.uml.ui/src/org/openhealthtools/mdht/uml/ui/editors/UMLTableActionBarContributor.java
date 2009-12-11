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
package org.openhealthtools.mdht.uml.ui.editors;

import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.openhealthtools.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.openhealthtools.mdht.uml.ui.navigator.actions.EditCommandsFactory;


/**
 * 
 */
public class UMLTableActionBarContributor 
extends EditorActionBarContributor
implements IMenuListener {

	/**
	 * This keeps track of the current editor part.
	 */
	protected IEditorPart activeEditor;

	private EditCommandsFactory editCommandsFactory = new EditCommandsFactory();

	/**
	 * 
	 */
	public UMLTableActionBarContributor() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor#init(org.eclipse.ui.IActionBars)
	 */
	public void init(IActionBars actionBars) {
		super.init(actionBars);

		editCommandsFactory.shareGlobalActions(actionBars, false);
	}

	public IEditorPart getActiveEditor() {
		return activeEditor;
	}

	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);

		if (part != activeEditor) {
			if (activeEditor != null) {
				editCommandsFactory.setActivePart(null);
				activeEditor = null;
			}

			if (part instanceof IEditingDomainProvider) {
				activeEditor = part;
				editCommandsFactory.setActivePart(activeEditor);

			}
		}
	}

	public void setActivePage(IEditorPart part) {
	}

	public void shareGlobalActions(IPage page, IActionBars actionBars) {
		editCommandsFactory.shareGlobalActions(actionBars, 
				(page instanceof IPropertySheetPage));
	}

    public void contributeToToolBar(IToolBarManager toolBarManager) {
    	editCommandsFactory.shareGlobalActions(getActionBars(), false);
    }

	/**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 */
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(UML2UIMessages._UI_UMLEditor_menu
				, "org.openhealthtools.mdht.uml.ui.umlMenuID"); //$NON-NLS-1$
		menuManager.insertAfter("additions", submenuManager); //$NON-NLS-1$
		submenuManager.add(new Separator("settings")); //$NON-NLS-1$
		submenuManager.add(new Separator("actions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions-end")); //$NON-NLS-1$
	}
	
	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help 
	 * fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		fillContextMenu(menuManager);
	}

	private void fillContextMenu(IMenuManager manager) {
		// Other plug-ins can contribute their actions here
		// use same group IDs as the CommonNavigator
		manager.add(new Separator(ICommonMenuConstants.GROUP_NEW));
		manager.add(new GroupMarker(ICommonMenuConstants.GROUP_GOTO));
		manager.add(new Separator(ICommonMenuConstants.GROUP_OPEN));
		manager.add(new GroupMarker(ICommonMenuConstants.GROUP_OPEN_WITH));
		manager.add(new Separator(ICommonMenuConstants.GROUP_EDIT));
		manager.add(new Separator(ICommonMenuConstants.GROUP_SHOW));
		manager.add(new GroupMarker(ICommonMenuConstants.GROUP_REORGANIZE));
		manager.add(new Separator(ICommonMenuConstants.GROUP_PORT));
		manager.add(new Separator(ICommonMenuConstants.GROUP_GENERATE));
		manager.add(new Separator(ICommonMenuConstants.GROUP_SEARCH));
		manager.add(new Separator(ICommonMenuConstants.GROUP_BUILD));
		manager.add(new Separator(ICommonMenuConstants.GROUP_ADDITIONS));
		manager.add(new Separator(ICommonMenuConstants.GROUP_PROPERTIES));
		
		editCommandsFactory.fillContextMenu(manager);
	}
	
}
