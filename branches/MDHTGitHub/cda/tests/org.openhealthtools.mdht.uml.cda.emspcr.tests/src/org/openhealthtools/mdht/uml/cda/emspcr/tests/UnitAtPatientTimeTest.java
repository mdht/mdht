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
import org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.UnitAtPatientTimeOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unit At Patient Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.UnitAtPatientTime#validateUnitAtPatientTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unit At Patient Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnitAtPatientTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatientTimeTemplateId() {
		OperationsTestCase<UnitAtPatientTime> validateUnitAtPatientTimeTemplateIdTestCase = new OperationsTestCase<UnitAtPatientTime>(
			"validateUnitAtPatientTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENT_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatientTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatientTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatientTimeOperations.validateUnitAtPatientTimeTemplateId(
					(UnitAtPatientTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatientTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatientTimeMoodCode() {
		OperationsTestCase<UnitAtPatientTime> validateUnitAtPatientTimeMoodCodeTestCase = new OperationsTestCase<UnitAtPatientTime>(
			"validateUnitAtPatientTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENT_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatientTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatientTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatientTimeOperations.validateUnitAtPatientTimeMoodCode(
					(UnitAtPatientTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatientTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatientTimeCodeP() {
		OperationsTestCase<UnitAtPatientTime> validateUnitAtPatientTimeCodePTestCase = new OperationsTestCase<UnitAtPatientTime>(
			"validateUnitAtPatientTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENT_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatientTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatientTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatientTimeOperations.validateUnitAtPatientTimeCodeP(
					(UnitAtPatientTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatientTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatientTimeCode() {
		OperationsTestCase<UnitAtPatientTime> validateUnitAtPatientTimeCodeTestCase = new OperationsTestCase<UnitAtPatientTime>(
			"validateUnitAtPatientTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENT_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatientTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatientTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatientTimeOperations.validateUnitAtPatientTimeCode(
					(UnitAtPatientTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatientTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateUnitAtPatientTimeValue() {
		OperationsTestCase<UnitAtPatientTime> validateUnitAtPatientTimeValueTestCase = new OperationsTestCase<UnitAtPatientTime>(
			"validateUnitAtPatientTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_UNIT_AT_PATIENT_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnitAtPatientTime target) {

			}

			@Override
			protected void updateToPass(UnitAtPatientTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnitAtPatientTimeOperations.validateUnitAtPatientTimeValue(
					(UnitAtPatientTime) objectToTest, diagnostician, map);
			}

		};

		validateUnitAtPatientTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnitAtPatientTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnitAtPatientTime> {
		public UnitAtPatientTime create() {
			return EmspcrFactory.eINSTANCE.createUnitAtPatientTime();
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
	private static class ConstructorTestClass extends UnitAtPatientTimeOperations {
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

} // UnitAtPatientTimeOperations
