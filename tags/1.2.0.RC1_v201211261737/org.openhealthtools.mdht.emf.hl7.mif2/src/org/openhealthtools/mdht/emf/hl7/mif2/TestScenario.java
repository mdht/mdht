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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a sequence of tests intended to verify a particular set of behavior
 * UML: Does not directly correspond to UML.  It would be a complex tag, except that it's a stand-alone artifact . . .
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestScenario#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestScenario#getTestSystem <em>Test System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestScenario#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestScenario()
 * @model extendedMetaData="name='TestScenario' kind='elementOnly'"
 * @generated
 */
public interface TestScenario extends PackageArtifact {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes what the test scenario is intended to check.
	 * UML: Part of a complex tag
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference.
	 * @see #setObjective(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestScenario_Objective()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='objective' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getObjective();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestScenario#getObjective <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' containment reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Test System</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.TestSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates one of the systems involved in the test scenario.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test System</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestScenario_TestSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='testSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TestSystem> getTestSystem();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the tests to be performed
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestScenario_Test()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='test' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Test> getTest();

} // TestScenario
