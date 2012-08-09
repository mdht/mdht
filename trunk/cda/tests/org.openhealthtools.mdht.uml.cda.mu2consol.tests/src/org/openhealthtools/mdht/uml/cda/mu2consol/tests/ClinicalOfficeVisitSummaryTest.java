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

import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ClinicalOfficeVisitSummaryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Clinical Office Visit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Cannot Have Chief Complaint And
 * Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Mu2 Encounter Diagnoses
 * Requirements</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Can Have Either Required Or
 * Optional Vital Signs Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationListConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Clinical Office Visit Summary Medication List Constraint</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ClinicalOfficeVisitSummaryTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CANNOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* CannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection */

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryCannotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirementsTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MU2_ENCOUNTER_DIAGNOSES_REQUIREMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirements(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryMu2EncounterDiagnosesRequirementsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CAN_HAVE_EITHER_REQUIRED_OR_OPTIONAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSection(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryCanHaveEitherRequiredOrOptionalVitalSignsSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryMedicationListConstraint() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMedicationListConstraintTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateClinicalOfficeVisitSummaryMedicationListConstraint",
				operationsForOCL
						.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATION_LIST_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateClinicalOfficeVisitSummaryMedicationListConstraint(
								(ClinicalOfficeVisitSummary) objectToTest,
								diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryMedicationListConstraintTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
				"validateGeneralHeaderConstraintsTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations
						.validateGeneralHeaderConstraintsTemplateId(
								(ClinicalOfficeVisitSummary) objectToTest,
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
			ClinicalOfficeVisitSummaryOperations {
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
			TestObjectFactory<ClinicalOfficeVisitSummary> {
		@Override
		public ClinicalOfficeVisitSummary create() {
			return Mu2consolFactory.eINSTANCE
					.createClinicalOfficeVisitSummary();
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
			ClinicalOfficeVisitSummaryOperations {
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

} // ClinicalOfficeVisitSummaryOperations