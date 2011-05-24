/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
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
package org.openhealthtools.mdht.uml.hdf2xsd.transform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

public class TransformChoiceGroups {

	private List<Class> choiceGroups = new ArrayList<Class>();

	private List<Property> choiceProperties = new ArrayList<Property>();

	private XSDTransformerOptions transformerOptions;

	private Map<Class, List<String>> getChoiceMembers(Association association) {
		Map<Class, List<String>> choiceMembers = new HashMap<Class, List<String>>();

		Stereotype stereotype = HL7ResourceUtil.getAppliedHDFStereotype(
			association, IHDFProfileConstants.CHOICE_CONTENT);
		if (stereotype != null) {
			List values = (List) association.getValue(stereotype, IHDFProfileConstants.CHOICE_MEMBERS);
			for (int i = 0; i < values.size(); i++) {
				String member = IHDFProfileConstants.CHOICE_MEMBERS + "[" + i + "]";
				String choiceTarget = member + NamedElement.SEPARATOR + IHDFProfileConstants.CHOICE_TARGET;
				String traversalName = member + NamedElement.SEPARATOR + IHDFProfileConstants.TRAVERSAL_NAME;

				Class target = (Class) association.getValue(stereotype, choiceTarget);
				String name = (String) association.getValue(stereotype, traversalName);
				if (!choiceMembers.containsKey(target)) {
					List<String> list = new ArrayList<String>();
					list.add(name);
					choiceMembers.put(target, list);
				} else {
					List<String> list = choiceMembers.get(target);
					list.add(name);
				}
			}
		}

		return choiceMembers;
	}

