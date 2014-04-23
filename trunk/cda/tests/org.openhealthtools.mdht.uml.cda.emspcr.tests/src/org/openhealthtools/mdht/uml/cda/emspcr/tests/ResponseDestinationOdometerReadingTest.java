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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseDestinationOdometerReadingOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Destination Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReading#validateResponseDestinationOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Destination Odometer Reading Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseDestinationOdometerReadingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDestinationOdometerReadingTemplateId() {
		OperationsTestCase<ResponseDestinationOdometerReading> validateResponseDestinationOdometerReadingTemplateIdTestCase = new OperationsTestCase<ResponseDestinationOdometerReading>(
			"validateResponseDestinationOdometerReadingTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDestinationOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseDestinationOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingTemplateId(
					(ResponseDestinationOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseDestinationOdometerReadingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDestinationOdometerReadingMoodCode() {
		OperationsTestCase<ResponseDestinationOdometerReading> validateResponseDestinationOdometerReadingMoodCodeTestCase = new OperationsTestCase<ResponseDestinationOdometerReading>(
			"validateResponseDestinationOdometerReadingMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDestinationOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseDestinationOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingMoodCode(
					(ResponseDestinationOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseDestinationOdometerReadingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDestinationOdometerReadingCodeP() {
		OperationsTestCase<ResponseDestinationOdometerReading> validateResponseDestinationOdometerReadingCodePTestCase = new OperationsTestCase<ResponseDestinationOdometerReading>(
			"validateResponseDestinationOdometerReadingCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDestinationOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseDestinationOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingCodeP(
					(ResponseDestinationOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseDestinationOdometerReadingCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDestinationOdometerReadingCode() {
		OperationsTestCase<ResponseDestinationOdometerReading> validateResponseDestinationOdometerReadingCodeTestCase = new OperationsTestCase<ResponseDestinationOdometerReading>(
			"validateResponseDestinationOdometerReadingCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDestinationOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseDestinationOdometerReading target) {
				target.init();

			}

			@Override
			protected void setDependency(ResponseDestinationOdometerReading target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseDestinationOdometerReadingCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingCode(
					(ResponseDestinationOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseDestinationOdometerReadingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDestinationOdometerReadingValue() {
		OperationsTestCase<ResponseDestinationOdometerReading> validateResponseDestinationOdometerReadingValueTestCase = new OperationsTestCase<ResponseDestinationOdometerReading>(
			"validateResponseDestinationOdometerReadingValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DESTINATION_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDestinationOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseDestinationOdometerReading target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDestinationOdometerReadingOperations.validateResponseDestinationOdometerReadingValue(
					(ResponseDestinationOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseDestinationOdometerReadingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseDestinationOdometerReadingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseDestinationOdometerReading> {
		public ResponseDestinationOdometerReading create() {
			return EmspcrFactory.eINSTANCE.createResponseDestinationOdometerReading();
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
	private static class ConstructorTestClass extends ResponseDestinationOdometerReadingOperations {
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

} // ResponseDestinationOdometerReadingOperations
