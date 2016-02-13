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
package org.eclipse.mdht.uml.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.mdht.uml.ui.editors.UMLTableEditor;
import org.eclipse.mdht.uml.ui.internal.Logger;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

/**
 *
 * @version $Id: $
 */
public class OpenUMLTableEditorAction extends UML2AbstractAction {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = workbenchWindow.getActivePage();

		Resource resource = getSelectedElement().eResource();
		try {
			String path = URI.decode(resource.getURI().toString().substring("platform:/resource/".length()));
			IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));

			if (workspaceResource instanceof IFile) {
				IEditorInput editorInput = new FileEditorInput((IFile) workspaceResource);
				IEditorPart editor = activePage.openEditor(
					editorInput, UMLTableEditor.EDITOR_ID, true, IWorkbenchPage.MATCH_ID | IWorkbenchPage.MATCH_INPUT);

				if (editor != null) {
					editor.getSite().getSelectionProvider().setSelection(currentSelection);
					activePage.activate(editor);
				}
			}

		} catch (PartInitException e) {
			Logger.logException(e);
		}
	}

}
