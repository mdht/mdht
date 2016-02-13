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
package org.eclipse.mdht.emf.runtime.resource.impl;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.mdht.emf.runtime.resource.DOMElementHandler;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResource;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResourceSet;
import org.eclipse.mdht.emf.runtime.resource.XSITypeProvider;

/**
 * Default implementation of the flexible XML resource set API.
 */
public class FleXMLResourceSetImpl extends ResourceSetImpl implements FleXMLResourceSet {
	private DOMElementHandler.Registry elementHandlerRegistry = new DOMElementHandlerRegistryImpl();

	private XSITypeProvider.Registry xsiTypeProviderRegistry = new XSITypeProviderRegistryImpl();

	public FleXMLResourceSetImpl() {
		super();

		doSetDefaultResourceFactory(FleXMLResource.Factory.INSTANCE);
	}

	public DOMElementHandler.Registry getDOMElementHandlerRegistry() {
		return elementHandlerRegistry;
	}

	public FleXMLResourceSet setDOMElementHandlerRegistry(DOMElementHandler.Registry registry) {
		this.elementHandlerRegistry = registry;

		return this;
	}

	public XSITypeProvider.Registry getXSITypeProviderRegistry() {
		return xsiTypeProviderRegistry;
	}

	public FleXMLResourceSet setXSITypeProviderRegistry(XSITypeProvider.Registry registry) {
		this.xsiTypeProviderRegistry = registry;

		return this;
	}

	private void doSetDefaultResourceFactory(FleXMLResource.Factory factory) {
		Map<String, Object> factories = getResourceFactoryRegistry().getExtensionToFactoryMap();
		factories.put("xml", factory);
		factories.put(Resource.Factory.Registry.DEFAULT_EXTENSION, factory);

		getResourceFactoryRegistry().getContentTypeToFactoryMap().put(
			Resource.Factory.Registry.DEFAULT_CONTENT_TYPE_IDENTIFIER, factory);
	}

	public FleXMLResourceSet setDefaultResourceFactory(FleXMLResource.Factory factory) {
		doSetDefaultResourceFactory(factory);

		return this;
	}
}
