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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.mdht.uml.common.ui.util.IResourceConstants;
import org.eclipse.mdht.uml.ui.navigator.UMLDomainNavigatorItem;
import org.eclipse.mdht.uml.ui.navigator.internal.l10n.Messages;
import org.eclipse.mdht.uml.ui.navigator.internal.plugin.Logger;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.uml2.uml.Element;

/**
 *
 */
public class OpenModelAction implements IObjectActionDelegate {

	private IWorkbenchPart activePart;

	private List files = new ArrayList();

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		activePart = targetPart;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		files = new ArrayList();
		IStructuredSelection sSelection = (IStructuredSelection) selection;
		for (Iterator iterator = sSelection.iterator(); iterator.hasNext();) {
			IFile file = (IFile) iterator.next();
			files.add(file);
		}

		action.setEnabled(!files.isEmpty());
	}

	public boolean isEnabled() {
		return !files.isEmpty();
	}

	public void run(IAction action) {
		EditingDomain editingDomain = TransactionalEditingDomain.Registry.INSTANCE.getEditingDomain(
			IResourceConstants.EDITING_DOMAIN_ID);

		for (Iterator iterator = files.iterator(); iterator.hasNext();) {
			IFile modelFile = (IFile) iterator.next();

			try {
				Resource resource = editingDomain.getResourceSet().getResource(
					URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), true);

				if (activePart instanceof CommonNavigator) {
					// expose the model contents in Project Explorer
					List items = wrapItems(resource.getContents(), modelFile);
					IStructuredSelection selection = new StructuredSelection(items);
					((CommonNavigator) activePart).getCommonViewer().setSelection(selection, true);
				}

			} catch (Exception e) {
				String message = NLS.bind(
					Messages.OpenModelAction_errorMessage, new String[] { e.getLocalizedMessage() });
				Logger.logException(message, e);
				MessageDialog.openError(
					Display.getDefault().getActiveShell(), Messages.OpenModelAction_errorTitle, message);
			}
		}
	}

	private List wrapItems(List items, Object parentElement) {
		List wrappedItems = new ArrayList();
		for (Iterator iter = items.iterator(); iter.hasNext();) {
			Object item = iter.next();
			if (item instanceof Element) {
				wrappedItems.add(new UMLDomainNavigatorItem((Element) item, parentElement, null));
			}
		}
		return wrappedItems;
	}

}
