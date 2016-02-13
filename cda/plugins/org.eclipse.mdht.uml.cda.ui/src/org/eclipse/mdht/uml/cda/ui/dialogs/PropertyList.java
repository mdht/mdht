/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.eclipse.mdht.uml.cda.ui.dialogs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.mdht.uml.cda.core.util.CDAModelUtil;
import org.eclipse.mdht.uml.common.util.NamedElementComparator;
import org.eclipse.mdht.uml.common.util.UMLUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

public class PropertyList {

	private Class clazz;

	private List<Property> attributes;

	private List<Property> associationEnds;

	private boolean isOmitAssociations = false;

	private boolean isAllSuperclasses = true;

	private boolean isSorted = true;

	public PropertyList(Class clazz) {
		this.clazz = clazz;
	}

	public List<Property> getAttributes() {
		if (attributes == null) {
			fillPropertyLists();
		}

		return attributes;
	}

	public List<Property> getAssociationEnds() {
		if (associationEnds == null) {
			fillPropertyLists();
		}

		return associationEnds;
	}

	public Property getForName(String name) {
		if (name != null) {
			for (Property property : getAttributes()) {
				if (name.equals(property.getName())) {
					return property;
				}
			}
			for (Property property : getAssociationEnds()) {
				if (name.equals(property.getName())) {
					return property;
				}
			}
		}

		return null;
	}

	private void fillPropertyLists() {
		attributes = new ArrayList<Property>();
		associationEnds = new ArrayList<Property>();

		addProperties(clazz);

		if (isSorted) {
			Collections.sort(attributes, new NamedElementComparator());
			Collections.sort(associationEnds, new NamedElementComparator());
		}
	}

	private void addProperties(Class aClass) {
		for (Property property : aClass.getOwnedAttributes()) {
			if (property.getAssociation() != null) {
				if (isOmitAssociations) {
					continue;
				}

				// omit association properties from base CDA model
				if (CDAModelUtil.CDA_PACKAGE_NAME.equals(UMLUtil.getTopPackage(aClass).getName())) {
					continue;
				}
			}

			// filter some CDA attributes
			if ("templateId".equals(property.getName())) {
				continue;
			}

			// skip implicit redefinitions
			if (getForName(property.getName()) == null) {
				if (property.getAssociation() == null) {
					attributes.add(property);
				} else {
					associationEnds.add(property);
				}
			}

			// TODO skip explicit redefinitions

		}

		if (isAllSuperclasses) {
			for (Classifier general : aClass.getGenerals()) {
				if (general instanceof Class) {
					addProperties((Class) general);
				}
			}
		}
	}

}
