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
package org.openhealthtools.mdht.cts2.valuesetdefinition.impl;

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
import org.openhealthtools.mdht.cts2.core.EntitySynopsis;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSet;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ResolvedValueSetHeader;
import org.openhealthtools.mdht.cts2.valuesetdefinition.ValueSetDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolved Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetImpl#getResolutionInfo <em>Resolution Info</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.valuesetdefinition.impl.ResolvedValueSetImpl#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ResolvedValueSetImpl extends EObjectImpl implements ResolvedValueSet {
	/**
	 * The cached value of the '{@link #getResolutionInfo() <em>Resolution Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getResolutionInfo()
	 * @generated
	 * @ordered
	 */
	protected ResolvedValueSetHeader resolutionInfo;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<EntitySynopsis> member;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ResolvedValueSetImpl() {
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
		return ValueSetDefinitionPackage.Literals.RESOLVED_VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResolvedValueSetHeader getResolutionInfo() {
		return resolutionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetResolutionInfo(ResolvedValueSetHeader newResolutionInfo, NotificationChain msgs) {
		ResolvedValueSetHeader oldResolutionInfo = resolutionInfo;
		resolutionInfo = newResolutionInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO,
				oldResolutionInfo, newResolutionInfo);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResolutionInfo(ResolvedValueSetHeader newResolutionInfo) {
		if (newResolutionInfo != resolutionInfo) {
			NotificationChain msgs = null;
			if (resolutionInfo != null) {
				msgs = ((InternalEObject) resolutionInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO, null, msgs);
			}
			if (newResolutionInfo != null) {
				msgs = ((InternalEObject) newResolutionInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO, null, msgs);
			}
			msgs = basicSetResolutionInfo(newResolutionInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO,
				newResolutionInfo, newResolutionInfo));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EntitySynopsis> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<EntitySynopsis>(
				EntitySynopsis.class, this, ValueSetDefinitionPackage.RESOLVED_VALUE_SET__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO:
				return basicSetResolutionInfo(null, msgs);
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__MEMBER:
				return ((InternalEList<?>) getMember()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO:
				return getResolutionInfo();
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__MEMBER:
				return getMember();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO:
				setResolutionInfo((ResolvedValueSetHeader) newValue);
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends EntitySynopsis>) newValue);
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO:
				setResolutionInfo((ResolvedValueSetHeader) null);
				return;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__MEMBER:
				getMember().clear();
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
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__RESOLUTION_INFO:
				return resolutionInfo != null;
			case ValueSetDefinitionPackage.RESOLVED_VALUE_SET__MEMBER:
				return member != null && !member.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ResolvedValueSetImpl
