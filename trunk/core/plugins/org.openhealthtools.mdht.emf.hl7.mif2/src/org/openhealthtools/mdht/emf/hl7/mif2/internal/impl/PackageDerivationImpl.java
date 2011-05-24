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
import org.openhealthtools.mdht.emf.hl7.mif2.PackageDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PackageDerivationImpl#getTargetPackage <em>Target Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageDerivationImpl extends DerivationImpl implements PackageDerivation {
	/**
	 * The cached value of the '{@link #getTargetPackage() <em>Target Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPackage()
	 * @generated
	 * @ordered
	 */
	protected PackageRef targetPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PACKAGE_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageRef getTargetPackage() {
		return targetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPackage(PackageRef newTargetPackage, NotificationChain msgs) {
		PackageRef oldTargetPackage = targetPackage;
		targetPackage = newTargetPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE, oldTargetPackage,
				newTargetPackage);
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
	public void setTargetPackage(PackageRef newTargetPackage) {
		if (newTargetPackage != targetPackage) {
			NotificationChain msgs = null;
			if (targetPackage != null) {
				msgs = ((InternalEObject) targetPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE, null, msgs);
			}
			if (newTargetPackage != null) {
				msgs = ((InternalEObject) newTargetPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE, null, msgs);
			}
			msgs = basicSetTargetPackage(newTargetPackage, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE, newTargetPackage,
				newTargetPackage));
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
			case Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE:
				return basicSetTargetPackage(null, msgs);
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
			case Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE:
				return getTargetPackage();
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
			case Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE:
				setTargetPackage((PackageRef) newValue);
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
			case Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE:
				setTargetPackage((PackageRef) null);
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
			case Mif2Package.PACKAGE_DERIVATION__TARGET_PACKAGE:
				return targetPackage != null;
		}
		return super.eIsSet(featureID);
	}

} // PackageDerivationImpl
