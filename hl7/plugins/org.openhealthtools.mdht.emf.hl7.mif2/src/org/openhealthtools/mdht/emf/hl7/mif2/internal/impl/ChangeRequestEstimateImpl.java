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
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ChangeRequestEstimate;
import org.openhealthtools.mdht.emf.hl7.mif2.EffortQuantifierKind;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.w3c.xhtml.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Request Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestEstimateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestEstimateImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestEstimateImpl#getCostCurrency <em>Cost Currency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestEstimateImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestEstimateImpl#getEffortQuantifier <em>Effort Quantifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ChangeRequestEstimateImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeRequestEstimateImpl extends EObjectImpl implements ChangeRequestEstimate {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Flow description;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostCurrency() <em>Cost Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_CURRENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostCurrency() <em>Cost Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostCurrency()
	 * @generated
	 * @ordered
	 */
	protected String costCurrency = COST_CURRENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EFFORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal effort = EFFORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffortQuantifier() <em>Effort Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final EffortQuantifierKind EFFORT_QUANTIFIER_EDEFAULT = EffortQuantifierKind.PERSON_HOUR;

	/**
	 * The cached value of the '{@link #getEffortQuantifier() <em>Effort Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortQuantifier()
	 * @generated
	 * @ordered
	 */
	protected EffortQuantifierKind effortQuantifier = EFFORT_QUANTIFIER_EDEFAULT;

	/**
	 * This is true if the Effort Quantifier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effortQuantifierESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeRequestEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CHANGE_REQUEST_ESTIMATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Flow newDescription, NotificationChain msgs) {
		Flow oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION, oldDescription,
				newDescription);
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
	public void setDescription(Flow newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null) {
				msgs = ((InternalEObject) description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION, null, msgs);
			}
			if (newDescription != null) {
				msgs = ((InternalEObject) newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION, null, msgs);
			}
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION, newDescription,
				newDescription));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(BigInteger newCost) {
		BigInteger oldCost = cost;
		cost = newCost;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CHANGE_REQUEST_ESTIMATE__COST, oldCost, cost));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCostCurrency() {
		return costCurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostCurrency(String newCostCurrency) {
		String oldCostCurrency = costCurrency;
		costCurrency = newCostCurrency;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CHANGE_REQUEST_ESTIMATE__COST_CURRENCY, oldCostCurrency,
				costCurrency));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getEffort() {
		return effort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffort(BigDecimal newEffort) {
		BigDecimal oldEffort = effort;
		effort = newEffort;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT, oldEffort, effort));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffortQuantifierKind getEffortQuantifier() {
		return effortQuantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffortQuantifier(EffortQuantifierKind newEffortQuantifier) {
		EffortQuantifierKind oldEffortQuantifier = effortQuantifier;
		effortQuantifier = newEffortQuantifier == null
				? EFFORT_QUANTIFIER_EDEFAULT
				: newEffortQuantifier;
		boolean oldEffortQuantifierESet = effortQuantifierESet;
		effortQuantifierESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT_QUANTIFIER, oldEffortQuantifier,
				effortQuantifier, !oldEffortQuantifierESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffortQuantifier() {
		EffortQuantifierKind oldEffortQuantifier = effortQuantifier;
		boolean oldEffortQuantifierESet = effortQuantifierESet;
		effortQuantifier = EFFORT_QUANTIFIER_EDEFAULT;
		effortQuantifierESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT_QUANTIFIER, oldEffortQuantifier,
				EFFORT_QUANTIFIER_EDEFAULT, oldEffortQuantifierESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffortQuantifier() {
		return effortQuantifierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CHANGE_REQUEST_ESTIMATE__TYPE, oldType, type));
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
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION:
				return getDescription();
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST:
				return getCost();
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST_CURRENCY:
				return getCostCurrency();
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT:
				return getEffort();
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT_QUANTIFIER:
				return getEffortQuantifier();
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__TYPE:
				return getType();
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
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION:
				setDescription((Flow) newValue);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST:
				setCost((BigInteger) newValue);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST_CURRENCY:
				setCostCurrency((String) newValue);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT:
				setEffort((BigDecimal) newValue);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT_QUANTIFIER:
				setEffortQuantifier((EffortQuantifierKind) newValue);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__TYPE:
				setType((String) newValue);
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
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION:
				setDescription((Flow) null);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST:
				setCost(COST_EDEFAULT);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST_CURRENCY:
				setCostCurrency(COST_CURRENCY_EDEFAULT);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT:
				setEffort(EFFORT_EDEFAULT);
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT_QUANTIFIER:
				unsetEffortQuantifier();
				return;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__DESCRIPTION:
				return description != null;
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST:
				return COST_EDEFAULT == null
						? cost != null
						: !COST_EDEFAULT.equals(cost);
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__COST_CURRENCY:
				return COST_CURRENCY_EDEFAULT == null
						? costCurrency != null
						: !COST_CURRENCY_EDEFAULT.equals(costCurrency);
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT:
				return EFFORT_EDEFAULT == null
						? effort != null
						: !EFFORT_EDEFAULT.equals(effort);
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__EFFORT_QUANTIFIER:
				return isSetEffortQuantifier();
			case Mif2Package.CHANGE_REQUEST_ESTIMATE__TYPE:
				return TYPE_EDEFAULT == null
						? type != null
						: !TYPE_EDEFAULT.equals(type);
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", costCurrency: ");
		result.append(costCurrency);
		result.append(", effort: ");
		result.append(effort);
		result.append(", effortQuantifier: ");
		if (effortQuantifierESet) {
			result.append(effortQuantifier);
		} else {
			result.append("<unset>");
		}
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // ChangeRequestEstimateImpl
