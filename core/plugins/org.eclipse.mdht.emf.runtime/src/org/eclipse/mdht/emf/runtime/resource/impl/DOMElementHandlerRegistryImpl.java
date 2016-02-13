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

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.mdht.emf.runtime.resource.DOMElementHandler;

/**
 * The default implementation of the element-handler registry API.
 */
public class DOMElementHandlerRegistryImpl implements DOMElementHandler.Registry {
	private Map<String, List<DOMElementHandler>> handlers = new java.util.HashMap<String, List<DOMElementHandler>>();

	private DOMElementHandler.Registry delegate;

	public DOMElementHandlerRegistryImpl() {
		this(DOMElementHandler.Registry.INSTANCE);
	}

	public DOMElementHandlerRegistryImpl(DOMElementHandler.Registry delegate) {
		this.delegate = delegate;
	}

	protected List<DOMElementHandler> basicGetHandlers(EPackage epackage) {
		List<DOMElementHandler> result = handlers.get(epackage.getNsURI());

		if (result == null) {
			result = new java.util.ArrayList<DOMElementHandler>();

			if (delegate != null) {
				// seed from the delegate
				for (DOMElementHandler next : delegate.getHandlers(epackage)) {
					result.add(next);
				}
			}

			handlers.put(epackage.getNsURI(), result);
		}

		return result;
	}

	public Iterable<DOMElementHandler> getHandlers(EPackage epackage) {
		return Collections.unmodifiableCollection(basicGetHandlers(epackage));
	}

	public DOMElementHandler.Registry registerHandler(EPackage epackage, DOMElementHandler handler) {
		List<DOMElementHandler> handlers = basicGetHandlers(epackage);

		if (!handlers.contains(handler)) {
			handlers.add(handler);
		}

		return this;
	}
}
