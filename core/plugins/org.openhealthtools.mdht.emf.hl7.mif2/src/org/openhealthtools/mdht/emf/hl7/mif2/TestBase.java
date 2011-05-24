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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common information gathered for all test cases
 * UML: Part of a complex tag value
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getDataVariation <em>Data Variation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getName <em>Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestBase()
 * @model abstract="true"
 *        extendedMetaData="name='TestBase' kind='elementOnly'"
 * @generated
 */
public interface TestBase extends EObject {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what the specific intent of this particular step in the test-case is.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference.
	 * @see #setObjective(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestBase_Objective()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='objective' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getObjective();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getObjective <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' containment reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Data Variation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes specific data elements whose contents is expected to vary each time the test is run.  I.e. Data which must be specifically modified when sending or which should be expected to vary at run-time.  (Some of this may be handled by comments in the example instance.)
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Variation</em>' containment reference.
	 * @see #setDataVariation(ComplexMarkupWithLanguage)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestBase_DataVariation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataVariation' namespace='##targetNamespace'"
	 * @generated
	 */
	ComplexMarkupWithLanguage getDataVariation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getDataVariation <em>Data Variation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Variation</em>' containment reference.
	 * @see #getDataVariation()
	 * @generated
	 */
	void setDataVariation(ComplexMarkupWithLanguage value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A short descriptive name for the individual test, unique within the scenario.  (Allows referencing.)
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestBase_Name()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.ShortDescriptiveName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the relative timing with which the test should be performed.  If two sequence numbers are equal, then the relative order does not matter.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' attribute.
	 * @see #setSequence(BigInteger)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getTestBase_Sequence()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.SmallPositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='sequence'"
	 * @generated
	 */
	BigInteger getSequence();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.TestBase#getSequence <em>Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' attribute.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(BigInteger value);

} // TestBase
