/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentAndPlanSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment And Plan Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#validateAssessmentAndPlanSectionEncounterEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan Section Encounter Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getMedications() <em>Get Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getImmunizations() <em>Get Immunizations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection#getEncounterEntries() <em>Get Encounter Entries</em>}</li>
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
	public void testValidateAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionTemplateId(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionCode() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionCodeTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionCode(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionMedication() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionMedicationTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionMedication(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionImmunization() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionImmunizationTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionImmunization",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionImmunization(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentAndPlanSectionEncounterEntry() {
		OperationsTestCase<AssessmentAndPlanSection> validateAssessmentAndPlanSectionEncounterEntryTestCase = new OperationsTestCase<AssessmentAndPlanSection>(
			"validateAssessmentAndPlanSectionEncounterEntry",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return AssessmentAndPlanSectionOperations.validateAssessmentAndPlanSectionEncounterEntry(
					(AssessmentAndPlanSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanSectionEncounterEntryTestCase.doValidationTest();
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
			return ConsolFactory.eINSTANCE.createAssessmentAndPlanSection();
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
