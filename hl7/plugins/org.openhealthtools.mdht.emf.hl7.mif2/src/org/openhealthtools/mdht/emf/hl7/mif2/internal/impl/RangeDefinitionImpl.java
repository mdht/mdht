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

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.RangeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RangeDefinitionImpl#isHighClosed <em>High Closed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RangeDefinitionImpl#getHighValue <em>High Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RangeDefinitionImpl#isLowClosed <em>Low Closed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.RangeDefinitionImpl#getLowValue <em>Low Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeDefinitionImpl extends EObjectImpl implements RangeDefinition {
	/**
	 * The default value of the '{@link #isHighClosed() <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIGH_CLOSED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHighClosed() <em>High Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHighClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean highClosed = HIGH_CLOSED_EDEFAULT;

	/**
	 * This is true if the High Closed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean highClosedESet;

	/**
	 * The default value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal HIGH_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighValue() <em>High Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHighValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal highValue = HIGH_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLowClosed() <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOW_CLOSED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLowClosed() <em>Low Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLowClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean lowClosed = LOW_CLOSED_EDEFAULT;

	/**
	 * This is true if the Low Closed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowClosedESet;

	/**
	 * The default value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LOW_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowValue() <em>Low Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lowValue = LOW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.RANGE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHighClosed() {
		return highClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighClosed(boolean newHighClosed) {
		boolean oldHighClosed = highClosed;
		highClosed = newHighClosed;
		boolean oldHighClosedESet = highClosedESet;
		highClosedESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RANGE_DEFINITION__HIGH_CLOSED, oldHighClosed, highClosed,
				!oldHighClosedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHighClosed() {
		boolean oldHighClosed = highClosed;
		boolean oldHighClosedESet = highClosedESet;
		highClosed = HIGH_CLOSED_EDEFAULT;
		highClosedESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.RANGE_DEFINITION__HIGH_CLOSED, oldHighClosed,
				HIGH_CLOSED_EDEFAULT, oldHighClosedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHighClosed() {
		return highClosedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getHighValue() {
		return highValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHighValue(BigDecimal newHighValue) {
		BigDecimal oldHighValue = highValue;
		highValue = newHighValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RANGE_DEFINITION__HIGH_VALUE, oldHighValue, highValue));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLowClosed() {
		return lowClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowClosed(boolean newLowClosed) {
		boolean oldLowClosed = lowClosed;
		lowClosed = newLowClosed;
		boolean oldLowClosedESet = lowClosedESet;
		lowClosedESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RANGE_DEFINITION__LOW_CLOSED, oldLowClosed, lowClosed,
				!oldLowClosedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowClosed() {
		boolean oldLowClosed = lowClosed;
		boolean oldLowClosedESet = lowClosedESet;
		lowClosed = LOW_CLOSED_EDEFAULT;
		lowClosedESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.RANGE_DEFINITION__LOW_CLOSED, oldLowClosed, LOW_CLOSED_EDEFAULT,
				oldLowClosedESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowClosed() {
		return lowClosedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getLowValue() {
		return lowValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowValue(BigDecimal newLowValue) {
		BigDecimal oldLowValue = lowValue;
		lowValue = newLowValue;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.RANGE_DEFINITION__LOW_VALUE, oldLowValue, lowValue));
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
			case Mif2Package.RANGE_DEFINITION__HIGH_CLOSED:
				return isHighClosed()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.RANGE_DEFINITION__HIGH_VALUE:
				return getHighValue();
			case Mif2Package.RANGE_DEFINITION__LOW_CLOSED:
				return isLowClosed()
						? Boolean.TRUE
						: Boolean.FALSE;
			case Mif2Package.RANGE_DEFINITION__LOW_VALUE:
				return getLowValue();
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
			case Mif2Package.RANGE_DEFINITION__HIGH_CLOSED:
				setHighClosed(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.RANGE_DEFINITION__HIGH_VALUE:
				setHighValue((BigDecimal) newValue);
				return;
			case Mif2Package.RANGE_DEFINITION__LOW_CLOSED:
				setLowClosed(((Boolean) newValue).booleanValue());
				return;
			case Mif2Package.RANGE_DEFINITION__LOW_VALUE:
				setLowValue((BigDecimal) newValue);
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
			case Mif2Package.RANGE_DEFINITION__HIGH_CLOSED:
				unsetHighClosed();
				return;
			case Mif2Package.RANGE_DEFINITION__HIGH_VALUE:
				setHighValue(HIGH_VALUE_EDEFAULT);
				return;
			case Mif2Package.RANGE_DEFINITION__LOW_CLOSED:
				unsetLowClosed();
				return;
			case Mif2Package.RANGE_DEFINITION__LOW_VALUE:
				setLowValue(LOW_VALUE_EDEFAULT);
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
			case Mif2Package.RANGE_DEFINITION__HIGH_CLOSED:
				return isSetHighClosed();
			case Mif2Package.RANGE_DEFINITION__HIGH_VALUE:
				return HIGH_VALUE_EDEFAULT == null
						? highValue != null
						: !HIGH_VALUE_EDEFAULT.equals(highValue);
			case Mif2Package.RANGE_DEFINITION__LOW_CLOSED:
				return isSetLowClosed();
			case Mif2Package.RANGE_DEFINITION__LOW_VALUE:
				return LOW_VALUE_EDEFAULT == null
						? lowValue != null
						: !LOW_VALUE_EDEFAULT.equals(lowValue);
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
		result.append(" (highClosed: ");
		if (highClosedESet) {
			result.append(highClosed);
		} else {
			result.append("<unset>");
		}
		result.append(", highValue: ");
		result.append(highValue);
		result.append(", lowClosed: ");
		if (lowClosedESet) {
			result.append(lowClosed);
		} else {
			result.append("<unset>");
		}
		result.append(", lowValue: ");
		result.append(lowValue);
		result.append(')');
		return result.toString();
	}

} // RangeDefinitionImpl
