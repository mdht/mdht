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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTAmbulatoryPatientInfoOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>VDT Ambulatory Patient Info</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoMedicationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Medication List</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoMedicationAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Medication Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Can Have Either Vital Signs Requied Or Optional Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Can Have Either Allergy Required Or Optional Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Can Have Either Encounters Required Or Optional Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoReasonForHospitalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Reason For Hospitalization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Infomu2consol Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Hospital Admission Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Infomu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Infomu2consol Plan Of Care Section Care Planning For Plan Of Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Info Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Patient Infomu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getEncountersSectionEntriesOptional() <em>Get Encounters Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getHospitalAdmissionDiagnosisSection() <em>Get Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VDTAmbulatoryPatientInfoTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoMedicationList() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoMedicationListTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoMedicationList",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoMedicationList(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoMedicationListTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoMedicationAllergy() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoMedicationAllergyTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoMedicationAllergy",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_MEDICATION_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoMedicationAllergy(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoMedicationAllergyTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntryTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntryTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntryTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntryTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntryTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_ENCOUNTERS_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntry(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoCanHaveEitherEncountersRequiredOrOptionalEntryTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoReasonForHospitalization() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoReasonForHospitalizationTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoReasonForHospitalization",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_REASON_FOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoReasonForHospitalization(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoReasonForHospitalizationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoSocialHistorySection() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoSocialHistorySectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* SocialHistorySection */ 
				SocialHistorySection section =
				
				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoSocialHistorySection(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoSocialHistorySectionTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoProblemSection() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoProblemSectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoProblemSection(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoProblemSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoResultsSection() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoResultsSectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				ConsolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoResultsSection(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoResultsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoPlanOfCareSection() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoPlanOfCareSectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				Mu2consolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoPlanOfCareSection(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoProceduresSection() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoProceduresSectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				ConsolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoProceduresSection(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoProceduresSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSection(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoHospitalDischargeInstructionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateId(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoSocialHistorySectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfomu2consolSocialHistorySectionSmokingStatusObservationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateId(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoPlanOfCareSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateId(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoHospitalAdmissionDiagnosisSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis() {
			OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
			"validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VDTAmbulatoryPatientInfoOperations.validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
					(VDTAmbulatoryPatientInfo) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfomu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getSocialHistorySection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getProblemSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getMedicationsSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalAdmissionMedicationsSectionEntriesOptional() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getHospitalAdmissionMedicationsSectionEntriesOptional();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeMedicationsSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getHospitalDischargeMedicationsSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getAllergiesSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getAllergiesSectionEntriesOptional();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getResultsSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getVitalSignsSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getVitalSignsSectionEntriesOptional();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getPlanOfCareSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getProceduresSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeInstructionsSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getHospitalDischargeInstructionsSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getEncountersSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersSectionEntriesOptional() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getEncountersSectionEntriesOptional();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalAdmissionDiagnosisSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getHospitalAdmissionDiagnosisSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getReasonForVisitSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getChiefComplaintSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {


VDTAmbulatoryPatientInfo target = objectFactory.create();
target.getChiefComplaintAndReasonForVisitSection();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VDTAmbulatoryPatientInfoOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VDTAmbulatoryPatientInfo> {
		public VDTAmbulatoryPatientInfo create() {
			return Mu2consolFactory.eINSTANCE.createVDTAmbulatoryPatientInfo();
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
	private static class ConstructorTestClass extends VDTAmbulatoryPatientInfoOperations {
	}

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

} // VDTAmbulatoryPatientInfoOperations
