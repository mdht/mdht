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
package org.openhealthtools.mdht.uml.hdf.ui.clone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.hl7.core.util.RIMUtil;

public class CloneEditorRIMUtil {
	// private static final String RIM_MODEL_URI = "pathmap://HL7_RIM/RIM.uml";
	private static final String ACT = "Act";

	private static final String ROLE = "Role";

	private static final String ENTITY = "Entity";

	private static final String[] CORE_RIM_CLASSES = { "RIM::Act", "RIM::Role", "RIM::Entity" };

	private static final String[] RIM_CLASS_NAMES = { "Act", "Role", "Entity" };

	/**
	 * @param className
	 *            the qualified stereotype name. Ex: RIM::Act
	 * @return the Class that has the name based on the specified className
	 */
	public Class findRIMClass(Package basePackage, EObject classifier, String className) {
		// trying to find the core RIM class name. If the input className is not in the core then
		// go find it in the parent hierachy.
		String rimClassName = className;
		if (!Arrays.asList(CORE_RIM_CLASSES).contains(rimClassName) && classifier != null) {
			rimClassName = getRIMClassName(classifier);
		}

		// if a qualified name, get the simple class name
		rimClassName = rimClassName.substring(rimClassName.lastIndexOf(":") + 1, rimClassName.length());

		return RIMUtil.getClassByName(basePackage, rimClassName);
	}

	public static String getRIMClassName(EObject classifier) {
		List<String> allParentNames = getAllParentNames(classifier);
		String rimClassName = null;
		if (allParentNames != null && !allParentNames.isEmpty()) {
			if (allParentNames.contains(ACT)) {
				rimClassName = "RIM::Act";
			} else if (allParentNames.contains(ROLE)) {
				rimClassName = "RIM::Role";
			} else if (allParentNames.contains(ENTITY)) {
				rimClassName = "RIM::Entity";
			}
			/*
			 * TODO: add more cases for all core RIM classes
			 */
		}
		return rimClassName;
	}

	private static List<String> getAllParentNames(EObject classifier) {
		List<String> parentNames = null;
		if (classifier instanceof Classifier) {
			parentNames = new ArrayList<String>();
			parentNames.add(((Classifier) classifier).getName());
			for (Iterator<Classifier> iter = ((Classifier) classifier).getGenerals().iterator(); iter.hasNext();) {
				Classifier parent = iter.next();
				parentNames.addAll(getAllParentNames(parent));
			}
		}
		return parentNames;
	}

	public static boolean isStructuralAttribute(Property property) {
		return RIMUtil.isStructuralAttribute(property.getName());
	}

	public static boolean isCoreRIMClass(String className) {
		return Arrays.asList(RIM_CLASS_NAMES).contains(className);
	}
}
