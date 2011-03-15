/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.ui.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.emf.workspace.IWorkspaceCommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.RIMModelUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementComparator;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

public class ConsolidateTemplatesAction implements IObjectActionDelegate {
	private NamedElement namedElement;
	private Set<Class> copiedClasses = new HashSet<Class>();
	
	public ConsolidateTemplatesAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Consolidate Templates") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

			    	// assure that all proxies are resolved.
			    	EcoreUtil.resolveAll(namedElement.eResource());
			    	
					TreeIterator<Object> iterator = EcoreUtil.getAllContents(
							Collections.singletonList(namedElement));
					
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof Class
								&& CDAModelUtil.getCDAClass((Class)child) != null) {
							Class template = (Class) child;
							
							mergeInheritedProperties(template);
							iterator.prune();
						}
					}
					
//					for (Class umlClass : copiedClasses) {
//						// TODO rename class if same name already exists
//						System.out.println("Copy class: " + umlClass.getQualifiedName());
//						Class clonedClass = EcoreUtil.copy(umlClass);
//						namedElement.getNearestPackage().getOwnedTypes().add(clonedClass);
//						UMLUtil.cloneStereotypes(umlClass, clonedClass);
//					}

			        return Status.OK_STATUS;
			    }};

		    try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
		        commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		    } catch (ExecutionException ee) {
		    	ee.printStackTrace();
		    }

		} catch (Exception e) {
			throw new RuntimeException(e.getCause());
		}
	}

	private void mergeInheritedProperties(Class umlClass) {
		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		List<Classifier> allParents = new ArrayList<Classifier>(umlClass.allParents());
		allParents.add(0, umlClass);

		List<Property> allProperties = new ArrayList<Property>();
		List<Property> allAssociations = new ArrayList<Property>();
		List<Property> allAttributes = new ArrayList<Property>();
		List<Constraint> allConstraints = new ArrayList<Constraint>();
		
		// process parents in reverse order, CDA base class first
		for (int i=allParents.size()-1; i>=0; i--) {
			Class parent = (Class) allParents.get(i);
			
			for (Property property : parent.getOwnedAttributes()) {
				if (property.getAssociation() != null) {
					allAssociations.add(property);
				}
				else {
					// if list contains this property name, replace it; else append
					int index = findProperty(allProperties, property.getName());
					if (index >= 0) {
						allProperties.set(index, property);
					}
					else {
						allProperties.add(property);
					}
				}
			}
		}

		Iterator<Property> propertyIterator = allProperties.iterator();
		while (propertyIterator.hasNext()) {
			Property property = propertyIterator.next();
			if (CDAModelUtil.isCDAModel(property) && property.getLower() == 0) {
				// include only required CDA class properties
				propertyIterator.remove();
			}
		}

		Iterator<Property> associationIterator = allAssociations.iterator();
		while (associationIterator.hasNext()) {
			Property property = associationIterator.next();
			if (CDAModelUtil.isCDAModel(property) && property.getLower() == 0) {
				// include only required CDA class properties
				associationIterator.remove();
			}
		}
		
		allProperties.addAll(allAssociations);

		for (int i=allParents.size()-1; i>=0; i--) {
			Class parent = (Class) allParents.get(i);

			if (!CDAModelUtil.isCDAModel(parent)) {
				for (Constraint constraint : parent.getOwnedRules()) {
					allConstraints.add(constraint);
				}
			}
		}
		
		// use i>0 to omit this class
		for (int i=allParents.size()-1; i>0; i--) {
			Class parent = (Class) allParents.get(i);
			if (!RIMModelUtil.isRIMModel(parent) && !CDAModelUtil.isCDAModel(parent)) {
				// add Substitution
				umlClass.createSubstitution(null, parent);
			}
		}
		// change generalization to CDA base class
		umlClass.getGeneralizations().clear();
		umlClass.createGeneralization(cdaClass);

		for (Property property : allProperties) {
			if (CDAModelUtil.isXMLAttribute(property)) {
				allAttributes.add(property);
			}
		}
		allProperties.removeAll(allAttributes);
		Collections.sort(allAttributes, new NamedElementComparator());
		
		// XML attributes
		for (Property property : allAttributes) {
			if (umlClass.getOwnedAttributes().contains(property)) {
				// remove and re-add for correct sort order
				umlClass.getOwnedAttributes().remove(property);
				umlClass.getOwnedAttributes().add(property);
			}
			else {
				Property clone = EcoreUtil.copy(property);
				umlClass.getOwnedAttributes().add(clone);
				UMLUtil.cloneStereotypes(property, clone);
			}
		}
		
		// XML elements
		for (Property property : allProperties) {
			Property mergedProperty = null;

			if (umlClass.getOwnedAttributes().contains(property)) {
				mergedProperty = property;
				// remove and re-add for correct sort order
				umlClass.getOwnedAttributes().remove(property);
				umlClass.getOwnedAttributes().add(mergedProperty);
			}
			else {
				mergedProperty = EcoreUtil.copy(property);
				// must be added to model before applying stereotypes
				umlClass.getOwnedAttributes().add(mergedProperty);
				UMLUtil.cloneStereotypes(property, mergedProperty);
			}

			// clone association if from a different model
			if (property.getAssociation() != null
					&& !UMLUtil.isSameModel(umlClass, property.getAssociation())) {
				
				Association assocClone = (Association) umlClass.getNearestPackage()
					.createOwnedType(null, UMLPackage.Literals.ASSOCIATION);
				assocClone.getMemberEnds().add(mergedProperty);
				Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
				ownedEnd.setType(umlClass);
				assocClone.getOwnedEnds().add(ownedEnd);

				UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);
			}

			if (property.getAssociation() != null) {
				// if associated class is not in this package, copy it
				// TODO exclude classes that have been redefined in consolidated model
				Type endType = property.getType();
				if (!UMLUtil.isSameModel(umlClass, endType) && endType instanceof Class
						&& !CDAModelUtil.isCDAModel(endType)) {
					copiedClasses.add((Class)endType);
				}
			}

		}

		// Constraints
		for (Constraint constraint : allConstraints) {
			if (umlClass.getOwnedRules().contains(constraint)) {
				// remove and re-add for correct sort order
				umlClass.getOwnedRules().remove(constraint);
				umlClass.getOwnedRules().add(constraint);
			}
			else {
				Constraint clone = EcoreUtil.copy(constraint);
				umlClass.getOwnedRules().add(constraint);
				UMLUtil.cloneStereotypes(constraint, clone);
			}
		}
		
	}
	
	private int findProperty(List<Property> properties, String name) {
		if (name != null) {
			for (int i=0; i<properties.size(); i++) {
				if (name.equals(properties.get(i).getName()))
					return i;
			}
		}
		return -1;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		namedElement = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof NamedElement) {
				namedElement = (NamedElement) selected;
			}
		}
		
		action.setEnabled(namedElement != null);
	}

}
