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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseOnSceneOdometerReadingOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response On Scene Odometer Reading</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOnSceneOdometerReading#validateResponseOnSceneOdometerReadingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response On Scene Odometer Reading Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseOnSceneOdometerReadingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOnSceneOdometerReadingTemplateId() {
		OperationsTestCase<ResponseOnSceneOdometerReading> validateResponseOnSceneOdometerReadingTemplateIdTestCase = new OperationsTestCase<ResponseOnSceneOdometerReading>(
			"validateResponseOnSceneOdometerReadingTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOnSceneOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseOnSceneOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingTemplateId(
					(ResponseOnSceneOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseOnSceneOdometerReadingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOnSceneOdometerReadingCodeP() {
		OperationsTestCase<ResponseOnSceneOdometerReading> validateResponseOnSceneOdometerReadingCodePTestCase = new OperationsTestCase<ResponseOnSceneOdometerReading>(
			"validateResponseOnSceneOdometerReadingCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOnSceneOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseOnSceneOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingCodeP(
					(ResponseOnSceneOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseOnSceneOdometerReadingCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOnSceneOdometerReadingCode() {
		OperationsTestCase<ResponseOnSceneOdometerReading> validateResponseOnSceneOdometerReadingCodeTestCase = new OperationsTestCase<ResponseOnSceneOdometerReading>(
			"validateResponseOnSceneOdometerReadingCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOnSceneOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseOnSceneOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingCode(
					(ResponseOnSceneOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseOnSceneOdometerReadingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOnSceneOdometerReadingValue() {
		OperationsTestCase<ResponseOnSceneOdometerReading> validateResponseOnSceneOdometerReadingValueTestCase = new OperationsTestCase<ResponseOnSceneOdometerReading>(
			"validateResponseOnSceneOdometerReadingValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOnSceneOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseOnSceneOdometerReading target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingValue(
					(ResponseOnSceneOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseOnSceneOdometerReadingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOnSceneOdometerReadingMoodCode() {
		OperationsTestCase<ResponseOnSceneOdometerReading> validateResponseOnSceneOdometerReadingMoodCodeTestCase = new OperationsTestCase<ResponseOnSceneOdometerReading>(
			"validateResponseOnSceneOdometerReadingMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ON_SCENE_ODOMETER_READING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOnSceneOdometerReading target) {

			}

			@Override
			protected void updateToPass(ResponseOnSceneOdometerReading target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOnSceneOdometerReadingOperations.validateResponseOnSceneOdometerReadingMoodCode(
					(ResponseOnSceneOdometerReading) objectToTest, diagnostician, map);
			}

		};

		validateResponseOnSceneOdometerReadingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseOnSceneOdometerReadingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseOnSceneOdometerReading> {
		public ResponseOnSceneOdometerReading create() {
			return EmspcrFactory.eINSTANCE.createResponseOnSceneOdometerReading();
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
	private static class ConstructorTestClass extends ResponseOnSceneOdometerReadingOperations {
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

} // ResponseOnSceneOdometerReadingOperations
