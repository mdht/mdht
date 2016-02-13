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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mdht.uml.common.ui.saveable.ModelDocument;
import org.eclipse.mdht.uml.common.ui.saveable.ModelManager;
import org.eclipse.mdht.uml.ui.navigator.internal.l10n.Messages;
import org.eclipse.mdht.uml.ui.navigator.internal.plugin.Logger;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;

/**
 *
 */
public class CloseModelAction extends Action {

	private Element modelElement;

	private ISelectionProvider provider;

	/**
	 * Construct this Action with the given page.
	 *
	 * @param p
	 *            The page to use as context to open the editor.
	 * @param selectionProvider
	 *            The selection provider
	 */
	public CloseModelAction(IWorkbenchPage p, ISelectionProvider selectionProvider) {
		setText(Messages.CloseModelAction_label);
		provider = selectionProvider;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.action.Action#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		ISelection selection = provider.getSelection();
		if (!selection.isEmpty() && ((IStructuredSelection) selection).size() == 1) {
			Object selected = ((IStructuredSelection) selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = ((IAdaptable) selected).getAdapter(Element.class);
			}

			if (selected instanceof Package) {
				modelElement = (Element) selected;
				return true;
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		closeModel(getResource());
	}

	protected Resource getResource() {
		return modelElement.eResource();
	}

	protected static void closeModel(Resource resource) {
		try {
			ModelDocument saveable = ModelManager.getManager().getModelDocument(resource);
			if (saveable != null) {
				if (saveable.isDirty()) {
					String fileName = resource.getURI().lastSegment();
					String message = NLS.bind(Messages.CloseModelAction_dialogMessage, fileName);
					// Yes, No, Cancel
					MessageDialog dialog = new MessageDialog(
						Display.getDefault().getActiveShell(), Messages.CloseModelAction_dialogTitle, null, // accept
						message, MessageDialog.QUESTION,
						new String[] {
								IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL, IDialogConstants.CANCEL_LABEL },
						0); // yes is the default

					int result = dialog.open();
					if (2 == result) {
						// Cancel
						return;
					}
					if (0 == result) {
						// Yes
						saveable.doSave(new NullProgressMonitor());
					}
				}

				// if not canceled, the resource is closed
				saveable.doClose(new NullProgressMonitor());

				return;
			}

			// if saveable not found, the resource is unloaded
			resource.unload();

		} catch (Exception e) {
			String message = NLS.bind(Messages.CloseModelAction_errorMessage, new String[] { e.getLocalizedMessage() });
			Logger.logException(message, e);
			MessageDialog.openError(
				Display.getDefault().getActiveShell(), Messages.CloseModelAction_errorTitle, message);
		}
	}
}
