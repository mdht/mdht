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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocFactory;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.DischargeInstructionsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Discharge Instructions</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Instructions Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Instructions Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Instructions Problem Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Instructions Hospital Discharge Medications Section
 * Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Instructions Advance Directives Section Entries
 * Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Instructions Immunizations Section Entries Optional
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateDischargeInstructionsMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Instructions Medical Equipment Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getPlanOfCareSection()
 * <em>Get Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAllergiesSectionEntriesOptional()
 * <em>Get Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getProblemSectionEntriesOptional()
 * <em>Get Problem Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getHospitalDischargeMedicationsSectionEntriesOptional()
 * <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAdvanceDirectivesSectionEntriesOptional()
 * <em>Get Advance Directives Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getImmunizationsSectionEntriesOptional()
 * <em>Get Immunizations Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getMedicalEquipmentSection()
 * <em>Get Medical Equipment Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class DischargeInstructionsTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeInstructionsPlanOfCareSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsPlanOfCareSectionTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateDischargeInstructionsPlanOfCareSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateDischargeInstructionsPlanOfCareSection(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateDischargeInstructionsPlanOfCareSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeInstructionsAllergiesSectionEntriesOptional() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateDischargeInstructionsAllergiesSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createAllergiesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateDischargeInstructionsAllergiesSectionEntriesOptional(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateDischargeInstructionsAllergiesSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeInstructionsProblemSectionEntriesOptional() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsProblemSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateDischargeInstructionsProblemSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* ProblemSectionEntriesOptional */
				ProblemSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createProblemSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateDischargeInstructionsProblemSectionEntriesOptional(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateDischargeInstructionsProblemSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* HospitalDischargeMedicationsSectionEntriesOptional */
				HospitalDischargeMedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeMedicationsSectionEntriesOptional()
						.init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptional(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateDischargeInstructionsHospitalDischargeMedicationsSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* AdvanceDirectivesSectionEntriesOptional */
				AdvanceDirectivesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createAdvanceDirectivesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptional(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateDischargeInstructionsAdvanceDirectivesSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeInstructionsImmunizationsSectionEntriesOptional() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsImmunizationsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateDischargeInstructionsImmunizationsSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* ImmunizationsSectionEntriesOptional */
				ImmunizationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createImmunizationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateDischargeInstructionsImmunizationsSectionEntriesOptional(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateDischargeInstructionsImmunizationsSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeInstructionsMedicalEquipmentSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsMedicalEquipmentSectionTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateDischargeInstructionsMedicalEquipmentSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* MedicalEquipmentSection */
				MedicalEquipmentSection section =

				ConsolFactory.eINSTANCE.createMedicalEquipmentSection()
						.init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateDischargeInstructionsMedicalEquipmentSection(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateDischargeInstructionsMedicalEquipmentSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareSection() {

		DischargeInstructions target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		DischargeInstructions target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSectionEntriesOptional() {

		DischargeInstructions target = objectFactory.create();
		target.getProblemSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeMedicationsSectionEntriesOptional() {

		DischargeInstructions target = objectFactory.create();
		target.getHospitalDischargeMedicationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAdvanceDirectivesSectionEntriesOptional() {

		DischargeInstructions target = objectFactory.create();
		target.getAdvanceDirectivesSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetImmunizationsSectionEntriesOptional() {

		DischargeInstructions target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicalEquipmentSection() {

		DischargeInstructions target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeInstructions> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeInstructions>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations
						.validateGeneralHeaderConstraintsTemplateId(
								(DischargeInstructions) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			DischargeInstructionsOperations {
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
			TestObjectFactory<DischargeInstructions> {
		@Override
		public DischargeInstructions create() {
			return ConsoltocFactory.eINSTANCE.createDischargeInstructions();
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
			DischargeInstructionsOperations {
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

} // DischargeInstructionsOperations