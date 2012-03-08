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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocFactory;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consoltoc.operations.DischargeSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Discharge Summary</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Hospital Course Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Hospital Discharge Medications Section Entries
 * Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Problem Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryDischargeDietSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Discharge Diet Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Family History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary History Of Present Illness Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargePhysicalSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryHospitalDischargeStudiesSummarySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Hospital Discharge Studies Summary Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Procedures Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Review Of Systems Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateDischargeSummaryImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getAllergiesSectionEntriesOptional()
 * <em>Get Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalCourseSection()
 * <em>Get Hospital Course Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeDiagnosisSection()
 * <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeMedicationsSectionEntriesOptional()
 * <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getPlanOfCareSection()
 * <em>Get Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getProblemSectionEntriesOptional()
 * <em>Get Problem Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getChiefComplaintSection()
 * <em>Get Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getChiefComplaintAndReasonForVisitSection()
 * <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getDischargeDietSection()
 * <em>Get Discharge Diet Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getFamilyHistorySection()
 * <em>Get Family History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getFunctionalStatusSection()
 * <em>Get Functional Status Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHistoryOfPresentIllnessSection()
 * <em>Get History Of Present Illness Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargePhysicalSection()
 * <em>Get Hospital Discharge Physical Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getHospitalDischargeStudiesSummarySection()
 * <em>Get Hospital Discharge Studies Summary Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getProceduresSectionEntriesOptional()
 * <em>Get Procedures Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getReasonForVisitSection()
 * <em>Get Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getReviewOfSystemsSection()
 * <em>Get Review Of Systems Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getVitalSignsSectionEntriesOptional()
 * <em>Get Vital Signs Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#getImmunizationsSectionEntriesOptional()
 * <em>Get Immunizations Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
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
	public void testValidateDischargeSummaryAllergiesSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryAllergiesSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryAllergiesSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();
				/* AllergiesSectionEntriesOptional */
				AllergiesSectionEntriesOptional section =

				ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional()
						.init();
				target.addSection(section);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryAllergiesSectionEntriesOptional(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryAllergiesSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateDischargeSummaryHospitalCourseSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalCourseSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryHospitalCourseSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryHospitalCourseSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryHospitalCourseSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryHospitalDischargeDiagnosisSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeDiagnosisSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryHospitalDischargeDiagnosisSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeDiagnosisSection */
				HospitalDischargeDiagnosisSection section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryHospitalDischargeDiagnosisSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryHospitalDischargeDiagnosisSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeMedicationsSectionEntriesOptional */
				HospitalDischargeMedicationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeMedicationsSectionEntriesOptional()
						.init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryPlanOfCareSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryPlanOfCareSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryPlanOfCareSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryPlanOfCareSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryProblemSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryProblemSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryProblemSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ProblemSectionEntriesOptional */
				ProblemSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createProblemSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryProblemSectionEntriesOptional(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryProblemSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryChiefComplaintSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryChiefComplaintSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryChiefComplaintSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryChiefComplaintSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryChiefComplaintSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryChiefComplaintAndReasonForVisitSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE
						.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryChiefComplaintAndReasonForVisitSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryChiefComplaintAndReasonForVisitSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryDischargeDietSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryDischargeDietSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryDischargeDietSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* DischargeDietSection */
				DischargeDietSection section =

				ConsolFactory.eINSTANCE.createDischargeDietSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryDischargeDietSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryDischargeDietSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryFamilyHistorySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryFamilyHistorySectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryFamilyHistorySection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryFamilyHistorySection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryFunctionalStatusSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryFunctionalStatusSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryFunctionalStatusSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				ConsolFactory.eINSTANCE.createFunctionalStatusSection()
						.init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryFunctionalStatusSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryFunctionalStatusSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryHistoryOfPresentIllnessSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryHistoryOfPresentIllnessSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE
						.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryHistoryOfPresentIllnessSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryHistoryOfPresentIllnessSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryHospitalDischargePhysicalSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargePhysicalSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryHospitalDischargePhysicalSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargePhysicalSection */
				HospitalDischargePhysicalSection section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargePhysicalSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryHospitalDischargePhysicalSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryHospitalDischargePhysicalSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryHospitalDischargeStudiesSummarySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryHospitalDischargeStudiesSummarySectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryHospitalDischargeStudiesSummarySection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* HospitalDischargeStudiesSummarySection */
				HospitalDischargeStudiesSummarySection section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeStudiesSummarySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryHospitalDischargeStudiesSummarySection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryHospitalDischargeStudiesSummarySectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryProceduresSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryProceduresSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryProceduresSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ProceduresSectionEntriesOptional */
				ProceduresSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createProceduresSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryProceduresSectionEntriesOptional(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryProceduresSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryReasonForVisitSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryReasonForVisitSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryReasonForVisitSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryReasonForVisitSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryReasonForVisitSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryReviewOfSystemsSection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryReviewOfSystemsSectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryReviewOfSystemsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection()
						.init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryReviewOfSystemsSection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryReviewOfSystemsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummarySocialHistorySection() {
		OperationsTestCase<DischargeSummary> validateDischargeSummarySocialHistorySectionTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummarySocialHistorySection",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				ConsolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummarySocialHistorySection(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummarySocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryVitalSignsSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryVitalSignsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryVitalSignsSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* VitalSignsSectionEntriesOptional */
				VitalSignsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createVitalSignsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryVitalSignsSectionEntriesOptional(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryVitalSignsSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateDischargeSummaryImmunizationsSectionEntriesOptional() {
		OperationsTestCase<DischargeSummary> validateDischargeSummaryImmunizationsSectionEntriesOptionalTestCase = new OperationsTestCase<DischargeSummary>(
				"validateDischargeSummaryImmunizationsSectionEntriesOptional",
				operationsForOCL
						.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

				/* ImmunizationsSectionEntriesOptional */
				ImmunizationsSectionEntriesOptional section =

				ConsolFactory.eINSTANCE
						.createImmunizationsSectionEntriesOptional().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateDischargeSummaryImmunizationsSectionEntriesOptional(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateDischargeSummaryImmunizationsSectionEntriesOptionalTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetAllergiesSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetHospitalCourseSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalCourseSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetHospitalDischargeDiagnosisSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeDiagnosisSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetHospitalDischargeMedicationsSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeMedicationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetPlanOfCareSection() {

		DischargeSummary target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetProblemSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getProblemSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetChiefComplaintSection() {

		DischargeSummary target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		DischargeSummary target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetDischargeDietSection() {

		DischargeSummary target = objectFactory.create();
		target.getDischargeDietSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetFamilyHistorySection() {

		DischargeSummary target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetFunctionalStatusSection() {

		DischargeSummary target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		DischargeSummary target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetHospitalDischargePhysicalSection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargePhysicalSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetHospitalDischargeStudiesSummarySection() {

		DischargeSummary target = objectFactory.create();
		target.getHospitalDischargeStudiesSummarySection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetProceduresSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getProceduresSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetReasonForVisitSection() {

		DischargeSummary target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetReviewOfSystemsSection() {

		DischargeSummary target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetSocialHistorySection() {

		DischargeSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetVitalSignsSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testGetImmunizationsSectionEntriesOptional() {

		DischargeSummary target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeSummary>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummaryOperations
						.validateGeneralHeaderConstraintsTemplateId(
								(DischargeSummary) objectToTest, diagnostician,
								map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	private static class OperationsForOCL extends DischargeSummaryOperations {
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
	 * @generated NOT
	 */
	private static class ObjectFactory implements
			TestObjectFactory<DischargeSummary> {
		@Override
		public DischargeSummary create() {
			return ConsoltocFactory.eINSTANCE.createDischargeSummary();
		}
	}

	/**
	 * 
	 * @generated NOT
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
			DischargeSummaryOperations {
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

} // DischargeSummaryOperations