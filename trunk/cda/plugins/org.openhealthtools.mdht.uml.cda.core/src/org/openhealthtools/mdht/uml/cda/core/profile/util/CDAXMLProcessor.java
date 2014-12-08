/**
 */
package org.openhealthtools.mdht.uml.cda.core.profile.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CDAXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CDAXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CDAPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the CDAResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CDAResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CDAResourceFactoryImpl());
		}
		return registrations;
	}

} // CDAXMLProcessor
