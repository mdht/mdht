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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndDerivationImpl#getAssociationEndName <em>Association End Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndDerivationImpl extends ClassDerivationImpl implements AssociationEndDerivation {
	/**
	 * The default value of the '{@link #getAssociationEndName() <em>Association End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATION_END_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociationEndName() <em>Association End Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociationEndName()
	 * @generated
	 * @ordered
	 */
	protected String associationEndName = ASSOCIATION_END_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ASSOCIATION_END_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociationEndName() {
		return associationEndName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEndName(String newAssociationEndName) {
		String oldAssociationEndName = associationEndName;
		associationEndName = newAssociationEndName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ASSOCIATION_END_DERIVATION__ASSOCIATION_END_NAME,
				oldAssociationEndName, associationEndName));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.ASSOCIATION_END_DERIVATION__ASSOCIATION_END_NAME:
				return getAssociationEndName();
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
			case Mif2Package.ASSOCIATION_END_DERIVATION__ASSOCIATION_END_NAME:
				setAssociationEndName((String) newValue);
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
			case Mif2Package.ASSOCIATION_END_DERIVATION__ASSOCIATION_END_NAME:
				setAssociationEndName(ASSOCIATION_END_NAME_EDEFAULT);
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
			case Mif2Package.ASSOCIATION_END_DERIVATION__ASSOCIATION_END_NAME:
				return ASSOCIATION_END_NAME_EDEFAULT == null
						? associationEndName != null
						: !ASSOCIATION_END_NAME_EDEFAULT.equals(associationEndName);
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
		result.append(" (associationEndName: ");
		result.append(associationEndName);
		result.append(')');
		return result.toString();
	}

} // AssociationEndDerivationImpl
