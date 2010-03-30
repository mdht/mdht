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
import org.openhealthtools.mdht.uml.cda.ihe.*;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.PayersSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.SplitDosing;
import org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Immunizations Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IHE_IMMUNIZATIONS_SECTION_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Immunizations Section Immunization' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IHE_IMMUNIZATIONS_SECTION_IMMUNIZATION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Administered Section Template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Administered Section Code' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Concern Entry Template Id' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_TEMPLATE_ID = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Concern Entry Effective Time' of 'Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONCERN_ENTRY__CONCERN_ENTRY_EFFECTIVE_TIME = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Document Template Id' of 'Medical Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_DOCUMENT__MEDICAL_DOCUMENT_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Active Problems Section Template Id' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Active Problems Section Problem Concern Entry' of 'Active Problems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTIVE_PROBLEMS_SECTION__ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Entry Template Id' of 'Problem Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_TEMPLATE_ID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Concern Entry Problem Entry' of 'Problem Concern Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_CONCERN_ENTRY__PROBLEM_CONCERN_ENTRY_PROBLEM_ENTRY = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Template Id' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_TEMPLATE_ID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Text' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_TEXT = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Value' of 'Problem Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ENTRY__PROBLEM_ENTRY_VALUE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_TEMPLATE_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Medications Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__IHE_MEDICATIONS_SECTION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Concern Template Id' of 'Allergy Intolerance Concern'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE_CONCERN__ALLERGY_INTOLERANCE_CONCERN_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Intolerance Template Id' of 'Allergy Intolerance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_INTOLERANCE__ALLERGY_INTOLERANCE_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergies Reactions Section Template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Normal Dosing Template Id' of 'Normal Dosing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NORMAL_DOSING__NORMAL_DOSING_TEMPLATE_ID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tapered Dose Template Id' of 'Tapered Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAPERED_DOSE__TAPERED_DOSE_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Split Dosing Template Id' of 'Split Dosing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPLIT_DOSING__SPLIT_DOSING_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Conditional Dosing Template Id' of 'Conditional Dosing'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_DOSING__CONDITIONAL_DOSING_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Combination Medication Template Id' of 'Combination Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMBINATION_MEDICATION__COMBINATION_MEDICATION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__IHE_VITAL_SIGNS_SECTION_TEMPLATE_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Vital Signs Section Template Id' of 'Coded Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_VITAL_SIGNS_SECTION__CODED_VITAL_SIGNS_SECTION_TEMPLATE_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Vital Signs Section Vital Signs Organizer' of 'Coded Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_VITAL_SIGNS_SECTION__CODED_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Template Id' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Value' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_VALUE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Interpretation Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Method Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_METHOD_CODE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Observation Target Site Code' of 'Vital Sign Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN_OBSERVATION__VITAL_SIGN_OBSERVATION_TARGET_SITE_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Simple Observation Template Id' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_TEMPLATE_ID = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Simple Observation Id' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_ID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Simple Observation Status Code' of 'Simple Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_OBSERVATION__SIMPLE_OBSERVATION_STATUS_CODE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Template Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_CODE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Status Code' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Effective Time' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Vital Signs Organizer Vital Sign Observation' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Payers Section Template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__IHE_PAYERS_SECTION_TEMPLATE_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Payers Section Coverage Entry' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__IHE_PAYERS_SECTION_COVERAGE_ENTRY = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Past Illness Section Template Id' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Past Illness Section Code' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_CODE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Code' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CODE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Code' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Present Illness Template Id' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History Of Present Illness Code' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Surgeries Section Template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__SURGERIES_SECTION_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Surgeries Section Template Id' of 'Coded Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_SURGERIES_SECTION__CODED_SURGERIES_SECTION_TEMPLATE_ID = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Diagnosis Section Template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Admission Diagnosis Section Code' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Diagnosis Section Template Id' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Diagnosis Section Code' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_CODE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Admission Medication History Section Template Id' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Admission Medication History Section Code' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Medications Section Template Id' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Discharge Medications Section Code' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Advance Directives Section Template Id' of 'Coded Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_ADVANCE_DIRECTIVES_SECTION__CODED_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Advance Directives Section Template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__IHE_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Exam Narrative Section Template Id' of 'Physical Exam Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_NARRATIVE_SECTION__PHYSICAL_EXAM_NARRATIVE_SECTION_TEMPLATE_ID = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Exam Narrative Section Code' of 'Physical Exam Narrative Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_NARRATIVE_SECTION__PHYSICAL_EXAM_NARRATIVE_SECTION_CODE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Exam Section Template Id' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Template Id' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Code' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_CODE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Course Section Template Id' of 'Hospital Course Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hospital Course Section Code' of 'Hospital Course Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_CODE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Results Section Template Id' of 'Coded Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_TEMPLATE_ID = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coded Results Section Code' of 'Coded Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CODED_RESULTS_SECTION__CODED_RESULTS_SECTION_CODE = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Template Id' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Code' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_CODE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Care Plan Section Template Id' of 'Care Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CARE_PLAN_SECTION__CARE_PLAN_SECTION_TEMPLATE_ID = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family Medical History Section Template Id' of 'Family Medical History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_MEDICAL_HISTORY_SECTION__FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__IHE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter History Section Template Id' of 'Encounter History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_HISTORY_SECTION__ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Devices Section Template Id' of 'Medical Devices Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_DEVICES_SECTION__MEDICAL_DEVICES_SECTION_TEMPLATE_ID = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IHE Language Communication Template Id' of 'Language Communication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_COMMUNICATION__IHE_LANGUAGE_COMMUNICATION_TEMPLATE_ID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Problem Concern Entry' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Allergy Concern Entry' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Medications' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_MEDICATIONS = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Template Id' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_TEMPLATE_ID = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Summary Code' of 'Medical Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_SUMMARY__MEDICAL_SUMMARY_CODE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Template Id' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_TEMPLATE_ID = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Code' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CODE = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Discharge Summary Active Problems Section' of 'Discharge Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ACTIVE_PROBLEMS_SECTION = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Entry Template Id' of 'Coverage Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ENTRY__COVERAGE_ENTRY_TEMPLATE_ID = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Healthcare Providers Pharmacies Template Id' of 'Healthcare Providers Pharmacies'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTHCARE_PROVIDERS_PHARMACIES__HEALTHCARE_PROVIDERS_PHARMACIES_TEMPLATE_ID = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunization Template Id' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__IMMUNIZATION_TEMPLATE_ID = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Observation Request Entry Template Id' of 'Observation Request Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSERVATION_REQUEST_ENTRY__OBSERVATION_REQUEST_ENTRY_TEMPLATE_ID = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Entry Template Id' of 'Product Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_ENTRY__PRODUCT_ENTRY_TEMPLATE_ID = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Procedure Activity Procedure Template Id' of 'Procedure Entry Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Entry Plan Of Care Activity Procedure Template Id' of 'Procedure Entry Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE__PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 95;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 95;

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHEValidator() {
		super();
		ccdValidator = CCDValidator.INSTANCE;
		cdaValidator = CDAValidator.INSTANCE;
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
			case IHEPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection)value, diagnostics, context);
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
			case IHEPackage.REVIEW_OF_SYSTEMS_SECTION:
				return validateReviewOfSystemsSection((ReviewOfSystemsSection)value, diagnostics, context);
			case IHEPackage.HOSPITAL_COURSE_SECTION:
				return validateHospitalCourseSection((HospitalCourseSection)value, diagnostics, context);
			case IHEPackage.CODED_RESULTS_SECTION:
				return validateCodedResultsSection((CodedResultsSection)value, diagnostics, context);
			case IHEPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection)value, diagnostics, context);
			case IHEPackage.CARE_PLAN_SECTION:
				return validateCarePlanSection((CarePlanSection)value, diagnostics, context);
			case IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION:
				return validateFamilyMedicalHistorySection((FamilyMedicalHistorySection)value, diagnostics, context);
			case IHEPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case IHEPackage.ENCOUNTER_HISTORY_SECTION:
				return validateEncounterHistorySection((EncounterHistorySection)value, diagnostics, context);
			case IHEPackage.MEDICAL_DEVICES_SECTION:
				return validateMedicalDevicesSection((MedicalDevicesSection)value, diagnostics, context);
			case IHEPackage.LANGUAGE_COMMUNICATION:
				return validateLanguageCommunication((LanguageCommunication)value, diagnostics, context);
			case IHEPackage.MEDICAL_SUMMARY:
				return validateMedicalSummary((MedicalSummary)value, diagnostics, context);
			case IHEPackage.DISCHARGE_SUMMARY:
				return validateDischargeSummary((DischargeSummary)value, diagnostics, context);
			case IHEPackage.COVERAGE_ENTRY:
				return validateCoverageEntry((CoverageEntry)value, diagnostics, context);
			case IHEPackage.HEALTHCARE_PROVIDERS_PHARMACIES:
				return validateHealthcareProvidersPharmacies((HealthcareProvidersPharmacies)value, diagnostics, context);
			case IHEPackage.IMMUNIZATION:
				return validateImmunization((Immunization)value, diagnostics, context);
			case IHEPackage.OBSERVATION_REQUEST_ENTRY:
				return validateObservationRequestEntry((ObservationRequestEntry)value, diagnostics, context);
			case IHEPackage.PRODUCT_ENTRY:
				return validateProductEntry((ProductEntry)value, diagnostics, context);
			case IHEPackage.PROCEDURE_ENTRY:
				return validateProcedureEntry((ProcedureEntry)value, diagnostics, context);
			case IHEPackage.PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE:
				return validateProcedureEntryProcedureActivityProcedure((ProcedureEntryProcedureActivityProcedure)value, diagnostics, context);
			case IHEPackage.PROCEDURE_ENTRY_PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return validateProcedureEntryPlanOfCareActivityProcedure((ProcedureEntryPlanOfCareActivityProcedure)value, diagnostics, context);
			case IHEPackage.IHE_REGISTRY_DELEGATE:
				return validateIHERegistryDelegate((IHERegistryDelegate)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTemplateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionMedicationActivity(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionSupplyActivity(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateIHEImmunizationsSectionTemplateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateIHEImmunizationsSectionImmunization(immunizationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEImmunizationsSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateIHEImmunizationsSectionTemplateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateIHEImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEImmunizationsSectionImmunization constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateIHEImmunizationsSectionImmunization(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateIHEImmunizationsSectionImmunization(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(medicationsAdministeredSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationsAdministeredSectionTemplateId constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsAdministeredSection.validateMedicationsAdministeredSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsAdministeredSectionCode constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsAdministeredSection.validateMedicationsAdministeredSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActClassCode(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActId(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_validateConcernEntryTemplateId(concernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_validateConcernEntryEffectiveTime(concernEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConcernEntryTemplateId constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_validateConcernEntryTemplateId(ConcernEntry concernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.validateConcernEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConcernEntryEffectiveTime constraint of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcernEntry_validateConcernEntryEffectiveTime(ConcernEntry concernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return concernEntry.validateConcernEntryEffectiveTime(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateMedicalDocument_validateMedicalDocumentTemplateId(medicalDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicalDocumentTemplateId constraint of '<em>Medical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDocument_validateMedicalDocumentTemplateId(MedicalDocument medicalDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalDocument.validateMedicalDocumentTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionTemplateId(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionCode(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionTitle(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionText(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionProblemAct(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_validateActiveProblemsSectionTemplateId(activeProblemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateActiveProblemsSection_validateActiveProblemsSectionProblemConcernEntry(activeProblemsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateActiveProblemsSectionTemplateId constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_validateActiveProblemsSectionTemplateId(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.validateActiveProblemsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateActiveProblemsSectionProblemConcernEntry constraint of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveProblemsSection_validateActiveProblemsSectionProblemConcernEntry(ActiveProblemsSection activeProblemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return activeProblemsSection.validateActiveProblemsSectionProblemConcernEntry(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActClassCode(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_validateConcernEntryTemplateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_validateConcernEntryEffectiveTime(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcernEntry_validateProblemConcernEntryTemplateId(problemConcernEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemConcernEntry_validateProblemConcernEntryProblemEntry(problemConcernEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemConcernEntryTemplateId constraint of '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry_validateProblemConcernEntryTemplateId(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemConcernEntry.validateProblemConcernEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemConcernEntryProblemEntry constraint of '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemConcernEntry_validateProblemConcernEntryProblemEntry(ProblemConcernEntry problemConcernEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemConcernEntry.validateProblemConcernEntryProblemEntry(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatusObservation(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatusObservation(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_validateProblemEntryTemplateId(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_validateProblemEntryText(problemEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_validateProblemEntryValue(problemEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemEntryTemplateId constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryTemplateId(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryText constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryText(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryText(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryValue constraint of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemEntry_validateProblemEntryValue(ProblemEntry problemEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemEntry.validateProblemEntryValue(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateMedicationTemplateId(medication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationTemplateId constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateMedicationTemplateId(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateMedicationTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionCode(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTitle(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateIHEMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEMedicationsSectionTemplateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateIHEMedicationsSectionTemplateId(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateIHEMedicationsSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActClassCode(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActId(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_validateConcernEntryTemplateId(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateConcernEntry_validateConcernEntryEffectiveTime(allergyIntoleranceConcern, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernTemplateId(allergyIntoleranceConcern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAllergyIntoleranceConcernTemplateId constraint of '<em>Allergy Intolerance Concern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernTemplateId(AllergyIntoleranceConcern allergyIntoleranceConcern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntoleranceConcern.validateAllergyIntoleranceConcernTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatusObservation(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatusObservation(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_validateProblemEntryTemplateId(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_validateProblemEntryText(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemEntry_validateProblemEntryValue(allergyIntolerance, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergyIntolerance_validateAllergyIntoleranceTemplateId(allergyIntolerance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAllergyIntoleranceTemplateId constraint of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyIntolerance_validateAllergyIntoleranceTemplateId(AllergyIntolerance allergyIntolerance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyIntolerance.validateAllergyIntoleranceTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_validateAlertsSectionTemplateId(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_validateAlertsSectionCode(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_validateAlertsSectionTitle(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_validateAlertsSectionText(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAlertsSection_validateAlertsSectionProblemAct(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergiesReactionsSection_validateAllergiesReactionsSectionTemplateId(allergiesReactionsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAllergiesReactionsSectionTemplateId constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_validateAllergiesReactionsSectionTemplateId(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergiesReactionsSection.validateAllergiesReactionsSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateMedicationTemplateId(normalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateNormalDosing_validateNormalDosingTemplateId(normalDosing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNormalDosingTemplateId constraint of '<em>Normal Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalDosing_validateNormalDosingTemplateId(NormalDosing normalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return normalDosing.validateNormalDosingTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateMedicationTemplateId(taperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateTaperedDose_validateTaperedDoseTemplateId(taperedDose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTaperedDoseTemplateId constraint of '<em>Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaperedDose_validateTaperedDoseTemplateId(TaperedDose taperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return taperedDose.validateTaperedDoseTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateMedicationTemplateId(splitDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateSplitDosing_validateSplitDosingTemplateId(splitDosing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSplitDosingTemplateId constraint of '<em>Split Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitDosing_validateSplitDosingTemplateId(SplitDosing splitDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return splitDosing.validateSplitDosingTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateMedicationTemplateId(conditionalDosing, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalDosing_validateConditionalDosingTemplateId(conditionalDosing, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionalDosingTemplateId constraint of '<em>Conditional Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalDosing_validateConditionalDosingTemplateId(ConditionalDosing conditionalDosing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalDosing.validateConditionalDosingTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateMedicationTemplateId(combinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validateCombinationMedication_validateCombinationMedicationTemplateId(combinationMedication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCombinationMedicationTemplateId constraint of '<em>Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCombinationMedication_validateCombinationMedicationTemplateId(CombinationMedication combinationMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return combinationMedication.validateCombinationMedicationTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTitle(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionText(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEVitalSignsSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateIHEVitalSignsSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTemplateId(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionCode(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionTitle(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionText(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedVitalSignsSection_validateCodedVitalSignsSectionTemplateId(codedVitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedVitalSignsSection_validateCodedVitalSignsSectionVitalSignsOrganizer(codedVitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedVitalSignsSectionTemplateId constraint of '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection_validateCodedVitalSignsSectionTemplateId(CodedVitalSignsSection codedVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedVitalSignsSection.validateCodedVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCodedVitalSignsSectionVitalSignsOrganizer constraint of '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedVitalSignsSection_validateCodedVitalSignsSectionVitalSignsOrganizer(CodedVitalSignsSection codedVitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedVitalSignsSection.validateCodedVitalSignsSectionVitalSignsOrganizer(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationTemplateId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_validateSimpleObservationTemplateId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_validateSimpleObservationId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_validateSimpleObservationStatusCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_validateVitalSignObservationTemplateId(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_validateVitalSignObservationCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_validateVitalSignObservationValue(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_validateVitalSignObservationInterpretationCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_validateVitalSignObservationMethodCode(vitalSignObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(vitalSignObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignObservationTemplateId constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationTemplateId(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationCode(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationValue constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationValue(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationValue(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationInterpretationCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationInterpretationCode(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationMethodCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationMethodCode(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignObservationTargetSiteCode constraint of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(VitalSignObservation vitalSignObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignObservation.validateVitalSignObservationTargetSiteCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateSimpleObservation_validateSimpleObservationTemplateId(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_validateSimpleObservationId(simpleObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleObservation_validateSimpleObservationStatusCode(simpleObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSimpleObservationTemplateId constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_validateSimpleObservationTemplateId(SimpleObservation simpleObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.validateSimpleObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSimpleObservationId constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_validateSimpleObservationId(SimpleObservation simpleObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.validateSimpleObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateSimpleObservationStatusCode constraint of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleObservation_validateSimpleObservationStatusCode(SimpleObservation simpleObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleObservation.validateSimpleObservationStatusCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerComponentElement(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerInformationSource(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerMoodCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerStatusCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultOrganizer_validateResultOrganizerResultObservation(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateVitalSignsOrganizer_validateVitalSignsOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerStatusCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerEffectiveTime(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerVitalSignObservation(vitalSignsOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerTemplateId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerTemplateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerStatusCode constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerStatusCode(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerEffectiveTime constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateIHEVitalSignsOrganizerVitalSignObservation constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateIHEVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateIHEVitalSignsOrganizerVitalSignObservation(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_validatePayersSectionTemplateId(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_validatePayersSectionCode(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_validatePayersSectionTitle(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_validatePayersSectionCoverageActivity(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validateIHEPayersSectionTemplateId(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validateIHEPayersSectionCoverageEntry(payersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEPayersSectionTemplateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validateIHEPayersSectionTemplateId(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validateIHEPayersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateIHEPayersSectionCoverageEntry constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validateIHEPayersSectionCoverageEntry(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validateIHEPayersSectionCoverageEntry(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionTemplateId(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionCode(historyOfPastIllnessSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHistoryOfPastIllnessSectionTemplateId constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPastIllnessSection.validateHistoryOfPastIllnessSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryOfPastIllnessSectionCode constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPastIllnessSection.validateHistoryOfPastIllnessSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateChiefComplaintSection_validateChiefComplaintSectionCode(chiefComplaintSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateChiefComplaintSectionTemplateId constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateChiefComplaintSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateChiefComplaintSectionCode constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionCode(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateChiefComplaintSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForReferralSection_validateReasonForReferralSectionCode(reasonForReferralSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReasonForReferralSectionTemplateId constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.validateReasonForReferralSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReasonForReferralSectionCode constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionCode(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.validateReasonForReferralSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(historyOfPresentIllness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHistoryOfPresentIllnessTemplateId constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPresentIllness.validateHistoryOfPresentIllnessTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryOfPresentIllnessCode constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPresentIllness.validateHistoryOfPresentIllnessCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTemplateId(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionCode(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTitle(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurgeriesSection_validateSurgeriesSectionTemplateId(surgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSurgeriesSectionTemplateId constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateSurgeriesSectionTemplateId(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateSurgeriesSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTemplateId(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionCode(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProceduresSection_validateProceduresSectionTitle(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurgeriesSection_validateSurgeriesSectionTemplateId(codedSurgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedSurgeriesSection_validateCodedSurgeriesSectionTemplateId(codedSurgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedSurgeriesSectionTemplateId constraint of '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedSurgeriesSection_validateCodedSurgeriesSectionTemplateId(CodedSurgeriesSection codedSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedSurgeriesSection.validateCodedSurgeriesSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(hospitalAdmissionDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHospitalAdmissionDiagnosisSectionTemplateId constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHospitalAdmissionDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalAdmissionDiagnosisSectionCode constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHospitalAdmissionDiagnosisSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionTemplateId(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionCode(dischargeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDischargeDiagnosisSectionTemplateId constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionTemplateId(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeDiagnosisSection.validateDischargeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeDiagnosisSectionCode constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionCode(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeDiagnosisSection.validateDischargeDiagnosisSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionTemplateId(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionCode(admissionMedicationHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAdmissionMedicationHistorySectionTemplateId constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionTemplateId(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return admissionMedicationHistorySection.validateAdmissionMedicationHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdmissionMedicationHistorySectionCode constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionCode(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return admissionMedicationHistorySection.validateAdmissionMedicationHistorySectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionTemplateId(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionCode(hospitalDischargeMedicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHospitalDischargeMedicationsSectionTemplateId constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionTemplateId(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.validateHospitalDischargeMedicationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalDischargeMedicationsSectionCode constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionCode(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.validateHospitalDischargeMedicationsSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(codedAdvanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedAdvanceDirectivesSection_validateCodedAdvanceDirectivesSectionTemplateId(codedAdvanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedAdvanceDirectivesSectionTemplateId constraint of '<em>Coded Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedAdvanceDirectivesSection_validateCodedAdvanceDirectivesSectionTemplateId(CodedAdvanceDirectivesSection codedAdvanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedAdvanceDirectivesSection.validateCodedAdvanceDirectivesSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(advanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHEAdvanceDirectivesSectionTemplateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateIHEAdvanceDirectivesSectionTemplateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(physicalExamNarrativeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(physicalExamNarrativeSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePhysicalExamNarrativeSectionTemplateId constraint of '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamNarrativeSection.validatePhysicalExamNarrativeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePhysicalExamNarrativeSectionCode constraint of '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(PhysicalExamNarrativeSection physicalExamNarrativeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamNarrativeSection.validatePhysicalExamNarrativeSectionCode(diagnostics, context);
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
		if (result || diagnostics != null) result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExamSection_validatePhysicalExamSectionTemplateId(physicalExamSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePhysicalExamSectionTemplateId constraint of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection_validatePhysicalExamSectionTemplateId(PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamSection.validatePhysicalExamSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(reviewOfSystemsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReviewOfSystemsSectionTemplateId constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateReviewOfSystemsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReviewOfSystemsSectionCode constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateReviewOfSystemsSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection(HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalCourseSection_validateHospitalCourseSectionTemplateId(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalCourseSection_validateHospitalCourseSectionCode(hospitalCourseSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHospitalCourseSectionTemplateId constraint of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection_validateHospitalCourseSectionTemplateId(HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalCourseSection.validateHospitalCourseSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHospitalCourseSectionCode constraint of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection_validateHospitalCourseSectionCode(HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalCourseSection.validateHospitalCourseSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedResultsSection_validateCodedResultsSectionTemplateId(codedResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCodedResultsSection_validateCodedResultsSectionCode(codedResultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCodedResultsSectionTemplateId constraint of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection_validateCodedResultsSectionTemplateId(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedResultsSection.validateCodedResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCodedResultsSectionCode constraint of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedResultsSection_validateCodedResultsSectionCode(CodedResultsSection codedResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return codedResultsSection.validateCodedResultsSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanSectionTemplateId constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentAndPlanSectionCode constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateAssessmentAndPlanSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanSection(CarePlanSection carePlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionContainsPlanOfCareActivity(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTitle(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(carePlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateCarePlanSection_validateCarePlanSectionTemplateId(carePlanSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCarePlanSectionTemplateId constraint of '<em>Care Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCarePlanSection_validateCarePlanSectionTemplateId(CarePlanSection carePlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return carePlanSection.validateCarePlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMedicalHistorySection(FamilyMedicalHistorySection familyMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionCode(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTitle(familyMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyMedicalHistorySection_validateFamilyMedicalHistorySectionTemplateId(familyMedicalHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFamilyMedicalHistorySectionTemplateId constraint of '<em>Family Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyMedicalHistorySection_validateFamilyMedicalHistorySectionTemplateId(FamilyMedicalHistorySection familyMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyMedicalHistorySection.validateFamilyMedicalHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTemplateId(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionCode(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateSocialHistorySection_validateSocialHistorySectionTitle(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_validateIHESocialHistorySectionTemplateId(socialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHESocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateIHESocialHistorySectionTemplateId(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateIHESocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHistorySection(EncounterHistorySection encounterHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionTemplateId(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionCode(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionTitle(encounterHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounterHistorySection_validateEncounterHistorySectionTemplateId(encounterHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncounterHistorySectionTemplateId constraint of '<em>Encounter History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterHistorySection_validateEncounterHistorySectionTemplateId(EncounterHistorySection encounterHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterHistorySection.validateEncounterHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDevicesSection(MedicalDevicesSection medicalDevicesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(medicalDevicesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalDevicesSection_validateMedicalDevicesSectionTemplateId(medicalDevicesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicalDevicesSectionTemplateId constraint of '<em>Medical Devices Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalDevicesSection_validateMedicalDevicesSectionTemplateId(MedicalDevicesSection medicalDevicesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalDevicesSection.validateMedicalDevicesSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunication(LanguageCommunication languageCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(languageCommunication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(languageCommunication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(languageCommunication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(languageCommunication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(languageCommunication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(languageCommunication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(languageCommunication, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageCommunication_validateIHELanguageCommunicationTemplateId(languageCommunication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIHELanguageCommunicationTemplateId constraint of '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunication_validateIHELanguageCommunicationTemplateId(LanguageCommunication languageCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageCommunication.validateIHELanguageCommunicationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalDocument_validateMedicalDocumentTemplateId(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryMedications(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryTemplateId(medicalSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryCode(medicalSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicalSummaryProblemConcernEntry constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryProblemConcernEntry(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryAllergyConcernEntry constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryAllergyConcernEntry(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryMedications constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryMedications(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryMedications(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryTemplateId constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryTemplateId(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalSummaryCode constraint of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalSummary_validateMedicalSummaryCode(MedicalSummary medicalSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalSummary.validateMedicalSummaryCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalDocument_validateMedicalDocumentTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryMedications(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalSummary_validateMedicalSummaryCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryTemplateId(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryCode(dischargeSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeSummary_validateDischargeSummaryActiveProblemsSection(dischargeSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDischargeSummaryTemplateId constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryTemplateId(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryCode constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryCode(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryCode(diagnostics, context);
	}

	/**
	 * Validates the validateDischargeSummaryActiveProblemsSection constraint of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary_validateDischargeSummaryActiveProblemsSection(DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeSummary.validateDischargeSummaryActiveProblemsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEntry(CoverageEntry coverageEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityTemplateId(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityClassCode(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityMoodCode(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityId(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityStatusCode(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityCode(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityPolicyActivity(coverageEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageEntry_validateCoverageEntryTemplateId(coverageEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoverageEntryTemplateId constraint of '<em>Coverage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageEntry_validateCoverageEntryTemplateId(CoverageEntry coverageEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageEntry.validateCoverageEntryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvidersPharmacies(HealthcareProvidersPharmacies healthcareProvidersPharmacies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(healthcareProvidersPharmacies, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthcareProvidersPharmacies_validateHealthcareProvidersPharmaciesTemplateId(healthcareProvidersPharmacies, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHealthcareProvidersPharmaciesTemplateId constraint of '<em>Healthcare Providers Pharmacies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvidersPharmacies_validateHealthcareProvidersPharmaciesTemplateId(HealthcareProvidersPharmacies healthcareProvidersPharmacies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthcareProvidersPharmacies.validateHealthcareProvidersPharmaciesTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunization_validateImmunizationTemplateId(immunization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateImmunizationTemplateId constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateImmunizationTemplateId(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateImmunizationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRequestEntry(ObservationRequestEntry observationRequestEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCodeValue(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCode(observationRequestEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateObservationRequestEntry_validateObservationRequestEntryTemplateId(observationRequestEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateObservationRequestEntryTemplateId constraint of '<em>Observation Request Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRequestEntry_validateObservationRequestEntryTemplateId(ObservationRequestEntry observationRequestEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return observationRequestEntry.validateObservationRequestEntryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductEntry(ProductEntry productEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductTemplateId(productEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateProductEntry_validateProductEntryTemplateId(productEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProductEntryTemplateId constraint of '<em>Product Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductEntry_validateProductEntryTemplateId(ProductEntry productEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productEntry.validateProductEntryTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntry(ProcedureEntry procedureEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(procedureEntryProcedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureTemplateId(procedureEntryProcedureActivityProcedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcedureEntryProcedureActivityProcedureTemplateId constraint of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureTemplateId(ProcedureEntryProcedureActivityProcedure procedureEntryProcedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryProcedureActivityProcedure.validateProcedureEntryProcedureActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryPlanOfCareActivityProcedure(ProcedureEntryPlanOfCareActivityProcedure procedureEntryPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCodeValue(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureEntryPlanOfCareActivityProcedure_validateProcedureEntryPlanOfCareActivityProcedureTemplateId(procedureEntryPlanOfCareActivityProcedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcedureEntryPlanOfCareActivityProcedureTemplateId constraint of '<em>Procedure Entry Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureEntryPlanOfCareActivityProcedure_validateProcedureEntryPlanOfCareActivityProcedureTemplateId(ProcedureEntryPlanOfCareActivityProcedure procedureEntryPlanOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureEntryPlanOfCareActivityProcedure.validateProcedureEntryPlanOfCareActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIHERegistryDelegate(IHERegistryDelegate iheRegistryDelegate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iheRegistryDelegate, diagnostics, context);
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
