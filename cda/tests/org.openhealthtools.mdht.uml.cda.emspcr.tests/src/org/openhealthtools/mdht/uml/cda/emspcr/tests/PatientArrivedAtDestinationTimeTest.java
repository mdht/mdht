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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientArrivedAtDestinationTimeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Arrived At Destination Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientArrivedAtDestinationTime#validatePatientArrivedAtDestinationTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Arrived At Destination Time Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientArrivedAtDestinationTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientArrivedAtDestinationTimeTemplateId() {
		OperationsTestCase<PatientArrivedAtDestinationTime> validatePatientArrivedAtDestinationTimeTemplateIdTestCase = new OperationsTestCase<PatientArrivedAtDestinationTime>(
			"validatePatientArrivedAtDestinationTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientArrivedAtDestinationTime target) {

			}

			@Override
			protected void updateToPass(PatientArrivedAtDestinationTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeTemplateId(
					(PatientArrivedAtDestinationTime) objectToTest, diagnostician, map);
			}

		};

		validatePatientArrivedAtDestinationTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientArrivedAtDestinationTimeCodeP() {
		OperationsTestCase<PatientArrivedAtDestinationTime> validatePatientArrivedAtDestinationTimeCodePTestCase = new OperationsTestCase<PatientArrivedAtDestinationTime>(
			"validatePatientArrivedAtDestinationTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientArrivedAtDestinationTime target) {

			}

			@Override
			protected void updateToPass(PatientArrivedAtDestinationTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeCodeP(
					(PatientArrivedAtDestinationTime) objectToTest, diagnostician, map);
			}

		};

		validatePatientArrivedAtDestinationTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientArrivedAtDestinationTimeCode() {
		OperationsTestCase<PatientArrivedAtDestinationTime> validatePatientArrivedAtDestinationTimeCodeTestCase = new OperationsTestCase<PatientArrivedAtDestinationTime>(
			"validatePatientArrivedAtDestinationTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientArrivedAtDestinationTime target) {

			}

			@Override
			protected void updateToPass(PatientArrivedAtDestinationTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeCode(
					(PatientArrivedAtDestinationTime) objectToTest, diagnostician, map);
			}

		};

		validatePatientArrivedAtDestinationTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientArrivedAtDestinationTimeValue() {
		OperationsTestCase<PatientArrivedAtDestinationTime> validatePatientArrivedAtDestinationTimeValueTestCase = new OperationsTestCase<PatientArrivedAtDestinationTime>(
			"validatePatientArrivedAtDestinationTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientArrivedAtDestinationTime target) {

			}

			@Override
			protected void updateToPass(PatientArrivedAtDestinationTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeValue(
					(PatientArrivedAtDestinationTime) objectToTest, diagnostician, map);
			}

		};

		validatePatientArrivedAtDestinationTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientArrivedAtDestinationTimeMoodCode() {
		OperationsTestCase<PatientArrivedAtDestinationTime> validatePatientArrivedAtDestinationTimeMoodCodeTestCase = new OperationsTestCase<PatientArrivedAtDestinationTime>(
			"validatePatientArrivedAtDestinationTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ARRIVED_AT_DESTINATION_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientArrivedAtDestinationTime target) {

			}

			@Override
			protected void updateToPass(PatientArrivedAtDestinationTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientArrivedAtDestinationTimeOperations.validatePatientArrivedAtDestinationTimeMoodCode(
					(PatientArrivedAtDestinationTime) objectToTest, diagnostician, map);
			}

		};

		validatePatientArrivedAtDestinationTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientArrivedAtDestinationTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientArrivedAtDestinationTime> {
		public PatientArrivedAtDestinationTime create() {
			return EmspcrFactory.eINSTANCE.createPatientArrivedAtDestinationTime();
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
	private static class ConstructorTestClass extends PatientArrivedAtDestinationTimeOperations {
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

} // PatientArrivedAtDestinationTimeOperations
