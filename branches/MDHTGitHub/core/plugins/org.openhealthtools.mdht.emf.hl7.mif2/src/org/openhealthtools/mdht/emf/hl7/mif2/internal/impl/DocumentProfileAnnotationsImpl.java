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

import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileAppInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.DocumentProfileDocumentation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Profile Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentProfileAnnotationsImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DocumentProfileAnnotationsImpl#getAppInfo <em>App Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DocumentProfileAnnotationsImpl extends EObjectImpl implements DocumentProfileAnnotations {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected DocumentProfileDocumentation documentation;

	/**
	 * The cached value of the '{@link #getAppInfo() <em>App Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppInfo()
	 * @generated
	 * @ordered
	 */
	protected DocumentProfileAppInfo appInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentProfileAnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DOCUMENT_PROFILE_ANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileDocumentation getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(DocumentProfileDocumentation newDocumentation, NotificationChain msgs) {
		DocumentProfileDocumentation oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION, oldDocumentation,
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
	public void setDocumentation(DocumentProfileDocumentation newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null) {
				msgs = ((InternalEObject) documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION, null, msgs);
			}
			if (newDocumentation != null) {
				msgs = ((InternalEObject) newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION, null, msgs);
			}
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION, newDocumentation,
				newDocumentation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentProfileAppInfo getAppInfo() {
		return appInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppInfo(DocumentProfileAppInfo newAppInfo, NotificationChain msgs) {
		DocumentProfileAppInfo oldAppInfo = appInfo;
		appInfo = newAppInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO, oldAppInfo, newAppInfo);
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
	public void setAppInfo(DocumentProfileAppInfo newAppInfo) {
		if (newAppInfo != appInfo) {
			NotificationChain msgs = null;
			if (appInfo != null) {
				msgs = ((InternalEObject) appInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO, null, msgs);
			}
			if (newAppInfo != null) {
				msgs = ((InternalEObject) newAppInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO, null, msgs);
			}
			msgs = basicSetAppInfo(newAppInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO, newAppInfo, newAppInfo));
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
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO:
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
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION:
				return getDocumentation();
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO:
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
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION:
				setDocumentation((DocumentProfileDocumentation) newValue);
				return;
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO:
				setAppInfo((DocumentProfileAppInfo) newValue);
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
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION:
				setDocumentation((DocumentProfileDocumentation) null);
				return;
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO:
				setAppInfo((DocumentProfileAppInfo) null);
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
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__DOCUMENTATION:
				return documentation != null;
			case Mif2Package.DOCUMENT_PROFILE_ANNOTATIONS__APP_INFO:
				return appInfo != null;
		}
		return super.eIsSet(featureID);
	}

} // DocumentProfileAnnotationsImpl
