/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.eclipse.mdht.uml.cda.core.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.mdht.uml.common.util.PropertyList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

public class RIMModelUtil {

	public static final String RIM_PACKAGE_NAME = "rim";

	public static List<Class> getAssociationTypes(Association association) {
		List<Class> associationTypes = new ArrayList<Class>();
		Type srcType = null;
		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {
				property.getType();
			} else {
				srcType = property.getType();
			}
		}

		if (srcType instanceof Class) {
			PropertyList propertyList = new PropertyList((Class) srcType);
			List<Property> associationEnds = propertyList.getAssociationEnds();

			for (Property property : associationEnds) {
				if (isActRelationship(association) && isActRelationship(property.getType())) {
					associationTypes.add((Class) property.getType());
				} else if (isParticipation(association) && isParticipation(property.getType())) {
					associationTypes.add((Class) property.getType());
				}
			}
		}

		return associationTypes;
	}

	public static Class getRIMClass(Class umlClass) {
		Class cdaClass = null;

		// if the provided class is from RIM and not a template
		if (isRIMModel(umlClass)) {
			return umlClass;
		}

		for (Classifier parent : umlClass.allParents()) {
			// nearest package may be null if RIM model is not available
			if (parent.getNearestPackage() != null) {
				if (isRIMModel(parent) && parent instanceof Class) {
					cdaClass = (Class) parent;
					break;
				}
			}
		}

		return cdaClass;
	}

	public static List<EnumerationLiteral> getTypeCodes(Class associationType) {
		List<EnumerationLiteral> typeCodes = new ArrayList<EnumerationLiteral>();
		if (associationType != null) {
			Property typeCode = associationType.getOwnedAttribute("typeCode", null);
			if (typeCode != null && typeCode.getType() instanceof Enumeration) {
				typeCodes.addAll(((Enumeration) typeCode.getType()).getOwnedLiterals());
			}
		}

		return typeCodes;
	}

	public static boolean isAct(Type umlClass) {
		return isRIMType(umlClass, "Act");
	}

	public static boolean isActRelationship(Association association) {
		Type srcType = null;
		Type targetType = null;
		for (Property property : association.getMemberEnds()) {
			if (property.isNavigable()) {
				targetType = property.getType();
			} else {
				srcType = property.getType();
			}
		}

		return isAct(srcType) && isAct(targetType);
	}

	public static boolean isActRelationship(Type umlClass) {
		return isRIMType(umlClass, "ActRelationship");
	}

	public static boolean isEntity(Type umlClass) {
		return isRIMType(umlClass, "Entity");
	}

	public static boolean isParticipation(Association association) {
		Type act = null;
		Type role = null;
		for (Property property : association.getMemberEnds()) {
			if (isAct(property.getType())) {
				act = property.getType();
			}
			if (isRole(property.getType())) {
				role = property.getType();
			}
		}

		return act != null && role != null;
	}

	public static boolean isParticipation(Type umlClass) {
		return isRIMType(umlClass, "Participation");
	}

	public static boolean isRIMModel(Element element) {
		return RIM_PACKAGE_NAME.equals((element.getNearestPackage() != null)
				? element.getNearestPackage().getName()
				: "");
	}

	public static boolean isRIMType(Type umlClass, String typeName) {
		if (umlClass instanceof Class && typeName != null) {
			Class rimClass = getRIMClass((Class) umlClass);
			if (rimClass != null && typeName.equals(rimClass.getName())) {
				return true;
			}
		}

		return false;
	}

	public static boolean isRole(Type umlClass) {
		return isRIMType(umlClass, "Role");
	}

}
