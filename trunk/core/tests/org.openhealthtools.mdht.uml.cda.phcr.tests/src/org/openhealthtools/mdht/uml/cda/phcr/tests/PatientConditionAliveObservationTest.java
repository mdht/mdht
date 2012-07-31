/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PatientConditionAliveObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition Alive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation#validatePatientConditionAliveObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Alive Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientConditionAliveObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationTemplateId() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationTemplateIdTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationTemplateId(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationClassCode() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationClassCodeTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationClassCode(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationMoodCode() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationMoodCodeTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationMoodCode(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationCodeP() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationCodePTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationCodeP(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationCode() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationCodeTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationCode(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationStatusCode() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationStatusCodeTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationStatusCode(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationStatusCodeP() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationStatusCodePTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationStatusCodeP(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationEffectiveTime() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationEffectiveTimeTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationEffectiveTime(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationValue() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationValueTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationValue(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionAliveObservationValueP() {
		OperationsTestCase<PatientConditionAliveObservation> validatePatientConditionAliveObservationValuePTestCase = new OperationsTestCase<PatientConditionAliveObservation>(
			"validatePatientConditionAliveObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_ALIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionAliveObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionAliveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationValueP(
					(PatientConditionAliveObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionAliveObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientConditionAliveObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientConditionAliveObservation> {
		public PatientConditionAliveObservation create() {
			return PhcrFactory.eINSTANCE.createPatientConditionAliveObservation();
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
	private static class ConstructorTestClass extends PatientConditionAliveObservationOperations {
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

} // PatientConditionAliveObservationOperations
