/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationConditionalDoseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Conditional Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasDosing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Dosing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseDosingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dosing Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Description No Med Not Known</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseReasonClassMood(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reason Class Mood</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasProductEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Product Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasIntructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Intructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseProductStrength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDosePreconditionReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Precondition Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasSupplyEntryInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Supply Entry Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Conditional Dosing Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationConditionalDoseProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Conditional Dose Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getnullReactionObservations() <em>Getnull Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getProductInstances() <em>Get Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getInternalReferences() <em>Get Internal References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getPatientMedicalInstructionss() <em>Get Patient Medical Instructionss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#getSupplyEntry() <em>Get Supply Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationConditionalDose#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationConditionalDoseTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseMoodCode() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseMoodCodeTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMoodCode(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasDoseQuantityOrRateQuantity() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasDoseQuantityOrRateQuantityTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasDoseQuantityOrRateQuantity(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasDoseQuantityOrRateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasConsents() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasConsentsTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasConsents",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasConsents(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasConsentsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseInformationSource() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseInformationSourceTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseInformationSource(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasPreconditionCriterion() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasPreconditionCriterionTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasPreconditionCriterion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasPreconditionCriterion(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasPreconditionCriterionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasReason() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasReasonTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasReason",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasReason(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasReasonProblem() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasReasonProblemTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasReasonProblem",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasReasonProblem(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasReasonProblemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasProduct() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasProductTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasProduct",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasProduct(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasDosing() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasDosingTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasDosing",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasDosing(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasDosingTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseDosingRelationship() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseDosingRelationshipTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseDosingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseDosingRelationship(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseDosingRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasDescriptionNoMedNotKnown() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasDescriptionNoMedNotKnownTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasDescriptionNoMedNotKnown",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasDescriptionNoMedNotKnown(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasDescriptionNoMedNotKnownTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseReasonClassMood() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseReasonClassMoodTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseReasonClassMood",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseReasonClassMood(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseReasonClassMoodTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasProductEntry() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasProductEntryTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasProductEntry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasProductEntry(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasProductEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasIntructionsInversion() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasIntructionsInversionTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasIntructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasIntructionsInversion(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasIntructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseProductStrength() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseProductStrengthTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseProductStrength",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseProductStrength(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseProductStrengthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseProductName() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseProductNameTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseProductName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseProductName(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseProductNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDosePreconditionReference() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDosePreconditionReferenceTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDosePreconditionReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDosePreconditionReference(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDosePreconditionReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasSupplyEntryInversion() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasSupplyEntryInversionTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasSupplyEntryInversion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasSupplyEntryInversion(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasSupplyEntryInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseHasFillNumber() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseHasFillNumberTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseHasFillNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseHasFillNumber(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseHasFillNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseConditionalDosingSubstanceAdministration() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseConditionalDosingSubstanceAdministrationTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseConditionalDosingSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_CONDITIONAL_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseConditionalDosingSubstanceAdministration(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseConditionalDosingSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseId() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseIdTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseId(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseStatusCode() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseStatusCodeTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseStatusCode(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseEffectiveTime() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseEffectiveTimeTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseEffectiveTime(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseRouteCode() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseRouteCodeTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseRouteCode(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseApproachSiteCode() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseApproachSiteCodeTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseApproachSiteCode(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseDoseQuantity() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseDoseQuantityTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseDoseQuantity(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseRateQuantity() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseRateQuantityTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseRateQuantity(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseRateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseMaxDoseQuantity() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseMaxDoseQuantityTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseMaxDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMaxDoseQuantity(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseMaxDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseMedicationSeriesNumberObservation() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseMedicationSeriesNumberObservationTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseMedicationSeriesNumberObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMedicationSeriesNumberObservation(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseMedicationSeriesNumberObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseMedicationStatusObservation() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseMedicationStatusObservationTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseMedicationStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseMedicationStatusObservation(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseMedicationStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseReactionObservation() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseReactionObservationTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseReactionObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseReactionObservation(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationConditionalDoseProductInstance() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationConditionalDoseProductInstanceTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationConditionalDoseProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CONDITIONAL_DOSE_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationConditionalDoseProductInstance(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationConditionalDoseProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationSeriesNumberObservation() {

		MedicationConditionalDose target = objectFactory.create();
		target.getMedicationSeriesNumberObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationStatusObservation() {

		MedicationConditionalDose target = objectFactory.create();
		target.getMedicationStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetnullReactionObservations() {

		MedicationConditionalDose target = objectFactory.create();
		target.getnullReactionObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProductInstances() {

		MedicationConditionalDose target = objectFactory.create();
		target.getProductInstances();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInternalReferences() {

		MedicationConditionalDose target = objectFactory.create();
		target.getInternalReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientMedicalInstructionss() {

		MedicationConditionalDose target = objectFactory.create();
		target.getPatientMedicalInstructionss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSupplyEntry() {

		MedicationConditionalDose target = objectFactory.create();
		target.getSupplyEntry();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityCode() {
		OperationsTestCase<MedicationConditionalDose> validateMedicationActivityCodeTestCase = new OperationsTestCase<MedicationConditionalDose>(
			"validateMedicationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationConditionalDose target) {

			}

			@Override
			protected void updateToPass(MedicationConditionalDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationConditionalDoseOperations.validateMedicationActivityCode(
					(MedicationConditionalDose) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationConditionalDoseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationConditionalDose> {
		public MedicationConditionalDose create() {
			return ConsolFactory.eINSTANCE.createMedicationConditionalDose();
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
	* @generated
	*/
	private static class ConstructorTestClass extends MedicationConditionalDoseOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
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

} // MedicationConditionalDoseOperations
