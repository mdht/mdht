/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - adding check box action to show business names (or not)
 *     Christian W. Damus - more flexible contribution/filtering of actions (artf3238)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.editors;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.mdht.uml.common.ui.util.PartAdapter;
import org.eclipse.mdht.uml.edit.provider.UML2ExtendedAdapterFactory;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.mdht.uml.ui.internal.context.UMLContext;
import org.eclipse.mdht.uml.ui.internal.context.UMLContextManager;
import org.eclipse.mdht.uml.ui.internal.l10n.UML2UIMessages;
import org.eclipse.mdht.uml.ui.navigator.actions.EditCommandsFactory;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 *
 */
public class UMLTableActionBarContributor extends EditorActionBarContributor implements IMenuListener {

	/**
	 * This keeps track of the current editor part.
	 */
	protected IEditorPart activeEditor;

	private EditCommandsFactory editCommandsFactory = new EditCommandsFactory();

	private final Map<IWorkbenchPartSite, UMLContextManager> contextManagers = new java.util.HashMap<IWorkbenchPartSite, UMLContextManager>();

	private Collection<UMLContextAction> umlContextActions;

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
	@Override
	public void init(IActionBars actionBars) {
		super.init(actionBars);

		editCommandsFactory.shareGlobalActions(actionBars, false);
	}

	public IEditorPart getActiveEditor() {
		return activeEditor;
	}

	@Override
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

			if (activeEditor instanceof UMLTableEditor) {
				AdapterFactory adapterFactory = ((UMLTableEditor) activeEditor).getAdapterFactory();
				if (adapterFactory instanceof UML2ExtendedAdapterFactory) {
					showBusinessNamesAction.setChecked(
						((UML2ExtendedAdapterFactory) adapterFactory).isShowBusinessNames());
				}
			}

			if (activeEditor != null) {
				// ensure the activation of contexts
				if (getContextManager() == null) {
					Logger.log(Logger.WARNING_DEBUG, "Could not get active context manager for editor site.");
				} else {
					updateUMLContextActions();
				}
			}
		}
	}

	public void setActivePage(IEditorPart part) {
	}

	UMLContextManager getContextManager() {
		UMLContextManager result = null;

		if (activeEditor != null) {
			final IWorkbenchPartSite site = activeEditor.getSite();
			result = contextManagers.get(site);
			if (result == null) {
				result = new UMLContextManager(site.getService(IContextService.class));
				contextManagers.put(site, result);
				result.activateAll();

				// and make sure to forget this context manager when the editor dies
				site.getPage().addPartListener(new PartAdapter() {
					@Override
					public void partClosed(IWorkbenchPart part) {
						contextManagers.remove(site);
					}
				});
			}
		}

		return result;
	}

	public void shareGlobalActions(IPage page, IActionBars actionBars) {
		editCommandsFactory.shareGlobalActions(actionBars, (page instanceof IPropertySheetPage));
	}

	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		editCommandsFactory.shareGlobalActions(getActionBars(), false);
	}

	protected class ShowBusinessNamesAction extends Action {

		protected ShowBusinessNamesAction() {
			super(UML2UIMessages.ShowBusinessNames_title, AS_CHECK_BOX);
		}

		@Override
		public void setChecked(boolean checked) {
			boolean wasChecked = isChecked();
			super.setChecked(checked);
			if (wasChecked != checked) {
				if (activeEditor instanceof UMLTableEditor) {
					UMLTableEditor umlTableEditor = (UMLTableEditor) activeEditor;
					AdapterFactory adapterFactory = umlTableEditor.getAdapterFactory();
					if (adapterFactory instanceof TableEditorComposedAdapterFactory) {
						for (AdapterFactory factory : ((TableEditorComposedAdapterFactory) adapterFactory).getAdapterFactories()) {
							if (factory instanceof UML2ExtendedAdapterFactory) {
								((UML2ExtendedAdapterFactory) factory).setShowBusinessNames(checked);
								umlTableEditor.refresh();
							}
						}
					}
				}
			}
		}

	}

	protected ShowBusinessNamesAction showBusinessNamesAction = new ShowBusinessNamesAction();

	/**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 */
	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(
			UML2UIMessages._UI_UMLEditor_menu, "org.eclipse.mdht.uml.ui.umlMenuID"); //$NON-NLS-1$
		menuManager.insertAfter("additions", submenuManager); //$NON-NLS-1$
		submenuManager.add(new Separator("settings")); //$NON-NLS-1$
		addUMLContextActions(submenuManager);
		submenuManager.add(new Separator("actions")); //$NON-NLS-1$

		submenuManager.add(showBusinessNamesAction);

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

	private void addUMLContextActions(IMenuManager menu) {
		if (umlContextActions == null) {
			umlContextActions = Arrays.asList(new UMLContextAction(UMLContext.CLASSES, "Classes"));
		}

		IMenuManager submenu = new MenuManager("Available Actions");
		menu.add(submenu);

		for (UMLContextAction next : umlContextActions) {
			submenu.add(next);
		}
	}

	private void updateUMLContextActions() {
		if (umlContextActions != null) {
			for (UMLContextAction next : umlContextActions) {
				next.update();
			}
		}
	}

	private class UMLContextAction extends Action {
		private final UMLContext context;

		UMLContextAction(UMLContext context, String label) {
			super(label, AS_CHECK_BOX);

			this.context = context;
		}

		@Override
		public void run() {
			boolean activate = isChecked();

			if (activate) {
				getContextManager().activate(context);
			} else {
				getContextManager().deactivate(context);
			}
		}

		@Override
		public boolean isEnabled() {
			return (getContextManager() != null) && super.isEnabled();
		}

		void update() {
			UMLContextManager ctxmgr = getContextManager();
			setEnabled(ctxmgr != null);

			if (ctxmgr != null) {
				setChecked(ctxmgr.isActive(context));
			}
		}
	}
}
