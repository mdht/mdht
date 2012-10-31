/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.valueset.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.impl.MessageImpl;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntry;
import org.openhealthtools.mdht.cts2.valueset.ValueSetCatalogEntryMsg;
import org.openhealthtools.mdht.cts2.valueset.ValueSetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valueset.impl.ValueSetCatalogEntryMsgImpl#getValueSetCatalogEntry <em>Value Set Catalog Entry</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ValueSetCatalogEntryMsgImpl extends MessageImpl implements ValueSetCatalogEntryMsg {
	/**
	 * The cached value of the '{@link #getValueSetCatalogEntry() <em>Value Set Catalog Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValueSetCatalogEntry()
	 * @generated
	 * @ordered
	 */
	protected ValueSetCatalogEntry valueSetCatalogEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValueSetCatalogEntryMsgImpl() {
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
		return ValueSetPackage.Literals.VALUE_SET_CATALOG_ENTRY_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValueSetCatalogEntry getValueSetCatalogEntry() {
		return valueSetCatalogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValueSetCatalogEntry(ValueSetCatalogEntry newValueSetCatalogEntry,
			NotificationChain msgs) {
		ValueSetCatalogEntry oldValueSetCatalogEntry = valueSetCatalogEntry;
		valueSetCatalogEntry = newValueSetCatalogEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY,
				oldValueSetCatalogEntry, newValueSetCatalogEntry);
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
	public void setValueSetCatalogEntry(ValueSetCatalogEntry newValueSetCatalogEntry) {
		if (newValueSetCatalogEntry != valueSetCatalogEntry) {
			NotificationChain msgs = null;
			if (valueSetCatalogEntry != null) {
				msgs = ((InternalEObject) valueSetCatalogEntry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY, null, msgs);
			}
			if (newValueSetCatalogEntry != null) {
				msgs = ((InternalEObject) newValueSetCatalogEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY, null, msgs);
			}
			msgs = basicSetValueSetCatalogEntry(newValueSetCatalogEntry, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY,
				newValueSetCatalogEntry, newValueSetCatalogEntry));
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY:
				return basicSetValueSetCatalogEntry(null, msgs);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY:
				return getValueSetCatalogEntry();
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY:
				setValueSetCatalogEntry((ValueSetCatalogEntry) newValue);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY:
				setValueSetCatalogEntry((ValueSetCatalogEntry) null);
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
			case ValueSetPackage.VALUE_SET_CATALOG_ENTRY_MSG__VALUE_SET_CATALOG_ENTRY:
				return valueSetCatalogEntry != null;
		}
		return super.eIsSet(featureID);
	}

} // ValueSetCatalogEntryMsgImpl
