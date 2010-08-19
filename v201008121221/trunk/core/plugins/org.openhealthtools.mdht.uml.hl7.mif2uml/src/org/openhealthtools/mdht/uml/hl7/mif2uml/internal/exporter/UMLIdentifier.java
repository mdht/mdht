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
package org.openhealthtools.mdht.uml.hl7.mif2uml.internal.exporter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;


/**
 *
 */
public class UMLIdentifier {

	private EClass metaclass;
	private String namespace;
	private String name;

	/**
	 * Create an identifier with the given name.
	 */
	public UMLIdentifier(NamedElement umlElement, String name) {
		this(umlElement);
		if (name != null) {
			this.name = name;
		}
	}

	/**
	 * Create an identifier with the given namespace and name.
	 */
	public UMLIdentifier(Model modelElement, String namespace, String name) {
		metaclass = modelElement.eClass();
		this.namespace = namespace;
		this.name = name;
	}
	
	/**
	 * Create an identifier with a name derived from the UML model element.
	 */
	public UMLIdentifier(NamedElement umlElement) {
		if (umlElement != null) {
			Package umlPackage = umlElement.getNearestPackage();
			String modelName = umlElement.getModel().getName();
			namespace = modelName;

			if (umlElement instanceof Model) {
				namespace = null;
				name = umlElement.getModel().getName();
				metaclass = umlElement.eClass();
			}
			else if (umlElement instanceof Package) {
				namespace = null;
				name = umlPackage.getName();
				metaclass = umlPackage.eClass();
			}
			else if (umlElement instanceof Classifier) {
				name = ((Classifier)umlElement).getName();
				metaclass = umlElement.eClass();
			}
			else if (umlElement instanceof Property) {
				name = ((Property)umlElement).getName();
				metaclass = umlElement.eClass();
			}
			else {
				metaclass = umlElement.eClass();
				name = Integer.toString(umlElement.hashCode());
			}
		}
	}

	public EClass getMetaclass() {
		return metaclass;
	}

	public String getName() {
		return name;
	}

	public String getNamespace() {
		return namespace;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || (obj.getClass() != this.getClass())) {
			return false;
		}

		UMLIdentifier test = (UMLIdentifier) obj;
		return metaclass == test.metaclass
			&& ( namespace == test.namespace || (namespace != null && namespace.equals(test.namespace)))
			&& ( name == test.name || (name != null && name.equals(test.name)));
	}

	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (null == metaclass ? 0 : metaclass.hashCode());
		hash = 31 * hash + (null == namespace ? 0 : namespace.hashCode());
		hash = 31 * hash + (null == name ? 0 : name.hashCode());
		
		return hash;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("[");
		buf.append(metaclass != null ? metaclass.getName() : "null");
		buf.append(", ");
		buf.append(namespace);
		buf.append(", ");
		buf.append(name);
		buf.append("]");
		return buf.toString();
	}
	
}
