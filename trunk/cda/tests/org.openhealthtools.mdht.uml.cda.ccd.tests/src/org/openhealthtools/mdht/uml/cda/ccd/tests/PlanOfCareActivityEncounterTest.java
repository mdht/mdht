/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityEncounterOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Plan Of Care Activity Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Plan Of Care Activity Encounter Mood Code Value</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Plan Of Care Activity Encounter Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Plan Of Care Activity Encounter Mood Code</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class PlanOfCareActivityEncounterTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityEncounterMoodCodeValue() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterMoodCodeValueTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
				"validatePlanOfCareActivityEncounterMoodCodeValue",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations
						.validatePlanOfCareActivityEncounterMoodCodeValue(
								(PlanOfCareActivityEncounter) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterMoodCodeValueTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityEncounterTemplateId() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
				"validatePlanOfCareActivityEncounterTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations
						.validatePlanOfCareActivityEncounterTemplateId(
								(PlanOfCareActivityEncounter) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityEncounterId() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterIdTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
				"validatePlanOfCareActivityEncounterId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations
						.validatePlanOfCareActivityEncounterId(
								(PlanOfCareActivityEncounter) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityEncounterMoodCode() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
				"validatePlanOfCareActivityEncounterMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations
						.validatePlanOfCareActivityEncounterMoodCode(
								(PlanOfCareActivityEncounter) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			PlanOfCareActivityEncounterOperations {
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
			TestObjectFactory<PlanOfCareActivityEncounter> {
		public PlanOfCareActivityEncounter create() {
			return CCDFactory.eINSTANCE.createPlanOfCareActivityEncounter();
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
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PlanOfCareActivityEncounterOperations