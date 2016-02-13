/*******************************************************************************
 * Copyright (c) 2014 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.common.notation;

import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;

public interface IExtendedNotationProvider extends INotationProvider {

	/**
	 * Return languages used by designations for the model element, may be empty list.
	 */
	// public List<String> getDesignationLanguages(Element element);

	/**
	 * Return namespaces used by designations for the model element, may be empty list.
	 */
	// public List<Object> getDesignationNamespaces(Element element);

	/**
	 * Return designations for the model element, may be empty list.
	 */
	// public List<String> getDesignations(Element element);

	/**
	 * Return language-specific designations for the model element, may be empty list.
	 */
	// public List<String> getDesignations(Element element, String language);

	/**
	 * Return namespace-specific designations for the model element, may be empty list.
	 */
	// public List<String> getDesignations(Element element, Object namespace);

	/**
	 * Return namespace and language-specific designations for the model element, may be empty list.
	 */
	// public List<String> getDesignations(Element element, Object namespace, String language);

	/**
	 * Returns an adapter factory for displaying annotations, or null.
	 */
	// public AdapterFactory getAdapterFactory(Element element);

	/**
	 * Returns a short version of annotations for a model element.
	 */
	public String getShortAnnotation(Element element);

	/**
	 * Returns a list of types allowed for the given property.
	 */
	public List<Classifier> getTypeChoice(Property property);

}
