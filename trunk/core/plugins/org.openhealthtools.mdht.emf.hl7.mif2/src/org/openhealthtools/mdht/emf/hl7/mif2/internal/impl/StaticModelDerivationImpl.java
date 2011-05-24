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
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;
import org.openhealthtools.mdht.emf.hl7.mif2.StaticModelDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Model Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelDerivationImpl#getTargetStaticModel <em>Target Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.StaticModelDerivationImpl#getStaticModelDerivationId <em>Static Model Derivation Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticModelDerivationImpl extends DerivationImpl implements StaticModelDerivation {
	/**
	 * The cached value of the '{@link #getTargetStaticModel() <em>Target Static Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetStaticModel()
	 * @generated
	 * @ordered
	 */
	protected PackageRef targetStaticModel;

	/**
	 * The default value of the '{@link #getStaticModelDerivationId() <em>Static Model Derivation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticModelDerivationId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_MODEL_DERIVATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticModelDerivationId() <em>Static Model Derivation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticModelDerivationId()
	 * @generated
	 * @ordered
	 */
	protected String staticModelDerivationId = STATIC_MODEL_DERIVATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticModelDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.STATIC_MODEL_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getTargetStaticModel() {
		return targetStaticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetStaticModel(PackageRef newTargetStaticModel, NotificationChain msgs) {
		PackageRef oldTargetStaticModel = targetStaticModel;
		targetStaticModel = newTargetStaticModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL, oldTargetStaticModel,
				newTargetStaticModel);
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
	public void setTargetStaticModel(PackageRef newTargetStaticModel) {
		if (newTargetStaticModel != targetStaticModel) {
			NotificationChain msgs = null;
			if (targetStaticModel != null) {
				msgs = ((InternalEObject) targetStaticModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL, null, msgs);
			}
			if (newTargetStaticModel != null) {
				msgs = ((InternalEObject) newTargetStaticModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL, null, msgs);
			}
			msgs = basicSetTargetStaticModel(newTargetStaticModel, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL, newTargetStaticModel,
				newTargetStaticModel));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticModelDerivationId() {
		return staticModelDerivationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticModelDerivationId(String newStaticModelDerivationId) {
		String oldStaticModelDerivationId = staticModelDerivationId;
		staticModelDerivationId = newStaticModelDerivationId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.STATIC_MODEL_DERIVATION__STATIC_MODEL_DERIVATION_ID,
				oldStaticModelDerivationId, staticModelDerivationId));
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
			case Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL:
				return basicSetTargetStaticModel(null, msgs);
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
			case Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL:
				return getTargetStaticModel();
			case Mif2Package.STATIC_MODEL_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				return getStaticModelDerivationId();
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
			case Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL:
				setTargetStaticModel((PackageRef) newValue);
				return;
			case Mif2Package.STATIC_MODEL_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				setStaticModelDerivationId((String) newValue);
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
			case Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL:
				setTargetStaticModel((PackageRef) null);
				return;
			case Mif2Package.STATIC_MODEL_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				setStaticModelDerivationId(STATIC_MODEL_DERIVATION_ID_EDEFAULT);
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
			case Mif2Package.STATIC_MODEL_DERIVATION__TARGET_STATIC_MODEL:
				return targetStaticModel != null;
			case Mif2Package.STATIC_MODEL_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				return STATIC_MODEL_DERIVATION_ID_EDEFAULT == null
						? staticModelDerivationId != null
						: !STATIC_MODEL_DERIVATION_ID_EDEFAULT.equals(staticModelDerivationId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (staticModelDerivationId: ");
		result.append(staticModelDerivationId);
		result.append(')');
		return result.toString();
	}

} // StaticModelDerivationImpl
