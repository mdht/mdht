/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntry <em>Code System Catalog Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryDirectory <em>Code System Catalog Entry Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryList <em>Code System Catalog Entry List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryMsg <em>Code System Catalog Entry Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Code System Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadata and access information about a code system.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Catalog Entry</em>' containment reference.
	 * @see #setCodeSystemCatalogEntry(CodeSystemCatalogEntry)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot_CodeSystemCatalogEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemCatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemCatalogEntry getCodeSystemCatalogEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntry
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

	/**
	 * Returns the value of the '<em><b>Code System Catalog Entry Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Catalog Entry Directory</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Catalog Entry Directory</em>' containment reference.
	 * @see #setCodeSystemCatalogEntryDirectory(CodeSystemCatalogEntryDirectory)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot_CodeSystemCatalogEntryDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemCatalogEntryDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemCatalogEntryDirectory getCodeSystemCatalogEntryDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryDirectory
	 * <em>Code System Catalog Entry Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Catalog Entry Directory</em>' containment reference.
	 * @see #getCodeSystemCatalogEntryDirectory()
	 * @generated
	 */
	void setCodeSystemCatalogEntryDirectory(CodeSystemCatalogEntryDirectory value);

	/**
	 * Returns the value of the '<em><b>Code System Catalog Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Catalog Entry List</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Catalog Entry List</em>' containment reference.
	 * @see #setCodeSystemCatalogEntryList(CodeSystemCatalogEntryList)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot_CodeSystemCatalogEntryList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemCatalogEntryList' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemCatalogEntryList getCodeSystemCatalogEntryList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryList
	 * <em>Code System Catalog Entry List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Catalog Entry List</em>' containment reference.
	 * @see #getCodeSystemCatalogEntryList()
	 * @generated
	 */
	void setCodeSystemCatalogEntryList(CodeSystemCatalogEntryList value);

	/**
	 * Returns the value of the '<em><b>Code System Catalog Entry Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Catalog Entry Msg</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Catalog Entry Msg</em>' containment reference.
	 * @see #setCodeSystemCatalogEntryMsg(CodeSystemCatalogEntryMsg)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getDocumentRoot_CodeSystemCatalogEntryMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemCatalogEntryMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemCatalogEntryMsg getCodeSystemCatalogEntryMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.DocumentRoot#getCodeSystemCatalogEntryMsg
	 * <em>Code System Catalog Entry Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Catalog Entry Msg</em>' containment reference.
	 * @see #getCodeSystemCatalogEntryMsg()
	 * @generated
	 */
	void setCodeSystemCatalogEntryMsg(CodeSystemCatalogEntryMsg value);

} // DocumentRoot
