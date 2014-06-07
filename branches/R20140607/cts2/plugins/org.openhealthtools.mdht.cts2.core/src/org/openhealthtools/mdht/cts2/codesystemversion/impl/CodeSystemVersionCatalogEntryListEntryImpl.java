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
package org.openhealthtools.mdht.cts2.codesystemversion.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryListEntry;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.core.impl.DirectoryEntryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry List Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryListEntryImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemVersionCatalogEntryListEntryImpl extends DirectoryEntryImpl implements
		CodeSystemVersionCatalogEntryListEntry {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionCatalogEntry entry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemVersionCatalogEntryListEntryImpl() {
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
		return CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntry getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEntry(CodeSystemVersionCatalogEntry newEntry, NotificationChain msgs) {
		CodeSystemVersionCatalogEntry oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY,
				oldEntry, newEntry);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntry(CodeSystemVersionCatalogEntry newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null) {
				msgs = ((InternalEObject) entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY, null, msgs);
			}
			if (newEntry != null) {
				msgs = ((InternalEObject) newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY, null, msgs);
			}
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY,
				newEntry, newEntry));
		}
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY:
				return basicSetEntry(null, msgs);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY:
				setEntry((CodeSystemVersionCatalogEntry) newValue);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY:
				setEntry((CodeSystemVersionCatalogEntry) null);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_LIST_ENTRY__ENTRY:
				return entry != null;
		}
		return super.eIsSet(featureID);
	}

} // CodeSystemVersionCatalogEntryListEntryImpl
