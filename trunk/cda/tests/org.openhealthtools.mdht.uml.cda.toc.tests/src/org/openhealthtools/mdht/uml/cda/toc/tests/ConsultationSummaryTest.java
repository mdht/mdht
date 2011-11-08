/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCFactory;
import org.openhealthtools.mdht.uml.cda.toc.operations.ConsultationSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummarySurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryDiagnosticResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateConsultationSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getDiagnosticResultsSection() <em>Get Diagnostic Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */

public class ConsultationSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryAllergiesReactionsSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryAllergiesReactionsSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryAllergiesReactionsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* AllergiesReactionsSection */
				AllergiesReactionsSection section =

				HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryAllergiesReactionsSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryAllergiesReactionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryMedicationsSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryMedicationsSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				HITSPFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryMedicationsSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryMedicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryProblemListSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryProblemListSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryProblemListSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* ProblemListSection */
				ProblemListSection section =

				HITSPFactory.eINSTANCE.createProblemListSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryProblemListSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryProblemListSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummarySurgeriesSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummarySurgeriesSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummarySurgeriesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* SurgeriesSection */
				SurgeriesSection section =

				HITSPFactory.eINSTANCE.createSurgeriesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummarySurgeriesSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummarySurgeriesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryDiagnosticResultsSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryDiagnosticResultsSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryDiagnosticResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_DIAGNOSTIC_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* DiagnosticResultsSection */
				DiagnosticResultsSection section =

				HITSPFactory.eINSTANCE.createDiagnosticResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryDiagnosticResultsSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryDiagnosticResultsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryAdvanceDirectivesSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryAdvanceDirectivesSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryAdvanceDirectivesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* AdvanceDirectivesSection */
				AdvanceDirectivesSection section =

				HITSPFactory.eINSTANCE.createAdvanceDirectivesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryAdvanceDirectivesSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryAdvanceDirectivesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryEncountersSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryEncountersSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryEncountersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* EncountersSection */
				EncountersSection section =

				HITSPFactory.eINSTANCE.createEncountersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryEncountersSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryEncountersSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryFamilyHistorySection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryFamilyHistorySectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				HITSPFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryFamilyHistorySection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryFunctionalStatusSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryFunctionalStatusSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				HITSPFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryFunctionalStatusSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryFunctionalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryImmunizationsSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryImmunizationsSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				HITSPFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryImmunizationsSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryMedicalEquipmentSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryMedicalEquipmentSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryMedicalEquipmentSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* MedicalEquipmentSection */
				MedicalEquipmentSection section =

				HITSPFactory.eINSTANCE.createMedicalEquipmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryMedicalEquipmentSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryMedicalEquipmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryPayersSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryPayersSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryPayersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* PayersSection */
				PayersSection section =

				HITSPFactory.eINSTANCE.createPayersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryPayersSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryPayersSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryPlanOfCareSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryPlanOfCareSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				HITSPFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryPlanOfCareSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummarySocialHistorySection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummarySocialHistorySectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummarySocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				HITSPFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummarySocialHistorySection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummarySocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationSummaryVitalSignsSection() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryVitalSignsSectionTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				HITSPFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryVitalSignsSection(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetAllergiesReactionsSection() {

		ConsultationSummary target = objectFactory.create();
		target.getAllergiesReactionsSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetMedicationsSection() {

		ConsultationSummary target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetProblemListSection() {

		ConsultationSummary target = objectFactory.create();
		target.getProblemListSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetSurgeriesSection() {

		ConsultationSummary target = objectFactory.create();
		target.getSurgeriesSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetDiagnosticResultsSection() {

		ConsultationSummary target = objectFactory.create();
		target.getDiagnosticResultsSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetAdvanceDirectivesSection() {

		ConsultationSummary target = objectFactory.create();
		target.getAdvanceDirectivesSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetEncountersSection() {

		ConsultationSummary target = objectFactory.create();
		target.getEncountersSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ConsultationSummary target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetFunctionalStatusSection() {

		ConsultationSummary target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetImmunizationsSection() {

		ConsultationSummary target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetMedicalEquipmentSection() {

		ConsultationSummary target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetPayersSection() {

		ConsultationSummary target = objectFactory.create();
		target.getPayersSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ConsultationSummary target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetSocialHistorySection() {

		ConsultationSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetVitalSignsSection() {

		ConsultationSummary target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ConsultationSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	private static class OperationsForOCL extends ConsultationSummaryOperations {
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
	* @generated NOT
	*/
	private static class ObjectFactory implements TestObjectFactory<ConsultationSummary> {

		public ConsultationSummary create() {
			return ToCFactory.eINSTANCE.createConsultationSummary();
		}
	}

	/**
	*
	* @generated NOT
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated NOT
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated NOT
	*/
	private static class ConstructorTestClass extends ConsultationSummaryOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated NOT
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated NOT
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ConsultationSummaryOperations
