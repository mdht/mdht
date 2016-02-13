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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.mdht.emf.runtime.resource.impl.XSITypeProviderRegistryImpl;
import org.w3c.dom.Element;

/**
 * A protocol for pluggable providers of definitive or alternative <tt>xsi:type</tt> information for DOM elements, useful for directing the EMF
 * resource deserialization to create the appropriate instances.
 */
public interface XSITypeProvider {
	EClass getXSIType(Element element);

	interface Registry {
		Registry INSTANCE = new XSITypeProviderRegistryImpl(null); // this one doesn't have a delegate; it's the delegation root

		XSITypeProvider getXSITypeProvider(EPackage epackage);

		Registry registerXSITypeProvider(EPackage epackage, XSITypeProvider provider);
	}
}
