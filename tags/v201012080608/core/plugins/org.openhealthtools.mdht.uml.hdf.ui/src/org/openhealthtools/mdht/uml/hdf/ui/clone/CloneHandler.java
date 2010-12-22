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
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hl7.core.util.DatatypeConstants;

public class CloneHandler {
    //drop class is the class that user selected to clone
	private Class dropClass;
	private String dropClassName;
	private EObject appliedStereotype;

	private CloneEditorDialog cloneDialog;

	public CloneHandler(EObject stereotype, EObject aDropClass, String aDropClassName){
		setDropClass(aDropClass);
		setDropClassName(aDropClassName);
		setAppliedStereotype(stereotype);
	}
	
	public CloneClass clone(){
		CloneClass aClone = null;
    	//create and kick off a clone editor
        cloneDialog = createCloneDialog();
        cloneDialog.open();
        //OK button is pressed
        if(cloneDialog.getReturnCode()== Dialog.OK){          	
        	//get user selections
        	Object[] selectionArray= cloneDialog.getResult();

    		//last selected class is the class that was last selected from the clone dialog 
            Class lastSelectedClass = cloneDialog.getSelectedClass();         	
    		aClone = new CloneClass();	
	        aClone.setStereotype(lastSelectedClass);
            //populate the drop class with the user selection 
	        populateDropClassWithSelection(selectionArray,getDropClass());   	        
	        aClone.setData(getDropClass());
        }
        return aClone;
	}
	
	public void modify(){
    	//create and kick off a clone editor
        cloneDialog = createCloneDialog();
        cloneDialog.open();
        //OK button is pressed
        if(cloneDialog.getReturnCode()== Dialog.OK){   
	    	//get user selections
	    	Object[] selectionArray= cloneDialog.getResult();
			//clear up all previous class properties
			//List<Property> dropClassAttrs = getDropClass().getOwnedAttributes();
			//set the new property selection
			populateDropClassWithSelection(selectionArray,getDropClass()); 
        }
	}

    private CloneEditorDialog createCloneDialog(){
        CloneEditorViewContentProvider contentProvider = new CloneEditorViewContentProvider();
        CloneEditorViewLabelProvider labelProvider = new CloneEditorViewLabelProvider();
        Shell shell = new Shell();
        
        CloneEditorDialog cloneDialog = 
        	new CloneEditorDialog(shell,labelProvider,contentProvider,getRIMClass());
        //set the drop class attributes if any to the tree viewer checked elements.
	    EList<Property> dropClassAttributes = getDropClass().getOwnedAttributes();
	    if(dropClassAttributes!=null && !dropClassAttributes.isEmpty()){
	    	cloneDialog.setInitialElementSelections(dropClassAttributes);
		    cloneDialog.setModifyMode(true);
	    }        
        return cloneDialog;
    }
    private void populateDropClassWithSelection(Object[] selectionArray, Class selectedClass){
    	//assure that HDF profile is applied and library is imported
    	Package rootPackage = UMLUtil.getTopPackage(selectedClass);
    	HL7ResourceUtil.applyHDFProfile(rootPackage);
		UMLUtil.importLibrary(rootPackage, DatatypeConstants.HL7_DATATYPES_1_0_LIBRARY_URI);
    	
        if(selectionArray!=null){
        	List<Property> selectedAttributes = new ArrayList<Property>();
        	for (int i = 0; i < selectionArray.length; i++) {
				if (selectionArray[i] instanceof Property)
					selectedAttributes.add((Property)selectionArray[i]);
			}
        	
        	List<Property> cleanList = cleanUpSelection(selectedAttributes);
        	
        	//iterate through the result, 
        	//and create the class attributes with the selected Properties. 
        	for (Property property : cleanList) {
		 		 Property clonedProperty = (Property)EcoreUtil.copy(property);
		 		 // don't copy comments from RIM
		 		 clonedProperty.getOwnedComments().clear();
		 		 
		 		 // must add property to class before applying stereotypes
		 		 selectedClass.getOwnedAttributes().add(clonedProperty);
		 		 UMLUtil.cloneStereotypes(property, clonedProperty);
			}
        } 
    }
    private List<Property> cleanUpSelection(List<Property> newSelectionList){
		List<Property> newAttrList = new ArrayList<Property>(newSelectionList);
    	
		//remove the existing attributes, and add current user selections to the clone class
		List<Property> existingAttrList = new ArrayList<Property>(getDropClass().getOwnedAttributes());
		HashMap<String,Property> selectedAttrMap = new HashMap<String,Property>();
		//get a list of selected attribute names
		for (Property newProp : newSelectionList) {
			selectedAttrMap.put(newProp.getName(),newProp);
		}
		for (Property existingProp : existingAttrList) {
			//Checking on the attribute name, assuming that the RIM core class (Act, Entity, etc.) 
			//does not have attribute names as its sub class attributes 
			if (existingProp.getAssociation() != null) {
				// don't remove any properties that are part of an Association
			}
			else if (!selectedAttrMap.containsKey(existingProp.getName())) {
				//user unselected the existing attribute, remove it from the drop class
				getDropClass().getOwnedAttributes().remove(existingProp);
			} else {
				//user did not uncheck the existing attribute, remove it from the
				//user selection list, so we wont add duplicate attribute.
				newAttrList.remove(selectedAttrMap.get(existingProp.getName()));
			}
		}
		return newAttrList;
    }
    private Class getRIMClass(){
        //use the applied stereotype name to get the class from the RIM model
        Class rimClass = null;
        String className = getDropClassName();        
        if(className!=null && className.trim().length()>0){
        	CloneEditorRIMUtil cloneEditorRIMUtil = new CloneEditorRIMUtil();
        	rimClass = cloneEditorRIMUtil.findRIMClass(
        			UMLUtil.getTopPackage(getDropClass()), getAppliedStereotype(),className);
        }
        return rimClass;
    }
    public void applyStereoType(Class lastSelectedClass){
		//then apply the stereotype that user selected.
		String qname = "RIM" + "::" + lastSelectedClass.getName();
		Stereotype selectedStereotype = getDropClass().getApplicableStereotype(qname);
		if(selectedStereotype!=null){
			//unapply the dropClass stereotype first
	    	Stereotype currentStreotype = getDropClass().getAppliedStereotype(getDropClassName());
			if (currentStreotype != null && getDropClass().isStereotypeApplied(currentStreotype)) {
				getDropClass().unapplyStereotype(currentStreotype);
			}
			if (!getDropClass().isStereotypeApplied(selectedStereotype)) {
				getDropClass().applyStereotype(selectedStereotype);
			}
		}
    }    
	private Class getDropClass() {
		return dropClass;
	}
	private void setDropClass(EObject dropClass) {
		if (dropClass instanceof Class)
			this.dropClass = (Class)dropClass;
		else
			throw new IllegalArgumentException("Invalid type dropped onto diagram");
	}
	private String getDropClassName() {
		return dropClassName;
	}
	private void setDropClassName(String dropClassName) {
		this.dropClassName = dropClassName;
	}
	private EObject getAppliedStereotype() {
		return appliedStereotype;
	}

	private void setAppliedStereotype(EObject appliedStereotype) {
		this.appliedStereotype = appliedStereotype;
	}
}
