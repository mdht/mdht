/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClasses;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedEntryPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedEntryPointImpl#getEntryClass <em>Entry Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedEntryPointImpl extends EntryPointBaseImpl implements SerializedEntryPoint {
	/**
	 * The cached value of the '{@link #getEntryClass() <em>Entry Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryClass()
	 * @generated
	 * @ordered
	 */
	protected SerializedClasses entryClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedEntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedClasses getEntryClass() {
		return entryClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryClass(SerializedClasses newEntryClass, NotificationChain msgs) {
		SerializedClasses oldEntryClass = entryClass;
		entryClass = newEntryClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS, oldEntryClass, newEntryClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryClass(SerializedClasses newEntryClass) {
		if (newEntryClass != entryClass) {
			NotificationChain msgs = null;
			if (entryClass != null)
				msgs = ((InternalEObject)entryClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS, null, msgs);
			if (newEntryClass != null)
				msgs = ((InternalEObject)newEntryClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS, null, msgs);
			msgs = basicSetEntryClass(newEntryClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS, newEntryClass, newEntryClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS:
				return basicSetEntryClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS:
				return getEntryClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS:
				setEntryClass((SerializedClasses)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS:
				setEntryClass((SerializedClasses)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_ENTRY_POINT__ENTRY_CLASS:
				return entryClass != null;
		}
		return super.eIsSet(featureID);
	}

} //SerializedEntryPointImpl
