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
import org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationCombinationMedicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Combination Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasDosing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Dosing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationDosingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dosing Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Description No Med Not Known</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationReasonClassMood(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reason Class Mood</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasProductEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Product Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasIntructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Intructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationProductStrength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationPreconditionReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Precondition Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasSupplyEntryInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Supply Entry Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Combination Medication Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationCombinationMedicationProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Combination Medication Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getnullReactionObservations() <em>Getnull Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getProductInstances() <em>Get Product Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getInternalReferences() <em>Get Internal References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getPatientMedicalInstructionss() <em>Get Patient Medical Instructionss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#getSupplyEntry() <em>Get Supply Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationCombinationMedication#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationCombinationMedicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationMoodCode() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationMoodCodeTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMoodCode(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantityTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantity(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasDoseQuantityOrRateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasConsents() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasConsentsTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasConsents",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasConsents(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasConsentsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationInformationSource() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationInformationSourceTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationInformationSource(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasPreconditionCriterion() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasPreconditionCriterionTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasPreconditionCriterion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasPreconditionCriterion(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasPreconditionCriterionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasReason() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasReasonTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasReason",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasReason(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasReasonProblem() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasReasonProblemTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasReasonProblem",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasReasonProblem(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasReasonProblemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasProduct() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasProductTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasProduct",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasProduct(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasDosing() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasDosingTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasDosing",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasDosing(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasDosingTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationDosingRelationship() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationDosingRelationshipTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationDosingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationDosingRelationship(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationDosingRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasDescriptionNoMedNotKnown() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasDescriptionNoMedNotKnownTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasDescriptionNoMedNotKnown(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasDescriptionNoMedNotKnownTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationReasonClassMood() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationReasonClassMoodTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationReasonClassMood",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationReasonClassMood(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationReasonClassMoodTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasProductEntry() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasProductEntryTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasProductEntry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasProductEntry(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasProductEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasIntructionsInversion() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasIntructionsInversionTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasIntructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasIntructionsInversion(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasIntructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationProductStrength() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationProductStrengthTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationProductStrength",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationProductStrength(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationProductStrengthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationProductName() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationProductNameTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationProductName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationProductName(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationProductNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationPreconditionReference() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationPreconditionReferenceTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationPreconditionReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationPreconditionReference(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationPreconditionReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasSupplyEntryInversion() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasSupplyEntryInversionTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasSupplyEntryInversion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasSupplyEntryInversion(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasSupplyEntryInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationHasFillNumber() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationHasFillNumberTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationHasFillNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationHasFillNumber(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationHasFillNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministrationTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministration(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationCombinationMedicationSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationId() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationIdTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationId(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationStatusCode() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationStatusCodeTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationStatusCode(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationEffectiveTime() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationEffectiveTimeTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationEffectiveTime(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationRouteCode() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationRouteCodeTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationRouteCode(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationApproachSiteCode() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationApproachSiteCodeTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationApproachSiteCode(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationDoseQuantity() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationDoseQuantityTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationDoseQuantity(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationRateQuantity() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationRateQuantityTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationRateQuantity(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationRateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationMaxDoseQuantity() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationMaxDoseQuantityTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationMaxDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMaxDoseQuantity(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationMaxDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationMedicationSeriesNumberObservation() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationMedicationSeriesNumberObservationTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationMedicationSeriesNumberObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMedicationSeriesNumberObservation(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationMedicationSeriesNumberObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationMedicationStatusObservation() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationMedicationStatusObservationTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationMedicationStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationMedicationStatusObservation(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationMedicationStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationReactionObservation() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationReactionObservationTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationReactionObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationReactionObservation(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCombinationMedicationProductInstance() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationCombinationMedicationProductInstanceTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationCombinationMedicationProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMBINATION_MEDICATION_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationCombinationMedicationProductInstance(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCombinationMedicationProductInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationSeriesNumberObservation() {

		MedicationCombinationMedication target = objectFactory.create();
		target.getMedicationSeriesNumberObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationStatusObservation() {

		MedicationCombinationMedication target = objectFactory.create();
		target.getMedicationStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetnullReactionObservations() {

		MedicationCombinationMedication target = objectFactory.create();
		target.getnullReactionObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProductInstances() {

		MedicationCombinationMedication target = objectFactory.create();
		target.getProductInstances();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInternalReferences() {

		MedicationCombinationMedication target = objectFactory.create();
		target.getInternalReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientMedicalInstructionss() {

		MedicationCombinationMedication target = objectFactory.create();
		target.getPatientMedicalInstructionss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSupplyEntry() {

		MedicationCombinationMedication target = objectFactory.create();
		target.getSupplyEntry();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityCode() {
		OperationsTestCase<MedicationCombinationMedication> validateMedicationActivityCodeTestCase = new OperationsTestCase<MedicationCombinationMedication>(
			"validateMedicationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationCombinationMedication target) {

			}

			@Override
			protected void updateToPass(MedicationCombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationCombinationMedicationOperations.validateMedicationActivityCode(
					(MedicationCombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationCombinationMedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationCombinationMedication> {
		public MedicationCombinationMedication create() {
			return ConsolFactory.eINSTANCE.createMedicationCombinationMedication();
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
	private static class ConstructorTestClass extends MedicationCombinationMedicationOperations {
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

} // MedicationCombinationMedicationOperations
