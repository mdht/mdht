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
import org.openhealthtools.mdht.emf.hl7.mif2.SerializedClassBindingArgument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Serialized Class Binding Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.SerializedClassBindingArgumentImpl#getArgumentClass <em>Argument Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SerializedClassBindingArgumentImpl extends ClassBindingArgumentBaseImpl implements SerializedClassBindingArgument {
	/**
	 * The cached value of the '{@link #getArgumentClass() <em>Argument Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentClass()
	 * @generated
	 * @ordered
	 */
	protected ClassOrReference argumentClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializedClassBindingArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.SERIALIZED_CLASS_BINDING_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOrReference getArgumentClass() {
		return argumentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgumentClass(ClassOrReference newArgumentClass, NotificationChain msgs) {
		ClassOrReference oldArgumentClass = argumentClass;
		argumentClass = newArgumentClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS, oldArgumentClass, newArgumentClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentClass(ClassOrReference newArgumentClass) {
		if (newArgumentClass != argumentClass) {
			NotificationChain msgs = null;
			if (argumentClass != null)
				msgs = ((InternalEObject)argumentClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS, null, msgs);
			if (newArgumentClass != null)
				msgs = ((InternalEObject)newArgumentClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS, null, msgs);
			msgs = basicSetArgumentClass(newArgumentClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS, newArgumentClass, newArgumentClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS:
				return basicSetArgumentClass(null, msgs);
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
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS:
				return getArgumentClass();
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
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS:
				setArgumentClass((ClassOrReference)newValue);
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
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS:
				setArgumentClass((ClassOrReference)null);
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
			case Mif2Package.SERIALIZED_CLASS_BINDING_ARGUMENT__ARGUMENT_CLASS:
				return argumentClass != null;
		}
		return super.eIsSet(featureID);
	}

} //SerializedClassBindingArgumentImpl
