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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNoteOperations;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHasReasonForReferralOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Has Reason For Referral Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReasonForReferralSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter2 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateConsultationNoteInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConsultationNoteTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
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
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
					public void updateToFail(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
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
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote target) {
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
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteHasReasonForReferralOrReasonForVisit() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteHasReasonForReferralOrReasonForVisitTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteHasReasonForReferralOrReasonForVisit",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_HAS_REASON_FOR_REFERRAL_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteHasReasonForReferralOrReasonForVisit(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteHasReasonForReferralOrReasonForVisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteTemplateId() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteTemplateIdTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteTemplateId(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<ConsultationNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<ConsultationNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteInFulfillmentOf() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteInFulfillmentOfTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteInFulfillmentOf",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOf(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOf() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(component);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOf(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteAssessmentSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteAssessmentSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteAssessmentSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteAssessmentAndPlanSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteAssessmentAndPlanSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteAssessmentAndPlanSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* AssessmentAndPlanSection */
				AssessmentAndPlanSection section =

				ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteAssessmentAndPlanSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteAssessmentAndPlanSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNotePlanOfCareSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNotePlanOfCareSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNotePlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNotePlanOfCareSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNotePlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteHistoryOfPresentIllness() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteHistoryOfPresentIllnessTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteHistoryOfPresentIllness",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(ConsultationNote target) {

				target.addSection(ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteHistoryOfPresentIllness(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteHistoryOfPresentIllnessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNotePhysicalExamSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNotePhysicalExamSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNotePhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* PhysicalExamSection */
				PhysicalExamSection section =

				ConsolFactory.eINSTANCE.createPhysicalExamSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNotePhysicalExamSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNotePhysicalExamSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteReasonForReferralSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteReasonForReferralSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteReasonForReferralSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ReasonForReferralSection */
				ReasonForReferralSection section =

				ConsolFactory.eINSTANCE.createReasonForReferralSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteReasonForReferralSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteReasonForReferralSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteReasonForVisitSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteReasonForVisitSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteReasonForVisitSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteAllergiesSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteAllergiesSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteAllergiesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteAllergiesSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteAllergiesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteChiefComplaintSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteChiefComplaintSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteChiefComplaintSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteChiefComplaintAndReasonForVisitSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteFamilyHistorySection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteFamilyHistorySectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteFamilyHistorySection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteGeneralStatusSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteGeneralStatusSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteGeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

				ConsolFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteGeneralStatusSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteGeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteHistoryOfPastIllnessSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* HistoryOfPastIllnessSection */
				HistoryOfPastIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteHistoryOfPastIllnessSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteHistoryOfPastIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteImmunizationsSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteImmunizationsSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				ConsolFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteImmunizationsSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteMedicationsSectionEntriesOptional() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* MedicationsSectionEntriesOptional */
				MedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteMedicationsSectionEntriesOptional(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteProblemSectionEntriesOptional() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteProblemSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteProblemSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ProblemSectionEntriesOptional */
				ProblemSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteProblemSectionEntriesOptional(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteProblemSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteProceduresSectionEntriesOptional() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ProceduresSectionEntriesOptional */
				ProceduresSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteProceduresSectionEntriesOptional(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteProceduresSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteResultsSectionEntriesOptional() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteResultsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteResultsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ResultsSectionEntriesOptional */
				ResultsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteResultsSectionEntriesOptional(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteResultsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteReviewOfSystemsSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteReviewOfSystemsSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteReviewOfSystemsSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteSocialHistorySection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteSocialHistorySectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteSocialHistorySection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNoteVitalSignsSectionEntriesOptional() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteVitalSignsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* VitalSignsSectionEntriesOptional */
				VitalSignsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteVitalSignsSectionEntriesOptional(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteVitalSignsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteInFulfillmentOfOrderId() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteInFulfillmentOfOrderIdTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteInFulfillmentOfOrderId",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				ifo.setOrder(CDAFactory.eINSTANCE.createOrder());
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getInFulfillmentOfs().clear();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				ifo.setOrder(CDAFactory.eINSTANCE.createOrder());
				ifo.getOrder().getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.getInFulfillmentOfs().add(ifo);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrderId(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteInFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteInFulfillmentOfOrder() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteInFulfillmentOfOrderTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteInFulfillmentOfOrder",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getInFulfillmentOfs().clear();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				ifo.setOrder(CDAFactory.eINSTANCE.createOrder());
				target.getInFulfillmentOfs().add(ifo);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrder(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteInFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ep.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());

				ee.getEncounterParticipants().add(ep);
				component.setEncompassingEncounter(ee);

				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ep.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				ep.getAssignedEntity().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				ee.getEncounterParticipants().add(ep);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.getEncounterParticipants().add(ep);
				component.setEncompassingEncounter(ee);

				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				ep.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDayTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_DAY);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinuteTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecondTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE);
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_SECOND);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(
					PRECISE_TO_MS_WITH_TIMEZONE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				rp.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());

				ee.setResponsibleParty(rp);

				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().getRepresentedOrganizations().add(
					CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				ee.setResponsibleParty(rp);
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTimeTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2Id() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2IdTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2Id",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2Id(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote target) {

				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				target.getComponentOf().getEncompassingEncounter().setResponsibleParty(rp);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

			}

			@Override
			protected void updateToPass(ConsultationNote target) {

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateConsultationNoteComponentOfEncompassingEncounter() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(component);

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				target.getComponentOf().setEncompassingEncounter(ee);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ConsultationNote target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection() {

		ConsultationNote target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ConsultationNote target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllness() {

		ConsultationNote target = objectFactory.create();
		target.getHistoryOfPresentIllness();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection() {

		ConsultationNote target = objectFactory.create();
		target.getPhysicalExamSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForReferralSection() {

		ConsultationNote target = objectFactory.create();
		target.getReasonForReferralSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		ConsultationNote target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSection() {

		ConsultationNote target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ConsultationNote target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		ConsultationNote target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ConsultationNote target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		ConsultationNote target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		ConsultationNote target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		ConsultationNote target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional() {

		ConsultationNote target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSectionEntriesOptional() {

		ConsultationNote target = objectFactory.create();
		target.getProblemSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional() {

		ConsultationNote target = objectFactory.create();
		target.getProceduresSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSectionEntriesOptional() {

		ConsultationNote target = objectFactory.create();
		target.getResultsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ConsultationNote target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		ConsultationNote target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {

		ConsultationNote target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ConsultationNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ConsultationNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				target.setCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConsultationNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConsultationNote> {
		public ConsultationNote create() {
			return ConsolFactory.eINSTANCE.createConsultationNote();
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
	private static class ConstructorTestClass extends ConsultationNoteOperations {
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

} // ConsultationNoteOperations
