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
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter4 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryAndPhysicalNoteTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteTemplateId() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteTemplateIdTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteTemplateId(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<HistoryAndPhysicalNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteInFulfillmentOf() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteInFulfillmentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteInFulfillmentOf",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getInFulfillmentOfs().add(CDAFactory.eINSTANCE.createInFulfillmentOf());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteInFulfillmentOf(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOf() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOf(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteAssessmentSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteAssessmentSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteAssessmentSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNotePlanOfCareSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNotePlanOfCareSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNotePlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNotePlanOfCareSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNotePlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteAssessmentAndPlanSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteAssessmentAndPlanSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteAssessmentAndPlanSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* AssessmentAndPlanSection */
				AssessmentAndPlanSection section =

				ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteAssessmentAndPlanSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteAssessmentAndPlanSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteChiefComplaintSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteChiefComplaintSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteChiefComplaintSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteFamilyHistorySection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteFamilyHistorySectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteFamilyHistorySection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteGeneralStatusSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteGeneralStatusSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteGeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

				ConsolFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteGeneralStatusSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteGeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteHistoryOfPastIllnessSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* HistoryOfPastIllnessSection */
				HistoryOfPastIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteHistoryOfPastIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* MedicationsSectionEntriesOptional */
				MedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNotePhysicalExamSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNotePhysicalExamSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNotePhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* PhysicalExamSection */
				PhysicalExamSection section =

				ConsolFactory.eINSTANCE.createPhysicalExamSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNotePhysicalExamSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNotePhysicalExamSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteReasonForVisitSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteReasonForVisitSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteReasonForVisitSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteResultsSectionEntriesOptional() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteResultsSectionEntriesOptionalTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteResultsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ResultsSectionEntriesOptional */
				ResultsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteResultsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteReviewOfSystemsSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteReviewOfSystemsSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteReviewOfSystemsSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteSocialHistorySection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteSocialHistorySectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteSocialHistorySection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptionalTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ImmunizationsSectionEntriesOptional */
				ImmunizationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteProblemSectionEntriesOptional() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteProblemSectionEntriesOptionalTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteProblemSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ProblemSectionEntriesOptional */
				ProblemSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteProblemSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteProceduresSectionEntriesOptional() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* ProceduresSectionEntriesOptional */
				ProceduresSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteProceduresSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* VitalSignsSectionEntriesOptional */
				VitalSignsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteInstructionsSection() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteInstructionsSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();

				/* InstructionsSection */
				InstructionsSection section = ConsolFactory.eINSTANCE.createInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteInstructionsSection(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteInstructionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				rp.setAssignedEntity(ae);
				ee.setResponsibleParty(rp);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {

				Person person = CDAFactory.eINSTANCE.createPerson();

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().setAssignedPerson(
					person);
				;

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				ee.setResponsibleParty(rp);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);
				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				Person person = CDAFactory.eINSTANCE.createPerson();

				ae.setAssignedPerson(person);

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDayTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_DAY);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDay(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinuteTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinute(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecondTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE);
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_SECOND);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecond(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(
					PRECISE_TO_MINUTE_WITH_TIMEZONE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffset(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTimeTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IdTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);

				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4LocationTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);

				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				target.getComponentOf().getEncompassingEncounter().setResponsibleParty(rp);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalNoteComponentOfEncompassingEncounter() {
		OperationsTestCase<HistoryAndPhysicalNote> validateHistoryAndPhysicalNoteComponentOfEncompassingEncounterTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				target.getComponentOf().setEncompassingEncounter(ee);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNoteComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getPhysicalExamSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSectionEntriesOptional() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getResultsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSectionEntriesOptional() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSectionEntriesOptional() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getProblemSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getProceduresSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructionsSection() {

		HistoryAndPhysicalNote target = objectFactory.create();
		target.getInstructionsSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<HistoryAndPhysicalNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<HistoryAndPhysicalNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("12345", "2.16.840.1.113883.6.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(HistoryAndPhysicalNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryAndPhysicalNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryAndPhysicalNote> {
		public HistoryAndPhysicalNote create() {
			return ConsolFactory.eINSTANCE.createHistoryAndPhysicalNote();
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
	private static class ConstructorTestClass extends HistoryAndPhysicalNoteOperations {
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

} // HistoryAndPhysicalNoteOperations
