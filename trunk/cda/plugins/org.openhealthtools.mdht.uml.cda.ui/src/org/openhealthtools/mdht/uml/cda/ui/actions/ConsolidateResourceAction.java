package org.openhealthtools.mdht.uml.cda.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;

public class ConsolidateResourceAction extends ConsolidateTemplatesAction {

	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);

		if (namedElement != null) {
			sourceResource = namedElement.eResource();
		}
	}

}
