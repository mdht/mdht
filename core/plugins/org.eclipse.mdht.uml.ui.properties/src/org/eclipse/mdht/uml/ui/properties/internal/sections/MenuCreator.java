/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.mdht.uml.ui.properties.internal.sections;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;

/**
 * A menu creator that can create a sub menu from actions added by fillMenu() in subclasses
 */
public abstract class MenuCreator implements IMenuCreator {

	private MenuManager dropDownMenuMgr;

	/**
	 * Creates the menu manager for the drop-down.
	 */
	private void createDropDownMenuMgr() {
		if (dropDownMenuMgr == null) {
			dropDownMenuMgr = new MenuManager();
			fillMenu(dropDownMenuMgr);
		}
	}

	protected abstract void fillMenu(MenuManager dropDownMenuMgr);

	public Menu getMenu(Control parent) {
		createDropDownMenuMgr();
		return dropDownMenuMgr.createContextMenu(parent);
	}

	public Menu getMenu(Menu parent) {
		createDropDownMenuMgr();
		Menu menu = new Menu(parent);
		IContributionItem[] items = dropDownMenuMgr.getItems();
		for (int i = 0; i < items.length; i++) {
			IContributionItem item = items[i];
			IContributionItem newItem = item;
			if (item instanceof ActionContributionItem) {
				newItem = new ActionContributionItem(((ActionContributionItem) item).getAction());
			}
			newItem.fill(menu, -1);
		}
		return menu;
	}

	public void dispose() {
		if (dropDownMenuMgr != null) {
			dropDownMenuMgr.dispose();
			dropDownMenuMgr = null;
		}
	}

}
