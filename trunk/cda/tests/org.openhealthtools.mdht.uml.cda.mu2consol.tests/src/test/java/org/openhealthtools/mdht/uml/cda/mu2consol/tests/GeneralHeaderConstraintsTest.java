/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *    Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>General Header Constraints</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateMU2CONSOLGeneralHeaderConstraintsCareTeamMembers(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL General Header Constraints Care Team Members</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateMU2CONSOLGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL General Header Constraints Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code Term Case Insensitive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL General Header Constraints General Header Constraints Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#retrieveHospitalAdmissionDiagnosisSection() <em>Retrieve Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraintsTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMU2CONSOLGeneralHeaderConstraintsCareTeamMembers() {
		OperationsTestCase<GeneralHeaderConstraints> validateMU2CONSOLGeneralHeaderConstraintsCareTeamMembersTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateMU2CONSOLGeneralHeaderConstraintsCareTeamMembers",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_GENERAL_HEADER_CONSTRAINTS_CARE_TEAM_MEMBERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateMU2CONSOLGeneralHeaderConstraintsCareTeamMembers(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();

						se.getPerformers().add(perf);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

						ee.setResponsibleParty(rp);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

						ee.getEncounterParticipants().add(ep);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});
			}

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

		};

		validateMU2CONSOLGeneralHeaderConstraintsCareTeamMembersTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMU2CONSOLGeneralHeaderConstraintsRecordTarget() {
		OperationsTestCase<GeneralHeaderConstraints> validateMU2CONSOLGeneralHeaderConstraintsRecordTargetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateMU2CONSOLGeneralHeaderConstraintsRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateMU2CONSOLGeneralHeaderConstraintsRecordTarget(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rTarget);

			}

		};

		validateMU2CONSOLGeneralHeaderConstraintsRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitiveTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_TERM_CASE_INSENSITIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication lComm = CDAFactory.eINSTANCE.createLanguageCommunication();
				patient.getLanguageCommunications().add(lComm);
				pRole.setPatient(patient);
				rTarget.setPatientRole(pRole);
				target.getRecordTargets().add(rTarget);

				CS csType = DatatypesFactory.eINSTANCE.createCS();
				// not a valid code
				csType.setCode("abcd");
				lComm.setLanguageCode(csType);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// random case : languageCode code is NOT case sensitive.
						target.init();
						RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						LanguageCommunication lComm = CDAFactory.eINSTANCE.createLanguageCommunication();
						patient.getLanguageCommunications().add(lComm);
						pRole.setPatient(patient);
						rTarget.setPatientRole(pRole);
						target.getRecordTargets().add(rTarget);

						CS csType = DatatypesFactory.eINSTANCE.createCS();
						csType.setCode("eNg");
						lComm.setLanguageCode(csType);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// lower case : same as codes in model
						target.init();
						RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						LanguageCommunication lComm = CDAFactory.eINSTANCE.createLanguageCommunication();
						patient.getLanguageCommunications().add(lComm);
						pRole.setPatient(patient);
						rTarget.setPatientRole(pRole);
						target.getRecordTargets().add(rTarget);

						CS csType = DatatypesFactory.eINSTANCE.createCS();
						csType.setCode("zul");
						lComm.setLanguageCode(csType);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// upper case : languageCode code is NOT case sensitive.
						target.init();
						RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						LanguageCommunication lComm = CDAFactory.eINSTANCE.createLanguageCommunication();
						patient.getLanguageCommunications().add(lComm);
						pRole.setPatient(patient);
						rTarget.setPatientRole(pRole);
						target.getRecordTargets().add(rTarget);

						CS csType = DatatypesFactory.eINSTANCE.createCS();
						csType.setCode("BAM");
						lComm.setLanguageCode(csType);
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitive(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTermCaseInsensitiveTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole() {
		OperationsTestCase<GeneralHeaderConstraints> validateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_GENERAL_HEADER_CONSTRAINTS_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rTarget);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
				rTarget.setPatientRole(CDAFactory.eINSTANCE.createPatientRole());
				target.getRecordTargets().add(rTarget);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRole(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateMU2CONSOLGeneralHeaderConstraintsGeneralHeaderConstraintsRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				DocumentationOf dOf = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent sEvent = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 performer = CDAFactory.eINSTANCE.createPerformer1();
				dOf.setServiceEvent(sEvent);
				sEvent.getPerformers().add(performer);
				target.getDocumentationOfs().add(dOf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				AssignedEntity aE = CDAFactory.eINSTANCE.createAssignedEntity();
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setAssignedEntity(aE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEvent() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				DocumentationOf dOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dOf);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				ServiceEvent sEvent = CDAFactory.eINSTANCE.createServiceEvent();
				target.getDocumentationOfs().get(0).setServiceEvent(sEvent);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTemplateId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				RecordTarget rTarget = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pRole = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication lComm = CDAFactory.eINSTANCE.createLanguageCommunication();
				patient.getLanguageCommunications().add(lComm);
				pRole.setPatient(patient);
				rTarget.setPatientRole(pRole);
				target.getRecordTargets().add(rTarget);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CS csType = DatatypesFactory.eINSTANCE.createCS();
				// There is no need to set an actual code value for this test
				target.getRecordTargets().get(0).getPatientRole().getPatient().getLanguageCommunications().get(0).setLanguageCode(
					csType);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				target.getRecordTargets().get(0).getPatientRole().getPatient().setEthnicGroupCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				target.getRecordTargets().get(0).getPatientRole().getPatient().setEthnicGroupCode(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				target.getRecordTargets().get(0).getPatientRole().getPatient().setRaceCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				target.getRecordTargets().get(0).getPatientRole().getPatient().setRaceCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();

						RecordTarget recTarget = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole patRole = CDAFactory.eINSTANCE.createPatientRole();
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						LanguageCommunication lComm = CDAFactory.eINSTANCE.createLanguageCommunication();

						target.getRecordTargets().add(recTarget);
						recTarget.setPatientRole(patRole);
						patRole.setPatient(pat);
						pat.getLanguageCommunications().add(lComm);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// This test ensures multiple languageCommunication elements are allowed
						target.init();

						RecordTarget recTarget = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole patRole = CDAFactory.eINSTANCE.createPatientRole();
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						LanguageCommunication lComm = CDAFactory.eINSTANCE.createLanguageCommunication();
						LanguageCommunication lComm2 = CDAFactory.eINSTANCE.createLanguageCommunication();

						target.getRecordTargets().add(recTarget);
						recTarget.setPatientRole(patRole);
						patRole.setPatient(pat);
						pat.getLanguageCommunications().add(lComm);
						pat.getLanguageCommunications().add(lComm2);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				target.getRecordTargets().get(0).getPatientRole().setPatient(patient);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRole() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRole(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends GeneralHeaderConstraintsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints> {

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
	private static class ConstructorTestClass extends GeneralHeaderConstraintsOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
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
