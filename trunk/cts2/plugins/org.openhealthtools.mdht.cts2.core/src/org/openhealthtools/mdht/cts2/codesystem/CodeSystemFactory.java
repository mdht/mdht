/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage
 * @generated
 */
public interface CodeSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CodeSystemFactory eINSTANCE = org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalog Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry</em>'.
	 * @generated
	 */
	CodeSystemCatalogEntry createCodeSystemCatalogEntry();

	/**
	 * Returns a new object of class '<em>Catalog Entry Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Directory</em>'.
	 * @generated
	 */
	CodeSystemCatalogEntryDirectory createCodeSystemCatalogEntryDirectory();

	/**
	 * Returns a new object of class '<em>Catalog Entry List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry List</em>'.
	 * @generated
	 */
	CodeSystemCatalogEntryList createCodeSystemCatalogEntryList();

	/**
	 * Returns a new object of class '<em>Catalog Entry List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry List Entry</em>'.
	 * @generated
	 */
	CodeSystemCatalogEntryListEntry createCodeSystemCatalogEntryListEntry();

	/**
	 * Returns a new object of class '<em>Catalog Entry Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Msg</em>'.
	 * @generated
	 */
	CodeSystemCatalogEntryMsg createCodeSystemCatalogEntryMsg();

	/**
	 * Returns a new object of class '<em>Catalog Entry Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Catalog Entry Summary</em>'.
	 * @generated
	 */
	CodeSystemCatalogEntrySummary createCodeSystemCatalogEntrySummary();

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
	CodeSystemPackage getCodeSystemPackage();

} // CodeSystemFactory
