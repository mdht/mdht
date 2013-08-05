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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseBeginningOdometerReadingOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Beginning Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseBeginningOdometerReading#validateResponseBeginningOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Beginning Odometer Reading Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseBeginningOdometerReadingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseBeginningOdometerReadingTemplateId() {
		OperationsTestCase<ResponseBeginningOdometerReading> validateResponseBeginningOdometerReadingTemplateIdTestCase = new OperationsTestCase<ResponseBeginningOdometerReading>(
			"validateResponseBeginningOdometerReadingTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseBeginningOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseBeginningOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingTemplateId(
					(ResponseBeginningOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseBeginningOdometerReadingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseBeginningOdometerReadingCodeP() {
		OperationsTestCase<ResponseBeginningOdometerReading> validateResponseBeginningOdometerReadingCodePTestCase = new OperationsTestCase<ResponseBeginningOdometerReading>(
			"validateResponseBeginningOdometerReadingCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseBeginningOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseBeginningOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingCodeP(
					(ResponseBeginningOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseBeginningOdometerReadingCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseBeginningOdometerReadingCode() {
		OperationsTestCase<ResponseBeginningOdometerReading> validateResponseBeginningOdometerReadingCodeTestCase = new OperationsTestCase<ResponseBeginningOdometerReading>(
			"validateResponseBeginningOdometerReadingCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseBeginningOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseBeginningOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingCode(
					(ResponseBeginningOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseBeginningOdometerReadingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseBeginningOdometerReadingValue() {
		OperationsTestCase<ResponseBeginningOdometerReading> validateResponseBeginningOdometerReadingValueTestCase = new OperationsTestCase<ResponseBeginningOdometerReading>(
			"validateResponseBeginningOdometerReadingValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseBeginningOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseBeginningOdometerReading target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingValue(
					(ResponseBeginningOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseBeginningOdometerReadingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseBeginningOdometerReadingMoodCode() {
		OperationsTestCase<ResponseBeginningOdometerReading> validateResponseBeginningOdometerReadingMoodCodeTestCase = new OperationsTestCase<ResponseBeginningOdometerReading>(
			"validateResponseBeginningOdometerReadingMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_BEGINNING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseBeginningOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseBeginningOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseBeginningOdometerReadingOperations.validateResponseBeginningOdometerReadingMoodCode(
					(ResponseBeginningOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseBeginningOdometerReadingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseBeginningOdometerReadingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseBeginningOdometerReading> {
		public ResponseBeginningOdometerReading create() {
			return EmspcrFactory.eINSTANCE.createResponseBeginningOdometerReading();
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
	private static class ConstructorTestClass extends ResponseBeginningOdometerReadingOperations {
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

} // ResponseBeginningOdometerReadingOperations
