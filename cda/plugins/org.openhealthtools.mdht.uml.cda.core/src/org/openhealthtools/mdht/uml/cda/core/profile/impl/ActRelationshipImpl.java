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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.openhealthtools.mdht.uml.cda.core.profile.ActRelationship;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Act Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ActRelationshipImpl#getBase_Association <em>Base Association</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ActRelationshipImpl#getAssociationType <em>Association Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ActRelationshipImpl#getTypeCode <em>Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActRelationshipImpl extends EObjectImpl implements ActRelationship {
	/**
	 * The cached value of the '{@link #getBase_Association() <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Association()
	 * @generated
	 * @ordered
	 */
	protected Association base_Association;

	/**
	 * The cached value of the '{@link #getAssociationType() <em>Association Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getAssociationType()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class associationType;

	/**
	 * The cached value of the '{@link #getTypeCode() <em>Type Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTypeCode()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral typeCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetAssociationType() {
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Association basicGetBase_Association() {
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumerationLiteral basicGetTypeCode() {
		return typeCode;
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
			case CDAPackage.ACT_RELATIONSHIP__BASE_ASSOCIATION:
				if (resolve) {
					return getBase_Association();
				}
				return basicGetBase_Association();
			case CDAPackage.ACT_RELATIONSHIP__ASSOCIATION_TYPE:
				if (resolve) {
					return getAssociationType();
				}
				return basicGetAssociationType();
			case CDAPackage.ACT_RELATIONSHIP__TYPE_CODE:
				if (resolve) {
					return getTypeCode();
				}
				return basicGetTypeCode();
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
			case CDAPackage.ACT_RELATIONSHIP__BASE_ASSOCIATION:
				return base_Association != null;
			case CDAPackage.ACT_RELATIONSHIP__ASSOCIATION_TYPE:
				return associationType != null;
			case CDAPackage.ACT_RELATIONSHIP__TYPE_CODE:
				return typeCode != null;
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
			case CDAPackage.ACT_RELATIONSHIP__BASE_ASSOCIATION:
				setBase_Association((Association) newValue);
				return;
			case CDAPackage.ACT_RELATIONSHIP__ASSOCIATION_TYPE:
				setAssociationType((org.eclipse.uml2.uml.Class) newValue);
				return;
			case CDAPackage.ACT_RELATIONSHIP__TYPE_CODE:
				setTypeCode((EnumerationLiteral) newValue);
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
		return CDAPackage.Literals.ACT_RELATIONSHIP;
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
			case CDAPackage.ACT_RELATIONSHIP__BASE_ASSOCIATION:
				setBase_Association((Association) null);
				return;
			case CDAPackage.ACT_RELATIONSHIP__ASSOCIATION_TYPE:
				setAssociationType((org.eclipse.uml2.uml.Class) null);
				return;
			case CDAPackage.ACT_RELATIONSHIP__TYPE_CODE:
				setTypeCode((EnumerationLiteral) null);
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
	public org.eclipse.uml2.uml.Class getAssociationType() {
		if (associationType != null && associationType.eIsProxy()) {
			InternalEObject oldAssociationType = (InternalEObject) associationType;
			associationType = (org.eclipse.uml2.uml.Class) eResolveProxy(oldAssociationType);
			if (associationType != oldAssociationType) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.ACT_RELATIONSHIP__ASSOCIATION_TYPE, oldAssociationType,
						associationType));
				}
			}
		}
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Association getBase_Association() {
		if (base_Association != null && base_Association.eIsProxy()) {
			InternalEObject oldBase_Association = (InternalEObject) base_Association;
			base_Association = (Association) eResolveProxy(oldBase_Association);
			if (base_Association != oldBase_Association) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.ACT_RELATIONSHIP__BASE_ASSOCIATION, oldBase_Association,
						base_Association));
				}
			}
		}
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnumerationLiteral getTypeCode() {
		if (typeCode != null && typeCode.eIsProxy()) {
			InternalEObject oldTypeCode = (InternalEObject) typeCode;
			typeCode = (EnumerationLiteral) eResolveProxy(oldTypeCode);
			if (typeCode != oldTypeCode) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.ACT_RELATIONSHIP__TYPE_CODE, oldTypeCode, typeCode));
				}
			}
		}
		return typeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAssociationType(org.eclipse.uml2.uml.Class newAssociationType) {
		org.eclipse.uml2.uml.Class oldAssociationType = associationType;
		associationType = newAssociationType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.ACT_RELATIONSHIP__ASSOCIATION_TYPE, oldAssociationType,
				associationType));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Association(Association newBase_Association) {
		Association oldBase_Association = base_Association;
		base_Association = newBase_Association;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.ACT_RELATIONSHIP__BASE_ASSOCIATION, oldBase_Association,
				base_Association));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTypeCode(EnumerationLiteral newTypeCode) {
		EnumerationLiteral oldTypeCode = typeCode;
		typeCode = newTypeCode;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.ACT_RELATIONSHIP__TYPE_CODE, oldTypeCode, typeCode));
		}
	}

} // ActRelationshipImpl
