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
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Problem Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActSubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTimeLowHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time Low High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActHasRelatedObservations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Has Related Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActRelatedObservationsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Related Observations Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActHasRelatedReferencesTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Has Related References Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAdverseEventDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Adverse Event Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAdverseEventType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Adverse Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAdverseEventTypeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Adverse Event Type Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyProductTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Product Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActProductDetailParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Product Detail Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActProductDetailParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Product Detail Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActProductDetailPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Product Detail Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActProductDetailPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Product Detail Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActProductDetailName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Product Detail Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActProductCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Product Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyProductFoodVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Product Food Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyProductMedClassVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Product Med Class Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyProductSpecificMedVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Product Specific Med Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActReactionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Reaction Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActReactionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Reaction Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActReactionCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Reaction Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActSeverityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Severity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActSeverityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Severity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActSeverityCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Severity Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#validateAllergyProblemActAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct#getAllergyObservations() <em>Get Allergy Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyProblemActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActEntryRelationshipRequired() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEntryRelationshipRequiredTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEntryRelationshipRequired",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEntryRelationshipRequired(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEntryRelationshipRequiredTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActSubjectOfTarget() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActSubjectOfTargetTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActSubjectOfTarget",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActSubjectOfTarget(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActSubjectOfTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActContainsProblemObservation() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActContainsProblemObservationTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActContainsProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActContainsProblemObservation(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActContainsProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActContainsAlertObservation() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActContainsAlertObservationTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActContainsAlertObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActContainsAlertObservation(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActContainsAlertObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActContainsPatientAwareness() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActContainsPatientAwarenessTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActContainsPatientAwareness",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActContainsPatientAwareness(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActContainsPatientAwarenessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTimeLowHigh() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeLowHighTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTimeLowHigh",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME_LOW_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeLowHigh(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeLowHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActHasRelatedObservations() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActHasRelatedObservationsTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActHasRelatedObservations",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_HAS_RELATED_OBSERVATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActHasRelatedObservations(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActHasRelatedObservationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActRelatedObservationsTypeCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActRelatedObservationsTypeCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActRelatedObservationsTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_RELATED_OBSERVATIONS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActRelatedObservationsTypeCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActRelatedObservationsTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActHasRelatedReferencesTypeCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActHasRelatedReferencesTypeCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActHasRelatedReferencesTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_HAS_RELATED_REFERENCES_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActHasRelatedReferencesTypeCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActHasRelatedReferencesTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAdverseEventDate() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAdverseEventDateTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAdverseEventDate",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ADVERSE_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAdverseEventDate(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAdverseEventDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAdverseEventType() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAdverseEventTypeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAdverseEventType",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ADVERSE_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAdverseEventType(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAdverseEventTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAdverseEventTypeVocab() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAdverseEventTypeVocabTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAdverseEventTypeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ADVERSE_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAdverseEventTypeVocab(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAdverseEventTypeVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAllergyProduct() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyProductTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyProduct",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyProduct(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAllergyProductTypeCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyProductTypeCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyProductTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyProductTypeCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyProductTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActProductDetailParticipantRole() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActProductDetailParticipantRoleTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActProductDetailParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActProductDetailParticipantRole(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActProductDetailParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActProductDetailParticipantRoleClassCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActProductDetailParticipantRoleClassCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActProductDetailParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActProductDetailParticipantRoleClassCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActProductDetailParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActProductDetailPlayingEntity() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActProductDetailPlayingEntityTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActProductDetailPlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActProductDetailPlayingEntity(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActProductDetailPlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActProductDetailPlayingEntityClassCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActProductDetailPlayingEntityClassCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActProductDetailPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActProductDetailPlayingEntityClassCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActProductDetailPlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActProductDetailName() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActProductDetailNameTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActProductDetailName",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActProductDetailName(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActProductDetailNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActProductCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActProductCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActProductCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActProductCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActProductCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAllergyProductFoodVocab() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyProductFoodVocabTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyProductFoodVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyProductFoodVocab(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyProductFoodVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAllergyProductMedClassVocab() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyProductMedClassVocabTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyProductMedClassVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyProductMedClassVocab(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyProductMedClassVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAllergyProductSpecificMedVocab() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyProductSpecificMedVocabTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyProductSpecificMedVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyProductSpecificMedVocab(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyProductSpecificMedVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActReactionText() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActReactionTextTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActReactionText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActReactionText(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActReactionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActReactionCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActReactionCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActReactionCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActReactionCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActReactionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActReactionCodeVocab() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActReactionCodeVocabTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActReactionCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActReactionCodeVocab(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActReactionCodeVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActSeverityText() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActSeverityTextTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActSeverityText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActSeverityText(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActSeverityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActSeverityCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActSeverityCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActSeverityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActSeverityCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActSeverityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActSeverityCodeVocab() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActSeverityCodeVocabTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActSeverityCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActSeverityCodeVocab(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActSeverityCodeVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActTemplateId() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActTemplateIdTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActTemplateId(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActClassCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActClassCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActClassCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActMoodCode() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActMoodCodeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActMoodCode(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActId() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActIdTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActId(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActCodeNullFlavor() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActCodeNullFlavorTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActCodeNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActCodeNullFlavor(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActCodeNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActEffectiveTime() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActEffectiveTimeTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActEffectiveTime(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActAllergyObservation() {
		OperationsTestCase<AllergyProblemAct> validateAllergyProblemActAllergyObservationTestCase = new OperationsTestCase<AllergyProblemAct>(
			"validateAllergyProblemActAllergyObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(AllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyProblemActOperations.validateAllergyProblemActAllergyObservation(
					(AllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActAllergyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyObservations() {

		AllergyProblemAct target = objectFactory.create();
		target.getAllergyObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyProblemActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyProblemAct> {
		public AllergyProblemAct create() {
			return ConsolFactory.eINSTANCE.createAllergyProblemAct();
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
	private static class ConstructorTestClass extends AllergyProblemActOperations {
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

} // AllergyProblemActOperations
