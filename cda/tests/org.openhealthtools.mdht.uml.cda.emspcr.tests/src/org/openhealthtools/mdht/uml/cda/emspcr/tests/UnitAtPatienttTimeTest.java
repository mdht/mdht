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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitAtPatienttTimeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit At Patientt Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime#validateUnitAtPatienttTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patientt Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime#validateUnitAtPatienttTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patientt Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime#validateUnitAtPatienttTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patientt Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime#validateUnitAtPatienttTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patientt Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatienttTime#validateUnitAtPatienttTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patientt Time Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitAtPatienttTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatienttTimeTemplateId() {
		OperationsTestCase<UnitAtPatienttTime> validateUnitAtPatienttTimeTemplateIdTestCase = new OperationsTestCase<UnitAtPatienttTime>(
			"validateUnitAtPatienttTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENTT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatienttTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatienttTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeTemplateId(
					(UnitAtPatienttTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatienttTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatienttTimeCodeP() {
		OperationsTestCase<UnitAtPatienttTime> validateUnitAtPatienttTimeCodePTestCase = new OperationsTestCase<UnitAtPatienttTime>(
			"validateUnitAtPatienttTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENTT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatienttTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatienttTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeCodeP(
					(UnitAtPatienttTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatienttTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatienttTimeCode() {
		OperationsTestCase<UnitAtPatienttTime> validateUnitAtPatienttTimeCodeTestCase = new OperationsTestCase<UnitAtPatienttTime>(
			"validateUnitAtPatienttTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENTT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatienttTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatienttTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeCode(
					(UnitAtPatienttTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatienttTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatienttTimeValue() {
		OperationsTestCase<UnitAtPatienttTime> validateUnitAtPatienttTimeValueTestCase = new OperationsTestCase<UnitAtPatienttTime>(
			"validateUnitAtPatienttTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENTT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatienttTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatienttTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeValue(
					(UnitAtPatienttTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatienttTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatienttTimeMoodCode() {
		OperationsTestCase<UnitAtPatienttTime> validateUnitAtPatienttTimeMoodCodeTestCase = new OperationsTestCase<UnitAtPatienttTime>(
			"validateUnitAtPatienttTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENTT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatienttTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatienttTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatienttTimeOperations.validateUnitAtPatienttTimeMoodCode(
					(UnitAtPatienttTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatienttTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnitAtPatienttTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitAtPatienttTime> {
		public UnitAtPatienttTime create() {
			return EmspcrFactory.eINSTANCE.createUnitAtPatienttTime();
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
	private static class ConstructorTestClass extends UnitAtPatienttTimeOperations {
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

} // UnitAtPatienttTimeOperations
