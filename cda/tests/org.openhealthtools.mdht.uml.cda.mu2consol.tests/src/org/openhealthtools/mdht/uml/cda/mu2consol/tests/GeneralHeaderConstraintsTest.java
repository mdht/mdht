/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>General Header Constraints</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateMu2consolGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol General Header Constraints Record Target</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateMu2consolGeneralHeaderConstraintsDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol General Header Constraints Documentation Of</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Documentation Of Service Event
 * Performer1 Assigned Entity Assigned Person</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Documentation Of Service Event
 * Performer1 Assigned Entity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Documentation Of Service Event
 * Performer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Documentation Of Service Event</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Component1 Encompassing Encounter
 * Encounter Participant</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponent1EncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Component1 Encompassing Encounter
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Ethnic Group Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Ethnic Group Code P</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Race Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Race Code P</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * Language Communication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role Patient
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Record Target Patient Role</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class GeneralHeaderConstraintsTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolGeneralHeaderConstraintsRecordTarget() {
		OperationsTestCase<GeneralHeaderConstraints> validateMu2consolGeneralHeaderConstraintsRecordTargetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateMu2consolGeneralHeaderConstraintsRecordTarget",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateMu2consolGeneralHeaderConstraintsRecordTarget(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolGeneralHeaderConstraintsRecordTargetTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolGeneralHeaderConstraintsDocumentationOf() {
		OperationsTestCase<GeneralHeaderConstraints> validateMu2consolGeneralHeaderConstraintsDocumentationOfTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateMu2consolGeneralHeaderConstraintsDocumentationOf",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateMu2consolGeneralHeaderConstraintsDocumentationOf(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolGeneralHeaderConstraintsDocumentationOfTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPerson(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityAssignedPersonTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformerTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEvent() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsDocumentationOfServiceEvent",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT1_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipantTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsComponent1EncompassingEncounter() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponent1EncompassingEncounterTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsComponent1EncompassingEncounter",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT1_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsComponent1EncompassingEncounter(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponent1EncompassingEncounterTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsRecordTargetPatientRolePatient",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRole() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsRecordTargetPatientRole",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations
						.validateGeneralHeaderConstraintsRecordTargetPatientRole(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			GeneralHeaderConstraintsOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<GeneralHeaderConstraints> {

		@Override
		public GeneralHeaderConstraints create() {
			return Mu2consolFactory.eINSTANCE.createGeneralHeaderConstraints();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			GeneralHeaderConstraintsOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

	/**
	 * 
	 * @generated
	 */
	//
	// protected EObject getObjectToTest() {
	// return null;
	// }

} // GeneralHeaderConstraintsOperations
