package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SummaryOfCareRecordOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Summary Of Care Record</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Mu2 Encounter Diagnoses Requirements
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Care Planning</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordReasonForHospitalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Reason For Hospitalization</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medications Administered Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Hospital Discharge Medications Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Social History Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Social History Section Smoking
 * Status Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Hospital Admission Medications Section
 * Entries Optional Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Hospital Admission Medications
 * Section Entries Optional Admission Medication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Plan Of Care Section Care
 * Planning For Plan Of Care</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Plan Of Care Section Mu2consol
 * Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Plan Of Care Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Medications Administered Section Template
 * Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Medications Administered Section
 * Medication Activity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Assessment And Plan Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAssessmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Assessment Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Assessment Section Problem
 * Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Hospital Admission Diagnosis Section
 * Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Hospital Admission Diagnosis
 * Section Hospital Admission Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Hospital Discharge Diagnosis Section
 * Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Hospital Discharge Diagnosis
 * Section Hospital Discharge Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Postoperative Diagnosis Section Template
 * Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Postoperative Diagnosis Section
 * Problem Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Postprocedure Diagnosis Section Template
 * Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Postprocedure Diagnosis Section
 * Postprocedure Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Preoperative Diagnosis Section Template
 * Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Preoperative Diagnosis Section
 * Preoperative Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Cognitive Status</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Functional Status</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Record Functional Status Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Cognitive Status Problem Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Cognitive Status Result Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Cognitive Status Result Organizer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Functional Status Problem Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Functional Status Result Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Summary Of Care Recordmu2consol Functional Status Section
 * Functional Status Result Organizer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getEncountersSection()
 * <em>Get Encounters Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPlanOfCareSection()
 * <em>Get Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAssessmentAndPlanSection()
 * <em>Get Assessment And Plan Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getInterventionsSection()
 * <em>Get Interventions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAssessmentSection()
 * <em>Get Assessment Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalAdmissionDiagnosisSection()
 * <em>Get Hospital Admission Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeDiagnosisSection()
 * <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPostoperativeDiagnosisSection()
 * <em>Get Postoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProblemSection()
 * <em>Get Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAllergiesSection()
 * <em>Get Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHistoryOfPastIllnessSection()
 * <em>Get History Of Past Illness Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPreoperativeDiagnosisSection()
 * <em>Get Preoperative Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getImmunizationsSection()
 * <em>Get Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getMedicationsAdministeredSection()
 * <em>Get Medications Administered Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalAdmissionMedicationsSectionEntriesOptional()
 * <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getHospitalDischargeMedicationsSection()
 * <em>Get Hospital Discharge Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getResultsSection()
 * <em>Get Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getVitalSignsSection()
 * <em>Get Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProceduresSection()
 * <em>Get Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getPostprocedureDiagnosisSection()
 * <em>Get Postprocedure Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getFunctionalStatusSection()
 * <em>Get Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class SummaryOfCareRecordTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMu2EncounterDiagnosesRequirements() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMu2EncounterDiagnosesRequirementsTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

				target.init();
				InstructionsSection iSection = Mu2consolFactory.eINSTANCE
						.createInstructionsSection();
				target.addSection(iSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMu2EncounterDiagnosesRequirementsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordCarePlanning() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordCarePlanningTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordCarePlanning",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection pSection = ConsolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordCarePlanning(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordCarePlanningTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordReasonForHospitalization() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordReasonForHospitalizationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordReasonForHospitalization",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_REASON_FOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();
				HospitalAdmissionDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosisSection().init();
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordReasonForHospitalization(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordReasonForHospitalizationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordPlanOfCareSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordPlanOfCareSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordPlanOfCareSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordPlanOfCareSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordProblemSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordProblemSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordProblemSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordProblemSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordAllergiesSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordAllergiesSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordAllergiesSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordAllergiesSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordAllergiesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordImmunizationsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordImmunizationsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordImmunizationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				ConsolFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordImmunizationsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordImmunizationsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationsAdministeredSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationsAdministeredSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationsAdministeredSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* MedicationsAdministeredSection */
				MedicationsAdministeredSection section =

				Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationsAdministeredSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationsAdministeredSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordHospitalDischargeMedicationsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordHospitalDischargeMedicationsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordHospitalDischargeMedicationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* HospitalDischargeMedicationsSection */
				HospitalDischargeMedicationsSection section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordHospitalDischargeMedicationsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordHospitalDischargeMedicationsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordSocialHistorySection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordSocialHistorySectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordSocialHistorySection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordSocialHistorySection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordSocialHistorySectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordResultsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordResultsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordResultsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				ConsolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordResultsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordVitalSignsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordVitalSignsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordVitalSignsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordVitalSignsSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordProceduresSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordProceduresSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordProceduresSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				ConsolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordProceduresSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordFunctionalStatusSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordFunctionalStatusSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordFunctionalStatusSection",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				Mu2consolFactory.eINSTANCE.createFunctionalStatusSection()
						.init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordFunctionalStatusSection(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordFunctionalStatusSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordSocialHistorySectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordSocialHistorySectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				SocialHistorySection section = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				for (II ii : section.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(section);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();
				SocialHistorySection section = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				II iiTemp = section.getTemplateIds().get(0);

				SocialHistorySection s = target.getSocialHistorySection();
				for (II ii : s.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordSocialHistorySectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordSocialHistorySectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				SocialHistorySection section = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				target.addSection(section);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();
				SocialHistorySection section = target.getSocialHistorySection();
				SmokingStatusObservation ssObs = ConsolFactory.eINSTANCE
						.createSmokingStatusObservation().init();
				section.addObservation(ssObs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolSocialHistorySectionSmokingStatusObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				HospitalAdmissionMedicationsSectionEntriesOptional section = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionMedicationsSectionEntriesOptional()
						.init();
				for (II ii : section.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(section);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();
				HospitalAdmissionMedicationsSectionEntriesOptional section = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionMedicationsSectionEntriesOptional()
						.init();
				II iiTemp = section.getTemplateIds().get(0);
				HospitalAdmissionMedicationsSectionEntriesOptional aSection = target
						.getHospitalAdmissionMedicationsSectionEntriesOptional();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				HospitalAdmissionMedicationsSectionEntriesOptional aSection = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionMedicationsSectionEntriesOptional();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				// target.init();
				AdmissionMedication aMed = ConsolFactory.eINSTANCE
						.createAdmissionMedication().init();
				target.getHospitalAdmissionMedicationsSectionEntriesOptional()
						.addAct(aMed);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				// target.init();
				PlanOfCareActivityAct act = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityAct().init();
				PlanOfCareSection pSection = target.getPlanOfCareSection();
				pSection.addAct(act);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordPlanOfCareSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordPlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordPlanOfCareSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);
				for (II ii : pSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				II iiTemp = pSection.getTemplateIds().get(0);

				PlanOfCareSection section = target.getPlanOfCareSection();
				for (II ii : section.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordPlanOfCareSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordPlanOfCareSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

				MedicationsAdministeredSection aSection = Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();
				target.addSection(aSection);
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {

				MedicationsAdministeredSection aSection = Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();
				II iiTemp = aSection.getTemplateIds().get(0);

				MedicationsAdministeredSection mSection = target
						.getMedicationsAdministeredSection();
				for (II ii : mSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordMedicationsAdministeredSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				MedicationsAdministeredSection aSection = Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();
				MedicationsAdministeredSection mSection = target
						.getMedicationsAdministeredSection();
				MedicationActivity mAct = ConsolFactory.eINSTANCE
						.createMedicationActivity().init();
				mSection.addSubstanceAdministration(mAct);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivity(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolMedicationsAdministeredSectionMedicationActivityTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				II iiTemp = aSection.getTemplateIds().get(0);

				AssessmentAndPlanSection asSection = target
						.getAssessmentAndPlanSection();
				for (II ii : asSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordAssessmentAndPlanSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordAssessmentSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordAssessmentSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordAssessmentSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				AssessmentSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentSection tempSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				II iiTemp = tempSection.getTemplateIds().get(0);
				AssessmentSection aSection = target.getAssessmentSection();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordAssessmentSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordAssessmentSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_ASSESSMENT_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				target.init();
				AssessmentSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentSection().init();
				target.addSection(aSection);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				AssessmentSection aSection = target.getAssessmentSection();
				ProblemObservation pObs = ConsolFactory.eINSTANCE
						.createProblemObservation().init();
				aSection.addObservation(pObs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolAssessmentSectionProblemObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				HospitalAdmissionDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosisSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				HospitalAdmissionDiagnosisSection tempSection = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosisSection().init();
				II iiTemp = tempSection.getTemplateIds().get(0);

				HospitalAdmissionDiagnosisSection aSection = target
						.getHospitalAdmissionDiagnosisSection();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordHospitalAdmissionDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				HospitalAdmissionDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				HospitalAdmissionDiagnosis act = ConsolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosis().init();
				target.getHospitalAdmissionDiagnosisSection().addAct(act);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				HospitalDischargeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createHospitalDischargeDiagnosisSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				HospitalDischargeDiagnosisSection tempSection = Mu2consolFactory.eINSTANCE
						.createHospitalDischargeDiagnosisSection().init();
				II iiTemp = tempSection.getTemplateIds().get(0);

				HospitalDischargeDiagnosisSection aSection = target
						.getHospitalDischargeDiagnosisSection();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordHospitalDischargeDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				HospitalDischargeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createHospitalDischargeDiagnosisSection().init();
				target.addSection(aSection);

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				HospitalDischargeDiagnosis hdDiagnosis = ConsolFactory.eINSTANCE
						.createHospitalDischargeDiagnosis().init();
				HospitalDischargeDiagnosisSection aSection = target
						.getHospitalDischargeDiagnosisSection();
				aSection.addAct(hdDiagnosis);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_POSTOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

				PostoperativeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createPostoperativeDiagnosisSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PostoperativeDiagnosisSection tempSection = Mu2consolFactory.eINSTANCE
						.createPostoperativeDiagnosisSection().init();
				II iiTemp = tempSection.getTemplateIds().get(0);

				PostoperativeDiagnosisSection aSection = target
						.getPostoperativeDiagnosisSection();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordPostoperativeDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTOPERATIVE_DIAGNOSIS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PostoperativeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createPostoperativeDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PostoperativeDiagnosisSection aSection = target
						.getPostoperativeDiagnosisSection();
				ProblemObservation pObs = ConsolFactory.eINSTANCE
						.createProblemObservation().init();
				aSection.addObservation(pObs);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPostoperativeDiagnosisSectionProblemObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_POSTPROCEDURE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PostprocedureDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createPostprocedureDiagnosisSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PostprocedureDiagnosisSection tempSection = Mu2consolFactory.eINSTANCE
						.createPostprocedureDiagnosisSection().init();
				II iiTemp = tempSection.getTemplateIds().get(0);

				PostprocedureDiagnosisSection aSection = target
						.getPostprocedureDiagnosisSection();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordPostprocedureDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_POSTPROCEDURE_DIAGNOSIS_SECTION_POSTPROCEDURE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PostprocedureDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createPostprocedureDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PostprocedureDiagnosisSection aSection = target
						.getPostprocedureDiagnosisSection();
				PostprocedureDiagnosis pDiagnosis = ConsolFactory.eINSTANCE
						.createPostprocedureDiagnosis();
				aSection.addAct(pDiagnosis);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PREOPERATIVE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PreoperativeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createPreoperativeDiagnosisSection().init();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PreoperativeDiagnosisSection tempSection = Mu2consolFactory.eINSTANCE
						.createPreoperativeDiagnosisSection().init();
				II iiTemp = tempSection.getTemplateIds().get(0);

				PreoperativeDiagnosisSection aSection = target
						.getPreoperativeDiagnosisSection();
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordPreoperativeDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_PREOPERATIVE_DIAGNOSIS_SECTION_PREOPERATIVE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {
				PreoperativeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE
						.createPreoperativeDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				PreoperativeDiagnosisSection aSection = target
						.getPreoperativeDiagnosisSection();
				PreoperativeDiagnosis preOp = ConsolFactory.eINSTANCE
						.createPreoperativeDiagnosis().init();
				aSection.addAct(preOp);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatus(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatus(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordFunctionalStatusSectionTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordFunctionalStatusSectionTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordFunctionalStatusSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordFunctionalStatusSectionTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordFunctionalStatusSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusProblemObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizerTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionCognitiveStatusResultOrganizerTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusProblemObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservationTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservation(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizerTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer",
				operationsForOCL
						.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORDMU2CONSOL_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateSummaryOfCareRecordmu2consolFunctionalStatusSectionFunctionalStatusResultOrganizerTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetEncountersSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getEncountersSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAssessmentAndPlanSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetInterventionsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getInterventionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAssessmentSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalAdmissionDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalAdmissionDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalDischargeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPostoperativeDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPostoperativeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPreoperativeDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPreoperativeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetImmunizationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsAdministeredSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalAdmissionMedicationsSectionEntriesOptional() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalAdmissionMedicationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeMedicationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getHospitalDischargeMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetResultsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetVitalSignsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPostprocedureDiagnosisSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getPostprocedureDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetFunctionalStatusSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<SummaryOfCareRecord> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<SummaryOfCareRecord>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations
						.validateGeneralHeaderConstraintsTemplateId(
								(SummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SummaryOfCareRecordOperations {
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
			TestObjectFactory<SummaryOfCareRecord> {

		@Override
		public SummaryOfCareRecord create() {
			return Mu2consolFactory.eINSTANCE.createSummaryOfCareRecord();
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
			SummaryOfCareRecordOperations {
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

} // SummaryOfCareRecordOperations
