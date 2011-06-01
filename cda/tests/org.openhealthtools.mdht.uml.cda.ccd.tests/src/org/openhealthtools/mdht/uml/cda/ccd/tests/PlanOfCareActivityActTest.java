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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;

import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityActOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct#validatePlanOfCareActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivityActTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityActMoodCodeValue() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActMoodCodeValueTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
				"validatePlanOfCareActivityActMoodCodeValue",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations
						.validatePlanOfCareActivityActMoodCodeValue(
								(PlanOfCareActivityAct) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityActMoodCodeValueTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityActTemplateId() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
				"validatePlanOfCareActivityActTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations
						.validatePlanOfCareActivityActTemplateId(
								(PlanOfCareActivityAct) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityActId() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActIdTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
				"validatePlanOfCareActivityActId",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations
						.validatePlanOfCareActivityActId(
								(PlanOfCareActivityAct) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityActIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareActivityActMoodCode() {
		OperationsTestCase<PlanOfCareActivityAct> validatePlanOfCareActivityActMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivityAct>(
				"validatePlanOfCareActivityActMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityAct target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityActOperations
						.validatePlanOfCareActivityActMoodCode(
								(PlanOfCareActivityAct) objectToTest,
								diagnostician, map);
			}

		};

		validatePlanOfCareActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends
			PlanOfCareActivityActOperations {
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
			TestObjectFactory<PlanOfCareActivityAct> {
		public PlanOfCareActivityAct create() {
			return CCDFactory.eINSTANCE.createPlanOfCareActivityAct();
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

} // PlanOfCareActivityActOperations