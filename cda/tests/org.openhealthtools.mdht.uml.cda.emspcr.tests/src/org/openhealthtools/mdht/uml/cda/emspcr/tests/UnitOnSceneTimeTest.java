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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitOnSceneTimeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit On Scene Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitOnSceneTime#validateUnitOnSceneTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit On Scene Time Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitOnSceneTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitOnSceneTimeTemplateId() {
		OperationsTestCase<UnitOnSceneTime> validateUnitOnSceneTimeTemplateIdTestCase = new OperationsTestCase<UnitOnSceneTime>(
			"validateUnitOnSceneTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_ON_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitOnSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitOnSceneTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitOnSceneTimeOperations.validateUnitOnSceneTimeTemplateId(
					(UnitOnSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitOnSceneTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitOnSceneTimeCodeP() {
		OperationsTestCase<UnitOnSceneTime> validateUnitOnSceneTimeCodePTestCase = new OperationsTestCase<UnitOnSceneTime>(
			"validateUnitOnSceneTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_ON_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitOnSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitOnSceneTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitOnSceneTimeOperations.validateUnitOnSceneTimeCodeP(
					(UnitOnSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitOnSceneTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitOnSceneTimeCode() {
		OperationsTestCase<UnitOnSceneTime> validateUnitOnSceneTimeCodeTestCase = new OperationsTestCase<UnitOnSceneTime>(
			"validateUnitOnSceneTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_ON_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitOnSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitOnSceneTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitOnSceneTimeOperations.validateUnitOnSceneTimeCode(
					(UnitOnSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitOnSceneTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitOnSceneTimeValue() {
		OperationsTestCase<UnitOnSceneTime> validateUnitOnSceneTimeValueTestCase = new OperationsTestCase<UnitOnSceneTime>(
			"validateUnitOnSceneTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_ON_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitOnSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitOnSceneTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitOnSceneTimeOperations.validateUnitOnSceneTimeValue(
					(UnitOnSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitOnSceneTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitOnSceneTimeMoodCode() {
		OperationsTestCase<UnitOnSceneTime> validateUnitOnSceneTimeMoodCodeTestCase = new OperationsTestCase<UnitOnSceneTime>(
			"validateUnitOnSceneTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_ON_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitOnSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitOnSceneTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitOnSceneTimeOperations.validateUnitOnSceneTimeMoodCode(
					(UnitOnSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitOnSceneTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnitOnSceneTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitOnSceneTime> {
		public UnitOnSceneTime create() {
			return EmspcrFactory.eINSTANCE.createUnitOnSceneTime();
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
	private static class ConstructorTestClass extends UnitOnSceneTimeOperations {
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

} // UnitOnSceneTimeOperations
