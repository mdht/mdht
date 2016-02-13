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
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.window.Window;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class SubclassHandler {
	protected Shell shell;

	// subclass is the class that user selected to edit
	private Class subclass;

	protected SubclassEditorViewContentProvider contentProvider;

	protected SubclassEditorViewLabelProvider labelProvider;

	protected SubclassEditorDialog subclassDialog;

	public SubclassHandler(Shell shell, Class subclass, SubclassEditorViewContentProvider contentProvider,
			SubclassEditorViewLabelProvider labelProvider) {
		this.shell = shell;
		this.subclass = subclass;
		this.contentProvider = contentProvider;
		this.labelProvider = labelProvider;
	}

	public SubclassHandler(Shell shell, Class subclass) {
		this(shell, subclass, new SubclassEditorViewContentProvider(), new SubclassEditorViewLabelProvider());
	}

	public Class getSubclass() {
		return subclass;
	}

	public int openSubclassDialog() {
		// create and kick off a subclass editor
		subclassDialog = createSubclassDialog();
		int resultStatus = subclassDialog.open();
		// OK button is pressed
		if (subclassDialog.getReturnCode() == Window.OK) {
			// get user selections
			Object[] selectionArray = subclassDialog.getResult();
			// set the new property selection
			populateSubclassWithSelection(selectionArray, getSubclass());
		}

		return resultStatus;
	}

	protected SubclassEditorDialog createSubclassDialog() {
		SubclassEditorDialog subclassDialog = new SubclassEditorDialog(
			shell, labelProvider, contentProvider, getSubclass());
		// set the subclass attributes based on the tree viewer checked elements.
		EList<Property> subclassAttributes = getSubclass().getOwnedAttributes();
		if (subclassAttributes != null && !subclassAttributes.isEmpty()) {
			subclassDialog.setInitialElementSelections(subclassAttributes);
			subclassDialog.setModifyMode(true);
		}
		return subclassDialog;
	}

	private void populateSubclassWithSelection(Object[] selectionArray, Class selectedClass) {
		// assure that HDF profile is applied and library is imported
		// Package rootPackage = UMLUtil.getTopPackage(selectedClass);
		// HL7ResourceUtil.applyHDFProfile(rootPackage);
		// UMLUtil.importLibrary(rootPackage, DatatypeConstants.HL7_DATATYPES_1_0_LIBRARY_URI);

		if (selectionArray != null) {
			List<Property> selectedAttributes = new ArrayList<Property>();
			for (int i = 0; i < selectionArray.length; i++) {
				if (selectionArray[i] instanceof Property) {
					selectedAttributes.add((Property) selectionArray[i]);
				}
			}

			List<Property> cleanList = cleanUpSelection(selectedAttributes);

			// iterate through the result,
			// and create the class attributes with the selected Properties.
			for (Property property : cleanList) {
				Property clonedProperty = EcoreUtil.copy(property);
				// don't copy comments
				clonedProperty.getOwnedComments().clear();

				// must add property to class before applying stereotypes
				selectedClass.getOwnedAttributes().add(clonedProperty);
				UMLUtil.cloneStereotypes(property, clonedProperty);

				// add redefinition relationship
				clonedProperty.getRedefinedProperties().clear();
				clonedProperty.getSubsettedProperties().clear();

				if (property.getUpper() == 1) {
					clonedProperty.getRedefinedProperties().add(property);
				} else {
					clonedProperty.getSubsettedProperties().add(property);
					clonedProperty.setName(getUniquePropertyName(selectedClass, property.getName()));
				}

				// add association
				if (property.getAssociation() != null) {
					Association association = (Association) selectedClass.getNearestPackage().createOwnedType(
						null, UMLPackage.Literals.ASSOCIATION);
					association.getMemberEnds().add(clonedProperty);
					Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
					ownedEnd.setType(selectedClass);
					association.getOwnedEnds().add(ownedEnd);

					UMLUtil.cloneStereotypes(property.getAssociation(), association);
				}
			}
		}
	}

	private String getUniquePropertyName(Class owner, String name) {
		int seqNo = 1;
		String uniqueName = name;

		while (owner.getAttribute(uniqueName, null) != null) {
			uniqueName = name + String.valueOf(seqNo++);
		}
		while (owner.getInheritedMember(uniqueName) != null) {
			uniqueName = name + String.valueOf(seqNo++);
		}

		return uniqueName;
	}

	private List<Property> cleanUpSelection(List<Property> newSelectionList) {
		List<Property> newAttrList = new ArrayList<Property>(newSelectionList);

		// remove the unselected attributes and add new selections to the subclass
		List<Property> existingAttrList = new ArrayList<Property>(getSubclass().getOwnedAttributes());
		HashMap<String, Property> selectedAttrMap = new HashMap<String, Property>();
		// get a list of selected attribute names
		for (Property newProp : newSelectionList) {
			selectedAttrMap.put(newProp.getName(), newProp);
		}

		for (Property existingProp : existingAttrList) {
			// Checking on the attribute name, assuming that the RIM core class (Act, Entity, etc.)
			// does not have attribute names as its subclass attributes
			if (!selectedAttrMap.containsKey(existingProp.getName())) {
				// user unselected the existing attribute, remove it from the subclass
				if (existingProp.getAssociation() != null) {
					existingProp.getAssociation().destroy();
				}
				getSubclass().getOwnedAttributes().remove(existingProp);
			} else {
				// user did not uncheck the existing attribute, remove it from the
				// user selection list, so we won't add duplicate attribute.
				newAttrList.remove(selectedAttrMap.get(existingProp.getName()));
			}
		}
		return newAttrList;
	}

	// public void applyStereoType(Class lastSelectedClass){
	// //then apply the stereotype that user selected.
	// String qname = "RIM" + "::" + lastSelectedClass.getName();
	// Stereotype selectedStereotype = getDropClass().getApplicableStereotype(qname);
	// if(selectedStereotype!=null){
	// //unapply the subclass stereotype first
	// Stereotype currentStreotype = getDropClass().getAppliedStereotype(getDropClassName());
	// if (currentStreotype != null && getDropClass().isStereotypeApplied(currentStreotype)) {
	// getDropClass().unapplyStereotype(currentStreotype);
	// }
	// if (!getDropClass().isStereotypeApplied(selectedStereotype)) {
	// getDropClass().applyStereotype(selectedStereotype);
	// }
	// }
	// }

}
