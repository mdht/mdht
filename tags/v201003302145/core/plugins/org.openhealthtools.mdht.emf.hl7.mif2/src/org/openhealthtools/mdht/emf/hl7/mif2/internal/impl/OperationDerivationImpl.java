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

import org.openhealthtools.mdht.emf.hl7.mif2.DatatypeRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.OperationDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OperationDerivationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.OperationDerivationImpl#getTargetDatatype <em>Target Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationDerivationImpl extends DerivationImpl implements OperationDerivation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DatatypeRef type;

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
	protected OperationDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.OPERATION_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeRef getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(DatatypeRef newType, NotificationChain msgs) {
		DatatypeRef oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.OPERATION_DERIVATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DatatypeRef newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.OPERATION_DERIVATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.OPERATION_DERIVATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.OPERATION_DERIVATION__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE, oldTargetDatatype, newTargetDatatype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
			if (targetDatatype != null)
				msgs = ((InternalEObject)targetDatatype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE, null, msgs);
			if (newTargetDatatype != null)
				msgs = ((InternalEObject)newTargetDatatype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE, null, msgs);
			msgs = basicSetTargetDatatype(newTargetDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE, newTargetDatatype, newTargetDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.OPERATION_DERIVATION__TYPE:
				return basicSetType(null, msgs);
			case Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE:
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
			case Mif2Package.OPERATION_DERIVATION__TYPE:
				return getType();
			case Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE:
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
			case Mif2Package.OPERATION_DERIVATION__TYPE:
				setType((DatatypeRef)newValue);
				return;
			case Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE:
				setTargetDatatype((DatatypeRef)newValue);
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
			case Mif2Package.OPERATION_DERIVATION__TYPE:
				setType((DatatypeRef)null);
				return;
			case Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE:
				setTargetDatatype((DatatypeRef)null);
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
			case Mif2Package.OPERATION_DERIVATION__TYPE:
				return type != null;
			case Mif2Package.OPERATION_DERIVATION__TARGET_DATATYPE:
				return targetDatatype != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationDerivationImpl
