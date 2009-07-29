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
package org.openhealthtools.mdht.uml.cda.ihe.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage
 * @generated
 */
public class IHEValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final IHEValidator INSTANCE = new IHEValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ihe";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Concern Entry template Id' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medical Document template Id' of 'Medical Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_DOCUMENT__MEDICAL_DOCUMENT_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Active Problems Section entry' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_ENTRY = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Active Problems Section template Id' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Active Problems Section code' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Concern Entry template Id' of 'Problem Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_TEMPLATE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Entry template Id' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medications Section template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medications Section code' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergy Intolerance Concern template Id' of 'Allergy Intolerance Concern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergy Intolerance template Id' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_TEMPLATE_ID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergies Reactions Section template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 13;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDValidator ccdValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEValidator() {
		super();
		ccdValidator = CCDValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return IHEPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case IHEPackage.CONCERN_ENTRY:
				return validateConcernEntry((ConcernEntry)value, diagnostics, context);
			case IHEPackage.MEDICAL_DOCUMENT:
				return validateMedicalDocument((MedicalDocument)value, diagnostics, context);
			case IHEPackage.ACTIVE_PROBLEMS_SECTION:
				return validateActiveProblemsSection((ActiveProblemsSection)value, diagnostics, context);
			case IHEPackage.PROBLEM_CONCERN_ENTRY:
				return validateProblemConcernEntry((ProblemConcernEntry)value, diagnostics, context);
			case IHEPackage.PROBLEM_ENTRY:
				return validateProblemEntry((ProblemEntry)value, diagnostics, context);
			case IHEPackage.MEDICATION:
				return validateMedication((Medication)value, diagnostics, context);
			case IHEPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection)value, diagnostics, context);
			case IHEPackage.ALLERGY_INTOLERANCE_CONCERN:
				return validateAllergyIntoleranceConcern((AllergyIntoleranceConcern)value, diagnostics, context);
			case IHEPackage.ALLERGY_INTOLERANCE:
				return validateAllergyIntolerance((AllergyIntolerance)value, diagnostics, context);
			case IHEPackage.ALLERGIES_REACTIONS_SECTION:
				return validateAllergiesReactionsSection((AllergiesReactionsSection)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry(ConcernEntry concernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_templateId(concernEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConcernEntry_templateId constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_ConcernEntry_templateId(ConcernEntry concernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.ConcernEntry_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDocument(MedicalDocument medicalDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicalDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicalDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicalDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicalDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicalDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicalDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicalDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalDocument_MedicalDocument_templateId(medicalDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicalDocument_templateId constraint of '<em>Medical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDocument_MedicalDocument_templateId(MedicalDocument medicalDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalDocument.MedicalDocument_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_templateId(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_ActiveProblemsSection_entry(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_ActiveProblemsSection_templateId(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_ActiveProblemsSection_code(activeProblemsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ActiveProblemsSection_entry constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_ActiveProblemsSection_entry(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.ActiveProblemsSection_entry(diagnostics, context);
	}

	/**
	 * Validates the ActiveProblemsSection_templateId constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_ActiveProblemsSection_templateId(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.ActiveProblemsSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the ActiveProblemsSection_code constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_ActiveProblemsSection_code(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.ActiveProblemsSection_code(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_templateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcernEntry_ProblemConcernEntry_templateId(problemConcernEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemConcernEntry_templateId constraint of '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry_ProblemConcernEntry_templateId(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemConcernEntry.ProblemConcernEntry_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_templateId(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_templateId(problemEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemEntry_templateId constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_ProblemEntry_templateId(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.ProblemEntry_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_templateId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_Medication_templateId(medication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Medication_templateId constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_Medication_templateId(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.Medication_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationSection_MedicationSection_templateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_MedicationsSection_templateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_MedicationsSection_code(medicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicationsSection_templateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_MedicationsSection_templateId(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.MedicationsSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the MedicationsSection_code constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_MedicationsSection_code(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.MedicationsSection_code(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceConcern(AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_templateId(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergyIntoleranceConcern_AllergyIntoleranceConcern_templateId(allergyIntoleranceConcern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllergyIntoleranceConcern_templateId constraint of '<em>Allergy Intolerance Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceConcern_AllergyIntoleranceConcern_templateId(AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntoleranceConcern.AllergyIntoleranceConcern_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_templateId(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_templateId(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergyIntolerance_AllergyIntolerance_templateId(allergyIntolerance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllergyIntolerance_templateId constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_AllergyIntolerance_templateId(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.AllergyIntolerance_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_AlertsSection_templateId(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergiesReactionsSection_AllergiesReactionsSection_templateId(allergiesReactionsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllergiesReactionsSection_templateId constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_AllergiesReactionsSection_templateId(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergiesReactionsSection.AllergiesReactionsSection_templateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //IHEValidator
