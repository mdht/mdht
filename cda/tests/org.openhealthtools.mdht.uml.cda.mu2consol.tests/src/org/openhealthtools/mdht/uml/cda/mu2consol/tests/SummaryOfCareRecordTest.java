package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SummaryOfCareRecordOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Summary Of Care Record</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Care Planning</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCognitiveStatusEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Cognitive Status Entries</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordFunctionalStatusEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Functional Status Entries</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Social History Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Mu2consol Social History Section Smoking
 * Status Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Mu2consol Plan Of Care Section Care
 * Planning For Plan Of Care</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Mu2consol Plan Of Care Section Plan Of
 * Care Activity Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Plan Of Care Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Assessment And Plan Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAssessmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Assessment Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Mu2consol Assessment Section Problem
 * Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrieveFunctionalStatusSection()
 * <em>Retrieve Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrieveHospitalDischargeDiagnosisSection()
 * <em>Retrieve Hospital Discharge Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrievePostoperativeDiagnosisSection()
 * <em>Retrieve Postoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrievePostprocedureDiagnosisSection()
 * <em>Retrieve Postprocedure Diagnosis Section</em>}</li>
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
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAssessmentSection()
 * <em>Get Assessment Section</em>}</li>
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
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPreoperativeDiagnosisSection()
 * <em>Get Preoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getImmunizationsSection()
 * <em>Get Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
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
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProceduresSection()
 * <em>Get Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPostprocedureDiagnosisSection()
 * <em>Get Postprocedure Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getFunctionalStatusSection()
 * <em>Get Functional Status Section</em>}</li>
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
	public void testValidateSummaryOfCareRecordCarePlanning() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordCarePlanningTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordCarePlanning",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection pSection = ConsolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				target.addSection(aSection);

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
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordCognitiveStatusEntries() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordCognitiveStatusEntriesTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordCognitiveStatusEntries",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_COGNITIVE_STATUS_ENTRIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				FunctionalStatusSection fSection = ConsolFactory.eINSTANCE
						.createFunctionalStatusSection().init();
				target.addSection(fSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				CognitiveStatusProblemObservation obs1 = ConsolFactory.eINSTANCE
						.createCognitiveStatusProblemObservation().init();
				FunctionalStatusProblemObservation obs2 = ConsolFactory.eINSTANCE
						.createFunctionalStatusProblemObservation().init();
				target.getFunctionalStatusSection().addObservation(obs1);
				target.getFunctionalStatusSection().addObservation(obs2);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordCognitiveStatusEntries(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordCognitiveStatusEntriesTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordFunctionalStatusEntries() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordFunctionalStatusEntriesTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordFunctionalStatusEntries",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_ENTRIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				FunctionalStatusSection sSection = ConsolFactory.eINSTANCE
						.createFunctionalStatusSection().init();
				target.addSection(sSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				CognitiveStatusProblemObservation cObs = ConsolFactory.eINSTANCE
						.createCognitiveStatusProblemObservation().init();
				target.getFunctionalStatusSection().addObservation(cObs);
				FunctionalStatusResultOrganizer fOrg = ConsolFactory.eINSTANCE
						.createFunctionalStatusResultOrganizer().init();
				target.getFunctionalStatusSection().addOrganizer(fOrg);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordFunctionalStatusEntries(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordFunctionalStatusEntriesTestCase
				.doValidationTest();
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
	public void testValidateSummaryOfCareRecordAllergiesSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordAllergiesSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordAllergiesSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordAllergiesSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordAllergiesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordImmunizationsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordImmunizationsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordImmunizationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				ConsolFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordImmunizationsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordImmunizationsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationsSectionTestCase
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

				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();

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

				Mu2consolFactory.eINSTANCE.createResultsSection().init();

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
	public void testValidateSummaryOfCareRecordVitalSignsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordVitalSignsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordVitalSignsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordVitalSignsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordVitalSignsSectionTestCase.doValidationTest();
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

				Mu2consolFactory.eINSTANCE.createProceduresSection().init();

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
	public void testValidateSummaryOfCareRecordSocialHistorySectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordSocialHistorySectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				SocialHistorySection section = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				for (II ii : section.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(section);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();
				SocialHistorySection section = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				II iiTemp = section.getTemplateIds().get(0);

				SocialHistorySection s = target.getSocialHistorySection();
				for (II ii : s.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordSocialHistorySectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordSocialHistorySectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				SocialHistorySection section = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				target.addSection(section);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				SmokingStatusObservation sObs = Mu2consolFactory.eINSTANCE
						.createSmokingStatusObservation().init();
				target.getSocialHistorySection().addObservation(sObs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMu2consolSocialHistorySectionSmokingStatusObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				// target.init();
				PlanOfCareActivityAct act = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityAct().init();
				PlanOfCareSection pSection = target.getPlanOfCareSection();
				pSection.addAct(act);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PlanOfCareActivityObservation pObs = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityObservation().init();
				target.getPlanOfCareSection().addObservation(pObs);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordPlanOfCareSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordPlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordPlanOfCareSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);
				for (II ii : pSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				II iiTemp = pSection.getTemplateIds().get(0);

				PlanOfCareSection section = target.getPlanOfCareSection();
				for (II ii : section.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordPlanOfCareSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordPlanOfCareSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				II iiTemp = aSection.getTemplateIds().get(0);

				AssessmentAndPlanSection asSection = target
						.getAssessmentAndPlanSection();
				for (II ii : asSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordAssessmentSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordAssessmentSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordAssessmentSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				AssessmentSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentSection tempSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				II iiTemp = tempSection.getTemplateIds().get(0);
				AssessmentSection aSection = target.getAssessmentSection();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordAssessmentSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordAssessmentSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation() {
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
				target.addSection(aSection);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentSection aSection = target.getAssessmentSection();
				ProblemObservation pObs = ConsolFactory.eINSTANCE
						.createProblemObservation().init();
				aSection.addObservation(pObs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMu2consolAssessmentSectionProblemObservation(
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
	public void testGetAssessmentSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAssessmentSection();

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
	public void testGetMedicationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getMedicationsSection();

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
	public void testGetProceduresSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getProceduresSection();

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
	public void testGetFunctionalStatusSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getFunctionalStatusSection();

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
