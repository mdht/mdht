/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Rep Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Rep Org Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Rep Org Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Rep Org Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Act Performer Assigned Entity Rep Org Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEntryRelationshipProcedureActEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Entry Relationship Procedure Act Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityActTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCodeCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCodeCodeSystems(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActCodeOriginalText() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeOriginalTextTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();

				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {

				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCodeOriginalText(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActOriginalTextReference() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActOriginalTextReferenceTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActOriginalTextReference(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActOriginalTextReferenceValue() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActOriginalTextReferenceValueTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActOriginalTextReferenceValue(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActReferenceValue() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActReferenceValueTestCase = new NarrativeReferenceTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular procedure enacted.");

				// add a reference to the section text
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular procedure enacted.");

				// add a reference to the section text
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActReferenceValue(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActEncounterInversion() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEncounterInversionTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEncounterInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityAct target) {
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
			protected void updateToPass(ProcedureActivityAct target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEncounterInversion(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEncounterInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				par.setTypeCode(ParticipationType.LOC);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocationTypeCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActInstructionsInversion() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActInstructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityAct target) {
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
			protected void updateToPass(ProcedureActivityAct target) {

				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActInstructionsInversion(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActTemplateId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActTemplateIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActTemplateId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActClassCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActClassCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActClassCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActMoodCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActMoodCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.setMoodCode(x_DocumentActMood.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActMoodCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActStatusCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActStatusCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				cs.setCodeSystem("2.16.840.1.113883.5.14");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActStatusCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEffectiveTime() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEffectiveTime(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActPriorityCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPriorityCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE("A", "2.16.840.1.113883.5.7");
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPriorityCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActPriorityCodeP() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPriorityCodePTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPriorityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE("aaa", "bbb");
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPriorityCodeP(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPriorityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActPerformer() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPerformerTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPerformer(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActServiceDeliveryLocation() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActServiceDeliveryLocationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActServiceDeliveryLocation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocation(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActInstructions() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActInstructionsTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActInstructions(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActIndication() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIndicationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActIndication(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActMedicationActivity() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityAct target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
						er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
						target.getEntryRelationships().add(er);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActMedicationActivity(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationship() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationship(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntity(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityAddr(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityTelecom(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityRepOrg() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrg",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrg(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgName() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgNameTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgName",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgName(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddr() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddrTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddr(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecom() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecomTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ACT_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecom(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureActPerformerAssignedEntityRepOrgTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounterId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounterId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipInversionInd() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipInversionIndTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
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

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipInversionInd(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipTypeCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipTypeCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipTypeCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityActEntryRelationshipProcedureActEncounter() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEntryRelationshipProcedureActEncounterTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEntryRelationshipProcedureActEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE_ACT_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEntryRelationshipProcedureActEncounter(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEntryRelationshipProcedureActEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetServiceDeliveryLocations() {

		ProcedureActivityAct target = objectFactory.create();
		target.getServiceDeliveryLocations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		ProcedureActivityAct target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureActivityAct target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		ProcedureActivityAct target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityAct> {
		public ProcedureActivityAct create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityAct();
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
	private static class ConstructorTestClass extends ProcedureActivityActOperations {
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

} // ProcedureActivityActOperations
