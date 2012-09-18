/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ClinicalOfficeVisitSummaryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Clinical Office Visit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Responsible Party</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryReasonForOfficeVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Care Planning</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Effective Time</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Location</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Plan Of Care Act Or Encounter
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Medications Administered Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Mu2consol Plan Of Care Section
 * Care Planning For Plan Of Care</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Mu2consol Plan Of Care Section
 * Plan Of Care Activity Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Plan Of Care Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Medications Administered Section
 * Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Mu2consol Medications Administered
 * Section Medication Activity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Assessment And Plan Section
 * Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Instructions Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMu2consolInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Mu2consol Instructions Section
 * Instructions</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Social History Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Mu2consol Social History Section
 * Smoking Status Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrievePlanOfCareSection()
 * <em>Retrieve Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProblemSection()
 * <em>Get Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSection()
 * <em>Get Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getResultsSection()
 * <em>Get Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getVitalSignsSection()
 * <em>Get Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getPlanOfCareSection()
 * <em>Get Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProceduresSection()
 * <em>Get Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getImmunizationsSection()
 * <em>Get Immunizations Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsAdministeredSection()
 * <em>Get Medications Administered Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getReasonForVisitSection()
 * <em>Get Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintSection()
 * <em>Get Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintAndReasonForVisitSection()
 * <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAssessmentAndPlanSection()
 * <em>Get Assessment And Plan Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInstructionsSection()
 * <em>Get Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ClinicalOfficeVisitSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryResponsibleParty() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryResponsiblePartyTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryResponsibleParty",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				target.init();
				Component1 comp1 = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter encounter = CDAFactory.eINSTANCE
						.createEncompassingEncounter();
				comp1.setEncompassingEncounter(encounter);
				target.setComponentOf(comp1);
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				ResponsibleParty party = CDAFactory.eINSTANCE
						.createResponsibleParty();
				target.getComponentOf().getEncompassingEncounter()
						.setResponsibleParty(party);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryResponsibleParty(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryResponsiblePartyTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryLocation() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryLocationTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryLocation",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				Component1 comp1 = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter encounter = CDAFactory.eINSTANCE
						.createEncompassingEncounter();
				comp1.setEncompassingEncounter(encounter);
				target.setComponentOf(comp1);
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				Location locn = CDAFactory.eINSTANCE.createLocation();
				target.getComponentOf().getEncompassingEncounter()
						.setLocation(locn);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryLocation(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryLocationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounterTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_ACT_OR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				PlanOfCareSection section = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(section);

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				PlanOfCareActivityEncounter encounter = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityEncounter().init();
				target.getPlanOfCareSection().addEncounter(encounter);
				PlanOfCareActivityObservation pObs = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityObservation().init();
				target.getPlanOfCareSection().addObservation(pObs);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounter(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryPlanOfCareActOrEncounterTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryReasonForOfficeVisit() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryReasonForOfficeVisitTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryReasonForOfficeVisit",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				ChiefComplaintSection cSection = ConsolFactory.eINSTANCE
						.createChiefComplaintSection().init();
				ReasonForVisitSection rSection = ConsolFactory.eINSTANCE
						.createReasonForVisitSection();
				target.addSection(cSection);
				target.addSection(rSection);
				// ChiefComplaintAndReasonForVisitSection ccSection =
				// ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();
				// target.addSection(ccSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryReasonForOfficeVisit(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryReasonForOfficeVisitTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryCarePlanning() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryCarePlanningTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryCarePlanning",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				PlanOfCareSection section = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(section);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryCarePlanning(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryCarePlanningTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryEffectiveTime() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryEffectiveTimeTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryEffectiveTime",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				Component1 compOf = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter enCounter = CDAFactory.eINSTANCE
						.createEncompassingEncounter();
				compOf.setEncompassingEncounter(enCounter);
				target.setComponentOf(compOf);
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				IVL_TS effTime = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getComponentOf().getEncompassingEncounter()
						.setEffectiveTime(effTime);
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryEffectiveTime(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryEffectiveTimeTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarySocialHistorySection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarySocialHistorySectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummarySocialHistorySection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummarySocialHistorySection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarySocialHistorySectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryProblemSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryProblemSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryProblemSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryProblemSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryProblemSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMedicationsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMedicationsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryMedicationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMedicationsSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryMedicationsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryAllergiesSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryAllergiesSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryAllergiesSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryAllergiesSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryAllergiesSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryResultsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryResultsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryResultsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				ConsolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryResultsSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryResultsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryVitalSignsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryVitalSignsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryVitalSignsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryVitalSignsSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryVitalSignsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryPlanOfCareSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryPlanOfCareSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryPlanOfCareSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryPlanOfCareSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryPlanOfCareSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryProceduresSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryProceduresSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryProceduresSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				ConsolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryProceduresSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryProceduresSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryImmunizationsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryImmunizationsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryImmunizationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				ConsolFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryImmunizationsSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryImmunizationsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMedicationsAdministeredSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryMedicationsAdministeredSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
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

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMedicationsAdministeredSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryInstructionsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryInstructionsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryInstructionsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* InstructionsSection */
				InstructionsSection section =

				Mu2consolFactory.eINSTANCE.createInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryInstructionsSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryInstructionsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				PlanOfCareSection section = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(section);

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				PlanOfCareActivityAct act = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityAct().init();
				target.getPlanOfCareSection().addAct(act);
				PlanOfCareActivityObservation obs = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityObservation().init();
				target.getPlanOfCareSection().addObservation(obs);
				PlanOfCareActivityEncounter encounter = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityEncounter().init();
				target.getPlanOfCareSection().addEncounter(encounter);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				PlanOfCareActivityObservation obs = ConsolFactory.eINSTANCE
						.createPlanOfCareActivityObservation().init();
				target.getPlanOfCareSection().addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				target.addSection(pSection);
				for (II ii : pSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				PlanOfCareSection pSection = Mu2consolFactory.eINSTANCE
						.createPlanOfCareSection().init();
				II iiTemp = pSection.getTemplateIds().get(0);

				for (II ii : target.getPlanOfCareSection().getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateId(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryPlanOfCareSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				MedicationsAdministeredSection mSection = Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();
				for (II ii : mSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(mSection);
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				MedicationsAdministeredSection mSection = Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();
				II iiTemp = mSection.getTemplateIds().get(0);

				for (II ii : target.getMedicationsAdministeredSection()
						.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateId(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMu2consolMedicationsAdministeredSectionMedicationActivity() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				MedicationsAdministeredSection mSection = Mu2consolFactory.eINSTANCE
						.createMedicationsAdministeredSection().init();
				target.addSection(mSection);

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				MedicationActivity mAct = ConsolFactory.eINSTANCE
						.createMedicationActivity().init();
				target.getMedicationsAdministeredSection()
						.addSubstanceAdministration(mAct);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMu2consolMedicationsAdministeredSectionMedicationActivity(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivityTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				target.addSection(aSection);
				for (II ii : aSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				AssessmentAndPlanSection aSection = Mu2consolFactory.eINSTANCE
						.createAssessmentAndPlanSection().init();
				II iiTemp = aSection.getTemplateIds().get(0);

				for (II ii : target.getAssessmentAndPlanSection()
						.getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateId(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryInstructionsSectionTemplateId() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryInstructionsSectionTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				InstructionsSection iSection = Mu2consolFactory.eINSTANCE
						.createInstructionsSection().init();
				target.addSection(iSection);
				for (II ii : iSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				InstructionsSection iSection = Mu2consolFactory.eINSTANCE
						.createInstructionsSection().init();
				II iiTemp = iSection.getTemplateIds().get(0);

				for (II ii : target.getInstructionsSection().getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryInstructionsSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMu2consolInstructionsSectionInstructions() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructionsTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				InstructionsSection iSection = Mu2consolFactory.eINSTANCE
						.createInstructionsSection().init();
				target.addSection(iSection);
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				Instructions iAct = ConsolFactory.eINSTANCE
						.createInstructions().init();
				target.getInstructionsSection().addAct(iAct);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMu2consolInstructionsSectionInstructions(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructionsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarySocialHistorySectionTemplateId() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarySocialHistorySectionTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				SocialHistorySection sSection = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				target.addSection(sSection);
				for (II ii : sSection.getTemplateIds()) {
					ii.setRoot(BAD_TEMPLATE_ID);
				}
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				SocialHistorySection sSection = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				II iiTemp = sSection.getTemplateIds().get(0);
				for (II ii : target.getSocialHistorySection().getTemplateIds()) {
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummarySocialHistorySectionTemplateId(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarySocialHistorySectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {
				SocialHistorySection sSection = Mu2consolFactory.eINSTANCE
						.createSocialHistorySection().init();
				target.addSection(sSection);
			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				SmokingStatusObservation sObs = Mu2consolFactory.eINSTANCE
						.createSmokingStatusObservation().init();
				target.getSocialHistorySection().addObservation(sObs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMu2consolSocialHistorySectionSmokingStatusObservation(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetResultsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetVitalSignsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetImmunizationsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsAdministeredSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetReasonForVisitSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetChiefComplaintSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAssessmentAndPlanSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetInstructionsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			ClinicalOfficeVisitSummaryOperations {
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
			TestObjectFactory<ClinicalOfficeVisitSummary> {

		@Override
		public ClinicalOfficeVisitSummary create() {
			return Mu2consolFactory.eINSTANCE
					.createClinicalOfficeVisitSummary();
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
			ClinicalOfficeVisitSummaryOperations {
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

} // ClinicalOfficeVisitSummaryOperations
