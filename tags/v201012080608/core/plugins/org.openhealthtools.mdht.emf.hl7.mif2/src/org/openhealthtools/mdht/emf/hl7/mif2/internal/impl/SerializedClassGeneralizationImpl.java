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

import org.openhealthtools.mdht.emf.hl7.mif2.ClassOrReference;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassGeneralization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Class Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassGeneralizationImpl#getSpecializedClass <em>Specialized Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedClassGeneralizationImpl extends ClassGeneralizationBaseImpl implements SerializedClassGeneralization {
	/**
	 * The cached value of the '{@link #getSpecializedClass() <em>Specialized Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializedClass()
	 * @generated
	 * @ordered
	 */
	protected ClassOrReference specializedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedClassGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_CLASS_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOrReference getSpecializedClass() {
		return specializedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializedClass(ClassOrReference newSpecializedClass, NotificationChain msgs) {
		ClassOrReference oldSpecializedClass = specializedClass;
		specializedClass = newSpecializedClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS, oldSpecializedClass, newSpecializedClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializedClass(ClassOrReference newSpecializedClass) {
		if (newSpecializedClass != specializedClass) {
			NotificationChain msgs = null;
			if (specializedClass != null)
				msgs = ((InternalEObject)specializedClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS, null, msgs);
			if (newSpecializedClass != null)
				msgs = ((InternalEObject)newSpecializedClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS, null, msgs);
			msgs = basicSetSpecializedClass(newSpecializedClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS, newSpecializedClass, newSpecializedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS:
				return basicSetSpecializedClass(null, msgs);
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
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS:
				return getSpecializedClass();
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
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS:
				setSpecializedClass((ClassOrReference)newValue);
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
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS:
				setSpecializedClass((ClassOrReference)null);
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
			case Mif2Package.SERIALIZED_CLASS_GENERALIZATION__SPECIALIZED_CLASS:
				return specializedClass != null;
		}
		return super.eIsSet(featureID);
	}

} //SerializedClassGeneralizationImpl
