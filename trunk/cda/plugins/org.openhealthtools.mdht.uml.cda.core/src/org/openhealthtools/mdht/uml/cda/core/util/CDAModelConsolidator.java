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
package org.openhealthtools.mdht.uml.cda.core.util;

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
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.common.util.NamedElementComparator;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetConstraint;
import org.openhealthtools.mdht.uml.term.core.profile.ValueSetVersion;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class CDAModelConsolidator {
	private Package sourcePackage;

	private Map<Classifier, List<Classifier>> sourceInheritance;

	private Package consolPackage;

	private Map<String, Class> consolMapping;

	private Map<Classifier, List<Classifier>> consolInheritance;

	private Package vocabPackage;

	private Map<String, Enumeration> vocabMapping;

	private List<Classifier> importedClassifiers;

	private Set<Classifier> processedClassifiers;

	public CDAModelConsolidator() {
		sourceInheritance = new HashMap<Classifier, List<Classifier>>();
		consolMapping = new HashMap<String, Class>();
		consolInheritance = new HashMap<Classifier, List<Classifier>>();
		vocabMapping = new HashMap<String, Enumeration>();
		importedClassifiers = new ArrayList<Classifier>();
		processedClassifiers = new HashSet<Classifier>();
	}

	public CDAModelConsolidator(Package sourcePackage, Package consolPackage, Package vocabPackage) {
		this();

		this.sourcePackage = sourcePackage;
		this.consolPackage = consolPackage;
		this.vocabPackage = vocabPackage;

		// assure that all proxies are resolved.
		if (sourcePackage != null) {
			EcoreUtil.resolveAll(sourcePackage.eResource());
		}
		if (consolPackage != null) {
			EcoreUtil.resolveAll(consolPackage.eResource());
		}
		if (vocabPackage != null) {
			EcoreUtil.resolveAll(vocabPackage.eResource());
		}
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

	public Class consolidateClass(Class sourceClass) {
		if (CDAModelUtil.isCDAModel(sourceClass)) {
			return sourceClass;
		}

		Class consolidatedClass = consolMapping.get(EcoreUtil.getURI(sourceClass).toString());
		if (consolidatedClass == null) {
			// System.out.println("Consolidate: " + sourceClass.getQualifiedName());
			consolidatedClass = copyToConsolPackage(sourceClass);
			mergeInheritedProperties(sourceClass, consolidatedClass);

			// if no templateId, copy from nearest parent
			String templateId = null;
			Stereotype hl7Template = CDAProfileUtil.getAppliedCDAStereotype(
				sourceClass, ICDAProfileConstants.CDA_TEMPLATE);
			if (hl7Template != null) {
				templateId = (String) sourceClass.getValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID);
			}
			if (templateId == null) {
				// this method gets inherited templateId, if missing
				templateId = CDAModelUtil.getTemplateId(sourceClass);
				if (templateId != null) {
					hl7Template = CDAProfileUtil.applyCDAStereotype(
						consolidatedClass, ICDAProfileConstants.CDA_TEMPLATE);
					consolidatedClass.setValue(hl7Template, ICDAProfileConstants.CDA_TEMPLATE_TEMPLATE_ID, templateId);
				}
			}
		}

		return consolidatedClass;
	}

	public List<Property> getAllProperties(Class umlClass) {
		return getAllProperties(umlClass, null);
	}

	public List<Property> getAllProperties(Class umlClass, Class consolidationStop) {
		List<Property> allProperties = new ArrayList<Property>();
		List<Property> allAssociations = new ArrayList<Property>();

		List<Classifier> consolidatedParents = getConsolidatedGeneralizations(
			umlClass, getConsolSource(consolidationStop));

		// process parents in reverse order, CDA base class first
		for (int i = consolidatedParents.size() - 1; i >= 0; i--) {
			Class parent = (Class) consolidatedParents.get(i);

			for (Property property : parent.getOwnedAttributes()) {
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
			endTypes.add((Classifier) property.getType());
		}
		for (int index = 0; index < allAssociations.size(); index++) {
			Classifier classifier = endTypes.get(index);

			boolean hasSubclass = false;
			for (Classifier specific : UMLUtil.getAllSpecializations(classifier)) {
				if (endTypes.contains(specific)) {
					hasSubclass = true;
					break;
				}
			}

			if (!hasSubclass) {
				allProperties.add(allAssociations.get(index));
			}
		}

		return allProperties;
	}

	private void mergeInheritedProperties(Class sourceClass, Class umlClass) {
		Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		// List<Classifier> allParents = new ArrayList<Classifier>(sourceClass.allParents());
		// allParents.add(0, sourceClass);
		List<Classifier> allSourceParents = UMLUtil.getAllGeneralizations(sourceClass);
		List<Classifier> allParents = UMLUtil.getAllGeneralizations(umlClass);

		Class consolidationStop = null;
		// umlClass.getGeneralizations().clear();
		for (Classifier classifier : allParents) {
			if (CDAModelUtil.isCDAModel(classifier)) {
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

			if (!CDAModelUtil.isCDAModel(parent)) {
				for (Constraint constraint : parent.getOwnedRules()) {
					allConstraints.add(constraint);
				}
			}
		}

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
			} else {
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
			} else {
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
					Class consolType = null;
					// if association to CDA type, leave it unchanged
					if (!CDAModelUtil.isCDAModel(endType)) {
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

		// update generalizations
		// remove non-consolidated superclasses
		umlClass.getGeneralizations().clear();
		if (consolidationStop != null) {
			umlClass.createGeneralization(consolidationStop);
		}
		if (umlClass.getGeneralizations().isEmpty()) {
			umlClass.createGeneralization(cdaClass);
		}

		// add Substitition for all source model generalizations
		Set<Class> substitutions = new HashSet<Class>();
		for (int i = allSourceParents.size() - 1; i >= 0; i--) {
			Class parent = (Class) allSourceParents.get(i);
			if (!RIMModelUtil.isRIMModel(parent) && !CDAModelUtil.isCDAModel(parent) && !substitutions.contains(parent)) {
				// add Substitution
				umlClass.createSubstitution(null, parent);
				substitutions.add(parent);
			}
		}
	}

	private void mapExistingConsolidation() {
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

		for (Type consolType : vocabPackage.getOwnedTypes()) {
			if (consolType instanceof Enumeration) {
				EAnnotation annotation = consolType.getEAnnotation("sourceClass");
				if (annotation != null && !annotation.getReferences().isEmpty()) {
					for (EObject reference : annotation.getReferences()) {
						if (reference instanceof Enumeration) {
							vocabMapping.put(EcoreUtil.getURI(reference).toString(), (Enumeration) consolType);
						}
					}
				}
			}
		}
	}

	private Class copyToConsolPackage(Class umlClass) {
		Class mappedClass = consolMapping.get(EcoreUtil.getURI(umlClass).toString());
		if (mappedClass == null) {
			mappedClass = EcoreUtil.copy(umlClass);
			consolPackage.getOwnedTypes().add(mappedClass);
			UMLUtil.cloneStereotypes(umlClass, mappedClass);
			consolMapping.put(EcoreUtil.getURI(umlClass).toString(), mappedClass);

			// add Ecore annotation with source UML class reference
			EAnnotation sourceAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			sourceAnnotation.setSource("sourceClass");
			sourceAnnotation.getReferences().add(umlClass);
			mappedClass.getEAnnotations().add(sourceAnnotation);

			for (Property property : umlClass.getOwnedAttributes()) {
				if (property.getAssociation() != null) {
					Property mappedProperty = mappedClass.getOwnedAttribute(property.getName(), property.getType());

					Association assocClone = (Association) umlClass.getNearestPackage().createOwnedType(
						null, UMLPackage.Literals.ASSOCIATION);
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
		Enumeration mappedEnum = vocabMapping.get(EcoreUtil.getURI(vocabEnum).toString());
		if (mappedEnum == null) {
			mappedEnum = EcoreUtil.copy(vocabEnum);

			vocabPackage.getOwnedTypes().add(mappedEnum);
			UMLUtil.cloneStereotypes(vocabEnum, mappedEnum);
			vocabMapping.put(EcoreUtil.getURI(vocabEnum).toString(), mappedEnum);
			System.out.println("Consolidate Vocab: " + vocabEnum.getQualifiedName());

			// add Ecore annotation with source UML classifier reference
			EAnnotation sourceAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
			sourceAnnotation.setSource("sourceClass");
			sourceAnnotation.getReferences().add(vocabEnum);
			mappedEnum.getEAnnotations().add(sourceAnnotation);
		}

		return mappedEnum;
	}

	/*
	 * Stop when reaching a previously consolidated class.
	 * TODO: doesn't support multiple inheritance
	 */
	private List<Classifier> getConsolidatedGeneralizations(Class classifier, Class consolidationStop) {
		List<Classifier> parents = new ArrayList<Classifier>();
		parents.add(classifier);

		for (Classifier parent : classifier.getGenerals()) {
			Class special = findConsolSpecialization((Class) parent);
			if (special != null) {
				special = getConsolSource(special);
			}
			if (consolidationStop == null ||
					(!parents.contains(parent) && !consolidationStop.equals(parent) && !consolidationStop.equals(special))) {

				parents.addAll(getConsolidatedGeneralizations((Class) parent, consolidationStop));
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

	private Class getConsolSource(Class umlClass) {
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

	private Class findConsolSpecialization(Class umlClass) {
		Class specific = null;
		for (Classifier classifier : consolInheritance.keySet()) {
			if (consolInheritance.get(classifier).contains(umlClass)) {
				// must be a Class or UML model is invalid
				return (Class) classifier;
			}
		}

		return specific;
	}

	private Class findSourceSpecialization(Class umlClass) {
		Class specific = null;
		for (Classifier classifier : sourceInheritance.keySet()) {
			if (sourceInheritance.get(classifier).contains(umlClass)) {
				// must be a Class or UML model is invalid
				return (Class) classifier;
			}
		}

		return specific;
	}

	private int findProperty(List<Property> properties, String name) {
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
