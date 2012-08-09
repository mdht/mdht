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

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
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
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Cannot Have Chief Complaint And
 * Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Mu2 Encounter Diagnoses Requirements
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Can Have Either Required Or Optional
 * Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateVDTInpatientPatientInfoMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Inpatient Patient Info Medication List Constraint</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientPatientInfo#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class VDTInpatientPatientInfoTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						.validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirementsTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						.validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirements(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoMu2EncounterDiagnosesRequirementsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test 
	public void testValidateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						.validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTInpatientPatientInfoMedicationListConstraint() {
		OperationsTestCase<VDTInpatientPatientInfo> validateVDTInpatientPatientInfoMedicationListConstraintTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateVDTInpatientPatientInfoMedicationListConstraint",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_INPATIENT_PATIENT_INFO_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						.validateVDTInpatientPatientInfoMedicationListConstraint(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTInpatientPatientInfoMedicationListConstraintTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<VDTInpatientPatientInfo> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<VDTInpatientPatientInfo>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						.validateGeneralHeaderConstraintsTemplateId(
								(VDTInpatientPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
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