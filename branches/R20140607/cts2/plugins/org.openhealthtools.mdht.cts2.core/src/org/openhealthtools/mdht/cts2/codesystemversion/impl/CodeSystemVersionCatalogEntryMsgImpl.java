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
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystemversion.CodeSystemVersionPackage;
import org.openhealthtools.mdht.cts2.core.impl.MessageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystemversion.impl.CodeSystemVersionCatalogEntryMsgImpl#getCodeSystemVersionCatalogEntry <em>Code
 * System Version Catalog Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemVersionCatalogEntryMsgImpl extends MessageImpl implements CodeSystemVersionCatalogEntryMsg {
	/**
	 * The cached value of the '{@link #getCodeSystemVersionCatalogEntry() <em>Code System Version Catalog Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemVersionCatalogEntry()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemVersionCatalogEntry codeSystemVersionCatalogEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemVersionCatalogEntryMsgImpl() {
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
		return CodeSystemVersionPackage.Literals.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemVersionCatalogEntry getCodeSystemVersionCatalogEntry() {
		return codeSystemVersionCatalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemVersionCatalogEntry(
			CodeSystemVersionCatalogEntry newCodeSystemVersionCatalogEntry, NotificationChain msgs) {
		CodeSystemVersionCatalogEntry oldCodeSystemVersionCatalogEntry = codeSystemVersionCatalogEntry;
		codeSystemVersionCatalogEntry = newCodeSystemVersionCatalogEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET,
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY,
				oldCodeSystemVersionCatalogEntry, newCodeSystemVersionCatalogEntry);
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
	public void setCodeSystemVersionCatalogEntry(CodeSystemVersionCatalogEntry newCodeSystemVersionCatalogEntry) {
		if (newCodeSystemVersionCatalogEntry != codeSystemVersionCatalogEntry) {
			NotificationChain msgs = null;
			if (codeSystemVersionCatalogEntry != null) {
				msgs = ((InternalEObject) codeSystemVersionCatalogEntry).eInverseRemove(
					this,
					EOPPOSITE_FEATURE_BASE -
							CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY,
					null, msgs);
			}
			if (newCodeSystemVersionCatalogEntry != null) {
				msgs = ((InternalEObject) newCodeSystemVersionCatalogEntry).eInverseAdd(
					this,
					EOPPOSITE_FEATURE_BASE -
							CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY,
					null, msgs);
			}
			msgs = basicSetCodeSystemVersionCatalogEntry(newCodeSystemVersionCatalogEntry, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET,
				CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY,
				newCodeSystemVersionCatalogEntry, newCodeSystemVersionCatalogEntry));
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				return basicSetCodeSystemVersionCatalogEntry(null, msgs);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				return getCodeSystemVersionCatalogEntry();
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				setCodeSystemVersionCatalogEntry((CodeSystemVersionCatalogEntry) newValue);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				setCodeSystemVersionCatalogEntry((CodeSystemVersionCatalogEntry) null);
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
			case CodeSystemVersionPackage.CODE_SYSTEM_VERSION_CATALOG_ENTRY_MSG__CODE_SYSTEM_VERSION_CATALOG_ENTRY:
				return codeSystemVersionCatalogEntry != null;
		}
		return super.eIsSet(featureID);
	}

} // CodeSystemVersionCatalogEntryMsgImpl
