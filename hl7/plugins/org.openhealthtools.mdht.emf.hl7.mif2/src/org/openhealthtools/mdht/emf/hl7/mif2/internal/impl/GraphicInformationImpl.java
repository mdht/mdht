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

import org.openhealthtools.mdht.emf.hl7.mif2.GraphicInformation;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.GraphicInformationImpl#getSemanticLinkId <em>Semantic Link Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GraphicInformationImpl extends EObjectImpl implements GraphicInformation {
	/**
	 * The default value of the '{@link #getSemanticLinkId() <em>Semantic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticLinkId() <em>Semantic Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticLinkId()
	 * @generated
	 * @ordered
	 */
	protected String semanticLinkId = SEMANTIC_LINK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.GRAPHIC_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemanticLinkId() {
		return semanticLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemanticLinkId(String newSemanticLinkId) {
		String oldSemanticLinkId = semanticLinkId;
		semanticLinkId = newSemanticLinkId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.GRAPHIC_INFORMATION__SEMANTIC_LINK_ID, oldSemanticLinkId,
				semanticLinkId));
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
			case Mif2Package.GRAPHIC_INFORMATION__SEMANTIC_LINK_ID:
				return getSemanticLinkId();
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
			case Mif2Package.GRAPHIC_INFORMATION__SEMANTIC_LINK_ID:
				setSemanticLinkId((String) newValue);
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
			case Mif2Package.GRAPHIC_INFORMATION__SEMANTIC_LINK_ID:
				setSemanticLinkId(SEMANTIC_LINK_ID_EDEFAULT);
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
			case Mif2Package.GRAPHIC_INFORMATION__SEMANTIC_LINK_ID:
				return SEMANTIC_LINK_ID_EDEFAULT == null
						? semanticLinkId != null
						: !SEMANTIC_LINK_ID_EDEFAULT.equals(semanticLinkId);
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
		result.append(" (semanticLinkId: ");
		result.append(semanticLinkId);
		result.append(')');
		return result.toString();
	}

} // GraphicInformationImpl
