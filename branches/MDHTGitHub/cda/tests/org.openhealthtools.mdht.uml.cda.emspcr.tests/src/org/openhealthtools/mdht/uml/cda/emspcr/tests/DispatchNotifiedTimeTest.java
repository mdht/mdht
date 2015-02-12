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
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchNotifiedTimeOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Notified Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime#validateDispatchNotifiedTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Notified Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime#validateDispatchNotifiedTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Notified Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime#validateDispatchNotifiedTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Notified Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime#validateDispatchNotifiedTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Notified Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTime#validateDispatchNotifiedTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Notified Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispatchNotifiedTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchNotifiedTimeTemplateId() {
		OperationsTestCase<DispatchNotifiedTime> validateDispatchNotifiedTimeTemplateIdTestCase = new OperationsTestCase<DispatchNotifiedTime>(
			"validateDispatchNotifiedTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_NOTIFIED_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchNotifiedTime target) {

			}

			@Override
			protected void updateToPass(DispatchNotifiedTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeTemplateId(
					(DispatchNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateDispatchNotifiedTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchNotifiedTimeMoodCode() {
		OperationsTestCase<DispatchNotifiedTime> validateDispatchNotifiedTimeMoodCodeTestCase = new OperationsTestCase<DispatchNotifiedTime>(
			"validateDispatchNotifiedTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_NOTIFIED_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchNotifiedTime target) {

			}

			@Override
			protected void updateToPass(DispatchNotifiedTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeMoodCode(
					(DispatchNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateDispatchNotifiedTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchNotifiedTimeCodeP() {
		OperationsTestCase<DispatchNotifiedTime> validateDispatchNotifiedTimeCodePTestCase = new OperationsTestCase<DispatchNotifiedTime>(
			"validateDispatchNotifiedTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_NOTIFIED_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchNotifiedTime target) {

			}

			@Override
			protected void updateToPass(DispatchNotifiedTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeCodeP(
					(DispatchNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateDispatchNotifiedTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchNotifiedTimeCode() {
		OperationsTestCase<DispatchNotifiedTime> validateDispatchNotifiedTimeCodeTestCase = new OperationsTestCase<DispatchNotifiedTime>(
			"validateDispatchNotifiedTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_NOTIFIED_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchNotifiedTime target) {

			}

			@Override
			protected void updateToPass(DispatchNotifiedTime target) {
				target.init();

			}

			@Override
			protected void setDependency(DispatchNotifiedTime target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.DispatchNotifiedTimeCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeCode(
					(DispatchNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateDispatchNotifiedTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchNotifiedTimeValue() {
		OperationsTestCase<DispatchNotifiedTime> validateDispatchNotifiedTimeValueTestCase = new OperationsTestCase<DispatchNotifiedTime>(
			"validateDispatchNotifiedTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_NOTIFIED_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchNotifiedTime target) {

			}

			@Override
			protected void updateToPass(DispatchNotifiedTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchNotifiedTimeOperations.validateDispatchNotifiedTimeValue(
					(DispatchNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateDispatchNotifiedTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DispatchNotifiedTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispatchNotifiedTime> {
		public DispatchNotifiedTime create() {
			return EmspcrFactory.eINSTANCE.createDispatchNotifiedTime();
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
	private static class ConstructorTestClass extends DispatchNotifiedTimeOperations {
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

} // DispatchNotifiedTimeOperations
