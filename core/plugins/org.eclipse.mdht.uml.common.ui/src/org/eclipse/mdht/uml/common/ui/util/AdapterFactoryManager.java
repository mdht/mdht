/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
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
package org.eclipse.mdht.uml.common.ui.util;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

/**
 * This class provides access to EMF adapter factories registered
 * via extension point. Explicitly registered adapter factories
 * are returned before searching extension-point factories.
 */

public class AdapterFactoryManager {

	public static ComposedAdapterFactory.Descriptor.Registry adapterRegistry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;

	private static ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(adapterRegistry);

	/**
	 * Get the composed factory.
	 */
	public static ComposedAdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * Register an adapter factory.
	 */
	public static void register(AdapterFactory factory) {

		adapterFactory.removeAdapterFactory(factory);
		adapterFactory.addAdapterFactory(factory);

	}
}
