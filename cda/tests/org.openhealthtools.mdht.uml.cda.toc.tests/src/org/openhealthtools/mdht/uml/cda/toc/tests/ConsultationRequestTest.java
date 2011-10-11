/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.tests;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.tests.GeneralStatusSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.AdvanceDirectivesSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.AllergiesReactionsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.AssessmentAndPlanSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ChiefComplaintSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.DiagnosticResultsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.EncountersSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.FamilyHistorySectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.FunctionalStatusSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.HistoryOfPastIllnessSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ImmunizationsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.MedicalEquipmentSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.MedicationsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.PayersSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.PhysicalExamSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.PlanOfCareSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ProblemListSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ReasonForReferralSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.SocialHistorySectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.SurgeriesSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.VitalSignsSectionTest;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.ToCFactory;
import org.openhealthtools.mdht.uml.cda.toc.operations.ConsultationRequestOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Request</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestSurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestPhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestReasonForReferralSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateConsultationRequestPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getDiagnosticResultsSection() <em>Get Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConsultationRequestTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestAllergiesReactionsSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestAllergiesReactionsSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestAllergiesReactionsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* AllergiesReactionsSection */
				AllergiesReactionsSection section =

				HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestAllergiesReactionsSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestAllergiesReactionsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(AllergiesReactionsSectionTest.class);

		assertTrue(AllergiesReactionsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestMedicationsSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestMedicationsSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				HITSPFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestMedicationsSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestMedicationsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(MedicationsSectionTest.class);

		assertTrue(MedicationsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestProblemListSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestProblemListSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestProblemListSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* ProblemListSection */
				ProblemListSection section =

				HITSPFactory.eINSTANCE.createProblemListSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestProblemListSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestProblemListSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ProblemListSectionTest.class);

		assertTrue(ProblemListSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestSurgeriesSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestSurgeriesSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestSurgeriesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* SurgeriesSection */
				SurgeriesSection section =

				HITSPFactory.eINSTANCE.createSurgeriesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestSurgeriesSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestSurgeriesSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(SurgeriesSectionTest.class);

		assertTrue(SurgeriesSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestDiagnosticResultsSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestDiagnosticResultsSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestDiagnosticResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* DiagnosticResultsSection */
				DiagnosticResultsSection section =

				HITSPFactory.eINSTANCE.createDiagnosticResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestDiagnosticResultsSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestDiagnosticResultsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(DiagnosticResultsSectionTest.class);

		assertTrue(DiagnosticResultsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestAdvanceDirectivesSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestAdvanceDirectivesSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestAdvanceDirectivesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* AdvanceDirectivesSection */
				AdvanceDirectivesSection section =

				HITSPFactory.eINSTANCE.createAdvanceDirectivesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestAdvanceDirectivesSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestAdvanceDirectivesSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(AdvanceDirectivesSectionTest.class);

		assertTrue(AdvanceDirectivesSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestAssessmentAndPlanSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestAssessmentAndPlanSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestAssessmentAndPlanSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* AssessmentAndPlanSection */
				AssessmentAndPlanSection section =

				HITSPFactory.eINSTANCE.createAssessmentAndPlanSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestAssessmentAndPlanSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestAssessmentAndPlanSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(AssessmentAndPlanSectionTest.class);

		assertTrue(AssessmentAndPlanSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationRequestHistoryOfPresentIllness() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestHistoryOfPresentIllnessTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestHistoryOfPresentIllness",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				HistoryOfPresentIllness historyOfPresentIllness = HITSPFactory.eINSTANCE.createHistoryOfPresentIllness().init();

				target.addSection(historyOfPresentIllness);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestHistoryOfPresentIllness(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestHistoryOfPresentIllnessTestCase.doValidationTest();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestPhysicalExamSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestPhysicalExamSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestPhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* PhysicalExamSection */
				PhysicalExamSection section =

				HITSPFactory.eINSTANCE.createPhysicalExamSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestPhysicalExamSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestPhysicalExamSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(PhysicalExamSectionTest.class);

		assertTrue(PhysicalExamSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestReasonForReferralSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestReasonForReferralSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestReasonForReferralSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* ReasonForReferralSection */
				ReasonForReferralSection section =

				HITSPFactory.eINSTANCE.createReasonForReferralSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestReasonForReferralSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestReasonForReferralSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ReasonForReferralSectionTest.class);

		assertTrue(ReasonForReferralSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestEncountersSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestEncountersSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestEncountersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* EncountersSection */
				EncountersSection section =

				HITSPFactory.eINSTANCE.createEncountersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestEncountersSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestEncountersSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(EncountersSectionTest.class);

		assertTrue(EncountersSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestFamilyHistorySection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestFamilyHistorySectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				HITSPFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestFamilyHistorySection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestFamilyHistorySectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(FamilyHistorySectionTest.class);

		assertTrue(FamilyHistorySectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestFunctionalStatusSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestFunctionalStatusSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				HITSPFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestFunctionalStatusSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestFunctionalStatusSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(FunctionalStatusSectionTest.class);

		assertTrue(FunctionalStatusSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestImmunizationsSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestImmunizationsSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				HITSPFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestImmunizationsSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestImmunizationsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ImmunizationsSectionTest.class);

		assertTrue(ImmunizationsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestMedicalEquipmentSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestMedicalEquipmentSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestMedicalEquipmentSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* MedicalEquipmentSection */
				MedicalEquipmentSection section =

				HITSPFactory.eINSTANCE.createMedicalEquipmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestMedicalEquipmentSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestMedicalEquipmentSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(MedicalEquipmentSectionTest.class);

		assertTrue(MedicalEquipmentSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestPlanOfCareSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestPlanOfCareSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				HITSPFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestPlanOfCareSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestPlanOfCareSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(PlanOfCareSectionTest.class);

		assertTrue(PlanOfCareSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestSocialHistorySection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestSocialHistorySectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				HITSPFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestSocialHistorySection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestSocialHistorySectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(SocialHistorySectionTest.class);

		assertTrue(SocialHistorySectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestVitalSignsSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestVitalSignsSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				HITSPFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestVitalSignsSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestVitalSignsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(VitalSignsSectionTest.class);

		assertTrue(VitalSignsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestChiefComplaintSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestChiefComplaintSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				HITSPFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestChiefComplaintSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestChiefComplaintSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ChiefComplaintSectionTest.class);

		assertTrue(ChiefComplaintSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestGeneralStatusSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestGeneralStatusSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestGeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

				CDTFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestGeneralStatusSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestGeneralStatusSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(GeneralStatusSectionTest.class);

		assertTrue(GeneralStatusSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationRequestHistoryOfPastIllnessSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* HistoryOfPastIllnessSection */
				HistoryOfPastIllnessSection section =

				HITSPFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestHistoryOfPastIllnessSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestHistoryOfPastIllnessSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(HistoryOfPastIllnessSectionTest.class);

		assertTrue(HistoryOfPastIllnessSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationRequestPayersSection() {
		OperationsTestCase<ConsultationRequest> validateConsultationRequestPayersSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestPayersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

				/* PayersSection */
				PayersSection section =

				HITSPFactory.eINSTANCE.createPayersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateConsultationRequestPayersSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestPayersSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(PayersSectionTest.class);

		assertTrue(PayersSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesReactionsSection() {

		ConsultationRequest target = objectFactory.create();
		target.getAllergiesReactionsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		ConsultationRequest target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemListSection() {

		ConsultationRequest target = objectFactory.create();
		target.getProblemListSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSurgeriesSection() {

		ConsultationRequest target = objectFactory.create();
		target.getSurgeriesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDiagnosticResultsSection() {

		ConsultationRequest target = objectFactory.create();
		target.getDiagnosticResultsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSection() {

		ConsultationRequest target = objectFactory.create();
		target.getAdvanceDirectivesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection() {

		ConsultationRequest target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllness() {

		ConsultationRequest target = objectFactory.create();
		target.getHistoryOfPresentIllness();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection() {

		ConsultationRequest target = objectFactory.create();
		target.getPhysicalExamSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForReferralSection() {

		ConsultationRequest target = objectFactory.create();
		target.getReasonForReferralSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersSection() {

		ConsultationRequest target = objectFactory.create();
		target.getEncountersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ConsultationRequest target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection() {

		ConsultationRequest target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		ConsultationRequest target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection() {

		ConsultationRequest target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ConsultationRequest target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		ConsultationRequest target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		ConsultationRequest target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ConsultationRequest target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		ConsultationRequest target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		ConsultationRequest target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayersSection() {

		ConsultationRequest target = objectFactory.create();
		target.getPayersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ConsultationRequest> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationRequestOperations.validateGeneralHeaderConstraintsTemplateId(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConsultationRequestOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements TestObjectFactory<ConsultationRequest> {

		public ConsultationRequest create() {
			return ToCFactory.eINSTANCE.createConsultationRequest();
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
	* @generated
	*/
	private static class ConstructorTestClass extends ConsultationRequestOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
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

} // ConsultationRequestOperations
