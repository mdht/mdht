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

import org.eclipse.mdht.emf.runtime.resource.FleXMLResourceSet;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResourceSet.Factory;

/**
 * Default implementation of the resource-set factory API.
 */
public class FleXMLResourceSetFactoryImpl implements Factory {

	public FleXMLResourceSetFactoryImpl() {
		super();
	}

	public FleXMLResourceSet createResourceSet() {
		return new FleXMLResourceSetImpl();
	}

}
