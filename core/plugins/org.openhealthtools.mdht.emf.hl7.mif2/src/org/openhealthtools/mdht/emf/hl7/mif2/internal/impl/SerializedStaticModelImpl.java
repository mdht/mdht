/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedEntryPoint;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Static Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedStaticModelImpl#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedStaticModelImpl extends StaticModelBaseImpl implements SerializedStaticModel {
	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected SerializedEntryPoint entryPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedStaticModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_STATIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializedEntryPoint getEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryPoint(SerializedEntryPoint newEntryPoint, NotificationChain msgs) {
		SerializedEntryPoint oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT, oldEntryPoint, newEntryPoint);
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
	 * @generated
	 */
	public void setEntryPoint(SerializedEntryPoint newEntryPoint) {
		if (newEntryPoint != entryPoint) {
			NotificationChain msgs = null;
			if (entryPoint != null) {
				msgs = ((InternalEObject) entryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT, null, msgs);
			}
			if (newEntryPoint != null) {
				msgs = ((InternalEObject) newEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT, null, msgs);
			}
			msgs = basicSetEntryPoint(newEntryPoint, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT, newEntryPoint, newEntryPoint));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT:
				return basicSetEntryPoint(null, msgs);
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
			case Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT:
				return getEntryPoint();
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
			case Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT:
				setEntryPoint((SerializedEntryPoint) newValue);
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
			case Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT:
				setEntryPoint((SerializedEntryPoint) null);
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
			case Mif2Package.SERIALIZED_STATIC_MODEL__ENTRY_POINT:
				return entryPoint != null;
		}
		return super.eIsSet(featureID);
	}

} // SerializedStaticModelImpl
