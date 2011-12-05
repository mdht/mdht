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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCodeCodeSystemRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code Code System Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationDisplayNameCodeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Display Name Code Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergySubstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Substance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergySubstanceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Substance Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergySubstanceParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Substance Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergySubstanceParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Substance Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergySubstancePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Substance Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergySubstancePlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Substance Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergySubstancePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Substance Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationPlayingEntityCodeReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Playing Entity Code Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationProblemEntryReactionObservationContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Problem Entry Reaction Observation Container</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getProblemEntryReactionObservationContainers() <em>Get Problem Entry Reaction Observation Containers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getAllergyStatusObservation() <em>Get Allergy Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationInformationSource() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationInformationSourceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationInformationSource(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationContainsPatientAwareness() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationContainsPatientAwarenessTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationContainsPatientAwareness",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationContainsPatientAwareness(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationContainsPatientAwarenessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationHasTextReference() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationHasTextReferenceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationHasTextReference(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationCommentInversionInd() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationCommentInversionIndTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationCommentInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationCommentInversionInd(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCommentInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationCodeCodeSystemRequired() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationCodeCodeSystemRequiredTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationCodeCodeSystemRequired",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE_CODE_SYSTEM_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationCodeCodeSystemRequired(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodeCodeSystemRequiredTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationDisplayNameCodeName() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationDisplayNameCodeNameTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationDisplayNameCodeName",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_DISPLAY_NAME_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationDisplayNameCodeName(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationDisplayNameCodeNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationAllergySubstance() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergySubstanceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergySubstance",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergySubstance(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergySubstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationAllergySubstanceTypeCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergySubstanceTypeCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergySubstanceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_SUBSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergySubstanceTypeCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergySubstanceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationAllergySubstanceParticipantRole() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergySubstanceParticipantRoleTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergySubstanceParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergySubstanceParticipantRole(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergySubstanceParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationAllergySubstanceParticipantRoleClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergySubstanceParticipantRoleClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergySubstanceParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_SUBSTANCE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergySubstanceParticipantRoleClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergySubstanceParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationAllergySubstancePlayingEntity() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergySubstancePlayingEntityTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergySubstancePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_SUBSTANCE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergySubstancePlayingEntity(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergySubstancePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationAllergySubstancePlayingEntityClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergySubstancePlayingEntityClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergySubstancePlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergySubstancePlayingEntityClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergySubstancePlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationAllergySubstancePlayingEntityCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergySubstancePlayingEntityCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergySubstancePlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_SUBSTANCE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergySubstancePlayingEntityCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergySubstancePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationPlayingEntityCodeReference() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationPlayingEntityCodeReferenceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationPlayingEntityCodeReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationPlayingEntityCodeReference(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationPlayingEntityCodeReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationTemplateId() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationTemplateIdTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationTemplateId(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationMoodCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationMoodCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationMoodCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationId() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationIdTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationId(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationText() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationTextTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationText(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationStatusCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationStatusCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationStatusCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationEffectiveTime() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationEffectiveTime(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationValueTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationProblemEntryReactionObservationContainer() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationProblemEntryReactionObservationContainerTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationProblemEntryReactionObservationContainer",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationProblemEntryReactionObservationContainer(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationProblemEntryReactionObservationContainerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationSeverity() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationSeverityTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationSeverity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationSeverity(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationSeverityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntryReactionObservationContainers() {

		AllergyObservation target = objectFactory.create();
		target.getProblemEntryReactionObservationContainers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverity() {

		AllergyObservation target = objectFactory.create();
		target.getSeverity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyStatusObservation() {

		AllergyObservation target = objectFactory.create();
		target.getAllergyStatusObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyObservation> {
		public AllergyObservation create() {
			return ConsolFactory.eINSTANCE.createAllergyObservation();
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
	private static class ConstructorTestClass extends AllergyObservationOperations {
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

} // AllergyObservationOperations
