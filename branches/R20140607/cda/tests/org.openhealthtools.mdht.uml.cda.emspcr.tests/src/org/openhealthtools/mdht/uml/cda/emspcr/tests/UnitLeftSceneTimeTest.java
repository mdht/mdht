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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitLeftSceneTimeOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Left Scene Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTime#validateUnitLeftSceneTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Left Scene Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitLeftSceneTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitLeftSceneTimeTemplateId() {
		OperationsTestCase<UnitLeftSceneTime> validateUnitLeftSceneTimeTemplateIdTestCase = new OperationsTestCase<UnitLeftSceneTime>(
			"validateUnitLeftSceneTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_LEFT_SCENE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitLeftSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitLeftSceneTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeTemplateId(
					(UnitLeftSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitLeftSceneTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitLeftSceneTimeMoodCode() {
		OperationsTestCase<UnitLeftSceneTime> validateUnitLeftSceneTimeMoodCodeTestCase = new OperationsTestCase<UnitLeftSceneTime>(
			"validateUnitLeftSceneTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_LEFT_SCENE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitLeftSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitLeftSceneTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeMoodCode(
					(UnitLeftSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitLeftSceneTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitLeftSceneTimeCodeP() {
		OperationsTestCase<UnitLeftSceneTime> validateUnitLeftSceneTimeCodePTestCase = new OperationsTestCase<UnitLeftSceneTime>(
			"validateUnitLeftSceneTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_LEFT_SCENE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitLeftSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitLeftSceneTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeCodeP(
					(UnitLeftSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitLeftSceneTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitLeftSceneTimeCode() {
		OperationsTestCase<UnitLeftSceneTime> validateUnitLeftSceneTimeCodeTestCase = new OperationsTestCase<UnitLeftSceneTime>(
			"validateUnitLeftSceneTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_LEFT_SCENE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitLeftSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitLeftSceneTime target) {
				target.init();

			}

			@Override
			protected void setDependency(UnitLeftSceneTime target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.UnitLeftSceneTimeCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeCode(
					(UnitLeftSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitLeftSceneTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitLeftSceneTimeValue() {
		OperationsTestCase<UnitLeftSceneTime> validateUnitLeftSceneTimeValueTestCase = new OperationsTestCase<UnitLeftSceneTime>(
			"validateUnitLeftSceneTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_LEFT_SCENE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitLeftSceneTime target) {

			}

			@Override
			protected void updateToPass(UnitLeftSceneTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitLeftSceneTimeOperations.validateUnitLeftSceneTimeValue(
					(UnitLeftSceneTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitLeftSceneTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnitLeftSceneTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitLeftSceneTime> {
		public UnitLeftSceneTime create() {
			return EmspcrFactory.eINSTANCE.createUnitLeftSceneTime();
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
	private static class ConstructorTestClass extends UnitLeftSceneTimeOperations {
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

} // UnitLeftSceneTimeOperations
