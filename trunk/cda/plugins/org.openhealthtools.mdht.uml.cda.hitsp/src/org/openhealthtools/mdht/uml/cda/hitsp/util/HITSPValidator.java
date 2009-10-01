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
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

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
