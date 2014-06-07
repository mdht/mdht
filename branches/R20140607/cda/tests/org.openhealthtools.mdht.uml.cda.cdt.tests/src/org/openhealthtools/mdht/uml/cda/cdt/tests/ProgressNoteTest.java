/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.HealthCareFacility;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ProgressNote;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ProgressNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Progress Note</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Assessment And Plan</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteBothAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Both Assessment And Plan</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Service Event</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Service Event Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Service Event Effective Time</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasComponentOfElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Component Of Element</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Encompassing Encounter Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Encompassing Encounter Effective Time</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Encompassing Encounter Effective Time Low
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Has Encompassing Encounter Facility Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Alerts Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteObjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Objective Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNotePhysicalExaminationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Physical Examination Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Review Of Systems Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteSubjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Progress Note Subjective Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getAssessmentAndPlanSection()
 * <em>Get Assessment And Plan Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getAssessmentSection()
 * <em>Get Assessment Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getPlanSection()
 * <em>Get Plan Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getAlertsSection()
 * <em>Get Alerts Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getChiefComplaintSection()
 * <em>Get Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getObjectiveSection()
 * <em>Get Objective Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getPhysicalExaminationSection()
 * <em>Get Physical Examination Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getProblemSection()
 * <em>Get Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getResultsSection()
 * <em>Get Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getVitalSignsSection()
 * <em>Get Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getReviewOfSystemsSection()
 * <em>Get Review Of Systems Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getSubjectiveSection()
 * <em>Get Subjective Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ProgressNoteTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteAssessmentAndPlan() {
		OperationsTestCase<ProgressNote> validateProgressNoteAssessmentAndPlanTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteAssessmentAndPlan",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				AssessmentSectionProcNote aspn = CDTFactory.eINSTANCE.createAssessmentSectionProcNote().init();

				target.addSection(aspn);

				PlanOfCareSection pocs = CCDFactory.eINSTANCE.createPlanOfCareSection().init();
				target.addSection(pocs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteAssessmentAndPlan(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteAssessmentAndPlanTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteBothAssessmentAndPlan() {
		OperationsTestCase<ProgressNote> validateProgressNoteBothAssessmentAndPlanTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteBothAssessmentAndPlan",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();

				AssessmentSectionProcNote aspn = CDTFactory.eINSTANCE.createAssessmentSectionProcNote().init();

				target.addSection(aspn);

			}

			@Override
			protected void updateToPass(ProgressNote target) {

				PlanOfCareSection pocs = CCDFactory.eINSTANCE.createPlanOfCareSection().init();
				target.addSection(pocs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteBothAssessmentAndPlan(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteBothAssessmentAndPlanTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasServiceEvent() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasServiceEventTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				DocumentationOf docof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docof.setServiceEvent(se);

				target.getDocumentationOfs().add(docof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasServiceEvent(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasServiceEventTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasServiceEventCode() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasServiceEventCodeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasServiceEventCode",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				DocumentationOf docof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docof.setServiceEvent(se);
				CE ce = DatatypesFactory.eINSTANCE.createCE("371532007", "2.16.840.1.113883.6.96");
				se.setCode(ce);
				target.getDocumentationOfs().add(docof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasServiceEventCode(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasServiceEventCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasServiceEventEffectiveTime() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasServiceEventEffectiveTimeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				DocumentationOf docof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docof.setServiceEvent(se);
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS("low", "high");

				se.setEffectiveTime(ts);
				target.getDocumentationOfs().add(docof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasServiceEventEffectiveTime(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasComponentOfElement() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasComponentOfElementTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasComponentOfElement",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				Component1 value = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasComponentOfElement(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasComponentOfElementTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasEncompassingEncounterId() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasEncompassingEncounterIdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasEncompassingEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				Component1 value = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				II ii = DatatypesFactory.eINSTANCE.createII();
				ee.getIds().add(ii);
				value.setEncompassingEncounter(ee);
				target.setComponentOf(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterId(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasEncompassingEncounterEffectiveTime() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				target.init();
				Component1 value = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				ee.setEffectiveTime(time);
				value.setEncompassingEncounter(ee);
				target.setComponentOf(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterEffectiveTime(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasEncompassingEncounterEffectiveTimeLow() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasEncompassingEncounterEffectiveTimeLowTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasEncompassingEncounterEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				Component1 value = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS("low", "high");
				ee.setEffectiveTime(time);
				value.setEncompassingEncounter(ee);
				target.setComponentOf(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasEncompassingEncounterEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteHasEncompassingEncounterFacilityId() {
		OperationsTestCase<ProgressNote> validateProgressNoteHasEncompassingEncounterFacilityIdTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteHasEncompassingEncounterFacilityId",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();

				Component1 value = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				Location loc = CDAFactory.eINSTANCE.createLocation();
				HealthCareFacility hcf = CDAFactory.eINSTANCE.createHealthCareFacility();
				II ii = DatatypesFactory.eINSTANCE.createII();
				hcf.getIds().add(ii);
				loc.setHealthCareFacility(hcf);

				ee.setLocation(loc);
				value.setEncompassingEncounter(ee);
				target.setComponentOf(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterFacilityId(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteHasEncompassingEncounterFacilityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProgressNoteCode() {
		OperationsTestCase<ProgressNote> validateProgressNoteCodeTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProgressNote target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.6.1");
				ce.setCode("aaaaaaa");
				target.setCode(ce);

				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteCode((ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteAlertsSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteAlertsSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteAlertsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				AlertsSection resultsSection = CCDFactory.eINSTANCE.createAlertsSection().init();
				target.addSection(resultsSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteAlertsSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteAlertsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
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
				ChiefComplaintSectionProcNote resultsSection = CDTFactory.eINSTANCE.createChiefComplaintSectionProcNote().init();
				target.addSection(resultsSection);

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
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteMedicationsSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteMedicationsSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				MedicationsSection resultsSection = CCDFactory.eINSTANCE.createMedicationsSection().init();
				target.addSection(resultsSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteMedicationsSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteMedicationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
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
				ObjectiveSection resultsSection = CDTFactory.eINSTANCE.createObjectiveSection().init();
				target.addSection(resultsSection);

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
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNotePhysicalExaminationSection() {
		OperationsTestCase<ProgressNote> validateProgressNotePhysicalExaminationSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNotePhysicalExaminationSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				PhysicalExaminationSection resultsSection = CDTFactory.eINSTANCE.createPhysicalExaminationSection().init();
				target.addSection(resultsSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNotePhysicalExaminationSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNotePhysicalExaminationSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteProblemSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteProblemSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				ProblemSection resultsSection = CCDFactory.eINSTANCE.createProblemSection().init();
				target.addSection(resultsSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteProblemSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteResultsSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteResultsSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				ResultsSection resultsSection = CCDFactory.eINSTANCE.createResultsSection().init();
				target.addSection(resultsSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteResultsSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateProgressNoteVitalSignsSection() {
		OperationsTestCase<ProgressNote> validateProgressNoteVitalSignsSectionTestCase = new OperationsTestCase<ProgressNote>(
			"validateProgressNoteVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote target) {

			}

			@Override
			protected void updateToPass(ProgressNote target) {
				target.init();
				VitalSignsSection vitalSignsSection = CDTFactory.eINSTANCE.createVitalSignsSection().init();
				target.addSection(vitalSignsSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNoteOperations.validateProgressNoteVitalSignsSection(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateProgressNoteVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
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
				ReviewOfSystemsSectionIHE reviewOfSystemsSectionIHE = CDTFactory.eINSTANCE.createReviewOfSystemsSectionIHE().init();
				target.addSection(reviewOfSystemsSectionIHE);

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
	 * @generated NOT
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
				SubjectiveSection subjectiveSection = CDTFactory.eINSTANCE.createSubjectiveSection().init();
				target.addSection(subjectiveSection);

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
	public void testGetAssessmentAndPlanSection() {

		ProgressNote target = objectFactory.create();
		target.getAssessmentAndPlanSection();

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
	public void testGetPlanSection() {

		ProgressNote target = objectFactory.create();
		target.getPlanSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAlertsSection() {

		ProgressNote target = objectFactory.create();
		target.getAlertsSection();

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
	public void testGetMedicationsSection() {

		ProgressNote target = objectFactory.create();
		target.getMedicationsSection();

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
	public void testGetPhysicalExaminationSection() {

		ProgressNote target = objectFactory.create();
		target.getPhysicalExaminationSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection() {

		ProgressNote target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection() {

		ProgressNote target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		ProgressNote target = objectFactory.create();
		target.getVitalSignsSection();

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
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ProgressNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ProgressNote>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProgressNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(ProgressNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
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
				CE value = DatatypesFactory.eINSTANCE.createCE();
				value.setCode("11111");
				value.setCodeSystem("2.16.840.1.113883.6.1");

				target.setCode(value);

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
			return CDTFactory.eINSTANCE.createProgressNote();
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
	private static class ConstructorTestClass extends ProgressNoteOperations {
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

} // ProgressNoteOperations
