/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ViewDownloadTransmitSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>View Download Transmit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryCarePlanFields(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Plan Fields</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Mu2consol Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#retrievePreoperativeDiagnosisSection() <em>Retrieve Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ViewDownloadTransmitSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryCarePlanFields() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryCarePlanFieldsTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryCarePlanFields",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLAN_FIELDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryCarePlanFields(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryCarePlanFieldsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryAllergiesSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryAllergiesSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryAllergiesSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryAllergiesSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryAllergiesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryMedicationsSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryMedicationsSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryMedicationsSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryMedicationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryProblemSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryProblemSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryProblemSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryProceduresSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryProceduresSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				Mu2consolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryProceduresSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryVitalSignsSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryVitalSignsSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryVitalSignsSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryResultsSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryResultsSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				Mu2consolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryResultsSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryPlanOfCareSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryPlanOfCareSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryPlanOfCareSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummarySocialHistorySection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummarySocialHistorySectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummarySocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummarySocialHistorySection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummarySocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
				II iiTemp = aSection.getTemplateIds().get(0);

				for (II ii : target.getAssessmentAndPlanSection().getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateId(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryAssessmentAndPlanSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {
				PlanOfCareSection aSection = Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				PlanOfCareActivityAct pAct = ConsolFactory.eINSTANCE.createPlanOfCareActivityAct().init();
				target.getPlanOfCareSection().addAct(pAct);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();
				target.addSection(pSection);
			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				PlanOfCareActivityObservation pObs = ConsolFactory.eINSTANCE.createPlanOfCareActivityObservation().init();
				target.getPlanOfCareSection().addObservation(pObs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();
				target.addSection(pSection);
				for (II ii : pSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();
				II iiTemp = pSection.getTemplateIds().get(0);
				for (II ii : target.getPlanOfCareSection().getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateId(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryPlanOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummarySocialHistorySectionTemplateId() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummarySocialHistorySectionTemplateIdTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummarySocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {
				SocialHistorySection sSection = Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();
				target.addSection(sSection);
				for (II ii : sSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				SocialHistorySection sSection = Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();
				II iiTemp = sSection.getTemplateIds().get(0);

				for (II ii : target.getSocialHistorySection().getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummarySocialHistorySectionTemplateId(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummarySocialHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {
				SocialHistorySection sSection = Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();
				target.addSection(sSection);
			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				SmokingStatusObservation sObs = Mu2consolFactory.eINSTANCE.createSmokingStatusObservation().init();
				target.getSocialHistorySection().addObservation(sObs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummarymu2consolSocialHistorySectionSmokingStatusObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetVitalSignsSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetResultsSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAssessmentAndPlanSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ViewDownloadTransmitSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ViewDownloadTransmitSummary> {

		public ViewDownloadTransmitSummary create() {
			return Mu2consolFactory.eINSTANCE.createViewDownloadTransmitSummary();
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
	private static class ConstructorTestClass extends ViewDownloadTransmitSummaryOperations {
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

} // ViewDownloadTransmitSummaryOperations
