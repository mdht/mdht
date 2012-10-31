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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openhealthtools.mdht.cts2.core.CorePackage;
import org.openhealthtools.mdht.cts2.core.PropertyReference;
import org.openhealthtools.mdht.cts2.core.SortCriterion;
import org.openhealthtools.mdht.cts2.core.SortDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SortCriterionImpl#getSortElement <em>Sort Element</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SortCriterionImpl#getEntryOrder <em>Entry Order</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.impl.SortCriterionImpl#getSortDirection <em>Sort Direction</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SortCriterionImpl extends EObjectImpl implements SortCriterion {
	/**
	 * The cached value of the '{@link #getSortElement() <em>Sort Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSortElement()
	 * @generated
	 * @ordered
	 */
	protected PropertyReference sortElement;

	/**
	 * The default value of the '{@link #getEntryOrder() <em>Entry Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ENTRY_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryOrder() <em>Entry Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntryOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger entryOrder = ENTRY_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortDirection() <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSortDirection()
	 * @generated
	 * @ordered
	 */
	protected static final SortDirection SORT_DIRECTION_EDEFAULT = SortDirection.ASCENDING;

	/**
	 * The cached value of the '{@link #getSortDirection() <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSortDirection()
	 * @generated
	 * @ordered
	 */
	protected SortDirection sortDirection = SORT_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Sort Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean sortDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SortCriterionImpl() {
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
		return CorePackage.Literals.SORT_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PropertyReference getSortElement() {
		return sortElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSortElement(PropertyReference newSortElement, NotificationChain msgs) {
		PropertyReference oldSortElement = sortElement;
		sortElement = newSortElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CorePackage.SORT_CRITERION__SORT_ELEMENT, oldSortElement, newSortElement);
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
	public void setSortElement(PropertyReference newSortElement) {
		if (newSortElement != sortElement) {
			NotificationChain msgs = null;
			if (sortElement != null) {
				msgs = ((InternalEObject) sortElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.SORT_CRITERION__SORT_ELEMENT, null, msgs);
			}
			if (newSortElement != null) {
				msgs = ((InternalEObject) newSortElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CorePackage.SORT_CRITERION__SORT_ELEMENT, null, msgs);
			}
			msgs = basicSetSortElement(newSortElement, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.SORT_CRITERION__SORT_ELEMENT, newSortElement, newSortElement));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BigInteger getEntryOrder() {
		return entryOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntryOrder(BigInteger newEntryOrder) {
		BigInteger oldEntryOrder = entryOrder;
		entryOrder = newEntryOrder;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.SORT_CRITERION__ENTRY_ORDER, oldEntryOrder, entryOrder));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SortDirection getSortDirection() {
		return sortDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSortDirection(SortDirection newSortDirection) {
		SortDirection oldSortDirection = sortDirection;
		sortDirection = newSortDirection == null
				? SORT_DIRECTION_EDEFAULT
				: newSortDirection;
		boolean oldSortDirectionESet = sortDirectionESet;
		sortDirectionESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CorePackage.SORT_CRITERION__SORT_DIRECTION, oldSortDirection, sortDirection,
				!oldSortDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void unsetSortDirection() {
		SortDirection oldSortDirection = sortDirection;
		boolean oldSortDirectionESet = sortDirectionESet;
		sortDirection = SORT_DIRECTION_EDEFAULT;
		sortDirectionESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CorePackage.SORT_CRITERION__SORT_DIRECTION, oldSortDirection,
				SORT_DIRECTION_EDEFAULT, oldSortDirectionESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetSortDirection() {
		return sortDirectionESet;
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
			case CorePackage.SORT_CRITERION__SORT_ELEMENT:
				return basicSetSortElement(null, msgs);
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
			case CorePackage.SORT_CRITERION__SORT_ELEMENT:
				return getSortElement();
			case CorePackage.SORT_CRITERION__ENTRY_ORDER:
				return getEntryOrder();
			case CorePackage.SORT_CRITERION__SORT_DIRECTION:
				return getSortDirection();
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
			case CorePackage.SORT_CRITERION__SORT_ELEMENT:
				setSortElement((PropertyReference) newValue);
				return;
			case CorePackage.SORT_CRITERION__ENTRY_ORDER:
				setEntryOrder((BigInteger) newValue);
				return;
			case CorePackage.SORT_CRITERION__SORT_DIRECTION:
				setSortDirection((SortDirection) newValue);
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
			case CorePackage.SORT_CRITERION__SORT_ELEMENT:
				setSortElement((PropertyReference) null);
				return;
			case CorePackage.SORT_CRITERION__ENTRY_ORDER:
				setEntryOrder(ENTRY_ORDER_EDEFAULT);
				return;
			case CorePackage.SORT_CRITERION__SORT_DIRECTION:
				unsetSortDirection();
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
			case CorePackage.SORT_CRITERION__SORT_ELEMENT:
				return sortElement != null;
			case CorePackage.SORT_CRITERION__ENTRY_ORDER:
				return ENTRY_ORDER_EDEFAULT == null
						? entryOrder != null
						: !ENTRY_ORDER_EDEFAULT.equals(entryOrder);
			case CorePackage.SORT_CRITERION__SORT_DIRECTION:
				return isSetSortDirection();
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
		result.append(" (entryOrder: ");
		result.append(entryOrder);
		result.append(", sortDirection: ");
		if (sortDirectionESet) {
			result.append(sortDirection);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // SortCriterionImpl
