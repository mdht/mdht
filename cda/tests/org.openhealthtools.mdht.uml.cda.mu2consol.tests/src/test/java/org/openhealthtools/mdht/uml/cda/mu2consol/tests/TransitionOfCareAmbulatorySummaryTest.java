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
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareAmbulatorySummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Ambulatory Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Provider Name And Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryReasonForReferral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Encounter Diagnoses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransitionOfCareAmbulatorySummaryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfoTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
			"validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				// empty test
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {

					}
				});

				// test failing snippet (does not include an assignedPerson)
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}
				});
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						rp.setAssignedEntity(ae);
						ee.setResponsibleParty(rp);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						ep.setAssignedEntity(ae);
						ee.getEncounterParticipants().add(ep);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				// test "at least" scenario for clause one with a snippet with multiple performers
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();

						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						perf.setAssignedEntity(ae);

						Performer1 perf2 = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae2 = CDAFactory.eINSTANCE.createAssignedEntity();
						Person ap2 = CDAFactory.eINSTANCE.createPerson();
						ap2.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae2.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae2.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae2.setAssignedPerson(ap2);
						perf2.setAssignedEntity(ae2);

						// 3rd performer has no assignedPerson element, only one performer needs to have it
						Performer1 perf3 = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae3 = CDAFactory.eINSTANCE.createAssignedEntity();
						ae3.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae3.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						perf3.setAssignedEntity(ae3);

						se.getPerformers().add(perf);
						se.getPerformers().add(perf2);
						se.getPerformers().add(perf3);

						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(
					(TransitionOfCareAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfoTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryReasonForReferral() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryReasonForReferralTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
			"validateTransitionOfCareAmbulatorySummaryReasonForReferral",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareAmbulatorySummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryReasonForReferral(
					(TransitionOfCareAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryReasonForReferralTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryEncounterDiagnoses() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryEncounterDiagnosesTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
			"validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				// skipFailsTest();

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Assessment Section w/o any entries (c1)
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						target.addSection(aSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Assessment And Plan Section w/o any entries (c2)
						target.init();
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						target.addSection(aapSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Postoperative Diagnosis Section w/o any entries (c3)
						target.init();
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						target.addSection(podSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Problem Section w/o any entries (c4)
						target.init();
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						target.addSection(probSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Hospital Admission Diagnosis Section w/o any entries (c5)
						target.init();
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						target.addSection(hadSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Hospital Discharge Diagnosis Section w/o any entries (c6)
						target.init();
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						target.addSection(hddSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Encounters Section w/o any entries (c7)
						target.init();
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						target.addSection(encSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// 5th and 6th clauses section only (w/o any entries)
						target.init();
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						target.addSection(hadSec);
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						target.addSection(hddSec);

					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Test left blank intentionally:
						// If none of the following sections exist then none of them have an entry and therefore the
						// Encounter Diagnosis requirement is not met: Assessment Section, Assessment And Plan Section,
						// Postoperative Diagnosis section, Problem Section, Hospital Admission Diagnosis Section,
						// Hospital Discharge Diagnosis Section, Encounters Section.
						// System.out.println("\nBlank Test");
						target.init();
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
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

				// tests for errata 384

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Assessment Section withOUT a Problem Observation entry with incorrect nullFlavor towards rule negation
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						aSec.setNullFlavor(NullFlavor.ASKU);
						target.addSection(aSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Has Encounters Section w/o any entries with incorrect NullFlavor set
						target.init();
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						encSec.setNullFlavor(NullFlavor.OTH);
						target.addSection(encSec);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransitionOfCareAmbulatorySummary target) {
						// Check if an unrelated to the rule section containing NullFlavor NI -
						// causes the related sections (missing) entries to pass
						target.init();

						// add unrelated section...
						ReviewOfSystemsSection ros = ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();
						target.addSection(ros);
						// set it to nullFlavor of NI (should not affect sepcific sections in rule)
						target.setNullFlavor(NullFlavor.NI);

						// encounter diagnoses failure (all sections, no entries, no nullFlavor
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Clause 4 Test 1: Add Problem Concern Act to ProblemSection
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						ProblemConcernAct probConAct = ConsolFactory.eINSTANCE.createProblemConcernAct().init();
						probSec.addAct(probConAct);
						target.addSection(probSec);

					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Clause 5: Add Hospital Admission Diagnosis entry to HospitalAdmissionDiagnosis section
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						HospitalAdmissionDiagnosis hospAdmisDiag = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis().init();
						hadSec.addAct(hospAdmisDiag);
						target.addSection(hadSec);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Clause 6: Add Hospital Discharge Diagnosis entry to HospitalDischargeDiagnosis section
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						HospitalDischargeDiagnosis hospDisDiag = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis().init();
						hddSec.addAct(hospDisDiag);
						target.addSection(hddSec);

					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Clause 7 Test 1: Add Encounter Activities entry to EncountersSection
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						EncounterActivities encActivities = ConsolFactory.eINSTANCE.createEncounterActivities().init();
						encSec.addEncounter(encActivities);
						target.addSection(encSec);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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

				// ***tests for errata 384 nullFlavor of correct type

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Has Assessment Section withOUT a Problem Observation entry
						// with correct nullFlavor for entry requirement negation
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						aSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Has Encounters Section w/o any entries but has nullFlavor NI set
						target.init();
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						encSec.setNullFlavor(NullFlavor.NI);
						target.addSection(encSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// 5th and 6th clauses section only but has nullFlavor NI set on both sections
						target.init();
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						hadSec.setNullFlavor(NullFlavor.NI);
						target.addSection(hadSec);
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						hddSec.setNullFlavor(NullFlavor.NI);
						target.addSection(hddSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// 1st 2nd and 3rd clause sections included with NO entries but has nullFlavor NI set on all sections
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						aSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aSec);
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						aapSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aapSec);
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						podSec.setNullFlavor(NullFlavor.NI);
						target.addSection(podSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// 1st and 3rd sections included with NO entries but has nullFlavor NI set on all sections
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						aSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aSec);
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						podSec.setNullFlavor(NullFlavor.NI);
						target.addSection(podSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Has first 6 sections w/o any entries (all sections except EncountersSection) and has nullFlavor NI set on all sections
						target.init();
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						aSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aSec);
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						aapSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aapSec);
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						podSec.setNullFlavor(NullFlavor.NI);
						target.addSection(podSec);
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						probSec.setNullFlavor(NullFlavor.NI);
						target.addSection(probSec);
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						hadSec.setNullFlavor(NullFlavor.NI);
						target.addSection(hadSec);
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						hddSec.setNullFlavor(NullFlavor.NI);
						target.addSection(hddSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// Has The Assessment Section (TemplateID = 2.16.840.1.113883.10.20.22.2.8)
						// - with NO entries but has NullFlavor NI set
						// Does NOT have The Assessment And Plan Section (TemplateID = 2.16.840.1.113883.10.20.22.2.9)
						// Does NOT have The Postoperative Diagnosis section (TemplateID = 2.16.840.1.113883.10.20.22.2.35)
						// Has The Problem Section (entries required: TemplateID = 2.16.840.1.113883.10.20.22.2.5.1)
						// - with NO entries but has NullFlavor NI set
						// Does NOT have The Hospital Admission Diagnosis Section (TemplateID = 2.16.840.1.113883.10.20.22.2.43)
						// Does NOT have The Hospital Discharge Diagnosis Section (TemplateID = 2.16.840.1.113883.10.20.22.2.24)
						// Does NOT have The Encounters Section (entries required: TemplateID = 2.16.840.1.113883.10.20.22.2.22.1)
						target.init();
						// Add Assessment Section w/o any entries
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						// add negation
						aSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aSec);
						// Add Problem Section w/o any entries
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						// add negation
						probSec.setNullFlavor(NullFlavor.NI);
						target.addSection(probSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// All 7 Clauses at same time w/o any entries and all sections have nullFlavor NI set
						target.init();
						// Add Assessment Section w/o any entries
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						aSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aSec);
						// Add Assessment And Plan Section w/o any entries
						AssessmentAndPlanSection aapSec = ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();
						aapSec.setNullFlavor(NullFlavor.NI);
						target.addSection(aapSec);
						// Has Postoperative Diagnosis Section w/o any entries
						PostoperativeDiagnosisSection podSec = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
						podSec.setNullFlavor(NullFlavor.NI);
						target.addSection(podSec);
						// Add Problem Section w/o any entries
						ProblemSection probSec = ConsolFactory.eINSTANCE.createProblemSection().init();
						probSec.setNullFlavor(NullFlavor.NI);
						target.addSection(probSec);
						// Add Hospital Admission Diagnosis Section w/o any entries
						HospitalAdmissionDiagnosisSection hadSec = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
						hadSec.setNullFlavor(NullFlavor.NI);
						target.addSection(hadSec);
						// Add Hospital Discharge Diagnosis Section w/o any entries
						HospitalDischargeDiagnosisSection hddSec = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
						hddSec.setNullFlavor(NullFlavor.NI);
						target.addSection(hddSec);
						// Add Encounters Section w/o any entries
						EncountersSection encSec = ConsolFactory.eINSTANCE.createEncountersSection().init();
						encSec.setNullFlavor(NullFlavor.NI);
						target.addSection(encSec);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						// All 7 Clauses at same time w/o any entries but one section has nullFlavor NI set
						// Technically this is legal because only one clause has to pass (an or situation)
						// and
						// "in all cases where a section level null flavor exists, all information within that section
						// need not be validated except for verifying against the schema.
						// In the case of many "OR" requirements in MU2, the same rule applies if any of the "OR" statements
						// are met we are good and by definition including a section with nullFlavor would meet that requirement..."
						target.init();
						// Add Assessment Section w/o any entries
						AssessmentSection aSec = ConsolFactory.eINSTANCE.createAssessmentSection().init();
						aSec.setNullFlavor(NullFlavor.NI);
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryEncounterDiagnoses(
					(TransitionOfCareAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryEncounterDiagnosesTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryMedicationsSection() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryMedicationsSectionTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
			"validateTransitionOfCareAmbulatorySummaryMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareAmbulatorySummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareAmbulatorySummary target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryMedicationsSection(
					(TransitionOfCareAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryMedicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		TransitionOfCareAmbulatorySummary target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends TransitionOfCareAmbulatorySummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransitionOfCareAmbulatorySummary> {

		public TransitionOfCareAmbulatorySummary create() {
			return Mu2consolFactory.eINSTANCE.createTransitionOfCareAmbulatorySummary();
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
	private static class ConstructorTestClass extends TransitionOfCareAmbulatorySummaryOperations {
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

} // TransitionOfCareAmbulatorySummaryOperations
