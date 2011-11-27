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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Component</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasSubjectPatientRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Subject Patient Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerRelationshipValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Relationship Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerHasFamilyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Has Family Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyMemberCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family Member Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#validateFamilyHistoryOrganizerFamilyHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Organizer Family History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryOrganizer#getFamilyHistoryObservations() <em>Get Family History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasComponent() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasComponentTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasComponent",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasComponent(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasComponentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasFamilyHistoryObservation() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasFamilyHistoryObservationTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasFamilyHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasFamilyHistoryObservation(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasFamilyHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasSubject() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasSubjectTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasSubject(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasSubjectPatientRelationship() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasSubjectPatientRelationshipTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasSubjectPatientRelationship",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasSubjectPatientRelationship(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasSubjectPatientRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerRelationshipValueCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerRelationshipValueCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerRelationshipValueCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerRelationshipValueCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerRelationshipValueCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasRelatedSubjectCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasRelatedSubjectCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasRelatedSubjectCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasRelatedSubjectCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasRelatedSubjectCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasRelatedSubjectSubject() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasRelatedSubjectSubjectTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasRelatedSubjectSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasRelatedSubjectSubject(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasRelatedSubjectSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasGenderCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasGenderCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasGenderCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerRelatedSubjectBirthTime() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerRelatedSubjectBirthTimeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerRelatedSubjectBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerRelatedSubjectBirthTime(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerRelatedSubjectBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasParticipant() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasParticipantTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasParticipant",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasParticipant(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasParticipantParticipantRole() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasParticipantParticipantRoleTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasParticipantParticipantRole(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasParticipantRoleCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasParticipantRoleCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasParticipantRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasParticipantRoleCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasParticipantRolePlayingEntity() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasParticipantRolePlayingEntityTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasParticipantRolePlayingEntity(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerRelatedSubjectCodeValueSet() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerRelatedSubjectCodeValueSetTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerRelatedSubjectCodeValueSet(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerRelatedSubjectCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerHasFamilyName() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerHasFamilyNameTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerHasFamilyName",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerHasFamilyName(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerHasFamilyNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerFamilyMemberCondition() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerFamilyMemberConditionTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerFamilyMemberCondition",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerFamilyMemberCondition(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerFamilyMemberConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerTemplateId() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerTemplateIdTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerTemplateId(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerClassCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerClassCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerClassCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerMoodCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerMoodCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerMoodCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerStatusCode() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerStatusCodeTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerStatusCode(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryOrganizerFamilyHistoryObservation() {
		OperationsTestCase<FamilyHistoryOrganizer> validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase = new OperationsTestCase<FamilyHistoryOrganizer>(
			"validateFamilyHistoryOrganizerFamilyHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_ORGANIZER_FAMILY_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryOrganizer target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOrganizerOperations.validateFamilyHistoryOrganizerFamilyHistoryObservation(
					(FamilyHistoryOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryOrganizerFamilyHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistoryObservations() {

		FamilyHistoryOrganizer target = objectFactory.create();
		target.getFamilyHistoryObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryOrganizer> {
		public FamilyHistoryOrganizer create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryOrganizer();
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
	private static class ConstructorTestClass extends FamilyHistoryOrganizerOperations {
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

} // FamilyHistoryOrganizerOperations
