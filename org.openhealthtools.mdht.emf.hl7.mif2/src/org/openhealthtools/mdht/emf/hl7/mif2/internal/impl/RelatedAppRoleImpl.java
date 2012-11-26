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

import org.openhealthtools.mdht.emf.hl7.mif2.ApplicationRoleRelationshipKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RelatedAppRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related App Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RelatedAppRoleImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedAppRoleImpl extends PackageRefImpl implements RelatedAppRole {
	/**
	 * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationRoleRelationshipKind RELATIONSHIP_TYPE_EDEFAULT = ApplicationRoleRelationshipKind.AT_LEAST_ONE;

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationRoleRelationshipKind relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * This is true if the Relationship Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedAppRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.RELATED_APP_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRoleRelationshipKind getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(ApplicationRoleRelationshipKind newRelationshipType) {
		ApplicationRoleRelationshipKind oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType == null
				? RELATIONSHIP_TYPE_EDEFAULT
				: newRelationshipType;
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipTypeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RELATED_APP_ROLE__RELATIONSHIP_TYPE, oldRelationshipType,
				relationshipType, !oldRelationshipTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipType() {
		ApplicationRoleRelationshipKind oldRelationshipType = relationshipType;
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipType = RELATIONSHIP_TYPE_EDEFAULT;
		relationshipTypeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.RELATED_APP_ROLE__RELATIONSHIP_TYPE, oldRelationshipType,
				RELATIONSHIP_TYPE_EDEFAULT, oldRelationshipTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipType() {
		return relationshipTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.RELATED_APP_ROLE__RELATIONSHIP_TYPE:
				return getRelationshipType();
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
			case Mif2Package.RELATED_APP_ROLE__RELATIONSHIP_TYPE:
				setRelationshipType((ApplicationRoleRelationshipKind) newValue);
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
			case Mif2Package.RELATED_APP_ROLE__RELATIONSHIP_TYPE:
				unsetRelationshipType();
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
			case Mif2Package.RELATED_APP_ROLE__RELATIONSHIP_TYPE:
				return isSetRelationshipType();
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
		result.append(" (relationshipType: ");
		if (relationshipTypeESet) {
			result.append(relationshipType);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // RelatedAppRoleImpl
