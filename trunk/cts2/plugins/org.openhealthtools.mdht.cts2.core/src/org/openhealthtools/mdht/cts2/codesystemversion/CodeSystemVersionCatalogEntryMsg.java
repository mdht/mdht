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

import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CodeSystemVersionCatalogEntry</i> read from a service instance.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg#getCodeSystemVersionCatalogEntry <em>Code System
 * Version Catalog Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntryMsg()
 * @model extendedMetaData="name='CodeSystemVersionCatalogEntryMsg' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersionCatalogEntryMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Code System Version Catalog Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System Version Catalog Entry</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Code System Version Catalog Entry</em>' containment reference.
	 * @see #setCodeSystemVersionCatalogEntry(CodeSystemVersionCatalogEntry)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntryMsg_CodeSystemVersionCatalogEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='codeSystemVersionCatalogEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionCatalogEntry getCodeSystemVersionCatalogEntry();

	/**
	 * Sets the value of the '
	 * {@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg#getCodeSystemVersionCatalogEntry
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

} // CodeSystemVersionCatalogEntryMsg
