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
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareInpatientSummaryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Inpatient Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Inpatient Encounter
 * Diagnoses</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Discharge
 * Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Discharge
 * Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Admission
 * Diagnosis Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Mu2consol Hospital
 * Admission Diagnosis Section Hospital Admission Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Discharge
 * Diagnosis Section Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Mu2consol Hospital
 * Discharge Diagnosis Section Hospital Discharge Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#getHospitalDischargeInstructionsSection()
 * <em>Get Hospital Discharge Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#getHospitalDischargeMedicationsSection()
 * <em>Get Hospital Discharge Medications Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#getHospitalAdmissionDiagnosisSection()
 * <em>Get Hospital Admission Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#getHospitalDischargeDiagnosisSection()
 * <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class TransitionOfCareInpatientSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnosesTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_INPATIENT_ENCOUNTER_DIAGNOSES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				target.init();
				HospitalAdmissionDiagnosisSection aSection  = Mu2consolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
				target.addSection(aSection);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnoses(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryInpatientEncounterDiagnosesTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSectionTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				target.init();

				/* HospitalDischargeMedicationsSection */
				HospitalDischargeMedicationsSection section =

				ConsolFactory.eINSTANCE
						.createHospitalDischargeMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				HospitalAdmissionDiagnosisSection aSection = Mu2consolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
				for(II ii : aSection.getTemplateIds()){
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				HospitalAdmissionDiagnosisSection aSection = Mu2consolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
				II iiTemp = aSection.getTemplateIds().get(0);
				for(II ii : target.getHospitalAdmissionDiagnosisSection().getTemplateIds()){
					ii.setRoot(iiTemp.getRoot());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				HospitalAdmissionDiagnosisSection aSection = Mu2consolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				HospitalAdmissionDiagnosis act = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis().init();
				target.getHospitalAdmissionDiagnosisSection().addAct(act);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				HospitalDischargeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
				for(II ii : aSection.getTemplateIds()){
					ii.setRoot(BAD_TEMPLATE_ID);
				}
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				HospitalDischargeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
				II iiTemp = aSection.getTemplateIds().get(0);
				
				for(II ii: target.getHospitalDischargeDiagnosisSection().getTemplateIds()){
					ii.setRoot(iiTemp.getRoot());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateId(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_MU2CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				HospitalDischargeDiagnosisSection aSection = Mu2consolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				HospitalDischargeDiagnosis act = ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis().init();
				target.getHospitalDischargeDiagnosisSection().addAct(act);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryMu2consolHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		TransitionOfCareInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeMedicationsSection() {

		TransitionOfCareInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalAdmissionDiagnosisSection() {

		TransitionOfCareInpatientSummary target = objectFactory.create();
		target.getHospitalAdmissionDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeDiagnosisSection() {

		TransitionOfCareInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			TransitionOfCareInpatientSummaryOperations {
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
			TestObjectFactory<TransitionOfCareInpatientSummary> {
		@Override
		public TransitionOfCareInpatientSummary create() {
			return Mu2consolFactory.eINSTANCE
					.createTransitionOfCareInpatientSummary();
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
			TransitionOfCareInpatientSummaryOperations {
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

} // TransitionOfCareInpatientSummaryOperations