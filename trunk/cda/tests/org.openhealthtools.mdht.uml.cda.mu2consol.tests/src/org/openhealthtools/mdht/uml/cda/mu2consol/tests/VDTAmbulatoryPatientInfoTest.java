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
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTAmbulatoryPatientInfoOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Ambulatory Patient Info</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Ambulatory Patient Info Cannot Have Chief Complaint And
 * Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Ambulatory Patient Info Mu2 Encounter Diagnoses Requirements
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Ambulatory Patient Info Can Have Either Required Or Optional
 * Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateVDTAmbulatoryPatientInfoMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate VDT Ambulatory Patient Info Medication List Constraint</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatoryPatientInfo#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class VDTAmbulatoryPatientInfoTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
				"validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations
						.validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
								(VDTAmbulatoryPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirementsTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
				"validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations
						.validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirements(
								(VDTAmbulatoryPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoMu2EncounterDiagnosesRequirementsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
				"validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations
						.validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSection(
								(VDTAmbulatoryPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateVDTAmbulatoryPatientInfoMedicationListConstraint() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateVDTAmbulatoryPatientInfoMedicationListConstraintTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
				"validateVDTAmbulatoryPatientInfoMedicationListConstraint",
				operationsForOCL
						.getOCLValue("VALIDATE_VDT_AMBULATORY_PATIENT_INFO_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations
						.validateVDTAmbulatoryPatientInfoMedicationListConstraint(
								(VDTAmbulatoryPatientInfo) objectToTest,
								diagnostician, map);
			}

		};

		validateVDTAmbulatoryPatientInfoMedicationListConstraintTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<VDTAmbulatoryPatientInfo> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<VDTAmbulatoryPatientInfo>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatoryPatientInfo target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatoryPatientInfo target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatoryPatientInfoOperations
						.validateGeneralHeaderConstraintsTemplateId(
								(VDTAmbulatoryPatientInfo) objectToTest,
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
			VDTAmbulatoryPatientInfoOperations {
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
			TestObjectFactory<VDTAmbulatoryPatientInfo> {
		@Override
		public VDTAmbulatoryPatientInfo create() {
			return Mu2consolFactory.eINSTANCE.createVDTAmbulatoryPatientInfo();
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
			VDTAmbulatoryPatientInfoOperations {
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

} // VDTAmbulatoryPatientInfoOperations