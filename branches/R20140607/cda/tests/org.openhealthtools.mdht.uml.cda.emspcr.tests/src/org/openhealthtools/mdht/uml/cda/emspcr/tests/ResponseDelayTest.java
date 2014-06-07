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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseDelayOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelay#validateResponseDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Delay Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseDelayTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDelayTemplateId() {
		OperationsTestCase<ResponseDelay> validateResponseDelayTemplateIdTestCase = new OperationsTestCase<ResponseDelay>(
			"validateResponseDelayTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDelay target) {

			}

			@Override
			protected void updateToPass(ResponseDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDelayOperations.validateResponseDelayTemplateId(
					(ResponseDelay) objectToTest, diagnostician, map);
			}

		};

		validateResponseDelayTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDelayMoodCode() {
		OperationsTestCase<ResponseDelay> validateResponseDelayMoodCodeTestCase = new OperationsTestCase<ResponseDelay>(
			"validateResponseDelayMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDelay target) {

			}

			@Override
			protected void updateToPass(ResponseDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDelayOperations.validateResponseDelayMoodCode(
					(ResponseDelay) objectToTest, diagnostician, map);
			}

		};

		validateResponseDelayMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDelayCodeP() {
		OperationsTestCase<ResponseDelay> validateResponseDelayCodePTestCase = new OperationsTestCase<ResponseDelay>(
			"validateResponseDelayCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDelay target) {

			}

			@Override
			protected void updateToPass(ResponseDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDelayOperations.validateResponseDelayCodeP(
					(ResponseDelay) objectToTest, diagnostician, map);
			}

		};

		validateResponseDelayCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDelayCode() {
		OperationsTestCase<ResponseDelay> validateResponseDelayCodeTestCase = new OperationsTestCase<ResponseDelay>(
			"validateResponseDelayCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ResponseDelay target) {

			}

			@Override
			protected void updateToPass(ResponseDelay target) {
				target.init();

			}

			@Override
			protected void setDependency(ResponseDelay target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseDelayCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDelayOperations.validateResponseDelayCode(
					(ResponseDelay) objectToTest, diagnostician, map);
			}

		};

		validateResponseDelayCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDelayValue() {
		OperationsTestCase<ResponseDelay> validateResponseDelayValueTestCase = new OperationsTestCase<ResponseDelay>(
			"validateResponseDelayValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDelay target) {

			}

			@Override
			protected void updateToPass(ResponseDelay target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDelayOperations.validateResponseDelayValue(
					(ResponseDelay) objectToTest, diagnostician, map);
			}

		};

		validateResponseDelayValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseDelayValueP() {
		OperationsTestCase<ResponseDelay> validateResponseDelayValuePTestCase = new OperationsTestCase<ResponseDelay>(
			"validateResponseDelayValueP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseDelay target) {

			}

			@Override
			protected void updateToPass(ResponseDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseDelayOperations.validateResponseDelayValueP(
					(ResponseDelay) objectToTest, diagnostician, map);
			}

		};

		validateResponseDelayValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseDelayOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseDelay> {
		public ResponseDelay create() {
			return EmspcrFactory.eINSTANCE.createResponseDelay();
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
	private static class ConstructorTestClass extends ResponseDelayOperations {
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

} // ResponseDelayOperations
