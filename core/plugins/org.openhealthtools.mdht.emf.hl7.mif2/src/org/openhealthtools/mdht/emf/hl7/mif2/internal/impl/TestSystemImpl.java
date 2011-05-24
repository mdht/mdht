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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openhealthtools.mdht.emf.hl7.mif2.ComplexMarkupWithLanguage;
import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef;
import org.openhealthtools.mdht.emf.hl7.mif2.TestSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestSystemImpl#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestSystemImpl#getExpectedPostConditions <em>Expected Post Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestSystemImpl#getTestedApplicationRole <em>Tested Application Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestSystemImpl#getTestedProfile <em>Tested Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.TestSystemImpl#isUnderTest <em>Under Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSystemImpl extends EObjectImpl implements TestSystem {
	/**
	 * The cached value of the '{@link #getPreConditions() <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreConditions()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage preConditions;

	/**
	 * The cached value of the '{@link #getExpectedPostConditions() <em>Expected Post Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedPostConditions()
	 * @generated
	 * @ordered
	 */
	protected ComplexMarkupWithLanguage expectedPostConditions;

	/**
	 * The cached value of the '{@link #getTestedApplicationRole() <em>Tested Application Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestedApplicationRole()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageOrArtifactRef> testedApplicationRole;

	/**
	 * The cached value of the '{@link #getTestedProfile() <em>Tested Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestedProfile()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageOrArtifactRef> testedProfile;

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
	 * The default value of the '{@link #isUnderTest() <em>Under Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderTest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDER_TEST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderTest() <em>Under Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderTest()
	 * @generated
	 * @ordered
	 */
	protected boolean underTest = UNDER_TEST_EDEFAULT;

	/**
	 * This is true if the Under Test attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean underTestESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.TEST_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getPreConditions() {
		return preConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreConditions(ComplexMarkupWithLanguage newPreConditions, NotificationChain msgs) {
		ComplexMarkupWithLanguage oldPreConditions = preConditions;
		preConditions = newPreConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_SYSTEM__PRE_CONDITIONS, oldPreConditions, newPreConditions);
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
	public void setPreConditions(ComplexMarkupWithLanguage newPreConditions) {
		if (newPreConditions != preConditions) {
			NotificationChain msgs = null;
			if (preConditions != null) {
				msgs = ((InternalEObject) preConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_SYSTEM__PRE_CONDITIONS, null, msgs);
			}
			if (newPreConditions != null) {
				msgs = ((InternalEObject) newPreConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_SYSTEM__PRE_CONDITIONS, null, msgs);
			}
			msgs = basicSetPreConditions(newPreConditions, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_SYSTEM__PRE_CONDITIONS, newPreConditions, newPreConditions));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexMarkupWithLanguage getExpectedPostConditions() {
		return expectedPostConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedPostConditions(ComplexMarkupWithLanguage newExpectedPostConditions,
			NotificationChain msgs) {
		ComplexMarkupWithLanguage oldExpectedPostConditions = expectedPostConditions;
		expectedPostConditions = newExpectedPostConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS, oldExpectedPostConditions,
				newExpectedPostConditions);
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
	public void setExpectedPostConditions(ComplexMarkupWithLanguage newExpectedPostConditions) {
		if (newExpectedPostConditions != expectedPostConditions) {
			NotificationChain msgs = null;
			if (expectedPostConditions != null) {
				msgs = ((InternalEObject) expectedPostConditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS, null, msgs);
			}
			if (newExpectedPostConditions != null) {
				msgs = ((InternalEObject) newExpectedPostConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS, null, msgs);
			}
			msgs = basicSetExpectedPostConditions(newExpectedPostConditions, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS, newExpectedPostConditions,
				newExpectedPostConditions));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageOrArtifactRef> getTestedApplicationRole() {
		if (testedApplicationRole == null) {
			testedApplicationRole = new EObjectContainmentEList<PackageOrArtifactRef>(
				PackageOrArtifactRef.class, this, Mif2Package.TEST_SYSTEM__TESTED_APPLICATION_ROLE);
		}
		return testedApplicationRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageOrArtifactRef> getTestedProfile() {
		if (testedProfile == null) {
			testedProfile = new EObjectContainmentEList<PackageOrArtifactRef>(
				PackageOrArtifactRef.class, this, Mif2Package.TEST_SYSTEM__TESTED_PROFILE);
		}
		return testedProfile;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mif2Package.TEST_SYSTEM__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderTest() {
		return underTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderTest(boolean newUnderTest) {
		boolean oldUnderTest = underTest;
		underTest = newUnderTest;
		boolean oldUnderTestESet = underTestESet;
		underTestESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.TEST_SYSTEM__UNDER_TEST, oldUnderTest, underTest, !oldUnderTestESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnderTest() {
		boolean oldUnderTest = underTest;
		boolean oldUnderTestESet = underTestESet;
		underTest = UNDER_TEST_EDEFAULT;
		underTestESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, Mif2Package.TEST_SYSTEM__UNDER_TEST, oldUnderTest, UNDER_TEST_EDEFAULT,
				oldUnderTestESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnderTest() {
		return underTestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.TEST_SYSTEM__PRE_CONDITIONS:
				return basicSetPreConditions(null, msgs);
			case Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS:
				return basicSetExpectedPostConditions(null, msgs);
			case Mif2Package.TEST_SYSTEM__TESTED_APPLICATION_ROLE:
				return ((InternalEList<?>) getTestedApplicationRole()).basicRemove(otherEnd, msgs);
			case Mif2Package.TEST_SYSTEM__TESTED_PROFILE:
				return ((InternalEList<?>) getTestedProfile()).basicRemove(otherEnd, msgs);
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
			case Mif2Package.TEST_SYSTEM__PRE_CONDITIONS:
				return getPreConditions();
			case Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS:
				return getExpectedPostConditions();
			case Mif2Package.TEST_SYSTEM__TESTED_APPLICATION_ROLE:
				return getTestedApplicationRole();
			case Mif2Package.TEST_SYSTEM__TESTED_PROFILE:
				return getTestedProfile();
			case Mif2Package.TEST_SYSTEM__NAME:
				return getName();
			case Mif2Package.TEST_SYSTEM__UNDER_TEST:
				return isUnderTest()
						? Boolean.TRUE
						: Boolean.FALSE;
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
			case Mif2Package.TEST_SYSTEM__PRE_CONDITIONS:
				setPreConditions((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS:
				setExpectedPostConditions((ComplexMarkupWithLanguage) newValue);
				return;
			case Mif2Package.TEST_SYSTEM__TESTED_APPLICATION_ROLE:
				getTestedApplicationRole().clear();
				getTestedApplicationRole().addAll((Collection<? extends PackageOrArtifactRef>) newValue);
				return;
			case Mif2Package.TEST_SYSTEM__TESTED_PROFILE:
				getTestedProfile().clear();
				getTestedProfile().addAll((Collection<? extends PackageOrArtifactRef>) newValue);
				return;
			case Mif2Package.TEST_SYSTEM__NAME:
				setName((String) newValue);
				return;
			case Mif2Package.TEST_SYSTEM__UNDER_TEST:
				setUnderTest(((Boolean) newValue).booleanValue());
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
			case Mif2Package.TEST_SYSTEM__PRE_CONDITIONS:
				setPreConditions((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS:
				setExpectedPostConditions((ComplexMarkupWithLanguage) null);
				return;
			case Mif2Package.TEST_SYSTEM__TESTED_APPLICATION_ROLE:
				getTestedApplicationRole().clear();
				return;
			case Mif2Package.TEST_SYSTEM__TESTED_PROFILE:
				getTestedProfile().clear();
				return;
			case Mif2Package.TEST_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Mif2Package.TEST_SYSTEM__UNDER_TEST:
				unsetUnderTest();
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
			case Mif2Package.TEST_SYSTEM__PRE_CONDITIONS:
				return preConditions != null;
			case Mif2Package.TEST_SYSTEM__EXPECTED_POST_CONDITIONS:
				return expectedPostConditions != null;
			case Mif2Package.TEST_SYSTEM__TESTED_APPLICATION_ROLE:
				return testedApplicationRole != null && !testedApplicationRole.isEmpty();
			case Mif2Package.TEST_SYSTEM__TESTED_PROFILE:
				return testedProfile != null && !testedProfile.isEmpty();
			case Mif2Package.TEST_SYSTEM__NAME:
				return NAME_EDEFAULT == null
						? name != null
						: !NAME_EDEFAULT.equals(name);
			case Mif2Package.TEST_SYSTEM__UNDER_TEST:
				return isSetUnderTest();
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
		result.append(", underTest: ");
		if (underTestESet) {
			result.append(underTest);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // TestSystemImpl
