/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset;

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
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntry <em>Value Set Catalog Entry</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryDirectory <em>Value Set Catalog Entry Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryList <em>Value Set Catalog Entry List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryMsg <em>Value Set Catalog Entry Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Value Set Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entry in a value set catalog that describes the purpose, use, etc. of a value set.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Value Set Catalog Entry</em>' containment reference.
	 * @see #setValueSetCatalogEntry(ValueSetCatalogEntry)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot_ValueSetCatalogEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetCatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetCatalogEntry getValueSetCatalogEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntry <em>Value Set Catalog Entry</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Catalog Entry</em>' containment reference.
	 * @see #getValueSetCatalogEntry()
	 * @generated
	 */
	void setValueSetCatalogEntry(ValueSetCatalogEntry value);

	/**
	 * Returns the value of the '<em><b>Value Set Catalog Entry Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Catalog Entry Directory</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Catalog Entry Directory</em>' containment reference.
	 * @see #setValueSetCatalogEntryDirectory(ValueSetCatalogEntryDirectory)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot_ValueSetCatalogEntryDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetCatalogEntryDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetCatalogEntryDirectory getValueSetCatalogEntryDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryDirectory
	 * <em>Value Set Catalog Entry Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Catalog Entry Directory</em>' containment reference.
	 * @see #getValueSetCatalogEntryDirectory()
	 * @generated
	 */
	void setValueSetCatalogEntryDirectory(ValueSetCatalogEntryDirectory value);

	/**
	 * Returns the value of the '<em><b>Value Set Catalog Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Catalog Entry List</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Catalog Entry List</em>' containment reference.
	 * @see #setValueSetCatalogEntryList(ValueSetCatalogEntryList)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot_ValueSetCatalogEntryList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetCatalogEntryList' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetCatalogEntryList getValueSetCatalogEntryList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryList
	 * <em>Value Set Catalog Entry List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Catalog Entry List</em>' containment reference.
	 * @see #getValueSetCatalogEntryList()
	 * @generated
	 */
	void setValueSetCatalogEntryList(ValueSetCatalogEntryList value);

	/**
	 * Returns the value of the '<em><b>Value Set Catalog Entry Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set Catalog Entry Msg</em>' containment reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Set Catalog Entry Msg</em>' containment reference.
	 * @see #setValueSetCatalogEntryMsg(ValueSetCatalogEntryMsg)
	 * @see org.openhealthtools.mdht.cts2.valueset.ValueSetPackage#getDocumentRoot_ValueSetCatalogEntryMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSetCatalogEntryMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetCatalogEntryMsg getValueSetCatalogEntryMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.valueset.DocumentRoot#getValueSetCatalogEntryMsg
	 * <em>Value Set Catalog Entry Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Set Catalog Entry Msg</em>' containment reference.
	 * @see #getValueSetCatalogEntryMsg()
	 * @generated
	 */
	void setValueSetCatalogEntryMsg(ValueSetCatalogEntryMsg value);

} // DocumentRoot
