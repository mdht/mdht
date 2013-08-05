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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitNotifiedTimeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit Notified Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime#validateUnitNotifiedTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Notified Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime#validateUnitNotifiedTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Notified Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime#validateUnitNotifiedTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Notified Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime#validateUnitNotifiedTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Notified Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitNotifiedTime#validateUnitNotifiedTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit Notified Time Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitNotifiedTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitNotifiedTimeTemplateId() {
		OperationsTestCase<UnitNotifiedTime> validateUnitNotifiedTimeTemplateIdTestCase = new OperationsTestCase<UnitNotifiedTime>(
			"validateUnitNotifiedTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_NOTIFIED_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitNotifiedTime target) {

			}

			@Override
			protected void updateToPass(UnitNotifiedTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitNotifiedTimeOperations.validateUnitNotifiedTimeTemplateId(
					(UnitNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitNotifiedTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitNotifiedTimeCodeP() {
		OperationsTestCase<UnitNotifiedTime> validateUnitNotifiedTimeCodePTestCase = new OperationsTestCase<UnitNotifiedTime>(
			"validateUnitNotifiedTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_NOTIFIED_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitNotifiedTime target) {

			}

			@Override
			protected void updateToPass(UnitNotifiedTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitNotifiedTimeOperations.validateUnitNotifiedTimeCodeP(
					(UnitNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitNotifiedTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitNotifiedTimeCode() {
		OperationsTestCase<UnitNotifiedTime> validateUnitNotifiedTimeCodeTestCase = new OperationsTestCase<UnitNotifiedTime>(
			"validateUnitNotifiedTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_NOTIFIED_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitNotifiedTime target) {

			}

			@Override
			protected void updateToPass(UnitNotifiedTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitNotifiedTimeOperations.validateUnitNotifiedTimeCode(
					(UnitNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitNotifiedTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitNotifiedTimeValue() {
		OperationsTestCase<UnitNotifiedTime> validateUnitNotifiedTimeValueTestCase = new OperationsTestCase<UnitNotifiedTime>(
			"validateUnitNotifiedTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_NOTIFIED_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitNotifiedTime target) {

			}

			@Override
			protected void updateToPass(UnitNotifiedTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitNotifiedTimeOperations.validateUnitNotifiedTimeValue(
					(UnitNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitNotifiedTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitNotifiedTimeMoodCode() {
		OperationsTestCase<UnitNotifiedTime> validateUnitNotifiedTimeMoodCodeTestCase = new OperationsTestCase<UnitNotifiedTime>(
			"validateUnitNotifiedTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_NOTIFIED_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitNotifiedTime target) {

			}

			@Override
			protected void updateToPass(UnitNotifiedTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitNotifiedTimeOperations.validateUnitNotifiedTimeMoodCode(
					(UnitNotifiedTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitNotifiedTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnitNotifiedTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitNotifiedTime> {
		public UnitNotifiedTime create() {
			return EmspcrFactory.eINSTANCE.createUnitNotifiedTime();
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
	private static class ConstructorTestClass extends UnitNotifiedTimeOperations {
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

} // UnitNotifiedTimeOperations
