/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - flexible XML resource implementation (artf3367)
 *
 *******************************************************************************/
package org.eclipse.mdht.emf.runtime.resource.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResource;

/**
 * Default implementation of the {@link FleXMLResource} API.
 */
public class FleXMLResourceImpl extends XMLResourceImpl implements FleXMLResource {
	public FleXMLResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new FleXMLLoadImpl(createXMLHelper());
	}

	@Override
	protected XMLSave createXMLSave() {
		return new FleXMLSaveImpl(createXMLHelper());
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new FleXMLHelperImpl(this);
	}
}
