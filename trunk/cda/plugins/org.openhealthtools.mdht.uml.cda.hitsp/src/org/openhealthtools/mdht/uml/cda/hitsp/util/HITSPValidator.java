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
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
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
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Template Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Text' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEXT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Condition Entry' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_CONDITION_ENTRY = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Template Id' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Advance Directives Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Allergies Reactions Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Problem List Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_PROBLEM_LIST_SECTION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Summary Encounters Section' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_ENCOUNTERS_SECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Vital Signs Section Vital Signs' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Sign Template Id' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__RESULT_OBSERVATION_CODE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Payers Section Template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__HITSP_PAYERS_SECTION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Allergies Reactions Section Template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__HITSP_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Template Id' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem List Section Condition' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_CONDITION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP History Of Past Illness Section Template Id' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HITSP_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Chief Complaint Section Template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Reason For Referral Section Template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__HITSP_REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP History Of Present Illness Template Id' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HITSP_HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Surgeries Section Template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__HITSP_SURGERIES_SECTION_TEMPLATE_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Functional Status Section Template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__HITSP_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Admission Diagnosis Section Template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Discharge Diagnosis Section Template Id' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__HITSP_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__HITSP_MEDICATIONS_SECTION_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Admission Medication History Section Template Id' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__HITSP_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Discharge Medications Section Template Id' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HITSP_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medications Administered Section Template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__HITSP_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 31;

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
	public static final int IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunizations Section Immunization' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__HITSP_IMMUNIZATIONS_SECTION_IMMUNIZATION = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Physical Exam Section Template Id' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Review Of Systems Section Template Id' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__HITSP_REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Hospital Course Section Template Id' of 'Hospital Course Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_COURSE_SECTION__HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Results Section Template Id' of 'Diagnostic Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_RESULTS_SECTION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Assessment And Plan Section Template Id' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Family History Section Template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__HITSP_SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Encounters Section Template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__HITSP_ENCOUNTERS_SECTION_TEMPLATE_ID = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Medical Equipment Section Template Id' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__HITSP_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Template Id' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Code' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_CODE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Effective Time' of 'Result'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT__RESULT_EFFECTIVE_TIME = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Language Spoken Template Id' of 'Language Spoken'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANGUAGE_SPOKEN__LANGUAGE_SPOKEN_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Insurance Provider Template Id' of 'Insurance Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSURANCE_PROVIDER__INSURANCE_PROVIDER_TEMPLATE_ID = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Healthcare Provider Template Id' of 'Healthcare Provider'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTHCARE_PROVIDER__HEALTHCARE_PROVIDER_TEMPLATE_ID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Immunization Template Id' of 'Immunization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATION__HITSP_IMMUNIZATION_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate HITSP Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__HITSP_COMMENT_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Condition Entry Effective Time' of 'Condition Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION_ENTRY__CONDITION_ENTRY_EFFECTIVE_TIME = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 52;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HITSPValidator() {
		super();
		ccdValidator = CCDValidator.INSTANCE;
		iheValidator = IHEValidator.INSTANCE;
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
			case HITSPPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case HITSPPackage.VITAL_SIGN:
				return validateVitalSign((VitalSign)value, diagnostics, context);
			case HITSPPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection)value, diagnostics, context);
			case HITSPPackage.ALLERGIES_REACTIONS_SECTION:
				return validateAllergiesReactionsSection((AllergiesReactionsSection)value, diagnostics, context);
			case HITSPPackage.HISTORY_OF_PAST_ILLNESS_SECTION:
				return validateHistoryOfPastIllnessSection((HistoryOfPastIllnessSection)value, diagnostics, context);
			case HITSPPackage.CHIEF_COMPLAINT_SECTION:
				return validateChiefComplaintSection((ChiefComplaintSection)value, diagnostics, context);
			case HITSPPackage.REASON_FOR_REFERRAL_SECTION:
				return validateReasonForReferralSection((ReasonForReferralSection)value, diagnostics, context);
			case HITSPPackage.HISTORY_OF_PRESENT_ILLNESS:
				return validateHistoryOfPresentIllness((HistoryOfPresentIllness)value, diagnostics, context);
			case HITSPPackage.SURGERIES_SECTION:
				return validateSurgeriesSection((SurgeriesSection)value, diagnostics, context);
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
			case HITSPPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection)value, diagnostics, context);
			case HITSPPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection)value, diagnostics, context);
			case HITSPPackage.PHYSICAL_EXAM_SECTION:
				return validatePhysicalExamSection((PhysicalExamSection)value, diagnostics, context);
			case HITSPPackage.REVIEW_OF_SYSTEMS_SECTION:
				return validateReviewOfSystemsSection((ReviewOfSystemsSection)value, diagnostics, context);
			case HITSPPackage.HOSPITAL_COURSE_SECTION:
				return validateHospitalCourseSection((HospitalCourseSection)value, diagnostics, context);
			case HITSPPackage.DIAGNOSTIC_RESULTS_SECTION:
				return validateDiagnosticResultsSection((DiagnosticResultsSection)value, diagnostics, context);
			case HITSPPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection)value, diagnostics, context);
			case HITSPPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection)value, diagnostics, context);
			case HITSPPackage.FAMILY_HISTORY_SECTION:
				return validateFamilyHistorySection((FamilyHistorySection)value, diagnostics, context);
			case HITSPPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case HITSPPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection)value, diagnostics, context);
			case HITSPPackage.MEDICAL_EQUIPMENT_SECTION:
				return validateMedicalEquipmentSection((MedicalEquipmentSection)value, diagnostics, context);
			case HITSPPackage.RESULT:
				return validateResult((Result)value, diagnostics, context);
			case HITSPPackage.LANGUAGE_SPOKEN:
				return validateLanguageSpoken((LanguageSpoken)value, diagnostics, context);
			case HITSPPackage.INSURANCE_PROVIDER:
				return validateInsuranceProvider((InsuranceProvider)value, diagnostics, context);
			case HITSPPackage.HEALTHCARE_PROVIDER:
				return validateHealthcareProvider((HealthcareProvider)value, diagnostics, context);
			case HITSPPackage.IMMUNIZATION:
				return validateImmunization((Immunization)value, diagnostics, context);
			case HITSPPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateMedication_validateMedicationTemplateId(medication, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedication_validateHITSPMedicationTemplateId(medication, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_validateConcernEntryEffectiveTime(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemConcernEntry_validateProblemConcernEntryTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemConcernEntry_validateProblemConcernEntryProblemEntry(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionTemplateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionText(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_validateConditionConditionEntry(condition, diagnostics, context);
		return result;
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
	 * Validates the validateConditionText constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_validateConditionText(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.validateConditionText(diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateMedicalDocument_validateMedicalDocumentTemplateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalSummary_validateMedicalSummaryProblemConcernEntry(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalSummary_validateMedicalSummaryAllergyConcernEntry(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalSummary_validateMedicalSummaryMedications(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalSummary_validateMedicalSummaryTemplateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateMedicalSummary_validateMedicalSummaryCode(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryTemplateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryAdvanceDirectivesSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryAllergiesReactionsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryProblemListSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_validatePatientSummaryEncountersSection(patientSummary, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationValue(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationInterpretationCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationMethodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_validateVitalSignObservationTargetSiteCode(vitalSign, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionCode(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionProblemAct(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_validateFunctionalStatusSectionResultOrganizer(functionalStatusSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateMedicationsSection_validateIHEMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateHITSPMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
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
		boolean result = validate_EveryMultiplicityConforms(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionTemplateId(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedResultsSection_validateCodedResultsSectionCode(diagnosticResultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticResultsSection_validateDiagnosticResultsSectionTemplateId(diagnosticResultsSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateEncountersSection_validateHITSPEncountersSectionTemplateId(encountersSection, diagnostics, context);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageSpoken(LanguageSpoken languageSpoken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateLanguageCommunication_validateIHELanguageCommunicationTemplateId(languageSpoken, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguageSpoken_validateLanguageSpokenTemplateId(languageSpoken, diagnostics, context);
		return result;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceProvider(InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(insuranceProvider, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(insuranceProvider, diagnostics, context);
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
		boolean result = validate_EveryMultiplicityConforms(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityMoodCode(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityTemplateId(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityId(immunization, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateMedicationActivity_validateMedicationActivityStatusCode(immunization, diagnostics, context);
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
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateCommentTemplateId(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateCommentClassCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateCommentCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateCommentStatusCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateComment_validateCommentText(comment, diagnostics, context);
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
	public boolean validateConditionEntry(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryTemplateId(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryText(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemEntry_validateProblemEntryValue(conditionEntry, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionEntry_validateConditionEntryEffectiveTime(conditionEntry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConditionEntryEffectiveTime constraint of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntry_validateConditionEntryEffectiveTime(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionEntry.validateConditionEntryEffectiveTime(diagnostics, context);
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
