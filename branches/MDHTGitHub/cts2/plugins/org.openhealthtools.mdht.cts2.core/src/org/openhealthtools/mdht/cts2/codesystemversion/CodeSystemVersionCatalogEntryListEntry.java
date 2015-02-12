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

import org.openhealthtools.mdht.cts2.core.DirectoryEntry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry List Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An instance of <i xmlns="http://schema.omg.org/spec/CTS2/1.0/CodeSystemVersion">CodeSystemVersion</i> that meets a specified filter criteria.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntryListEntry()
 * @model extendedMetaData="name='CodeSystemVersionCatalogEntryListEntry' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemVersionCatalogEntryListEntry extends DirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' containment reference.
	 * @see #setEntry(CodeSystemVersionCatalogEntry)
	 * @see org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage#getCodeSystemVersionCatalogEntryListEntry_Entry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeSystemVersionCatalogEntry getEntry();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry#getEntry <em>Entry</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entry</em>' containment reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(CodeSystemVersionCatalogEntry value);

} // CodeSystemVersionCatalogEntryListEntry
