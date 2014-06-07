/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;
import org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Comment;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.Support;
import org.openhealthtools.mdht.uml.cda.hitsp.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.hitsp.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage
 * @generated
 */
public class HITSPValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HITSPValidator INSTANCE = new HITSPValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.hitsp";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Allergy Drug Sensitivity Template Id' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Effective Time' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_EFFECTIVE_TIME = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Route Code' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__HITSP_MEDICATION_ROUTE_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Treating Provider' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_TREATING_PROVIDER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Provider Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_PROVIDER_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Has Provider Treatment Time' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_HAS_PROVIDER_TREATMENT_TIME = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Template Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Condition Entry' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONDITION_ENTRY = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Onset Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_ONSET_DATE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_RESOLUTION_DATE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Has Unknown Resolution Date' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Code' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Entry Value' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__PROBLEM_ENTRY_VALUE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Advance Directives Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Allergies Reactions Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Problem List Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PROBLEM_LIST_SECTION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Encounters Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ENCOUNTERS_SECTION = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Immunizations Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_IMMUNIZATIONS_SECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Payers Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PAYERS_SECTION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Medications Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_MEDICATIONS_SECTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Surgeries Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_SURGERIES_SECTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Plan Of Care Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PLAN_OF_CARE_SECTION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Pregnancy History Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Vital Signs Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_VITAL_SIGNS_SECTION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Diagnostic Results Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Template Id' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Vital Signs Section Vital Signs' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Template Id' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__RESULT_OBSERVATION_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Payers Section Template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__HITSP_PAYERS_SECTION_TEMPLATE_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Allergies Reactions Section Template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__HITSP_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP History Of Past Illness Section Template Id' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HITSP_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Chief Complaint Section Template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Reason For Referral Section Template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__HITSP_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP History Of Present Illness Template Id' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HITSP_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Surgeries Section Template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__HITSP_SURGERIES_SECTION_TEMPLATE_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Surgeries Section Procedure' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__HITSP_SURGERIES_SECTION_PROCEDURE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Has Code Code' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_HAS_CODE_CODE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Has Code Original Text' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_HAS_CODE_ORIGINAL_TEXT = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Performer Assigned Entity' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_PERFORMER_ASSIGNED_ENTITY = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Template Id' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_TEMPLATE_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Procedure Target Site Code' of 'Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE__HITSP_PROCEDURE_TARGET_SITE_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Functional Status Section Template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__HITSP_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Admission Diagnosis Section Template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Discharge Diagnosis Section Template Id' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__HITSP_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Admission Medication History Section Template Id' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__HITSP_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Discharge Medications Section Template Id' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HITSP_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Administered Section Template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__HITSP_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Advance Directives Section Template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__HITSP_ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunizations Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Condition' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CONDITION = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__HITSP_MEDICATIONS_SECTION_TEMPLATE_ID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Section Medication' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__HITSP_MEDICATIONS_SECTION_MEDICATION = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunizations Section Immunization' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Physical Exam Section Template Id' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Review Of Systems Section Template Id' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__HITSP_REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Course Section Template Id' of 'Hospital Course Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_COURSE_SECTION__HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Template Id' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Procedure' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_PROCEDURE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Result' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_RESULT = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Value Presence' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_VALUE_PRESENCE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Assessment And Plan Section Template Id' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Family History Section Template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__HITSP_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounters Section Template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounters Section Encounter' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__HITSP_ENCOUNTERS_SECTION_ENCOUNTER = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medical Equipment Section Template Id' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__HITSP_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Template Id' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_TEMPLATE_ID = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_CODE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Effective Time' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_EFFECTIVE_TIME = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Value' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_VALUE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Language Spoken No Proficiency Level Code' of 'Language Spoken'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_NO_PROFICIENCY_LEVEL_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Language Spoken Template Id' of 'Language Spoken'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_TEMPLATE_ID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Language Spoken Mode Code' of 'Language Spoken'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_MODE_CODE = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Template Id' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_TEMPLATE_ID = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Healthcare Provider Template Id' of 'Healthcare Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTHCARE_PROVIDER__HEALTHCARE_PROVIDER_TEMPLATE_ID = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunization Template Id' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__HITSP_IMMUNIZATION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__HITSP_COMMENT_TEMPLATE_ID = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medication Template Id' of 'Medication Tapered Dose'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_TAPERED_DOSE__HITSP_MEDICATION_TEMPLATE_ID = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Support Guardian Template Id' of 'Support Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPORT_GUARDIAN__HITSP_SUPPORT_GUARDIAN_TEMPLATE_ID = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Support Participant Template Id' of 'Support Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPORT_PARTICIPANT__HITSP_SUPPORT_PARTICIPANT_TEMPLATE_ID = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document No Structured Data' of 'Unstructured Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_NO_STRUCTURED_DATA = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Unstructured Document One Patient Per Document' of 'Unstructured Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNSTRUCTURED_DOCUMENT__UNSTRUCTURED_DOCUMENT_ONE_PATIENT_PER_DOCUMENT = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Scanned Document Template Id' of 'Unstructured Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UNSTRUCTURED_DOCUMENT__SCANNED_DOCUMENT_TEMPLATE_ID = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Information Template Id' of 'Medication Information'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_INFORMATION__MEDICATION_INFORMATION_TEMPLATE_ID = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounter Template Id' of 'Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER__HITSP_ENCOUNTER_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounter Code' of 'Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER__HITSP_ENCOUNTER_CODE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Template Id' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_TEMPLATE_ID = 15;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 91;

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
	protected IHEValidator iheValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDTValidator cdtValidator;

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
	public HITSPValidator() {
		super();
		ccdValidator = CCDValidator.INSTANCE;
		iheValidator = IHEValidator.INSTANCE;
		cdtValidator = CDTValidator.INSTANCE;
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
	  return HITSPPackage.eINSTANCE;
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
			case HITSPPackage.ALLERGY_DRUG_SENSITIVITY:
				return validateAllergyDrugSensitivity((AllergyDrugSensitivity)value, diagnostics, context);
			case HITSPPackage.MEDICATION:
				return validateMedication((Medication)value, diagnostics, context);
			case HITSPPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case HITSPPackage.CONDITION_ENTRY:
				return validateConditionEntry((ConditionEntry)value, diagnostics, context);
			case HITSPPackage.PATIENT_SUMMARY:
				return validatePatientSummary((PatientSummary)value, diagnostics, context);
			case HITSPPackage.PROBLEM_LIST_SECTION:
				return validateProblemListSection((ProblemListSection)value, diagnostics, context);
			case HITSPPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection)value, diagnostics, context);
			case HITSPPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection)value, diagnostics, context);
			case HITSPPackage.ALLERGIES_REACTIONS_SECTION:
				return validateAllergiesReactionsSection((AllergiesReactionsSection)value, diagnostics, context);
			case HITSPPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection)value, diagnostics, context);
			case HITSPPackage.ENCOUNTER:
				return validateEncounter((Encounter)value, diagnostics, context);
			case HITSPPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection)value, diagnostics, context);
			case HITSPPackage.IMMUNIZATION:
				return validateImmunization((Immunization)value, diagnostics, context);
			case HITSPPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection)value, diagnostics, context);
			case HITSPPackage.SURGERIES_SECTION:
				return validateSurgeriesSection((SurgeriesSection)value, diagnostics, context);
			case HITSPPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case HITSPPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection)value, diagnostics, context);
			case HITSPPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case HITSPPackage.DIAGNOSTIC_RESULTS_SECTION:
				return validateDiagnosticResultsSection((DiagnosticResultsSection)value, diagnostics, context);
			case HITSPPackage.RESULT:
				return validateResult((Result)value, diagnostics, context);
			case HITSPPackage.VITAL_SIGN:
				return validateVitalSign((VitalSign)value, diagnostics, context);
			case HITSPPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return validateHistoryOfPastIllnessSection((HistoryOfPastIllnessSection)value, diagnostics, context);
			case HITSPPackage.CHIEF_COMPLAINT_SECTION:
				return validateChiefComplaintSection((ChiefComplaintSection)value, diagnostics, context);
			case HITSPPackage.REASON_FOR_REFERRAL_SECTION:
				return validateReasonForReferralSection((ReasonForReferralSection)value, diagnostics, context);
			case HITSPPackage.HISTORY_OF_PRESENT_ILLNESS:
				return validateHistoryOfPresentIllness((HistoryOfPresentIllness)value, diagnostics, context);
			case HITSPPackage.FUNCTIONAL_STATUS_SECTION:
				return validateFunctionalStatusSection((FunctionalStatusSection)value, diagnostics, context);
			case HITSPPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION:
				return validateHospitalAdmissionDiagnosisSection((HospitalAdmissionDiagnosisSection)value, diagnostics, context);
			case HITSPPackage.DISCHARGE_DIAGNOSIS_SECTION:
				return validateDischargeDiagnosisSection((DischargeDiagnosisSection)value, diagnostics, context);
			case HITSPPackage.ADMISSION_MEDICATION_HISTORY_SECTION:
				return validateAdmissionMedicationHistorySection((AdmissionMedicationHistorySection)value, diagnostics, context);
			case HITSPPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION:
				return validateHospitalDischargeMedicationsSection((HospitalDischargeMedicationsSection)value, diagnostics, context);
			case HITSPPackage.MEDICATIONS_ADMINISTERED_SECTION:
				return validateMedicationsAdministeredSection((MedicationsAdministeredSection)value, diagnostics, context);
			case HITSPPackage.PHYSICAL_EXAM_SECTION:
				return validatePhysicalExamSection((PhysicalExamSection)value, diagnostics, context);
			case HITSPPackage.REVIEW_OF_SYSTEMS_SECTION:
				return validateReviewOfSystemsSection((ReviewOfSystemsSection)value, diagnostics, context);
			case HITSPPackage.HOSPITAL_COURSE_SECTION:
				return validateHospitalCourseSection((HospitalCourseSection)value, diagnostics, context);
			case HITSPPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection)value, diagnostics, context);
			case HITSPPackage.FAMILY_HISTORY_SECTION:
				return validateFamilyHistorySection((FamilyHistorySection)value, diagnostics, context);
			case HITSPPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case HITSPPackage.MEDICAL_EQUIPMENT_SECTION:
				return validateMedicalEquipmentSection((MedicalEquipmentSection)value, diagnostics, context);
			case HITSPPackage.LANGUAGE_SPOKEN:
				return validateLanguageSpoken((LanguageSpoken)value, diagnostics, context);
			case HITSPPackage.INSURANCE_PROVIDER:
				return validateInsuranceProvider((InsuranceProvider)value, diagnostics, context);
			case HITSPPackage.HEALTHCARE_PROVIDER:
				return validateHealthcareProvider((HealthcareProvider)value, diagnostics, context);
			case HITSPPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case HITSPPackage.MEDICATION_NORMAL_DOSE:
				return validateMedicationNormalDose((MedicationNormalDose)value, diagnostics, context);
			case HITSPPackage.MEDICATION_SPLIT_DOSE:
				return validateMedicationSplitDose((MedicationSplitDose)value, diagnostics, context);
			case HITSPPackage.MEDICATION_TAPERED_DOSE:
				return validateMedicationTaperedDose((MedicationTaperedDose)value, diagnostics, context);
			case HITSPPackage.MEDICATION_CONDITIONAL_DOSE:
				return validateMedicationConditionalDose((MedicationConditionalDose)value, diagnostics, context);
			case HITSPPackage.MEDICATION_COMBINATION_MEDICATION:
				return validateMedicationCombinationMedication((MedicationCombinationMedication)value, diagnostics, context);
			case HITSPPackage.SUPPORT:
				return validateSupport((Support)value, diagnostics, context);
			case HITSPPackage.SUPPORT_GUARDIAN:
				return validateSupportGuardian((SupportGuardian)value, diagnostics, context);
			case HITSPPackage.SUPPORT_PARTICIPANT:
				return validateSupportParticipant((SupportParticipant)value, diagnostics, context);
			case HITSPPackage.UNSTRUCTURED_DOCUMENT:
				return validateUnstructuredDocument((UnstructuredDocument)value, diagnostics, context);
			case HITSPPackage.MEDICATION_INFORMATION:
				return validateMedicationInformation((MedicationInformation)value, diagnostics, context);
			case HITSPPackage.HITSP_REGISTRY_DELEGATE:
				return validateHITSPRegistryDelegate((HITSPRegistryDelegate)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergyDrugSensitivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActClassCode(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActId(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryTemplateId(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTime(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateAllergyIntoleranceConcern_validateAllergyIntoleranceConcernTemplateId(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergyDrugSensitivity_validateAllergyDrugSensitivityTemplateId(allergyDrugSensitivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAllergyDrugSensitivityTemplateId constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_validateAllergyDrugSensitivityTemplateId(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.validateAllergyDrugSensitivityTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(medication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationConsumableName(medication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationTemplateId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationDoseQuantity(medication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRateQuantity(medication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRouteCode(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationTemplateId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationEffectiveTime(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationRouteCode(medication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationTemplateId constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationTemplateId(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationEffectiveTime constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationEffectiveTime(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationRouteCode constraint of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedication_validateHITSPMedicationRouteCode(Medication medication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medication.validateHITSPMedicationRouteCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEntryRelationshipRequired(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActSubjectOfTarget(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsProblemObservation(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsAlertObservation(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActContainsPatientAwareness(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActClassCode(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActMoodCode(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActCodeNullFlavor(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEffectiveTime(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_validateProblemActEpisodeObservation(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTimeLowHigh(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTime(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemConcernEntry_validateProblemConcernEntryTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemConcernEntry_validateProblemConcernEntryProblemEntry(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionHasTreatingProvider(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionHasProviderId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionHasProviderTreatmentTime(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionConditionEntry(condition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionHasTreatingProvider constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasTreatingProvider(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasTreatingProvider(diagnostics, context);
	}

	/**
	 * Validates the validateConditionHasProviderId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasProviderId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasProviderId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionHasProviderTreatmentTime constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionHasProviderTreatmentTime(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionHasProviderTreatmentTime(diagnostics, context);
	}

	/**
	 * Validates the validateConditionTemplateId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionTemplateId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateConditionConditionEntry constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionConditionEntry(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionConditionEntry(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientSummary, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventRequired(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventClassCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventEffectiveTime(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentNoTemplateIdExtension(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentOneOrTwoRecordTarget(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthor(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasInformationRecipient(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentTemplateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentProblemSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentFamilyHistorySection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentSocialHistorySection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentAlertsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicationsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentResultsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentProceduresSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentEncountersSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPlanOfCareSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentImmunizationsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentVitalSignsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicalEquipmentSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentFunctionalStatusSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentAdvanceDirectivesSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPayersSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_validateContinuityOfCareDocumentPurposeSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryTemplateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryAdvanceDirectivesSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryAllergiesReactionsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryProblemListSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryEncountersSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryImmunizationsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryPayersSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryMedicationsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummarySurgeriesSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryPlanOfCareSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryPregnancyHistorySection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryVitalSignsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryDiagnosticResultsSection(patientSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientSummaryTemplateId constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryTemplateId(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryAdvanceDirectivesSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryAdvanceDirectivesSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryAllergiesReactionsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryAllergiesReactionsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryAllergiesReactionsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryProblemListSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryProblemListSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryProblemListSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryEncountersSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryEncountersSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryEncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryImmunizationsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryImmunizationsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryPayersSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryPayersSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryPayersSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryMedicationsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryMedicationsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummarySurgeriesSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummarySurgeriesSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummarySurgeriesSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryPlanOfCareSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryPlanOfCareSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryPregnancyHistorySection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryPregnancyHistorySection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryPregnancyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryVitalSignsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryVitalSignsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validatePatientSummaryDiagnosticResultsSection constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_validatePatientSummaryDiagnosticResultsSection(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.validatePatientSummaryDiagnosticResultsSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsSection, diagnostics, context)) return false;
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
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignsSection_validateIHEVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedVitalSignsSection_validateCodedVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedVitalSignsSection_validateCodedVitalSignsSectionVitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateHITSPVitalSignsSectionVitalSigns(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateHITSPVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPVitalSignsSectionVitalSigns constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateHITSPVitalSignsSectionVitalSigns(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateHITSPVitalSignsSectionVitalSigns(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPVitalSignsSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateHITSPVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateHITSPVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSign, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationTemplateId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateResultObservationCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_validateResultObservationValue(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateSimpleObservation_validateSimpleObservationTemplateId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateSimpleObservation_validateSimpleObservationId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateSimpleObservation_validateSimpleObservationStatusCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationTemplateId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationInterpretationCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationMethodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationValue(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_validateVitalSignTemplateId(vitalSign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignTemplateId constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateVitalSignTemplateId(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSign.validateVitalSignTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_validateResultObservationCode(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateResultObservationCode", getObjectLabel(vitalSign, context) },
						 new Object[] { vitalSign },
						 context));
			}
			return false;
		}
		return iheValidator.validateVitalSignObservation_validateResultObservationCode(vitalSign, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payersSection, diagnostics, context)) return false;
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
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_validatePayersSectionText(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePayersSection_validatePayersSectionCoverageActivity(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePayersSection_validateIHEPayersSectionTemplateId(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePayersSection_validateIHEPayersSectionCoverageEntry(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validateHITSPPayersSectionTemplateId(payersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPPayersSectionTemplateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validateHITSPPayersSectionTemplateId(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validateHITSPPayersSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(allergiesReactionsSection, diagnostics, context)) return false;
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
		if (result || diagnostics != null) result &= iheValidator.validateAllergiesReactionsSection_validateAllergiesReactionsSectionTemplateId(allergiesReactionsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergiesReactionsSection_validateHITSPAllergiesReactionsSectionTemplateId(allergiesReactionsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPAllergiesReactionsSectionTemplateId constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_validateHITSPAllergiesReactionsSectionTemplateId(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergiesReactionsSection.validateHITSPAllergiesReactionsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemListSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionTemplateId(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionCode(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionTitle(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionText(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_validateProblemSectionProblemAct(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateActiveProblemsSection_validateActiveProblemsSectionTemplateId(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateActiveProblemsSection_validateActiveProblemsSectionProblemConcernEntry(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemListSection_validateProblemListSectionTemplateId(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemListSection_validateProblemListSectionCondition(problemListSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemListSectionTemplateId constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionTemplateId(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemListSectionCondition constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_validateProblemListSectionCondition(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.validateProblemListSectionCondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyOfPastIllnessSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionTemplateId(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPastIllnessSection_validateHistoryOfPastIllnessSectionCode(historyOfPastIllnessSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryOfPastIllnessSection_validateHITSPHistoryOfPastIllnessSectionTemplateId(historyOfPastIllnessSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPHistoryOfPastIllnessSectionTemplateId constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_validateHITSPHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPastIllnessSection.validateHITSPHistoryOfPastIllnessSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chiefComplaintSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateChiefComplaintSection_validateChiefComplaintSectionCode(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateChiefComplaintSection_validateHITSPChiefComplaintSectionTemplateId(chiefComplaintSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPChiefComplaintSectionTemplateId constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateHITSPChiefComplaintSectionTemplateId(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateHITSPChiefComplaintSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reasonForReferralSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateReasonForReferralSection_validateReasonForReferralSectionCode(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForReferralSection_validateHITSPReasonForReferralSectionTemplateId(reasonForReferralSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPReasonForReferralSectionTemplateId constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateHITSPReasonForReferralSectionTemplateId(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.validateHITSPReasonForReferralSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(historyOfPresentIllness, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryOfPresentIllness_validateHITSPHistoryOfPresentIllnessTemplateId(historyOfPresentIllness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPHistoryOfPresentIllnessTemplateId constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_validateHITSPHistoryOfPresentIllnessTemplateId(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyOfPresentIllness.validateHITSPHistoryOfPresentIllnessTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(surgeriesSection, diagnostics, context)) return false;
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
		if (result || diagnostics != null) result &= iheValidator.validateSurgeriesSection_validateSurgeriesSectionTemplateId(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedSurgeriesSection_validateCodedSurgeriesSectionTemplateId(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurgeriesSection_validateHITSPSurgeriesSectionTemplateId(surgeriesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurgeriesSection_validateHITSPSurgeriesSectionProcedure(surgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPSurgeriesSectionTemplateId constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateHITSPSurgeriesSectionTemplateId(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateHITSPSurgeriesSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPSurgeriesSectionProcedure constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_validateHITSPSurgeriesSectionProcedure(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return surgeriesSection.validateHITSPSurgeriesSectionProcedure(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalStatusSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionClinicalStatements(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCode(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateHITSPFunctionalStatusSectionTemplateId(functionalStatusSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPFunctionalStatusSectionTemplateId constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateHITSPFunctionalStatusSectionTemplateId(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateHITSPFunctionalStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalAdmissionDiagnosisSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionTemplateId(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHospitalAdmissionDiagnosisSection_validateHospitalAdmissionDiagnosisSectionCode(hospitalAdmissionDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalAdmissionDiagnosisSection_validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(hospitalAdmissionDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPHospitalAdmissionDiagnosisSectionTemplateId constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalAdmissionDiagnosisSection.validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dischargeDiagnosisSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionTemplateId(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateDischargeDiagnosisSection_validateDischargeDiagnosisSectionCode(dischargeDiagnosisSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDischargeDiagnosisSection_validateHITSPDischargeDiagnosisSectionTemplateId(dischargeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPDischargeDiagnosisSectionTemplateId constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_validateHITSPDischargeDiagnosisSectionTemplateId(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dischargeDiagnosisSection.validateHITSPDischargeDiagnosisSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionCode(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionTitle(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationsSection_validateMedicationsSectionText(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicationsSection_validateIHEMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicationsSection_validateIHEMedicationsSectionMedication(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateHITSPMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateHITSPMedicationsSectionMedication(medicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationsSectionTemplateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateHITSPMedicationsSectionTemplateId(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateHITSPMedicationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPMedicationsSectionMedication constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateHITSPMedicationsSectionMedication(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateHITSPMedicationsSectionMedication(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(admissionMedicationHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionTemplateId(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateAdmissionMedicationHistorySection_validateAdmissionMedicationHistorySectionCode(admissionMedicationHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdmissionMedicationHistorySection_validateHITSPAdmissionMedicationHistorySectionTemplateId(admissionMedicationHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPAdmissionMedicationHistorySectionTemplateId constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_validateHITSPAdmissionMedicationHistorySectionTemplateId(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return admissionMedicationHistorySection.validateHITSPAdmissionMedicationHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalDischargeMedicationsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionTemplateId(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHospitalDischargeMedicationsSection_validateHospitalDischargeMedicationsSectionCode(hospitalDischargeMedicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalDischargeMedicationsSection_validateHITSPHospitalDischargeMedicationsSectionTemplateId(hospitalDischargeMedicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPHospitalDischargeMedicationsSectionTemplateId constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_validateHITSPHospitalDischargeMedicationsSectionTemplateId(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalDischargeMedicationsSection.validateHITSPHospitalDischargeMedicationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection(MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsAdministeredSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionTemplateId(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicationsAdministeredSection_validateMedicationsAdministeredSectionCode(medicationsAdministeredSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsAdministeredSection_validateHITSPMedicationsAdministeredSectionTemplateId(medicationsAdministeredSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationsAdministeredSectionTemplateId constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_validateHITSPMedicationsAdministeredSectionTemplateId(MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsAdministeredSection.validateHITSPMedicationsAdministeredSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectivesSection, diagnostics, context)) return false;
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
		if (result || diagnostics != null) result &= iheValidator.validateAdvanceDirectivesSection_validateIHEAdvanceDirectivesSectionTemplateId(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedAdvanceDirectivesSection_validateCodedAdvanceDirectivesSectionTemplateId(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_validateHITSPAdvanceDirectivesSectionTemplateId(advanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPAdvanceDirectivesSectionTemplateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateHITSPAdvanceDirectivesSectionTemplateId(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateHITSPAdvanceDirectivesSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunizationsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionClinicalStatements(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTemplateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionCode(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionTitle(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_validateImmunizationsSectionText(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateImmunizationsSection_validateIHEImmunizationsSectionTemplateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateImmunizationsSection_validateIHEImmunizationsSectionImmunization(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateHITSPImmunizationsSectionTemplateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateHITSPImmunizationsSectionImmunization(immunizationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPImmunizationsSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateHITSPImmunizationsSectionTemplateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateHITSPImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPImmunizationsSectionImmunization constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateHITSPImmunizationsSectionImmunization(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateHITSPImmunizationsSectionImmunization(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection(PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physicalExamSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionTemplateId(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamNarrativeSection_validatePhysicalExamNarrativeSectionCode(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamSection_validatePhysicalExamSectionTemplateId(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExamSection_validateHITSPPhysicalExamSectionTemplateId(physicalExamSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPPhysicalExamSectionTemplateId constraint of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExamSection_validateHITSPPhysicalExamSectionTemplateId(PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExamSection.validateHITSPPhysicalExamSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reviewOfSystemsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReviewOfSystemsSection_validateHITSPReviewOfSystemsSectionTemplateId(reviewOfSystemsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPReviewOfSystemsSectionTemplateId constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateHITSPReviewOfSystemsSectionTemplateId(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateHITSPReviewOfSystemsSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection(HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hospitalCourseSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHospitalCourseSection_validateHospitalCourseSectionTemplateId(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHospitalCourseSection_validateHospitalCourseSectionCode(hospitalCourseSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateHospitalCourseSection_validateHITSPHospitalCourseSectionTemplateId(hospitalCourseSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPHospitalCourseSectionTemplateId constraint of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalCourseSection_validateHITSPHospitalCourseSectionTemplateId(HospitalCourseSection hospitalCourseSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hospitalCourseSection.validateHITSPHospitalCourseSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diagnosticResultsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionTemplateId(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionCode(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionExternalReference(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionSimpleObservation(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionTemplateId(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionProcedure(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionResult(diagnosticResultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDiagnosticResultsSectionTemplateId constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionTemplateId(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionProcedure constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionProcedure(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionProcedure(diagnostics, context);
	}

	/**
	 * Validates the validateDiagnosticResultsSectionResult constraint of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticResultsSection_validateDiagnosticResultsSectionResult(DiagnosticResultsSection diagnosticResultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticResultsSection.validateDiagnosticResultsSectionResult(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessmentAndPlanSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionTemplateId(assessmentAndPlanSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPAssessmentAndPlanSectionTemplateId constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateHITSPAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateHITSPAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionTitle(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCarePlanSection_validateCarePlanSectionTemplateId(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validateHITSPPlanOfCareSectionTemplateId(planOfCareSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPPlanOfCareSectionTemplateId constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validateHITSPPlanOfCareSectionTemplateId(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validateHITSPPlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionCode(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFamilyHistorySection_validateFamilyHistorySectionTitle(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateFamilyMedicalHistorySection_validateFamilyMedicalHistorySectionTemplateId(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_validateHITSPFamilyHistorySectionTemplateId(familyHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPFamilyHistorySectionTemplateId constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateHITSPFamilyHistorySectionTemplateId(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateHITSPFamilyHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistorySection, diagnostics, context)) return false;
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
		if (result || diagnostics != null) result &= iheValidator.validateSocialHistorySection_validateIHESocialHistorySectionTemplateId(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_validateHITSPSocialHistorySectionTemplateId(socialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateHITSPSocialHistorySectionTemplateId(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateHITSPSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionTemplateId(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionCode(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersSection_validateEncountersSectionTitle(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterHistorySection_validateEncounterHistorySectionTemplateId(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterHistorySection_validateEncounterHistorySectionEncounterEntry(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateHITSPEncountersSectionTemplateId(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateHITSPEncountersSectionEncounter(encountersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPEncountersSectionTemplateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateHITSPEncountersSectionTemplateId(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateHITSPEncountersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPEncountersSectionEncounter constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateHITSPEncountersSectionEncounter(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateHITSPEncountersSectionEncounter(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicalEquipmentSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalDevicesSection_validateMedicalDevicesSectionTemplateId(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalEquipmentSection_validateHITSPMedicalEquipmentSectionTemplateId(medicalEquipmentSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPMedicalEquipmentSectionTemplateId constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateHITSPMedicalEquipmentSectionTemplateId(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateHITSPMedicalEquipmentSectionTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateResult(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean theResult = validate_EveryMultiplicityConforms(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryDataValueConforms(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryReferenceIsContained(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryProxyResolves(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_UniqueID(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryKeyUnique(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryMapEntryUnique(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationReferenceRangeRequired(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationNoObservationRangeCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationInformationSource(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationTemplateId(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationMoodCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationId(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationEffectiveTime(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationStatusCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationMethodCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationInterpretationCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= ccdValidator.validateResultObservation_validateResultObservationValue(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= iheValidator.validateSimpleObservation_validateSimpleObservationTemplateId(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= iheValidator.validateSimpleObservation_validateSimpleObservationId(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= iheValidator.validateSimpleObservation_validateSimpleObservationStatusCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultTemplateId(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultCode(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validateResult_validateResultEffectiveTime(result, diagnostics, context);
		return theResult;
	}

	/**
	 * Validates the validateResultValuePresence constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultValuePresence(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultValuePresence(diagnostics, context);
	}

	/**
	 * Validates the validateResultTemplateId constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultTemplateId(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultCode constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultCode(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultEffectiveTime constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultEffectiveTime(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateResultValue constraint of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult_validateResultValue(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return result.validateResultValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken(LanguageSpoken languageSpoken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(languageSpoken, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateLanguageCommunication_validateIHELanguageCommunicationTemplateId(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageSpoken_validateLanguageSpokenNoProficiencyLevelCode(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageSpoken_validateLanguageSpokenTemplateId(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageSpoken_validateLanguageSpokenModeCode(languageSpoken, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLanguageSpokenNoProficiencyLevelCode constraint of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken_validateLanguageSpokenNoProficiencyLevelCode(LanguageSpoken languageSpoken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageSpoken.validateLanguageSpokenNoProficiencyLevelCode(diagnostics, context);
	}

	/**
	 * Validates the validateLanguageSpokenTemplateId constraint of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken_validateLanguageSpokenTemplateId(LanguageSpoken languageSpoken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageSpoken.validateLanguageSpokenTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateLanguageSpokenModeCode constraint of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken_validateLanguageSpokenModeCode(LanguageSpoken languageSpoken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return languageSpoken.validateLanguageSpokenModeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider(InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(insuranceProvider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityInformationSource(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivitySequenceNumber(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityTemplateId(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityClassCode(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityMoodCode(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityId(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityStatusCode(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityCode(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateCoverageActivity_validateCoverageActivityPolicyActivity(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCoverageEntry_validateCoverageEntryTemplateId(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validateInsuranceProvider_validateInsuranceProviderTemplateId(insuranceProvider, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInsuranceProviderTemplateId constraint of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider_validateInsuranceProviderTemplateId(InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return insuranceProvider.validateInsuranceProviderTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvider(HealthcareProvider healthcareProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthcareProvider, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHealthcareProvidersPharmacies_validateHealthcareProvidersPharmaciesTemplateId(healthcareProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthcareProvider_validateHealthcareProviderTemplateId(healthcareProvider, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHealthcareProviderTemplateId constraint of '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcareProvider_validateHealthcareProviderTemplateId(HealthcareProvider healthcareProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthcareProvider.validateHealthcareProviderTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateImmunization_validateImmunizationTemplateId(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunization_validateHITSPImmunizationTemplateId(immunization, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPImmunizationTemplateId constraint of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunization_validateHITSPImmunizationTemplateId(Immunization immunization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunization.validateHITSPImmunizationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateCommentTemplateId(comment, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateComment_validateCommentClassCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateComment_validateCommentMoodCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateComment_validateCommentCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateIHECommentHasTextReference(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateIHECommentStatusCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateIHECommentText(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateHITSPCommentTemplateId(comment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPCommentTemplateId constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateHITSPCommentTemplateId(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateHITSPCommentTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationNormalDose(MedicationNormalDose medicationNormalDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationNormalDose, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationConsumableName(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationTemplateId(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationDoseQuantity(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRateQuantity(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRouteCode(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationTemplateId(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationEffectiveTime(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationRouteCode(medicationNormalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateNormalDose_validateNormalDoseTemplateId(medicationNormalDose, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSplitDose(MedicationSplitDose medicationSplitDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationSplitDose, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationConsumableName(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationTemplateId(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationDoseQuantity(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRateQuantity(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRouteCode(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationTemplateId(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationEffectiveTime(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationRouteCode(medicationSplitDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateSplitDose_validateSplitDoseTemplateId(medicationSplitDose, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDose(MedicationTaperedDose medicationTaperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationTaperedDose, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationConsumableName(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationTemplateId(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationDoseQuantity(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRateQuantity(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRouteCode(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationTaperedDose_validateHITSPMedicationTemplateId(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationEffectiveTime(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationRouteCode(medicationTaperedDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateTaperedDose_validateTaperedDoseTemplateId(medicationTaperedDose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPMedicationTemplateId constraint of '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationTaperedDose_validateHITSPMedicationTemplateId(MedicationTaperedDose medicationTaperedDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateHITSPMedicationTemplateId", getObjectLabel(medicationTaperedDose, context) },
						 new Object[] { medicationTaperedDose },
						 context));
			}
			return false;
		}
		return validateMedication_validateHITSPMedicationTemplateId(medicationTaperedDose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationConditionalDose(MedicationConditionalDose medicationConditionalDose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationConditionalDose, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationConsumableName(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationTemplateId(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationDoseQuantity(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRateQuantity(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRouteCode(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConditionalDose_validateConditionalDoseTemplateId(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationTemplateId(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationEffectiveTime(medicationConditionalDose, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationRouteCode(medicationConditionalDose, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationCombinationMedication(MedicationCombinationMedication medicationCombinationMedication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationCombinationMedication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasConsents(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityInformationSource(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReason(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityHasReasonProblem(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityEffectiveTime(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityRouteCode(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityPatientInstruction(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationConsumableName(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationTemplateId(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationApproachSiteCode(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationDoseQuantity(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRateQuantity(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationRouteCode(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCombinationMedication_validateCombinationMedicationTemplateId(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationTemplateId(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationEffectiveTime(medicationCombinationMedication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationRouteCode(medicationCombinationMedication, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureHasTextReference(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureTemplateId(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureApproachSiteCode(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureCode(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureEffectiveTime(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureId(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureStatusCode(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureTargetSiteCode(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProcedureEntryProcedureActivityProcedure_validateProcedureEntryProcedureActivityProcedureText(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedure_validateHITSPProcedureHasCodeCode(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedure_validateHITSPProcedureHasCodeOriginalText(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedure_validateHITSPProcedurePerformerAssignedEntity(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedure_validateHITSPProcedureTemplateId(procedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedure_validateHITSPProcedureTargetSiteCode(procedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPProcedureHasCodeCode constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureHasCodeCode(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedureHasCodeCode(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedureHasCodeOriginalText constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureHasCodeOriginalText(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedureHasCodeOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedurePerformerAssignedEntity constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedurePerformerAssignedEntity(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedurePerformerAssignedEntity(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedureTemplateId constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureTemplateId(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedureTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPProcedureTargetSiteCode constraint of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure_validateHITSPProcedureTargetSiteCode(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedure.validateHITSPProcedureTargetSiteCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupport(Support support, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(support, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardian(SupportGuardian supportGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportGuardian, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateGuardian_validateGuardianChoice(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianTemplateId(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianAddr(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianClassCode(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianCode(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactGuardian_validatePatientContactGuardianTelecom(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupportGuardian_validateHITSPSupportGuardianTemplateId(supportGuardian, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPSupportGuardianTemplateId constraint of '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardian_validateHITSPSupportGuardianTemplateId(SupportGuardian supportGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supportGuardian.validateHITSPSupportGuardianTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportParticipant(SupportParticipant supportParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportParticipant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactParticipant_validatePatientContactParticipantTemplateId(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactParticipant_validatePatientContactParticipantTime(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePatientContactParticipant_validatePatientContactParticipantTypeCode(supportParticipant, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupportParticipant_validateHITSPSupportParticipantTemplateId(supportParticipant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPSupportParticipantTemplateId constraint of '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportParticipant_validateHITSPSupportParticipantTemplateId(SupportParticipant supportParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supportParticipant.validateHITSPSupportParticipantTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument(UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(unstructuredDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsPersonHasName(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShallHaveAddrAndTelecom(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRolesShouldHaveAddrAndTelecom(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOrganizationsHaveContactInfo(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToDay(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYear(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTelephoneMatchesRegex(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasTelephoneDialingDigits(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUnknownTelephoneUsesNullFlavor(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeIdExtension(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsOidLength(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndVersionNumber(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetIdAndIdAreUnique(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCopyTimeNotPresent(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasRecordTargetPatientRole(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasPatientBirthTime(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAdministrativeGenderCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasProviderOrganization(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAuthorTime(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasDataEntererTime(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformant(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToSecond(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTimePreciseToYearAndDay(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= cdtValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentTypeIdFixed(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasOneRecordTarget(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasAssignedAuthor(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentPatientRoleId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientRoleAddress(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientName(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientGenderCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasPatientBirthYear(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasOriginalAuthor(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasScanningDevice(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasScanDataEnterer(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationName(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasRepresentedCustodianOrganizationAddr(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentLegalAuthenticatorAssignedEntityId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBody(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyBinaryText(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextMediaType(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentHasNonXMLBodyTextRepresentation(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnstructuredDocument_validateScannedDocumentTemplateId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentConfidentialityCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentEffectiveTime(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentLanguageCode(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentTitle(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateScannedDocument_validateScannedDocumentTypeId(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentNoStructuredData(unstructuredDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnstructuredDocument_validateUnstructuredDocumentOnePatientPerDocument(unstructuredDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateUnstructuredDocumentNoStructuredData constraint of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentNoStructuredData(UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unstructuredDocument.validateUnstructuredDocumentNoStructuredData(diagnostics, context);
	}

	/**
	 * Validates the validateUnstructuredDocumentOnePatientPerDocument constraint of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument_validateUnstructuredDocumentOnePatientPerDocument(UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return unstructuredDocument.validateUnstructuredDocumentOnePatientPerDocument(diagnostics, context);
	}

	/**
	 * Validates the validateScannedDocumentTemplateId constraint of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocument_validateScannedDocumentTemplateId(UnstructuredDocument unstructuredDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateScannedDocumentTemplateId", getObjectLabel(unstructuredDocument, context) },
						 new Object[] { unstructuredDocument },
						 context));
			}
			return false;
		}
		return iheValidator.validateScannedDocument_validateScannedDocumentTemplateId(unstructuredDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation(MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationInformation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProduct_validateProductTemplateId(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProductEntry_validateProductEntryTemplateId(medicationInformation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationInformation_validateMedicationInformationTemplateId(medicationInformation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationInformationTemplateId constraint of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationInformation_validateMedicationInformationTemplateId(MedicationInformation medicationInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationInformation.validateMedicationInformationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterEntry_validateEncounterEntryTemplateId(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterEntry_validateEncounterEntryClassCode(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterEntry_validateEncounterEntryCode(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterEntry_validateEncounterEntryId(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterEntry_validateEncounterEntryText(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateEncounterActivity_validateEncountersActivityTemplateId(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersActivity_validateEncountersActivityClassCode(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersActivity_validateEncountersActivityMoodCode(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersActivity_validateEncountersActivityId(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateEncountersActivity_validateEncountersActivityEffectiveTime(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounter_validateHITSPEncounterTemplateId(encounter, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounter_validateHITSPEncounterCode(encounter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHITSPEncounterTemplateId constraint of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter_validateHITSPEncounterTemplateId(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounter.validateHITSPEncounterTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateHITSPEncounterCode constraint of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter_validateHITSPEncounterCode(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounter.validateHITSPEncounterCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPRegistryDelegate(HITSPRegistryDelegate hitspRegistryDelegate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hitspRegistryDelegate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionEntry, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationInformationSource(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationContainsPatientAwareness(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationTemplateId(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationMoodCode(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationStatusCode(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationEffectiveTime(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemStatusObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationProblemHealthStatusObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemObservation_validateProblemObservationAgeObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryHasTextReference(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryCommentInversionInd(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryTemplateId(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryCode(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryEffectiveTime(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryId(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryText(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateProblemEntryValue(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntrySeverity(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryProblemStatusObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryHealthStatusObservation(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryComment(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHasOnsetDate(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHasResolutionDate(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryHasUnknownResolutionDate(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryCode(conditionEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionEntryHasOnsetDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasOnsetDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasOnsetDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasResolutionDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasResolutionDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasResolutionDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryHasUnknownResolutionDate constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryHasUnknownResolutionDate(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryHasUnknownResolutionDate(diagnostics, context);
	}

	/**
	 * Validates the validateConditionEntryCode constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemEntryValue constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateProblemEntryValue(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateProblemEntryValue", getObjectLabel(conditionEntry, context) },
						 new Object[] { conditionEntry },
						 context));
			}
			return false;
		}
		return iheValidator.validateProblemEntry_validateProblemEntryValue(conditionEntry, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HITSPPlugin.INSTANCE;
	}

} //HITSPValidator
