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
package org.openhealthtools.mdht.uml.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Property;

public class AttributeList {

	private Class clazz;
	private List<Property> attributes;
	
	private boolean isOmitAssociations = true;
	private boolean isAllSuperclasses = true;
	private boolean isSorted = true;
	
	public AttributeList(Class clazz) {
		this.clazz = clazz;
	}
	
	public List<Property> getAttributes() {
		if (attributes == null) {
			fillAttributeList();
		}

		if (isSorted) {
			Collections.sort(attributes, new NamedElementComparator());
		}
		
		return attributes;
	}

	public Property getForName(String name) {
		if (name != null) {
			for (Property property : getAttributes()) {
				if (name.equals(property.getName())) {
					return property;
				}
			}
		}
		
		return null;
	}
	
	private void fillAttributeList() {
		attributes = new ArrayList<Property>();
		addAttributes(clazz);
	}
	
	private void addAttributes(Class aClass) {
		for (Property property : aClass.getOwnedAttributes()) {
			if (isOmitAssociations && property.getAssociation() != null) {
				continue;
			}
			// skip implicit redefinitions
			if (getForName(property.getName()) == null) {
				attributes.add(property);
			}
			
			//TODO skip explicit redefinitions
			
		}

		if (isAllSuperclasses) {
			for (Classifier general : aClass.getGenerals()) {
				if (general instanceof Class)
					addAttributes((Class)general);
			}
		}
	}
	
}
