/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Drajer/Ai) - additional testing code
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
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummaryOperations;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalAdmissionDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDischargeDietSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalConsultationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Consultations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargePhysicalSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeStudiesSummarySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalAdmissionDiagnosisSection() <em>Get Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeDiagnosisSection() <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getDischargeDietSection() <em>Get Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeMedicationsSectionEntriesOptional() <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalConsultationsSection() <em>Get Hospital Consultations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargePhysicalSection() <em>Get Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeStudiesSummarySection() <em>Get Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeSummaryTest extends CDAValidationTest {

	private static final String NUBC_VALUESET = "2.16.840.1.113883.6.301.5";

	private static final String HL7_DDC_CODESYSTEM = "2.16.840.1.113883.12.112";

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary target) {
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
					public void updateToPass(DischargeSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryCodeP() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryCodePTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryCodeP(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryCode() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryCodeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("11490-0", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalAdmissionMedicationsSectionEntriesOptional */
				HospitalAdmissionMedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createHospitalAdmissionMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalAdmissionDiagnosisSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalAdmissionDiagnosisSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalAdmissionDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalAdmissionDiagnosisSection */
				HospitalAdmissionDiagnosisSection section =

				ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalAdmissionDiagnosisSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalAdmissionDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargeDiagnosisSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeDiagnosisSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargeDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeDiagnosisSection */
				HospitalDischargeDiagnosisSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeDiagnosisSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargeDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryDischargeDietSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryDischargeDietSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryDischargeDietSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* DischargeDietSection */
				DischargeDietSection section =

				ConsolFactory.eINSTANCE.createDischargeDietSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryDischargeDietSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryDischargeDietSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeMedicationsSectionEntriesOptional */
				HospitalDischargeMedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryFunctionalStatusSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryFunctionalStatusSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				ConsolFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryFunctionalStatusSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryFunctionalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHistoryOfPresentIllnessSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPresentIllnessSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalCourseSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalCourseSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalCourseSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalCourseSection */
				HospitalCourseSection section =

				ConsolFactory.eINSTANCE.createHospitalCourseSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalCourseSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalCourseSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryPlanOfCareSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryPlanOfCareSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryPlanOfCareSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHistoryOfPastIllnessSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HistoryOfPastIllnessSection */
				HistoryOfPastIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPastIllnessSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHistoryOfPastIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryReviewOfSystemsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryReviewOfSystemsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryReviewOfSystemsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOf() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(DischargeSummary target) {

				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				target.setComponentOf(cof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOf(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryChiefComplaintAndReasonForVisitSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryChiefComplaintSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryChiefComplaintSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryChiefComplaintSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryFamilyHistorySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryFamilyHistorySectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryFamilyHistorySection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalConsultationsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalConsultationsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalConsultationsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalConsultationsSection */
				HospitalConsultationsSection section =

				ConsolFactory.eINSTANCE.createHospitalConsultationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalConsultationsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalConsultationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargeInstructionsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargeInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeInstructionsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargeInstructionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargePhysicalSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargePhysicalSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargePhysicalSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargePhysicalSection */
				HospitalDischargePhysicalSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargePhysicalSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargePhysicalSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargePhysicalSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargeStudiesSummarySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeStudiesSummarySectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargeStudiesSummarySection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeStudiesSummarySection */
				HospitalDischargeStudiesSummarySection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeStudiesSummarySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeStudiesSummarySection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargeStudiesSummarySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryImmunizationsSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryImmunizationsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryImmunizationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ImmunizationsSectionEntriesOptional */
				ImmunizationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryImmunizationsSectionEntriesOptional(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryImmunizationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryProblemSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryProblemSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryProblemSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ProblemSectionEntriesOptional */
				ProblemSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryProblemSectionEntriesOptional(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryProblemSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryProceduresSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ProceduresSectionEntriesOptional */
				ProceduresSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryProceduresSectionEntriesOptional(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryProceduresSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryReasonForVisitSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryReasonForVisitSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryReasonForVisitSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummarySocialHistorySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummarySocialHistorySectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummarySocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummarySocialHistorySection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummarySocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryAllergiesSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryAllergiesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryAllergiesSectionEntriesOptional(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryAllergiesSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryVitalSignsSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryVitalSignsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* VitalSignsSectionEntriesOptional */
				VitalSignsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryVitalSignsSectionEntriesOptional(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryVitalSignsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
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
			protected void updateToPass(DischargeSummary target) {

				Person person = CDAFactory.eINSTANCE.createPerson();

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().setAssignedPerson(
					person);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				ee.setResponsibleParty(rp);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
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
			protected void updateToPass(DischargeSummary target) {
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

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary target) {

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLowTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ee.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				cof.setEncompassingEncounter(ee);

				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setLow(
					DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHighTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ee.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				cof.setEncompassingEncounter(ee);

				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setHigh(
					DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSetTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				// invalid codeSystem attribute OID
				target.init();
				CE ce = DatatypesFactory.eINSTANCE.createCE("irrelevant", BAD_CODESYSTEM_ID);
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.setDischargeDispositionCode(ce);
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary target) {
						// Normal pass for checked codeSystem value (NUBC valueSet)
						// Consol Encompassing Encounter3 SHALL contain exactly one [1..1] dischargeDispositionCode,
						// which SHOULD be selected from ValueSet NUBC UB-04 FL17-Patient Status 2.16.840.1.113883.6.301.5 STATIC or,
						// if access to NUBC is unavailable,
						// MAY be selected from CodeSystem 2.16.840.1.113883.12.112 HL7 Discharge Disposition (CONF:8476)
						target.init();
						CE ce = DatatypesFactory.eINSTANCE.createCE("irrelevant", NUBC_VALUESET);
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						ee.setDischargeDispositionCode(ce);
						Component1 cof = CDAFactory.eINSTANCE.createComponent1();
						cof.setEncompassingEncounter(ee);
						target.setComponentOf(cof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary target) {
						// Pass for ignored constraint so that we don't fail one if the other passes.
						// Implemented based off of the following preliminary rule as part of Errata 240:
						// If it???s not equal to the codeSystem (if it???s the valueSet already or if it is an incorrect OID altogether),
						// then it must be equal to the valueSet. The constraints are separated since they have different severities.
						// In this passing case, it is already equal to the codeSystem, so doesn't check the rest.
						target.init();
						CE ce = DatatypesFactory.eINSTANCE.createCE("irrelevant", HL7_DDC_CODESYSTEM);
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						ee.setDischargeDispositionCode(ce);
						Component1 cof = CDAFactory.eINSTANCE.createComponent1();
						cof.setEncompassingEncounter(ee);
						target.setComponentOf(cof);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystemTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				// invalid codeSystem attribute OID
				target.init();
				CE ce = DatatypesFactory.eINSTANCE.createCE("irrelevant", BAD_CODESYSTEM_ID);
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.setDischargeDispositionCode(ce);
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary target) {
						// Normal pass for checked codeSystem value (HL7 Discharge Disposition codeSystem)
						target.init();
						CE ce = DatatypesFactory.eINSTANCE.createCE("irrelevant", HL7_DDC_CODESYSTEM);
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						ee.setDischargeDispositionCode(ce);
						Component1 cof = CDAFactory.eINSTANCE.createComponent1();
						cof.setEncompassingEncounter(ee);
						target.setComponentOf(cof);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary target) {
						// Pass for ignored constraint so that we don't fail one if the other passes.
						// Implemented like this:
						// If it???s not equal to the valueSet (if it???s the codeSystem already or if it is an incorrect OID altogether),
						// then it must be equal to the codeSystem. The constraints are separated since they have different severities.
						// In this passing case, it is already equal to the valueSet, so doesn't check the rest.
						target.init();
						CE ce = DatatypesFactory.eINSTANCE.createCE("irrelevant", NUBC_VALUESET);
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						ee.setDischargeDispositionCode(ce);
						Component1 cof = CDAFactory.eINSTANCE.createComponent1();
						cof.setEncompassingEncounter(ee);
						target.setComponentOf(cof);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				// The following test fails because there is no dischargeDispositionCode element in encompassingEncounter
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				// Simply requires a dischargeDispositionCode element in encompassingEncounter
				target.getComponentOf().getEncompassingEncounter().setDischargeDispositionCode(
					DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTimeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(DischargeSummary target) {

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				target.getComponentOf().getEncompassingEncounter().setResponsibleParty(rp);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateDischargeSummaryComponentOfEncompassingEncounter() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryComponentOfEncompassingEncounterTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(DischargeSummary target) {

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				target.getComponentOf().setEncompassingEncounter(ee);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalAdmissionMedicationsSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalAdmissionMedicationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalAdmissionDiagnosisSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalAdmissionDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeDiagnosisSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeDietSection() {

		DischargeSummary target = objectFactory.create();
		target.getDischargeDietSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeMedicationsSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeMedicationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection() {

		DischargeSummary target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		DischargeSummary target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalCourseSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalCourseSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		DischargeSummary target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		DischargeSummary target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		DischargeSummary target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		DischargeSummary target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		DischargeSummary target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		DischargeSummary target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalConsultationsSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalConsultationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargePhysicalSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargePhysicalSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeStudiesSummarySection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeStudiesSummarySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getProblemSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getProceduresSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		DischargeSummary target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		DischargeSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeSummary>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<DischargeSummary> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();
				target.getCode().setCode("code");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeSummary> {
		public DischargeSummary create() {
			return ConsolFactory.eINSTANCE.createDischargeSummary();
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
	private static class ConstructorTestClass extends DischargeSummaryOperations {
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

} // DischargeSummaryOperations
