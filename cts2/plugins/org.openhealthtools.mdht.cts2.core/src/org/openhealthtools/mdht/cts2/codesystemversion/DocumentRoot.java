/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.codesystemversion;

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
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntry <em>Code System Version Catalog Entry
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryDirectory <em>Code System Version Catalog
 * Entry Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryList <em>Code System Version Catalog Entry
 * List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryMsg <em>Code System Version Catalog Entry
 * Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Code System Version Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CodeSystemVersion</i> is a collection of assertions about one or more
	 * entities. If the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">state</i> of a <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CodeSystemVersion</i> is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">Final </i>the set of assertions made the resource is fixed, meaning
	 * that if one knows the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">documentURI</i> assigned to the version and the specific
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">sourceAndNotation</i> from which the version instance was derived, the set of
	 * assertions is known as well.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Catalog Entry</em>' containment reference.
	 * @see #setCodeSystemVersionCatalogEntry(CodeSystemVersionCatalogEntry)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot_CodeSystemVersionCatalogEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemVersionCatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionCatalogEntry getCodeSystemVersionCatalogEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntry
	 * <em>Code System Version Catalog Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version Catalog Entry</em>' containment reference.
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 */
	void setCodeSystemVersionCatalogEntry(CodeSystemVersionCatalogEntry value);

	/**
	 * Returns the value of the '<em><b>Code System Version Catalog Entry Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Version Catalog Entry Directory</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Catalog Entry Directory</em>' containment reference.
	 * @see #setCodeSystemVersionCatalogEntryDirectory(CodeSystemVersionCatalogEntryDirectory)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot_CodeSystemVersionCatalogEntryDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemVersionCatalogEntryDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionCatalogEntryDirectory getCodeSystemVersionCatalogEntryDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryDirectory
	 * <em>Code System Version Catalog Entry Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version Catalog Entry Directory</em>' containment reference.
	 * @see #getCodeSystemVersionCatalogEntryDirectory()
	 * @generated
	 */
	void setCodeSystemVersionCatalogEntryDirectory(CodeSystemVersionCatalogEntryDirectory value);

	/**
	 * Returns the value of the '<em><b>Code System Version Catalog Entry List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Version Catalog Entry List</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Catalog Entry List</em>' containment reference.
	 * @see #setCodeSystemVersionCatalogEntryList(CodeSystemVersionCatalogEntryList)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot_CodeSystemVersionCatalogEntryList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemVersionCatalogEntryList' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionCatalogEntryList getCodeSystemVersionCatalogEntryList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryList
	 * <em>Code System Version Catalog Entry List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version Catalog Entry List</em>' containment reference.
	 * @see #getCodeSystemVersionCatalogEntryList()
	 * @generated
	 */
	void setCodeSystemVersionCatalogEntryList(CodeSystemVersionCatalogEntryList value);

	/**
	 * Returns the value of the '<em><b>Code System Version Catalog Entry Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Version Catalog Entry Msg</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Catalog Entry Msg</em>' containment reference.
	 * @see #setCodeSystemVersionCatalogEntryMsg(CodeSystemVersionCatalogEntryMsg)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getDocumentRoot_CodeSystemVersionCatalogEntryMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSystemVersionCatalogEntryMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionCatalogEntryMsg getCodeSystemVersionCatalogEntryMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.DocumentRoot#getCodeSystemVersionCatalogEntryMsg
	 * <em>Code System Version Catalog Entry Msg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version Catalog Entry Msg</em>' containment reference.
	 * @see #getCodeSystemVersionCatalogEntryMsg()
	 * @generated
	 */
	void setCodeSystemVersionCatalogEntryMsg(CodeSystemVersionCatalogEntryMsg value);

} // DocumentRoot