	public TransformChoiceGroups(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	public void transformAllContents(Element element) {
		try {
			// first, find all choice groups
			TreeIterator iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();

				UMLSwitch choiceSwitch = new UMLSwitch() {
					@Override
					public Object caseClass(Class umlClass) {
						// a choice group must have <<choiceGroup>> stereotype
						Stereotype choiceGroup = HL7ResourceUtil.getAppliedHDFStereotype(
							umlClass, IHDFProfileConstants.CHOICE_GROUP);
						if (choiceGroup != null) {
							choiceGroups.add(umlClass);
							return umlClass;
						} else {
							return null;
						}
					}

					@Override
					public Object caseProperty(Property property) {
						if (isChoiceGroupRef(property)) {
							// don't process properties that are owned by a choice group
							// this is handled below
							Stereotype choiceGroup = HL7ResourceUtil.getAppliedHDFStereotype(
								property.getClass_(), IHDFProfileConstants.CHOICE_GROUP);
							if (choiceGroup == null) {
								choiceProperties.add(property);
							}
						}
						return property;
					}
				};

				choiceSwitch.doSwitch(child);
			}

			// transform the choice properties
			Property[] choicePropertiesArray = new Property[choiceProperties.size()];
			choicePropertiesArray = choiceProperties.toArray(choicePropertiesArray);
			for (int i = 0; i < choicePropertiesArray.length; i++) {
				if (choicePropertiesArray[i] != null) {
					transformChoiceProperty(choicePropertiesArray[i]);
				}
			}

			// remove the choice groups
			Class[] choiceGroupsArray = new Class[choiceGroups.size()];
			choiceGroupsArray = choiceGroups.toArray(choiceGroupsArray);
			for (int i = 0; i < choiceGroupsArray.length; i++) {
				if (choiceGroupsArray[i] != null) {
					List specializations = choiceGroupsArray[i].getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
					for (Iterator iter = specializations.iterator(); iter.hasNext();) {
						Generalization generalization = (Generalization) iter.next();
						generalization.destroy();
					}
					choiceGroupsArray[i].destroy();
				}
			}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Property must be owned by a class, part of an association,
	 * and have a choice group as its type.
	 */
	private boolean isChoiceGroupRef(Property property) {
		if (property.getClass_() != null && property.getAssociation() != null && property.getType() instanceof Class) {

			Stereotype choiceGroup = HL7ResourceUtil.getAppliedHDFStereotype(
				property.getType(), IHDFProfileConstants.CHOICE_GROUP);
			if (choiceGroup != null) {
				return true;
			}
		}
		return false;
	}

	/*
	 * TODO
	 * - choice group association may refer to a choice group
	 * - choice group member may refer to a choice group
	 * - choice group member may be a choice group
	 */

	private void transformChoiceProperty(Property property) {
		transformChoiceProperty(property, new HashMap<Class, List<String>>());
	}

	private void transformChoiceProperty(Property property, Map<Class, List<String>> choiceMembers) {
		XSDProfileUtil.applyXSDProfile(property);

		Class choiceClass = (Class) property.getType();
		String name = "_" + property.getName() + "Type";
		Class choiceGroup = (Class) property.getClass_().createNestedClassifier(name, UMLPackage.eINSTANCE.getClass_());
		property.setType(choiceGroup);
		XSDProfileUtil.applyXSDStereotype(choiceGroup, IXSDProfileConstants.CHOICE);
		XSDProfileUtil.applyXSDStereotype(choiceGroup, IXSDProfileConstants.GROUP);

		List<Property> choiceClassAttributes = new ArrayList<Property>(choiceClass.getOwnedAttributes());
		Map<Class, List<String>> childChoiceMembers = getChoiceMembers(property.getAssociation());
		choiceMembers.putAll(childChoiceMembers);

		List specializations = choiceClass.getTargetDirectedRelationships(UMLPackage.Literals.GENERALIZATION);
		// convert specializations to choice group associations
		// copy choiceClass properties into each choice member
		for (Iterator iter = specializations.iterator(); iter.hasNext();) {
			Generalization generalization = (Generalization) iter.next();
			Class choiceMember = (Class) generalization.getSpecific();

			List<String> traversalNames = new ArrayList<String>();
			if (choiceMembers.get(choiceMember) != null) {
				traversalNames.addAll(choiceMembers.get(choiceMember));
			} else {
				// if not specified in stereotype, use lowerCamelCase name of choice member class
				String traversalName = XSDTransformUtil.toLowerCamelCase(choiceMember.getName());
				traversalNames.add(traversalName);
			}

			for (String traversalName : traversalNames) {
				// HL7 models have some traversal names set to "1", which is an invalid name
				if (traversalName == null || traversalName.length() == 0 ||
						!Character.isLetter(traversalName.charAt(0))) {
					// if not specified in stereotype, use lowerCamelCase name of choice member class
					traversalName = XSDTransformUtil.toLowerCamelCase(choiceMember.getName());
				}
				Association choiceAssociation = choiceGroup.createAssociation(
					true, AggregationKind.NONE_LITERAL, traversalName, 1, 1, choiceMember, false,
					AggregationKind.NONE_LITERAL, null, 1, 1);

				// make the choice element nillable
				Property traversalProperty = (Property) choiceAssociation.getMember(traversalName);
				Stereotype xsdStereotype = XSDProfileUtil.applyXSDStereotype(
					traversalProperty, IXSDProfileConstants.ELEMENT);
				if (xsdStereotype != null) {
					traversalProperty.setValue(xsdStereotype, IXSDProfileConstants.ELEMENT_NILLABLE, Boolean.TRUE);
				}

				// if this property refers to a choice group, transform to nested choice
				if (isChoiceGroupRef(traversalProperty)) {
					// traversal names for specializations are defined in association to parent of generalization
					transformChoiceProperty(traversalProperty, choiceMembers);
				}
			}

			// copy each choiceClass property into anonChoiceMember
			for (Property targetProperty : choiceClassAttributes) {
				Property existingProperty = choiceMember.getOwnedAttribute(
					targetProperty.getName(), targetProperty.getType());
				if (existingProperty != null) {
					// already copied down from another choice group use
					continue;
				}
				Property targetCopy = EcoreUtil.copy(targetProperty);
				choiceMember.getOwnedAttributes().add(targetCopy);
				UMLUtil.cloneStereotypes(targetProperty, targetCopy);

				// Copy the association, if original was part of an association.
				// The association may be an AssociationClass and/or may have stereotypes.
				if (targetProperty.getAssociation() != null) {
					Association memberAssoc = EcoreUtil.copy(targetProperty.getAssociation());
					// Must add to resource before applying stereotypes
					choiceMember.getNearestPackage().getOwnedTypes().add(memberAssoc);
					UMLUtil.cloneStereotypes(targetProperty.getAssociation(), memberAssoc);
					memberAssoc.getOwnedEnds().clear();
					memberAssoc.getMemberEnds().clear();

					memberAssoc.getMemberEnds().add(targetCopy);

					for (Property originProperty : targetProperty.getAssociation().getOwnedEnds()) {
						Property originCopy = EcoreUtil.copy(originProperty);
						memberAssoc.getOwnedEnds().add(originCopy);
						UMLUtil.cloneStereotypes(originProperty, originCopy);
						originCopy.setType(choiceMember);
					}
				}

				// if this property refers to a choice group, transform to nested choice
				if (isChoiceGroupRef(targetCopy)) {
					transformChoiceProperty(targetCopy);
				}
			}
		}

	}

}
