/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.PropertyReference;
import org.openhealthtools.mdht.cts2.core.TargetReferenceType;
import org.openhealthtools.mdht.cts2.core.URIAndEntityName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.PropertyReferenceImpl#getReferenceTarget <em>Reference Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.PropertyReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PropertyReferenceImpl extends EObjectImpl implements PropertyReference {
	/**
	 * The cached value of the '{@link #getReferenceTarget() <em>Reference Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferenceTarget()
	 * @generated
	 * @ordered
	 */
	protected URIAndEntityName referenceTarget;

	/**
	 * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected static final TargetReferenceType REFERENCE_TYPE_EDEFAULT = TargetReferenceType.ATTRIBUTE;

	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected TargetReferenceType referenceType = REFERENCE_TYPE_EDEFAULT;

	/**
	 * This is true if the Reference Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean referenceTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PropertyReferenceImpl() {
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
		return CorePackage.Literals.PROPERTY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URIAndEntityName getReferenceTarget() {
		return referenceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetReferenceTarget(URIAndEntityName newReferenceTarget, NotificationChain msgs) {
		URIAndEntityName oldReferenceTarget = referenceTarget;
		referenceTarget = newReferenceTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET, oldReferenceTarget,
				newReferenceTarget);
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
	public void setReferenceTarget(URIAndEntityName newReferenceTarget) {
		if (newReferenceTarget != referenceTarget) {
			NotificationChain msgs = null;
			if (referenceTarget != null) {
				msgs = ((InternalEObject) referenceTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET, null, msgs);
			}
			if (newReferenceTarget != null) {
				msgs = ((InternalEObject) newReferenceTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET, null, msgs);
			}
			msgs = basicSetReferenceTarget(newReferenceTarget, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET, newReferenceTarget,
				newReferenceTarget));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TargetReferenceType getReferenceType() {
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReferenceType(TargetReferenceType newReferenceType) {
		TargetReferenceType oldReferenceType = referenceType;
		referenceType = newReferenceType == null
				? REFERENCE_TYPE_EDEFAULT
				: newReferenceType;
		boolean oldReferenceTypeESet = referenceTypeESet;
		referenceTypeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.PROPERTY_REFERENCE__REFERENCE_TYPE, oldReferenceType,
				referenceType, !oldReferenceTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetReferenceType() {
		TargetReferenceType oldReferenceType = referenceType;
		boolean oldReferenceTypeESet = referenceTypeESet;
		referenceType = REFERENCE_TYPE_EDEFAULT;
		referenceTypeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CorePackage.PROPERTY_REFERENCE__REFERENCE_TYPE, oldReferenceType,
				REFERENCE_TYPE_EDEFAULT, oldReferenceTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetReferenceType() {
		return referenceTypeESet;
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
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET:
				return basicSetReferenceTarget(null, msgs);
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
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET:
				return getReferenceTarget();
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TYPE:
				return getReferenceType();
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
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET:
				setReferenceTarget((URIAndEntityName) newValue);
				return;
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TYPE:
				setReferenceType((TargetReferenceType) newValue);
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
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET:
				setReferenceTarget((URIAndEntityName) null);
				return;
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TYPE:
				unsetReferenceType();
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
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TARGET:
				return referenceTarget != null;
			case CorePackage.PROPERTY_REFERENCE__REFERENCE_TYPE:
				return isSetReferenceType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referenceType: ");
		if (referenceTypeESet) {
			result.append(referenceType);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // PropertyReferenceImpl
