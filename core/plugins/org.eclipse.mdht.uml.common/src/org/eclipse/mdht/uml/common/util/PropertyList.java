/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson.
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
import java.util.Collections;
import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

public class PropertyList {

	private Class clazz;

	private List<Property> attributes;

	private List<Property> associationEnds;

	private boolean isOmitAssociations = false;

	private boolean isAllSuperclasses = true;

	private boolean isSorted = false;

	public PropertyList(Class clazz) {
		this.clazz = clazz;
	}

	public PropertyList(Class clazz, boolean isAllSuperclasses) {
		this.clazz = clazz;
		this.isAllSuperclasses = isAllSuperclasses;
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

	private boolean hasBeenRedefined(Property property) {
		if (attributes != null) {
			for (Property attribute : attributes) {
				for (Property redefinedProperty : attribute.getRedefinedProperties()) {
					if (property.equals(redefinedProperty)) {
						return true;
					}
				}
			}

		}
		if (associationEnds != null) {
			for (Property attribute : associationEnds) {
				for (Property redefinedProperty : attribute.getRedefinedProperties()) {
					if (property.equals(redefinedProperty)) {
						return true;
					}
				}
			}

		}
		return false;
	}

	private void addProperties(Class aClass) {
		List<Property> ownedAttributes = new ArrayList<Property>(aClass.getOwnedAttributes());
		Collections.reverse(ownedAttributes);

		for (Property property : ownedAttributes) {
			if (property.getAssociation() != null) {
				if (isOmitAssociations) {
					continue;
				}
			}

			// skip explicit and implicit redefinitions
			if (!hasBeenRedefined(property) && getForName(property.getName()) == null) {
				if (property.getAssociation() == null) {
					attributes.add(0, property);
				} else {
					associationEnds.add(0, property);
				}
			}
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
