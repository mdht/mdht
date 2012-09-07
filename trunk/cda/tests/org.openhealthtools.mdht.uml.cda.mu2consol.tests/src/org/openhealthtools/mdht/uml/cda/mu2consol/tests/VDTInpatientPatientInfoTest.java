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
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTInpatientPatientInfoOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Inpatient Patient Info</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Responsible Party</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoMedicationList(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Medication List</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Can Have Either Vital Signs Requied
 * Or Optional Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Can Have Either Allergy Required Or
 * Optional Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Procedures Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Social History Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Infomu2consol Social History Section
 * Smoking Status Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Hospital Admission Medications
 * Section Entries Optional Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Infomu2consol Hospital Admission
 * Medications Section Entries Optional Admission Medication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section Care
 * Planning For Plan Of Care</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Infomu2consol Plan Of Care Section
 * Mu2consol Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Plan Of Care Section Template Id
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getSocialHistorySection()
 * <em>Get Social History Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getProblemSection()
 * <em>Get Problem Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getMedicationsSection()
 * <em>Get Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getHospitalAdmissionMedicationsSectionEntriesOptional()
 * <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getHospitalDischargeMedicationsSection()
 * <em>Get Hospital Discharge Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getAllergiesSection()
 * <em>Get Allergies Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getAllergiesSectionEntriesOptional()
 * <em>Get Allergies Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getResultsSection()
 * <em>Get Results Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getVitalSignsSection()
 * <em>Get Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getVitalSignsSectionEntriesOptional()
 * <em>Get Vital Signs Section Entries Optional</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getPlanOfCareSection()
 * <em>Get Plan Of Care Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#getProceduresSection()
 * <em>Get Procedures Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class VDTInpatientPatientInfoTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoResponsibleParty() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoResponsiblePartyTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoResponsibleParty",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoResponsibleParty(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoResponsiblePartyTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoMedicationList() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoMedicationListTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoMedicationList",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoMedicationList(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoMedicationListTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntryTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_VITAL_SIGNS_REQUIED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntry(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoCanHaveEitherVitalSignsRequiedOrOptionalEntryTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntryTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_ALLERGY_REQUIRED_OR_OPTIONAL_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntry(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoCanHaveEitherAllergyRequiredOrOptionalEntryTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoSocialHistorySection() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoSocialHistorySectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoSocialHistorySection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

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
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoSocialHistorySection(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoSocialHistorySectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoProblemSection() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoProblemSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoProblemSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoProblemSection(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoProblemSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoResultsSection() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoResultsSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoResultsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				ConsolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoResultsSection(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoResultsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoPlanOfCareSection() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoPlanOfCareSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoPlanOfCareSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

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
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoPlanOfCareSection(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoPlanOfCareSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoProceduresSection() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoProceduresSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoProceduresSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				ConsolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoProceduresSection(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoProceduresSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoSocialHistorySectionTemplateId() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoSocialHistorySectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoSocialHistorySectionTemplateId(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoSocialHistorySectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservationTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservation(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolSocialHistorySectionSmokingStatusObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFOMU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfomu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoPlanOfCareSectionTemplateId() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoPlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoPlanOfCareSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTInpatientPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientPatientInfoOperations
						.validateVDTInpatientPatientInfoPlanOfCareSectionTemplateId(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoPlanOfCareSectionTemplateIdTestCase
				.doValidationTest();
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
	public void testGetProceduresSection() {

		VDTInpatientPatientInfo target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			VDTInpatientPatientInfoOperations {
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
	 * @generated
	 */
	private static class ObjectFactory implements
			TestObjectFactory<VDTInpatientPatientInfo> {
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			VDTInpatientPatientInfoOperations {
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

} // VDTInpatientPatientInfoOperations
