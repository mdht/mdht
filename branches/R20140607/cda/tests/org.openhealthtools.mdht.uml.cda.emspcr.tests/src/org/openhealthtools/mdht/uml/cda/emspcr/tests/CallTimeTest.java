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
import org.openhealthtools.mdht.uml.cda.emspcr.CallTime;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CallTimeOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Call Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CallTime#validateCallTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Call Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CallTime#validateCallTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Call Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CallTime#validateCallTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Call Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CallTime#validateCallTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Call Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CallTime#validateCallTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Call Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CallTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCallTimeTemplateId() {
		OperationsTestCase<CallTime> validateCallTimeTemplateIdTestCase = new OperationsTestCase<CallTime>(
			"validateCallTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CALL_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CallTime target) {

			}

			@Override
			protected void updateToPass(CallTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CallTimeOperations.validateCallTimeTemplateId((CallTime) objectToTest, diagnostician, map);
			}

		};

		validateCallTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCallTimeMoodCode() {
		OperationsTestCase<CallTime> validateCallTimeMoodCodeTestCase = new OperationsTestCase<CallTime>(
			"validateCallTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CALL_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CallTime target) {

			}

			@Override
			protected void updateToPass(CallTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CallTimeOperations.validateCallTimeMoodCode((CallTime) objectToTest, diagnostician, map);
			}

		};

		validateCallTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCallTimeCodeP() {
		OperationsTestCase<CallTime> validateCallTimeCodePTestCase = new OperationsTestCase<CallTime>(
			"validateCallTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CALL_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CallTime target) {

			}

			@Override
			protected void updateToPass(CallTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CallTimeOperations.validateCallTimeCodeP((CallTime) objectToTest, diagnostician, map);
			}

		};

		validateCallTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCallTimeCode() {
		OperationsTestCase<CallTime> validateCallTimeCodeTestCase = new OperationsTestCase<CallTime>(
			"validateCallTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_CALL_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CallTime target) {

			}

			@Override
			protected void updateToPass(CallTime target) {
				target.init();

			}

			@Override
			protected void setDependency(CallTime target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.CallTimeCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CallTimeOperations.validateCallTimeCode((CallTime) objectToTest, diagnostician, map);
			}

		};

		validateCallTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCallTimeValue() {
		OperationsTestCase<CallTime> validateCallTimeValueTestCase = new OperationsTestCase<CallTime>(
			"validateCallTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_CALL_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CallTime target) {

			}

			@Override
			protected void updateToPass(CallTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CallTimeOperations.validateCallTimeValue((CallTime) objectToTest, diagnostician, map);
			}

		};

		validateCallTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CallTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CallTime> {
		public CallTime create() {
			return EmspcrFactory.eINSTANCE.createCallTime();
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
	private static class ConstructorTestClass extends CallTimeOperations {
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

} // CallTimeOperations
