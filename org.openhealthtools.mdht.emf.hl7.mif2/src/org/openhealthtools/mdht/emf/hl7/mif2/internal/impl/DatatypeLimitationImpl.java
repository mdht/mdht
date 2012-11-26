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

import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeLimitation;
import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Limitation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeLimitationImpl#getDefinedDatatype <em>Defined Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.DatatypeLimitationImpl#getSubstituteDatatype <em>Substitute Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeLimitationImpl extends EObjectImpl implements DatatypeLimitation {
	/**
	 * The cached value of the '{@link #getDefinedDatatype() <em>Defined Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinedDatatype()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRef definedDatatype;

	/**
	 * The cached value of the '{@link #getSubstituteDatatype() <em>Substitute Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstituteDatatype()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRef substituteDatatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeLimitationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.DATATYPE_LIMITATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef getDefinedDatatype() {
		return definedDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinedDatatype(DatatypeRef newDefinedDatatype, NotificationChain msgs) {
		DatatypeRef oldDefinedDatatype = definedDatatype;
		definedDatatype = newDefinedDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE, oldDefinedDatatype,
				newDefinedDatatype);
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
	public void setDefinedDatatype(DatatypeRef newDefinedDatatype) {
		if (newDefinedDatatype != definedDatatype) {
			NotificationChain msgs = null;
			if (definedDatatype != null) {
				msgs = ((InternalEObject) definedDatatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE, null, msgs);
			}
			if (newDefinedDatatype != null) {
				msgs = ((InternalEObject) newDefinedDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE, null, msgs);
			}
			msgs = basicSetDefinedDatatype(newDefinedDatatype, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE, newDefinedDatatype,
				newDefinedDatatype));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef getSubstituteDatatype() {
		return substituteDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstituteDatatype(DatatypeRef newSubstituteDatatype, NotificationChain msgs) {
		DatatypeRef oldSubstituteDatatype = substituteDatatype;
		substituteDatatype = newSubstituteDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE, oldSubstituteDatatype,
				newSubstituteDatatype);
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
	public void setSubstituteDatatype(DatatypeRef newSubstituteDatatype) {
		if (newSubstituteDatatype != substituteDatatype) {
			NotificationChain msgs = null;
			if (substituteDatatype != null) {
				msgs = ((InternalEObject) substituteDatatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE, null, msgs);
			}
			if (newSubstituteDatatype != null) {
				msgs = ((InternalEObject) newSubstituteDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE, null, msgs);
			}
			msgs = basicSetSubstituteDatatype(newSubstituteDatatype, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE, newSubstituteDatatype,
				newSubstituteDatatype));
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
			case Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE:
				return basicSetDefinedDatatype(null, msgs);
			case Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE:
				return basicSetSubstituteDatatype(null, msgs);
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
			case Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE:
				return getDefinedDatatype();
			case Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE:
				return getSubstituteDatatype();
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
			case Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE:
				setDefinedDatatype((DatatypeRef) newValue);
				return;
			case Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE:
				setSubstituteDatatype((DatatypeRef) newValue);
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
			case Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE:
				setDefinedDatatype((DatatypeRef) null);
				return;
			case Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE:
				setSubstituteDatatype((DatatypeRef) null);
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
			case Mif2Package.DATATYPE_LIMITATION__DEFINED_DATATYPE:
				return definedDatatype != null;
			case Mif2Package.DATATYPE_LIMITATION__SUBSTITUTE_DATATYPE:
				return substituteDatatype != null;
		}
		return super.eIsSet(featureID);
	}

} // DatatypeLimitationImpl
