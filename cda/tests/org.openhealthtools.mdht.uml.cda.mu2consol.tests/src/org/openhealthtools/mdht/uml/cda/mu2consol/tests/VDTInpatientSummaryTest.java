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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTInpatientSummaryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Inpatient Summary</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Effective Time</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Location</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Chief Complaint Or Reason For Visit</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Section</em>}
 * </li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Section
 * Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Summarymu2consol Hospital Admission Diagnosis
 * Section Hospital Admission Diagnosis</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalDischargeInstructionsSection()
 * <em>Get Hospital Discharge Instructions Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalAdmissionDiagnosisSection()
 * <em>Get Hospital Admission Diagnosis Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getChiefComplaintSection()
 * <em>Get Chief Complaint Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getReasonForVisitSection()
 * <em>Get Reason For Visit Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getChiefComplaintAndReasonForVisitSection()
 * <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class VDTInpatientSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientSummaryEffectiveTime() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryEffectiveTimeTestCase = new OperationsTestCase<VDTInpatientSummary>(
				"validateVDTInpatientSummaryEffectiveTime",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations
						.validateVDTInpatientSummaryEffectiveTime(
								(VDTInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientSummaryEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientSummaryLocation() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryLocationTestCase = new OperationsTestCase<VDTInpatientSummary>(
				"validateVDTInpatientSummaryLocation",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations
						.validateVDTInpatientSummaryLocation(
								(VDTInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientSummaryLocationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientSummaryChiefComplaintOrReasonForVisit() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryChiefComplaintOrReasonForVisitTestCase = new OperationsTestCase<VDTInpatientSummary>(
				"validateVDTInpatientSummaryChiefComplaintOrReasonForVisit",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations
						.validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(
								(VDTInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientSummaryChiefComplaintOrReasonForVisitTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalDischargeInstructionsSection() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<VDTInpatientSummary>(
				"validateVDTInpatientSummaryHospitalDischargeInstructionsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
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

				return VDTInpatientSummaryOperations
						.validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
								(VDTInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalDischargeInstructionsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalAdmissionDiagnosisSection() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTestCase = new OperationsTestCase<VDTInpatientSummary>(
				"validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

				/* HospitalAdmissionDiagnosisSection */
				HospitalAdmissionDiagnosisSection section =

				Mu2consolFactory.eINSTANCE
						.createHospitalAdmissionDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations
						.validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(
								(VDTInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<VDTInpatientSummary>(
				"validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations
						.validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateId(
								(VDTInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase = new OperationsTestCase<VDTInpatientSummary>(
				"validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARYMU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations
						.validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
								(VDTInpatientSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientSummarymu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalAdmissionDiagnosisSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getHospitalAdmissionDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetChiefComplaintSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetReasonForVisitSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends VDTInpatientSummaryOperations {
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
			TestObjectFactory<VDTInpatientSummary> {
		@Override
		public VDTInpatientSummary create() {
			return Mu2consolFactory.eINSTANCE.createVDTInpatientSummary();
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
			VDTInpatientSummaryOperations {
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

} // VDTInpatientSummaryOperations