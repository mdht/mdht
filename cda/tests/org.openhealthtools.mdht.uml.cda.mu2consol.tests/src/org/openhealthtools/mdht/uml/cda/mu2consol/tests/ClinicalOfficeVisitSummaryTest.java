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

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ClinicalOfficeVisitSummaryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Clinical Office Visit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication List</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medication Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryReasonForOfficeVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reason For Office Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Medications Administered Section Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summarymu2consol Instructions Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInterventionsSection() <em>Get Interventions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ClinicalOfficeVisitSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryResponsibleParty() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryResponsiblePartyTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryResponsibleParty",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryResponsibleParty(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryResponsiblePartyTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryLocation() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryLocationTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryLocation",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryLocation(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryLocationTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMedicationList() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMedicationListTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryMedicationList",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationList(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryMedicationListTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMedicationAllergy() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMedicationAllergyTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryMedicationAllergy",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationAllergy(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryMedicationAllergyTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryVitalSigns() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryVitalSignsTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryVitalSigns",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVitalSigns(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryVitalSignsTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryReasonForOfficeVisit() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryReasonForOfficeVisitTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryReasonForOfficeVisit",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASON_FOR_OFFICE_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryReasonForOfficeVisit(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryReasonForOfficeVisitTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryCarePlanning() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryCarePlanningTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryCarePlanning",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryCarePlanning(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryCarePlanningTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarySocialHistorySection() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarySocialHistorySectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummarySocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

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
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarySocialHistorySection(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummarySocialHistorySectionTestCase.doValidationTest();
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
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryPlanOfCareSection() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryPlanOfCareSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryPlanOfCareSection",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

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
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryPlanOfCareSection(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryPlanOfCareSectionTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated  NOT
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
	public void testValidateClinicalOfficeVisitSummaryAssessmentAndPlanSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryAssessmentAndPlanSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* AssessmentAndPlanSection */
				AssessmentAndPlanSection section =

				Mu2consolFactory.eINSTANCE.createAssessmentAndPlanSection()
						.init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryAssessmentAndPlanSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryAssessmentAndPlanSectionTestCase
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
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservation(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummarymu2consolSocialHistorySectionSmokingStatusObservationTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummarymu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummarymu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummarymu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivityTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivity(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummarymu2consolMedicationsAdministeredSectionMedicationActivityTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryInstructionsSectionTemplateId() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryInstructionsSectionTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryInstructionsSectionTemplateId(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummaryInstructionsSectionTemplateIdTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructionsTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARYMU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructions(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateClinicalOfficeVisitSummarymu2consolInstructionsSectionInstructionsTestCase.doValidationTest();
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
	public void testGetHospitalAdmissionMedicationsSectionEntriesOptional() {


ClinicalOfficeVisitSummary target = objectFactory.create();
target.getHospitalAdmissionMedicationsSectionEntriesOptional();



}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeMedicationsSection() {


ClinicalOfficeVisitSummary target = objectFactory.create();
target.getHospitalDischargeMedicationsSection();



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
	public void testGetAllergiesSectionEntriesOptional() {


ClinicalOfficeVisitSummary target = objectFactory.create();
target.getAllergiesSectionEntriesOptional();



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
	public void testGetVitalSignsSectionEntriesOptional() {


ClinicalOfficeVisitSummary target = objectFactory.create();
target.getVitalSignsSectionEntriesOptional();



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
	@Test
	public void testGetInterventionsSection() {


ClinicalOfficeVisitSummary target = objectFactory.create();
target.getInterventionsSection();



}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
      OperationsTestCase<ClinicalOfficeVisitSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
      "validateGeneralHeaderConstraintsTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalOfficeVisitSummary target) {

      }

      @Override
      protected void updateToPass(ClinicalOfficeVisitSummary target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalOfficeVisitSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
          (ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
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