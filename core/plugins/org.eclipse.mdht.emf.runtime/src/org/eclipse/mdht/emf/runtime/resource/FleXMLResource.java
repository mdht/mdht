/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - flexible XML resource implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.mdht.emf.runtime.resource.impl.FleXMLResourceFactoryImpl;

/**
 * An XML resource that loads documents from DOM instances with flexible (pluggable) mapping of XML elements to Ecore.
 *
 * @see DOMElementHandler
 * @see DOMElementHandler.Registry
 * @see XSITypeHandler
 * @see DOMDocumentHandler
 */
public interface FleXMLResource extends XMLResource {
	/**
	 * Option to hook pre- and post-load event handler for the loading of the DOM from whatever storage.
	 */
	Object OPTION_DOM_DOCUMENT_HANDLER = DOMDocumentHandler.class;

	String DEFAULT_ENCODING = "UTF-8";

	interface Factory extends Resource.Factory {

		Factory INSTANCE = new FleXMLResourceFactoryImpl();

	}

}
