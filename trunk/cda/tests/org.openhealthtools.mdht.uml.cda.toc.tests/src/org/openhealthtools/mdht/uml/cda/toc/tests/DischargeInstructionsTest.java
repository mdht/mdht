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
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.ToCFactory;
import org.openhealthtools.mdht.uml.cda.toc.operations.DischargeInstructionsOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateDischargeInstructionsMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Instructions Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getDischargeDiagnosisSection() <em>Get Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */

public class DischargeInstructionsTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeInstructionsPlanOfCareSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsPlanOfCareSectionTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateDischargeInstructionsPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				HITSPFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateDischargeInstructionsPlanOfCareSection(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateDischargeInstructionsPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeInstructionsAllergiesReactionsSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsAllergiesReactionsSectionTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateDischargeInstructionsAllergiesReactionsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* AllergiesReactionsSection */
				AllergiesReactionsSection section =

				HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateDischargeInstructionsAllergiesReactionsSection(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateDischargeInstructionsAllergiesReactionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeInstructionsProblemListSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsProblemListSectionTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateDischargeInstructionsProblemListSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* ProblemListSection */
				ProblemListSection section =

				HITSPFactory.eINSTANCE.createProblemListSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateDischargeInstructionsProblemListSection(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateDischargeInstructionsProblemListSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeInstructionsDischargeDiagnosisSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsDischargeDiagnosisSectionTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateDischargeInstructionsDischargeDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* DischargeDiagnosisSection */
				DischargeDiagnosisSection section =

				HITSPFactory.eINSTANCE.createDischargeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateDischargeInstructionsDischargeDiagnosisSection(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateDischargeInstructionsDischargeDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeInstructionsAdvanceDirectivesSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsAdvanceDirectivesSectionTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateDischargeInstructionsAdvanceDirectivesSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* AdvanceDirectivesSection */
				AdvanceDirectivesSection section =

				HITSPFactory.eINSTANCE.createAdvanceDirectivesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateDischargeInstructionsAdvanceDirectivesSection(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateDischargeInstructionsAdvanceDirectivesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeInstructionsImmunizationsSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsImmunizationsSectionTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateDischargeInstructionsImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				HITSPFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateDischargeInstructionsImmunizationsSection(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateDischargeInstructionsImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeInstructionsMedicalEquipmentSection() {
		OperationsTestCase<DischargeInstructions> validateDischargeInstructionsMedicalEquipmentSectionTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateDischargeInstructionsMedicalEquipmentSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_INSTRUCTIONS_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

				/* MedicalEquipmentSection */
				MedicalEquipmentSection section =

				HITSPFactory.eINSTANCE.createMedicalEquipmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateDischargeInstructionsMedicalEquipmentSection(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateDischargeInstructionsMedicalEquipmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetPlanOfCareSection() {

		DischargeInstructions target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetAllergiesReactionsSection() {

		DischargeInstructions target = objectFactory.create();
		target.getAllergiesReactionsSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetProblemListSection() {

		DischargeInstructions target = objectFactory.create();
		target.getProblemListSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetDischargeDiagnosisSection() {

		DischargeInstructions target = objectFactory.create();
		target.getDischargeDiagnosisSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetAdvanceDirectivesSection() {

		DischargeInstructions target = objectFactory.create();
		target.getAdvanceDirectivesSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetImmunizationsSection() {

		DischargeInstructions target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testGetMedicalEquipmentSection() {

		DischargeInstructions target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeInstructions> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeInstructionsOperations.validateGeneralHeaderConstraintsTemplateId(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	private static class OperationsForOCL extends DischargeInstructionsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeInstructions> {
		public DischargeInstructions create() {
			return ToCFactory.eINSTANCE.createDischargeInstructions();

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
	private static class ConstructorTestClass extends DischargeInstructionsOperations {
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

} // DischargeInstructionsOperations
