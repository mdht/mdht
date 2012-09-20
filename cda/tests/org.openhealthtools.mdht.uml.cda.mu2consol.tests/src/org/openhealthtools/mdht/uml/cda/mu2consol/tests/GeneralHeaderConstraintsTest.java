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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

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
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponent1EncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Component1 Encompassing Encounter
 * Encounter Participant</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponent1EncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Component1 Encompassing Encounter
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
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
 * </ul>
 * </p>
 * 
 * @generated
 */

public class GeneralHeaderConstraintsTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
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
				RecordTarget rTarget = CDAFactory.eINSTANCE
						.createRecordTarget();
				target.getRecordTargets().add(rTarget);

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
	 * @generated NOT
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
				DocumentationOf dOf = CDAFactory.eINSTANCE
						.createDocumentationOf();
				target.getDocumentationOfs().add(dOf);

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
	 * @generated NOT
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
				target.init();
				DocumentationOf dOf = CDAFactory.eINSTANCE
						.createDocumentationOf();
				ServiceEvent sEvent = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 performer = CDAFactory.eINSTANCE.createPerformer1();
				AssignedEntity aE = CDAFactory.eINSTANCE.createAssignedEntity();
				dOf.setServiceEvent(sEvent);
				sEvent.getPerformers().add(performer);
				performer.setAssignedEntity(aE);
				target.getDocumentationOfs().add(dOf);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Person aPerson = CDAFactory.eINSTANCE.createPerson();
				target.getDocumentationOfs().get(0).getServiceEvent()
						.getPerformers().get(0).getAssignedEntity()
						.setAssignedPerson(aPerson);

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
	 * @generated NOT
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
				DocumentationOf dOf = CDAFactory.eINSTANCE
						.createDocumentationOf();
				ServiceEvent sEvent = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 performer = CDAFactory.eINSTANCE.createPerformer1();
				dOf.setServiceEvent(sEvent);
				sEvent.getPerformers().add(performer);
				target.getDocumentationOfs().add(dOf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				AssignedEntity aE = CDAFactory.eINSTANCE.createAssignedEntity();
				target.getDocumentationOfs().get(0).getServiceEvent()
						.getPerformers().get(0).setAssignedEntity(aE);

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
	 * @generated NOT
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
				target.init();
				DocumentationOf dOf = CDAFactory.eINSTANCE
						.createDocumentationOf();
				ServiceEvent sEvent = CDAFactory.eINSTANCE.createServiceEvent();
				dOf.setServiceEvent(sEvent);
				target.getDocumentationOfs().add(dOf);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Performer1 performer = CDAFactory.eINSTANCE.createPerformer1();
				target.getDocumentationOfs().get(0).getServiceEvent()
						.getPerformers().add(performer);

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
	 * @generated NOT
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
				DocumentationOf dOf = CDAFactory.eINSTANCE
						.createDocumentationOf();
				target.getDocumentationOfs().add(dOf);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				ServiceEvent sEvent = CDAFactory.eINSTANCE.createServiceEvent();
				target.getDocumentationOfs().get(0).setServiceEvent(sEvent);

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
	 * @generated NOT
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
				target.init();
				Component1 comp1 = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter eEncounter = CDAFactory.eINSTANCE
						.createEncompassingEncounter();
				comp1.setEncompassingEncounter(eEncounter);
				target.setComponentOf(comp1);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				EncounterParticipant participant = CDAFactory.eINSTANCE
						.createEncounterParticipant();
				target.getComponentOf().getEncompassingEncounter()
						.getEncounterParticipants().add(participant);

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
	 * @generated NOT
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
				target.init();
				Component1 compObj = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(compObj);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				EncompassingEncounter eEncounter = CDAFactory.eINSTANCE
						.createEncompassingEncounter();
				target.getComponentOf().setEncompassingEncounter(eEncounter);

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
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						.validateGeneralHeaderConstraintsTemplateId(
								(GeneralHeaderConstraints) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
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
				target.init();
				RecordTarget rT = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				target.getRecordTargets().add(rT);
				rT.setPatientRole(pRole);
				pRole.setPatient(patient);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCode("2135-2");
				ce.setCodeSystem("2.16.840.1.113883.6.238");
				target.getRecordTargets().get(0).getPatientRole().getPatient()
						.setEthnicGroupCode(ce);

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
	 * @generated NOT
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
				target.init();
				RecordTarget rT = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				target.getRecordTargets().add(rT);
				rT.setPatientRole(pRole);
				pRole.setPatient(patient);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCode("2135-2");
				ce.setCodeSystem("2.16.840.1.113883.6.238");
				target.getRecordTargets().get(0).getPatientRole().getPatient()
						.setEthnicGroupCode(ce);
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
	 * @generated NOT
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
				target.init();
				RecordTarget rT = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				target.getRecordTargets().add(rT);
				rT.setPatientRole(pRole);
				pRole.setPatient(patient);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.6.238");
				ce.setCode("2054-5");
				target.getRecordTargets().get(0).getPatientRole().getPatient()
						.setRaceCode(ce);

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
	 * @generated NOT
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
				target.init();
				RecordTarget rT = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				target.getRecordTargets().add(rT);
				rT.setPatientRole(pRole);
				pRole.setPatient(patient);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.6.238");
				ce.setCode("1111111111");
				target.getRecordTargets().get(0).getPatientRole().getPatient()
						.setRaceCode(ce);

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
	 * @generated NOT
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
				target.init();
				RecordTarget rT = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				target.getRecordTargets().add(rT);
				rT.setPatientRole(pRole);
				pRole.setPatient(patient);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LanguageCommunication lComm = CDAFactory.eINSTANCE
						.createLanguageCommunication();
				target.getRecordTargets().get(0).getPatientRole().getPatient()
						.getLanguageCommunications().add(lComm);

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
	 * @generated NOT
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
				target.init();
				RecordTarget rT = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				target.getRecordTargets().add(rT);
				rT.setPatientRole(pRole);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				target.getRecordTargets().get(0).getPatientRole()
						.setPatient(patient);
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
	 * @generated NOT
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
				target.init();
				RecordTarget rT = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rT);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				target.getRecordTargets().get(0).setPatientRole(pRole);

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
