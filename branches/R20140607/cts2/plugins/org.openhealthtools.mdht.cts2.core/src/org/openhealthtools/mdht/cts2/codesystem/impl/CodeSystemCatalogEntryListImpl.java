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
package org.openhealthtools.mdht.cts2.codesystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryList;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.core.impl.DirectoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryListImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemCatalogEntryListImpl extends DirectoryImpl implements CodeSystemCatalogEntryList {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeSystemCatalogEntryListEntry> entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntryListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<CodeSystemCatalogEntryListEntry> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<CodeSystemCatalogEntryListEntry>(
				CodeSystemCatalogEntryListEntry.class, this, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY:
				return ((InternalEList<?>) getEntry()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY:
				return getEntry();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends CodeSystemCatalogEntryListEntry>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY:
				getEntry().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_LIST__ENTRY:
				return entry != null && !entry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // CodeSystemCatalogEntryListImpl
