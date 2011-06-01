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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;

import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityProcedureOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure#validatePlanOfCareActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Procedure Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivityProcedureTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityProcedureMoodCodeValue() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureMoodCodeValueTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
				"validatePlanOfCareActivityProcedureMoodCodeValue",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations
						.validatePlanOfCareActivityProcedureMoodCodeValue(
								(PlanOfCareActivityProcedure) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureMoodCodeValueTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityProcedureTemplateId() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
				"validatePlanOfCareActivityProcedureTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations
						.validatePlanOfCareActivityProcedureTemplateId(
								(PlanOfCareActivityProcedure) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityProcedureId() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureIdTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
				"validatePlanOfCareActivityProcedureId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations
						.validatePlanOfCareActivityProcedureId(
								(PlanOfCareActivityProcedure) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityProcedureMoodCode() {
		OperationsTestCase<PlanOfCareActivityProcedure> validatePlanOfCareActivityProcedureMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivityProcedure>(
				"validatePlanOfCareActivityProcedureMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityProcedure target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityProcedureOperations
						.validatePlanOfCareActivityProcedureMoodCode(
								(PlanOfCareActivityProcedure) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends
			PlanOfCareActivityProcedureOperations {
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
			TestObjectFactory<PlanOfCareActivityProcedure> {
		public PlanOfCareActivityProcedure create() {
			return CCDFactory.eINSTANCE.createPlanOfCareActivityProcedure();
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

} // PlanOfCareActivityProcedureOperations