
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

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTInpatientPatientInfoOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>VDT Inpatient Patient Info</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Info Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Allergies Section Entries Optional Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class VDTInpatientPatientInfoTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfoResponsibleParty() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoResponsiblePartyTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfoResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoResponsibleParty(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoResponsiblePartyTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfoSocialHistorySection() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoSocialHistorySectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfoSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* SocialHistorySection */ 
				SocialHistorySection section =
				
				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoSocialHistorySection(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfoProblemSection() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoProblemSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfoProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ProblemSection */ 
				ProblemSection section =
				
				Mu2consolFactory.eINSTANCE.createProblemSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoProblemSection(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoProblemSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfoResultsSection() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoResultsSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfoResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ResultsSection */ 
				ResultsSection section =
				
				Mu2consolFactory.eINSTANCE.createResultsSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoResultsSection(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoResultsSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfoPlanOfCareSection() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoPlanOfCareSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfoPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* PlanOfCareSection */ 
				PlanOfCareSection section =
				
				Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoPlanOfCareSection(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoPlanOfCareSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfoProceduresSectionEntriesOptional() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfoProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* ProceduresSectionEntriesOptional */ 
				ProceduresSectionEntriesOptional section =
				
				Mu2consolFactory.eINSTANCE.createProceduresSectionEntriesOptional().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfoProceduresSectionEntriesOptional(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoProceduresSectionEntriesOptionalTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
			OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
			"validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTInpatientPatientInfoOperations.validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
					(VDTInpatientPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSocialHistorySection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetProblemSection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getProblemSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMedicationsSection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getMedicationsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHospitalAdmissionMedicationsSectionEntriesOptional() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getHospitalAdmissionMedicationsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHospitalDischargeMedicationsSection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getHospitalDischargeMedicationsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAllergiesSection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getAllergiesSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAllergiesSectionEntriesOptional() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getAllergiesSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetResultsSection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getResultsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetVitalSignsSection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getVitalSignsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetVitalSignsSectionEntriesOptional() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getVitalSignsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlanOfCareSection() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getPlanOfCareSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetProceduresSectionEntriesOptional() {


VDTInpatientPatientInfo target = objectFactory.create();
target.getProceduresSectionEntriesOptional();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends VDTInpatientPatientInfoOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VDTInpatientPatientInfo> {
		@Override
		public VDTInpatientPatientInfo create() {		
			return Mu2consolFactory.eINSTANCE.createVDTInpatientPatientInfo();
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
	private static class ConstructorTestClass extends VDTInpatientPatientInfoOperations {};
	
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
	
	

	
	
} // VDTInpatientPatientInfoOperations