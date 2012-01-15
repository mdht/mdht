/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteIndividual(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePrimaryCarePhysician(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Primary Care Physician</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComplicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePostprocedureDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureIndicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAnesthesiaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePlannedProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteIndividualTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProviderAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getComplicationsSection() <em>Get Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPostprocedureDiagnosisSection() <em>Get Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureIndicationsSection() <em>Get Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAnesthesiaSection() <em>Get Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicalHistorySection() <em>Get Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPlannedProcedureSection() <em>Get Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureFindingsSection() <em>Get Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteTemplateId() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteTemplateIdTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteTemplateId(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteIndividual() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteIndividualTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteIndividual",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_INDIVIDUAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteIndividual(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteIndividualTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComponentOf() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComponentOfTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComponentOf(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePrimaryCarePhysician() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePrimaryCarePhysicianTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePrimaryCarePhysician",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePrimaryCarePhysician(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePrimaryCarePhysicianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProvider() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProviderTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProvider",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProvider(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProviderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAssessmentSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAssessmentSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAssessmentSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePlanOfCareSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePlanOfCareSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePlanOfCareSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAssessmentAndPlanSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAssessmentAndPlanSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAssessmentAndPlanSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AssessmentAndPlanSection */
				AssessmentAndPlanSection section =

				ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAssessmentAndPlanSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAssessmentAndPlanSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteComplicationsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteComplicationsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteComplicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ComplicationsSection */
				ComplicationsSection section =

				ConsolFactory.eINSTANCE.createComplicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteComplicationsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteComplicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePostprocedureDiagnosisSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePostprocedureDiagnosisSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePostprocedureDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PostprocedureDiagnosisSection */
				PostprocedureDiagnosisSection section =

				ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePostprocedureDiagnosisSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePostprocedureDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureDescriptionSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureDescriptionSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureDescriptionSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureDescriptionSection */
				ProcedureDescriptionSection section =

				ConsolFactory.eINSTANCE.createProcedureDescriptionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureDescriptionSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureDescriptionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureIndicationsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureIndicationsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureIndicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureIndicationsSection */
				ProcedureIndicationsSection section =

				ConsolFactory.eINSTANCE.createProcedureIndicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureIndicationsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureIndicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAllergiesSectionEntriesOptional() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAllergiesSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAllergiesSectionEntriesOptional(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAllergiesSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteAnesthesiaSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteAnesthesiaSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteAnesthesiaSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* AnesthesiaSection */
				AnesthesiaSection section =

				ConsolFactory.eINSTANCE.createAnesthesiaSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteAnesthesiaSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteAnesthesiaSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteChiefComplaintSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteChiefComplaintSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteChiefComplaintSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteChiefComplaintAndReasonForVisitSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteFamilyHistorySection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteFamilyHistorySectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteFamilyHistorySection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteHistoryOfPastIllnessSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* HistoryOfPastIllnessSection */
				HistoryOfPastIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteHistoryOfPastIllnessSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteHistoryOfPastIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteHistoryOfPresentIllnessSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteHistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteHistoryOfPresentIllnessSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteHistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteMedicalHistorySection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteMedicalHistorySectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteMedicalHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* MedicalHistorySection */
				MedicalHistorySection section =

				ConsolFactory.eINSTANCE.createMedicalHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteMedicalHistorySection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteMedicalHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteMedicationsSectionEntriesOptional() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteMedicationsSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* MedicationsSectionEntriesOptional */
				MedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteMedicationsSectionEntriesOptional(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteMedicationsSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteMedicationsAdministeredSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteMedicationsAdministeredSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteMedicationsAdministeredSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* MedicationsAdministeredSection */
				MedicationsAdministeredSection section =

				ConsolFactory.eINSTANCE.createMedicationsAdministeredSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteMedicationsAdministeredSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteMedicationsAdministeredSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePhysicalExamSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePhysicalExamSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PhysicalExamSection */
				PhysicalExamSection section =

				ConsolFactory.eINSTANCE.createPhysicalExamSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePhysicalExamSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePhysicalExamSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNotePlannedProcedureSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNotePlannedProcedureSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNotePlannedProcedureSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* PlannedProcedureSection */
				PlannedProcedureSection section =

				ConsolFactory.eINSTANCE.createPlannedProcedureSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNotePlannedProcedureSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNotePlannedProcedureSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureDispositionSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureDispositionSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureDispositionSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureDispositionSection */
				ProcedureDispositionSection section =

				ConsolFactory.eINSTANCE.createProcedureDispositionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureDispositionSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureDispositionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureEstimatedBloodLossSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureEstimatedBloodLossSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureEstimatedBloodLossSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureEstimatedBloodLossSection */
				ProcedureEstimatedBloodLossSection section =

				ConsolFactory.eINSTANCE.createProcedureEstimatedBloodLossSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureEstimatedBloodLossSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureEstimatedBloodLossSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureFindingsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureFindingsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureFindingsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureFindingsSection */
				ProcedureFindingsSection section =

				ConsolFactory.eINSTANCE.createProcedureFindingsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureFindingsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureFindingsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureImplantsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureImplantsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureImplantsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureImplantsSection */
				ProcedureImplantsSection section =

				ConsolFactory.eINSTANCE.createProcedureImplantsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureImplantsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureImplantsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProcedureSpecimensTakenSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProcedureSpecimensTakenSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProcedureSpecimensTakenSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProcedureSpecimensTakenSection */
				ProcedureSpecimensTakenSection section =

				ConsolFactory.eINSTANCE.createProcedureSpecimensTakenSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProcedureSpecimensTakenSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProcedureSpecimensTakenSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProceduresSectionEntriesOptional() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProceduresSectionEntriesOptional",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ProceduresSectionEntriesOptional */
				ProceduresSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProceduresSectionEntriesOptional(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProceduresSectionEntriesOptionalTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteReasonForVisitSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteReasonForVisitSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteReviewOfSystemsSection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteReviewOfSystemsSectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteReviewOfSystemsSection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteSocialHistorySection() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteSocialHistorySectionTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteSocialHistorySection(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteIndividualTypeId() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteIndividualTypeIdTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteIndividualTypeId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_INDIVIDUAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteIndividualTypeId(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteIndividualTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNoteProviderAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ProcedureNote> validateProcedureNoteProviderAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ProcedureNote>(
			"validateProcedureNoteProviderAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateProcedureNoteProviderAssociatedEntityAssociatedPerson(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNoteProviderAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ProcedureNote target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ProcedureNote target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection() {

		ProcedureNote target = objectFactory.create();
		target.getAssessmentAndPlanSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplicationsSection() {

		ProcedureNote target = objectFactory.create();
		target.getComplicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPostprocedureDiagnosisSection() {

		ProcedureNote target = objectFactory.create();
		target.getPostprocedureDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDescriptionSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureDescriptionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureIndicationsSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureIndicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		ProcedureNote target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAnesthesiaSection() {

		ProcedureNote target = objectFactory.create();
		target.getAnesthesiaSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ProcedureNote target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		ProcedureNote target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ProcedureNote target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		ProcedureNote target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		ProcedureNote target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalHistorySection() {

		ProcedureNote target = objectFactory.create();
		target.getMedicalHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional() {

		ProcedureNote target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsAdministeredSection() {

		ProcedureNote target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection() {

		ProcedureNote target = objectFactory.create();
		target.getPhysicalExamSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedureSection() {

		ProcedureNote target = objectFactory.create();
		target.getPlannedProcedureSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDispositionSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureDispositionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEstimatedBloodLossSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureEstimatedBloodLossSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureFindingsSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureFindingsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureImplantsSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureImplantsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureSpecimensTakenSection() {

		ProcedureNote target = objectFactory.create();
		target.getProcedureSpecimensTakenSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional() {

		ProcedureNote target = objectFactory.create();
		target.getProceduresSectionEntriesOptional();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		ProcedureNote target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ProcedureNote target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		ProcedureNote target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ProcedureNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ProcedureNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote target) {

			}

			@Override
			protected void updateToPass(ProcedureNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNoteOperations.validateGeneralHeaderConstraintsCode(
					(ProcedureNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureNote> {
		public ProcedureNote create() {
			return ConsolFactory.eINSTANCE.createProcedureNote();
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
	private static class ConstructorTestClass extends ProcedureNoteOperations {
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

} // ProcedureNoteOperations
