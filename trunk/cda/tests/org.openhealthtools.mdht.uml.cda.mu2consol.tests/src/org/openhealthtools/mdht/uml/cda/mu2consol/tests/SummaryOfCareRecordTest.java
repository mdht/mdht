package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SummaryOfCareRecordOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Summary Of Care Record</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Cannot Have Chief Complaint And Reason
 * For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Can Have Either Required Or Optional
 * Vital Signs</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medication List Constraint</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Care Planning</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medication Allergy</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordReasonForHospitalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Reason For Hospitalization</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medication List</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Hospital Discharge Instructions Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medications Administered Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Hospital Admission Medications
 * Section Entries Optional Admission Medication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Allergies Section Entries
 * Optional Allergy Problem Act</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Plan Of Care Section Care
 * Planning For Plan Of Care</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Medications Administered Section
 * Medication Activity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Instructions Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Instructions Section
 * Instructions</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Assessment Section Problem
 * Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis
 * Section Hospital Admission Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis
 * Section Hospital Discharge Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Postoperative Diagnosis Section
 * Problem Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section
 * Postprocedure Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section
 * Preoperative Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getEncountersSection()
 * <em>Get Encounters Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPlanOfCareSection()
 * <em>Get Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAssessmentAndPlanSection()
 * <em>Get Assessment And Plan Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getInterventionsSection()
 * <em>Get Interventions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getInstructionsSection()
 * <em>Get Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeInstructionsSection()
 * <em>Get Hospital Discharge Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAssessmentSection()
 * <em>Get Assessment Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalAdmissionDiagnosisSection()
 * <em>Get Hospital Admission Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeDiagnosisSection()
 * <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPostoperativeDiagnosisSection()
 * <em>Get Postoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProblemSection()
 * <em>Get Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAllergiesSection()
 * <em>Get Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHistoryOfPastIllnessSection()
 * <em>Get History Of Past Illness Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getReasonForVisitSection()
 * <em>Get Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getChiefComplaintSection()
 * <em>Get Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getChiefComplaintAndReasonForVisitSection()
 * <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPreoperativeDiagnosisSection()
 * <em>Get Preoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getImmunizationsSection()
 * <em>Get Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getMedicationsAdministeredSection()
 * <em>Get Medications Administered Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalAdmissionMedicationsSectionEntriesOptional()
 * <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeMedicationsSection()
 * <em>Get Hospital Discharge Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getResultsSection()
 * <em>Get Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getVitalSignsSection()
 * <em>Get Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getVitalSignsSectionEntriesOptional()
 * <em>Get Vital Signs Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProceduresSection()
 * <em>Get Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAllergiesSectionEntriesOptional()
 * <em>Get Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPostprocedureDiagnosisSection()
 * <em>Get Postprocedure Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getReasonForReferralSection()
 * <em>Get Reason For Referral Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class SummaryOfCareRecordTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				ChiefComplaintSection ccSection = ConsolFactory.eINSTANCE
						.createChiefComplaintSection().init();
				ReasonForVisitSection rvsSection = ConsolFactory.eINSTANCE
						.createReasonForVisitSection().init();
				ChiefComplaintAndReasonForVisitSection ccRvsSection = ConsolFactory.eINSTANCE
						.createChiefComplaintAndReasonForVisitSection().init();
				target.addSection(ccRvsSection);
				target.addSection(rvsSection);
				target.addSection(ccSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {

				Component2 comp2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(comp2);
				SummaryOfCareRecord sdDoc = Mu2consolFactory.eINSTANCE
						.createSummaryOfCareRecord().init();
				ChiefComplaintSection ccSection = ConsolFactory.eINSTANCE
						.createChiefComplaintSection().init();
				ReasonForVisitSection rvsSection = ConsolFactory.eINSTANCE
						.createReasonForVisitSection().init();
				target.addSection(rvsSection);
				target.addSection(ccSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMu2EncounterDiagnosesRequirements() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMu2EncounterDiagnosesRequirementsTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

				target.init();
				InstructionsSection iSection = Mu2consolFactory.eINSTANCE
						.createInstructionsSection();
				target.addSection(iSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMu2EncounterDiagnosesRequirementsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSigns(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationListConstraint() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationListConstraintTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationListConstraint",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationListConstraint(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationListConstraintTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordCarePlanning() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordCarePlanningTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordCarePlanning",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordCarePlanning(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordCarePlanningTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationAllergy() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationAllergyTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationAllergy",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationAllergy(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationAllergyTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordReasonForHospitalization() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordReasonForHospitalizationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordReasonForHospitalization",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_REASON_FOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordReasonForHospitalization(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordReasonForHospitalizationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationList() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationListTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationList",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationList(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationListTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordPlanOfCareSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordPlanOfCareSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordPlanOfCareSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordPlanOfCareSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordInstructionsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordInstructionsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordInstructionsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* InstructionsSection */
				InstructionsSection section =

				Mu2consolFactory.eINSTANCE.createInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordInstructionsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordInstructionsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordHospitalDischargeInstructionsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordHospitalDischargeInstructionsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordHospitalDischargeInstructionsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordHospitalDischargeInstructionsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordProblemSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordProblemSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordProblemSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordProblemSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationsAdministeredSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationsAdministeredSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationsAdministeredSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* MedicationsAdministeredSection */
				MedicationsAdministeredSection section =

				Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationsAdministeredSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationsAdministeredSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordSocialHistorySection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordSocialHistorySectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordSocialHistorySection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordSocialHistorySection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordSocialHistorySectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordResultsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordResultsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordResultsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				ConsolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordResultsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordProceduresSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordProceduresSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordProceduresSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				ConsolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordProceduresSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				HospitalAdmissionMedicationsSectionEntriesOptional aSection = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionMedicationsSectionEntriesOptional();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				// target.init();
				AdmissionMedication aMed = ConsolFactory.eINSTANCE
						.createAdmissionMedication().init();
				target.getHospitalAdmissionMedicationsSectionEntriesOptional()
						.addAct(aMed);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				AllergiesSectionEntriesOptional aSection = Mu2consolFactory.eINSTANCE
						.createAllergiesSectionEntriesOptional().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				// target.init();
				AllergyProblemAct act = ConsolFactory.eINSTANCE
						.createAllergyProblemAct();
				target.getAllergiesSectionEntriesOptional().addAct(act);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivityTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordInstructionsSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordInstructionsSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordInstructionsSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordInstructionsSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordInstructionsSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolInstructionsSectionInstructions() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolInstructionsSectionInstructionsTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolInstructionsSectionInstructions(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolInstructionsSectionInstructionsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				AssessmentSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				// ProblemObservation pObs = ConsolFactory.eINSTANCE
				// .createProblemObservation().init();
				// Entry entry = CDAFactory.eINSTANCE.createEntry();
				// entry.setObservation(pObs);
				// aSection.getEntries().add(entry);

				target.addSection(aSection);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				// target.get
				// target.init();
				AssessmentSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				ProblemObservation pObs = ConsolFactory.eINSTANCE
						.createProblemObservation().init();
				Entry entry = CDAFactory.eINSTANCE.createEntry();
				entry.setObservation(pObs);
				aSection.getEntries().add(entry);

				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetEncountersSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getEncountersSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAssessmentAndPlanSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetInterventionsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getInterventionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetInstructionsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAssessmentSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalAdmissionDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalAdmissionDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalDischargeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPostoperativeDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPostoperativeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetReasonForVisitSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetChiefComplaintSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPreoperativeDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPreoperativeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetImmunizationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsAdministeredSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalAdmissionMedicationsSectionEntriesOptional() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalAdmissionMedicationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeMedicationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalDischargeMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetResultsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetVitalSignsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPostprocedureDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPostprocedureDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetReasonForReferralSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getReasonForReferralSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateGeneralHeaderConstraintsTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SummaryOfCareRecordOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements
			TestObjectFactory<SummaryOfCareRecord> {
		@Override
		public SummaryOfCareRecord create() {
			return Mu2consolFactory.eINSTANCE.createSummaryOfCareRecord();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			SummaryOfCareRecordOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // SummaryOfCareRecordOperations