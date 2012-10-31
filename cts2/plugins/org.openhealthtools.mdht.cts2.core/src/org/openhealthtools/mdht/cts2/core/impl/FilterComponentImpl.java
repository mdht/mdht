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
package org.openhealthtools.mdht.cts2.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.FilterComponent;
import org.openhealthtools.mdht.cts2.core.MatchAlgorithmReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.FilterComponentImpl#getMatchAlgorithm <em>Match Algorithm</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.FilterComponentImpl#getMatchValue <em>Match Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class FilterComponentImpl extends PropertyReferenceImpl implements FilterComponent {
	/**
	 * The cached value of the '{@link #getMatchAlgorithm() <em>Match Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMatchAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected MatchAlgorithmReference matchAlgorithm;

	/**
	 * The default value of the '{@link #getMatchValue() <em>Match Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMatchValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCH_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchValue() <em>Match Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMatchValue()
	 * @generated
	 * @ordered
	 */
	protected String matchValue = MATCH_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FilterComponentImpl() {
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
		return CorePackage.Literals.FILTER_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MatchAlgorithmReference getMatchAlgorithm() {
		return matchAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetMatchAlgorithm(MatchAlgorithmReference newMatchAlgorithm, NotificationChain msgs) {
		MatchAlgorithmReference oldMatchAlgorithm = matchAlgorithm;
		matchAlgorithm = newMatchAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM, oldMatchAlgorithm,
				newMatchAlgorithm);
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
	public void setMatchAlgorithm(MatchAlgorithmReference newMatchAlgorithm) {
		if (newMatchAlgorithm != matchAlgorithm) {
			NotificationChain msgs = null;
			if (matchAlgorithm != null) {
				msgs = ((InternalEObject) matchAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM, null, msgs);
			}
			if (newMatchAlgorithm != null) {
				msgs = ((InternalEObject) newMatchAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM, null, msgs);
			}
			msgs = basicSetMatchAlgorithm(newMatchAlgorithm, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM, newMatchAlgorithm,
				newMatchAlgorithm));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMatchValue() {
		return matchValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMatchValue(String newMatchValue) {
		String oldMatchValue = matchValue;
		matchValue = newMatchValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.FILTER_COMPONENT__MATCH_VALUE, oldMatchValue, matchValue));
		}
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
			case CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM:
				return basicSetMatchAlgorithm(null, msgs);
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
			case CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM:
				return getMatchAlgorithm();
			case CorePackage.FILTER_COMPONENT__MATCH_VALUE:
				return getMatchValue();
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
			case CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM:
				setMatchAlgorithm((MatchAlgorithmReference) newValue);
				return;
			case CorePackage.FILTER_COMPONENT__MATCH_VALUE:
				setMatchValue((String) newValue);
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
			case CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM:
				setMatchAlgorithm((MatchAlgorithmReference) null);
				return;
			case CorePackage.FILTER_COMPONENT__MATCH_VALUE:
				setMatchValue(MATCH_VALUE_EDEFAULT);
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
			case CorePackage.FILTER_COMPONENT__MATCH_ALGORITHM:
				return matchAlgorithm != null;
			case CorePackage.FILTER_COMPONENT__MATCH_VALUE:
				return MATCH_VALUE_EDEFAULT == null
						? matchValue != null
						: !MATCH_VALUE_EDEFAULT.equals(matchValue);
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
		result.append(" (matchValue: ");
		result.append(matchValue);
		result.append(')');
		return result.toString();
	}

} // FilterComponentImpl
