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
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureOperations;
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
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProductInstanceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Product Instance Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedurePriorityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Priority Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedurePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedurePatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureSpecimenSpecimenRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Specimen Specimen Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureSpecimenSpecimentRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Specimen Speciment Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Procedure Activity Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Procedure Activity Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Procedure Activity Represented Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Procedure Activity Represented Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Procedure Activity Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Entry Relationship Procedure Activity Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Entry Relationship Procedure Activity Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Entry Relationship Procedure Activity Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEntryRelationshipInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Entry Relationship Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Entry Relationship Procedure Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getPatientInstruction() <em>Get Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getProductInstances() <em>Get Product Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureCodeCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ProcedureActivityProcedure target) {
						// empty
					}

				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ProcedureActivityProcedure target) {
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
					public void updateToPass(ProcedureActivityProcedure target) {
						// LOINC
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("2.16.840.1.113883.6.1");
						target.setCode(code);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityProcedure target) {
						// SNOMED CT
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("2.16.840.1.113883.6.96");
						target.setCode(code);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityProcedure target) {
						// CPT-4
						target.init();
						CD code = DatatypesFactory.eINSTANCE.createCD();
						code.setCodeSystem("2.16.840.1.113883.6.12");
						target.setCode(code);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityProcedure target) {
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureCodeCodeSystems(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureCodeOriginalText() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureCodeOriginalTextTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();

				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {

				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureCodeOriginalText(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureOriginalTextReference() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureOriginalTextReferenceTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {

				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureOriginalTextReference(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureOriginalTextReferenceValue() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureOriginalTextReferenceValueTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {

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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureOriginalTextReferenceValue(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureReferenceValue() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureReferenceValueTestCase = new NarrativeReferenceTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular procedure to document.");

				// add a reference to the section text
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular procedure to document.");

				// add a reference to the section text
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureReferenceValue(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureEncounterInversion() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEncounterInversionTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEncounterInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityProcedure target) {
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
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEncounterInversion(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEncounterInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProductInstanceTypeCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProductInstanceTypeCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProductInstanceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PRODUCT_INSTANCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
				par.setTypeCode(ParticipationType.DEV);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProductInstanceTypeCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProductInstanceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				par.setTypeCode(ParticipationType.LOC);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureServiceDeliveryLocationTypeCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureInstructionsInversion() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureInstructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityProcedure target) {
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
			protected void updateToPass(ProcedureActivityProcedure target) {

				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureInstructionsInversion(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTemplateId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureClassCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureClassCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureClassCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureMoodCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureMoodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {

				target.setMoodCode(x_DocumentProcedureMood.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMoodCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureStatusCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureStatusCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				cs.setCodeSystem("2.16.840.1.113883.5.14");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureStatusCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureEffectiveTime() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEffectiveTime(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedurePriorityCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedurePriorityCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedurePriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE();
				pc.setCode("A");
				pc.setCodeSystem("2.16.840.1.113883.5.7");
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePriorityCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedurePriorityCodeP() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedurePriorityCodePTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedurePriorityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE();
				pc.setCodeSystem("2.16.840.1.113883.1.11.16866");
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePriorityCodeP(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePriorityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureMethodCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureMethodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMethodCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureTargetSiteCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getTargetSiteCodes().clear();
				CD tsc = DatatypesFactory.eINSTANCE.createCD();
				tsc.setCodeSystem("2.16.840.1.113883.6.96");
				tsc.setCode("test");
				target.getTargetSiteCodes().add(tsc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTargetSiteCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTargetSiteCodeP() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTargetSiteCodePTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTargetSiteCodeP(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureIndication() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureIndicationTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureIndication(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureSpecimen() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureSpecimenTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureSpecimen",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureSpecimen(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureSpecimenTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureServiceDeliveryLocation() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureServiceDeliveryLocationTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureServiceDeliveryLocation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureServiceDeliveryLocation(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedurePerformer() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedurePerformerTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedurePerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePerformer(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePerformerTestCase.doValidationTest();
	}

	/**
	* 
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureMedicationActivity() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityProcedure target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
						er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
						target.getEntryRelationships().add(er);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureActivityProcedure target) {
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMedicationActivity(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedurePatientInstruction() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedurePatientInstructionTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedurePatientInstruction",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePatientInstruction(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePatientInstructionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProductInstance() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProductInstanceTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createProductInstance().init());
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProductInstance(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureEntryRelationship() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEntryRelationshipTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEntryRelationship(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureSpecimenSpecimenRole() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureSpecimenSpecimenRoleTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureSpecimenSpecimenRole",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_SPECIMEN_SPECIMEN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				Specimen spec = CDAFactory.eINSTANCE.createSpecimen();
				target.getSpecimens().add(spec);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getSpecimens().clear();
				Specimen spec = CDAFactory.eINSTANCE.createSpecimen();
				SpecimenRole sr = CDAFactory.eINSTANCE.createSpecimenRole();
				sr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				spec.setSpecimenRole(sr);
				target.getSpecimens().add(spec);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureSpecimenSpecimenRole(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureSpecimenSpecimenRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureSpecimenSpecimentRoleId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureSpecimenSpecimentRoleIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureSpecimenSpecimentRoleId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_SPECIMEN_SPECIMENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				Specimen spec = CDAFactory.eINSTANCE.createSpecimen();
				spec.setSpecimenRole(CDAFactory.eINSTANCE.createSpecimenRole());
				target.getSpecimens().add(spec);

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getSpecimens().clear();
				Specimen spec = CDAFactory.eINSTANCE.createSpecimen();
				SpecimenRole sr = CDAFactory.eINSTANCE.createSpecimenRole();
				sr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				spec.setSpecimenRole(sr);
				target.getSpecimens().add(spec);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureSpecimenSpecimentRoleId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureSpecimenSpecimentRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_PROCEDURE_ACTIVITY_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// empty representedOrganization element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// representedOrganization has an id
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationName() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationNameTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_PROCEDURE_ACTIVITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// empty representedOrganization element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// representedOrganization has a name
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationName(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecom() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecomTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_PROCEDURE_ACTIVITY_REPRESENTED_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// empty representedOrganization element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// representedOrganization has telecom
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecom(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddr() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddrTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_PROCEDURE_ACTIVITY_REPRESENTED_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// empty representedOrganization element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// representedOrganization has an addr
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddr(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityProcedureActivityRepresentedOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// empty assignedEntity element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// assignedEntity has an id
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// empty assignedEntity element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// assignedEntity has an addr
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// empty assignedEntity element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// assignedEntity has a telecom
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganization() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				// assignedEntity does not contain a representedOrganization element
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				// assignedEntity does contain a representedOrganization element
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganization(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProcedureActivityPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureEntryRelationshipInversionInd() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEntryRelationshipInversionIndTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEntryRelationshipInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
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

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEntryRelationshipInversionInd(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEntryRelationshipInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureEntryRelationshipTypeCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEntryRelationshipTypeCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEntryRelationshipTypeCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounter() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ENTRY_RELATIONSHIP_PROCEDURE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(CDAFactory.eINSTANCE.createEncounter());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounter(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEntryRelationshipProcedureActivityEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetServiceDeliveryLocations() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getServiceDeliveryLocations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientInstruction() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getPatientInstruction();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProductInstances() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getProductInstances();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityProcedure> {
		public ProcedureActivityProcedure create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityProcedure();
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
	private static class ConstructorTestClass extends ProcedureActivityProcedureOperations {
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

} // ProcedureActivityProcedureOperations
