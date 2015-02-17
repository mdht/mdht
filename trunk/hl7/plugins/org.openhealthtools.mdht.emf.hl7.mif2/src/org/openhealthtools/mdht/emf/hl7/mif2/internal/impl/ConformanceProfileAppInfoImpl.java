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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequest;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAppInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.DeprecationInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Profile App Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileAppInfoImpl#getChangeRequest <em>Change Request</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileAppInfoImpl#getDeprecationInfo <em>Deprecation Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformanceProfileAppInfoImpl extends EObjectImpl implements ConformanceProfileAppInfo {
	/**
	 * The cached value of the '{@link #getChangeRequest() <em>Change Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeRequest> changeRequest;

	/**
	 * The cached value of the '{@link #getDeprecationInfo() <em>Deprecation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecationInfo()
	 * @generated
	 * @ordered
	 */
	protected DeprecationInfo deprecationInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceProfileAppInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONFORMANCE_PROFILE_APP_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeRequest> getChangeRequest() {
		if (changeRequest == null) {
			changeRequest = new EObjectContainmentEList<ChangeRequest>(
				ChangeRequest.class, this, Mif2Package.CONFORMANCE_PROFILE_APP_INFO__CHANGE_REQUEST);
		}
		return changeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeprecationInfo getDeprecationInfo() {
		return deprecationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeprecationInfo(DeprecationInfo newDeprecationInfo, NotificationChain msgs) {
		DeprecationInfo oldDeprecationInfo = deprecationInfo;
		deprecationInfo = newDeprecationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO, oldDeprecationInfo,
				newDeprecationInfo);
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
	public void setDeprecationInfo(DeprecationInfo newDeprecationInfo) {
		if (newDeprecationInfo != deprecationInfo) {
			NotificationChain msgs = null;
			if (deprecationInfo != null) {
				msgs = ((InternalEObject) deprecationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO, null, msgs);
			}
			if (newDeprecationInfo != null) {
				msgs = ((InternalEObject) newDeprecationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO, null, msgs);
			}
			msgs = basicSetDeprecationInfo(newDeprecationInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO, newDeprecationInfo,
				newDeprecationInfo));
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
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__CHANGE_REQUEST:
				return ((InternalEList<?>) getChangeRequest()).basicRemove(otherEnd, msgs);
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO:
				return basicSetDeprecationInfo(null, msgs);
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
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__CHANGE_REQUEST:
				return getChangeRequest();
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO:
				return getDeprecationInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__CHANGE_REQUEST:
				getChangeRequest().clear();
				getChangeRequest().addAll((Collection<? extends ChangeRequest>) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO:
				setDeprecationInfo((DeprecationInfo) newValue);
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
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__CHANGE_REQUEST:
				getChangeRequest().clear();
				return;
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO:
				setDeprecationInfo((DeprecationInfo) null);
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
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__CHANGE_REQUEST:
				return changeRequest != null && !changeRequest.isEmpty();
			case Mif2Package.CONFORMANCE_PROFILE_APP_INFO__DEPRECATION_INFO:
				return deprecationInfo != null;
		}
		return super.eIsSet(featureID);
	}

} // ConformanceProfileAppInfoImpl
