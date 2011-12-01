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

import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.AssessmentAndPlanSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionEncounterEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Encounter Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#validateHITSPAssessmentAndPlanSectionProcedureEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Assessment And Plan Section Procedure Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getMedications() <em>Get Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getImmunizations() <em>Get Immunizations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getEncounterEntries() <em>Get Encounter Entries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection#getProcedureEntries() <em>Get Procedure Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentAndPlanSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<AssessmentAndPlanSection> validateHITSPAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateHITSPAssessmentAndPlanSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionTemplateId(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAssessmentAndPlanSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPAssessmentAndPlanSectionMedication() {
		OperationsTestCase<AssessmentAndPlanSection> validateHITSPAssessmentAndPlanSectionMedicationTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateHITSPAssessmentAndPlanSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionMedication(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAssessmentAndPlanSectionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPAssessmentAndPlanSectionImmunization() {
		OperationsTestCase<AssessmentAndPlanSection> validateHITSPAssessmentAndPlanSectionImmunizationTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateHITSPAssessmentAndPlanSectionImmunization",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionImmunization(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAssessmentAndPlanSectionImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPAssessmentAndPlanSectionEncounterEntry() {
		OperationsTestCase<AssessmentAndPlanSection> validateHITSPAssessmentAndPlanSectionEncounterEntryTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateHITSPAssessmentAndPlanSectionEncounterEntry",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionEncounterEntry(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAssessmentAndPlanSectionEncounterEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPAssessmentAndPlanSectionProcedureEntry() {
		OperationsTestCase<AssessmentAndPlanSection> validateHITSPAssessmentAndPlanSectionProcedureEntryTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateHITSPAssessmentAndPlanSectionProcedureEntry",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ASSESSMENT_AND_PLAN_SECTION_PROCEDURE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanSection target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanSectionOperations.validateHITSPAssessmentAndPlanSectionProcedureEntry(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAssessmentAndPlanSectionProcedureEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedications() {

		AssessmentAndPlanSection target = objectFactory.create();
		target.getMedications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizations() {

		AssessmentAndPlanSection target = objectFactory.create();
		target.getImmunizations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncounterEntries() {

		AssessmentAndPlanSection target = objectFactory.create();
		target.getEncounterEntries();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEntries() {

		AssessmentAndPlanSection target = objectFactory.create();
		target.getProcedureEntries();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentAndPlanSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentAndPlanSection> {
		public AssessmentAndPlanSection create() {
			return HITSPFactory.eINSTANCE.createAssessmentAndPlanSection();
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
	private static class ConstructorTestClass extends AssessmentAndPlanSectionOperations {
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

} // AssessmentAndPlanSectionOperations
