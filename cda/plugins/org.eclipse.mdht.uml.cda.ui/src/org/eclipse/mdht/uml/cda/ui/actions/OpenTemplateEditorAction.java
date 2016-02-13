/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.cda.ui.dialogs.TemplateEditorViewContentProvider;
import org.eclipse.mdht.uml.cda.ui.dialogs.TemplateEditorViewLabelProvider;
import org.eclipse.mdht.uml.common.ui.actions.OpenSubclassEditorAction;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewContentProvider;
import org.eclipse.mdht.uml.common.ui.dialogs.SubclassEditorViewLabelProvider;
import org.eclipse.uml2.uml.Class;

public class OpenTemplateEditorAction extends OpenSubclassEditorAction {

	@Override
	protected SubclassEditorViewContentProvider getContentProvider() {
		return new TemplateEditorViewContentProvider();
	}

	@Override
	protected SubclassEditorViewLabelProvider getLabelProvider() {
		return new TemplateEditorViewLabelProvider();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		super.selectionChanged(action, selection);

		if (selectedClass != null) {
			Class cdaClass = CDAModelUtil.getCDAClass(selectedClass);
			// if the selectedClass is derived from a CDA model class, then enable the action
			if (cdaClass != null) {
				action.setEnabled(true);
				return;
			}
		}
		action.setEnabled(false);

	}
}
