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

import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeDerivationImpl#getTargetDatatype <em>Target Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDerivationImpl extends DerivationImpl implements DatatypeDerivation {
	/**
	 * The cached value of the '{@link #getTargetDatatype() <em>Target Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDatatype()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRef targetDatatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DATATYPE_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef getTargetDatatype() {
		return targetDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetDatatype(DatatypeRef newTargetDatatype, NotificationChain msgs) {
		DatatypeRef oldTargetDatatype = targetDatatype;
		targetDatatype = newTargetDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE, oldTargetDatatype,
				newTargetDatatype);
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
	public void setTargetDatatype(DatatypeRef newTargetDatatype) {
		if (newTargetDatatype != targetDatatype) {
			NotificationChain msgs = null;
			if (targetDatatype != null) {
				msgs = ((InternalEObject) targetDatatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE, null, msgs);
			}
			if (newTargetDatatype != null) {
				msgs = ((InternalEObject) newTargetDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE, null, msgs);
			}
			msgs = basicSetTargetDatatype(newTargetDatatype, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE, newTargetDatatype,
				newTargetDatatype));
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
			case Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE:
				return basicSetTargetDatatype(null, msgs);
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
			case Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE:
				return getTargetDatatype();
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
			case Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE:
				setTargetDatatype((DatatypeRef) newValue);
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
			case Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE:
				setTargetDatatype((DatatypeRef) null);
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
			case Mif2Package.DATATYPE_DERIVATION__TARGET_DATATYPE:
				return targetDatatype != null;
		}
		return super.eIsSet(featureID);
	}

} // DatatypeDerivationImpl
