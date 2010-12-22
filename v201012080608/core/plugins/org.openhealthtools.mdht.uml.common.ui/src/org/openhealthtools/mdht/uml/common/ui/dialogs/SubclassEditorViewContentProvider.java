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
package org.openhealthtools.mdht.uml.common.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.common.util.PropertyList;

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

	public Object[] getChildren(Object parentElement) {
		List<NamedElement> children = new ArrayList<NamedElement>();

		if (parentElement instanceof Class) {
			// TODO if cloned, then set isAllSuperclases=false
			// add attributes, owned and inherited
			PropertyList attrList = new PropertyList((Class) parentElement);
			children.addAll(attrList.getAttributes());

//			List<DirectedRelationship>specializations = 
//				((Class)parentElement).getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
//			if(specializations!=null && !specializations.isEmpty()){
//				for (DirectedRelationship relationship : specializations) {
//					Generalization generalization = (Generalization)relationship;
//					
//					// don't include <<subsets>> specializations
//					Stereotype subsets = HL7ResourceUtil.getAppliedHDFStereotype(generalization, 
//							IHDFProfileConstants.SUBSETS_GENERALIZATION);
//					if (subsets == null) {
//						children.add(generalization.getSpecific());
//					}
//				}
//			}
		}
		return children.toArray();
	}

	public Object getParent(Object element) {
		Object parent = null;
		if (element instanceof NamedElement) {
			parent = ((NamedElement) element).getNamespace();
		}

		return parent;// super.getParent(element);
	}

	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	public void dispose() {
		super.dispose();
	}

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
			if (fViewer != null)
				fViewer.refresh();
		}
	}

	public SubclassEditorTreeViewer getViewer() {
		return fViewer;
	}

	private Object[] filterStructuralAttributes(Object[] elementArray) {
		Object[] filteredArray = null;
		List filteredList = new ArrayList();
		Object element = null;
		for (int i = 0; i < elementArray.length; i++) {
			element = elementArray[i];
			if (element instanceof Property) {
				// leave all structural attributes in model
				filteredList.add(element);

//				 if (!CloneEditorRIMUtil.isStructuralAttribute((Property)element)) {
//				 	filteredList.add((Property)element);
//				 }
			} else {
				filteredList.add(element);
			}
		}
		if (filteredList.size() > 0) {
			filteredArray = filteredList.toArray();
		}
		return filteredArray;
	}

}
