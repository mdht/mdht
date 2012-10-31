/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystemversion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage
 * @generated
 */
public interface CodeSystemVersionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CodeSystemVersionFactory eINSTANCE = org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalog Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry</em>'.
	 * @generated
	 */
	CodeSystemVersionCatalogEntry createCodeSystemVersionCatalogEntry();

	/**
	 * Returns a new object of class '<em>Catalog Entry Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Directory</em>'.
	 * @generated
	 */
	CodeSystemVersionCatalogEntryDirectory createCodeSystemVersionCatalogEntryDirectory();

	/**
	 * Returns a new object of class '<em>Catalog Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry List</em>'.
	 * @generated
	 */
	CodeSystemVersionCatalogEntryList createCodeSystemVersionCatalogEntryList();

	/**
	 * Returns a new object of class '<em>Catalog Entry List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry List Entry</em>'.
	 * @generated
	 */
	CodeSystemVersionCatalogEntryListEntry createCodeSystemVersionCatalogEntryListEntry();

	/**
	 * Returns a new object of class '<em>Catalog Entry Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Msg</em>'.
	 * @generated
	 */
	CodeSystemVersionCatalogEntryMsg createCodeSystemVersionCatalogEntryMsg();

	/**
	 * Returns a new object of class '<em>Catalog Entry Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Summary</em>'.
	 * @generated
	 */
	CodeSystemVersionCatalogEntrySummary createCodeSystemVersionCatalogEntrySummary();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodeSystemVersionPackage getCodeSystemVersionPackage();

} // CodeSystemVersionFactory
