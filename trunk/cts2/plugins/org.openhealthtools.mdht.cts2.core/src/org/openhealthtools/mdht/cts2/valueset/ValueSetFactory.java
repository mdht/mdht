/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage
 * @generated
 */
public interface ValueSetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ValueSetFactory eINSTANCE = org.openhealthtools.mdht.cts2.valueset.impl.ValueSetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Catalog Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry</em>'.
	 * @generated
	 */
	ValueSetCatalogEntry createValueSetCatalogEntry();

	/**
	 * Returns a new object of class '<em>Catalog Entry Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Directory</em>'.
	 * @generated
	 */
	ValueSetCatalogEntryDirectory createValueSetCatalogEntryDirectory();

	/**
	 * Returns a new object of class '<em>Catalog Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry List</em>'.
	 * @generated
	 */
	ValueSetCatalogEntryList createValueSetCatalogEntryList();

	/**
	 * Returns a new object of class '<em>Catalog Entry List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry List Entry</em>'.
	 * @generated
	 */
	ValueSetCatalogEntryListEntry createValueSetCatalogEntryListEntry();

	/**
	 * Returns a new object of class '<em>Catalog Entry Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Msg</em>'.
	 * @generated
	 */
	ValueSetCatalogEntryMsg createValueSetCatalogEntryMsg();

	/**
	 * Returns a new object of class '<em>Catalog Entry Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Summary</em>'.
	 * @generated
	 */
	ValueSetCatalogEntrySummary createValueSetCatalogEntrySummary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValueSetPackage getValueSetPackage();

} // ValueSetFactory
