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

import org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.CreateTransmitSummaryOfCareRecordOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Create Transmit Summary Of Care Record</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Cannot Have Chief
 * Complaint And Reason For Visit With Chief Complaint Section Or Reason Section
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Mu2 Encounter Diagnoses
 * Requirements</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Can Have Either Required
 * Or Optional Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Create Transmit Summary Of Care Record Medication List
 * Constraint</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.CreateTransmitSummaryOfCareRecord#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class CreateTransmitSummaryOfCareRecordTest extends CDAValidationTest {

	/**
	 * 
	 * @generated  NOT
	 */
	@Test
	public void testValidateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<CreateTransmitSummaryOfCareRecord> validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<CreateTransmitSummaryOfCareRecord>(
				"validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CreateTransmitSummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(CreateTransmitSummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CreateTransmitSummaryOfCareRecordOperations
						.validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
								(CreateTransmitSummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateCreateTransmitSummaryOfCareRecordCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements() {
		OperationsTestCase<CreateTransmitSummaryOfCareRecord> validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirementsTestCase = new OperationsTestCase<CreateTransmitSummaryOfCareRecord>(
				"validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements",
				operationsForOCL
						.getOCLValue("VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CreateTransmitSummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(CreateTransmitSummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CreateTransmitSummaryOfCareRecordOperations
						.validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirements(
								(CreateTransmitSummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateCreateTransmitSummaryOfCareRecordMu2EncounterDiagnosesRequirementsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection() {
		OperationsTestCase<CreateTransmitSummaryOfCareRecord> validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase = new OperationsTestCase<CreateTransmitSummaryOfCareRecord>(
				"validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CreateTransmitSummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(CreateTransmitSummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CreateTransmitSummaryOfCareRecordOperations
						.validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSection(
								(CreateTransmitSummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateCreateTransmitSummaryOfCareRecordCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateCreateTransmitSummaryOfCareRecordMedicationListConstraint() {
		OperationsTestCase<CreateTransmitSummaryOfCareRecord> validateCreateTransmitSummaryOfCareRecordMedicationListConstraintTestCase = new OperationsTestCase<CreateTransmitSummaryOfCareRecord>(
				"validateCreateTransmitSummaryOfCareRecordMedicationListConstraint",
				operationsForOCL
						.getOCLValue("VALIDATE_CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CreateTransmitSummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(CreateTransmitSummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CreateTransmitSummaryOfCareRecordOperations
						.validateCreateTransmitSummaryOfCareRecordMedicationListConstraint(
								(CreateTransmitSummaryOfCareRecord) objectToTest,
								diagnostician, map);
			}

		};

		validateCreateTransmitSummaryOfCareRecordMedicationListConstraintTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<CreateTransmitSummaryOfCareRecord> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<CreateTransmitSummaryOfCareRecord>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(CreateTransmitSummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(CreateTransmitSummaryOfCareRecord target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CreateTransmitSummaryOfCareRecordOperations
						.validateGeneralHeaderConstraintsTemplateId(
								(CreateTransmitSummaryOfCareRecord) objectToTest,
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
			CreateTransmitSummaryOfCareRecordOperations {
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
			TestObjectFactory<CreateTransmitSummaryOfCareRecord> {
		@Override
		public CreateTransmitSummaryOfCareRecord create() {
			return Mu2consolFactory.eINSTANCE
					.createCreateTransmitSummaryOfCareRecord();
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
			CreateTransmitSummaryOfCareRecordOperations {
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

} // CreateTransmitSummaryOfCareRecordOperations