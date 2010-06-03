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
package org.openhealthtools.mdht.uml.hdf.ui.clone;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

public class CloneEditorViewContentProvider extends AdapterFactoryContentProvider{

	private IDialogSettings fSettings;

	private boolean fShowTypes;
	
	private CloneEditorTreeViewer fViewer;

	private final String SETTINGS_SECTION= "CloneEditorDialog"; //$NON-NLS-1$

	private final String SETTINGS_SHOWTYPES= "showtypes"; //$NON-NLS-1$
	
	public CloneEditorViewContentProvider(){
		super(CloneEditorComposedAdapterFactory.getAdapterFactory());
		
		IDialogSettings dialogSettings= new DialogSettings(SETTINGS_SECTION);
		fSettings= dialogSettings.getSection(SETTINGS_SECTION);
		if (fSettings == null) {
			fSettings= dialogSettings.addNewSection(SETTINGS_SECTION);
			fSettings.put(SETTINGS_SHOWTYPES, true);
		}
		fShowTypes=fSettings.getBoolean(SETTINGS_SHOWTYPES);
	}
	
	public Object[] getChildren(Object parentElement){
		Object[] children = new Object[0];
		if (parentElement instanceof Class){
			List<Classifier> allClasses = new ArrayList<Classifier>();
			
			List<DirectedRelationship>specializations = 
				((Class)parentElement).getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
			if(specializations!=null && !specializations.isEmpty()){
				for (DirectedRelationship relationship : specializations) {
					Generalization generalization = (Generalization)relationship;
					
					// don't include <<subsets>> specializations
					Stereotype subsets = HL7ResourceUtil.getAppliedHDFStereotype(generalization, 
							IHDFProfileConstants.SUBSETS_GENERALIZATION);
					if (subsets == null) {
						allClasses.add(generalization.getSpecific());
					}
				}
				
				Object[] classArray= allClasses.toArray();
				Object[] attArray = getAttributes((Class)parentElement).toArray();
				children = new Object[classArray.length+attArray.length];
				
				System.arraycopy(attArray,0,children,0,attArray.length);
				System.arraycopy(classArray,0,children,attArray.length,classArray.length);
				
			}else{
				//if there's no subclass then return the class properties.
				children = getAttributes((Class)parentElement).toArray();
			}
		}
		return children;
	}
	
	public Object getParent(Object element){
		Object parent = null;
		if (element instanceof Property){
			parent = ((Property)element).getClass_();
		}
		return parent;//super.getParent(element);
	}

	public boolean hasChildren(Object element){
		return getChildren(element).length>0;
	}

	public Object[] getElements(Object inputElement){
		Object[] elements = null;
		Object[] filteredArray = null;
		if(!isShowTypes() && getViewer()!=null){
			List<Object> attList = new ArrayList<Object>();
			Class aClass = null;
			elements = getViewer().getCheckedElements();
			for (int i = 0; i < elements.length; i++) {
				if(elements[i] instanceof Class){
					aClass = (Class)elements[i];
					attList.addAll(attList.size(), getAttributes(aClass));
				}
			}
			Object[] inputAtts= getAttributes((Class)inputElement).toArray();
			elements = new Object[inputAtts.length+attList.size()];
			
			System.arraycopy(inputAtts,0,elements,0,inputAtts.length);
			System.arraycopy(attList.toArray(),0,elements,inputAtts.length,attList.size());
			filteredArray = filterStructuralAttributes(elements);
			
		}else{
			//get children for the tree view
			filteredArray = filterStructuralAttributes(getChildren(inputElement));
		}		
		return  filteredArray;
	}

	public void dispose(){
		super.dispose();
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		fViewer= (CloneEditorTreeViewer) viewer;
	}
	
	public boolean isShowTypes() {
		return fShowTypes;
	}

	public void setShowTypes(boolean showTypes) {
		if (fShowTypes != showTypes) {
			fShowTypes= showTypes;
			fSettings.put(SETTINGS_SHOWTYPES, showTypes);
			if (fViewer != null)
				fViewer.refresh();
		}
	}
	public CloneEditorTreeViewer getViewer() {
		return fViewer;
	}

	/**
	 * Get the owned attributes that are not part of an association.
	 */
	private List<Property> getAttributes(Class umlClass) {
		List<Property> properties = new ArrayList<Property>();
		for (Property property : umlClass.getOwnedAttributes()) {
			if (property.getAssociation() == null)
				properties.add(property);
		}
		return properties;
	}

	private Object[] filterStructuralAttributes(Object[] elementArray){
		Object[] filteredArray = null;
		List filteredList = new ArrayList();
		Object element = null;
		for (int i = 0; i < elementArray.length; i++) {
			element = elementArray[i];
			if(element instanceof Property){
				// leave all structural attributes in model
				filteredList.add(element);
				
//				if (!CloneEditorRIMUtil.isStructuralAttribute((Property)element)) {
//					filteredList.add((Property)element);
//				}
			}else{
				filteredList.add(element);
			}
		}
		if(filteredList.size()>0){
			filteredArray = filteredList.toArray();
		}
		return filteredArray;
	}
	
}
