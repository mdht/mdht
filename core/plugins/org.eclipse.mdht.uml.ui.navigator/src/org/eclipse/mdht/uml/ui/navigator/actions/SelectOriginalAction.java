/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.ui.navigator.actions;

import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.mdht.uml.common.ui.util.Selections;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * Select and reveal the original object that a wrapper object presents in the tree.
 */
public class SelectOriginalAction extends BaseSelectionListenerAction {
	private Viewer viewer;

	public SelectOriginalAction() {
		super("Select Original Element");
	}

	public void setActiveWorkbenchPart(IWorkbenchPart part) {
		// try a variety of mechanisms, in priority order, to get this part's principal viewer
		Viewer viewer = null;

		if (part instanceof IViewerProvider) {
			viewer = ((IViewerProvider) part).getViewer();
		} else if (part != null) {
			Object viewerAdapter = part.getAdapter(IViewerProvider.class);
			if (viewerAdapter instanceof IViewerProvider) {
				viewer = ((IViewerProvider) viewerAdapter).getViewer();
			}

			if (viewer == null) {
				viewerAdapter = part.getAdapter(Viewer.class);
				if (viewerAdapter instanceof Viewer) {
					viewer = (Viewer) viewerAdapter;
				} else if (part.getSite().getSelectionProvider() instanceof Viewer) {
					viewer = (Viewer) part.getSite().getSelectionProvider();
				}
			}
		}

		this.viewer = viewer;
	}

	@Override
	protected boolean updateSelection(IStructuredSelection selection) {
		boolean result = (viewer != null) && (selection.size() == 1) &&
				Selections.includesWrappers(selection, EObject.class);

		return super.updateSelection(selection) && result;
	}

	@Override
	public void run() {
		viewer.setSelection(Selections.unwrap(getStructuredSelection()), true);
	}
}
