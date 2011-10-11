/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.tests;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.cdt.tests.HospitalDischargeStudiesSummarySectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.AllergiesReactionsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ChiefComplaintSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.DischargeDiagnosisSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.FamilyHistorySectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.FunctionalStatusSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.HistoryOfPresentIllnessTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.HospitalCourseSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.HospitalDischargeMedicationsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ImmunizationsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.PlanOfCareSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ProblemListSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.ReviewOfSystemsSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.SocialHistorySectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.SurgeriesSectionTest;
import org.openhealthtools.mdht.uml.cda.hitsp.tests.VitalSignsSectionTest;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiet;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargePhysical;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.tests.HospitalDischargePhysicalTest;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.toc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCFactory;
import org.openhealthtools.mdht.uml.cda.toc.operations.DischargeSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryAllergiesReactionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryProblemListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryHospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryDischargeDiet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryHospitalDischargePhysical(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryHospitalDischargeStudiesSummarySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummarySurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateDischargeSummaryVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getAllergiesReactionsSection() <em>Get Allergies Reactions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getProblemListSection() <em>Get Problem List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getDischargeDiagnosisSection() <em>Get Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getDischargeDiet() <em>Get Discharge Diet</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getHospitalDischargePhysical() <em>Get Hospital Discharge Physical</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getHospitalDischargeStudiesSummarySection() <em>Get Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getSurgeriesSection() <em>Get Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
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
				AllergiesReactionsSection section =

				HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryAllergiesReactionsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryAllergiesReactionsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(AllergiesReactionsSectionTest.class);

		assertTrue(AllergiesReactionsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryProblemListSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryProblemListSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryProblemListSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PROBLEM_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ProblemListSection */
				ProblemListSection section =

				HITSPFactory.eINSTANCE.createProblemListSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryProblemListSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryProblemListSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ProblemListSectionTest.class);

		assertTrue(ProblemListSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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

				HITSPFactory.eINSTANCE.createHospitalCourseSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalCourseSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalCourseSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(HospitalCourseSectionTest.class);

		assertTrue(HospitalCourseSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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

				HITSPFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeMedicationsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargeMedicationsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(HospitalDischargeMedicationsSectionTest.class);

		assertTrue(HospitalDischargeMedicationsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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

				HITSPFactory.eINSTANCE.createDischargeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryDischargeDiagnosisSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryDischargeDiagnosisSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(DischargeDiagnosisSectionTest.class);

		assertTrue(DischargeDiagnosisSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryPlanOfCareSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryPlanOfCareSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				HITSPFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryPlanOfCareSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryPlanOfCareSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(PlanOfCareSectionTest.class);

		assertTrue(PlanOfCareSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryChiefComplaintSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryChiefComplaintSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				HITSPFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryChiefComplaintSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryChiefComplaintSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ChiefComplaintSectionTest.class);

		assertTrue(ChiefComplaintSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated NOT
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

				DischargeDiet dischargeDiet = IHEFactory.eINSTANCE.createDischargeDiet().init();

				target.addSection(dischargeDiet);

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
	public void testValidateDischargeSummaryFamilyHistorySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryFamilyHistorySectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				HITSPFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryFamilyHistorySection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryFamilyHistorySectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(FamilyHistorySectionTest.class);

		assertTrue(FamilyHistorySectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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

				HITSPFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryFunctionalStatusSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryFunctionalStatusSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(FunctionalStatusSectionTest.class);

		assertTrue(FunctionalStatusSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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

				HistoryOfPresentIllness historyOfPresentIllness = HITSPFactory.eINSTANCE.createHistoryOfPresentIllness().init();

				target.addSection(historyOfPresentIllness);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPresentIllness(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHistoryOfPresentIllnessTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(HistoryOfPresentIllnessTest.class);

		assertTrue(HistoryOfPresentIllnessTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargePhysical() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargePhysicalTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargePhysical",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				HospitalDischargePhysical hospitalDischargePhysical = IHEFactory.eINSTANCE.createHospitalDischargePhysical().init();

				target.addSection(hospitalDischargePhysical);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargePhysical(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargePhysicalTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(HospitalDischargePhysicalTest.class);

		assertTrue(HospitalDischargePhysicalTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryHospitalDischargeStudiesSummarySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeStudiesSummarySectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryHospitalDischargeStudiesSummarySection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeStudiesSummarySection */
				HospitalDischargeStudiesSummarySection section =

				CDTFactory.eINSTANCE.createHospitalDischargeStudiesSummarySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeStudiesSummarySection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryHospitalDischargeStudiesSummarySectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(HospitalDischargeStudiesSummarySectionTest.class);

		assertTrue(
			HospitalDischargeStudiesSummarySectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummaryImmunizationsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryImmunizationsSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummaryImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				HITSPFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryImmunizationsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryImmunizationsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ImmunizationsSectionTest.class);

		assertTrue(ImmunizationsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummarySurgeriesSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummarySurgeriesSectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummarySurgeriesSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* SurgeriesSection */
				SurgeriesSection section =

				HITSPFactory.eINSTANCE.createSurgeriesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummarySurgeriesSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummarySurgeriesSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(SurgeriesSectionTest.class);

		assertTrue(SurgeriesSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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

				HITSPFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryReviewOfSystemsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryReviewOfSystemsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(ReviewOfSystemsSectionTest.class);

		assertTrue(ReviewOfSystemsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummarySocialHistorySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummarySocialHistorySectionTestCase = new OperationsTestCase<DischargeSummary>(
			"validateDischargeSummarySocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				HITSPFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummarySocialHistorySection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummarySocialHistorySectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(SocialHistorySectionTest.class);

		assertTrue(SocialHistorySectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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

				HITSPFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations.validateDischargeSummaryVitalSignsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummaryVitalSignsSectionTestCase.doValidationTest();

		Result result = JUnitCore.runClasses(VitalSignsSectionTest.class);

		assertTrue(VitalSignsSectionTest.class.getName() + " Failed", result.getFailures().isEmpty());

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
	public void testGetProblemListSection() {

		DischargeSummary target = objectFactory.create();
		target.getProblemListSection();

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
	public void testGetHospitalDischargeMedicationsSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeMedicationsSection();

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
	public void testGetPlanOfCareSection() {

		DischargeSummary target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		DischargeSummary target = objectFactory.create();
		target.getChiefComplaintSection();

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
	public void testGetFamilyHistorySection() {

		DischargeSummary target = objectFactory.create();
		target.getFamilyHistorySection();

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
	public void testGetHospitalDischargePhysical() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargePhysical();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeStudiesSummarySection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeStudiesSummarySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		DischargeSummary target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSurgeriesSection() {

		DischargeSummary target = objectFactory.create();
		target.getSurgeriesSection();

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
	public void testGetSocialHistorySection() {

		DischargeSummary target = objectFactory.create();
		target.getSocialHistorySection();

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
			return ToCFactory.eINSTANCE.createDischargeSummary();
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
