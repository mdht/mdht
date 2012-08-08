/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - refactored CDAResource, CDAUtil, CDARegistry on the new flexible XML resource (artf3367)
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.openhealthtools.mdht.emf.runtime.resource.impl.FleXMLResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.internal.resource.CDAResourceFactoryImpl
 * @generated not
 */
public class CDAResourceImpl extends FleXMLResourceImpl implements CDAResource {

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public CDAResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLSaveImpl createXMLSave() {
		return new CDASaveImpl(createXMLHelper());
	}
} // CDAResourceImpl
