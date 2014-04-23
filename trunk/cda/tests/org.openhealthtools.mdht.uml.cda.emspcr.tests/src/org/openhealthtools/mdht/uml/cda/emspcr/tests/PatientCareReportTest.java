package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSBillingSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPatientCareNarrativeSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCardiacArrestEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAdvanceDirectives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSAllergiesAndAdverseReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPhysicalAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSProceduresPerformedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPatientCareNarrativeSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSceneSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSDispatchSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSPersonnelAdverseEventSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSProtocolSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSResponseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSSceneSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTimesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSInjuryIncidentDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Injury Incident Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportEMSBillingSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report EMS Billing Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCurrentMedication() <em>Get Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCardiacArrestEvent() <em>Get Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAdvanceDirectives() <em>Get Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSAllergiesAndAdverseReactionsSection() <em>Get Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPhysicalAssessmentSection() <em>Get Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSProceduresPerformedSection() <em>Get Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPatientCareNarrativeSection() <em>Get Patient Care Narrative Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSceneSection() <em>Get Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSDispatchSection() <em>Get Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSDispositionSection() <em>Get Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSPersonnelAdverseEventSection() <em>Get Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSProtocolSection() <em>Get Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSResponseSection() <em>Get Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSSceneSection() <em>Get Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getTimesSection() <em>Get Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSInjuryIncidentDescriptionSection() <em>Get Injury Incident Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getEMSBillingSections() <em>Get EMS Billing Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validateGeneralHeaderConstraintsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */

