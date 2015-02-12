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

import org.eclipse.emf.common.util.EList;
import org.openhealthtools.mdht.cts2.core.Directory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Entry List</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A set of code system catalog entries.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntryList()
 * @model extendedMetaData="name='CodeSystemCatalogEntryList' kind='elementOnly'"
 * @generated
 */
public interface CodeSystemCatalogEntryList extends Directory {
	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry</em>' containment reference list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage#getCodeSystemCatalogEntryList_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeSystemCatalogEntryListEntry> getEntry();

} // CodeSystemCatalogEntryList
