/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientCareReportOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Care Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportHumanAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Human Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportBilling(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSCardiacArrestEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSAdvanceDirectives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPastMedicalHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSSocialHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPhysicalAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSProceduresPerformedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPatientCareNarrative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSSceneSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSDispatchSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPersonnelAdverseEventSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSProtocolSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSResponseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSSituationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSTimesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSHumanAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Human Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getBilling() <em>Get Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSection() <em>Get Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSCurrentMedication() <em>Get EMS Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSCardiacArrestEvent() <em>Get EMS Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSAdvanceDirectives() <em>Get EMS Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSAllergiesAndAdverseReactionsSection() <em>Get EMS Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPastMedicalHistory() <em>Get EMS Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSSocialHistory() <em>Get EMS Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPhysicalAssessmentSection() <em>Get EMS Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSMedicationsAdministeredSection() <em>Get EMS Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSProceduresPerformedSection() <em>Get EMS Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPatientCareNarrative() <em>Get EMS Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSSceneSection() <em>Get EMS Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSDispatchSection() <em>Get EMS Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSDispositionSection() <em>Get EMS Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPersonnelAdverseEventSection() <em>Get EMS Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSProtocolSection() <em>Get EMS Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSResponseSection() <em>Get EMS Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSSituationSection() <em>Get EMS Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSTimesSection() <em>Get EMS Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSVitalSignsSection() <em>Get EMS Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientCareReportTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportClassCode() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportClassCodeTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportClassCode(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportMoodCode() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportMoodCodeTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportMoodCode(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportMoodCodeTestCase.doValidationTest();
}

	/**
*
* @generated
*/
@Test

 
                  
public void testValidatePatientCareReportCodeP() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportCodePTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportCodeP",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportCodeP(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportCodePTestCase.doValidationTest();
}

  /**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportCode() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportCodeTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportCode",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportCode(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportTitle() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportTitleTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportTitle(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportVersionNumber() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportVersionNumberTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportVersionNumber",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportVersionNumber(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportVersionNumberTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportId() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportIdTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportId",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportId(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportAuthor() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportAuthorTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportAuthor",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportAuthor(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportAuthorTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportRecordTarget() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportRecordTargetTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportRecordTarget",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportRecordTarget(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportRecordTargetTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportHumanAuthor() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportHumanAuthorTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportHumanAuthor",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_HUMAN_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportHumanAuthor(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportHumanAuthorTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportBilling() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportBillingTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportBilling",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportBilling(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportBillingTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientCareReportSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* Section */
				Section section =

				CDAFactory.eINSTANCE.createSection();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSCurrentMedication() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSCurrentMedicationTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSCurrentMedication",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSCurrentMedication(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSCurrentMedicationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSCardiacArrestEvent() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSCardiacArrestEventTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSCardiacArrestEvent",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSCardiacArrestEvent(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSCardiacArrestEventTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSAdvanceDirectives() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSAdvanceDirectivesTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSAdvanceDirectives",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSAdvanceDirectives(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSAdvanceDirectivesTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSAllergiesAndAdverseReactionsSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSAllergiesAndAdverseReactionsSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSAllergiesAndAdverseReactionsSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSAllergiesAndAdverseReactionsSection */ 
        EMSAllergiesAndAdverseReactionsSection section =
        
        EmspcrFactory.eINSTANCE.createEMSAllergiesAndAdverseReactionsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSAllergiesAndAdverseReactionsSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSPastMedicalHistory() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSPastMedicalHistoryTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSPastMedicalHistory",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSPastMedicalHistory(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSPastMedicalHistoryTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSSocialHistory() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSSocialHistoryTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSSocialHistory",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSSocialHistory(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSSocialHistoryTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSPhysicalAssessmentSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSPhysicalAssessmentSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSPhysicalAssessmentSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSPhysicalAssessmentSection */ 
        EMSPhysicalAssessmentSection section =
        
        EmspcrFactory.eINSTANCE.createEMSPhysicalAssessmentSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSPhysicalAssessmentSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSPhysicalAssessmentSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSMedicationsAdministeredSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSMedicationsAdministeredSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSMedicationsAdministeredSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSMedicationsAdministeredSection */ 
        EMSMedicationsAdministeredSection section =
        
        EmspcrFactory.eINSTANCE.createEMSMedicationsAdministeredSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSMedicationsAdministeredSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSMedicationsAdministeredSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSProceduresPerformedSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSProceduresPerformedSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSProceduresPerformedSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSProceduresPerformedSection */ 
        EMSProceduresPerformedSection section =
        
        EmspcrFactory.eINSTANCE.createEMSProceduresPerformedSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSProceduresPerformedSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSProceduresPerformedSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSPatientCareNarrative() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSPatientCareNarrativeTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSPatientCareNarrative",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSPatientCareNarrative(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSPatientCareNarrativeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSSceneSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSSceneSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSSceneSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSSceneSection */ 
        EMSSceneSection section =
        
        EmspcrFactory.eINSTANCE.createEMSSceneSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSSceneSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSSceneSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportComponentOf() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportComponentOfTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportComponentOf",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportComponentOf(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportComponentOfTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSDispatchSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSDispatchSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSDispatchSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSDispatchSection */ 
        EMSDispatchSection section =
        
        EmspcrFactory.eINSTANCE.createEMSDispatchSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSDispatchSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSDispatchSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSDispositionSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSDispositionSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSDispositionSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSDispositionSection */ 
        EMSDispositionSection section =
        
        EmspcrFactory.eINSTANCE.createEMSDispositionSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSDispositionSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSDispositionSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSPersonnelAdverseEventSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSPersonnelAdverseEventSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSPersonnelAdverseEventSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSPersonnelAdverseEventSection */ 
        EMSPersonnelAdverseEventSection section =
        
        EmspcrFactory.eINSTANCE.createEMSPersonnelAdverseEventSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSPersonnelAdverseEventSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSPersonnelAdverseEventSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSProtocolSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSProtocolSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSProtocolSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSProtocolSection */ 
        EMSProtocolSection section =
        
        EmspcrFactory.eINSTANCE.createEMSProtocolSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSProtocolSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSProtocolSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSResponseSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSResponseSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSResponseSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSResponseSection */ 
        EMSResponseSection section =
        
        EmspcrFactory.eINSTANCE.createEMSResponseSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSResponseSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSResponseSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSSituationSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSSituationSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSSituationSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSSituationSection */ 
        EMSSituationSection section =
        
        EmspcrFactory.eINSTANCE.createEMSSituationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSSituationSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSSituationSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSTimesSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSTimesSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSTimesSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSTimesSection */ 
        EMSTimesSection section =
        
        EmspcrFactory.eINSTANCE.createEMSTimesSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSTimesSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSTimesSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSVitalSignsSection() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSVitalSignsSectionTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSVitalSignsSection",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* EMSVitalSignsSection */ 
        EMSVitalSignsSection section =
        
        EmspcrFactory.eINSTANCE.createEMSVitalSignsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSVitalSignsSection(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSVitalSignsSectionTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportEMSHumanAuthorParticipation() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportEMSHumanAuthorParticipationTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportEMSHumanAuthorParticipation",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_HUMAN_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportEMSHumanAuthorParticipation(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportEMSHumanAuthorParticipationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportCustodian() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportCustodianTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportCustodian",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportCustodian(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportCustodianTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportDocumentationOf() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportDocumentationOfTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportDocumentationOf",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportDocumentationOf(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportDocumentationOfTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportRelatedDocument() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportRelatedDocumentTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportRelatedDocument",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportRelatedDocument(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportRelatedDocumentTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportParticipant() {
      OperationsTestCase<PatientCareReport> validatePatientCareReportParticipantTestCase = new OperationsTestCase<PatientCareReport>(
      "validatePatientCareReportParticipant",
      operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validatePatientCareReportParticipant(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validatePatientCareReportParticipantTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBilling() {


PatientCareReport target = objectFactory.create();
target.getBilling();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSection() {


PatientCareReport target = objectFactory.create();
target.getSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSCurrentMedication() {


PatientCareReport target = objectFactory.create();
target.getEMSCurrentMedication();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSCardiacArrestEvent() {


PatientCareReport target = objectFactory.create();
target.getEMSCardiacArrestEvent();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSAdvanceDirectives() {


PatientCareReport target = objectFactory.create();
target.getEMSAdvanceDirectives();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSAllergiesAndAdverseReactionsSection() {


PatientCareReport target = objectFactory.create();
target.getEMSAllergiesAndAdverseReactionsSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSPastMedicalHistory() {


PatientCareReport target = objectFactory.create();
target.getEMSPastMedicalHistory();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSSocialHistory() {


PatientCareReport target = objectFactory.create();
target.getEMSSocialHistory();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSPhysicalAssessmentSection() {


PatientCareReport target = objectFactory.create();
target.getEMSPhysicalAssessmentSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSMedicationsAdministeredSection() {


PatientCareReport target = objectFactory.create();
target.getEMSMedicationsAdministeredSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSProceduresPerformedSection() {


PatientCareReport target = objectFactory.create();
target.getEMSProceduresPerformedSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSPatientCareNarrative() {


PatientCareReport target = objectFactory.create();
target.getEMSPatientCareNarrative();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSSceneSection() {


PatientCareReport target = objectFactory.create();
target.getEMSSceneSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSDispatchSection() {


PatientCareReport target = objectFactory.create();
target.getEMSDispatchSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSDispositionSection() {


PatientCareReport target = objectFactory.create();
target.getEMSDispositionSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSPersonnelAdverseEventSection() {


PatientCareReport target = objectFactory.create();
target.getEMSPersonnelAdverseEventSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSProtocolSection() {


PatientCareReport target = objectFactory.create();
target.getEMSProtocolSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSResponseSection() {


PatientCareReport target = objectFactory.create();
target.getEMSResponseSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSSituationSection() {


PatientCareReport target = objectFactory.create();
target.getEMSSituationSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSTimesSection() {


PatientCareReport target = objectFactory.create();
target.getEMSTimesSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSVitalSignsSection() {


PatientCareReport target = objectFactory.create();
target.getEMSVitalSignsSection();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
      OperationsTestCase<PatientCareReport> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<PatientCareReport>(
      "validateGeneralHeaderConstraintsTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PatientCareReport target) {

      }

      @Override
      protected void updateToPass(PatientCareReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PatientCareReportOperations.validateGeneralHeaderConstraintsTemplateId(
          (PatientCareReport) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientCareReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientCareReport> {
		public PatientCareReport create() {
			return EmspcrFactory.eINSTANCE.createPatientCareReport();
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
	private static class ConstructorTestClass extends PatientCareReportOperations {
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

} // PatientCareReportOperations
