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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfHistoryOfConditionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of History Of Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition#validateExistenceOfHistoryOfConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition#validateExistenceOfHistoryOfConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition#validateExistenceOfHistoryOfConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition#validateExistenceOfHistoryOfConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Condition Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfHistoryOfConditionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfConditionTemplateId() {
		OperationsTestCase<ExistenceOfHistoryOfCondition> validateExistenceOfHistoryOfConditionTemplateIdTestCase = new OperationsTestCase<ExistenceOfHistoryOfCondition>(
			"validateExistenceOfHistoryOfConditionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionTemplateId(
					(ExistenceOfHistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfConditionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfConditionCode() {
		OperationsTestCase<ExistenceOfHistoryOfCondition> validateExistenceOfHistoryOfConditionCodeTestCase = new OperationsTestCase<ExistenceOfHistoryOfCondition>(
			"validateExistenceOfHistoryOfConditionCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionCode(
					(ExistenceOfHistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfConditionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfConditionValue() {
		OperationsTestCase<ExistenceOfHistoryOfCondition> validateExistenceOfHistoryOfConditionValueTestCase = new OperationsTestCase<ExistenceOfHistoryOfCondition>(
			"validateExistenceOfHistoryOfConditionValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfCondition target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionValue(
					(ExistenceOfHistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfConditionValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfConditionMoodCode() {
		OperationsTestCase<ExistenceOfHistoryOfCondition> validateExistenceOfHistoryOfConditionMoodCodeTestCase = new OperationsTestCase<ExistenceOfHistoryOfCondition>(
			"validateExistenceOfHistoryOfConditionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfConditionOperations.validateExistenceOfHistoryOfConditionMoodCode(
					(ExistenceOfHistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfConditionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExistenceOfHistoryOfConditionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfHistoryOfCondition> {
		public ExistenceOfHistoryOfCondition create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfHistoryOfCondition();
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
	private static class ConstructorTestClass extends ExistenceOfHistoryOfConditionOperations {
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

} // ExistenceOfHistoryOfConditionOperations
