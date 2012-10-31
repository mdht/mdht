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

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.CodeSystemReference;
import org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry;
import org.openhealthtools.mdht.cts2.core.VersionTagReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Summary</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A synopsis of a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CodeSystemVersion</i> along with information about how to access
 * the complete resource.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getVersionOf <em>Version Of</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getCodeSystemVersionTag <em>Code System Version Tag
 * </em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getCodeSystemVersionName <em>Code System Version
 * Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntrySummary()
 * @model extendedMetaData="name='CodeSystemVersionCatalogEntrySummary' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersionCatalogEntrySummary extends ResourceVersionDescriptionDirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Version Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the name, URI and, if supported by the service, link to the code system that this version represents.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Version Of</em>' containment reference.
	 * @see #setVersionOf(CodeSystemReference)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntrySummary_VersionOf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='versionOf' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemReference getVersionOf();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getVersionOf
	 * <em>Version Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Version Of</em>' containment reference.
	 * @see #getVersionOf()
	 * @generated
	 */
	void setVersionOf(CodeSystemReference value);

	/**
	 * Returns the value of the '<em><b>Code System Version Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.VersionTagReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the tag(s) assigned to this version by the service provider. <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">codeSystemVersionTag</i> identifies any roles that this version plays within the
	 * workflow of the current provider. As an example,
	 * a provider might assign the tags of "production" and "current" to a given code system version. With the exception of <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CURRENT</i> the semantics of VersionTag are determined by the service
	 * provider.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Tag</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionTag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeSystemVersionTag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VersionTagReference> getCodeSystemVersionTag();

	/**
	 * Returns the value of the '<em><b>Code System Version Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an identifier that uniquely names this particular code system version within the context of the CTS<sub
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">2</sub> service instance.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Name</em>' attribute.
	 * @see #setCodeSystemVersionName(String)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntrySummary_CodeSystemVersionName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.CodeSystemVersionName" required="true"
	 *        extendedMetaData="kind='attribute' name='codeSystemVersionName'"
	 * @generated
	 */
	String getCodeSystemVersionName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntrySummary#getCodeSystemVersionName
	 * <em>Code System Version Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Code System Version Name</em>' attribute.
	 * @see #getCodeSystemVersionName()
	 * @generated
	 */
	void setCodeSystemVersionName(String value);

} // CodeSystemVersionCatalogEntrySummary
