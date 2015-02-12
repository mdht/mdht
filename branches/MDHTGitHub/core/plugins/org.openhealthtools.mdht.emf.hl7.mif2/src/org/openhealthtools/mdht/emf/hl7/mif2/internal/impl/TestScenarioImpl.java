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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.Test;
import org.openhealthtools.mdht.emf.hl7.mif2.TestScenario;
import org.openhealthtools.mdht.emf.hl7.mif2.TestSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestScenarioImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestScenarioImpl#getTestSystem <em>Test System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestScenarioImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestScenarioImpl extends PackageArtifactImpl implements TestScenario {
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
	 * The cached value of the '{@link #getTestSystem() <em>Test System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<TestSystem> testSystem;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.TEST_SCENARIO;
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
				this, Notification.SET, Mif2Package.TEST_SCENARIO__OBJECTIVE, oldObjective, newObjective);
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
						Mif2Package.TEST_SCENARIO__OBJECTIVE, null, msgs);
			}
			if (newObjective != null) {
				msgs = ((InternalEObject) newObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_SCENARIO__OBJECTIVE, null, msgs);
			}
			msgs = basicSetObjective(newObjective, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_SCENARIO__OBJECTIVE, newObjective, newObjective));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestSystem> getTestSystem() {
		if (testSystem == null) {
			testSystem = new EObjectContainmentEList<TestSystem>(
				TestSystem.class, this, Mif2Package.TEST_SCENARIO__TEST_SYSTEM);
		}
		return testSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getTest() {
		if (test == null) {
			test = new EObjectContainmentEList<Test>(Test.class, this, Mif2Package.TEST_SCENARIO__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.TEST_SCENARIO__OBJECTIVE:
				return basicSetObjective(null, msgs);
			case Mif2Package.TEST_SCENARIO__TEST_SYSTEM:
				return ((InternalEList<?>) getTestSystem()).basicRemove(otherEnd, msgs);
			case Mif2Package.TEST_SCENARIO__TEST:
				return ((InternalEList<?>) getTest()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.TEST_SCENARIO__OBJECTIVE:
				return getObjective();
			case Mif2Package.TEST_SCENARIO__TEST_SYSTEM:
				return getTestSystem();
			case Mif2Package.TEST_SCENARIO__TEST:
				return getTest();
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
			case Mif2Package.TEST_SCENARIO__OBJECTIVE:
				setObjective((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.TEST_SCENARIO__TEST_SYSTEM:
				getTestSystem().clear();
				getTestSystem().addAll((Collection<? extends TestSystem>) newValue);
				return;
			case Mif2Package.TEST_SCENARIO__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends Test>) newValue);
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
			case Mif2Package.TEST_SCENARIO__OBJECTIVE:
				setObjective((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.TEST_SCENARIO__TEST_SYSTEM:
				getTestSystem().clear();
				return;
			case Mif2Package.TEST_SCENARIO__TEST:
				getTest().clear();
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
			case Mif2Package.TEST_SCENARIO__OBJECTIVE:
				return objective != null;
			case Mif2Package.TEST_SCENARIO__TEST_SYSTEM:
				return testSystem != null && !testSystem.isEmpty();
			case Mif2Package.TEST_SCENARIO__TEST:
				return test != null && !test.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TestScenarioImpl
