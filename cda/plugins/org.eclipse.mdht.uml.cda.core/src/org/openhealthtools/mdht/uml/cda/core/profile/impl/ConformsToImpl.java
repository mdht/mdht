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
import org.eclipse.uml2.uml.Generalization;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.ConformsTo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conforms To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConformsToImpl#getBase_Generalization <em>Base Generalization</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.ConformsToImpl#isRequiresParentId <em>Requires Parent Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConformsToImpl extends ValidationImpl implements ConformsTo {
	/**
	 * The cached value of the '{@link #getBase_Generalization() <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getBase_Generalization()
	 * @generated
	 * @ordered
	 */
	protected Generalization base_Generalization;

	/**
	 * The default value of the '{@link #isRequiresParentId() <em>Requires Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRequiresParentId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_PARENT_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresParentId() <em>Requires Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isRequiresParentId()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresParentId = REQUIRES_PARENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConformsToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Generalization basicGetBase_Generalization() {
		return base_Generalization;
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
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				if (resolve) {
					return getBase_Generalization();
				}
				return basicGetBase_Generalization();
			case CDAPackage.CONFORMS_TO__REQUIRES_PARENT_ID:
				return isRequiresParentId();
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
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				return base_Generalization != null;
			case CDAPackage.CONFORMS_TO__REQUIRES_PARENT_ID:
				return requiresParentId != REQUIRES_PARENT_ID_EDEFAULT;
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
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				setBase_Generalization((Generalization) newValue);
				return;
			case CDAPackage.CONFORMS_TO__REQUIRES_PARENT_ID:
				setRequiresParentId((Boolean) newValue);
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
		return CDAPackage.Literals.CONFORMS_TO;
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
			case CDAPackage.CONFORMS_TO__BASE_GENERALIZATION:
				setBase_Generalization((Generalization) null);
				return;
			case CDAPackage.CONFORMS_TO__REQUIRES_PARENT_ID:
				setRequiresParentId(REQUIRES_PARENT_ID_EDEFAULT);
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
	public Generalization getBase_Generalization() {
		if (base_Generalization != null && base_Generalization.eIsProxy()) {
			InternalEObject oldBase_Generalization = (InternalEObject) base_Generalization;
			base_Generalization = (Generalization) eResolveProxy(oldBase_Generalization);
			if (base_Generalization != oldBase_Generalization) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(
						this, Notification.RESOLVE, CDAPackage.CONFORMS_TO__BASE_GENERALIZATION,
						oldBase_Generalization, base_Generalization));
				}
			}
		}
		return base_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isRequiresParentId() {
		return requiresParentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBase_Generalization(Generalization newBase_Generalization) {
		Generalization oldBase_Generalization = base_Generalization;
		base_Generalization = newBase_Generalization;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONFORMS_TO__BASE_GENERALIZATION, oldBase_Generalization,
				base_Generalization));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRequiresParentId(boolean newRequiresParentId) {
		boolean oldRequiresParentId = requiresParentId;
		requiresParentId = newRequiresParentId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CONFORMS_TO__REQUIRES_PARENT_ID, oldRequiresParentId,
				requiresParentId));
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
		result.append(" (requiresParentId: ");
		result.append(requiresParentId);
		result.append(')');
		return result.toString();
	}

} // ConformsToImpl
