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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseEndingOdometerReadingOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Ending Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReading#validateResponseEndingOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Ending Odometer Reading Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseEndingOdometerReadingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseEndingOdometerReadingTemplateId() {
		OperationsTestCase<ResponseEndingOdometerReading> validateResponseEndingOdometerReadingTemplateIdTestCase = new OperationsTestCase<ResponseEndingOdometerReading>(
			"validateResponseEndingOdometerReadingTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ENDING_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseEndingOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseEndingOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingTemplateId(
					(ResponseEndingOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseEndingOdometerReadingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseEndingOdometerReadingMoodCode() {
		OperationsTestCase<ResponseEndingOdometerReading> validateResponseEndingOdometerReadingMoodCodeTestCase = new OperationsTestCase<ResponseEndingOdometerReading>(
			"validateResponseEndingOdometerReadingMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ENDING_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseEndingOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseEndingOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingMoodCode(
					(ResponseEndingOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseEndingOdometerReadingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseEndingOdometerReadingCodeP() {
		OperationsTestCase<ResponseEndingOdometerReading> validateResponseEndingOdometerReadingCodePTestCase = new OperationsTestCase<ResponseEndingOdometerReading>(
			"validateResponseEndingOdometerReadingCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseEndingOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseEndingOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingCodeP(
					(ResponseEndingOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseEndingOdometerReadingCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseEndingOdometerReadingCode() {
		OperationsTestCase<ResponseEndingOdometerReading> validateResponseEndingOdometerReadingCodeTestCase = new OperationsTestCase<ResponseEndingOdometerReading>(
			"validateResponseEndingOdometerReadingCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ENDING_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseEndingOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseEndingOdometerReading target) {
				target.init();

			}

			@Override
			protected void setDependency(ResponseEndingOdometerReading target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseEndingOdometerReadingCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingCode(
					(ResponseEndingOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseEndingOdometerReadingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseEndingOdometerReadingValue() {
		OperationsTestCase<ResponseEndingOdometerReading> validateResponseEndingOdometerReadingValueTestCase = new OperationsTestCase<ResponseEndingOdometerReading>(
			"validateResponseEndingOdometerReadingValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ENDING_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseEndingOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseEndingOdometerReading target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseEndingOdometerReadingOperations.validateResponseEndingOdometerReadingValue(
					(ResponseEndingOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseEndingOdometerReadingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseEndingOdometerReadingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseEndingOdometerReading> {
		public ResponseEndingOdometerReading create() {
			return EmspcrFactory.eINSTANCE.createResponseEndingOdometerReading();
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
	private static class ConstructorTestClass extends ResponseEndingOdometerReadingOperations {
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

} // ResponseEndingOdometerReadingOperations
