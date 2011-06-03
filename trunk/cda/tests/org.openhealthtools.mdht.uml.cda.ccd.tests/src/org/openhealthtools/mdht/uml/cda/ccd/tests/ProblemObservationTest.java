/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Problem Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationProblemStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationProblemHealthStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Health Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#validateProblemObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#getProblemStatus() <em>Get Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#getProblemHealthStatus() <em>Get Problem Health Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationInformationSource() {
		OperationsTestCase<ProblemObservation> validateProblemObservationInformationSourceTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationInformationSource(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationInformationSourceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationContainsPatientAwareness() {
		OperationsTestCase<ProblemObservation> validateProblemObservationContainsPatientAwarenessTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationContainsPatientAwareness",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationContainsPatientAwareness(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationContainsPatientAwarenessTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<ProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationTemplateId(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationMoodCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationMoodCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationMoodCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationStatusCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationStatusCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationEffectiveTime() {
		OperationsTestCase<ProblemObservation> validateProblemObservationEffectiveTimeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationEffectiveTime(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationProblemStatus() {
		OperationsTestCase<ProblemObservation> validateProblemObservationProblemStatusTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationProblemStatus",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationProblemStatus(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationProblemStatusTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationProblemHealthStatus() {
		OperationsTestCase<ProblemObservation> validateProblemObservationProblemHealthStatusTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationProblemHealthStatus",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationProblemHealthStatus(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationProblemHealthStatusTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemObservationAgeObservation() {
		OperationsTestCase<ProblemObservation> validateProblemObservationAgeObservationTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationAgeObservation(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationAgeObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemObservation> {
		public ProblemObservation create() {
			return CCDFactory.eINSTANCE.createProblemObservation();
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
	private static class ConstructorTestClass extends ProblemObservationOperations {
	}

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

} // ProblemObservationOperations
