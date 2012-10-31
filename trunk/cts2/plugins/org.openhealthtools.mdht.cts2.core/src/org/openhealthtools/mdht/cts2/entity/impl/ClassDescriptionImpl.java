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
package org.openhealthtools.mdht.cts2.entity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.entity.ClassDescription;
import org.openhealthtools.mdht.cts2.entity.ClassDescriptionState;
import org.openhealthtools.mdht.cts2.entity.ClassDescriptionType;
import org.openhealthtools.mdht.cts2.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.ClassDescriptionImpl#getDescriptionState <em>Description State</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.impl.ClassDescriptionImpl#getDescriptionType <em>Description Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ClassDescriptionImpl extends NamedEntityDescriptionImpl implements ClassDescription {
	/**
	 * The default value of the '{@link #getDescriptionState() <em>Description State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescriptionState()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDescriptionState DESCRIPTION_STATE_EDEFAULT = ClassDescriptionState.PRIMITIVE;

	/**
	 * The cached value of the '{@link #getDescriptionState() <em>Description State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescriptionState()
	 * @generated
	 * @ordered
	 */
	protected ClassDescriptionState descriptionState = DESCRIPTION_STATE_EDEFAULT;

	/**
	 * This is true if the Description State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionStateESet;

	/**
	 * The default value of the '{@link #getDescriptionType() <em>Description Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescriptionType()
	 * @generated
	 * @ordered
	 */
	protected static final ClassDescriptionType DESCRIPTION_TYPE_EDEFAULT = ClassDescriptionType.A;

	/**
	 * The cached value of the '{@link #getDescriptionType() <em>Description Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDescriptionType()
	 * @generated
	 * @ordered
	 */
	protected ClassDescriptionType descriptionType = DESCRIPTION_TYPE_EDEFAULT;

	/**
	 * This is true if the Description Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassDescriptionImpl() {
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
		return EntityPackage.Literals.CLASS_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassDescriptionState getDescriptionState() {
		return descriptionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescriptionState(ClassDescriptionState newDescriptionState) {
		ClassDescriptionState oldDescriptionState = descriptionState;
		descriptionState = newDescriptionState == null
				? DESCRIPTION_STATE_EDEFAULT
				: newDescriptionState;
		boolean oldDescriptionStateESet = descriptionStateESet;
		descriptionStateESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_STATE, oldDescriptionState,
				descriptionState, !oldDescriptionStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDescriptionState() {
		ClassDescriptionState oldDescriptionState = descriptionState;
		boolean oldDescriptionStateESet = descriptionStateESet;
		descriptionState = DESCRIPTION_STATE_EDEFAULT;
		descriptionStateESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_STATE, oldDescriptionState,
				DESCRIPTION_STATE_EDEFAULT, oldDescriptionStateESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDescriptionState() {
		return descriptionStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ClassDescriptionType getDescriptionType() {
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescriptionType(ClassDescriptionType newDescriptionType) {
		ClassDescriptionType oldDescriptionType = descriptionType;
		descriptionType = newDescriptionType == null
				? DESCRIPTION_TYPE_EDEFAULT
				: newDescriptionType;
		boolean oldDescriptionTypeESet = descriptionTypeESet;
		descriptionTypeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_TYPE, oldDescriptionType,
				descriptionType, !oldDescriptionTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetDescriptionType() {
		ClassDescriptionType oldDescriptionType = descriptionType;
		boolean oldDescriptionTypeESet = descriptionTypeESet;
		descriptionType = DESCRIPTION_TYPE_EDEFAULT;
		descriptionTypeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_TYPE, oldDescriptionType,
				DESCRIPTION_TYPE_EDEFAULT, oldDescriptionTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetDescriptionType() {
		return descriptionTypeESet;
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
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_STATE:
				return getDescriptionState();
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_TYPE:
				return getDescriptionType();
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
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_STATE:
				setDescriptionState((ClassDescriptionState) newValue);
				return;
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_TYPE:
				setDescriptionType((ClassDescriptionType) newValue);
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
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_STATE:
				unsetDescriptionState();
				return;
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_TYPE:
				unsetDescriptionType();
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
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_STATE:
				return isSetDescriptionState();
			case EntityPackage.CLASS_DESCRIPTION__DESCRIPTION_TYPE:
				return isSetDescriptionType();
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
		result.append(" (descriptionState: ");
		if (descriptionStateESet) {
			result.append(descriptionState);
		} else {
			result.append("<unset>");
		}
		result.append(", descriptionType: ");
		if (descriptionTypeESet) {
			result.append(descriptionType);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // ClassDescriptionImpl
