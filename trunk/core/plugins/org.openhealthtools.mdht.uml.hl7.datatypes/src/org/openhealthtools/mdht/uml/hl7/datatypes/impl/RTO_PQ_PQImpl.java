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

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.RTO_PQ_PQOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RTO PQ PQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_PQ_PQImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.RTO_PQ_PQImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RTO_PQ_PQImpl extends QTYImpl implements RTO_PQ_PQ {
	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected PQ numerator;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected PQ denominator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RTO_PQ_PQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.RTO_PQ_PQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumerator(PQ newNumerator, NotificationChain msgs) {
		PQ oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.RTO_PQ_PQ__NUMERATOR, oldNumerator, newNumerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumerator(PQ newNumerator) {
		if (newNumerator != numerator) {
			NotificationChain msgs = null;
			if (numerator != null)
				msgs = ((InternalEObject)numerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.RTO_PQ_PQ__NUMERATOR, null, msgs);
			if (newNumerator != null)
				msgs = ((InternalEObject)newNumerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.RTO_PQ_PQ__NUMERATOR, null, msgs);
			msgs = basicSetNumerator(newNumerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.RTO_PQ_PQ__NUMERATOR, newNumerator, newNumerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PQ getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominator(PQ newDenominator, NotificationChain msgs) {
		PQ oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypesPackage.RTO_PQ_PQ__DENOMINATOR, oldDenominator, newDenominator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominator(PQ newDenominator) {
		if (newDenominator != denominator) {
			NotificationChain msgs = null;
			if (denominator != null)
				msgs = ((InternalEObject)denominator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.RTO_PQ_PQ__DENOMINATOR, null, msgs);
			if (newDenominator != null)
				msgs = ((InternalEObject)newDenominator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypesPackage.RTO_PQ_PQ__DENOMINATOR, null, msgs);
			msgs = basicSetDenominator(newDenominator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypesPackage.RTO_PQ_PQ__DENOMINATOR, newDenominator, newDenominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDenominator(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return RTO_PQ_PQOperations.validateDenominator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypesPackage.RTO_PQ_PQ__NUMERATOR:
				return basicSetNumerator(null, msgs);
			case DatatypesPackage.RTO_PQ_PQ__DENOMINATOR:
				return basicSetDenominator(null, msgs);
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
			case DatatypesPackage.RTO_PQ_PQ__NUMERATOR:
				return getNumerator();
			case DatatypesPackage.RTO_PQ_PQ__DENOMINATOR:
				return getDenominator();
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
			case DatatypesPackage.RTO_PQ_PQ__NUMERATOR:
				setNumerator((PQ)newValue);
				return;
			case DatatypesPackage.RTO_PQ_PQ__DENOMINATOR:
				setDenominator((PQ)newValue);
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
			case DatatypesPackage.RTO_PQ_PQ__NUMERATOR:
				setNumerator((PQ)null);
				return;
			case DatatypesPackage.RTO_PQ_PQ__DENOMINATOR:
				setDenominator((PQ)null);
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
			case DatatypesPackage.RTO_PQ_PQ__NUMERATOR:
				return numerator != null;
			case DatatypesPackage.RTO_PQ_PQ__DENOMINATOR:
				return denominator != null;
		}
		return super.eIsSet(featureID);
	}

} //RTO_PQ_PQImpl
