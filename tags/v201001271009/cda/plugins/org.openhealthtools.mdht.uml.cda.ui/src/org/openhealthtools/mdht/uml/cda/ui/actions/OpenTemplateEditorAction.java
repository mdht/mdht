package org.openhealthtools.mdht.uml.cda.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.ui.dialogs.TemplateEditorViewContentProvider;
import org.openhealthtools.mdht.uml.cda.ui.dialogs.TemplateEditorViewLabelProvider;
import org.openhealthtools.mdht.uml.common.ui.actions.OpenSubclassEditorAction;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.openhealthtools.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;

public class OpenTemplateEditorAction extends OpenSubclassEditorAction {
	
	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);
		
		if (selectedClass != null) {
			Class cdaClass = CDAModelUtil.getCDAClass(selectedClass);
			//if the selectedClass is derived from a CDA model class, then enable the action
			if (cdaClass != null) {
				action.setEnabled(true);
				return;
			}
		}
		action.setEnabled(false);

	}
	
	protected SubclassEditorViewContentProvider getContentProvider() {
		return new TemplateEditorViewContentProvider();
	}

	protected SubclassEditorViewLabelProvider getLabelProvider() {
		return new TemplateEditorViewLabelProvider();
	}
}
