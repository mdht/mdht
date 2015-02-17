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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.TestBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestBaseImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestBaseImpl#getDataVariation <em>Data Variation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestBaseImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TestBaseImpl extends EObjectImpl implements TestBase {
	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage objective;

	/**
	 * The cached value of the '{@link #getDataVariation() <em>Data Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataVariation()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage dataVariation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sequence = SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.TEST_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjective(ComplexMarkupWithLanguage newObjective, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_BASE__OBJECTIVE, oldObjective, newObjective);
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
	public void setObjective(ComplexMarkupWithLanguage newObjective) {
		if (newObjective != objective) {
			NotificationChain msgs = null;
			if (objective != null) {
				msgs = ((InternalEObject) objective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_BASE__OBJECTIVE, null, msgs);
			}
			if (newObjective != null) {
				msgs = ((InternalEObject) newObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_BASE__OBJECTIVE, null, msgs);
			}
			msgs = basicSetObjective(newObjective, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_BASE__OBJECTIVE, newObjective, newObjective));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getDataVariation() {
		return dataVariation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataVariation(ComplexMarkupWithLanguage newDataVariation, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldDataVariation = dataVariation;
		dataVariation = newDataVariation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_BASE__DATA_VARIATION, oldDataVariation, newDataVariation);
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
	public void setDataVariation(ComplexMarkupWithLanguage newDataVariation) {
		if (newDataVariation != dataVariation) {
			NotificationChain msgs = null;
			if (dataVariation != null) {
				msgs = ((InternalEObject) dataVariation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_BASE__DATA_VARIATION, null, msgs);
			}
			if (newDataVariation != null) {
				msgs = ((InternalEObject) newDataVariation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_BASE__DATA_VARIATION, null, msgs);
			}
			msgs = basicSetDataVariation(newDataVariation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_BASE__DATA_VARIATION, newDataVariation, newDataVariation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.TEST_BASE__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(BigInteger newSequence) {
		BigInteger oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_BASE__SEQUENCE, oldSequence, sequence));
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
			case Mif2Package.TEST_BASE__OBJECTIVE:
				return basicSetObjective(null, msgs);
			case Mif2Package.TEST_BASE__DATA_VARIATION:
				return basicSetDataVariation(null, msgs);
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
			case Mif2Package.TEST_BASE__OBJECTIVE:
				return getObjective();
			case Mif2Package.TEST_BASE__DATA_VARIATION:
				return getDataVariation();
			case Mif2Package.TEST_BASE__NAME:
				return getName();
			case Mif2Package.TEST_BASE__SEQUENCE:
				return getSequence();
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
			case Mif2Package.TEST_BASE__OBJECTIVE:
				setObjective((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.TEST_BASE__DATA_VARIATION:
				setDataVariation((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.TEST_BASE__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.TEST_BASE__SEQUENCE:
				setSequence((BigInteger) newValue);
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
			case Mif2Package.TEST_BASE__OBJECTIVE:
				setObjective((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.TEST_BASE__DATA_VARIATION:
				setDataVariation((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.TEST_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.TEST_BASE__SEQUENCE:
				setSequence(SEQUENCE_EDEFAULT);
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
			case Mif2Package.TEST_BASE__OBJECTIVE:
				return objective != null;
			case Mif2Package.TEST_BASE__DATA_VARIATION:
				return dataVariation != null;
			case Mif2Package.TEST_BASE__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.TEST_BASE__SEQUENCE:
				return SEQUENCE_EDEFAULT == null
						? sequence != null
						: !SEQUENCE_EDEFAULT.equals(sequence);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", sequence: ");
		result.append(sequence);
		result.append(')');
		return result.toString();
	}

} // TestBaseImpl
