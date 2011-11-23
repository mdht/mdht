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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySupplyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Supply</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply#validatePlanOfCareActivitySupplyId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Supply Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivitySupplyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyMoodCodeValue() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyMoodCodeValueTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyMoodCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyMoodCodeValue(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyMoodCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyTemplateId() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyTemplateId(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyMoodCode() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyMoodCode(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySupplyId() {
		OperationsTestCase<PlanOfCareActivitySupply> validatePlanOfCareActivitySupplyIdTestCase = new OperationsTestCase<PlanOfCareActivitySupply>(
			"validatePlanOfCareActivitySupplyId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUPPLY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySupply target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySupply target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyId(
					(PlanOfCareActivitySupply) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySupplyIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareActivitySupplyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareActivitySupply> {

		public PlanOfCareActivitySupply create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareActivitySupply();
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
	private static class ConstructorTestClass extends PlanOfCareActivitySupplyOperations {
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

} // PlanOfCareActivitySupplyOperations
