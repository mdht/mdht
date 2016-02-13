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

import java.util.Iterator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.mdht.uml.ui.navigator.internal.l10n.Messages;
import org.eclipse.ui.IWorkbenchPage;

/**
 *
 */
public class CloseAllModelsAction extends CloseModelAction {

	/**
	 * Construct this Action with the given page.
	 *
	 * @param p
	 *            The page to use as context to open the editor.
	 * @param selectionProvider
	 *            The selection provider
	 */
	public CloseAllModelsAction(IWorkbenchPage p, ISelectionProvider selectionProvider) {
		super(p, selectionProvider);
		setText(Messages.CloseAllModelsAction_label);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		ResourceSet rset = getResource().getResourceSet();
		for (Iterator iterator = rset.getResources().iterator(); iterator.hasNext();) {
			Resource resource = (Resource) iterator.next();

			// close only platform resources, e.g. not pathmap libraries
			if (resource.getURI().isPlatformResource()) {
				closeModel(resource);
			}
		}
	}
}
