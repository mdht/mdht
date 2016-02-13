/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.resource;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.mdht.emf.runtime.resource.impl.DOMElementHandlerRegistryImpl;
import org.w3c.dom.Element;

/**
 * A pluggable strategy for handling/transforming an {@code element} in the DOM.
 */
public interface DOMElementHandler {
	/**
	 * Transforms/updates an {@code element}.
	 *
	 * @param element
	 *            an element in the DOM
	 * @param root
	 *            the root (document) element of the DOM, useful in case of the need to add namespace declarations to it, for example
	 *
	 * @return {@code true} if no further handlers should be invoked on the {@code element} (I must have the final word); {@code false}, otherwise
	 */
	boolean handleElement(Element element, Element root, XMLHelper helper);

	//
	// Nested types
	//

	interface Registry {
		Registry INSTANCE = new DOMElementHandlerRegistryImpl(null); // this one doesn't have a delegate; it's the delegation root

		/**
		 * Gets the DOM element handlers registered for the specified {@code epackage}.
		 *
		 * @param epackage
		 *            an Ecore package
		 *
		 * @return the handlers, in the order in which they should be applied to DOM elements
		 */
		Iterable<DOMElementHandler> getHandlers(EPackage epackage);

		/**
		 * Registers a new element-handler for a package. Has no effect if the handler is already registered for this package.
		 *
		 * @param epackage
		 *            an Ecore package
		 * @param handler
		 *            a new handler to register
		 *
		 * @return myself, for convenience of call chaining
		 */
		Registry registerHandler(EPackage epackage, DOMElementHandler handler);
	}
}
