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
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.mdht.emf.runtime.resource.FleXMLResource;

/**
 * Default implementation of the {@link FleXMLResource} factory API.
 */
public class FleXMLResourceFactoryImpl extends ResourceFactoryImpl implements FleXMLResource.Factory {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public FleXMLResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public FleXMLResource createResource(URI uri) {
		FleXMLResource result = basicCreateResource(uri);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		result.setEncoding(FleXMLResource.DEFAULT_ENCODING);

		// result.getDefaultSaveOptions().put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);

		// result.getDefaultLoadOptions().put(XMLResource.OPTION_LAX_FEATURE_PROCESSING, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		// result.getDefaultLoadOptions().put(XMLResource.OPTION_RESOURCE_HANDLER, new CDAResourceHandler());

		return result;
	}

	protected FleXMLResource basicCreateResource(URI uri) {
		return new FleXMLResourceImpl(uri);
	}
}
