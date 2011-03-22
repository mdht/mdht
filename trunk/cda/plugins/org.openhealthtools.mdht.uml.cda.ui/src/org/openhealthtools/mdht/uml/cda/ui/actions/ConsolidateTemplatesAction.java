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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.core.util.RIMModelUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementComparator;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class ConsolidateTemplatesAction implements IObjectActionDelegate {
	// command invoked on this model element
	private NamedElement namedElement;
	
	// resource and package containing the model element to be consolidated
	private Resource sourceResource;
	private Package sourcePackage;
	private Map<Classifier, List<Classifier>> sourceInheritance = new HashMap<Classifier, List<Classifier>>();

	// output model for template consolidation
	private String consolPath = "org.openhealthtools.mdht.uml.cda.toc.model/model/toc.uml";
	private Resource consolResource;
	private Package consolPackage;
	private Map<Class, Class> consolMapping = new HashMap<Class, Class>();
	private Map<Classifier, List<Classifier>> consolInheritance = new HashMap<Classifier, List<Classifier>>();
	
	// output model for vocab consolidation
	private String vocabPath = "org.openhealthtools.mdht.uml.cda.toc.model/model/toc-vocab.uml";
	private Resource vocabResource;
	private Package vocabPackage;
	private Map<Enumeration, Enumeration> vocabMapping = new HashMap<Enumeration, Enumeration>();
	
	public ConsolidateTemplatesAction() {
		super();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			URI consolURI = URI.createPlatformResourceURI(consolPath, true);
			consolResource = sourceResource.getResourceSet().getResource(consolURI, true);
			consolPackage = (Package) consolResource.getContents().get(0);

			URI vocabURI = URI.createPlatformResourceURI(vocabPath, true);
			vocabResource = sourceResource.getResourceSet().getResource(vocabURI, true);
			vocabPackage = (Package) vocabResource.getContents().get(0);
			
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(namedElement);
			IUndoableOperation operation = new AbstractEMFOperation(
					editingDomain, "Consolidate Templates") {
			    protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) {

			    	// assure that all proxies are resolved.
			    	EcoreUtil.resolveAll(sourceResource);
			    	List<EObject> eObjectList = new ArrayList<EObject>(sourceResource.getContents());

					TreeIterator<Object> iterator = EcoreUtil.getAllContents(eObjectList);
					while (iterator != null && iterator.hasNext()) {
						Object child = iterator.next();
						if (child instanceof Class
								&& CDAModelUtil.getCDAClass((Class)child) != null) {
							
							Class template = (Class) child;
							consolidateClass(template);
							
							iterator.prune();
						}
					}
					
			        return Status.OK_STATUS;
			    }};

		    try {
				IWorkspaceCommandStack commandStack = (IWorkspaceCommandStack) editingDomain.getCommandStack();
				operation.addContext(commandStack.getDefaultUndoContext());
		        commandStack.getOperationHistory().execute(operation, new NullProgressMonitor(), null);

		    } catch (ExecutionException ee) {
		    	ee.printStackTrace();
		    }
		    
		    consolResource.save(null);
		    vocabResource.save(null);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Class consolidateClass(Class umlClass) {
		if (CDAModelUtil.isCDAModel(umlClass)) {
			return umlClass;
		}
		
		Class consolidatedClass = consolMapping.get(umlClass);
		if (consolidatedClass == null) {
			System.out.println("Consolidate: " + umlClass.getQualifiedName());
			consolidatedClass = copyToConsolPackage(umlClass);
			mergeInheritedProperties(consolidatedClass);

			// if no templateId, copy from nearest parent
			String templateId = null;
			Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(
					umlClass, ICDAProfileConstants.CDA_TEMPLATE);
			if (hl7Template != null) {
				templateId = (String) umlClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
			}
			if (templateId == null) {
				// this method gets inherited templateId, if missing
				templateId = CDAModelUtil.getTemplateId(umlClass);
				if (templateId != null) {
					hl7Template = CDAProfileUtil.applyCDAStereotype(consolidatedClass, ICDAProfileConstants.CDA_TEMPLATE);
					consolidatedClass.setValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID, templateId);
				}
			}
		}
		
		return consolidatedClass;
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

		/*
		 * Include only associations that are not redefined in a subclass.
		 * TODO There must be a better way... use UML property redefinition in model.
		 */
		List<Classifier> endTypes = new ArrayList<Classifier>();
		for (Property property : allAssociations) {
			endTypes.add((Classifier)property.getType());
		}
		for (int index=0; index<allAssociations.size(); index++) {
			Classifier classifier = endTypes.get(index);
			
			boolean hasSubclass = false;
			for(Classifier specific : UMLUtil.getAllSpecializations(classifier)) {
				if (endTypes.contains(specific)) {
					hasSubclass = true;
					break;
				}
			}
			
			if (!hasSubclass) {
				allProperties.add(allAssociations.get(index));
			}
		}

		// collect all inherited constraints
		for (int i=allParents.size()-1; i>=0; i--) {
			Class parent = (Class) allParents.get(i);

			if (!CDAModelUtil.isCDAModel(parent)) {
				for (Constraint constraint : parent.getOwnedRules()) {
					allConstraints.add(constraint);
				}
			}
		}
		
		// use i>0 to omit the consolidated class
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
			
			ValueSetConstraint valueSetConstraint = TermProfileUtil.getValueSetConstraint(mergedProperty);
			if (valueSetConstraint != null) {
				ValueSetVersion valueSetVersion = valueSetConstraint.getReference();
				if (valueSetVersion != null) {
					Enumeration mappedValueSet = copyToConsolVocab(valueSetVersion.getBase_Enumeration());
					
					if (mappedValueSet != null) {
						ValueSetVersion mappedValueSetVersion = TermProfileUtil.getValueSetVersion(mappedValueSet);
						valueSetConstraint.setReference(mappedValueSetVersion);
					}
				}
			}

			if (property.getAssociation() != null) {
				Type endType = property.getType();
				if (endType instanceof Class) {
					// if a more specific type defined in source model, use it
					Class sourceSpecialization = findSourceSpecialization((Class)endType);
					Class consolEndType = sourceSpecialization!=null ? sourceSpecialization : (Class)endType;
					Class mappedEndType = consolidateClass(consolEndType);
					
					mergedProperty.setType(mappedEndType);

					Association assocClone = (Association) umlClass.getNearestPackage()
						.createOwnedType(null, UMLPackage.Literals.ASSOCIATION);
					assocClone.getMemberEnds().add(mergedProperty);
					Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
					ownedEnd.setType(umlClass);
					assocClone.getOwnedEnds().add(ownedEnd);

					UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);
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
				umlClass.getOwnedRules().add(clone);
				UMLUtil.cloneStereotypes(constraint, clone);
			}
		}

		// Comments
		List<Comment> currentComments = new ArrayList<Comment>(umlClass.getOwnedComments());
		umlClass.getOwnedComments().clear();

		// use i>0 to omit the consolidated class
		for (int i=allParents.size()-1; i>0; i--) {
			Classifier parent = allParents.get(i);
			List<Comment> comments = new ArrayList<Comment>(parent.getOwnedComments());
			
			for (Comment comment : comments) {
				Comment clone = EcoreUtil.copy(comment);
				umlClass.getOwnedComments().add(clone);
				UMLUtil.cloneStereotypes(comment, clone);
			}
		}
		umlClass.getOwnedComments().addAll(currentComments);
	}
	
	private Class copyToConsolPackage(Class umlClass) {
		Class mappedClass = consolMapping.get(umlClass);
		if (mappedClass == null) {
			mappedClass = EcoreUtil.copy(umlClass);
			consolPackage.getOwnedTypes().add(mappedClass);
			UMLUtil.cloneStereotypes(umlClass, mappedClass);
			consolMapping.put(umlClass, mappedClass);
			
			for (Property property : umlClass.getOwnedAttributes()) {
				if (property.getAssociation() != null) {
					Property mappedProperty = mappedClass.getOwnedAttribute(property.getName(), property.getType());
					
					Association assocClone = (Association) umlClass.getNearestPackage()
						.createOwnedType(null, UMLPackage.Literals.ASSOCIATION);
					assocClone.getMemberEnds().add(mappedProperty);
					Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
					ownedEnd.setType(umlClass);
					assocClone.getOwnedEnds().add(ownedEnd);
		
					UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);
				}
			}
		}
		
		return mappedClass;
	}
	
	private Enumeration copyToConsolVocab(Enumeration vocabEnum) {
		Enumeration mappedEnum = vocabMapping.get(vocabEnum);
		if (mappedEnum == null) {
			mappedEnum = EcoreUtil.copy(vocabEnum);

			vocabPackage.getOwnedTypes().add(mappedEnum);
			UMLUtil.cloneStereotypes(vocabEnum, mappedEnum);
			vocabMapping.put(vocabEnum, mappedEnum);
			System.out.println("Consolidate Vocab: " + vocabEnum.getQualifiedName());
		}
		
		return mappedEnum;
	}
	
	private void mapClassInheritance(Package umlPackage, Map<Classifier, List<Classifier>> map) {
		for (Type type : umlPackage.getOwnedTypes()) {
			// do not include Association
			if (type instanceof Class) {
				mapClassInheritance((Class)type, map);
			}
		}
	}
	
	private void mapClassInheritance(Class umlClass, Map<Classifier, List<Classifier>> map) {
		map.put(umlClass, UMLUtil.getAllGeneralizations(umlClass));
	}
	
	private Class findSourceSpecialization(Class umlClass) {
		Class specific = null;
		for (Classifier classifier : sourceInheritance.keySet()) {
			if (sourceInheritance.get(classifier).contains(umlClass)) {
				// must be a Class or UML model is invalid
				return (Class)classifier;
			}
		}
		
		return specific;
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
		sourceResource = null;
		namedElement = null;
		
		if (((IStructuredSelection)selection).size() == 1) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IAdaptable) {
				selected = (EObject) ((IAdaptable) selected).getAdapter(EObject.class);
			}
			if (selected instanceof NamedElement) {
				namedElement = (NamedElement) selected;
				sourceResource = namedElement.eResource();
				sourcePackage = namedElement.getNearestPackage();
				mapClassInheritance(sourcePackage, sourceInheritance);
			}
		}
		
		action.setEnabled(namedElement != null);
	}

}
