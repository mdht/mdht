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
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PatientConditionDeceasedObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition Deceased Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation#validatePatientConditionDeceasedObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Deceased Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientConditionDeceasedObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationTemplateId() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationTemplateIdTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationTemplateId(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationClassCode() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationClassCodeTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationClassCode(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationMoodCode() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationMoodCodeTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationMoodCode(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationCodeP() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationCodePTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationCodeP(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationCode() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationCodeTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationCode(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationStatusCode() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationStatusCodeTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationStatusCode(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationStatusCodeP() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationStatusCodePTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationStatusCodeP(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationEffectiveTime() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationEffectiveTimeTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationEffectiveTime(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationValue() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationValueTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationValue(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionDeceasedObservationValueP() {
		OperationsTestCase<PatientConditionDeceasedObservation> validatePatientConditionDeceasedObservationValuePTestCase = new OperationsTestCase<PatientConditionDeceasedObservation>(
			"validatePatientConditionDeceasedObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_DECEASED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionDeceasedObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionDeceasedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationValueP(
					(PatientConditionDeceasedObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionDeceasedObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientConditionDeceasedObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientConditionDeceasedObservation> {
		public PatientConditionDeceasedObservation create() {
			return PhcrFactory.eINSTANCE.createPatientConditionDeceasedObservation();
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
	private static class ConstructorTestClass extends PatientConditionDeceasedObservationOperations {
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

} // PatientConditionDeceasedObservationOperations
