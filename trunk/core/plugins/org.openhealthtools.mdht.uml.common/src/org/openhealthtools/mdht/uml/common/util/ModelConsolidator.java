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
	public static final String SOURCE_CLASS_ANNOTATION = "org.openhealthtools.mdht.sourceClass";

	private Package sourcePackage;

	private Map<Classifier, List<Classifier>> sourceInheritance;

	private Package consolPackage;

	private Map<String, Class> consolMapping;

	private Map<String, String> qnameMapping;

	private Map<Classifier, List<Classifier>> consolInheritance;

	private List<Classifier> importedClassifiers;

	private Set<Classifier> processedClassifiers;

	private boolean includeBaseModel = false;

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

	public boolean isIncludeBaseModel() {
		return includeBaseModel;
	}

	public void setIncludeBaseModel(boolean includeBaseModel) {
		this.includeBaseModel = includeBaseModel;
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

	protected boolean isDefaultCollapsed(NamedElement element) {
		boolean collapsed = false;

		return collapsed;
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
			EAnnotation annotation = type.getEAnnotation(SOURCE_CLASS_ANNOTATION);
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
			// if a more specific type defined in flattened model, use it
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
			if (!isIncludeBaseModel() && isBaseModel(property) && property.getLower() == 0) {
				// include only required base model class properties
				propertyIterator.remove();

			}
		}

		Iterator<Property> associationIterator = allAssociations.iterator();
		while (associationIterator.hasNext()) {
			Property property = associationIterator.next();
			if (!isIncludeBaseModel() && isBaseModel(property) && property.getLower() == 0) {
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

	protected void mergeInheritedProperties(Class sourceClass, Class consolidatedClass) {
		Class baseModelClass = getBaseModelClass(sourceClass);
		List<Classifier> allConsolidatedParents = UMLUtil.getAllGeneralizations(consolidatedClass);

		Class consolidationStop = null;
		for (Classifier consolParent : allConsolidatedParents) {
			if (!isIncludeBaseModel() && (isBaseModel(consolParent) || isReferenceModel(consolParent))) {
				continue;
			}

			// Does a parent class exist in consolidated model? If so, retain that generalization
			Class parentConsolClass = consolMapping.get(EcoreUtil.getURI(consolParent).toString());
			if (parentConsolClass != null && parentConsolClass != consolidatedClass) {
				consolidationStop = parentConsolClass;
				break;
			}

			// Does a specialization of the parent class exist in consolidated model? If so, retain that generalization
			Class consolSpecial = findConsolSpecialization((Class) consolParent);
			if (consolSpecial != null && consolSpecial != consolidatedClass) {
				// TODO problems with multiple subclasses in template models
				// consolidationStop = consolSpecial;
				// break;
			}
		}

		List<Classifier> consolidatedParents = getConsolidatedGeneralizations(
			consolidatedClass, getConsolSource(consolidationStop));

		List<Property> allProperties = getAllProperties(consolidatedClass, consolidationStop);
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
			if (consolidatedClass.getOwnedAttributes().contains(property)) {
				mergedProperty = property;
				// remove and re-add for correct sort order
				consolidatedClass.getOwnedAttributes().remove(property);
				consolidatedClass.getOwnedAttributes().add(property);
			} else {
				mergedProperty = EcoreUtil.copy(property);
				consolidatedClass.getOwnedAttributes().add(mergedProperty);
				UMLUtil.cloneStereotypes(property, mergedProperty);
			}

			// test original property so that we can evaluate base model context
			if (isIncludeBaseModel() && !ModelFilterUtil.hasFilterState(mergedProperty) && isDefaultFiltered(property)) {
				ModelFilterUtil.setAsHidden(mergedProperty);
			}
		}

		// XML elements
		for (Property property : allProperties) {
			Property mergedProperty = null;

			if (consolidatedClass.getOwnedAttributes().contains(property)) {
				mergedProperty = property;
				// remove and re-add for correct sort order
				consolidatedClass.getOwnedAttributes().remove(property);
				consolidatedClass.getOwnedAttributes().add(mergedProperty);
			} else {
				mergedProperty = EcoreUtil.copy(property);
				// must be added to model before applying stereotypes
				consolidatedClass.getOwnedAttributes().add(mergedProperty);
				UMLUtil.cloneStereotypes(property, mergedProperty);
			}

			// remove all property redefinition relationships to old superclasses
			mergedProperty.getRedefinedProperties().clear();

			// test original property so that we can evaluate base model context
			if (isIncludeBaseModel() && !ModelFilterUtil.hasFilterState(mergedProperty)) {
				if (isDefaultFiltered(property)) {
					ModelFilterUtil.setAsHidden(mergedProperty);
				} else if (isDefaultCollapsed(property)) {
					ModelFilterUtil.setAsCollapsed(mergedProperty);
				}
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

					if (property.getAssociation().getNearestPackage() != consolidatedClass.getNearestPackage()) {
						Association assocClone = (Association) consolidatedClass.getNearestPackage().createOwnedType(
							null, UMLPackage.Literals.ASSOCIATION);
						assocClone.getMemberEnds().add(mergedProperty);
						Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
						ownedEnd.setType(consolidatedClass);
						assocClone.getOwnedEnds().add(ownedEnd);

						UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);
					}
				}
			}
		}

		// Constraints
		for (Constraint constraint : allConstraints) {
			if (consolidatedClass.getOwnedRules().contains(constraint)) {
				// remove and re-add for correct sort order
				consolidatedClass.getOwnedRules().remove(constraint);
				consolidatedClass.getOwnedRules().add(constraint);
			} else {
				Constraint clone = EcoreUtil.copy(constraint);
				consolidatedClass.getOwnedRules().add(clone);
				UMLUtil.cloneStereotypes(constraint, clone);

				// remove constrainedElement to parent class model
				clone.getConstrainedElements().clear();
			}
		}

		// Comments
		List<Comment> currentComments = new ArrayList<Comment>(consolidatedClass.getOwnedComments());
		consolidatedClass.getOwnedComments().clear();

		// use i>0 to omit the consolidated class
		for (int i = consolidatedParents.size() - 1; i > 0; i--) {
			Classifier parent = consolidatedParents.get(i);
			List<Comment> comments = new ArrayList<Comment>(parent.getOwnedComments());

			for (Comment comment : comments) {
				Comment clone = EcoreUtil.copy(comment);
				consolidatedClass.getOwnedComments().add(clone);
				UMLUtil.cloneStereotypes(comment, clone);
			}
		}
		consolidatedClass.getOwnedComments().addAll(currentComments);

		// consolidated comments may refer to consolidated parent class
		for (Comment comment : consolidatedClass.getOwnedComments()) {
			comment.getAnnotatedElements().clear();
			comment.getAnnotatedElements().add(consolidatedClass);
		}

		// update generalizations
		// remove non-consolidated superclasses
		consolidatedClass.getGeneralizations().clear();
		if (!isIncludeBaseModel() && consolidationStop != null) {
			consolidatedClass.createGeneralization(consolidationStop);
		}
		if (!isIncludeBaseModel() && baseModelClass != null && consolidatedClass.getGeneralizations().isEmpty()) {
			consolidatedClass.createGeneralization(baseModelClass);
		}

		if (isIncludeBaseModel()) {
			List<Substitution> substitutions = new ArrayList<Substitution>(consolidatedClass.getSubstitutions());
			for (Substitution subst : substitutions) {
				subst.destroy();
			}
			consolidatedClass.createSubstitution(null, baseModelClass);

		} else {
			// add Substitition for all source model generalizations
			Set<Class> substitutions = new HashSet<Class>();
			List<Classifier> allSourceParents = UMLUtil.getAllGeneralizations(sourceClass);
			for (int i = allSourceParents.size() - 1; i >= 0; i--) {
				Class parent = (Class) allSourceParents.get(i);
				if ((isIncludeBaseModel() || (!isReferenceModel(parent) && !isBaseModel(parent))) &&
						!substitutions.contains(parent)) {
					// add Substitution
					// consolidatedClass.createSubstitution(null, parent);
					substitutions.add(parent);
				}
			}

		}
	}

	protected void mapExistingConsolidation() {
		for (Type consolType : consolPackage.getOwnedTypes()) {
			if (consolType instanceof Class) {
				EAnnotation annotation = consolType.getEAnnotation(SOURCE_CLASS_ANNOTATION);
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

	protected Class copyToConsolPackage(Class sourceClass) {
		Class mappedClass = consolMapping.get(EcoreUtil.getURI(sourceClass).toString());
		if (mappedClass == null) {
			mappedClass = EcoreUtil.copy(sourceClass);
			consolPackage.getOwnedTypes().add(mappedClass);
			UMLUtil.cloneStereotypes(sourceClass, mappedClass);

			consolMapping.put(EcoreUtil.getURI(sourceClass).toString(), mappedClass);
			consolInheritance.put(mappedClass, UMLUtil.getAllGeneralizations(sourceClass));

			if (!sourceClass.getQualifiedName().equals(mappedClass.getQualifiedName())) {
				qnameMapping.put(sourceClass.getQualifiedName(), mappedClass.getQualifiedName());
				// System.out.println("mapping: " + umlClass.getQualifiedName() + " -> " + mappedClass.getQualifiedName());

				// also map all superclass types to the consolidated class
				List<Classifier> allParents = UMLUtil.getAllGeneralizations(sourceClass);
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
			sourceAnnotation.setSource(SOURCE_CLASS_ANNOTATION);
			sourceAnnotation.getReferences().add(sourceClass);
			mappedClass.getEAnnotations().add(sourceAnnotation);

			for (Property property : sourceClass.getOwnedAttributes()) {
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
	protected List<Classifier> getConsolidatedGeneralizations(Classifier consolidatedClass, Class consolidationStop) {
		List<Classifier> parents = new ArrayList<Classifier>();
		parents.add(consolidatedClass);

		for (Classifier parent : consolidatedClass.getGenerals()) {
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
		EAnnotation annotation = umlClass.getEAnnotation(SOURCE_CLASS_ANNOTATION);
		if (annotation != null && !annotation.getReferences().isEmpty()) {
			for (EObject reference : annotation.getReferences()) {
				if (reference instanceof Class) {
					map.put(umlClass, UMLUtil.getAllGeneralizations((Class) reference));
				}
			}
		}
	}

	protected Class getConsolSource(Class consolidatedClass) {
		if (consolidatedClass != null) {
			EAnnotation annotation = consolidatedClass.getEAnnotation(SOURCE_CLASS_ANNOTATION);
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
