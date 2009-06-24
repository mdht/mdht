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
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.ENOperations;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENImpl#getMixed <em>Mixed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ENImpl extends ANYImpl implements EN {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityNameUse> use;

	/**
	 * The cached value of the '{@link #getValidTime() <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTime()
	 * @generated
	 * @ordered
	 */
	protected IVL_TS validTime;

	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.EN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityNameUse> getUse() {
		if (use == null) {
			use = new EDataTypeUniqueEList<EntityNameUse>(EntityNameUse.class, this, DatatypesPackage.EN__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_TS getValidTime() {
		return validTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTime(IVL_TS newValidTime, NotificationChain msgs) {
		IVL_TS oldValidTime = validTime;
		validTime = newValidTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.EN__VALID_TIME, oldValidTime, newValidTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidTime(IVL_TS newValidTime) {
		if (newValidTime != validTime) {
			NotificationChain msgs = null;
			if (validTime != null)
				msgs = ((InternalEObject)validTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.EN__VALID_TIME, null, msgs);
			if (newValidTime != null)
				msgs = ((InternalEObject)newValidTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.EN__VALID_TIME, null, msgs);
			msgs = basicSetValidTime(newValidTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.EN__VALID_TIME, newValidTime, newValidTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENXP> getDelimiter() {
		return getPart().list(DatatypesPackage.Literals.EN__DELIMITER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENXP> getFamily() {
		return getPart().list(DatatypesPackage.Literals.EN__FAMILY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENXP> getGiven() {
		return getPart().list(DatatypesPackage.Literals.EN__GIVEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENXP> getPrefix() {
		return getPart().list(DatatypesPackage.Literals.EN__PREFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENXP> getSuffix() {
		return getPart().list(DatatypesPackage.Literals.EN__SUFFIX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPart() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(DatatypesPackage.Literals.EN__PART);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DatatypesPackage.EN__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean delimiter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ENOperations.delimiter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean family(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ENOperations.family(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean given(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ENOperations.given(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean prefix(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ENOperations.prefix(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean suffix(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ENOperations.suffix(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN addDelimiter(String delimiter) {
		return ENOperations.addDelimiter(this, delimiter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN addFamily(String family) {
		return ENOperations.addFamily(this, family);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN addGiven(String given) {
		return ENOperations.addGiven(this, given);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN addPrefix(String prefix) {
		return ENOperations.addPrefix(this, prefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN addSuffix(String suffix) {
		return ENOperations.addSuffix(this, suffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EN addText(String text) {
		return ENOperations.addText(this, text);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return ENOperations.getText(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.EN__VALID_TIME:
				return basicSetValidTime(null, msgs);
			case DatatypesPackage.EN__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case DatatypesPackage.EN__USE:
				return getUse();
			case DatatypesPackage.EN__VALID_TIME:
				return getValidTime();
			case DatatypesPackage.EN__DELIMITER:
				return getDelimiter();
			case DatatypesPackage.EN__FAMILY:
				return getFamily();
			case DatatypesPackage.EN__GIVEN:
				return getGiven();
			case DatatypesPackage.EN__PREFIX:
				return getPrefix();
			case DatatypesPackage.EN__SUFFIX:
				return getSuffix();
			case DatatypesPackage.EN__PART:
				if (coreType) return getPart();
				return ((FeatureMap.Internal)getPart()).getWrapper();
			case DatatypesPackage.EN__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
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
			case DatatypesPackage.EN__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends EntityNameUse>)newValue);
				return;
			case DatatypesPackage.EN__VALID_TIME:
				setValidTime((IVL_TS)newValue);
				return;
			case DatatypesPackage.EN__DELIMITER:
				getDelimiter().clear();
				getDelimiter().addAll((Collection<? extends ENXP>)newValue);
				return;
			case DatatypesPackage.EN__FAMILY:
				getFamily().clear();
				getFamily().addAll((Collection<? extends ENXP>)newValue);
				return;
			case DatatypesPackage.EN__GIVEN:
				getGiven().clear();
				getGiven().addAll((Collection<? extends ENXP>)newValue);
				return;
			case DatatypesPackage.EN__PREFIX:
				getPrefix().clear();
				getPrefix().addAll((Collection<? extends ENXP>)newValue);
				return;
			case DatatypesPackage.EN__SUFFIX:
				getSuffix().clear();
				getSuffix().addAll((Collection<? extends ENXP>)newValue);
				return;
			case DatatypesPackage.EN__PART:
				((FeatureMap.Internal)getPart()).set(newValue);
				return;
			case DatatypesPackage.EN__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
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
			case DatatypesPackage.EN__USE:
				getUse().clear();
				return;
			case DatatypesPackage.EN__VALID_TIME:
				setValidTime((IVL_TS)null);
				return;
			case DatatypesPackage.EN__DELIMITER:
				getDelimiter().clear();
				return;
			case DatatypesPackage.EN__FAMILY:
				getFamily().clear();
				return;
			case DatatypesPackage.EN__GIVEN:
				getGiven().clear();
				return;
			case DatatypesPackage.EN__PREFIX:
				getPrefix().clear();
				return;
			case DatatypesPackage.EN__SUFFIX:
				getSuffix().clear();
				return;
			case DatatypesPackage.EN__PART:
				getPart().clear();
				return;
			case DatatypesPackage.EN__MIXED:
				getMixed().clear();
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
			case DatatypesPackage.EN__USE:
				return use != null && !use.isEmpty();
			case DatatypesPackage.EN__VALID_TIME:
				return validTime != null;
			case DatatypesPackage.EN__DELIMITER:
				return !getDelimiter().isEmpty();
			case DatatypesPackage.EN__FAMILY:
				return !getFamily().isEmpty();
			case DatatypesPackage.EN__GIVEN:
				return !getGiven().isEmpty();
			case DatatypesPackage.EN__PREFIX:
				return !getPrefix().isEmpty();
			case DatatypesPackage.EN__SUFFIX:
				return !getSuffix().isEmpty();
			case DatatypesPackage.EN__PART:
				return !getPart().isEmpty();
			case DatatypesPackage.EN__MIXED:
				return mixed != null && !mixed.isEmpty();
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
		result.append(use);
		result.append(", mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //ENImpl
