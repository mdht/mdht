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
import org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.DispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport;
import org.openhealthtools.mdht.uml.cda.emspcr.PersonnelAdverseEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ProceduresPerformedSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.SituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.TimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportBilling(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCardiacArrestEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAdvanceDirectives(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAllergiesAndAdverseReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPastMedicalHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSocialHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPhysicalAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportProceduresPerformedSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPatientCareNarrative(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSceneSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDispatchSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportPersonnelAdverseEventSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportProtocolSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportResponseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportSituationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportTimesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportRelatedDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Related Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#validatePatientCareReportInjuryIncidentDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Care Report Injury Incident Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getBilling() <em>Get Billing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCurrentMedication() <em>Get Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getCardiacArrestEvent() <em>Get Cardiac Arrest Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAdvanceDirectives() <em>Get Advance Directives</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getAllergiesAndAdverseReactionsSection() <em>Get Allergies And Adverse Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPastMedicalHistory() <em>Get Past Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSocialHistory() <em>Get Social History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPhysicalAssessmentSection() <em>Get Physical Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getProceduresPerformedSection() <em>Get Procedures Performed Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPatientCareNarrative() <em>Get Patient Care Narrative</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSceneSection() <em>Get Scene Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getDispatchSection() <em>Get Dispatch Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getDispositionSection() <em>Get Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getPersonnelAdverseEventSection() <em>Get Personnel Adverse Event Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getProtocolSection() <em>Get Protocol Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getResponseSection() <em>Get Response Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getSituationSection() <em>Get Situation Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getTimesSection() <em>Get Times Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientCareReport#getInjuryIncidentDescriptionSection() <em>Get Injury Incident Description Section</em>}</li>
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
	* @generated
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
	* @generated
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
	* @generated
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
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated
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
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportBilling() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportBillingTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportBilling",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_BILLING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PatientCareReportOperations.validatePatientCareReportBilling(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportBillingTestCase.doValidationTest();
	}

	/**
	*
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportAllergiesAndAdverseReactionsSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportAllergiesAndAdverseReactionsSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportAllergiesAndAdverseReactionsSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* AllergiesAndAdverseReactionsSection */
				AllergiesAndAdverseReactionsSection section =

				EmspcrFactory.eINSTANCE.createAllergiesAndAdverseReactionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportAllergiesAndAdverseReactionsSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportAllergiesAndAdverseReactionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportPastMedicalHistory() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportPastMedicalHistoryTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportPastMedicalHistory",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PAST_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PatientCareReportOperations.validatePatientCareReportPastMedicalHistory(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportPastMedicalHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportSocialHistory() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportSocialHistoryTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportSocialHistory",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_SOCIAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PatientCareReportOperations.validatePatientCareReportSocialHistory(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportSocialHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportPhysicalAssessmentSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportPhysicalAssessmentSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportPhysicalAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PHYSICAL_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* PhysicalAssessmentSection */
				PhysicalAssessmentSection section =

				EmspcrFactory.eINSTANCE.createPhysicalAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportPhysicalAssessmentSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportPhysicalAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportMedicationsAdministeredSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportMedicationsAdministeredSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportMedicationsAdministeredSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* MedicationsAdministeredSection */
				MedicationsAdministeredSection section =

				EmspcrFactory.eINSTANCE.createMedicationsAdministeredSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportMedicationsAdministeredSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportMedicationsAdministeredSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportProceduresPerformedSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportProceduresPerformedSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportProceduresPerformedSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PROCEDURES_PERFORMED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* ProceduresPerformedSection */
				ProceduresPerformedSection section =

				EmspcrFactory.eINSTANCE.createProceduresPerformedSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportProceduresPerformedSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportProceduresPerformedSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportPatientCareNarrative() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportPatientCareNarrativeTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportPatientCareNarrative",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PATIENT_CARE_NARRATIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PatientCareReportOperations.validatePatientCareReportPatientCareNarrative(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportPatientCareNarrativeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
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

				/* SceneSection */
				SceneSection section =

				EmspcrFactory.eINSTANCE.createSceneSection().init();

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
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportComponentOf() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportComponentOfTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	public void testValidatePatientCareReportDispatchSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportDispatchSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportDispatchSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_DISPATCH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* DispatchSection */
				DispatchSection section =

				EmspcrFactory.eINSTANCE.createDispatchSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportDispatchSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportDispatchSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportDispositionSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportDispositionSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportDispositionSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* DispositionSection */
				DispositionSection section =

				EmspcrFactory.eINSTANCE.createDispositionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportDispositionSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportDispositionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportPersonnelAdverseEventSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportPersonnelAdverseEventSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportPersonnelAdverseEventSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PERSONNEL_ADVERSE_EVENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* PersonnelAdverseEventSection */
				PersonnelAdverseEventSection section =

				EmspcrFactory.eINSTANCE.createPersonnelAdverseEventSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportPersonnelAdverseEventSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportPersonnelAdverseEventSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportProtocolSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportProtocolSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportProtocolSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_PROTOCOL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* ProtocolSection */
				ProtocolSection section =

				EmspcrFactory.eINSTANCE.createProtocolSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportProtocolSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportProtocolSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportResponseSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportResponseSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportResponseSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_RESPONSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* ResponseSection */
				ResponseSection section =

				EmspcrFactory.eINSTANCE.createResponseSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportResponseSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportResponseSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportSituationSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportSituationSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportSituationSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_SITUATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* SituationSection */
				SituationSection section =

				EmspcrFactory.eINSTANCE.createSituationSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportSituationSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportSituationSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
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
	* @generated
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

				EmspcrFactory.eINSTANCE.createVitalSignsSection().init();

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
	* @generated
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
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportCustodian() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportCustodianTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportCustodian",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated
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
	* @generated
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
	* @generated
	*/
	@Test
	public void testValidatePatientCareReportInjuryIncidentDescriptionSection() {
		OperationsTestCase<PatientCareReport> validatePatientCareReportInjuryIncidentDescriptionSectionTestCase = new OperationsTestCase<PatientCareReport>(
			"validatePatientCareReportInjuryIncidentDescriptionSection",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CARE_REPORT_INJURY_INCIDENT_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientCareReport target) {

			}

			@Override
			protected void updateToPass(PatientCareReport target) {
				target.init();

				/* InjuryIncidentDescriptionSection */
				InjuryIncidentDescriptionSection section =

				EmspcrFactory.eINSTANCE.createInjuryIncidentDescriptionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientCareReportOperations.validatePatientCareReportInjuryIncidentDescriptionSection(
					(PatientCareReport) objectToTest, diagnostician, map);
			}

		};

		validatePatientCareReportInjuryIncidentDescriptionSectionTestCase.doValidationTest();
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
	public void testGetCurrentMedication() {

		PatientCareReport target = objectFactory.create();
		target.getCurrentMedication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCardiacArrestEvent() {

		PatientCareReport target = objectFactory.create();
		target.getCardiacArrestEvent();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectives() {

		PatientCareReport target = objectFactory.create();
		target.getAdvanceDirectives();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesAndAdverseReactionsSection() {

		PatientCareReport target = objectFactory.create();
		target.getAllergiesAndAdverseReactionsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPastMedicalHistory() {

		PatientCareReport target = objectFactory.create();
		target.getPastMedicalHistory();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistory() {

		PatientCareReport target = objectFactory.create();
		target.getSocialHistory();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalAssessmentSection() {

		PatientCareReport target = objectFactory.create();
		target.getPhysicalAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsAdministeredSection() {

		PatientCareReport target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresPerformedSection() {

		PatientCareReport target = objectFactory.create();
		target.getProceduresPerformedSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientCareNarrative() {

		PatientCareReport target = objectFactory.create();
		target.getPatientCareNarrative();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSceneSection() {

		PatientCareReport target = objectFactory.create();
		target.getSceneSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDispatchSection() {

		PatientCareReport target = objectFactory.create();
		target.getDispatchSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDispositionSection() {

		PatientCareReport target = objectFactory.create();
		target.getDispositionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPersonnelAdverseEventSection() {

		PatientCareReport target = objectFactory.create();
		target.getPersonnelAdverseEventSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProtocolSection() {

		PatientCareReport target = objectFactory.create();
		target.getProtocolSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResponseSection() {

		PatientCareReport target = objectFactory.create();
		target.getResponseSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSituationSection() {

		PatientCareReport target = objectFactory.create();
		target.getSituationSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetTimesSection() {

		PatientCareReport target = objectFactory.create();
		target.getTimesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		PatientCareReport target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInjuryIncidentDescriptionSection() {

		PatientCareReport target = objectFactory.create();
		target.getInjuryIncidentDescriptionSection();

	}

	/**
	*
	* @generated
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
