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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Chief Complaint Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryPreoperativeDiagnosisEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Preoperative Diagnosis Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalDischargeMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalAdmissionDiagnosisSection() <em>Get Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalDischargeMedicationsSection() <em>Get Hospital Discharge Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getPreoperativeDiagnosisSection() <em>Get Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VDTInpatientSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryEffectiveTime() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryEffectiveTimeTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {
				Component1 compOf = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter enCounter = CDAFactory.eINSTANCE.createEncompassingEncounter();
				compOf.setEncompassingEncounter(enCounter);
				target.setComponentOf(compOf);

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				IVL_TS effTime = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(effTime);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryEffectiveTime(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryLocation() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryLocationTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryLocation",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {
				Component1 comp1 = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter encounter = CDAFactory.eINSTANCE.createEncompassingEncounter();
				comp1.setEncompassingEncounter(encounter);
				target.setComponentOf(comp1);
			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				Location locn = CDAFactory.eINSTANCE.createLocation();
				target.getComponentOf().getEncompassingEncounter().setLocation(locn);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryLocation(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryLocationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryChiefComplaintOrReasonForVisit() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryChiefComplaintOrReasonForVisitTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryChiefComplaintOrReasonForVisit",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {
				target.init();
				ChiefComplaintSection ccSection = ConsolFactory.eINSTANCE.createChiefComplaintSection().init();
				ReasonForVisitSection rvsSection = ConsolFactory.eINSTANCE.createReasonForVisitSection().init();
				ChiefComplaintAndReasonForVisitSection ccRvsSection = ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();
				target.addSection(ccRvsSection);
				target.addSection(rvsSection);
				target.addSection(ccSection);
			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				Component2 comp2 = CDAFactory.eINSTANCE.createComponent2();
				target.setComponent(comp2);
				ChiefComplaintSection ccSection = ConsolFactory.eINSTANCE.createChiefComplaintSection().init();
				ReasonForVisitSection rvsSection = ConsolFactory.eINSTANCE.createReasonForVisitSection().init();
				target.addSection(rvsSection);
				target.addSection(ccSection);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryChiefComplaintOrReasonForVisit(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryChiefComplaintOrReasonForVisitTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntryTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {
				HospitalAdmissionDiagnosisSection aSection = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				HospitalAdmissionDiagnosis act = ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosis().init();
				target.getHospitalAdmissionDiagnosisSection().addAct(act);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntry(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalAdmissionDiagnosisEntryTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryPreoperativeDiagnosisEntry() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryPreoperativeDiagnosisEntryTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryPreoperativeDiagnosisEntry",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_PREOPERATIVE_DIAGNOSIS_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {
				PreoperativeDiagnosisSection aSection = ConsolFactory.eINSTANCE.createPreoperativeDiagnosisSection().init();
				target.addSection(aSection);
			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				PreoperativeDiagnosis act = ConsolFactory.eINSTANCE.createPreoperativeDiagnosis().init();
				target.getPreoperativeDiagnosisSection().addAct(act);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryPreoperativeDiagnosisEntry(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryPreoperativeDiagnosisEntryTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalDischargeInstructionsSection() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryHospitalDischargeInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalDischargeInstructionsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalAdmissionDiagnosisSection() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

				/* HospitalAdmissionDiagnosisSection */
				HospitalAdmissionDiagnosisSection section =

				ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalAdmissionDiagnosisSection(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalAdmissionDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalDischargeMedicationsSection() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalDischargeMedicationsSectionTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryHospitalDischargeMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

				/* HospitalDischargeMedicationsSection */
				HospitalDischargeMedicationsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalDischargeMedicationsSection(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalDischargeMedicationsSectionTestCase.doValidationTest();
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
	@Test
	public void testGetHospitalDischargeMedicationsSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPreoperativeDiagnosisSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getPreoperativeDiagnosisSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalAdmissionMedicationsSectionEntriesOptional() {

		VDTInpatientSummary target = objectFactory.create();
		target.getHospitalAdmissionMedicationsSectionEntriesOptional();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends VDTInpatientSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VDTInpatientSummary> {

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
	private static class ConstructorTestClass extends VDTInpatientSummaryOperations {
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
