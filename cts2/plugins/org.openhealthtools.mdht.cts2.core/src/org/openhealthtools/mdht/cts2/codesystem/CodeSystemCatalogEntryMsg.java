/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem;

import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">CodeSystemCatalogEntry</i> read from a service instance.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg#getCodeSystemCatalogEntry <em>Code System Catalog Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntryMsg()
 * @model extendedMetaData="name='CodeSystemCatalogEntryMsg' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemCatalogEntryMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Code System Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Catalog Entry</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Catalog Entry</em>' containment reference.
	 * @see #setCodeSystemCatalogEntry(CodeSystemCatalogEntry)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntryMsg_CodeSystemCatalogEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystemCatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemCatalogEntry getCodeSystemCatalogEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg#getCodeSystemCatalogEntry
	 * <em>Code System Catalog Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Catalog Entry</em>' containment reference.
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 */
	void setCodeSystemCatalogEntry(CodeSystemCatalogEntry value);

} // CodeSystemCatalogEntryMsg
