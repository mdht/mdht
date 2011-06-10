/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.PatientSummaryOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Patient Summary</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryHealthcareProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Healthcare Provider</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Advance Directives Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Allergies Reactions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Problem List Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Encounters Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Payers Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummarySurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Surgeries Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryPregnancyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Pregnancy History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#validatePatientSummaryDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Patient Summary Diagnostic Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createProblemListSection()
 * <em>Create Problem List Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#createMedicationsSection()
 * <em>Create Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPAdvanceDirectivesSection()
 * <em>Get HITSP Advance Directives Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getAllergiesReactionsSection()
 * <em>Get Allergies Reactions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getProblemListSection()
 * <em>Get Problem List Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPEncountersSection()
 * <em>Get HITSP Encounters Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPImmunizationsSection()
 * <em>Get HITSP Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPPayersSection()
 * <em>Get HITSP Payers Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPMedicationsSection()
 * <em>Get HITSP Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getSurgeriesSection()
 * <em>Get Surgeries Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPPlanOfCareSection()
 * <em>Get HITSP Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getPregnancyHistorySection()
 * <em>Get Pregnancy History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getHITSPVitalSignsSection()
 * <em>Get HITSP Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary#getDiagnosticResultsSection()
 * <em>Get Diagnostic Results Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class PatientSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidatePatientSummaryHealthcareProvider() {
		OperationsTestCase<PatientSummary> validatePatientSummaryHealthcareProviderTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryHealthcareProvider",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_HEALTHCARE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				;
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 p = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(p);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryHealthcareProvider(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryHealthcareProviderTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryTemplateId() {
		OperationsTestCase<PatientSummary> validatePatientSummaryTemplateIdTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryTemplateId(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryAdvanceDirectivesSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryAdvanceDirectivesSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryAdvanceDirectivesSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* AdvanceDirectivesSection */
				AdvanceDirectivesSection section =

				HITSPFactory.eINSTANCE.createAdvanceDirectivesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryAdvanceDirectivesSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryAdvanceDirectivesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryAllergiesReactionsSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryAllergiesReactionsSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryAllergiesReactionsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* AllergiesReactionsSection */
				AllergiesReactionsSection section =

				HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryAllergiesReactionsSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryAllergiesReactionsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryProblemListSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryProblemListSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryProblemListSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* ProblemListSection */
				ProblemListSection section =

				HITSPFactory.eINSTANCE.createProblemListSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryProblemListSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryProblemListSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryEncountersSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryEncountersSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryEncountersSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* EncountersSection */
				EncountersSection section =

				HITSPFactory.eINSTANCE.createEncountersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryEncountersSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryEncountersSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryImmunizationsSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryImmunizationsSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				HITSPFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryImmunizationsSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryPayersSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryPayersSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryPayersSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* PayersSection */
				PayersSection section =

				HITSPFactory.eINSTANCE.createPayersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryPayersSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryPayersSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryMedicationsSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryMedicationsSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				HITSPFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryMedicationsSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryMedicationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummarySurgeriesSection() {
		OperationsTestCase<PatientSummary> validatePatientSummarySurgeriesSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummarySurgeriesSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* SurgeriesSection */
				SurgeriesSection section =

				HITSPFactory.eINSTANCE.createSurgeriesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummarySurgeriesSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummarySurgeriesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryPlanOfCareSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryPlanOfCareSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				HITSPFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryPlanOfCareSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidatePatientSummaryPregnancyHistorySection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryPregnancyHistorySectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryPregnancyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_PREGNANCY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* PregnancyHistorySection */
				PregnancyHistorySection section =

				IHEFactory.eINSTANCE.createPregnancyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryPregnancyHistorySection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryPregnancyHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryVitalSignsSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryVitalSignsSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				HITSPFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryVitalSignsSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientSummaryDiagnosticResultsSection() {
		OperationsTestCase<PatientSummary> validatePatientSummaryDiagnosticResultsSectionTestCase = new OperationsTestCase<PatientSummary>(
			"validatePatientSummaryDiagnosticResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientSummary target) {

			}

			@Override
			protected void updateToPass(PatientSummary target) {
				target.init();

				/* DiagnosticResultsSection */
				DiagnosticResultsSection section =

				HITSPFactory.eINSTANCE.createDiagnosticResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientSummaryOperations.validatePatientSummaryDiagnosticResultsSection(
					(PatientSummary) objectToTest, diagnostician, map);
			}

		};

		validatePatientSummaryDiagnosticResultsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPAdvanceDirectivesSection() {

		PatientSummary target = objectFactory.create();
		target.getHITSPAdvanceDirectivesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesReactionsSection() {

		PatientSummary target = objectFactory.create();
		target.getAllergiesReactionsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemListSection() {

		PatientSummary target = objectFactory.create();
		target.getProblemListSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPEncountersSection() {

		PatientSummary target = objectFactory.create();
		target.getHITSPEncountersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPImmunizationsSection() {

		PatientSummary target = objectFactory.create();
		target.getHITSPImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPPayersSection() {

		PatientSummary target = objectFactory.create();
		target.getHITSPPayersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPMedicationsSection() {

		PatientSummary target = objectFactory.create();
		target.getHITSPMedicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSurgeriesSection() {

		PatientSummary target = objectFactory.create();
		target.getSurgeriesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPPlanOfCareSection() {

		PatientSummary target = objectFactory.create();
		target.getHITSPPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPregnancyHistorySection() {

		PatientSummary target = objectFactory.create();
		target.getPregnancyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPVitalSignsSection() {

		PatientSummary target = objectFactory.create();
		target.getHITSPVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDiagnosticResultsSection() {

		PatientSummary target = objectFactory.create();
		target.getDiagnosticResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PatientSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientSummary> {

		public PatientSummary create() {
			return HITSPFactory.eINSTANCE.createPatientSummary();
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
	private static class ConstructorTestClass extends PatientSummaryOperations {
	}

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

} // PatientSummaryOperations
