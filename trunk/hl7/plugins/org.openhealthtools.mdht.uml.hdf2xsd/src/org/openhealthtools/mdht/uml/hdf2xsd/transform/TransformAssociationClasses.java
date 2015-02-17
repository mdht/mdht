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
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.IRIMProfileConstants;

public class TransformAssociationClasses {

	private List<Association> associations = new ArrayList<Association>();

	private List<AssociationClass> expandAssociationClasses = new ArrayList<AssociationClass>();

	private List<AssociationClass> emptyAssociationClasses = new ArrayList<AssociationClass>();

	private XSDTransformerOptions transformerOptions;

	public TransformAssociationClasses(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	public void transformAllContents(Element element) {
		try {
			// find all associations with RIM stereotype
			// find all empty association classes
			TreeIterator iterator = EcoreUtil.getAllContents(Collections.singletonList(element));
			while (iterator != null && iterator.hasNext()) {
				EObject child = (EObject) iterator.next();

				UMLSwitch associationSwitch = new UMLSwitch() {
					@Override
					public Object caseAssociation(Association association) {
						if (!transformerOptions.isIncludeEmptyAssociationClasses()) {
							return association;
						}

						Stereotype participation = association.getAppliedStereotype(IRIMProfileConstants.RIM_PROFILE_NAME +
								NamedElement.SEPARATOR + IRIMProfileConstants.PARTICIPATION);
						Stereotype actRelationship = association.getAppliedStereotype(IRIMProfileConstants.RIM_PROFILE_NAME +
								NamedElement.SEPARATOR + IRIMProfileConstants.ACT_RELATIONSHIP);
						Stereotype roleLink = association.getAppliedStereotype(IRIMProfileConstants.RIM_PROFILE_NAME +
								NamedElement.SEPARATOR + IRIMProfileConstants.ROLE_LINK);

						if (participation != null || actRelationship != null || roleLink != null) {
							associations.add(association);
						}

						return association;
					}

					@Override
					public Object caseAssociationClass(AssociationClass association) {
						boolean isEmpty = true;
						for (Property property : association.getOwnedAttributes()) {
							if (property.getAssociation() == null) {
								isEmpty = false;
								break;
							}
						}

						// no local attributes found
						if (isEmpty && !transformerOptions.isIncludeEmptyAssociationClasses()) {
							emptyAssociationClasses.add(association);
						} else {
							expandAssociationClasses.add(association);
						}

						// return non-null to end switch meta-class promotion
						return association;
					}
				};

				associationSwitch.doSwitch(child);
			}

			// transform the associations to association classes
			Association[] associationsArray = new Association[associations.size()];
			associationsArray = associations.toArray(associationsArray);
			for (int i = 0; i < associationsArray.length; i++) {
				if (associationsArray[i] != null) {
					AssociationClass toAssociation = (AssociationClass) transformAssociation(
						associationsArray[i], UMLPackage.Literals.ASSOCIATION_CLASS);
					expandAssociationClasses.add(toAssociation);
				}
			}

			// transform the empty association classes to plain associations
			AssociationClass[] emptyAssociationClassesArray = new AssociationClass[emptyAssociationClasses.size()];
			emptyAssociationClassesArray = emptyAssociationClasses.toArray(emptyAssociationClassesArray);
			for (int i = 0; i < emptyAssociationClassesArray.length; i++) {
				if (emptyAssociationClassesArray[i] != null) {
					transformAssociation(emptyAssociationClassesArray[i], UMLPackage.Literals.ASSOCIATION);
				}
			}

			// expand association classes to two separate associations
			AssociationClass[] expandAssociationClassesArray = new AssociationClass[expandAssociationClasses.size()];
			expandAssociationClassesArray = expandAssociationClasses.toArray(expandAssociationClassesArray);
			for (int i = 0; i < expandAssociationClassesArray.length; i++) {
				if (expandAssociationClassesArray[i] != null) {
					expandAssociationClass(expandAssociationClassesArray[i]);
				}
			}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Transform an association to to either an Association or AssociationClass.
	 */
	private Association transformAssociation(Association fromAssociation, EClass eClass) {
		if (fromAssociation.getMemberEnds().size() != 2) {
			return null;
		}

		Property end1 = fromAssociation.getMemberEnds().get(0);
		Property end2 = fromAssociation.getMemberEnds().get(1);

		Association toAssociation = (Association) fromAssociation.getNearestPackage().createOwnedType(
			fromAssociation.getName(), eClass);
		UMLUtil.cloneStereotypes(fromAssociation, toAssociation);

		if (fromAssociation.getOwnedEnds().contains(end1)) {
			toAssociation.getOwnedEnds().add(end1);
		} else {
			toAssociation.getMemberEnds().add(end1);
		}

		if (fromAssociation.getOwnedEnds().contains(end2)) {
			toAssociation.getOwnedEnds().add(end2);
		} else {
			toAssociation.getMemberEnds().add(end2);
		}

		fromAssociation.destroy();

		return toAssociation;
	}

	/**
	 * Expand an AssociationClass to two separate associations.
	 */
	private void expandAssociationClass(AssociationClass associationClass) {
		if (associationClass.getMemberEnds().size() != 2) {
			return;
		}

		Package umlPackage = associationClass.getNearestPackage();

		Class umlClass = (Class) umlPackage.createOwnedType(associationClass.getName(), UMLPackage.Literals.CLASS);
		UMLUtil.cloneStereotypes(associationClass, umlClass);

		// end1 is the non-navigable end
		Property end1 = associationClass.getOwnedEnds().get(0);
		Property end2 = end1.getOtherEnd();
		Class sourceEnd = (Class) end1.getType();
		Class targetEnd = (Class) end2.getType();

		String targetRoleName = null;

		Stereotype participation = associationClass.getAppliedStereotype(IRIMProfileConstants.RIM_PROFILE_NAME +
				NamedElement.SEPARATOR + IRIMProfileConstants.PARTICIPATION);
		Stereotype actRelationship = associationClass.getAppliedStereotype(IRIMProfileConstants.RIM_PROFILE_NAME +
				NamedElement.SEPARATOR + IRIMProfileConstants.ACT_RELATIONSHIP);
		Stereotype roleLink = associationClass.getAppliedStereotype(IRIMProfileConstants.RIM_PROFILE_NAME +
				NamedElement.SEPARATOR + IRIMProfileConstants.ROLE_LINK);

		if (participation != null) {
			targetRoleName = (String) associationClass.getValue(participation, IRIMProfileConstants.TARGET_ROLE_NAME);
		} else if (actRelationship != null) {
			targetRoleName = (String) associationClass.getValue(actRelationship, IRIMProfileConstants.TARGET_ROLE_NAME);
		} else if (roleLink != null) {
			targetRoleName = (String) associationClass.getValue(roleLink, IRIMProfileConstants.TARGET_ROLE_NAME);
		}

		if (targetRoleName == null || targetRoleName.trim().length() == 0) {
			targetRoleName = XSDTransformUtil.toLowerCamelCase(targetEnd.getName());
		}

		Association association1 = (Association) umlPackage.createOwnedType(null, UMLPackage.Literals.ASSOCIATION);
		sourceEnd.getOwnedAttributes().add(end2);
		end2.setType(umlClass);
		association1.getMemberEnds().add(end2);
		association1.createOwnedEnd(null, sourceEnd);

		Association association2 = (Association) umlPackage.createOwnedType(null, UMLPackage.Literals.ASSOCIATION);
		Property end3 = umlClass.createOwnedAttribute(targetRoleName, targetEnd);
		association2.getMemberEnds().add(end3);
		association2.createOwnedEnd(null, umlClass);

		List<Property> attributes = new ArrayList<Property>(associationClass.getOwnedAttributes());
		for (Property property : attributes) {
			umlClass.getOwnedAttributes().add(property);
		}

		associationClass.destroy();
	}
}
