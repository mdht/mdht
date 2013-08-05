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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitBackInServiceTimeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Back In Service Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitBackInServiceTime#validateUnitBackInServiceTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Back In Service Time Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitBackInServiceTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitBackInServiceTimeTemplateId() {
		OperationsTestCase<UnitBackInServiceTime> validateUnitBackInServiceTimeTemplateIdTestCase = new OperationsTestCase<UnitBackInServiceTime>(
			"validateUnitBackInServiceTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_BACK_IN_SERVICE_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitBackInServiceTime target) {

			}

			@Override
			protected void updateToPass(UnitBackInServiceTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeTemplateId(
					(UnitBackInServiceTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitBackInServiceTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitBackInServiceTimeCodeP() {
		OperationsTestCase<UnitBackInServiceTime> validateUnitBackInServiceTimeCodePTestCase = new OperationsTestCase<UnitBackInServiceTime>(
			"validateUnitBackInServiceTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitBackInServiceTime target) {

			}

			@Override
			protected void updateToPass(UnitBackInServiceTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeCodeP(
					(UnitBackInServiceTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitBackInServiceTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitBackInServiceTimeCode() {
		OperationsTestCase<UnitBackInServiceTime> validateUnitBackInServiceTimeCodeTestCase = new OperationsTestCase<UnitBackInServiceTime>(
			"validateUnitBackInServiceTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_BACK_IN_SERVICE_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitBackInServiceTime target) {

			}

			@Override
			protected void updateToPass(UnitBackInServiceTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeCode(
					(UnitBackInServiceTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitBackInServiceTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitBackInServiceTimeValue() {
		OperationsTestCase<UnitBackInServiceTime> validateUnitBackInServiceTimeValueTestCase = new OperationsTestCase<UnitBackInServiceTime>(
			"validateUnitBackInServiceTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_BACK_IN_SERVICE_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitBackInServiceTime target) {

			}

			@Override
			protected void updateToPass(UnitBackInServiceTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeValue(
					(UnitBackInServiceTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitBackInServiceTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitBackInServiceTimeMoodCode() {
		OperationsTestCase<UnitBackInServiceTime> validateUnitBackInServiceTimeMoodCodeTestCase = new OperationsTestCase<UnitBackInServiceTime>(
			"validateUnitBackInServiceTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_BACK_IN_SERVICE_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitBackInServiceTime target) {

			}

			@Override
			protected void updateToPass(UnitBackInServiceTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitBackInServiceTimeOperations.validateUnitBackInServiceTimeMoodCode(
					(UnitBackInServiceTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitBackInServiceTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnitBackInServiceTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitBackInServiceTime> {
		public UnitBackInServiceTime create() {
			return EmspcrFactory.eINSTANCE.createUnitBackInServiceTime();
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
	private static class ConstructorTestClass extends UnitBackInServiceTimeOperations {
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

} // UnitBackInServiceTimeOperations
