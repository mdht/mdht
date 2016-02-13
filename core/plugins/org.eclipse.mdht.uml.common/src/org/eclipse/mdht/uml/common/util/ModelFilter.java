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
package org.eclipse.mdht.uml.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.mdht.uml.common.internal.Logger;
import org.eclipse.mdht.uml.common.modelfilter.ModelFilterUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class ModelFilter {
	private Package sourcePackage;

	private Package filteredPackage;

	private Map<String, Class> filteredMapping;

	public ModelFilter(Package sourcePackage, Package filteredPackage) {
		this.sourcePackage = sourcePackage;
		this.filteredPackage = filteredPackage;
		filteredMapping = new HashMap<String, Class>();

		// assure that all proxies are resolved.
		if (sourcePackage != null) {
			EcoreUtil.resolveAll(sourcePackage.eResource());
		}
		if (filteredPackage != null) {
			EcoreUtil.resolveAll(filteredPackage.eResource());
		}

		// attempt to load XSD DataTypes library, if available
		URI xsdDatatypesURI = URI.createURI("pathmap://XMLmodeling_LIBRARIES/XSDDataTypes.library.uml");
		sourcePackage.eResource().getResourceSet().getResource(xsdDatatypesURI, true);

		assignFilteredNamespaceURI(sourcePackage, filteredPackage);
	}

	public Package getFilteredPackage() {
		return filteredPackage;
	}

	protected boolean isDefaultHidden(NamedElement element) {
		boolean hidden = false;

		return hidden;
	}

	protected boolean isDefaultCollapsed(NamedElement element) {
		boolean collapsed = false;

		return collapsed;
	}

	public boolean isHidden(NamedElement element) {
		if (ModelFilterUtil.isHidden(element)) {
			return true;
		} else if (ModelFilterUtil.isShown(element)) {
			return false;
		} else if (ModelFilterUtil.isCollapsed(element)) {
			return false;
		} else {
			return isDefaultHidden(element);
		}
	}

	public boolean isCollapsed(NamedElement element) {
		return ModelFilterUtil.isCollapsed(element)
				? true
				: isDefaultCollapsed(element);
	}

	public void filterPackage(Package pkg) {
		try {
			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(Collections.singletonList(pkg));
			while (iterator != null && iterator.hasNext()) {
				EObject child = iterator.next();

				if (child instanceof Class) {
					filterClass((Class) child);
				}
			}
		} catch (IndexOutOfBoundsException e) {
			Logger.logException(e);
		}
	}

	public Class filterClass(Class sourceClass) {
		if (isHidden(sourceClass)) {
			// omit this class from filtered model
			return null;
		}

		Class filteredClass = filteredMapping.get(EcoreUtil.getURI(sourceClass).toString());
		if (filteredClass == null) {
			// inner classes were previously copied as content of parent class
			if (sourceClass.getOwner() instanceof Class) {
				Class filteredOwner = filteredMapping.get(EcoreUtil.getURI(sourceClass.getOwner()).toString());
				if (filteredOwner != null) {
					filteredClass = (Class) filteredOwner.getNestedClassifier(sourceClass.getName());
				}
			}
			if (filteredClass == null) {
				filteredClass = EcoreUtil.copy(sourceClass);
				filteredPackage.getOwnedTypes().add(filteredClass);
				UMLUtil.cloneStereotypes(sourceClass, filteredClass);
			}

			filteredMapping.put(EcoreUtil.getURI(sourceClass).toString(), filteredClass);

			// rename using business name (use sourceClass to get corresponding .properties)
			String businessName = getFilteredClassName(sourceClass);
			if (businessName != null) {
				filteredClass.setName(businessName);
			}

			List<Property> sourceAttributes = new ArrayList<Property>(sourceClass.getOwnedAttributes());
			for (Property property : sourceAttributes) {
				processProperty(property, filteredClass);
			}

			// remove all constraints from filtered model
			List<Constraint> constraints = new ArrayList<Constraint>(filteredClass.getOwnedRules());
			for (Constraint constraint : constraints) {
				constraint.destroy();
			}
		}

		return filteredClass;
	}

	protected void processProperty(Property property, Class filteredClass) {
		String businessName = getFilteredPropertyName(property);
		Property mappedProperty = filteredClass.getOwnedAttribute(property.getName(), null);
		if (mappedProperty == null) {
			mappedProperty = filteredClass.getOwnedAttribute(businessName, null);
			if (mappedProperty == null) {
				return;
			}
		}

		// remove hidden properties
		if (isHidden(property)) {
			filteredClass.getOwnedAttributes().remove(mappedProperty);
			mappedProperty.destroy();
			return;
		}

		// process collapsed properties
		if (isCollapsed(property)) {
			List<Property> collapsedContent = getCollapsedContent(property);
			// remove original property and replace with collapsed content
			filteredClass.getOwnedAttributes().remove(mappedProperty);
			mappedProperty.destroy();

			for (Property collapsedProperty : collapsedContent) {
				// clone the property
				Property clonedProperty = EcoreUtil.copy(collapsedProperty);
				filteredClass.getOwnedAttributes().add(clonedProperty);
				UMLUtil.cloneStereotypes(collapsedProperty, clonedProperty);

				// collapsed property cannot have lower bound multiplicity greater than its parent
				if (clonedProperty.getLower() > property.getLower()) {
					clonedProperty.setLower(property.getLower());
				}

				// process collapsed content recursively
				// use the source property to gain access to original structure and filtering criteria
				processProperty(collapsedProperty, filteredClass);

				// if only one collapsed property, rename to same as parent
				// do this last, to not interfere with processing property in previous step
				if (collapsedContent.size() == 1) {
					clonedProperty.setName(businessName);
				}
			}
			return;
		}

		// rename using business name (use sourceClass property to get corresponding .properties)
		mappedProperty.setName(businessName);

		// if property type is a class in the same package, create filtered class as new property type
		Type filteredType = null;
		if (property.getType() instanceof Class &&
				property.getType().getNearestPackage() == property.getNearestPackage()) {
			filteredType = filterClass((Class) property.getType());
			mappedProperty.setType(filteredType);
		} else {
			filteredType = property.getType();
		}

		// copy association
		if (property.getAssociation() != null) {
			Association assocClone = (Association) filteredPackage.createOwnedType(
				null, UMLPackage.Literals.ASSOCIATION);
			assocClone.getMemberEnds().add(mappedProperty);
			Property ownedEnd = UMLFactory.eINSTANCE.createProperty();
			ownedEnd.setType(filteredClass);
			assocClone.getOwnedEnds().add(ownedEnd);

			UMLUtil.cloneStereotypes(property.getAssociation(), assocClone);

		} else {
			// property type may be replaced with a specialized type, e.g. an Enumeration
			// use source property to allow for resource properties file lookup
			Classifier newType = getFilteredPropertyType(property);
			if (newType != null) {
				mappedProperty.setType(newType);
			}
		}
	}

	protected boolean isXMLAttribute(Property property) {
		Stereotype eAttribute = property.getAppliedStereotype("Ecore::EAttribute");
		return (eAttribute != null)
				? true
				: false;
	}

	protected String normalizeCodeName(String name) {
		String result = "";
		String[] parts = name.split(" ");
		for (String part : parts) {
			result += part.substring(0, 1).toUpperCase() + part.substring(1);
		}
		return result;
	}

	protected void assignFilteredNamespaceURI(Package sourcePackage, Package filteredPackage) {
		// may be implemented by subclasses
	}

	protected String getFilteredClassName(Class umlClass) {
		String businessName = NamedElementUtil.getBusinessName(umlClass);
		if (businessName != null) {
			businessName = normalizeCodeName(businessName);
			businessName = UML2Util.getValidJavaIdentifier(businessName);
			businessName = businessName.substring(0, 1).toUpperCase() + businessName.substring(1);
		}
		return businessName;
	}

	protected String getFilteredPropertyName(Property property) {
		String businessName = NamedElementUtil.getBusinessName(property);
		if (businessName != null) {
			businessName = normalizeCodeName(businessName);
			businessName = UML2Util.getValidJavaIdentifier(businessName);
			businessName = businessName.substring(0, 1).toLowerCase() + businessName.substring(1);
		}
		return businessName;
	}

	protected Classifier getFilteredPropertyType(Property property) {
		return getPropertyTypeReplacement(property);
	}

	protected List<Property> getCollapsedContent(Property property) {
		List<Property> collapsedContent = new ArrayList<Property>();
		if (property.getType() instanceof Class) {
			for (Property nestedProperty : ((Class) property.getType()).getOwnedAttributes()) {
				if (!isHidden(nestedProperty)) {
					collapsedContent.add(nestedProperty);
				}
			}
		}

		return collapsedContent;
	}

	protected Classifier getPropertyTypeReplacement(Property property) {
		String qualifiedName = ModelFilterUtil.getTypeReplacement(property);
		if (qualifiedName != null) {
			ResourceSet resourceSet = property.eResource().getResourceSet();

			Collection<NamedElement> elements = org.eclipse.uml2.uml.util.UMLUtil.findNamedElements(
				resourceSet, qualifiedName);
			for (NamedElement namedElement : elements) {
				if (namedElement instanceof Classifier) {
					return (Classifier) namedElement;
				}
			}
		}

		return null;
	}
}
