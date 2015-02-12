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
package org.openhealthtools.mdht.cts2.codesystem;

import org.openhealthtools.mdht.cts2.core.AbstractResourceDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.CodeSystemVersionReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Summary</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A synopsis of a CodeSystem along with information about how to access the complete resource.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getVersions <em>Versions</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCurrentVersion <em>Current Version</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCodeSystemName <em>Code System Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntrySummary()
 * @model extendedMetaData="name='CodeSystemCatalogEntrySummary' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemCatalogEntrySummary extends AbstractResourceDescriptionDirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Versions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a directory URI that resolves to an ordered list of code system versions associated with this code system. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">versions</i> may only be present if the service supports the <b
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">CodeSystemVersion
	 * Query</b> profile.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Versions</em>' attribute.
	 * @see #setVersions(String)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntrySummary_Versions()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemVersionCatalogEntryDirectoryURI"
	 *        extendedMetaData="kind='element' name='versions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersions();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getVersions <em>Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Versions</em>' attribute.
	 * @see #getVersions()
	 * @generated
	 */
	void setVersions(String value);

	/**
	 * Returns the value of the '<em><b>Current Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to the code system version marked as <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">CURRENT</i> in the service instance.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Current Version</em>' containment reference.
	 * @see #setCurrentVersion(CodeSystemVersionReference)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntrySummary_CurrentVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currentVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionReference getCurrentVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCurrentVersion
	 * <em>Current Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Current Version</em>' containment reference.
	 * @see #getCurrentVersion()
	 * @generated
	 */
	void setCurrentVersion(CodeSystemVersionReference value);

	/**
	 * Returns the value of the '<em><b>Code System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the local identifier that uniquely identifies the code system within the context of the implementing service. Note that the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystem">about</i> URI is the globally unique identifier.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Name</em>' attribute.
	 * @see #setCodeSystemName(String)
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntrySummary_CodeSystemName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemName" required="true"
	 *        extendedMetaData="kind='attribute' name='codeSystemName'"
	 * @generated
	 */
	String getCodeSystemName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntrySummary#getCodeSystemName
	 * <em>Code System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Name</em>' attribute.
	 * @see #getCodeSystemName()
	 * @generated
	 */
	void setCodeSystemName(String value);

} // CodeSystemCatalogEntrySummary
