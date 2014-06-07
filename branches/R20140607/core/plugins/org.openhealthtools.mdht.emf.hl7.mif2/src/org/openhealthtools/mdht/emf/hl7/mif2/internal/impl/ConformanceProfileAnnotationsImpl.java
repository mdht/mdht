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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileAppInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceProfileDocumentation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conformance Profile Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileAnnotationsImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConformanceProfileAnnotationsImpl#getAppInfo <em>App Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformanceProfileAnnotationsImpl extends EObjectImpl implements ConformanceProfileAnnotations {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected ConformanceProfileDocumentation documentation;

	/**
	 * The cached value of the '{@link #getAppInfo() <em>App Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppInfo()
	 * @generated
	 * @ordered
	 */
	protected ConformanceProfileAppInfo appInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConformanceProfileAnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONFORMANCE_PROFILE_ANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileDocumentation getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(ConformanceProfileDocumentation newDocumentation,
			NotificationChain msgs) {
		ConformanceProfileDocumentation oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION, oldDocumentation,
				newDocumentation);
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
	public void setDocumentation(ConformanceProfileDocumentation newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null) {
				msgs = ((InternalEObject) documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION, null, msgs);
			}
			if (newDocumentation != null) {
				msgs = ((InternalEObject) newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION, null, msgs);
			}
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION, newDocumentation,
				newDocumentation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceProfileAppInfo getAppInfo() {
		return appInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppInfo(ConformanceProfileAppInfo newAppInfo, NotificationChain msgs) {
		ConformanceProfileAppInfo oldAppInfo = appInfo;
		appInfo = newAppInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO, oldAppInfo, newAppInfo);
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
	public void setAppInfo(ConformanceProfileAppInfo newAppInfo) {
		if (newAppInfo != appInfo) {
			NotificationChain msgs = null;
			if (appInfo != null) {
				msgs = ((InternalEObject) appInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO, null, msgs);
			}
			if (newAppInfo != null) {
				msgs = ((InternalEObject) newAppInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO, null, msgs);
			}
			msgs = basicSetAppInfo(newAppInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO, newAppInfo, newAppInfo));
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
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO:
				return basicSetAppInfo(null, msgs);
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
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION:
				return getDocumentation();
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO:
				return getAppInfo();
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
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION:
				setDocumentation((ConformanceProfileDocumentation) newValue);
				return;
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO:
				setAppInfo((ConformanceProfileAppInfo) newValue);
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
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION:
				setDocumentation((ConformanceProfileDocumentation) null);
				return;
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO:
				setAppInfo((ConformanceProfileAppInfo) null);
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
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__DOCUMENTATION:
				return documentation != null;
			case Mif2Package.CONFORMANCE_PROFILE_ANNOTATIONS__APP_INFO:
				return appInfo != null;
		}
		return super.eIsSet(featureID);
	}

} // ConformanceProfileAnnotationsImpl