public class PatientCareReportTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportClassCode() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportClassCodeTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportMoodCode() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportMoodCodeTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportCodeP() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportCodePTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportCode() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportCodeTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected void setDependency(PatientCareReport target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReportCodeP", passToken);
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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportConfidentialityCode() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportConfidentialityCodeTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportConfidentialityCode(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportConfidentialityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportRecordTarget() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportRecordTargetTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportCurrentMedication() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportCurrentMedicationTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportCurrentMedication",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportCurrentMedication(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportCurrentMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportCardiacArrestEvent() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportCardiacArrestEventTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportCardiacArrestEvent",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CARDIAC_ARREST_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportCardiacArrestEvent(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportCardiacArrestEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportAdvanceDirectives() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportAdvanceDirectivesTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportAdvanceDirectives",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_ADVANCE_DIRECTIVES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportAdvanceDirectives(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportAdvanceDirectivesTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSAllergiesAndAdverseReactionsSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSAllergiesAndAdverseReactionsSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSAllergiesAndAdverseReactionsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportAllergiesAndAdverseReactionsSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSAllergiesAndAdverseReactionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportPastMedicalHistorySection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportPastMedicalHistorySectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportPastMedicalHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* PastMedicalHistorySection */
				EMSPastMedicalHistorySection section =

				EmspcrFactory.eINSTANCE.createEMSPastMedicalHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportPastMedicalHistorySection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportPastMedicalHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidatePatientCareReportSocialHistorySection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportSocialHistorySectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportSocialHistorySection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSPhysicalAssessmentSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSPhysicalAssessmentSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSPhysicalAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportPhysicalAssessmentSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSPhysicalAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSMedicationsAdministeredSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSMedicationsAdministeredSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSMedicationsAdministeredSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportMedicationsAdministeredSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSMedicationsAdministeredSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSProceduresPerformedSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSProceduresPerformedSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSProceduresPerformedSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportProceduresPerformedSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSProceduresPerformedSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSPatientCareNarrativeSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSPatientCareNarrativeSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSPatientCareNarrativeSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* EMSPatientCareNarrativeSection */
				EMSPatientCareNarrativeSection section =

				EmspcrFactory.eINSTANCE.createEMSPatientCareNarrativeSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportPatientCareNarrativeSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSPatientCareNarrativeSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportSceneSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportSceneSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportSceneSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_SCENE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportSceneSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportSceneSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSDispatchSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSDispatchSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSDispatchSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportDispatchSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSDispatchSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSDispositionSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSDispositionSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSDispositionSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportDispositionSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSDispositionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSPersonnelAdverseEventSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSPersonnelAdverseEventSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSPersonnelAdverseEventSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportPersonnelAdverseEventSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSPersonnelAdverseEventSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSProtocolSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSProtocolSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSProtocolSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportProtocolSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSProtocolSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSResponseSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSResponseSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSResponseSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportResponseSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSResponseSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSSceneSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSSceneSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSSceneSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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

				return PatientCareReportOperations.validatePatientCareReportSceneSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSSceneSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportTimesSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportTimesSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportTimesSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_TIMES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* TimesSection */
				TimesSection section =

				EmspcrFactory.eINSTANCE.createTimesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportTimesSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportTimesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidatePatientCareReportVitalSignsSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportVitalSignsSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportVitalSignsSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportAuthorParticipation() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportAuthorParticipationTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportAuthorParticipation(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportDocumentationOf() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportDocumentationOfTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportRelatedDocument() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportRelatedDocumentTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportRelatedDocument",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_RELATED_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportParticipant() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportParticipantTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportParticipant",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSInjuryIncidentDescriptionSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSInjuryIncidentDescriptionSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSInjuryIncidentDescriptionSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* EMSInjuryIncidentDescriptionSection */
				EMSInjuryIncidentDescriptionSection section =

				EmspcrFactory.eINSTANCE.createEMSInjuryIncidentDescriptionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportInjuryIncidentDescriptionSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSInjuryIncidentDescriptionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientCareReportEMSBillingSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportEMSBillingSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportEMSBillingSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_EMS_BILLING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* EMSBillingSection */
				EMSBillingSection section =

				EmspcrFactory.eINSTANCE.createEMSBillingSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportEMSBillingSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportEMSBillingSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetCurrentMedication() {

		PatientCareReport target = objectFactory.create();
		target.getCurrentMedication();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetCardiacArrestEvent() {

		PatientCareReport target = objectFactory.create();
		target.getCardiacArrestEvent();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetAdvanceDirectives() {

		PatientCareReport target = objectFactory.create();
		target.getAdvanceDirectives();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSAllergiesAndAdverseReactionsSection() {

		PatientCareReport target = objectFactory.create();
		target.getAllergiesAndAdverseReactionsSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetPastMedicalHistorySection() {

		PatientCareReport target = objectFactory.create();
		target.getPastMedicalHistorySection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetSocialHistorySection() {

		PatientCareReport target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSPhysicalAssessmentSection() {

		PatientCareReport target = objectFactory.create();
		target.getPhysicalAssessmentSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSMedicationsAdministeredSection() {

		PatientCareReport target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSProceduresPerformedSection() {

		PatientCareReport target = objectFactory.create();
		target.getProceduresPerformedSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSPatientCareNarrativeSection() {

		PatientCareReport target = objectFactory.create();
		target.getPatientCareNarrativeSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetSceneSection() {

		PatientCareReport target = objectFactory.create();
		target.getSceneSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSDispatchSection() {

		PatientCareReport target = objectFactory.create();
		target.getDispatchSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSDispositionSection() {

		PatientCareReport target = objectFactory.create();
		target.getDispositionSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSPersonnelAdverseEventSection() {

		PatientCareReport target = objectFactory.create();
		target.getPersonnelAdverseEventSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSProtocolSection() {

		PatientCareReport target = objectFactory.create();
		target.getProtocolSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSResponseSection() {

		PatientCareReport target = objectFactory.create();
		target.getResponseSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSSceneSection() {

		PatientCareReport target = objectFactory.create();
		target.getSceneSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetTimesSection() {

		PatientCareReport target = objectFactory.create();
		target.getTimesSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetVitalSignsSection() {

		PatientCareReport target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSInjuryIncidentDescriptionSection() {

		PatientCareReport target = objectFactory.create();
		target.getInjuryIncidentDescriptionSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testGetEMSBillingSections() {

		PatientCareReport target = objectFactory.create();
		target.getEMSBillingSections();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<PatientCareReport> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<PatientCareReport>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsId() {
		OperationsTestCase<PatientCareReport> validateGeneralHeaderConstraintsIdTestCase = new OperationsTestCase<PatientCareReport>(
			"validateGeneralHeaderConstraintsId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validateGeneralHeaderConstraintsId(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTitle() {
		OperationsTestCase<PatientCareReport> validateGeneralHeaderConstraintsTitleTestCase = new OperationsTestCase<PatientCareReport>(
			"validateGeneralHeaderConstraintsTitle",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validateGeneralHeaderConstraintsTitle(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsVersionNumber() {
		OperationsTestCase<PatientCareReport> validateGeneralHeaderConstraintsVersionNumberTestCase = new OperationsTestCase<PatientCareReport>(
			"validateGeneralHeaderConstraintsVersionNumber",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validateGeneralHeaderConstraintsVersionNumber(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsVersionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOf() {
		OperationsTestCase<PatientCareReport> validateGeneralHeaderConstraintsComponentOfTestCase = new OperationsTestCase<PatientCareReport>(
			"validateGeneralHeaderConstraintsComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validateGeneralHeaderConstraintsComponentOf(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodian() {
		OperationsTestCase<PatientCareReport> validateGeneralHeaderConstraintsCustodianTestCase = new OperationsTestCase<PatientCareReport>(
			"validateGeneralHeaderConstraintsCustodian",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validateGeneralHeaderConstraintsCustodian(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
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
	* @generated not
	*/
	private static class ObjectFactory implements TestObjectFactory<PatientCareReport> {
		public PatientCareReport create() {
			return EmspcrFactory.eINSTANCE.createPatientCareReport();
		}
	}

	/**
	*
	* @generated not
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated not
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated not
	*/
	private static class ConstructorTestClass extends PatientCareReportOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated not
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated not
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PatientCareReportOperations
