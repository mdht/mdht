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

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndWithClassRef;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association End With Class Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.AssociationEndWithClassRefImpl#getParticipantClassName <em>Participant Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationEndWithClassRefImpl extends AssociationEndBaseImpl implements AssociationEndWithClassRef {
	/**
	 * The default value of the '{@link #getParticipantClassName() <em>Participant Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTICIPANT_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParticipantClassName() <em>Participant Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantClassName()
	 * @generated
	 * @ordered
	 */
	protected String participantClassName = PARTICIPANT_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationEndWithClassRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.ASSOCIATION_END_WITH_CLASS_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParticipantClassName() {
		return participantClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipantClassName(String newParticipantClassName) {
		String oldParticipantClassName = participantClassName;
		participantClassName = newParticipantClassName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.ASSOCIATION_END_WITH_CLASS_REF__PARTICIPANT_CLASS_NAME,
				oldParticipantClassName, participantClassName));
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS_REF__PARTICIPANT_CLASS_NAME:
				return getParticipantClassName();
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS_REF__PARTICIPANT_CLASS_NAME:
				setParticipantClassName((String) newValue);
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS_REF__PARTICIPANT_CLASS_NAME:
				setParticipantClassName(PARTICIPANT_CLASS_NAME_EDEFAULT);
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
			case Mif2Package.ASSOCIATION_END_WITH_CLASS_REF__PARTICIPANT_CLASS_NAME:
				return PARTICIPANT_CLASS_NAME_EDEFAULT == null
						? participantClassName != null
						: !PARTICIPANT_CLASS_NAME_EDEFAULT.equals(participantClassName);
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
		result.append(" (participantClassName: ");
		result.append(participantClassName);
		result.append(')');
		return result.toString();
	}

} // AssociationEndWithClassRefImpl
