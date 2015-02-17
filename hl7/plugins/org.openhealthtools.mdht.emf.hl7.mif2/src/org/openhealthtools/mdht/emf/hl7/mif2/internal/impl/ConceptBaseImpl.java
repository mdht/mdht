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

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptBase;
import org.openhealthtools.mdht.emf.hl7.mif2.HistoryItem;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptBaseImpl#getHistoryItem <em>History Item</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.ConceptBaseImpl#getEffectiveDate <em>Effective Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConceptBaseImpl extends EObjectImpl implements ConceptBase {
	/**
	 * The cached value of the '{@link #getHistoryItem() <em>History Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryItem()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoryItem> historyItem;

	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar effectiveDate = EFFECTIVE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.CONCEPT_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistoryItem> getHistoryItem() {
		if (historyItem == null) {
			historyItem = new EObjectContainmentEList<HistoryItem>(
				HistoryItem.class, this, Mif2Package.CONCEPT_BASE__HISTORY_ITEM);
		}
		return historyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDate(XMLGregorianCalendar newEffectiveDate) {
		XMLGregorianCalendar oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.CONCEPT_BASE__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
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
			case Mif2Package.CONCEPT_BASE__HISTORY_ITEM:
				return ((InternalEList<?>) getHistoryItem()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.CONCEPT_BASE__HISTORY_ITEM:
				return getHistoryItem();
			case Mif2Package.CONCEPT_BASE__EFFECTIVE_DATE:
				return getEffectiveDate();
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
			case Mif2Package.CONCEPT_BASE__HISTORY_ITEM:
				getHistoryItem().clear();
				getHistoryItem().addAll((Collection<? extends HistoryItem>) newValue);
				return;
			case Mif2Package.CONCEPT_BASE__EFFECTIVE_DATE:
				setEffectiveDate((XMLGregorianCalendar) newValue);
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
			case Mif2Package.CONCEPT_BASE__HISTORY_ITEM:
				getHistoryItem().clear();
				return;
			case Mif2Package.CONCEPT_BASE__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
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
			case Mif2Package.CONCEPT_BASE__HISTORY_ITEM:
				return historyItem != null && !historyItem.isEmpty();
			case Mif2Package.CONCEPT_BASE__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null
						? effectiveDate != null
						: !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
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
		result.append(" (effectiveDate: ");
		result.append(effectiveDate);
		result.append(')');
		return result.toString();
	}

} // ConceptBaseImpl
