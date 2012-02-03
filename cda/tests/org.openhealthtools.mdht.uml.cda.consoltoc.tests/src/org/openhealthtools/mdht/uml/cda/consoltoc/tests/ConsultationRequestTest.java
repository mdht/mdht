
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.consol.*;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocFactory;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.ConsultationRequestOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Request</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestPhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestReasonForReferralSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestResultsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestAdvanceDirectivesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestEncountersSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Encounters Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateConsultationRequestPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Request Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getReasonForReferralSection() <em>Get Reason For Referral Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getResultsSectionEntriesOptional() <em>Get Results Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getAdvanceDirectivesSectionEntriesOptional() <em>Get Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getEncountersSectionEntriesOptional() <em>Get Encounters Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ConsultationRequestTest extends  CDAValidationTest {





/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestAllergiesSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestAllergiesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* AllergiesSectionEntriesOptional */ 
				AllergiesSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createAllergiesSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestAllergiesSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestAllergiesSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestAssessmentAndPlanSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestAssessmentAndPlanSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestAssessmentAndPlanSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* AssessmentAndPlanSection */ 
				AssessmentAndPlanSection section =
				
				ConsoltocFactory.eINSTANCE.createAssessmentAndPlanSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestAssessmentAndPlanSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestAssessmentAndPlanSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestHistoryOfPresentIllnessSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestHistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* HistoryOfPresentIllnessSection */ 
				HistoryOfPresentIllnessSection section =
				
				ConsoltocFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestHistoryOfPresentIllnessSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestHistoryOfPresentIllnessSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestPhysicalExamSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestPhysicalExamSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestPhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* PhysicalExamSection */ 
				PhysicalExamSection section =
				
				ConsoltocFactory.eINSTANCE.createPhysicalExamSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestPhysicalExamSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestPhysicalExamSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestReasonForReferralSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestReasonForReferralSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestReasonForReferralSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_REASON_FOR_REFERRAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ReasonForReferralSection */ 
				ReasonForReferralSection section =
				
				ConsoltocFactory.eINSTANCE.createReasonForReferralSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestReasonForReferralSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestReasonForReferralSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestMedicationsSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* MedicationsSectionEntriesOptional */ 
				MedicationsSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createMedicationsSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestMedicationsSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestMedicationsSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestProblemSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestProblemSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestProblemSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ProblemSectionEntriesOptional */ 
				ProblemSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createProblemSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestProblemSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestProblemSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestProceduresSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ProceduresSectionEntriesOptional */ 
				ProceduresSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createProceduresSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestProceduresSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestProceduresSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestResultsSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestResultsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestResultsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_RESULTS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ResultsSectionEntriesOptional */ 
				ResultsSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createResultsSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestResultsSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestResultsSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestAdvanceDirectivesSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestAdvanceDirectivesSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestAdvanceDirectivesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* AdvanceDirectivesSectionEntriesOptional */ 
				AdvanceDirectivesSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestAdvanceDirectivesSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestAdvanceDirectivesSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestEncountersSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestEncountersSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestEncountersSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* EncountersSectionEntriesOptional */ 
				EncountersSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createEncountersSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestEncountersSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestEncountersSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestFamilyHistorySection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestFamilyHistorySectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* FamilyHistorySection */ 
				FamilyHistorySection section =
				
				ConsoltocFactory.eINSTANCE.createFamilyHistorySection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestFamilyHistorySection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestFamilyHistorySectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestFunctionalStatusSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestFunctionalStatusSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* FunctionalStatusSection */ 
				FunctionalStatusSection section =
				
				ConsoltocFactory.eINSTANCE.createFunctionalStatusSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestFunctionalStatusSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestFunctionalStatusSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestImmunizationsSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestImmunizationsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestImmunizationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ImmunizationsSectionEntriesOptional */ 
				ImmunizationsSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createImmunizationsSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestImmunizationsSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestImmunizationsSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestMedicalEquipmentSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestMedicalEquipmentSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestMedicalEquipmentSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* MedicalEquipmentSection */ 
				MedicalEquipmentSection section =
				
				ConsoltocFactory.eINSTANCE.createMedicalEquipmentSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestMedicalEquipmentSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestMedicalEquipmentSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestPlanOfCareSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestPlanOfCareSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* PlanOfCareSection */ 
				PlanOfCareSection section =
				
				ConsoltocFactory.eINSTANCE.createPlanOfCareSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestPlanOfCareSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestPlanOfCareSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestSocialHistorySection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestSocialHistorySectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* SocialHistorySection */ 
				SocialHistorySection section =
				
				ConsoltocFactory.eINSTANCE.createSocialHistorySection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestSocialHistorySection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestSocialHistorySectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestVitalSignsSectionEntriesOptional() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestVitalSignsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* VitalSignsSectionEntriesOptional */ 
				VitalSignsSectionEntriesOptional section =
				
				ConsoltocFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestVitalSignsSectionEntriesOptional(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestVitalSignsSectionEntriesOptionalTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestChiefComplaintSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestChiefComplaintSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ChiefComplaintSection */ 
				ChiefComplaintSection section =
				
				ConsoltocFactory.eINSTANCE.createChiefComplaintSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestChiefComplaintSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestChiefComplaintSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestChiefComplaintAndReasonForVisitSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ChiefComplaintAndReasonForVisitSection */ 
				ChiefComplaintAndReasonForVisitSection section =
				
				ConsoltocFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestChiefComplaintAndReasonForVisitSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestGeneralStatusSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestGeneralStatusSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestGeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* GeneralStatusSection */ 
				GeneralStatusSection section =
				
				ConsoltocFactory.eINSTANCE.createGeneralStatusSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestGeneralStatusSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestGeneralStatusSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestHistoryOfPastIllnessSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* HistoryOfPastIllnessSection */ 
				HistoryOfPastIllnessSection section =
				
				ConsoltocFactory.eINSTANCE.createHistoryOfPastIllnessSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestHistoryOfPastIllnessSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestHistoryOfPastIllnessSectionTestCase.doValidationTest();
}






	/**
*
* @generated
*/
@Test

 
									
public void testValidateConsultationRequestPayersSection() {
			OperationsTestCase<ConsultationRequest> validateConsultationRequestPayersSectionTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateConsultationRequestPayersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_REQUEST_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* PayersSection */ 
				PayersSection section =
				
				ConsoltocFactory.eINSTANCE.createPayersSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateConsultationRequestPayersSection(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateConsultationRequestPayersSectionTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testGetAllergiesSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getAllergiesSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAssessmentAndPlanSection() {


ConsultationRequest target = objectFactory.create();
target.getAssessmentAndPlanSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHistoryOfPresentIllnessSection() {


ConsultationRequest target = objectFactory.create();
target.getHistoryOfPresentIllnessSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPhysicalExamSection() {


ConsultationRequest target = objectFactory.create();
target.getPhysicalExamSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetReasonForReferralSection() {


ConsultationRequest target = objectFactory.create();
target.getReasonForReferralSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMedicationsSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getMedicationsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetProblemSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getProblemSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetProceduresSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getProceduresSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetResultsSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getResultsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAdvanceDirectivesSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getAdvanceDirectivesSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEncountersSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getEncountersSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetFamilyHistorySection() {


ConsultationRequest target = objectFactory.create();
target.getFamilyHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetFunctionalStatusSection() {


ConsultationRequest target = objectFactory.create();
target.getFunctionalStatusSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetImmunizationsSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getImmunizationsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMedicalEquipmentSection() {


ConsultationRequest target = objectFactory.create();
target.getMedicalEquipmentSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlanOfCareSection() {


ConsultationRequest target = objectFactory.create();
target.getPlanOfCareSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSocialHistorySection() {


ConsultationRequest target = objectFactory.create();
target.getSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetVitalSignsSectionEntriesOptional() {


ConsultationRequest target = objectFactory.create();
target.getVitalSignsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetChiefComplaintSection() {


ConsultationRequest target = objectFactory.create();
target.getChiefComplaintSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetChiefComplaintAndReasonForVisitSection() {


ConsultationRequest target = objectFactory.create();
target.getChiefComplaintAndReasonForVisitSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGeneralStatusSection() {


ConsultationRequest target = objectFactory.create();
target.getGeneralStatusSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHistoryOfPastIllnessSection() {


ConsultationRequest target = objectFactory.create();
target.getHistoryOfPastIllnessSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPayersSection() {


ConsultationRequest target = objectFactory.create();
target.getPayersSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsTemplateId() {
			OperationsTestCase<ConsultationRequest> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ConsultationRequest>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConsultationRequest target) {

			}

			@Override
			protected void updateToPass(ConsultationRequest target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConsultationRequestOperations.validateGeneralHeaderConstraintsTemplateId(
					(ConsultationRequest) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ConsultationRequestOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConsultationRequest> {
		@Override
		public ConsultationRequest create() {		
			return ConsoltocFactory.eINSTANCE.createConsultationRequest();
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
	private static class ConstructorTestClass extends ConsultationRequestOperations {};
	
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
	
	

	
	
} // ConsultationRequestOperations