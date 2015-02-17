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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.CodeSupplement;
import org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PrintName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Supplement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSupplementImpl#getPrintName <em>Print Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSupplementImpl#getSupplementalCodeProperty <em>Supplemental Code Property</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.CodeSupplementImpl#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSupplementImpl extends EObjectImpl implements CodeSupplement {
	/**
	 * The cached value of the '{@link #getPrintName() <em>Print Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintName()
	 * @generated
	 * @ordered
	 */
	protected EList<PrintName> printName;

	/**
	 * The cached value of the '{@link #getSupplementalCodeProperty() <em>Supplemental Code Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalCodeProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptProperty> supplementalCodeProperty;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSupplementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CODE_SUPPLEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrintName> getPrintName() {
		if (printName == null) {
			printName = new EObjectContainmentEList<PrintName>(
				PrintName.class, this, Mif2Package.CODE_SUPPLEMENT__PRINT_NAME);
		}
		return printName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptProperty> getSupplementalCodeProperty() {
		if (supplementalCodeProperty == null) {
			supplementalCodeProperty = new EObjectContainmentEList<ConceptProperty>(
				ConceptProperty.class, this, Mif2Package.CODE_SUPPLEMENT__SUPPLEMENTAL_CODE_PROPERTY);
		}
		return supplementalCodeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.CODE_SUPPLEMENT__CODE, oldCode, code));
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
			case Mif2Package.CODE_SUPPLEMENT__PRINT_NAME:
				return ((InternalEList<?>) getPrintName()).basicRemove(otherEnd, msgs);
			case Mif2Package.CODE_SUPPLEMENT__SUPPLEMENTAL_CODE_PROPERTY:
				return ((InternalEList<?>) getSupplementalCodeProperty()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CODE_SUPPLEMENT__PRINT_NAME:
				return getPrintName();
			case Mif2Package.CODE_SUPPLEMENT__SUPPLEMENTAL_CODE_PROPERTY:
				return getSupplementalCodeProperty();
			case Mif2Package.CODE_SUPPLEMENT__CODE:
				return getCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.CODE_SUPPLEMENT__PRINT_NAME:
				getPrintName().clear();
				getPrintName().addAll((Collection<? extends PrintName>) newValue);
				return;
			case Mif2Package.CODE_SUPPLEMENT__SUPPLEMENTAL_CODE_PROPERTY:
				getSupplementalCodeProperty().clear();
				getSupplementalCodeProperty().addAll((Collection<? extends ConceptProperty>) newValue);
				return;
			case Mif2Package.CODE_SUPPLEMENT__CODE:
				setCode((String) newValue);
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
			case Mif2Package.CODE_SUPPLEMENT__PRINT_NAME:
				getPrintName().clear();
				return;
			case Mif2Package.CODE_SUPPLEMENT__SUPPLEMENTAL_CODE_PROPERTY:
				getSupplementalCodeProperty().clear();
				return;
			case Mif2Package.CODE_SUPPLEMENT__CODE:
				setCode(CODE_EDEFAULT);
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
			case Mif2Package.CODE_SUPPLEMENT__PRINT_NAME:
				return printName != null && !printName.isEmpty();
			case Mif2Package.CODE_SUPPLEMENT__SUPPLEMENTAL_CODE_PROPERTY:
				return supplementalCodeProperty != null && !supplementalCodeProperty.isEmpty();
			case Mif2Package.CODE_SUPPLEMENT__CODE:
				return CODE_EDEFAULT == null
						? code != null
						: !CODE_EDEFAULT.equals(code);
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
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} // CodeSupplementImpl
