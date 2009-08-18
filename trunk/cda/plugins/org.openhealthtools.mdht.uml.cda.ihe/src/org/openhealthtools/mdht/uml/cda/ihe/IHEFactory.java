/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage
 * @generated
 */
public interface IHEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IHEFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.ihe.impl.IHEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concern Entry</em>'.
	 * @generated
	 */
	ConcernEntry createConcernEntry();

	/**
	 * Returns a new object of class '<em>Medical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medical Document</em>'.
	 * @generated
	 */
	MedicalDocument createMedicalDocument();

	/**
	 * Returns a new object of class '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Problems Section</em>'.
	 * @generated
	 */
	ActiveProblemsSection createActiveProblemsSection();

	/**
	 * Returns a new object of class '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Concern Entry</em>'.
	 * @generated
	 */
	ProblemConcernEntry createProblemConcernEntry();

	/**
	 * Returns a new object of class '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Entry</em>'.
	 * @generated
	 */
	ProblemEntry createProblemEntry();

	/**
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	Medication createMedication();

	/**
	 * Returns a new object of class '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medications Section</em>'.
	 * @generated
	 */
	MedicationsSection createMedicationsSection();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance Concern</em>'.
	 * @generated
	 */
	AllergyIntoleranceConcern createAllergyIntoleranceConcern();

	/**
	 * Returns a new object of class '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergy Intolerance</em>'.
	 * @generated
	 */
	AllergyIntolerance createAllergyIntolerance();

	/**
	 * Returns a new object of class '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allergies Reactions Section</em>'.
	 * @generated
	 */
	AllergiesReactionsSection createAllergiesReactionsSection();

	/**
	 * Returns a new object of class '<em>Normal Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Dosing</em>'.
	 * @generated
	 */
	NormalDosing createNormalDosing();

	/**
	 * Returns a new object of class '<em>Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tapered Dose</em>'.
	 * @generated
	 */
	TaperedDose createTaperedDose();

	/**
	 * Returns a new object of class '<em>Split Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Dosing</em>'.
	 * @generated
	 */
	SplitDosing createSplitDosing();

	/**
	 * Returns a new object of class '<em>Conditional Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Dosing</em>'.
	 * @generated
	 */
	ConditionalDosing createConditionalDosing();

	/**
	 * Returns a new object of class '<em>Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combination Medication</em>'.
	 * @generated
	 */
	CombinationMedication createCombinationMedication();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IHEPackage getIHEPackage();

} //IHEFactory
