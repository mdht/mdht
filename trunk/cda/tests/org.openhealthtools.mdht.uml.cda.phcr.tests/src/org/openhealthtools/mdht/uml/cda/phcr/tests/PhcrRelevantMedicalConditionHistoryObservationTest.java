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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantMedicalConditionHistoryObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Medical Condition History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhcrRelevantMedicalConditionHistoryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationTemplateId() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationTemplateIdTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationClassCode() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationClassCodeTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationClassCode(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationCodeP() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationCodePTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationCodeP(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationCode() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationCodeTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationCode(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTimeTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationMoodCode() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationMoodCodeTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationNegationInd() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationNegationIndTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationStatusCode() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationStatusCodePTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrRelevantMedicalConditionHistoryObservationProblemObservation() {
		OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationProblemObservationTestCase = new OperationsTestCase<PhcrRelevantMedicalConditionHistoryObservation>(
			"validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrRelevantMedicalConditionHistoryObservation target) {

			}

			@Override
			protected void updateToPass(PhcrRelevantMedicalConditionHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(
					(PhcrRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validatePhcrRelevantMedicalConditionHistoryObservationProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservations() {

		PhcrRelevantMedicalConditionHistoryObservation target = objectFactory.create();
		target.getProblemObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhcrRelevantMedicalConditionHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhcrRelevantMedicalConditionHistoryObservation> {
		public PhcrRelevantMedicalConditionHistoryObservation create() {
			return PhcrFactory.eINSTANCE.createPhcrRelevantMedicalConditionHistoryObservation();
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
	private static class ConstructorTestClass extends PhcrRelevantMedicalConditionHistoryObservationOperations {
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

} // PhcrRelevantMedicalConditionHistoryObservationOperations
