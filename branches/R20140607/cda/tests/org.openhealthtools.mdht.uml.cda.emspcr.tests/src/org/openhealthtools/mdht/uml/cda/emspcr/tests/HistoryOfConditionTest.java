/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.HistoryOfConditionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition#validateHistoryOfConditionValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Condition Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryOfConditionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfConditionTemplateId() {
		OperationsTestCase<HistoryOfCondition> validateHistoryOfConditionTemplateIdTestCase = new OperationsTestCase<HistoryOfCondition>(
			"validateHistoryOfConditionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(HistoryOfCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfConditionOperations.validateHistoryOfConditionTemplateId(
					(HistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfConditionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfConditionMoodCode() {
		OperationsTestCase<HistoryOfCondition> validateHistoryOfConditionMoodCodeTestCase = new OperationsTestCase<HistoryOfCondition>(
			"validateHistoryOfConditionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(HistoryOfCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfConditionOperations.validateHistoryOfConditionMoodCode(
					(HistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfConditionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfConditionCodeP() {
		OperationsTestCase<HistoryOfCondition> validateHistoryOfConditionCodePTestCase = new OperationsTestCase<HistoryOfCondition>(
			"validateHistoryOfConditionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(HistoryOfCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfConditionOperations.validateHistoryOfConditionCodeP(
					(HistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfConditionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfConditionCode() {
		OperationsTestCase<HistoryOfCondition> validateHistoryOfConditionCodeTestCase = new OperationsTestCase<HistoryOfCondition>(
			"validateHistoryOfConditionCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(HistoryOfCondition target) {
				target.init();

			}

			@Override
			protected void setDependency(HistoryOfCondition target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfConditionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfConditionOperations.validateHistoryOfConditionCode(
					(HistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfConditionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfConditionValue() {
		OperationsTestCase<HistoryOfCondition> validateHistoryOfConditionValueTestCase = new OperationsTestCase<HistoryOfCondition>(
			"validateHistoryOfConditionValue",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(HistoryOfCondition target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfConditionOperations.validateHistoryOfConditionValue(
					(HistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfConditionValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryOfConditionValueP() {
		OperationsTestCase<HistoryOfCondition> validateHistoryOfConditionValuePTestCase = new OperationsTestCase<HistoryOfCondition>(
			"validateHistoryOfConditionValueP",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_OF_CONDITION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryOfCondition target) {

			}

			@Override
			protected void updateToPass(HistoryOfCondition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryOfConditionOperations.validateHistoryOfConditionValueP(
					(HistoryOfCondition) objectToTest, diagnostician, map);
			}

		};

		validateHistoryOfConditionValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryOfConditionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryOfCondition> {
		public HistoryOfCondition create() {
			return EmspcrFactory.eINSTANCE.createHistoryOfCondition();
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
	private static class ConstructorTestClass extends HistoryOfConditionOperations {
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

} // HistoryOfConditionOperations
