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
import org.openhealthtools.mdht.uml.cda.hitsp.*;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergy Drug Sensitivity template Id' of 'Allergy Drug Sensitivity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGY_DRUG_SENSITIVITY__ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication template Id' of 'Medication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION__MEDICATION_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Condition template Id' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEMPLATE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Condition text' of 'Condition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITION__CONDITION_TEXT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Summary template Id' of 'Patient Summary'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_SUMMARY__PATIENT_SUMMARY_TEMPLATE_ID = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'HITSP Vital Signs Section vital Signs' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__HITSP_VITAL_SIGNS_SECTION_VITAL_SIGNS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Section template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Sign template Id' of 'Vital Sign'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGN__VITAL_SIGN_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Payers Section template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TEMPLATE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Allergies Reactions Section template Id' of 'Allergies Reactions Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALLERGIES_REACTIONS_SECTION__ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem List Section template Id' of 'Problem List Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_LIST_SECTION__PROBLEM_LIST_SECTION_TEMPLATE_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'History Of Past Illness Section template Id' of 'History Of Past Illness Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Chief Complaint Section template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reason For Referral Section template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'History Of Present Illness template Id' of 'History Of Present Illness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_OF_PRESENT_ILLNESS__HISTORY_OF_PRESENT_ILLNESS_TEMPLATE_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Surgeries Section template Id' of 'Surgeries Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SURGERIES_SECTION__SURGERIES_SECTION_TEMPLATE_ID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Section template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hospital Admission Diagnosis Section template Id' of 'Hospital Admission Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Discharge Diagnosis Section template Id' of 'Discharge Diagnosis Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISCHARGE_DIAGNOSIS_SECTION__DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medications Section template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TEMPLATE_ID = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Admission Medication History Section template Id' of 'Admission Medication History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADMISSION_MEDICATION_HISTORY_SECTION__ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Hospital Discharge Medications Section template Id' of 'Hospital Discharge Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medications Administered Section template Id' of 'Medications Administered Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_ADMINISTERED_SECTION__MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directives Section template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Immunizations Section template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Physical Exam Section template Id' of 'Physical Exam Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID = 26;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 26;

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
			case HITSPPackage.PATIENT_SUMMARY:
				return validatePatientSummary((PatientSummary)value, diagnostics, context);
			case HITSPPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case HITSPPackage.VITAL_SIGN:
				return validateVitalSign((VitalSign)value, diagnostics, context);
			case HITSPPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection)value, diagnostics, context);
			case HITSPPackage.ALLERGIES_REACTIONS_SECTION:
				return validateAllergiesReactionsSection((AllergiesReactionsSection)value, diagnostics, context);
			case HITSPPackage.PROBLEM_LIST_SECTION:
				return validateProblemListSection((ProblemListSection)value, diagnostics, context);
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
			case HITSPPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection)value, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_classCode(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_moodCode(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_id(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code_nullFlavor(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_problemObservation(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_ConcernEntry_templateId(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_ConcernEntry_effectiveTime(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateAllergyIntoleranceConcern_AllergyIntoleranceConcern_templateId(allergyDrugSensitivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAllergyDrugSensitivity_AllergyDrugSensitivity_templateId(allergyDrugSensitivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AllergyDrugSensitivity_templateId constraint of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivity_AllergyDrugSensitivity_templateId(AllergyDrugSensitivity allergyDrugSensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return allergyDrugSensitivity.AllergyDrugSensitivity_templateId(diagnostics, context);
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
						 new Object[] { "Medication_templateId", getObjectLabel(medication, context) },
						 new Object[] { medication },
						 context));
			}
			return false;
		}
		return iheValidator.validateMedication_Medication_templateId(medication, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_templateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_classCode(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_moodCode(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_id(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_code_nullFlavor(condition, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemAct_ProblemAct_problemObservation(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_ConcernEntry_templateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateConcernEntry_ConcernEntry_effectiveTime(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemConcernEntry_ProblemConcernEntry_templateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateProblemConcernEntry_ProblemConcernEntry_problemEntry(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_Condition_templateId(condition, diagnostics, context);
		if (result || diagnostics != null) result &= validateCondition_Condition_text(condition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Condition_templateId constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_Condition_templateId(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.Condition_templateId(diagnostics, context);
	}

	/**
	 * Validates the Condition_text constraint of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition_Condition_text(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return condition.Condition_text(diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_templateId(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_code(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_problemSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_familyHistorySection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_socialHistorySection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_alertsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_medicationSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_resultsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_proceduresSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_encountersSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_planOfCareSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_immunizationsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_vitalSignsSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_medicalEquipmentSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_functionalStatusSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_advanceDirectivesSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_payersSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateContinuityOfCareDocument_ContinuityOfCareDocument_purposeSection(patientSummary, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientSummary_PatientSummary_templateId(patientSummary, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PatientSummary_templateId constraint of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSummary_PatientSummary_templateId(PatientSummary patientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientSummary.PatientSummary_templateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateCodedVitalSignsSection_CodedVitalSignsSection_templateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateCodedVitalSignsSection_CodedVitalSignsSection_vitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_HITSPVitalSignsSection_vitalSigns(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HITSPVitalSignsSection_vitalSigns constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_HITSPVitalSignsSection_vitalSigns(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.HITSPVitalSignsSection_vitalSigns(diagnostics, context);
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
		return iheValidator.validateVitalSignsSection_VitalSignsSection_templateId(vitalSignsSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_templateId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_moodCode(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_id(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_effectiveTime(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultObservation_ResultObservation_value(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_VitalSignObservation_templateId(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_VitalSignObservation_code(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateVitalSignObservation_VitalSignObservation_value(vitalSign, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSign_VitalSign_templateId(vitalSign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VitalSign_templateId constraint of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSign_VitalSign_templateId(VitalSign vitalSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSign.VitalSign_templateId(diagnostics, context);
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
		return iheValidator.validatePayersSection_PayersSection_templateId(payersSection, diagnostics, context);
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
		return result;
	}

	/**
	 * Validates the AllergiesReactionsSection_templateId constraint of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergiesReactionsSection_AllergiesReactionsSection_templateId(AllergiesReactionsSection allergiesReactionsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "AllergiesReactionsSection_templateId", getObjectLabel(allergiesReactionsSection, context) },
						 new Object[] { allergiesReactionsSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateAllergiesReactionsSection_AllergiesReactionsSection_templateId(allergiesReactionsSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_templateId(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_code(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_title(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateProblemSection_ProblemSection_problemAct(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateActiveProblemsSection_ActiveProblemsSection_templateId(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateActiveProblemsSection_ActiveProblemsSection_problemConcernEntry(problemListSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemListSection_ProblemListSection_templateId(problemListSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemListSection_templateId constraint of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemListSection_ProblemListSection_templateId(ProblemListSection problemListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemListSection.ProblemListSection_templateId(diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPastIllnessSection_HistoryOfPastIllnessSection_code(historyOfPastIllnessSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HistoryOfPastIllnessSection_templateId constraint of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection_HistoryOfPastIllnessSection_templateId(HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "HistoryOfPastIllnessSection_templateId", getObjectLabel(historyOfPastIllnessSection, context) },
						 new Object[] { historyOfPastIllnessSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateHistoryOfPastIllnessSection_HistoryOfPastIllnessSection_templateId(historyOfPastIllnessSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateChiefComplaintSection_ChiefComplaintSection_code(chiefComplaintSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ChiefComplaintSection_templateId constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_ChiefComplaintSection_templateId(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ChiefComplaintSection_templateId", getObjectLabel(chiefComplaintSection, context) },
						 new Object[] { chiefComplaintSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateChiefComplaintSection_ChiefComplaintSection_templateId(chiefComplaintSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateReasonForReferralSection_ReasonForReferralSection_code(reasonForReferralSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReasonForReferralSection_templateId constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_ReasonForReferralSection_templateId(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ReasonForReferralSection_templateId", getObjectLabel(reasonForReferralSection, context) },
						 new Object[] { reasonForReferralSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateReasonForReferralSection_ReasonForReferralSection_templateId(reasonForReferralSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPresentIllness_HistoryOfPresentIllness_code(historyOfPresentIllness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HistoryOfPresentIllness_templateId constraint of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness_HistoryOfPresentIllness_templateId(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "HistoryOfPresentIllness_templateId", getObjectLabel(historyOfPresentIllness, context) },
						 new Object[] { historyOfPresentIllness },
						 context));
			}
			return false;
		}
		return iheValidator.validateHistoryOfPresentIllness_HistoryOfPresentIllness_templateId(historyOfPresentIllness, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateCodedSurgeriesSection_CodedSurgeriesSection_templateId(surgeriesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SurgeriesSection_templateId constraint of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurgeriesSection_SurgeriesSection_templateId(SurgeriesSection surgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "SurgeriesSection_templateId", getObjectLabel(surgeriesSection, context) },
						 new Object[] { surgeriesSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateSurgeriesSection_SurgeriesSection_templateId(surgeriesSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_FunctionalStatusSection_templateId(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_FunctionalStatusSection_code(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_FunctionalStatusSection_title(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_FunctionalStatusSection_problemAct(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateFunctionalStatusSection_FunctionalStatusSection_resultOrganizer(functionalStatusSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FunctionalStatusSection_templateId constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_FunctionalStatusSection_templateId(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "FunctionalStatusSection_templateId", getObjectLabel(functionalStatusSection, context) },
						 new Object[] { functionalStatusSection },
						 context));
			}
			return false;
		}
		return ccdValidator.validateFunctionalStatusSection_FunctionalStatusSection_templateId(functionalStatusSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateHospitalAdmissionDiagnosisSection_HospitalAdmissionDiagnosisSection_code(hospitalAdmissionDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HospitalAdmissionDiagnosisSection_templateId constraint of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalAdmissionDiagnosisSection_HospitalAdmissionDiagnosisSection_templateId(HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "HospitalAdmissionDiagnosisSection_templateId", getObjectLabel(hospitalAdmissionDiagnosisSection, context) },
						 new Object[] { hospitalAdmissionDiagnosisSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateHospitalAdmissionDiagnosisSection_HospitalAdmissionDiagnosisSection_templateId(hospitalAdmissionDiagnosisSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateDischargeDiagnosisSection_DischargeDiagnosisSection_code(dischargeDiagnosisSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DischargeDiagnosisSection_templateId constraint of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSection_DischargeDiagnosisSection_templateId(DischargeDiagnosisSection dischargeDiagnosisSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "DischargeDiagnosisSection_templateId", getObjectLabel(dischargeDiagnosisSection, context) },
						 new Object[] { dischargeDiagnosisSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateDischargeDiagnosisSection_DischargeDiagnosisSection_templateId(dischargeDiagnosisSection, diagnostics, context);
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
		return result;
	}

	/**
	 * Validates the MedicationsSection_templateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_MedicationsSection_templateId(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "MedicationsSection_templateId", getObjectLabel(medicationsSection, context) },
						 new Object[] { medicationsSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateMedicationsSection_MedicationsSection_templateId(medicationsSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateAdmissionMedicationHistorySection_AdmissionMedicationHistorySection_code(admissionMedicationHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdmissionMedicationHistorySection_templateId constraint of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdmissionMedicationHistorySection_AdmissionMedicationHistorySection_templateId(AdmissionMedicationHistorySection admissionMedicationHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "AdmissionMedicationHistorySection_templateId", getObjectLabel(admissionMedicationHistorySection, context) },
						 new Object[] { admissionMedicationHistorySection },
						 context));
			}
			return false;
		}
		return iheValidator.validateAdmissionMedicationHistorySection_AdmissionMedicationHistorySection_templateId(admissionMedicationHistorySection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateHospitalDischargeMedicationsSection_HospitalDischargeMedicationsSection_code(hospitalDischargeMedicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the HospitalDischargeMedicationsSection_templateId constraint of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalDischargeMedicationsSection_HospitalDischargeMedicationsSection_templateId(HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "HospitalDischargeMedicationsSection_templateId", getObjectLabel(hospitalDischargeMedicationsSection, context) },
						 new Object[] { hospitalDischargeMedicationsSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateHospitalDischargeMedicationsSection_HospitalDischargeMedicationsSection_templateId(hospitalDischargeMedicationsSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateMedicationsAdministeredSection_MedicationsAdministeredSection_code(medicationsAdministeredSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicationsAdministeredSection_templateId constraint of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsAdministeredSection_MedicationsAdministeredSection_templateId(MedicationsAdministeredSection medicationsAdministeredSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "MedicationsAdministeredSection_templateId", getObjectLabel(medicationsAdministeredSection, context) },
						 new Object[] { medicationsAdministeredSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateMedicationsAdministeredSection_MedicationsAdministeredSection_templateId(medicationsAdministeredSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validateCodedAdvanceDirectivesSection_CodedAdvanceDirectivesSection_templateId(advanceDirectivesSection, diagnostics, context);
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
		return iheValidator.validateAdvanceDirectivesSection_AdvanceDirectivesSection_templateId(advanceDirectivesSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= validateImmunizationsSection_ImmunizationsSection_templateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_ImmunizationsSection_code(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateImmunizationsSection_ImmunizationsSection_title(immunizationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ImmunizationsSection_templateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_ImmunizationsSection_templateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "ImmunizationsSection_templateId", getObjectLabel(immunizationsSection, context) },
						 new Object[] { immunizationsSection },
						 context));
			}
			return false;
		}
		return iheValidator.validateImmunizationsSection_ImmunizationsSection_templateId(immunizationsSection, diagnostics, context);
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
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamNarrativeSection_PhysicalExamNarrativeSection_templateId(physicalExamSection, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validatePhysicalExamNarrativeSection_PhysicalExamNarrativeSection_code(physicalExamSection, diagnostics, context);
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
						 new Object[] { "PhysicalExamSection_templateId", getObjectLabel(physicalExamSection, context) },
						 new Object[] { physicalExamSection },
						 context));
			}
			return false;
		}
		return iheValidator.validatePhysicalExamSection_PhysicalExamSection_templateId(physicalExamSection, diagnostics, context);
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
