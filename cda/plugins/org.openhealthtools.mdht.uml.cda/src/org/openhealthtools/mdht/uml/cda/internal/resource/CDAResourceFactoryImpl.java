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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.openhealthtools.mdht.emf.runtime.resource.DOMElementHandler;
import org.openhealthtools.mdht.emf.runtime.resource.FleXMLResource;
import org.openhealthtools.mdht.emf.runtime.resource.XSITypeHandler;
import org.openhealthtools.mdht.emf.runtime.resource.XSITypeProvider;
import org.openhealthtools.mdht.emf.runtime.resource.impl.FleXMLResourceFactoryImpl;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.internal.resource.CDAResourceImpl
 * @generated not
 */
public class CDAResourceFactoryImpl extends FleXMLResourceFactoryImpl implements CDAResource.Factory {

	static {
		// configure the FleXMLResource registries
		DOMElementHandler.Registry.INSTANCE.registerHandler(
			CDAPackage.eINSTANCE, new PartElementHandler()).registerHandler(
				CDAPackage.eINSTANCE, new DataTypeElementHandler()).registerHandler(
					CDAPackage.eINSTANCE, new XSITypeHandler(CDAPackage.eINSTANCE));

		XSITypeProvider.Registry.INSTANCE.registerXSITypeProvider(CDAPackage.eINSTANCE, new CDAXSITypeProvider());
	}

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAResourceFactoryImpl() {
		super();
	}

	public static void init() {
		// pass
	}

	@Override
	protected FleXMLResource basicCreateResource(URI uri) {
		return new CDAResourceImpl(uri);
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public FleXMLResource createResource(URI uri) {
		FleXMLResource result = super.createResource(uri);

		// this complements the DataTypeElementHandler that converts datatype xsi:type information on load
		result.getDefaultSaveOptions().put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, new XMLSave.XMLTypeInfo() {
			public boolean shouldSaveType(EClass objectType, EClassifier featureType, EStructuralFeature feature) {
				return objectType != featureType &&
						objectType.getEPackage().getNsURI().equals(DatatypesPackage.eNS_URI);
			}

			public boolean shouldSaveType(EClass objectType, EClass featureType, EStructuralFeature feature) {
				return false;
			}
		});

		return result;
	}

} // CDAResourceFactoryImpl
