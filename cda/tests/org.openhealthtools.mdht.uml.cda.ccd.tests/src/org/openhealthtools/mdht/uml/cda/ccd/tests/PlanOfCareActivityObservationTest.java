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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;

import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation#validatePlanOfCareActivityObservationMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation#validatePlanOfCareActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation#validatePlanOfCareActivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation#validatePlanOfCareActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivityObservationTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityObservationMoodCodeValue() {
		OperationsTestCase<PlanOfCareActivityObservation> validatePlanOfCareActivityObservationMoodCodeValueTestCase = new OperationsTestCase<PlanOfCareActivityObservation>(
				"validatePlanOfCareActivityObservationMoodCodeValue",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityObservation target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityObservationOperations
						.validatePlanOfCareActivityObservationMoodCodeValue(
								(PlanOfCareActivityObservation) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationMoodCodeValueTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityObservationTemplateId() {
		OperationsTestCase<PlanOfCareActivityObservation> validatePlanOfCareActivityObservationTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivityObservation>(
				"validatePlanOfCareActivityObservationTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityObservation target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityObservationOperations
						.validatePlanOfCareActivityObservationTemplateId(
								(PlanOfCareActivityObservation) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityObservationId() {
		OperationsTestCase<PlanOfCareActivityObservation> validatePlanOfCareActivityObservationIdTestCase = new OperationsTestCase<PlanOfCareActivityObservation>(
				"validatePlanOfCareActivityObservationId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityObservation target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityObservationOperations
						.validatePlanOfCareActivityObservationId(
								(PlanOfCareActivityObservation) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityObservationMoodCode() {
		OperationsTestCase<PlanOfCareActivityObservation> validatePlanOfCareActivityObservationMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivityObservation>(
				"validatePlanOfCareActivityObservationMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityObservation target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityObservationOperations
						.validatePlanOfCareActivityObservationMoodCode(
								(PlanOfCareActivityObservation) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationMoodCodeTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends
			PlanOfCareActivityObservationOperations {
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
			TestObjectFactory<PlanOfCareActivityObservation> {
		public PlanOfCareActivityObservation create() {
			return CCDFactory.eINSTANCE.createPlanOfCareActivityObservation();
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

} // PlanOfCareActivityObservationOperations