/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ValueSetXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ValueSetPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the ValueSetResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ValueSetResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ValueSetResourceFactoryImpl());
		}
		return registrations;
	}

} // ValueSetXMLProcessor
