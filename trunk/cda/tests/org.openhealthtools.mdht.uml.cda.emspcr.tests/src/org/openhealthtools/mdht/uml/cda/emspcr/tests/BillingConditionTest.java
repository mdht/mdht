/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.BillingConditionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Billing Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BillingCondition#validateBillingConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Billing Condition Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BillingConditionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingConditionTemplateId() {
		OperationsTestCase<BillingCondition> validateBillingConditionTemplateIdTestCase = new OperationsTestCase<BillingCondition>(
			"validateBillingConditionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingCondition target) {

			}

			@Override
			protected void updateToPass(BillingCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingConditionOperations.validateBillingConditionTemplateId(
					(BillingCondition) objectToTest, diagnostician, map);
			}

		};

		validateBillingConditionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingConditionCodeP() {
		OperationsTestCase<BillingCondition> validateBillingConditionCodePTestCase = new OperationsTestCase<BillingCondition>(
			"validateBillingConditionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingCondition target) {

			}

			@Override
			protected void updateToPass(BillingCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingConditionOperations.validateBillingConditionCodeP(
					(BillingCondition) objectToTest, diagnostician, map);
			}

		};

		validateBillingConditionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingConditionCode() {
		OperationsTestCase<BillingCondition> validateBillingConditionCodeTestCase = new OperationsTestCase<BillingCondition>(
			"validateBillingConditionCode",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingCondition target) {

			}

			@Override
			protected void updateToPass(BillingCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingConditionOperations.validateBillingConditionCode(
					(BillingCondition) objectToTest, diagnostician, map);
			}

		};

		validateBillingConditionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingConditionValue() {
		OperationsTestCase<BillingCondition> validateBillingConditionValueTestCase = new OperationsTestCase<BillingCondition>(
			"validateBillingConditionValue",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingCondition target) {

			}

			@Override
			protected void updateToPass(BillingCondition target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingConditionOperations.validateBillingConditionValue(
					(BillingCondition) objectToTest, diagnostician, map);
			}

		};

		validateBillingConditionValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingConditionValueP() {
		OperationsTestCase<BillingCondition> validateBillingConditionValuePTestCase = new OperationsTestCase<BillingCondition>(
			"validateBillingConditionValueP",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingCondition target) {

			}

			@Override
			protected void updateToPass(BillingCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingConditionOperations.validateBillingConditionValueP(
					(BillingCondition) objectToTest, diagnostician, map);
			}

		};

		validateBillingConditionValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBillingConditionMoodCode() {
		OperationsTestCase<BillingCondition> validateBillingConditionMoodCodeTestCase = new OperationsTestCase<BillingCondition>(
			"validateBillingConditionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BILLING_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BillingCondition target) {

			}

			@Override
			protected void updateToPass(BillingCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BillingConditionOperations.validateBillingConditionMoodCode(
					(BillingCondition) objectToTest, diagnostician, map);
			}

		};

		validateBillingConditionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BillingConditionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BillingCondition> {
		public BillingCondition create() {
			return EmspcrFactory.eINSTANCE.createBillingCondition();
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
	private static class ConstructorTestClass extends BillingConditionOperations {
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

} // BillingConditionOperations
