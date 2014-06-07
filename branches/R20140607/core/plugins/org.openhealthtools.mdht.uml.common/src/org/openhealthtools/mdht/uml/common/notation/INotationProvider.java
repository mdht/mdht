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
package org.openhealthtools.mdht.uml.common.notation;

import org.eclipse.uml2.uml.Element;

public interface INotationProvider {

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
	 * Returns the complete print string for displaying a model element.
	 */
	public String getPrintString(Element element);

	/**
	 * Returns only the annotations for a model element.
	 */
	public String getAnnotation(Element element);

	/**
	 * Returns an image for the model element, or null.
	 */
	public Object getElementImage(Element element);

	/**
	 * Returns an image for the annotations, or null.
	 */
	public Object getAnnotationImage(Element element);

	/**
	 * Returns an adapter factory for displaying annotations, or null.
	 */
	// public AdapterFactory getAdapterFactory(Element element);
}
