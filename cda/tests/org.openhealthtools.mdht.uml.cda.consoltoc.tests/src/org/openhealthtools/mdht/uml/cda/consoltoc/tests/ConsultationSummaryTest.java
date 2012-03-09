/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocFactory;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.ConsultationSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Consultation Summary</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Medications Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Problem Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Results Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Advance Directives Section Entries Optional
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryEncountersSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Encounters Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Family History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Immunizations Section Entries Optional
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Procedures Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Medical Equipment Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Payers Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateConsultationSummaryVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Consultation Summary Vital Signs Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getAllergiesSectionEntriesOptional()
 * <em>Get Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getMedicationsSectionEntriesOptional()
 * <em>Get Medications Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getProblemSectionEntriesOptional()
 * <em>Get Problem Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getResultsSectionEntriesOptional()
 * <em>Get Results Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getAdvanceDirectivesSectionEntriesOptional()
 * <em>Get Advance Directives Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getEncountersSectionEntriesOptional()
 * <em>Get Encounters Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getFamilyHistorySection()
 * <em>Get Family History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getFunctionalStatusSection()
 * <em>Get Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getImmunizationsSectionEntriesOptional()
 * <em>Get Immunizations Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getProceduresSectionEntriesOptional()
 * <em>Get Procedures Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getMedicalEquipmentSection()
 * <em>Get Medical Equipment Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getPayersSection()
 * <em>Get Payers Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getPlanOfCareSection()
 * <em>Get Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#getVitalSignsSectionEntriesOptional()
 * <em>Get Vital Signs Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ConsultationSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationSummaryAllergiesSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryAllergiesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryAllergiesSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryAllergiesSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationSummaryMedicationsSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* MedicationsSectionEntriesOptional */
				MedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryMedicationsSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationSummaryProblemSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryProblemSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryProblemSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* ProblemSectionEntriesOptional */
				ProblemSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryProblemSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryProblemSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationSummaryResultsSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryResultsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryResultsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* ResultsSectionEntriesOptional */
				ResultsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryResultsSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryResultsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationSummaryAdvanceDirectivesSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryAdvanceDirectivesSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* AdvanceDirectivesSectionEntriesOptional */
				AdvanceDirectivesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryAdvanceDirectivesSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryAdvanceDirectivesSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationSummaryEncountersSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryEncountersSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryEncountersSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* EncountersSectionEntriesOptional */
				EncountersSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryEncountersSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryEncountersSectionEntriesOptionalTestCase.doValidationTest();
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

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

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

				ConsolFactory.eINSTANCE.createFunctionalStatusSection().init();

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
	public void testValidateConsultationSummaryImmunizationsSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryImmunizationsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryImmunizationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* ImmunizationsSectionEntriesOptional */
				ImmunizationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryImmunizationsSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryImmunizationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationSummaryProceduresSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* ProceduresSectionEntriesOptional */
				ProceduresSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryProceduresSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryProceduresSectionEntriesOptionalTestCase.doValidationTest();
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

				ConsolFactory.eINSTANCE.createMedicalEquipmentSection().init();

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

				ConsolFactory.eINSTANCE.createPayersSection().init();

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

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

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

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

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
	public void testValidateConsultationSummaryVitalSignsSectionEntriesOptional() {
		OperationsTestCase<ConsultationSummary> validateConsultationSummaryVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationSummary>(
			"validateConsultationSummaryVitalSignsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationSummary target) {

			}

			@Override
			protected void updateToPass(ConsultationSummary target) {
				target.init();

				/* VitalSignsSectionEntriesOptional */
				VitalSignsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationSummaryOperations.validateConsultationSummaryVitalSignsSectionEntriesOptional(
					(ConsultationSummary) objectToTest, diagnostician, map);
			}

		};

		validateConsultationSummaryVitalSignsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetMedicationsSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetProblemSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getProblemSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetResultsSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getResultsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetAdvanceDirectivesSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getAdvanceDirectivesSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetEncountersSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getEncountersSectionEntriesOptional();

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
	 * @generated
	 */
	@Test
	public void testGetImmunizationsSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getProceduresSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicalEquipmentSection() {

		ConsultationSummary target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPayersSection() {

		ConsultationSummary target = objectFactory.create();
		target.getPayersSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareSection() {

		ConsultationSummary target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		ConsultationSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {

		ConsultationSummary target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
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
	 * @generated
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
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<ConsultationSummary> {

		public ConsultationSummary create() {
			return ConsoltocFactory.eINSTANCE.createConsultationSummary();
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
	private static class ConstructorTestClass extends ConsultationSummaryOperations {
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

} // ConsultationSummaryOperations
