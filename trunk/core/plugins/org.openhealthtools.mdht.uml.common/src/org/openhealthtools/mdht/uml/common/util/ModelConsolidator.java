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
package org.openhealthtools.mdht.uml.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class ModelConsolidator {
	private Package sourcePackage;

	private Map<Classifier, List<Classifier>> sourceInheritance;

	private Package consolPackage;

	private Map<String, Class> consolMapping;

	private Map<String, String> qnameMapping;

	private Map<Classifier, List<Classifier>> consolInheritance;

	private List<Classifier> importedClassifiers;

	private Set<Classifier> processedClassifiers;

	private boolean flatten = false;

	public ModelConsolidator() {
		sourceInheritance = new HashMap<Classifier, List<Classifier>>();
		consolMapping = new HashMap<String, Class>();
		qnameMapping = new HashMap<String, String>();
		consolInheritance = new HashMap<Classifier, List<Classifier>>();
		importedClassifiers = new ArrayList<Classifier>();
		processedClassifiers = new HashSet<Classifier>();
	}

	public ModelConsolidator(Package sourcePackage, Package consolPackage) {
		this();

		this.sourcePackage = sourcePackage;
		this.consolPackage = consolPackage;

		// assure that all proxies are resolved.
		if (sourcePackage != null) {
			EcoreUtil.resolveAll(sourcePackage.eResource());
			mapClassInheritance(sourcePackage, sourceInheritance);
		}
		if (consolPackage != null) {
			EcoreUtil.resolveAll(consolPackage.eResource());
			mapExistingConsolidation();
			mapConsolInheritance(consolPackage, consolInheritance);
		}
	}

	public ModelConsolidator(Package sourcePackage, Package consolPackage, boolean flatten) {
		this(sourcePackage, consolPackage);

		this.flatten = flatten;
	}

	/**
	 * Default implementation: element's classifier has no superclass from a different package.
	 */
	protected boolean isBaseModel(Element element) {
		return false;

		// Package elementPackage = element.getNearestPackage();
		// Classifier elementClassifier = null;
		// if (element instanceof Classifier) {
		// elementClassifier = (Classifier) element;
		// } else {
		// EObject eContainer = element.eContainer();
		// while (eContainer != null) {
		// if (eContainer instanceof Classifier) {
		// elementClassifier = (Classifier) eContainer;
		// break;
		// }
		// eContainer = eContainer.eContainer();
		// }
		// }
		//
		// for (Classifier general : UMLUtil.getAllGeneralizations(elementClassifier)) {
		// if (elementPackage != general.getNearestPackage()) {
		// return false;
		// }
		// }
		//
		// return true;
	}

	/**
	 * Default implementation same as getBaseModel(), but allow for a more abstract reference model
	 * that is superclass of the base model.
	 */
	protected boolean isReferenceModel(Element element) {
		return isBaseModel(element);
	}

	protected Class getBaseModelClass(Classifier subClassifier) {
		Class baseModelClass = null;

		// if the provided class is from the base model
		if (isBaseModel(subClassifier) && subClassifier instanceof Class) {
			return (Class) subClassifier;
		}

		for (Classifier parent : subClassifier.allParents()) {
			// nearest package may be null if base model is not available
			if (parent.getNearestPackage() != null) {
				if (isBaseModel(parent) && parent instanceof Class) {
					baseModelClass = (Class) parent;
					break;
				}
			}
		}

		return baseModelClass;
	}

	protected Property getBaseModelProperty(Property property) {
		if (property.getClass_() == null) {
			return null;
		}

		// if the provided property is from a base model class
		if (isBaseModel(property)) {
			return property;
		}

		for (Classifier parent : property.getClass_().allParents()) {
			for (Property inherited : parent.getAttributes()) {
				if (inherited.getName().equals(property.getName()) && isBaseModel(inherited)) {
					return inherited;
				}
			}
		}

		return null;
	}

	public boolean isFlattened() {
		return flatten;
	}

	protected boolean isDefaultFiltered(NamedElement element) {
		boolean filtered = false;

		if (element instanceof Property) {
			Property property = (Property) element;
			if (isBaseModel(property) && property.getLower() == 0) {
				filtered = true;
			}
		}

		return filtered;
	}

	protected boolean isXMLAttribute(Property property) {
		Property baseProperty = getBaseModelProperty(property);
		if (baseProperty != null) {
			Stereotype eAttribute = baseProperty.getAppliedStereotype("Ecore::EAttribute");
			if (eAttribute != null) {
				return true;
			}
		}

		return false;
	}

	public List<Classifier> getImportedClassifiers() {
		return importedClassifiers;
	}

	public void addImportedClassifier(Classifier classifier) {
		if (!importedClassifiers.contains(classifier)) {
			importedClassifiers.add(classifier);
		}
	}

	public Set<Classifier> getProcessedClassifiers() {
		return processedClassifiers;
	}

	public void addProcessedClassifier(Classifier classifier) {
		if (!processedClassifiers.contains(classifier)) {
			processedClassifiers.add(classifier);
		}
	}

	public Map<String, Class> getConsolMapping() {
		return consolMapping;
	}

	public void removeAllConsolidationAnnotations() {
		for (Type type : consolPackage.getOwnedTypes()) {
			EAnnotation annotation = type.getEAnnotation("sourceClass");
			if (annotation != null) {
				type.getEAnnotations().remove(annotation);
			}
		}
	}

	public void renameReferencesInOCL() {
		// iterate through all OCL expressions in consolidated package

	}

	public Class consolidateClass(Class sourceClass) {
		if (isBaseModel(sourceClass)) {
			return sourceClass;
		}

		Class consolidatedClass = consolMapping.get(EcoreUtil.getURI(sourceClass).toString());
		if (consolidatedClass == null) {
			// if a more specific type defined in consol or source model, use it
			consolidatedClass = findConsolSpecialization(sourceClass);

			if (consolidatedClass == null) {
				// Class sourceSpecialization = findSourceSpecialization(sourceClass);
				// if (sourceSpecialization != null && sourceSpecialization != sourceClass) {
				// consolidateClass(sourceSpecialization);
				// } else {
				consolidatedClass = copyToConsolPackage(sourceClass);
				mergeInheritedProperties(sourceClass, consolidatedClass);
				// }
			}
		}

		return consolidatedClass;
	}

	public List<Property> getAllProperties(Classifier umlClass) {
		return getAllProperties(umlClass, null);
	}

	public List<Property> getAllProperties(Classifier umlClass, Class consolidationStop) {
		List<Property> allProperties = new ArrayList<Property>();
		List<Property> allAssociations = new ArrayList<Property>();

		List<Classifier> consolidatedParents = getConsolidatedGeneralizations(
			umlClass, getConsolSource(consolidationStop));

		// process parents in reverse order, base model class first
		for (int i = consolidatedParents.size() - 1; i >= 0; i--) {
			Classifier parent = consolidatedParents.get(i);

			for (Property property : UMLUtil.getOwnedAttributes(parent)) {
				if (property.getAssociation() != null) {
					allAssociations.add(property);
				} else {
					// if list contains this property name, replace it; else append
					int index = findProperty(allProperties, property.getName());
					if (index >= 0) {
						allProperties.set(index, property);
					} else {
						allProperties.add(property);
					}
				}
			}
		}

		Iterator<Property> propertyIterator = allProperties.iterator();
		while (propertyIterator.hasNext()) {
			Property property = propertyIterator.next();
			if (!isFlattened() && isBaseModel(property) && property.getLower() == 0) {
				// include only required base model class properties
				propertyIterator.remove();

			}
		}

		Iterator<Property> associationIterator = allAssociations.iterator();
		while (associationIterator.hasNext()) {
			Property property = associationIterator.next();
			if (!isFlattened() && isBaseModel(property) && property.getLower() == 0) {
				// include only required base model class properties
				associationIterator.remove();
			}
		}

		/*
		 * Include only associations that are not redefined in a subclass.
		 * TODO There must be a better way... use UML property redefinition in model.
		 */
		List<Classifier> endTypes = new ArrayList<Classifier>();
		List<Property> redefinedProperties = new ArrayList<Property>();

		for (Property property : allAssociations) {
			Classifier type = (Classifier) property.getType();
			endTypes.add(type);

			// classes are processed top-down, thus property from different class is in a superclass
			int dupIndex = endTypes.indexOf(type);
			if (dupIndex >= 0 && property.getClass_() != allAssociations.get(dupIndex).getClass_()) {
				redefinedProperties.add(allAssociations.get(dupIndex));
				// System.out.println(property.getQualifiedName() + " redefines " +
				// allAssociations.get(dupIndex).getQualifiedName());
			}
		}

		for (int index = 0; index < allAssociations.size(); index++) {
			Classifier endType = endTypes.get(index);

			boolean hasSpecialization = false;
			for (Classifier specific : UMLUtil.getAllSpecializations(endType)) {
				if (endTypes.contains(specific)) {
					hasSpecialization = true;
					break;
				}
			}

			Property assocProperty = allAssociations.get(index);
			if (!hasSpecialization && !redefinedProperties.contains(assocProperty)) {
				allProperties.add(assocProperty);
			}
		}

		return allProperties;
	}

	protected void mergeInheritedProperties(Class sourceClass, Class umlClass) {
		Class baseModelClass = getBaseModelClass(umlClass);
		// List<Classifier> allParents = new ArrayList<Classifier>(sourceClass.allParents());
		// allParents.add(0, sourceClass);
		List<Classifier> allSourceParents = UMLUtil.getAllGeneralizations(sourceClass);
		List<Classifier> allParents = UMLUtil.getAllGeneralizations(umlClass);

		Class consolidationStop = null;
		// umlClass.getGeneralizations().clear();
		for (Classifier classifier : allParents) {
			if (!isFlattened() && isBaseModel(classifier)) {
				break;
			}
			Class consolClass = consolMapping.get(EcoreUtil.getURI(classifier).toString());
			if (consolClass != null && consolClass != umlClass) {
				// umlClass.createGeneralization(consolClass);
				consolidationStop = consolClass;
				break;
			}
			Class consolSpecial = findConsolSpecialization((Class) classifier);
			if (consolSpecial != null && consolClass != umlClass) {
				// umlClass.createGeneralization(consolSpecial);
				consolidationStop = consolSpecial;
				break;
			}
		}

		List<Classifier> consolidatedParents = getConsolidatedGeneralizations(
			umlClass, getConsolSource(consolidationStop));

		List<Property> allProperties = getAllProperties(umlClass);
		List<Property> allAttributes = new ArrayList<Property>();
		List<Constraint> allConstraints = new ArrayList<Constraint>();

		// collect all inherited constraints
		for (int i = consolidatedParents.size() - 1; i >= 0; i--) {
			Class parent = (Class) consolidatedParents.get(i);

			if (!isBaseModel(parent)) {
				for (Constraint constraint : parent.getOwnedRules()) {
					allConstraints.add(constraint);
				}
			}
		}

		for (Property property : allProperties) {
			if (isXMLAttribute(property)) {
				allAttributes.add(property);
			}
		}
		allProperties.removeAll(allAttributes);
		Collections.sort(allAttributes, new NamedElementComparator());

		// XML attributes
		for (Property property : allAttributes) {
			Property mergedProperty = null;
			if (umlClass.getOwnedAttributes().contains(property)) {
				mergedProperty = property;
				// remove and re-add for correct sort order
				umlClass.getOwnedAttributes().remove(property);
				umlClass.getOwnedAttributes().add(property);
			} else {
				mergedProperty = EcoreUtil.copy(property);
				umlClass.getOwnedAttributes().add(mergedProperty);
				UMLUtil.cloneStereotypes(property, mergedProperty);
			}

			// test original property so that we can evaluate base model context
			if (isFlattened() && isDefaultFiltered(property)) {
				NamedElementUtil.setFilteredProperty(mergedProperty, true);
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
			} else {
				mergedProperty = EcoreUtil.copy(property);
				// must be added to model before applying stereotypes
				umlClass.getOwnedAttributes().add(mergedProperty);
				UMLUtil.cloneStereotypes(property, mergedProperty);
			}

			// remove all property redefinition relationships to old superclasses
			mergedProperty.getRedefinedProperties().clear();

			// test original property so that we can evaluate base model context
			if (isFlattened() && isDefaultFiltered(property)) {
				NamedElementUtil.setFilteredProperty(mergedProperty, true);
			}

			if (property.getAssociation() != null) {
				Type endType = property.getType();
				if (endType instanceof Class) {
					Class consolType = null;
					// if association to base model type, leave it unchanged
					if (!isBaseModel(endType)) {
						// if a more specific type defined in consol or source model, use it
						consolType = findConsolSpecialization((Class) endType);

						if (consolType == null) {
							Class sourceType = findSourceSpecialization((Class) endType);
							if (sourceType != null) {
								consolType = consolidateClass(sourceType);
							}
						}
					}
					if (consolType == null) {
						consolType = consolidateClass((Class) endType);
					}

					mergedProperty.setType(consolType);

					if (property.getAssociation().getNearestPackage() != umlClass.getNearestPackage()) {
						Association assocClone = (Association) umlClass.getNearestPackage().createOwnedType(
							null, UMLPackage.Literals.ASSOCIATION);
						assocClone.getMemberEnds().add(mergedProperty);
						Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
						ownedEnd.setType(umlClass);
						assocClone.getOwnedEnds().add(ownedEnd);

						UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);
					}
				}
			}
		}

		// Constraints
		for (Constraint constraint : allConstraints) {
			if (umlClass.getOwnedRules().contains(constraint)) {
				// remove and re-add for correct sort order
				umlClass.getOwnedRules().remove(constraint);
				umlClass.getOwnedRules().add(constraint);
			} else {
				Constraint clone = EcoreUtil.copy(constraint);
				umlClass.getOwnedRules().add(clone);
				UMLUtil.cloneStereotypes(constraint, clone);

				// remove constrainedElement to parent class model
				clone.getConstrainedElements().clear();
			}
		}

		// Comments
		List<Comment> currentComments = new ArrayList<Comment>(umlClass.getOwnedComments());
		umlClass.getOwnedComments().clear();

		// use i>0 to omit the consolidated class
		for (int i = consolidatedParents.size() - 1; i > 0; i--) {
			Classifier parent = consolidatedParents.get(i);
			List<Comment> comments = new ArrayList<Comment>(parent.getOwnedComments());

			for (Comment comment : comments) {
				Comment clone = EcoreUtil.copy(comment);
				umlClass.getOwnedComments().add(clone);
				UMLUtil.cloneStereotypes(comment, clone);
			}
		}
		umlClass.getOwnedComments().addAll(currentComments);

		// consolidated comments may refer to consolidated parent class
		for (Comment comment : umlClass.getOwnedComments()) {
			comment.getAnnotatedElements().clear();
			comment.getAnnotatedElements().add(umlClass);
		}

		// update generalizations
		// remove non-consolidated superclasses
		umlClass.getGeneralizations().clear();
		if (!isFlattened() && consolidationStop != null) {
			umlClass.createGeneralization(consolidationStop);
		}
		if (!isFlattened() && umlClass.getGeneralizations().isEmpty() && baseModelClass != null) {
			umlClass.createGeneralization(baseModelClass);
		}

		if (isFlattened()) {
			List<Substitution> substitutions = new ArrayList<Substitution>(umlClass.getSubstitutions());
			for (Substitution subst : substitutions) {
				subst.destroy();
			}
			umlClass.createSubstitution(null, baseModelClass);

		} else {
			// add Substitition for all source model generalizations
			Set<Class> substitutions = new HashSet<Class>();
			for (int i = allSourceParents.size() - 1; i >= 0; i--) {
				Class parent = (Class) allSourceParents.get(i);
				if ((isFlattened() || (!isReferenceModel(parent) && !isBaseModel(parent))) &&
						!substitutions.contains(parent)) {
					// add Substitution
					umlClass.createSubstitution(null, parent);
					substitutions.add(parent);
				}
			}

		}
	}

	protected void mapExistingConsolidation() {
		for (Type consolType : consolPackage.getOwnedTypes()) {
			if (consolType instanceof Class) {
				EAnnotation annotation = consolType.getEAnnotation("sourceClass");
				if (annotation != null && !annotation.getReferences().isEmpty()) {
					for (EObject reference : annotation.getReferences()) {
						if (reference instanceof Class) {
							consolMapping.put(EcoreUtil.getURI(reference).toString(), (Class) consolType);
						}
					}
				}
			}
		}
	}

	protected Class copyToConsolPackage(Class umlClass) {
		Class mappedClass = consolMapping.get(EcoreUtil.getURI(umlClass).toString());
		if (mappedClass == null) {
			mappedClass = EcoreUtil.copy(umlClass);
			consolPackage.getOwnedTypes().add(mappedClass);
			UMLUtil.cloneStereotypes(umlClass, mappedClass);
			consolMapping.put(EcoreUtil.getURI(umlClass).toString(), mappedClass);

			if (!umlClass.getQualifiedName().equals(mappedClass.getQualifiedName())) {
				qnameMapping.put(umlClass.getQualifiedName(), mappedClass.getQualifiedName());
				// System.out.println("mapping: " + umlClass.getQualifiedName() + " -> " + mappedClass.getQualifiedName());

				// also map all superclass types to the consolidated class
				List<Classifier> allParents = UMLUtil.getAllGeneralizations(umlClass);
				for (Classifier classifier : allParents) {
					if (!isBaseModel(classifier) && !isReferenceModel(classifier) &&
							qnameMapping.get(classifier.getQualifiedName()) == null) {
						qnameMapping.put(classifier.getQualifiedName(), mappedClass.getQualifiedName());
						// System.out.println("parent mapping: " + classifier.getQualifiedName() + " -> " +
						// mappedClass.getQualifiedName());
					}
				}
			}

			// add Ecore annotation with source UML class reference
			EAnnotation sourceAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			sourceAnnotation.setSource("sourceClass");
			sourceAnnotation.getReferences().add(umlClass);
			mappedClass.getEAnnotations().add(sourceAnnotation);

			for (Property property : umlClass.getOwnedAttributes()) {
				if (property.getAssociation() != null) {
					Property mappedProperty = mappedClass.getOwnedAttribute(property.getName(), property.getType());
					if (mappedProperty == null) {
						// this should never happen
						continue;
					}

					Association assocClone = (Association) mappedClass.getNearestPackage().createOwnedType(
						null, UMLPackage.Literals.ASSOCIATION);
					assocClone.getMemberEnds().add(mappedProperty);
					Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
					ownedEnd.setType(mappedClass);
					assocClone.getOwnedEnds().add(ownedEnd);

					UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);
				}
			}
		}

		return mappedClass;
	}

	/*
	 * Stop when reaching a previously consolidated class.
	 * TODO: doesn't support multiple inheritance
	 */
	protected List<Classifier> getConsolidatedGeneralizations(Classifier classifier, Class consolidationStop) {
		List<Classifier> parents = new ArrayList<Classifier>();
		parents.add(classifier);

		for (Classifier parent : classifier.getGenerals()) {
			Class special = findConsolSpecialization((Class) parent);
			if (special != null) {
				special = getConsolSource(special);
			}
			if (consolidationStop == null ||
					(!parents.contains(parent) && !consolidationStop.equals(parent) && !consolidationStop.equals(special))) {

				parents.addAll(getConsolidatedGeneralizations(parent, consolidationStop));
			}
		}

		return parents;
	}

	private void mapClassInheritance(Package umlPackage, Map<Classifier, List<Classifier>> map) {
		for (Type type : umlPackage.getOwnedTypes()) {
			// do not include Association
			if (type instanceof Class) {
				mapClassInheritance((Class) type, map);
			}
		}
	}

	private void mapConsolInheritance(Package umlPackage, Map<Classifier, List<Classifier>> map) {
		for (Type type : umlPackage.getOwnedTypes()) {
			// do not include Association
			if (type instanceof Class) {
				mapConsolInheritance((Class) type, map);
			}
		}
	}

	private void mapClassInheritance(Class umlClass, Map<Classifier, List<Classifier>> map) {
		map.put(umlClass, UMLUtil.getAllGeneralizations(umlClass));
	}

	private void mapConsolInheritance(Class umlClass, Map<Classifier, List<Classifier>> map) {
		EAnnotation annotation = umlClass.getEAnnotation("sourceClass");
		if (annotation != null && !annotation.getReferences().isEmpty()) {
			for (EObject reference : annotation.getReferences()) {
				if (reference instanceof Class) {
					map.put(umlClass, UMLUtil.getAllGeneralizations((Class) reference));
				}
			}
		}
	}

	protected Class getConsolSource(Class umlClass) {
		if (umlClass != null) {
			EAnnotation annotation = umlClass.getEAnnotation("sourceClass");
			if (annotation != null && !annotation.getReferences().isEmpty()) {
				for (EObject reference : annotation.getReferences()) {
					if (reference instanceof Class) {
						return (Class) reference;
					}
				}
			}
		}
		return null;
	}

	protected Class findConsolSpecialization(Class umlClass) {
		Class specific = null;
		for (Classifier classifier : consolInheritance.keySet()) {
			if (consolInheritance.get(classifier).contains(umlClass)) {
				// must be a Class or UML model is invalid
				return (Class) classifier;
			}
		}

		return specific;
	}

	protected Class findSourceSpecialization(Class umlClass) {
		Class specific = null;
		for (Classifier classifier : sourceInheritance.keySet()) {
			if (sourceInheritance.get(classifier).contains(umlClass)) {
				// must be a Class or UML model is invalid
				return (Class) classifier;
			}
		}

		return specific;
	}

	protected int findProperty(List<Property> properties, String name) {
		if (name != null) {
			for (int i = 0; i < properties.size(); i++) {
				if (name.equals(properties.get(i).getName())) {
					return i;
				}
			}
		}
		return -1;
	}

}
