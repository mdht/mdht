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

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.DurationUnitsKind;
import org.openhealthtools.mdht.emf.hl7.mif2.ImplementationMessageConstraints;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Message Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationMessageConstraintsImpl#getSupportedTransport <em>Supported Transport</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationMessageConstraintsImpl#getTimingBackground <em>Timing Background</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationMessageConstraintsImpl#getExpectedResponseTime <em>Expected Response Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationMessageConstraintsImpl#getRetryTime <em>Retry Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ImplementationMessageConstraintsImpl#getMaximumRetryCount <em>Maximum Retry Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationMessageConstraintsImpl extends ImplementationConstraintsImpl implements
		ImplementationMessageConstraints {
	/**
	 * The cached value of the '{@link #getSupportedTransport() <em>Supported Transport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedTransport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRef> supportedTransport;

	/**
	 * The cached value of the '{@link #getTimingBackground() <em>Timing Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingBackground()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage timingBackground;

	/**
	 * The default value of the '{@link #getExpectedResponseTime() <em>Expected Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final DurationUnitsKind EXPECTED_RESPONSE_TIME_EDEFAULT = DurationUnitsKind.MS;

	/**
	 * The cached value of the '{@link #getExpectedResponseTime() <em>Expected Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResponseTime()
	 * @generated
	 * @ordered
	 */
	protected DurationUnitsKind expectedResponseTime = EXPECTED_RESPONSE_TIME_EDEFAULT;

	/**
	 * This is true if the Expected Response Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expectedResponseTimeESet;

	/**
	 * The default value of the '{@link #getRetryTime() <em>Retry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTime()
	 * @generated
	 * @ordered
	 */
	protected static final DurationUnitsKind RETRY_TIME_EDEFAULT = DurationUnitsKind.MS;

	/**
	 * The cached value of the '{@link #getRetryTime() <em>Retry Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetryTime()
	 * @generated
	 * @ordered
	 */
	protected DurationUnitsKind retryTime = RETRY_TIME_EDEFAULT;

	/**
	 * This is true if the Retry Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retryTimeESet;

	/**
	 * The default value of the '{@link #getMaximumRetryCount() <em>Maximum Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRetryCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_RETRY_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRetryCount() <em>Maximum Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRetryCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumRetryCount = MAXIMUM_RETRY_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationMessageConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.IMPLEMENTATION_MESSAGE_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRef> getSupportedTransport() {
		if (supportedTransport == null) {
			supportedTransport = new EObjectContainmentEList<PackageRef>(
				PackageRef.class, this, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__SUPPORTED_TRANSPORT);
		}
		return supportedTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getTimingBackground() {
		return timingBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingBackground(ComplexMarkupWithLanguage newTimingBackground,
			NotificationChain msgs) {
		ComplexMarkupWithLanguage oldTimingBackground = timingBackground;
		timingBackground = newTimingBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND,
				oldTimingBackground, newTimingBackground);
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
	 * @generated
	 */
	public void setTimingBackground(ComplexMarkupWithLanguage newTimingBackground) {
		if (newTimingBackground != timingBackground) {
			NotificationChain msgs = null;
			if (timingBackground != null) {
				msgs = ((InternalEObject) timingBackground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND, null, msgs);
			}
			if (newTimingBackground != null) {
				msgs = ((InternalEObject) newTimingBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND, null, msgs);
			}
			msgs = basicSetTimingBackground(newTimingBackground, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND,
				newTimingBackground, newTimingBackground));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnitsKind getExpectedResponseTime() {
		return expectedResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedResponseTime(DurationUnitsKind newExpectedResponseTime) {
		DurationUnitsKind oldExpectedResponseTime = expectedResponseTime;
		expectedResponseTime = newExpectedResponseTime == null
				? EXPECTED_RESPONSE_TIME_EDEFAULT
				: newExpectedResponseTime;
		boolean oldExpectedResponseTimeESet = expectedResponseTimeESet;
		expectedResponseTimeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__EXPECTED_RESPONSE_TIME,
				oldExpectedResponseTime, expectedResponseTime, !oldExpectedResponseTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpectedResponseTime() {
		DurationUnitsKind oldExpectedResponseTime = expectedResponseTime;
		boolean oldExpectedResponseTimeESet = expectedResponseTimeESet;
		expectedResponseTime = EXPECTED_RESPONSE_TIME_EDEFAULT;
		expectedResponseTimeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__EXPECTED_RESPONSE_TIME,
				oldExpectedResponseTime, EXPECTED_RESPONSE_TIME_EDEFAULT, oldExpectedResponseTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpectedResponseTime() {
		return expectedResponseTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnitsKind getRetryTime() {
		return retryTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryTime(DurationUnitsKind newRetryTime) {
		DurationUnitsKind oldRetryTime = retryTime;
		retryTime = newRetryTime == null
				? RETRY_TIME_EDEFAULT
				: newRetryTime;
		boolean oldRetryTimeESet = retryTimeESet;
		retryTimeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__RETRY_TIME, oldRetryTime,
				retryTime, !oldRetryTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRetryTime() {
		DurationUnitsKind oldRetryTime = retryTime;
		boolean oldRetryTimeESet = retryTimeESet;
		retryTime = RETRY_TIME_EDEFAULT;
		retryTimeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__RETRY_TIME, oldRetryTime,
				RETRY_TIME_EDEFAULT, oldRetryTimeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRetryTime() {
		return retryTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumRetryCount() {
		return maximumRetryCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRetryCount(BigInteger newMaximumRetryCount) {
		BigInteger oldMaximumRetryCount = maximumRetryCount;
		maximumRetryCount = newMaximumRetryCount;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__MAXIMUM_RETRY_COUNT,
				oldMaximumRetryCount, maximumRetryCount));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__SUPPORTED_TRANSPORT:
				return ((InternalEList<?>) getSupportedTransport()).basicRemove(otherEnd, msgs);
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND:
				return basicSetTimingBackground(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__SUPPORTED_TRANSPORT:
				return getSupportedTransport();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND:
				return getTimingBackground();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__EXPECTED_RESPONSE_TIME:
				return getExpectedResponseTime();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__RETRY_TIME:
				return getRetryTime();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__MAXIMUM_RETRY_COUNT:
				return getMaximumRetryCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__SUPPORTED_TRANSPORT:
				getSupportedTransport().clear();
				getSupportedTransport().addAll((Collection<? extends PackageRef>) newValue);
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND:
				setTimingBackground((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__EXPECTED_RESPONSE_TIME:
				setExpectedResponseTime((DurationUnitsKind) newValue);
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__RETRY_TIME:
				setRetryTime((DurationUnitsKind) newValue);
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__MAXIMUM_RETRY_COUNT:
				setMaximumRetryCount((BigInteger) newValue);
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
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__SUPPORTED_TRANSPORT:
				getSupportedTransport().clear();
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND:
				setTimingBackground((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__EXPECTED_RESPONSE_TIME:
				unsetExpectedResponseTime();
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__RETRY_TIME:
				unsetRetryTime();
				return;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__MAXIMUM_RETRY_COUNT:
				setMaximumRetryCount(MAXIMUM_RETRY_COUNT_EDEFAULT);
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
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__SUPPORTED_TRANSPORT:
				return supportedTransport != null && !supportedTransport.isEmpty();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__TIMING_BACKGROUND:
				return timingBackground != null;
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__EXPECTED_RESPONSE_TIME:
				return isSetExpectedResponseTime();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__RETRY_TIME:
				return isSetRetryTime();
			case Mif2Package.IMPLEMENTATION_MESSAGE_CONSTRAINTS__MAXIMUM_RETRY_COUNT:
				return MAXIMUM_RETRY_COUNT_EDEFAULT == null
						? maximumRetryCount != null
						: !MAXIMUM_RETRY_COUNT_EDEFAULT.equals(maximumRetryCount);
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
		result.append(" (expectedResponseTime: ");
		if (expectedResponseTimeESet) {
			result.append(expectedResponseTime);
		} else {
			result.append("<unset>");
		}
		result.append(", retryTime: ");
		if (retryTimeESet) {
			result.append(retryTime);
		} else {
			result.append("<unset>");
		}
		result.append(", maximumRetryCount: ");
		result.append(maximumRetryCount);
		result.append(')');
		return result.toString();
	}

} // ImplementationMessageConstraintsImpl
