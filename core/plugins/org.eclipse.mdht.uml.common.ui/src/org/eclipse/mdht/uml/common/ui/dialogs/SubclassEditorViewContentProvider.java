/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.common.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.mdht.uml.common.util.PropertyList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;

public class SubclassEditorViewContentProvider extends AdapterFactoryContentProvider {

	private IDialogSettings fSettings;

	private boolean fShowTypes;

	private SubclassEditorTreeViewer fViewer;

	private final String SETTINGS_SECTION = "SubclassEditorDialog"; //$NON-NLS-1$

	private final String SETTINGS_SHOWTYPES = "showtypes"; //$NON-NLS-1$

	public SubclassEditorViewContentProvider() {
		super(SubclassEditorComposedAdapterFactory.getAdapterFactory());

		IDialogSettings dialogSettings = new DialogSettings(SETTINGS_SECTION);
		fSettings = dialogSettings.getSection(SETTINGS_SECTION);
		if (fSettings == null) {
			fSettings = dialogSettings.addNewSection(SETTINGS_SECTION);
			fSettings.put(SETTINGS_SHOWTYPES, false);
		}
		fShowTypes = fSettings.getBoolean(SETTINGS_SHOWTYPES);

		// TODO need to save these preferences on close with user state
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		List<NamedElement> children = new ArrayList<NamedElement>();

		if (parentElement instanceof Class) {
			// TODO if cloned/subsetted class, then set isAllSuperclases=false
			// add attributes, owned and inherited
			PropertyList propertyList = new PropertyList((Class) parentElement);
			children.addAll(propertyList.getAttributes());
			children.addAll(propertyList.getAssociationEnds());

		}
		return children.toArray();
	}

	@Override
	public Object getParent(Object element) {
		Object parent = null;
		if (element instanceof NamedElement) {
			parent = ((NamedElement) element).getNamespace();
		}

		return parent;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		fViewer = (SubclassEditorTreeViewer) viewer;
	}

	public boolean isShowTypes() {
		return fShowTypes;
	}

	public void setShowTypes(boolean showTypes) {
		if (fShowTypes != showTypes) {
			fShowTypes = showTypes;
			fSettings.put(SETTINGS_SHOWTYPES, showTypes);
			if (fViewer != null) {
				fViewer.refresh();
			}
		}
	}

	public SubclassEditorTreeViewer getViewer() {
		return fViewer;
	}

}
