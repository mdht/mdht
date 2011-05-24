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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ClassDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassDerivationImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassDerivationImpl#getStaticModelDerivationId <em>Static Model Derivation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ClassDerivationImpl#getWithinCMET <em>Within CMET</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDerivationImpl extends EObjectImpl implements ClassDerivation {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaticModelDerivationId() <em>Static Model Derivation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticModelDerivationId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_MODEL_DERIVATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticModelDerivationId() <em>Static Model Derivation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticModelDerivationId()
	 * @generated
	 * @ordered
	 */
	protected String staticModelDerivationId = STATIC_MODEL_DERIVATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithinCMET() <em>Within CMET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinCMET()
	 * @generated
	 * @ordered
	 */
	protected static final String WITHIN_CMET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithinCMET() <em>Within CMET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinCMET()
	 * @generated
	 * @ordered
	 */
	protected String withinCMET = WITHIN_CMET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CLASS_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_DERIVATION__CLASS_NAME, oldClassName, className));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticModelDerivationId() {
		return staticModelDerivationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticModelDerivationId(String newStaticModelDerivationId) {
		String oldStaticModelDerivationId = staticModelDerivationId;
		staticModelDerivationId = newStaticModelDerivationId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_DERIVATION__STATIC_MODEL_DERIVATION_ID,
				oldStaticModelDerivationId, staticModelDerivationId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWithinCMET() {
		return withinCMET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithinCMET(String newWithinCMET) {
		String oldWithinCMET = withinCMET;
		withinCMET = newWithinCMET;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CLASS_DERIVATION__WITHIN_CMET, oldWithinCMET, withinCMET));
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
			case Mif2Package.CLASS_DERIVATION__CLASS_NAME:
				return getClassName();
			case Mif2Package.CLASS_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				return getStaticModelDerivationId();
			case Mif2Package.CLASS_DERIVATION__WITHIN_CMET:
				return getWithinCMET();
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
			case Mif2Package.CLASS_DERIVATION__CLASS_NAME:
				setClassName((String) newValue);
				return;
			case Mif2Package.CLASS_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				setStaticModelDerivationId((String) newValue);
				return;
			case Mif2Package.CLASS_DERIVATION__WITHIN_CMET:
				setWithinCMET((String) newValue);
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
			case Mif2Package.CLASS_DERIVATION__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case Mif2Package.CLASS_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				setStaticModelDerivationId(STATIC_MODEL_DERIVATION_ID_EDEFAULT);
				return;
			case Mif2Package.CLASS_DERIVATION__WITHIN_CMET:
				setWithinCMET(WITHIN_CMET_EDEFAULT);
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
			case Mif2Package.CLASS_DERIVATION__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null
						? className != null
						: !CLASS_NAME_EDEFAULT.equals(className);
			case Mif2Package.CLASS_DERIVATION__STATIC_MODEL_DERIVATION_ID:
				return STATIC_MODEL_DERIVATION_ID_EDEFAULT == null
						? staticModelDerivationId != null
						: !STATIC_MODEL_DERIVATION_ID_EDEFAULT.equals(staticModelDerivationId);
			case Mif2Package.CLASS_DERIVATION__WITHIN_CMET:
				return WITHIN_CMET_EDEFAULT == null
						? withinCMET != null
						: !WITHIN_CMET_EDEFAULT.equals(withinCMET);
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
		result.append(" (className: ");
		result.append(className);
		result.append(", staticModelDerivationId: ");
		result.append(staticModelDerivationId);
		result.append(", withinCMET: ");
		result.append(withinCMET);
		result.append(')');
		return result.toString();
	}

} // ClassDerivationImpl
