/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.codesystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;
import org.openhealthtools.mdht.cts2.core.impl.MessageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.codesystem.impl.CodeSystemCatalogEntryMsgImpl#getCodeSystemCatalogEntry <em>Code System Catalog Entry
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class CodeSystemCatalogEntryMsgImpl extends MessageImpl implements CodeSystemCatalogEntryMsg {
	/**
	 * The cached value of the '{@link #getCodeSystemCatalogEntry() <em>Code System Catalog Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCodeSystemCatalogEntry()
	 * @generated
	 * @ordered
	 */
	protected CodeSystemCatalogEntry codeSystemCatalogEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemCatalogEntryMsgImpl() {
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
		return CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntry getCodeSystemCatalogEntry() {
		return codeSystemCatalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCodeSystemCatalogEntry(CodeSystemCatalogEntry newCodeSystemCatalogEntry,
			NotificationChain msgs) {
		CodeSystemCatalogEntry oldCodeSystemCatalogEntry = codeSystemCatalogEntry;
		codeSystemCatalogEntry = newCodeSystemCatalogEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY,
				oldCodeSystemCatalogEntry, newCodeSystemCatalogEntry);
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
	public void setCodeSystemCatalogEntry(CodeSystemCatalogEntry newCodeSystemCatalogEntry) {
		if (newCodeSystemCatalogEntry != codeSystemCatalogEntry) {
			NotificationChain msgs = null;
			if (codeSystemCatalogEntry != null) {
				msgs = ((InternalEObject) codeSystemCatalogEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY, null, msgs);
			}
			if (newCodeSystemCatalogEntry != null) {
				msgs = ((InternalEObject) newCodeSystemCatalogEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY, null, msgs);
			}
			msgs = basicSetCodeSystemCatalogEntry(newCodeSystemCatalogEntry, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY,
				newCodeSystemCatalogEntry, newCodeSystemCatalogEntry));
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY:
				return basicSetCodeSystemCatalogEntry(null, msgs);
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY:
				return getCodeSystemCatalogEntry();
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY:
				setCodeSystemCatalogEntry((CodeSystemCatalogEntry) newValue);
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY:
				setCodeSystemCatalogEntry((CodeSystemCatalogEntry) null);
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
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY_MSG__CODE_SYSTEM_CATALOG_ENTRY:
				return codeSystemCatalogEntry != null;
		}
		return super.eIsSet(featureID);
	}

} // CodeSystemCatalogEntryMsgImpl
