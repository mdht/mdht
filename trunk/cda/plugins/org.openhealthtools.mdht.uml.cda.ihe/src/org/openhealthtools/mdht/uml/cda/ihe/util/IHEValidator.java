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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.ihe.*;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medications Administered Section template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Concern Entry template Id' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Concern Entry effective Time' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_EFFECTIVE_TIME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medical Document template Id' of 'Medical Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_DOCUMENT__MEDICAL_DOCUMENT_TEMPLATE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Active Problems Section template Id' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Active Problems Section code' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Active Problems Section problem Concern Entry' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Concern Entry template Id' of 'Problem Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Concern Entry problem Entry' of 'Problem Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Entry template Id' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_TEMPLATE_ID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Entry text' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_TEXT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Entry value' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_VALUE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_TEMPLATE_ID = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medications Section template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medications Section code' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_CODE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergy Intolerance Concern template Id' of 'Allergy Intolerance Concern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergy Intolerance template Id' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergies Reactions Section template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergies Reactions Section code' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_CODE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Normal Dosing template Id' of 'Normal Dosing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NORMAL_DOSING__NORMAL_DOSING_TEMPLATE_ID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tapered Dose template Id' of 'Tapered Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAPERED_DOSE__TAPERED_DOSE_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Split Dosing template Id' of 'Split Dosing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPLIT_DOSING__SPLIT_DOSING_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Conditional Dosing template Id' of 'Conditional Dosing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_DOSING__CONDITIONAL_DOSING_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Combination Medication template Id' of 'Combination Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINATION_MEDICATION__COMBINATION_MEDICATION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Section template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coded Vital Signs Section template Id' of 'Coded Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_VITAL_SIGNS_SECTION__CODED_VITAL_SIGNS_SECTION_TEMPLATE_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coded Vital Signs Section vital Signs Organizer' of 'Coded Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_VITAL_SIGNS_SECTION__CODED_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Sign Observation template Id' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Sign Observation code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Sign Observation value' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_VALUE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Simple Observation template Id' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_TEMPLATE_ID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Simple Observation id' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_ID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Simple Observation status Code' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_STATUS_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Organizer code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Organizer status Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_STATUS_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Organizer effective Time' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Organizer vital Sign Observation' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Organizer template Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Payers Section template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TEMPLATE_ID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'History Of Past Illness Section template Id' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Chief Complaint Section template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reason For Referral Section template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'History Of Present Illness template Id' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Surgeries Section template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__SURGERIES_SECTION_TEMPLATE_ID = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coded Surgeries Section template Id' of 'Coded Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hospital Admission Diagnosis Section template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Discharge Diagnosis Section template Id' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Admission Medication History Section template Id' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hospital Discharge Medications Section template Id' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coded Advance Directives Section template Id' of 'Coded Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_ADVANCE_DIRECTIVES_SECTION__CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directives Section template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Physical Exam Narrative Section template Id' of 'Physical Exam Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_NARRATIVE_SECTION__PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Physical Exam Section template Id' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 53;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 53;

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
			case IHEPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return validateMedicationsAdministeredSection((MedicationsAdministeredSection)value, diagnostics, context);
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
			case IHEPackage.NORMAL_DOSING:
				return validateNormalDosing((NormalDosing)value, diagnostics, context);
			case IHEPackage.TAPERED_DOSE:
				return validateTaperedDose((TaperedDose)value, diagnostics, context);
			case IHEPackage.SPLIT_DOSING:
				return validateSplitDosing((SplitDosing)value, diagnostics, context);
			case IHEPackage.CONDITIONAL_DOSING:
				return validateConditionalDosing((ConditionalDosing)value, diagnostics, context);
			case IHEPackage.COMBINATION_MEDICATION:
				return validateCombinationMedication((CombinationMedication)value, diagnostics, context);
			case IHEPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case IHEPackage.CODED_VITAL_SIGNS_SECTION:
				return validateCodedVitalSignsSection((CodedVitalSignsSection)value, diagnostics, context);
			case IHEPackage.VITAL_SIGN_OBSERVATION:
				return validateVitalSignObservation((VitalSignObservation)value, diagnostics, context);
			case IHEPackage.SIMPLE_OBSERVATION:
				return validateSimpleObservation((SimpleObservation)value, diagnostics, context);
			case IHEPackage.VITAL_SIGNS_ORGANIZER:
				return validateVitalSignsOrganizer((VitalSignsOrganizer)value, diagnostics, context);
			case IHEPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection)value, diagnostics, context);
			case IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return validateHistoryOfPastIllnessSection((HistoryOfPastIllnessSection)value, diagnostics, context);
			case IHEPackage.CHIEF_COMPLAINT_SECTION:
				return validateChiefComplaintSection((ChiefComplaintSection)value, diagnostics, context);
			case IHEPackage.REASON_FOR_REFERRAL_SECTION:
				return validateReasonForReferralSection((ReasonForReferralSection)value, diagnostics, context);
			case IHEPackage.HISTORY_OF_PRESENT_ILLNESS:
				return validateHistoryOfPresentIllness((HistoryOfPresentIllness)value, diagnostics, context);
			case IHEPackage.SURGERIES_SECTION:
				return validateSurgeriesSection((SurgeriesSection)value, diagnostics, context);
			case IHEPackage.CODED_SURGERIES_SECTION:
				return validateCodedSurgeriesSection((CodedSurgeriesSection)value, diagnostics, context);
			case IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return validateHospitalAdmissionDiagnosisSection((HospitalAdmissionDiagnosisSection)value, diagnostics, context);
			case IHEPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return validateDischargeDiagnosisSection((DischargeDiagnosisSection)value, diagnostics, context);
			case IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return validateAdmissionMedicationHistorySection((AdmissionMedicationHistorySection)value, diagnostics, context);
			case IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return validateHospitalDischargeMedicationsSection((HospitalDischargeMedicationsSection)value, diagnostics, context);
			case IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION:
				return validateCodedAdvanceDirectivesSection((CodedAdvanceDirectivesSection)value, diagnostics, context);
			case IHEPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection)value, diagnostics, context);
			case IHEPackage.PHYSICAL_EXAM_NARRATIVE_SECTION:
				return validatePhysicalExamNarrativeSection((PhysicalExamNarrativeSection)value, diagnostics, context);
			case IHEPackage.PHYSICAL_EXAM_SECTION:
				return validatePhysicalExamSection((PhysicalExamSection)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection(MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsAdministeredSection_MedicationsAdministeredSection_templateId(medicationsAdministeredSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicationsAdministeredSection_templateId constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_MedicationsAdministeredSection_templateId(MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsAdministeredSection.MedicationsAdministeredSection_templateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_classCode(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_moodCode(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_id(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code_nullFlavor(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_problemObservation(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_templateId(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_effectiveTime(concernEntry, diagnostics, context);
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
	 * Validates the ConcernEntry_effectiveTime constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_ConcernEntry_effectiveTime(ConcernEntry concernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.ConcernEntry_effectiveTime(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_code(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_title(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_problemAct(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_ActiveProblemsSection_templateId(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_ActiveProblemsSection_code(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_ActiveProblemsSection_problemConcernEntry(activeProblemsSection, diagnostics, context);
		return result;
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
	 * Validates the ActiveProblemsSection_problemConcernEntry constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_ActiveProblemsSection_problemConcernEntry(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.ActiveProblemsSection_problemConcernEntry(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_classCode(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_moodCode(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_id(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code_nullFlavor(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_problemObservation(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_templateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_effectiveTime(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcernEntry_ProblemConcernEntry_templateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcernEntry_ProblemConcernEntry_problemEntry(problemConcernEntry, diagnostics, context);
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
	 * Validates the ProblemConcernEntry_problemEntry constraint of '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry_ProblemConcernEntry_problemEntry(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemConcernEntry.ProblemConcernEntry_problemEntry(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_moodCode(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_statusCode(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_effectiveTime(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_code(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_templateId(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_text(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_value(problemEntry, diagnostics, context);
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
	 * Validates the ProblemEntry_text constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_ProblemEntry_text(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.ProblemEntry_text(diagnostics, context);
	}

	/**
	 * Validates the ProblemEntry_value constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_ProblemEntry_value(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.ProblemEntry_value(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_moodCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_templateId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_id(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_statusCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationStatusObservation(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_patientInstruction(medication, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationSection_MedicationSection_code(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationSection_MedicationSection_title(medicationsSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_classCode(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_moodCode(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_id(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code_nullFlavor(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_problemObservation(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_templateId(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_ConcernEntry_effectiveTime(allergyIntoleranceConcern, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_moodCode(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_statusCode(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_effectiveTime(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_ProblemObservation_code(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_templateId(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_text(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_ProblemEntry_value(allergyIntolerance, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_AlertsSection_code(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_AlertsSection_title(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergiesReactionsSection_AllergiesReactionsSection_templateId(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergiesReactionsSection_AllergiesReactionsSection_code(allergiesReactionsSection, diagnostics, context);
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
	 * Validates the AllergiesReactionsSection_code constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_AllergiesReactionsSection_code(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergiesReactionsSection.AllergiesReactionsSection_code(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalDosing(NormalDosing normalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_moodCode(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_templateId(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_id(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_statusCode(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationStatusObservation(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_patientInstruction(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_Medication_templateId(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateNormalDosing_NormalDosing_templateId(normalDosing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NormalDosing_templateId constraint of '<em>Normal Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalDosing_NormalDosing_templateId(NormalDosing normalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return normalDosing.NormalDosing_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaperedDose(TaperedDose taperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_moodCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_templateId(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_id(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_statusCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationStatusObservation(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_patientInstruction(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_Medication_templateId(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaperedDose_TaperedDose_templateId(taperedDose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TaperedDose_templateId constraint of '<em>Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaperedDose_TaperedDose_templateId(TaperedDose taperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return taperedDose.TaperedDose_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitDosing(SplitDosing splitDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_moodCode(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_templateId(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_id(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_statusCode(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationStatusObservation(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_patientInstruction(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_Medication_templateId(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateSplitDosing_SplitDosing_templateId(splitDosing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SplitDosing_templateId constraint of '<em>Split Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitDosing_SplitDosing_templateId(SplitDosing splitDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return splitDosing.SplitDosing_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDosing(ConditionalDosing conditionalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_moodCode(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_templateId(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_id(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_statusCode(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationStatusObservation(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_patientInstruction(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_Medication_templateId(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalDosing_ConditionalDosing_templateId(conditionalDosing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConditionalDosing_templateId constraint of '<em>Conditional Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDosing_ConditionalDosing_templateId(ConditionalDosing conditionalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalDosing.ConditionalDosing_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationMedication(CombinationMedication combinationMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_moodCode(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_templateId(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_id(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_statusCode(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_medicationStatusObservation(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_MedicationActivity_patientInstruction(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_Medication_templateId(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinationMedication_CombinationMedication_templateId(combinationMedication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CombinationMedication_templateId constraint of '<em>Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationMedication_CombinationMedication_templateId(CombinationMedication combinationMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinationMedication.CombinationMedication_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_VitalSignsSection_templateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_VitalSignsSection_code(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_VitalSignsSection_title(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_VitalSignsSection_vitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VitalSignsSection_templateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_VitalSignsSection_templateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "VitalSignsSection_templateId", getObjectLabel(vitalSignsSection, context) },
						 new Object[] { vitalSignsSection },
						 context));
			}
			return false;
		}
		return ccdValidator.validateVitalSignsSection_VitalSignsSection_templateId(vitalSignsSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection(CodedVitalSignsSection codedVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_VitalSignsSection_templateId(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_VitalSignsSection_code(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_VitalSignsSection_title(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_VitalSignsSection_vitalSignsOrganizer(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedVitalSignsSection_CodedVitalSignsSection_templateId(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedVitalSignsSection_CodedVitalSignsSection_vitalSignsOrganizer(codedVitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CodedVitalSignsSection_templateId constraint of '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection_CodedVitalSignsSection_templateId(CodedVitalSignsSection codedVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedVitalSignsSection.CodedVitalSignsSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the CodedVitalSignsSection_vitalSignsOrganizer constraint of '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection_CodedVitalSignsSection_vitalSignsOrganizer(CodedVitalSignsSection codedVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedVitalSignsSection.CodedVitalSignsSection_vitalSignsOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_templateId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_moodCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_id(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_effectiveTime(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_value(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_VitalSignObservation_templateId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_VitalSignObservation_code(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_VitalSignObservation_value(vitalSignObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VitalSignObservation_templateId constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_VitalSignObservation_templateId(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.VitalSignObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the VitalSignObservation_code constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_VitalSignObservation_code(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.VitalSignObservation_code(diagnostics, context);
	}

	/**
	 * Validates the VitalSignObservation_value constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_VitalSignObservation_value(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.VitalSignObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation(SimpleObservation simpleObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_SimpleObservation_templateId(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_SimpleObservation_id(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_SimpleObservation_statusCode(simpleObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SimpleObservation_templateId constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_SimpleObservation_templateId(SimpleObservation simpleObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.SimpleObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the SimpleObservation_id constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_SimpleObservation_id(SimpleObservation simpleObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.SimpleObservation_id(diagnostics, context);
	}

	/**
	 * Validates the SimpleObservation_statusCode constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_SimpleObservation_statusCode(SimpleObservation simpleObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.SimpleObservation_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_ResultOrganizer_templateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_ResultOrganizer_moodCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_ResultOrganizer_id(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_ResultOrganizer_resultObservation(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_VitalSignsOrganizer_templateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_VitalSignsOrganizer_code(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_VitalSignsOrganizer_statusCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_VitalSignsOrganizer_effectiveTime(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_VitalSignsOrganizer_vitalSignObservation(vitalSignsOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VitalSignsOrganizer_code constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_VitalSignsOrganizer_code(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.VitalSignsOrganizer_code(diagnostics, context);
	}

	/**
	 * Validates the VitalSignsOrganizer_statusCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_VitalSignsOrganizer_statusCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.VitalSignsOrganizer_statusCode(diagnostics, context);
	}

	/**
	 * Validates the VitalSignsOrganizer_effectiveTime constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_VitalSignsOrganizer_effectiveTime(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.VitalSignsOrganizer_effectiveTime(diagnostics, context);
	}

	/**
	 * Validates the VitalSignsOrganizer_vitalSignObservation constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_VitalSignsOrganizer_vitalSignObservation(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.VitalSignsOrganizer_vitalSignObservation(diagnostics, context);
	}

	/**
	 * Validates the VitalSignsOrganizer_templateId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_VitalSignsOrganizer_templateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "VitalSignsOrganizer_templateId", getObjectLabel(vitalSignsOrganizer, context) },
						 new Object[] { vitalSignsOrganizer },
						 context));
			}
			return false;
		}
		return ccdValidator.validateVitalSignsOrganizer_VitalSignsOrganizer_templateId(vitalSignsOrganizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_PayersSection_templateId(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_PayersSection_code(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_PayersSection_title(payersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PayersSection_templateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_PayersSection_templateId(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "PayersSection_templateId", getObjectLabel(payersSection, context) },
						 new Object[] { payersSection },
						 context));
			}
			return false;
		}
		return ccdValidator.validatePayersSection_PayersSection_templateId(payersSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryOfPastIllnessSection_HistoryOfPastIllnessSection_templateId(historyOfPastIllnessSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HistoryOfPastIllnessSection_templateId constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_HistoryOfPastIllnessSection_templateId(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPastIllnessSection.HistoryOfPastIllnessSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateChiefComplaintSection_ChiefComplaintSection_templateId(chiefComplaintSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ChiefComplaintSection_templateId constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_ChiefComplaintSection_templateId(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.ChiefComplaintSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForReferralSection_ReasonForReferralSection_templateId(reasonForReferralSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReasonForReferralSection_templateId constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_ReasonForReferralSection_templateId(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.ReasonForReferralSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryOfPresentIllness_HistoryOfPresentIllness_templateId(historyOfPresentIllness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HistoryOfPresentIllness_templateId constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_HistoryOfPresentIllness_templateId(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPresentIllness.HistoryOfPresentIllness_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_templateId(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_code(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_title(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_procedureActivity(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurgeriesSection_SurgeriesSection_templateId(surgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SurgeriesSection_templateId constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_SurgeriesSection_templateId(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.SurgeriesSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSurgeriesSection(CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_templateId(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_code(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_title(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_ProceduresSection_procedureActivity(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurgeriesSection_SurgeriesSection_templateId(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedSurgeriesSection_CodedSurgeriesSection_templateId(codedSurgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CodedSurgeriesSection_templateId constraint of '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSurgeriesSection_CodedSurgeriesSection_templateId(CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedSurgeriesSection.CodedSurgeriesSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalAdmissionDiagnosisSection_HospitalAdmissionDiagnosisSection_templateId(hospitalAdmissionDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HospitalAdmissionDiagnosisSection_templateId constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_HospitalAdmissionDiagnosisSection_templateId(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.HospitalAdmissionDiagnosisSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeDiagnosisSection_DischargeDiagnosisSection_templateId(dischargeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DischargeDiagnosisSection_templateId constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_DischargeDiagnosisSection_templateId(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeDiagnosisSection.DischargeDiagnosisSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdmissionMedicationHistorySection_AdmissionMedicationHistorySection_templateId(admissionMedicationHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdmissionMedicationHistorySection_templateId constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_AdmissionMedicationHistorySection_templateId(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return admissionMedicationHistorySection.AdmissionMedicationHistorySection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalDischargeMedicationsSection_HospitalDischargeMedicationsSection_templateId(hospitalDischargeMedicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HospitalDischargeMedicationsSection_templateId constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_HospitalDischargeMedicationsSection_templateId(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.HospitalDischargeMedicationsSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedAdvanceDirectivesSection(CodedAdvanceDirectivesSection codedAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_AdvanceDirectivesSection_templateId(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_code(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_title(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_advanceDirectiveObservation(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedAdvanceDirectivesSection_CodedAdvanceDirectivesSection_templateId(codedAdvanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CodedAdvanceDirectivesSection_templateId constraint of '<em>Coded Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedAdvanceDirectivesSection_CodedAdvanceDirectivesSection_templateId(CodedAdvanceDirectivesSection codedAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedAdvanceDirectivesSection.CodedAdvanceDirectivesSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_AdvanceDirectivesSection_templateId(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_code(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_title(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_advanceDirectiveObservation(advanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdvanceDirectivesSection_templateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_AdvanceDirectivesSection_templateId(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AdvanceDirectivesSection_templateId", getObjectLabel(advanceDirectivesSection, context) },
						 new Object[] { advanceDirectivesSection },
						 context));
			}
			return false;
		}
		return ccdValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_templateId(advanceDirectivesSection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamNarrativeSection(PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExamNarrativeSection_PhysicalExamNarrativeSection_templateId(physicalExamNarrativeSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PhysicalExamNarrativeSection_templateId constraint of '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamNarrativeSection_PhysicalExamNarrativeSection_templateId(PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamNarrativeSection.PhysicalExamNarrativeSection_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection(PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExamNarrativeSection_PhysicalExamNarrativeSection_templateId(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExamSection_PhysicalExamSection_templateId(physicalExamSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PhysicalExamSection_templateId constraint of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection_PhysicalExamSection_templateId(PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamSection.PhysicalExamSection_templateId(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IHEPlugin.INSTANCE;
	}

} //IHEValidator
