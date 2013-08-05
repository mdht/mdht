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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitEnRouteTimeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit En Route Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime#validateUnitEnRouteTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit En Route Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime#validateUnitEnRouteTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit En Route Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime#validateUnitEnRouteTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit En Route Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime#validateUnitEnRouteTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit En Route Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitEnRouteTime#validateUnitEnRouteTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit En Route Time Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitEnRouteTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitEnRouteTimeTemplateId() {
		OperationsTestCase<UnitEnRouteTime> validateUnitEnRouteTimeTemplateIdTestCase = new OperationsTestCase<UnitEnRouteTime>(
			"validateUnitEnRouteTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_EN_ROUTE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitEnRouteTime target) {

			}

			@Override
			protected void updateToPass(UnitEnRouteTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitEnRouteTimeOperations.validateUnitEnRouteTimeTemplateId(
					(UnitEnRouteTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitEnRouteTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitEnRouteTimeCodeP() {
		OperationsTestCase<UnitEnRouteTime> validateUnitEnRouteTimeCodePTestCase = new OperationsTestCase<UnitEnRouteTime>(
			"validateUnitEnRouteTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_EN_ROUTE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitEnRouteTime target) {

			}

			@Override
			protected void updateToPass(UnitEnRouteTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitEnRouteTimeOperations.validateUnitEnRouteTimeCodeP(
					(UnitEnRouteTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitEnRouteTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitEnRouteTimeCode() {
		OperationsTestCase<UnitEnRouteTime> validateUnitEnRouteTimeCodeTestCase = new OperationsTestCase<UnitEnRouteTime>(
			"validateUnitEnRouteTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_EN_ROUTE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitEnRouteTime target) {

			}

			@Override
			protected void updateToPass(UnitEnRouteTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitEnRouteTimeOperations.validateUnitEnRouteTimeCode(
					(UnitEnRouteTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitEnRouteTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitEnRouteTimeValue() {
		OperationsTestCase<UnitEnRouteTime> validateUnitEnRouteTimeValueTestCase = new OperationsTestCase<UnitEnRouteTime>(
			"validateUnitEnRouteTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_EN_ROUTE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitEnRouteTime target) {

			}

			@Override
			protected void updateToPass(UnitEnRouteTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitEnRouteTimeOperations.validateUnitEnRouteTimeValue(
					(UnitEnRouteTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitEnRouteTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitEnRouteTimeMoodCode() {
		OperationsTestCase<UnitEnRouteTime> validateUnitEnRouteTimeMoodCodeTestCase = new OperationsTestCase<UnitEnRouteTime>(
			"validateUnitEnRouteTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_EN_ROUTE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitEnRouteTime target) {

			}

			@Override
			protected void updateToPass(UnitEnRouteTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitEnRouteTimeOperations.validateUnitEnRouteTimeMoodCode(
					(UnitEnRouteTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitEnRouteTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnitEnRouteTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitEnRouteTime> {
		public UnitEnRouteTime create() {
			return EmspcrFactory.eINSTANCE.createUnitEnRouteTime();
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
	private static class ConstructorTestClass extends UnitEnRouteTimeOperations {
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

} // UnitEnRouteTimeOperations
