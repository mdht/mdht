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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.consol.EncounterDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareInpatientSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Inpatient Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryEncounterDiagnoses(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Encounter Diagnoses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Inpatient Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransitionOfCareInpatientSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTransitionOfCareInpatientSummaryMedications() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryMedicationsTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
			"validateTransitionOfCareInpatientSummaryMedications",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createMedicationsSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init());
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryMedications(
					(TransitionOfCareInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryMedicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransitionOfCareInpatientSummaryEncounterDiagnoses() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryEncounterDiagnosesTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
			"validateTransitionOfCareInpatientSummaryEncounterDiagnoses",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has Assessment Section w/o any entries (c1)
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has Assessment And Plan Section w/o any entries (c2)
						target.init();
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						target.addSection(aapSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has Postoperative Diagnosis Section w/o any entries (c3)
						target.init();
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						target.addSection(podSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has Problem Section w/o any entries (c4)
						target.init();
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						target.addSection(probSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has Hospital Admission Diagnosis Section w/o any entries (c5)
						target.init();
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						target.addSection(hadSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has Hospital Discharge Diagnosis Section w/o any entries (c6)
						target.init();
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						target.addSection(hddSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has Encounters Section w/o any entries (c7)
						target.init();
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						target.addSection(encSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// 5th and 6th clauses section only
						target.init();
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						target.addSection(hadSec);
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						target.addSection(hddSec);

					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// 1st 2nd and 3rd clause sections included with NO entries
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						target.addSection(aapSec);
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						target.addSection(podSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// 1st and 3rd sections included with NO entries
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						target.addSection(podSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Has first 6 sections w/o any entries (all sections except EncountersSection)
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						target.addSection(aapSec);
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						target.addSection(podSec);
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						target.addSection(probSec);
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						target.addSection(hadSec);
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						target.addSection(hddSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// CCD1_RemoveProbConcernAndProbObs.xml manual test (5) document emulation
						// Has The Assessment Section (TemplateID = 2.16.840.1.113883.10.20.22.2.8)
						// - with NO entries
						// Does NOT have The Assessment And Plan Section (TemplateID = 2.16.840.1.113883.10.20.22.2.9)
						// Does NOT have The Postoperative Diagnosis section (TemplateID = 2.16.840.1.113883.10.20.22.2.35)
						// Has The Problem Section (entries required: TemplateID = 2.16.840.1.113883.10.20.22.2.5.1)
						// - with NO entries
						// Does NOT have The Hospital Admission Diagnosis Section (TemplateID = 2.16.840.1.113883.10.20.22.2.43)
						// Does NOT have The Hospital Discharge Diagnosis Section (TemplateID = 2.16.840.1.113883.10.20.22.2.24)
						// Does NOT have The Encounters Section (entries required: TemplateID = 2.16.840.1.113883.10.20.22.2.22.1)
						target.init();
						// Add Assessment Section w/o any entries
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
						// Add Problem Section w/o any entries
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						target.addSection(probSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// Test left blank intentionally:
						// If none of the following sections exist then none of them have an entry and therefore the
						// Encounter Diagnosis requirement is not met: Assessment Section, Assessment And Plan Section,
						// Postoperative Diagnosis section, Problem Section, Hospital Admission Diagnosis Section,
						// Hospital Discharge Diagnosis Section, Encounters Section.
						target.init();
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareInpatientSummary target) {
						// All 7 Clauses at same time w/o any entries
						target.init();
						// Add Assessment Section w/o any entries
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
						// Add Assessment And Plan Section w/o any entries
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						target.addSection(aapSec);
						// Has Postoperative Diagnosis Section w/o any entries
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						target.addSection(podSec);
						// Add Problem Section w/o any entries
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						target.addSection(probSec);
						// Add Hospital Admission Diagnosis Section w/o any entries
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						target.addSection(hadSec);
						// Add Hospital Discharge Diagnosis Section w/o any entries
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						target.addSection(hddSec);
						// Add Encounters Section w/o any entries
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						target.addSection(encSec);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 1 Test: Add entry Problem Observation (2.16.840.1.113883.10.20.22.4.4)
						// to AssessmentSection
						// target.getComponent().getStructuredBody().getComponents().clear();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						ProblemObservation probOb = ConsolFactory.eINSTANCE.createProblemObservation().init();
						aSec.addObservation(probOb);
						target.addSection(aSec);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 2 Test: Add entry Problem Observation (2.16.840.1.113883.10.20.22.4.4)
						// to AssessmentAndPlanSection
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						ProblemObservation probOb2 = ConsolFactory.eINSTANCE.createProblemObservation().init();
						aapSec.addObservation(probOb2);
						target.addSection(aapSec);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 3 Test: Add entry Problem Observation (2.16.840.1.113883.10.20.22.4.4)
						// to PostoperativeDiagnosisSection
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						ProblemObservation probOb3 = ConsolFactory.eINSTANCE.createProblemObservation().init();
						podSec.addObservation(probOb3);
						target.addSection(podSec);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 4 Test 1: Add Problem Concern Act to ProblemSection
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						ProblemConcernAct probConAct = ConsolFactory.eINSTANCE.createProblemConcernAct().init();
						probSec.addAct(probConAct);
						target.addSection(probSec);

					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 4 Test 2: Add Problem Concern Act and Problem Observation to ProblemSection
						ProblemSection probSec2 = ConsolFactory.eINSTANCE.createProblemSection().init();
						ProblemConcernAct probConAct2 = ConsolFactory.eINSTANCE.createProblemConcernAct().init();
						ProblemObservation probOb4 = ConsolFactory.eINSTANCE.createProblemObservation().init();
						probSec2.addAct(probConAct2);
						probSec2.addObservation(probOb4);
						target.addSection(probSec2);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 5: Add Hospital Admission Diagnosis entry to HospitalAdmissionDiagnosis section
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						HospitalAdmissionDiagnosis hospAdmisDiag = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis().init();
						hadSec.addAct(hospAdmisDiag);
						target.addSection(hadSec);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 6: Add Hospital Discharge Diagnosis entry to HospitalDischargeDiagnosis section
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						HospitalDischargeDiagnosis hospDisDiag = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis().init();
						hddSec.addAct(hospDisDiag);
						target.addSection(hddSec);

					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 7 Test 1: Add Encounter Activities entry to EncountersSection
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						EncounterActivities encActivities = ConsolFactory.eINSTANCE.createEncounterActivities().init();
						encSec.addEncounter(encActivities);
						target.addSection(encSec);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// Clause 7 Test 2: Add Encounter Activities and Encounter Diagnosis to EncountersSection
						EncountersSection encSec2 = ConsolFactory.eINSTANCE.createEncountersSection().init();
						EncounterActivities encActivities2 = ConsolFactory.eINSTANCE.createEncounterActivities().init();
						EncounterDiagnosis encDiag = ConsolFactory.eINSTANCE.createEncounterDiagnosis().init();
						encSec2.addEncounter(encActivities2);
						encSec2.addAct(encDiag);
						target.addSection(encSec2);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// // All 7 Clauses at same time
						// Clause 1 Test: Add required entry Problem Observation (2.16.840.1.113883.10.20.22.4.4)
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						ProblemObservation probOb = ConsolFactory.eINSTANCE.createProblemObservation().init();
						aSec.addObservation(probOb);
						target.addSection(aSec);
						// Clause 2 Test: Add required entry Problem Observation (2.16.840.1.113883.10.20.22.4.4)
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						ProblemObservation probOb2 = ConsolFactory.eINSTANCE.createProblemObservation().init();
						aapSec.addObservation(probOb2);
						target.addSection(aapSec);
						// Clause 3 Test: Add required entry Problem Observation (2.16.840.1.113883.10.20.22.4.4) to PostoperativeDiagnosisSection
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						ProblemObservation probOb3 = ConsolFactory.eINSTANCE.createProblemObservation().init();
						podSec.addObservation(probOb3);
						target.addSection(podSec);
						// Clause 4 Test 1: Add Problem Concern Act to ProblemSection
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						ProblemConcernAct probConAct = ConsolFactory.eINSTANCE.createProblemConcernAct().init();
						probSec.addAct(probConAct);
						target.addSection(probSec);
						// Clause 4 Test 2: Add Problem Concern Act and Problem Observation to ProblemSection
						ProblemSection probSec2 = ConsolFactory.eINSTANCE.createProblemSection().init();
						ProblemConcernAct probConAct2 = ConsolFactory.eINSTANCE.createProblemConcernAct().init();
						ProblemObservation probOb4 = ConsolFactory.eINSTANCE.createProblemObservation().init();
						probSec2.addAct(probConAct2);
						probSec2.addObservation(probOb4);
						target.addSection(probSec2);
						// Clause 5: Add Hospital Admission Diagnosis entry to HospitalAdmissionDiagnosis section
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						HospitalAdmissionDiagnosis hospAdmisDiag = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis().init();
						hadSec.addAct(hospAdmisDiag);
						target.addSection(hadSec);
						// Clause 6: Add Hospital Discharge Diagnosis entry to HospitalDischargeDiagnosis section
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						HospitalDischargeDiagnosis hospDisDiag = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis().init();
						hddSec.addAct(hospDisDiag);
						target.addSection(hddSec);
						// Clause 7 Test 1: Add Encounter Activities entry to EncountersSection
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						EncounterActivities encActivities = ConsolFactory.eINSTANCE.createEncounterActivities().init();
						encSec.addEncounter(encActivities);
						target.addSection(encSec);
						// Clause 7 Test 2: Add Encounter Activities and Encounter Diagnosis to EncountersSection
						EncountersSection encSec2 = ConsolFactory.eINSTANCE.createEncountersSection().init();
						EncounterActivities encActivities2 = ConsolFactory.eINSTANCE.createEncounterActivities().init();
						EncounterDiagnosis encDiag = ConsolFactory.eINSTANCE.createEncounterDiagnosis().init();
						encSec2.addEncounter(encActivities2);
						encSec2.addAct(encDiag);
						target.addSection(encSec2);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareInpatientSummary target) {
						// CCD 1.xml manual test (1) document emulation
						// Has The Assessment Section (TemplateID = 2.16.840.1.113883.10.20.22.2.8)
						// - with NO entries
						// Does NOT have The Assessment And Plan Section (TemplateID = 2.16.840.1.113883.10.20.22.2.9)
						// Does NOT have The Postoperative Diagnosis section (TemplateID = 2.16.840.1.113883.10.20.22.2.35)
						// Has The Problem Section (entries required: TemplateID = 2.16.840.1.113883.10.20.22.2.5.1)
						// - with 2 Problem Concern Act Entry (TemplateID = 2.16.840.1.113883.10.20.22.4.3) and
						// - with 2 Problem Observation Entry (TemplateID = 2.16.840.1.113883.10.20.22.4.4)
						// Does NOT have The Hospital Admission Diagnosis Section (TemplateID = 2.16.840.1.113883.10.20.22.2.43)
						// Does NOT have The Hospital Discharge Diagnosis Section (TemplateID = 2.16.840.1.113883.10.20.22.2.24)
						// Has The Encounters Section (entries required: TemplateID = 2.16.840.1.113883.10.20.22.2.22.1)
						// - with a Encounter Activities Entry (TemplateID = 2.16.840.1.113883.10.20.22.4.49)
						// - Note: does NOT contain a Encounter Diagnosis Entry (TemplateID = 2.16.840.1.113883.10.20.22.4.80)
						target.init();
						// Add Assessment Section w/o any entries
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
						// Add Problem Section with both entries (2 of each) in same section
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						ProblemConcernAct probConAct = ConsolFactory.eINSTANCE.createProblemConcernAct().init();
						ProblemObservation probOb = ConsolFactory.eINSTANCE.createProblemObservation().init();
						probConAct.getCode().setCodeSystemName("First ProblemConcernAct"); // reference
						probSec.addAct(probConAct);
						probSec.addObservation(probOb);
						ProblemConcernAct probConAct2 = ConsolFactory.eINSTANCE.createProblemConcernAct().init();
						ProblemObservation probOb2 = ConsolFactory.eINSTANCE.createProblemObservation().init();
						probConAct2.getCode().setCodeSystemName("Second ProblemConcernAct"); // reference
						probSec.addAct(probConAct2);
						probSec.addObservation(probOb2);
						target.addSection(probSec);
						// Add Encounters Section with Encounter Activities Entry ONLY
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						EncounterActivities encActivities = ConsolFactory.eINSTANCE.createEncounterActivities().init();
						encSec.addEncounter(encActivities);
						target.addSection(encSec);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryEncounterDiagnoses(
					(TransitionOfCareInpatientSummary) objectToTest, diagnostician, map);

			}

		};

		validateTransitionOfCareInpatientSummaryEncounterDiagnosesTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
			"validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(
					(TransitionOfCareInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		TransitionOfCareInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends TransitionOfCareInpatientSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransitionOfCareInpatientSummary> {

		public TransitionOfCareInpatientSummary create() {
			return Mu2consolFactory.eINSTANCE.createTransitionOfCareInpatientSummary();
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
	private static class ConstructorTestClass extends TransitionOfCareInpatientSummaryOperations {
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

} // TransitionOfCareInpatientSummaryOperations
