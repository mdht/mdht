/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.uml.term.core.profile.CD;
import org.eclipse.mdht.uml.term.core.profile.CR;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.CRImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.CRImpl#getValue <em>Value</em>}</li>
 * <li>{@link org.eclipse.mdht.uml.term.core.profile.impl.CRImpl#isInverted <em>Inverted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CRImpl extends EObjectImpl implements CR {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CD name;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CD value;

	/**
	 * The default value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isInverted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #isInverted()
	 * @generated
	 * @ordered
	 */
	protected boolean inverted = INVERTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected CRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetName(CD newName, NotificationChain msgs) {
		CD oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, TermPackage.CR__NAME, oldName, newName);
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
	public NotificationChain basicSetValue(CD newValue, NotificationChain msgs) {
		CD oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, TermPackage.CR__VALUE, oldValue, newValue);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TermPackage.CR__NAME:
				return getName();
			case TermPackage.CR__VALUE:
				return getValue();
			case TermPackage.CR__INVERTED:
				return isInverted();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermPackage.CR__NAME:
				return basicSetName(null, msgs);
			case TermPackage.CR__VALUE:
				return basicSetValue(null, msgs);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TermPackage.CR__NAME:
				return name != null;
			case TermPackage.CR__VALUE:
				return value != null;
			case TermPackage.CR__INVERTED:
				return inverted != INVERTED_EDEFAULT;
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TermPackage.CR__NAME:
				setName((CD) newValue);
				return;
			case TermPackage.CR__VALUE:
				setValue((CD) newValue);
				return;
			case TermPackage.CR__INVERTED:
				setInverted((Boolean) newValue);
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
	protected EClass eStaticClass() {
		return TermPackage.Literals.CR;
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
			case TermPackage.CR__NAME:
				setName((CD) null);
				return;
			case TermPackage.CR__VALUE:
				setValue((CD) null);
				return;
			case TermPackage.CR__INVERTED:
				setInverted(INVERTED_EDEFAULT);
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
	public CD getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public CD getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean isInverted() {
		return inverted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setInverted(boolean newInverted) {
		boolean oldInverted = inverted;
		inverted = newInverted;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CR__INVERTED, oldInverted, inverted));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setName(CD newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null) {
				msgs = ((InternalEObject) name).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - TermPackage.CR__NAME, null, msgs);
			}
			if (newName != null) {
				msgs = ((InternalEObject) newName).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - TermPackage.CR__NAME, null, msgs);
			}
			msgs = basicSetName(newName, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CR__NAME, newName, newName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void setValue(CD newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null) {
				msgs = ((InternalEObject) value).eInverseRemove(
					this, EOPPOSITE_FEATURE_BASE - TermPackage.CR__VALUE, null, msgs);
			}
			if (newValue != null) {
				msgs = ((InternalEObject) newValue).eInverseAdd(
					this, EOPPOSITE_FEATURE_BASE - TermPackage.CR__VALUE, null, msgs);
			}
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, TermPackage.CR__VALUE, newValue, newValue));
		}
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
		result.append(" (inverted: ");
		result.append(inverted);
		result.append(')');
		return result.toString();
	}

} // CRImpl
