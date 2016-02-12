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
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.uml.Constraint;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.ConstraintValidation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConstraintValidationImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConstraintValidationImpl#isEnabledDitaForConstraints <em>Enabled Dita For Constraints
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintValidationImpl extends ValidationImpl implements ConstraintValidation {
	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * The default value of the '{@link #isEnabledDitaForConstraints() <em>Enabled Dita For Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isEnabledDitaForConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_DITA_FOR_CONSTRAINTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabledDitaForConstraints() <em>Enabled Dita For Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isEnabledDitaForConstraints()
	 * @generated
	 * @ordered
	 */
	protected boolean enabledDitaForConstraints = ENABLED_DITA_FOR_CONSTRAINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConstraintValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
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
			case CDAPackage.CONSTRAINT_VALIDATION__BASE_CONSTRAINT:
				if (resolve) {
					return getBase_Constraint();
				}
				return basicGetBase_Constraint();
			case CDAPackage.CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS:
				return isEnabledDitaForConstraints();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.CONSTRAINT_VALIDATION__BASE_CONSTRAINT:
				return base_Constraint != null;
			case CDAPackage.CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS:
				return enabledDitaForConstraints != ENABLED_DITA_FOR_CONSTRAINTS_EDEFAULT;
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
		result.append(" (enabledDitaForConstraints: ");
		result.append(enabledDitaForConstraints);
		result.append(')');
		return result.toString();
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
			case CDAPackage.CONSTRAINT_VALIDATION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint) newValue);
				return;
			case CDAPackage.CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS:
				setEnabledDitaForConstraints((Boolean) newValue);
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
		return CDAPackage.Literals.CONSTRAINT_VALIDATION;
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
			case CDAPackage.CONSTRAINT_VALIDATION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint) null);
				return;
			case CDAPackage.CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS:
				setEnabledDitaForConstraints(ENABLED_DITA_FOR_CONSTRAINTS_EDEFAULT);
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
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject) base_Constraint;
			base_Constraint = (Constraint) eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.CONSTRAINT_VALIDATION__BASE_CONSTRAINT,
						oldBase_Constraint, base_Constraint));
				}
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONSTRAINT_VALIDATION__BASE_CONSTRAINT, oldBase_Constraint,
				base_Constraint));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isEnabledDitaForConstraints() {
		return enabledDitaForConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnabledDitaForConstraints(boolean newEnabledDitaForConstraints) {
		boolean oldEnabledDitaForConstraints = enabledDitaForConstraints;
		enabledDitaForConstraints = newEnabledDitaForConstraints;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONSTRAINT_VALIDATION__ENABLED_DITA_FOR_CONSTRAINTS,
				oldEnabledDitaForConstraints, enabledDitaForConstraints));
		}
	}

} // ConstraintValidationImpl
