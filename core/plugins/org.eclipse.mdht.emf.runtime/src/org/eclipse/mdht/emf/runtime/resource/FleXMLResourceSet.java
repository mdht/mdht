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

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.mdht.emf.runtime.resource.impl.FleXMLResourceSetFactoryImpl;

/**
 * An extension of the EMF {@link ResourceSet} API that provides flexible XML resource loading, with on-the-fly DOM transformations and possibly other
 * goodness.
 */
public interface FleXMLResourceSet extends ResourceSet {
	DOMElementHandler.Registry getDOMElementHandlerRegistry();

	FleXMLResourceSet setDOMElementHandlerRegistry(DOMElementHandler.Registry registry);

	XSITypeProvider.Registry getXSITypeProviderRegistry();

	FleXMLResourceSet setXSITypeProviderRegistry(XSITypeProvider.Registry registry);

	FleXMLResourceSet setDefaultResourceFactory(FleXMLResource.Factory factory);

	//
	// Nested types
	//

	/**
	 * A factory for creation of new {@link FleXMLResourceSet}s.
	 */
	interface Factory {
		Factory INSTANCE = new FleXMLResourceSetFactoryImpl();

		FleXMLResourceSet createResourceSet();
	}
}
