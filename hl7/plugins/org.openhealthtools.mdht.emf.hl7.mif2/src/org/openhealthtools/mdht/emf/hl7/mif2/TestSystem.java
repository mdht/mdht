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
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getPreConditions <em>Pre Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getExpectedPostConditions <em>Expected Post Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getTestedApplicationRole <em>Tested Application Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getTestedProfile <em>Tested Profile</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#isUnderTest <em>Under Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestSystem()
 * @model extendedMetaData="name='TestSystem' kind='elementOnly'"
 * @generated
 */
public interface TestSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the state the system must be in prior executing the test cases.  May include database setup, configuration, etc.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #setPreConditions(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestSystem_PreConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='preConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getPreConditions();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getPreConditions <em>Pre Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Conditions</em>' containment reference.
	 * @see #getPreConditions()
	 * @generated
	 */
	void setPreConditions(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Expected Post Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the state the system should be in after executing the test cases.  E.g. End state of the database, etc.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Post Conditions</em>' containment reference.
	 * @see #setExpectedPostConditions(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestSystem_ExpectedPostConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expectedPostConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getExpectedPostConditions();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getExpectedPostConditions <em>Expected Post Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Post Conditions</em>' containment reference.
	 * @see #getExpectedPostConditions()
	 * @generated
	 */
	void setExpectedPostConditions(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Tested Application Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the application roles implemented by the system which is participating in the test.
	 * UML: Base interface(s) implemented by the ClassifierRole
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tested Application Role</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestSystem_TestedApplicationRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='testedApplicationRole' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageOrArtifactRef> getTestedApplicationRole();

	/**
	 * Returns the value of the '<em><b>Tested Profile</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.PackageOrArtifactRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the conformance profiles implemented by the system which is participating in the test.
	 * UML: Base interface(s) implemented by the ClassifierRole
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tested Profile</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestSystem_TestedProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='testedProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PackageOrArtifactRef> getTestedProfile();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the system for the purposes of this set of test cases
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestSystem_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Under Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true indicates that the system is intended to be tested by the this scenario, otherwise it is a system intended to assist in the testing.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Under Test</em>' attribute.
	 * @see #isSetUnderTest()
	 * @see #unsetUnderTest()
	 * @see #setUnderTest(boolean)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestSystem_UnderTest()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='underTest'"
	 * @generated
	 */
	boolean isUnderTest();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#isUnderTest <em>Under Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Under Test</em>' attribute.
	 * @see #isSetUnderTest()
	 * @see #unsetUnderTest()
	 * @see #isUnderTest()
	 * @generated
	 */
	void setUnderTest(boolean value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#isUnderTest <em>Under Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnderTest()
	 * @see #isUnderTest()
	 * @see #setUnderTest(boolean)
	 * @generated
	 */
	void unsetUnderTest();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem#isUnderTest <em>Under Test</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Under Test</em>' attribute is set.
	 * @see #unsetUnderTest()
	 * @see #isUnderTest()
	 * @see #setUnderTest(boolean)
	 * @generated
	 */
	boolean isSetUnderTest();

} // TestSystem
