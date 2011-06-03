/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medication Activity</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityPatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityProductInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Product Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getReactionObservations() <em>Get Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getProductInstances() <em>Get Product Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationActivityTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityMoodCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityMoodCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityMoodCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityHasDoseQuantityOrRateQuantity() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityHasDoseQuantityOrRateQuantityTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityHasDoseQuantityOrRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityHasDoseQuantityOrRateQuantity(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityHasDoseQuantityOrRateQuantityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityHasConsents() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityHasConsentsTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityHasConsents",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityHasConsents(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityHasConsentsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityInformationSource() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityInformationSourceTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityInformationSource(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityInformationSourceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityHasPreconditionCriterion() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityHasPreconditionCriterionTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityHasPreconditionCriterion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityHasPreconditionCriterion(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityHasPreconditionCriterionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityHasReason() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityHasReasonTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityHasReason",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityHasReason(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityHasReasonTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityHasReasonProblem() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityHasReasonProblemTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityHasReasonProblem",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityHasReasonProblem(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityHasReasonProblemTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityHasProduct() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityHasProductTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityHasProduct",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityHasProduct(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityHasProductTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityTemplateId() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityTemplateIdTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityTemplateId(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityId() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityIdTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityId(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityStatusCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityStatusCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityStatusCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationActivityEffectiveTime() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityEffectiveTimeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(ts);
				// target.setEffectiveTime(ts );

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityEffectiveTime(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityMaxDoseQuantity() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityMaxDoseQuantityTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityMaxDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityMaxDoseQuantity(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMaxDoseQuantityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityRouteCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityRouteCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityRouteCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRouteCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityDoseQuantity() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityDoseQuantityTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityDoseQuantity(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDoseQuantityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityRateQuantity() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityRateQuantityTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityRateQuantity(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRateQuantityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityMedicationSeriesNumberObservation() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityMedicationSeriesNumberObservationTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityMedicationSeriesNumberObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityMedicationSeriesNumberObservation(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationSeriesNumberObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityMedicationStatusObservation() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityMedicationStatusObservationTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityMedicationStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityMedicationStatusObservation(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationStatusObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityPatientInstruction() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityPatientInstructionTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityPatientInstruction",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityPatientInstruction(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPatientInstructionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityReactionObservation() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityReactionObservationTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityReactionObservation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityReactionObservation(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityReactionObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationActivityProductInstance() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityProductInstanceTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityProductInstance",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PRODUCT_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityProductInstance(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityProductInstanceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends MedicationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationActivity> {
		public MedicationActivity create() {
			return CCDFactory.eINSTANCE.createMedicationActivity();
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
	private static class ConstructorTestClass extends MedicationActivityOperations {
	}

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

} // MedicationActivityOperations
