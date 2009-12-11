/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TELImpl#getUseablePeriods <em>Useable Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.TELImpl#getUses <em>Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TELImpl extends URLImpl implements TEL {
	/**
	 * The cached value of the '{@link #getUseablePeriods() <em>Useable Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseablePeriods()
	 * @generated
	 * @ordered
	 */
	protected EList<SXCM_TS> useablePeriods;

	/**
	 * The cached value of the '{@link #getUses() <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<TelecommunicationAddressUse> uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TELImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.TEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SXCM_TS> getUseablePeriods() {
		if (useablePeriods == null) {
			useablePeriods = new EObjectContainmentEList<SXCM_TS>(SXCM_TS.class, this, DatatypesPackage.TEL__USEABLE_PERIOD);
		}
		return useablePeriods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TelecommunicationAddressUse> getUses() {
		if (uses == null) {
			uses = new EDataTypeUniqueEList.Unsettable<TelecommunicationAddressUse>(TelecommunicationAddressUse.class, this, DatatypesPackage.TEL__USE);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUses() {
		if (uses != null) ((InternalEList.Unsettable<?>)uses).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUses() {
		return uses != null && ((InternalEList.Unsettable<?>)uses).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.TEL__USEABLE_PERIOD:
				return ((InternalEList<?>)getUseablePeriods()).basicRemove(otherEnd, msgs);
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
			case DatatypesPackage.TEL__USEABLE_PERIOD:
				return getUseablePeriods();
			case DatatypesPackage.TEL__USE:
				return getUses();
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
			case DatatypesPackage.TEL__USEABLE_PERIOD:
				getUseablePeriods().clear();
				getUseablePeriods().addAll((Collection<? extends SXCM_TS>)newValue);
				return;
			case DatatypesPackage.TEL__USE:
				getUses().clear();
				getUses().addAll((Collection<? extends TelecommunicationAddressUse>)newValue);
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
			case DatatypesPackage.TEL__USEABLE_PERIOD:
				getUseablePeriods().clear();
				return;
			case DatatypesPackage.TEL__USE:
				unsetUses();
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
			case DatatypesPackage.TEL__USEABLE_PERIOD:
				return useablePeriods != null && !useablePeriods.isEmpty();
			case DatatypesPackage.TEL__USE:
				return isSetUses();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (use: ");
		result.append(uses);
		result.append(')');
		return result.toString();
	}

} //TELImpl
