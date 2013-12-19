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
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteInterventionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteObjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteSubjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteDocumentationOfServiceEvent2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Documentation Of Service Event2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility1 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateProgressNoteComponentOfEncompassingEncounter6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Component Of Encompassing Encounter6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getInterventionsSection() <em>Get Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getObjectiveSection() <em>Get Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getSubjectiveSection() <em>Get Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProgressNoteTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote target) {
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
					public void updateToPass(ProgressNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProgressNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSectionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent() {
		OperationsTestCase<ProgressNote> validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote target) {
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
					public void updateToPass(ProgressNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProgressNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteTemplateId() {
		OperationsTestCase<ProgressNote> validateProgressNoteTemplateIdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteTemplateId(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<ProgressNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<ProgressNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDocumentationOf() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOf(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteComponentOf() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOf(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteAssessmentSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteAssessmentSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteAssessmentSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNotePlanOfCareSection() {
		OperationsTestCase<ProgressNote> validateProgressNotePlanOfCareSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNotePlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNotePlanOfCareSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNotePlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteAssessmentAndPlanSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteAssessmentAndPlanSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteAssessmentAndPlanSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* AssessmentAndPlanSection */
				AssessmentAndPlanSection section =

				ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteAssessmentAndPlanSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteAssessmentAndPlanSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteAllergiesSectionEntriesOptional() {
		OperationsTestCase<ProgressNote> validateProgressNoteAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteAllergiesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteAllergiesSectionEntriesOptional(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteAllergiesSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteChiefComplaintSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteChiefComplaintSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteChiefComplaintSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteInterventionsSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteInterventionsSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteInterventionsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_INTERVENTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* InterventionsSection */
				InterventionsSection section =

				ConsolFactory.eINSTANCE.createInterventionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteInterventionsSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteInterventionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteMedicationsSectionEntriesOptional() {
		OperationsTestCase<ProgressNote> validateProgressNoteMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* MedicationsSectionEntriesOptional */
				MedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteMedicationsSectionEntriesOptional(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteObjectiveSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteObjectiveSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteObjectiveSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* ObjectiveSection */
				ObjectiveSection section =

				ConsolFactory.eINSTANCE.createObjectiveSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteObjectiveSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteObjectiveSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNotePhysicalExamSection() {
		OperationsTestCase<ProgressNote> validateProgressNotePhysicalExamSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNotePhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* PhysicalExamSection */
				PhysicalExamSection section =

				ConsolFactory.eINSTANCE.createPhysicalExamSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNotePhysicalExamSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNotePhysicalExamSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteProblemSectionEntriesOptional() {
		OperationsTestCase<ProgressNote> validateProgressNoteProblemSectionEntriesOptionalTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteProblemSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* ProblemSectionEntriesOptional */
				ProblemSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteProblemSectionEntriesOptional(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteProblemSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteResultsSectionEntriesOptional() {
		OperationsTestCase<ProgressNote> validateProgressNoteResultsSectionEntriesOptionalTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteResultsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* ResultsSectionEntriesOptional */
				ResultsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteResultsSectionEntriesOptional(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteResultsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteReviewOfSystemsSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteReviewOfSystemsSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteReviewOfSystemsSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteSubjectiveSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteSubjectiveSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteSubjectiveSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* SubjectiveSection */
				SubjectiveSection section =

				ConsolFactory.eINSTANCE.createSubjectiveSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteSubjectiveSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteSubjectiveSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNoteVitalSignsSectionEntriesOptional() {
		OperationsTestCase<ProgressNote> validateProgressNoteVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteVitalSignsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* VitalSignsSectionEntriesOptional */
				VitalSignsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteVitalSignsSectionEntriesOptional(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteVitalSignsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteInstructionsSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteInstructionsSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				/* InstructionsSection */
				InstructionsSection section =

				ConsolFactory.eINSTANCE.createInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteInstructionsSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteInstructionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLowTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
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
			protected void updateToPass(ProgressNote target) {
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

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLow(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHighTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
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
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();

				high.setValue("12345");
				ts.setHigh(high);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHigh(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDayTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_DAY);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDay(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinuteTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
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
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinute(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecondTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
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
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_SECOND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecond(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MS_WITH_TIMEZONE);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_HOUR_WITH_TIMEZONE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2TemplateId() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2TemplateIdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.21.3.1"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2TemplateId(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2ClassCode() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2ClassCodeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2ClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				se.setClassCode(ActClassRoot.PCPR);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2ClassCode(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2EffectiveTime() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2EffectiveTime(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteDocumentationOfServiceEvent2() {
		OperationsTestCase<ProgressNote> validateProgressNoteDocumentationOfServiceEvent2TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteDocumentationOfServiceEvent2",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_DOCUMENTATION_OF_SERVICE_EVENT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();

				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteDocumentationOfServiceEvent2(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteDocumentationOfServiceEvent2TestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1IdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());
				target.getComponentOf().getEncompassingEncounter().getLocation().setHealthCareFacility(
					CDAFactory.eINSTANCE.createHealthCareFacility());
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().getLocation().getHealthCareFacility().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
				;
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1Id(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility1IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacilityTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.setLocation(CDAFactory.eINSTANCE.createLocation());
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				Location loc = CDAFactory.eINSTANCE.createLocation();
				loc.setHealthCareFacility(CDAFactory.eINSTANCE.createHealthCareFacility());
				ee.setLocation(loc);
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacility(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6LocationHealthCareFacilityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDayTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_DAY);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDay(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinuteTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinute(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecondTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE);
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_SECOND);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecond(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6PreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(
					PRECISE_TO_HOUR_WITH_TIMEZONE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffset(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6IfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6EffectiveTime() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6EffectiveTimeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6EffectiveTime(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6Id() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6IdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6Id",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Id(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6Location() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6LocationTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6Location",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6Location(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteComponentOfEncompassingEncounter6() {
		OperationsTestCase<ProgressNote> validateProgressNoteComponentOfEncompassingEncounter6TestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteComponentOfEncompassingEncounter6",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteComponentOfEncompassingEncounter6(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteComponentOfEncompassingEncounter6TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ProgressNote target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ProgressNote target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection() {

		ProgressNote target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		ProgressNote target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ProgressNote target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionsSection() {

		ProgressNote target = objectFactory.create();
		target.getInterventionsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional() {

		ProgressNote target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetObjectiveSection() {

		ProgressNote target = objectFactory.create();
		target.getObjectiveSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection() {

		ProgressNote target = objectFactory.create();
		target.getPhysicalExamSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSectionEntriesOptional() {

		ProgressNote target = objectFactory.create();
		target.getProblemSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSectionEntriesOptional() {

		ProgressNote target = objectFactory.create();
		target.getResultsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ProgressNote target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSubjectiveSection() {

		ProgressNote target = objectFactory.create();
		target.getSubjectiveSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {

		ProgressNote target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructionsSection() {

		ProgressNote target = objectFactory.create();
		target.getInstructionsSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ProgressNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ProgressNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				target.getCode().setCode("code");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProgressNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProgressNote> {
		public ProgressNote create() {
			return ConsolFactory.eINSTANCE.createProgressNote();
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
	private static class ConstructorTestClass extends ProgressNoteOperations {
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

} // ProgressNoteOperations
