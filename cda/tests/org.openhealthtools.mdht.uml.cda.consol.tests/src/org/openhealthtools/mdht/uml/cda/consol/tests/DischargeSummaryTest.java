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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalSummaryProblemConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Problem Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalSummaryAllergyConcernEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Allergy Concern Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAdmissionMedicationHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Admission Medication History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalAdmissionDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDischargeDiet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryPhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAdmissionMedicationHistorySection() <em>Get Admission Medication History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalAdmissionDiagnosisSection() <em>Get Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getDischargeDiagnosisSection() <em>Get Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getDischargeDiet() <em>Get Discharge Diet</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryMedicalSummaryProblemConcernEntry() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryMedicalSummaryProblemConcernEntryTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryMedicalSummaryProblemConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryMedicalSummaryProblemConcernEntry(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryMedicalSummaryProblemConcernEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryMedicalSummaryAllergyConcernEntry() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryMedicalSummaryAllergyConcernEntryTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryMedicalSummaryAllergyConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryMedicalSummaryAllergyConcernEntry(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryMedicalSummaryAllergyConcernEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryMedicalSummaryMedications() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryMedicalSummaryMedicationsTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryMedicalSummaryMedications",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryMedicalSummaryMedications(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryMedicalSummaryMedicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryAdmissionMedicationHistorySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryAdmissionMedicationHistorySectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryAdmissionMedicationHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_ADMISSION_MEDICATION_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* AdmissionMedicationHistorySection */
				AdmissionMedicationHistorySection section =

				ConsolFactory.eINSTANCE.createAdmissionMedicationHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryAdmissionMedicationHistorySection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryAdmissionMedicationHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalAdmissionDiagnosisSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalAdmissionDiagnosisSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalAdmissionDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalAdmissionDiagnosisSection */
				HospitalAdmissionDiagnosisSection section =

				ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalAdmissionDiagnosisSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalAdmissionDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryAdvanceDirectivesSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryAdvanceDirectivesSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryAdvanceDirectivesSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* AdvanceDirectivesSection */
				AdvanceDirectivesSection section =

				ConsolFactory.eINSTANCE.createAdvanceDirectivesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryAdvanceDirectivesSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryAdvanceDirectivesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryAllergiesReactionsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryAllergiesReactionsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryAllergiesReactionsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_REACTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* AllergiesReactionsSection */
				// AllergiesReactionsSection section =
				//
				// ConsolFactory.eINSTANCE.createAllergiesReactionsSection().init();
				//
				//
				// target.addSection(section);
				//
				//

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryAllergiesReactionsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryAllergiesReactionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryDischargeDiagnosisSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryDischargeDiagnosisSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryDischargeDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* DischargeDiagnosisSection */
				DischargeDiagnosisSection section =

				ConsolFactory.eINSTANCE.createDischargeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryDischargeDiagnosisSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryDischargeDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryDischargeDiet() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryDischargeDietTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryDischargeDiet",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryDischargeDiet(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryDischargeDietTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargeMedicationsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeMedicationsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargeMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeMedicationsSection */
				HospitalDischargeMedicationsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeMedicationsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargeMedicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryFunctionalStatusSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryFunctionalStatusSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				ConsolFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryFunctionalStatusSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryFunctionalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHistoryOfPresentIllness() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHistoryOfPresentIllnessTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHistoryOfPresentIllness",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPresentIllness(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHistoryOfPresentIllnessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalCourseSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalCourseSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalCourseSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalCourseSection */
				HospitalCourseSection section =

				ConsolFactory.eINSTANCE.createHospitalCourseSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalCourseSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalCourseSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryMedicalEquipmentSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryMedicalEquipmentSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryMedicalEquipmentSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* MedicalEquipmentSection */
				MedicalEquipmentSection section =

				ConsolFactory.eINSTANCE.createMedicalEquipmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryMedicalEquipmentSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryMedicalEquipmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryPhysicalExamSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryPhysicalExamSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryPhysicalExamSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* PhysicalExamSection */
				PhysicalExamSection section =

				ConsolFactory.eINSTANCE.createPhysicalExamSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryPhysicalExamSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryPhysicalExamSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHistoryOfPastIllnessSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHistoryOfPastIllnessSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHistoryOfPastIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HistoryOfPastIllnessSection */
				HistoryOfPastIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPastIllnessSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHistoryOfPastIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryReviewOfSystemsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryReviewOfSystemsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryReviewOfSystemsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryMedicationsAdministeredSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryMedicationsAdministeredSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryMedicationsAdministeredSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* MedicationsAdministeredSection */
				MedicationsAdministeredSection section =

				ConsolFactory.eINSTANCE.createMedicationsAdministeredSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryMedicationsAdministeredSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryMedicationsAdministeredSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryVitalSignsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryVitalSignsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryVitalSignsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdmissionMedicationHistorySection() {

		DischargeSummary target = objectFactory.create();
		target.getAdmissionMedicationHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalAdmissionDiagnosisSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalAdmissionDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSection() {

		DischargeSummary target = objectFactory.create();
		target.getAdvanceDirectivesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesReactionsSection() {

		DischargeSummary target = objectFactory.create();
		target.getAllergiesReactionsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeDiagnosisSection() {

		DischargeSummary target = objectFactory.create();
		target.getDischargeDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeDiet() {

		DischargeSummary target = objectFactory.create();
		target.getDischargeDiet();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeMedicationsSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeMedicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection() {

		DischargeSummary target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllness() {

		DischargeSummary target = objectFactory.create();
		target.getHistoryOfPresentIllness();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalCourseSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalCourseSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection() {

		DischargeSummary target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection() {

		DischargeSummary target = objectFactory.create();
		target.getPhysicalExamSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection() {

		DischargeSummary target = objectFactory.create();
		target.getHistoryOfPastIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		DischargeSummary target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsAdministeredSection() {

		DischargeSummary target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		DischargeSummary target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeSummary>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<DischargeSummary> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<DischargeSummary>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateGeneralHeaderConstraintsCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeSummary> {

		public DischargeSummary create() {
			return ConsolFactory.eINSTANCE.createDischargeSummary();
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
	private static class ConstructorTestClass extends DischargeSummaryOperations {
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

} // DischargeSummaryOperations
