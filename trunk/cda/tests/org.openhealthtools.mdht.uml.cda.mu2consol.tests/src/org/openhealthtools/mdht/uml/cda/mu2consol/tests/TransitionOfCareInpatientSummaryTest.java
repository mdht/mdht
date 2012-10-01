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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareInpatientSummaryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

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
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Admission
 * Diagnosis Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Discharge
 * Diagnoses Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Postoperative Diagnosis
 * Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Postprocedure Diagnosis
 * Entry</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Discharge
 * Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareInpatientSummary#validateTransitionOfCareInpatientSummaryHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Transition Of Care Inpatient Summary Hospital Discharge
 * Medications Section</em>}</li>
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
	 * @generated NOT
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
				HospitalAdmissionDiagnosisSection hSection = ConsolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosisSection().init();
				target.addSection(hSection);
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
	public void testValidateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntryTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				target.init();
				HospitalAdmissionDiagnosisSection aSection = ConsolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosisSection().init();
				target.addSection(aSection);
				// HospitalAdmissionDiagnosis section =
				// ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis().init();
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				HospitalAdmissionDiagnosis act = ConsolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosis().init();
				target.getHospitalAdmissionDiagnosisSection().addAct(act);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntry(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalAdmissionDiagnosisEntryTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntryTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSES_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				target.init();
				HospitalDischargeDiagnosisSection aSection = ConsolFactory.eINSTANCE
						.createHospitalDischargeDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				HospitalDischargeDiagnosis act = ConsolFactory.eINSTANCE
						.createHospitalDischargeDiagnosis().init();
				target.getHospitalDischargeDiagnosisSection().addAct(act);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntry(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryHospitalDischargeDiagnosesEntryTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntryTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_POSTOPERATIVE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				target.init();
				PostoperativeDiagnosisSection aSection = ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				ProblemObservation obs = ConsolFactory.eINSTANCE.createProblemObservation().init();
				target.getPostoperativeDiagnosisSection().addObservation(obs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntry(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryPostoperativeDiagnosisEntryTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry() {
		OperationsTestCase<TransitionOfCareInpatientSummary> validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntryTestCase = new OperationsTestCase<TransitionOfCareInpatientSummary>(
				"validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry",
				operationsForOCL
						.getOCLValue("VALIDATE_TRANSITION_OF_CARE_INPATIENT_SUMMARY_POSTPROCEDURE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareInpatientSummary target) {
				target.init();
				PostprocedureDiagnosisSection aSection = ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(TransitionOfCareInpatientSummary target) {
				ProblemObservation pObs = ConsolFactory.eINSTANCE.createProblemObservation().init();
				target.getPostprocedureDiagnosisSection().addObservation(pObs);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareInpatientSummaryOperations
						.validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntry(
								(TransitionOfCareInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateTransitionOfCareInpatientSummaryPostprocedureDiagnosisEntryTestCase
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