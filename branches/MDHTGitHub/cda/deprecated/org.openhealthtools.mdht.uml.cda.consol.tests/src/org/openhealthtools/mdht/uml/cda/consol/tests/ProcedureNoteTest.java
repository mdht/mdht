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
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.HealthCareFacility;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_EncounterParticipant;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteSectionTitles(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Section Titles</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComplicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePostprocedureDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureIndicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAnesthesiaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePlannedProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1 Primary Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDocumentationOfServiceEvent1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Documentation Of Service Event1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getComplicationsSection() <em>Get Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPostprocedureDiagnosisSection() <em>Get Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureIndicationsSection() <em>Get Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAnesthesiaSection() <em>Get Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicalHistorySection() <em>Get Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPlannedProcedureSection() <em>Get Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureFindingsSection() <em>Get Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureNoteTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
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
					public void updateToPass(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
					public void updateToFail(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
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
					public void updateToPass(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote target) {
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
					public void updateToPass(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteSectionTitles() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteSectionTitlesTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteSectionTitles",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_SECTION_TITLES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSection());
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				for (Section s : target.getAllSections()) {
					s.setTitle(DatatypesFactory.eINSTANCE.createST("title"));
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteSectionTitles(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteSectionTitlesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteTemplateId() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteTemplateIdTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteTemplateId(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<ProcedureNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<ProcedureNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOf() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOf(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAssessmentSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAssessmentSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAssessmentSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePlanOfCareSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePlanOfCareSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePlanOfCareSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAssessmentAndPlanSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAssessmentAndPlanSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAssessmentAndPlanSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AssessmentAndPlanSection */
				AssessmentAndPlanSection section =

				ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAssessmentAndPlanSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAssessmentAndPlanSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComplicationsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComplicationsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComplicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ComplicationsSection */
				ComplicationsSection section =

				ConsolFactory.eINSTANCE.createComplicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComplicationsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComplicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePostprocedureDiagnosisSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePostprocedureDiagnosisSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePostprocedureDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PostprocedureDiagnosisSection */
				PostprocedureDiagnosisSection section =

				ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePostprocedureDiagnosisSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePostprocedureDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureDescriptionSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureDescriptionSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureDescriptionSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureDescriptionSection */
				ProcedureDescriptionSection section =

				ConsolFactory.eINSTANCE.createProcedureDescriptionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureDescriptionSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureDescriptionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureIndicationsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureIndicationsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureIndicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureIndicationsSection */
				ProcedureIndicationsSection section =

				ConsolFactory.eINSTANCE.createProcedureIndicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureIndicationsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureIndicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAllergiesSectionEntriesOptional() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAllergiesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAllergiesSectionEntriesOptional(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAllergiesSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAnesthesiaSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAnesthesiaSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAnesthesiaSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AnesthesiaSection */
				AnesthesiaSection section =

				ConsolFactory.eINSTANCE.createAnesthesiaSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAnesthesiaSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAnesthesiaSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteChiefComplaintSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteChiefComplaintSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteChiefComplaintSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteChiefComplaintAndReasonForVisitSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteFamilyHistorySection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteFamilyHistorySectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteFamilyHistorySection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteHistoryOfPastIllnessSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* HistoryOfPastIllnessSection */
				HistoryOfPastIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteHistoryOfPastIllnessSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteHistoryOfPastIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteHistoryOfPresentIllnessSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteHistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteHistoryOfPresentIllnessSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteHistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteMedicalHistorySection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteMedicalHistorySectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteMedicalHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* MedicalHistorySection */
				MedicalHistorySection section =

				ConsolFactory.eINSTANCE.createMedicalHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteMedicalHistorySection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteMedicalHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteMedicationsSectionEntriesOptional() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* MedicationsSectionEntriesOptional */
				MedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteMedicationsSectionEntriesOptional(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteMedicationsAdministeredSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteMedicationsAdministeredSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteMedicationsAdministeredSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* MedicationsAdministeredSection */
				MedicationsAdministeredSection section =

				ConsolFactory.eINSTANCE.createMedicationsAdministeredSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteMedicationsAdministeredSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteMedicationsAdministeredSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePhysicalExamSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePhysicalExamSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PhysicalExamSection */
				PhysicalExamSection section =

				ConsolFactory.eINSTANCE.createPhysicalExamSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePhysicalExamSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePhysicalExamSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePlannedProcedureSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePlannedProcedureSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePlannedProcedureSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PlannedProcedureSection */
				PlannedProcedureSection section =

				ConsolFactory.eINSTANCE.createPlannedProcedureSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePlannedProcedureSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePlannedProcedureSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureDispositionSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureDispositionSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureDispositionSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureDispositionSection */
				ProcedureDispositionSection section =

				ConsolFactory.eINSTANCE.createProcedureDispositionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureDispositionSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureDispositionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureEstimatedBloodLossSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureEstimatedBloodLossSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureEstimatedBloodLossSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureEstimatedBloodLossSection */
				ProcedureEstimatedBloodLossSection section =

				ConsolFactory.eINSTANCE.createProcedureEstimatedBloodLossSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureEstimatedBloodLossSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureEstimatedBloodLossSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureFindingsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureFindingsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureFindingsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureFindingsSection */
				ProcedureFindingsSection section =

				ConsolFactory.eINSTANCE.createProcedureFindingsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureFindingsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureFindingsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureImplantsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureImplantsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureImplantsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureImplantsSection */
				ProcedureImplantsSection section =

				ConsolFactory.eINSTANCE.createProcedureImplantsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureImplantsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureImplantsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureSpecimensTakenSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureSpecimensTakenSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureSpecimensTakenSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureSpecimensTakenSection */
				ProcedureSpecimensTakenSection section =

				ConsolFactory.eINSTANCE.createProcedureSpecimensTakenSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureSpecimensTakenSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureSpecimensTakenSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProceduresSectionEntriesOptional() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProceduresSectionEntriesOptional */
				ProceduresSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProceduresSectionEntriesOptional(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProceduresSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteReasonForVisitSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteReasonForVisitSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteReviewOfSystemsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteReviewOfSystemsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteReviewOfSystemsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteSocialHistorySection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteSocialHistorySectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteSocialHistorySection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteParticipant1() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteParticipant1TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteParticipant1",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteParticipant1(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteParticipant1TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOf() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOf(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityIdTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());
				HealthCareFacility hcf = CDAFactory.eINSTANCE.createHealthCareFacility();
				target.getComponentOf().getEncompassingEncounter().getLocation().setHealthCareFacility(hcf);

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getComponentOf().getEncompassingEncounter().getLocation().getHealthCareFacility().getIds().add(
					DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.setLocation(CDAFactory.eINSTANCE.createLocation());

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				HealthCareFacility hcf = CDAFactory.eINSTANCE.createHealthCareFacility();
				target.getComponentOf().getEncompassingEncounter().getLocation().setHealthCareFacility(hcf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				ep.setTypeCode(x_EncounterParticipant.REF);
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5Code() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5CodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5Code",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getComponentOf().getEncompassingEncounter().setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Code(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5Location() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5LocationTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5Location",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Location(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				ee.getEncounterParticipants().add(ep);
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				ee.getEncounterParticipants().add(ep);
				ep.setTypeCode(x_EncounterParticipant.REF);
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteComponentOfEncompassingEncounter5() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfEncompassingEncounter5TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOfEncompassingEncounter5",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				target.getComponentOf().setEncompassingEncounter(ee);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfEncompassingEncounter5TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodePTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();

				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodesTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "NOT2.16.840.1.113883.6.104"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

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
					public void updateToPass(ProcedureNote target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.104"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureNote target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.12"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureNote target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.96"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLowTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();

				low.setValue("12345");
				ts.setLow(low);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();

				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDayTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_DAY);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinuteTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
				low.setValue("2009121217");
				ts.setLow(low);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecondTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
				high.setValue(PRECISE_TO_MINUTE);
				ts.setHigh(high);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_SECOND);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MS_WITH_TIMEZONE);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_SECOND_WITH_TIMEZONE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1Code() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1CodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1Code",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				se.setCode(ce);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1Code(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1EffectiveTime() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureNoteDocumentationOfServiceEvent1() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteDocumentationOfServiceEvent1TestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteDocumentationOfServiceEvent1",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();

				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteDocumentationOfServiceEvent1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ProcedureNote target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ProcedureNote target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection() {

		ProcedureNote target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplicationsSection() {

		ProcedureNote target = objectFactory.create();
		target.getComplicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPostprocedureDiagnosisSection() {

		ProcedureNote target = objectFactory.create();
		target.getPostprocedureDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDescriptionSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureDescriptionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureIndicationsSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureIndicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		ProcedureNote target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAnesthesiaSection() {

		ProcedureNote target = objectFactory.create();
		target.getAnesthesiaSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ProcedureNote target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		ProcedureNote target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ProcedureNote target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		ProcedureNote target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		ProcedureNote target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalHistorySection() {

		ProcedureNote target = objectFactory.create();
		target.getMedicalHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional() {

		ProcedureNote target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsAdministeredSection() {

		ProcedureNote target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection() {

		ProcedureNote target = objectFactory.create();
		target.getPhysicalExamSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedureSection() {

		ProcedureNote target = objectFactory.create();
		target.getPlannedProcedureSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDispositionSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureDispositionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEstimatedBloodLossSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureEstimatedBloodLossSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureFindingsSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureFindingsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureImplantsSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureImplantsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureSpecimensTakenSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureSpecimensTakenSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional() {

		ProcedureNote target = objectFactory.create();
		target.getProceduresSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		ProcedureNote target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ProcedureNote target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		ProcedureNote target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ProcedureNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();
				target.getCode().setCode("code");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureNote> {
		public ProcedureNote create() {
			return ConsolFactory.eINSTANCE.createProcedureNote();
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
	private static class ConstructorTestClass extends ProcedureNoteOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
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

} // ProcedureNoteOperations
