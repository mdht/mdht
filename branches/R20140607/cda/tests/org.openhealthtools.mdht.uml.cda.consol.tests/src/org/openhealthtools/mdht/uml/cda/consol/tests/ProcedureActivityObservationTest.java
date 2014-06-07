/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - modified testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Procedure Observation Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Procedure Observation Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Observation Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Entry Relationship Procedure Observation Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCodeCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ProcedureActivityObservation target) {
						// empty
					}

				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ProcedureActivityObservation target) {
						// invalid codeSystem
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("234324.234324.24323423.234");
						target.setCode(code);
					}

				});
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						// LOINC
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("2.16.840.1.113883.6.1");
						target.setCode(code);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						// SNOMED CT
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("2.16.840.1.113883.6.96");
						target.setCode(code);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						// CPT-4
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("2.16.840.1.113883.6.12");
						target.setCode(code);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						// ICD10 PCS
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("2.16.840.1.113883.6.4");
						target.setCode(code);
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeCodeSystems(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationCodeOriginalText() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeOriginalTextTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();

				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {

				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeOriginalText(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationOriginalTextReference() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationOriginalTextReferenceTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();

				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ref.setValue("test");
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationOriginalTextReference(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationOriginalTextReferenceValue() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationOriginalTextReferenceValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ref.setValue("test");
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationOriginalTextReferenceValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationReferenceValue() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationReferenceValueTestCase = new NarrativeReferenceTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular procedure observed.");

				// add a reference to the section text
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular procedure observed.");

				// add a reference to the section text
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationReferenceValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationEncounterInversion() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEncounterInversionTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEncounterInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEncounterInversion(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEncounterInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				par.setTypeCode(ParticipationType.LOC);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocationTypeCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationInstructionsInversion() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationInstructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructionsInversion(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTemplateId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTemplateIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTemplateId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationClassCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationClassCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationClassCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationMoodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMoodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {

				target.setMoodCode(x_ActMoodDocumentObservation.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMoodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationStatusCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationStatusCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				cs.setCodeSystem("2.16.840.1.113883.5.14");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationStatusCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationValue() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEffectiveTime() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEffectiveTime(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationPriorityCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPriorityCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE("A", "2.16.840.1.113883.5.7");
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPriorityCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationPriorityCodeP() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPriorityCodePTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPriorityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE("aaa", "bbb");
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPriorityCodeP(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPriorityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationMethodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMethodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMethodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationTargetSiteCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getTargetSiteCodes().clear();
				CD tsc = DatatypesFactory.eINSTANCE.createCD();
				tsc.setCodeSystem("2.16.840.1.113883.6.96");
				tsc.setCode("test");
				target.getTargetSiteCodes().add(tsc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTargetSiteCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTargetSiteCodeP() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTargetSiteCodePTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTargetSiteCodeP(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationPerformer() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPerformerTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPerformer(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationServiceDeliveryLocation() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationServiceDeliveryLocationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationServiceDeliveryLocation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocation(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationInstructions() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationInstructionsTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructions(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationIndication() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationIndicationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationIndication(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationMedicationActivity() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
						er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
						target.getEntryRelationships().add(er);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityObservation target) {
						// test more than 1 entryRelationship
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
						er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
						target.getEntryRelationships().add(er);
						EntryRelationship er2 = CDAFactory.eINSTANCE.createEntryRelationship();
						er2.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
						er2.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
						target.getEntryRelationships().add(er2);
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMedicationActivity(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationship() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationship(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getIds().add(DatatypesFactory.eINSTANCE.createII());
				ae.getRepresentedOrganizations().add(org);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationNameTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getNames().add(DatatypesFactory.eINSTANCE.createON());
				ae.getRepresentedOrganizations().add(org);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationName(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecomTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				ae.getRepresentedOrganizations().add(org);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecom(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddrTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_PROCEDURE_OBSERVATION_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				ae.getRepresentedOrganizations().add(org);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddr(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityProcedureObservationRepresentedOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddr(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecom(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_PROCEDURE_OBSERVATION_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganization(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerProcedureObservationAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureObservationPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureObservationPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_OBSERVATION_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureObservationPerformerAssignedEntity(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureObservationPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Encounter enc = CDAFactory.eINSTANCE.createEncounter();
				enc.setClassCode(ActClass.ENC);
				er.setEncounter(enc);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Encounter enc = CDAFactory.eINSTANCE.createEncounter();
				enc.setMoodCode(x_DocumentEncounterMood.EVN);
				er.setEncounter(enc);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				Encounter enc = CDAFactory.eINSTANCE.createEncounter();
				enc.getIds().add(DatatypesFactory.eINSTANCE.createII());
				er.setEncounter(enc);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipInversionInd() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipInversionIndTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setInversionInd(true);
				Encounter enc = CDAFactory.eINSTANCE.createEncounter();
				enc.setMoodCode(x_DocumentEncounterMood.EVN);
				er.setEncounter(enc);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipInversionInd(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipTypeCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipTypeCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipTypeCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENTRY_RELATIONSHIP_PROCEDURE_OBSERVATION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounter(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEntryRelationshipProcedureObservationEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetServiceDeliveryLocations() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getServiceDeliveryLocations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityObservation> {
		public ProcedureActivityObservation create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityObservation();
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
	private static class ConstructorTestClass extends ProcedureActivityObservationOperations {
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

} // ProcedureActivityObservationOperations
