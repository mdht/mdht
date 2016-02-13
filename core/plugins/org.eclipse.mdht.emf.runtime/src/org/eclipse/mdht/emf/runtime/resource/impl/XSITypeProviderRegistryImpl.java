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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.mdht.emf.runtime.resource.XSITypeProvider;
import org.w3c.dom.Element;

/**
 * The default implementation of the <tt>xsi:type</tt> provider registry API.
 */
public class XSITypeProviderRegistryImpl implements XSITypeProvider.Registry {
	private Map<String, XSITypeProvider> providers = new java.util.HashMap<String, XSITypeProvider>();

	private XSITypeProvider.Registry delegate;

	public XSITypeProviderRegistryImpl() {
		this(XSITypeProvider.Registry.INSTANCE);
	}

	public XSITypeProviderRegistryImpl(XSITypeProvider.Registry delegate) {
		this.delegate = delegate;
	}

	public XSITypeProvider getXSITypeProvider(EPackage epackage) {
		XSITypeProvider result = providers.get(epackage.getNsURI());

		if ((result == null) && (delegate != null)) {
			// seed from the delegate
			result = delegate.getXSITypeProvider(epackage);
			if (result == null) {
				result = NullProvider.INSTANCE;
			}

			providers.put(epackage.getNsURI(), result);
		}

		return result;
	}

	public XSITypeProvider.Registry registerXSITypeProvider(EPackage epackage, XSITypeProvider provider) {
		providers.put(epackage.getNsURI(), provider);

		return this;
	}

	//
	// Nested types
	//

	private static final class NullProvider implements XSITypeProvider {
		static final XSITypeProvider INSTANCE = new NullProvider();

		public EClass getXSIType(Element element) {
			return null;
		}
	}
}
