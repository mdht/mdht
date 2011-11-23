/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemConcernActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActSubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActHasRelatedObservations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Has Related Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActRelatedObservationsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Related Observations Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActHasRelatedReferencesTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Has Related References Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActHasTreatingProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Has Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActHasProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Has Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActHasProviderTreatmentTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Has Provider Treatment Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#validateProblemConcernActProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct#getProblemObservation() <em>Get Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemConcernActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEntryRelationshipRequired() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActEntryRelationshipRequiredTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActEntryRelationshipRequired",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActEntryRelationshipRequired(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEntryRelationshipRequiredTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActSubjectOfTarget() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActSubjectOfTargetTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActSubjectOfTarget",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActSubjectOfTarget(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActSubjectOfTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActContainsProblemObservation() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActContainsProblemObservationTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActContainsProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActContainsProblemObservation(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActContainsProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActContainsAlertObservation() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActContainsAlertObservationTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActContainsAlertObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActContainsAlertObservation(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActContainsAlertObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActContainsPatientAwareness() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActContainsPatientAwarenessTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActContainsPatientAwareness",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActContainsPatientAwareness(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActContainsPatientAwarenessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTimeLowHigh() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActEffectiveTimeLowHighTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActEffectiveTimeLowHigh",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActEffectiveTimeLowHigh(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeLowHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActHasRelatedObservations() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActHasRelatedObservationsTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActHasRelatedObservations",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActHasRelatedObservations(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActHasRelatedObservationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActRelatedObservationsTypeCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActRelatedObservationsTypeCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActRelatedObservationsTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActRelatedObservationsTypeCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActRelatedObservationsTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActHasRelatedReferencesTypeCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActHasRelatedReferencesTypeCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActHasRelatedReferencesTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActHasRelatedReferencesTypeCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActHasRelatedReferencesTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActHasTreatingProvider() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActHasTreatingProviderTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActHasTreatingProvider",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActHasTreatingProvider(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActHasTreatingProviderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActHasProviderId() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActHasProviderIdTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActHasProviderId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActHasProviderId(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActHasProviderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActHasProviderTreatmentTime() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActHasProviderTreatmentTimeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActHasProviderTreatmentTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActHasProviderTreatmentTime(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActHasProviderTreatmentTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActTemplateId() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActTemplateIdTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActTemplateId(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActClassCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActClassCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActClassCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActMoodCode() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActMoodCodeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActMoodCode(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActId() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActIdTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActId(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActCodeNullFlavor() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActCodeNullFlavorTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActCodeNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActCodeNullFlavor(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActCodeNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActEffectiveTime() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActEffectiveTimeTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActEffectiveTime(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemConcernActProblemObservation() {
		OperationsTestCase<ProblemConcernAct> validateProblemConcernActProblemObservationTestCase = new OperationsTestCase<ProblemConcernAct>(
			"validateProblemConcernActProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemConcernAct target) {

			}

			@Override
			protected void updateToPass(ProblemConcernAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemConcernActOperations.validateProblemConcernActProblemObservation(
					(ProblemConcernAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemConcernActProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation() {

		ProblemConcernAct target = objectFactory.create();
		target.getProblemObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemConcernActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemConcernAct> {

		public ProblemConcernAct create() {
			return ConsolFactory.eINSTANCE.createProblemConcernAct();
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
	private static class ConstructorTestClass extends ProblemConcernActOperations {
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

} // ProblemConcernActOperations
