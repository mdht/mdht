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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityComments(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRefusalReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Refusal Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getDrugVehicle() <em>Get Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getIndication() <em>Get Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getMedicationDispense() <em>Get Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getReactionObservation() <em>Get Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getImmunizationRefusalReason() <em>Get Immunization Refusal Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityMoodCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMoodCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMoodCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityHasDoseQuantityOrRateQuantity() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityHasDoseQuantityOrRateQuantityTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityHasDoseQuantityOrRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityHasDoseQuantityOrRateQuantity(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityHasDoseQuantityOrRateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityHasConsents() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityHasConsentsTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityHasConsents",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityHasConsents(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityHasConsentsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityInformationSource() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityInformationSourceTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityInformationSource(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityHasPreconditionCriterion() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityHasPreconditionCriterionTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityHasPreconditionCriterion",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityHasPreconditionCriterion(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityHasPreconditionCriterionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityHasReason() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityHasReasonTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityHasReason",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityHasReason(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityHasReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityHasReasonProblem() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityHasReasonProblemTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityHasReasonProblem",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityHasReasonProblem(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityHasReasonProblemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityHasProduct() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityHasProductTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityHasProduct",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityHasProduct(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityHasProductTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityComments() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityCommentsTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityComments",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityComments(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityCommentsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityRefusalReason() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRefusalReasonTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRefusalReason",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRefusalReason(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRefusalReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityTemplateId() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTemplateIdTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityTemplateId(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityId() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityIdTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityId(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityStatusCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityStatusCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityStatusCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityEffectiveTime() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEffectiveTimeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				DatatypesFactory.eINSTANCE.createIVL_TS();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEffectiveTime(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityRouteCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRouteCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRouteCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityMaxDoseQuantity() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMaxDoseQuantityTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMaxDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMaxDoseQuantity(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMaxDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityDrugVehicle() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDrugVehicleTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDrugVehicle",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicle(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDrugVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityIndication() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityIndicationTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityIndication",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityIndication(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityInstructions() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityInstructionsTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityInstructions",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityInstructions(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityMedicationSupplyOrder() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMedicationSupplyOrderTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMedicationSupplyOrder",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMedicationSupplyOrder(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationSupplyOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityMedicationDispense() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMedicationDispenseTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMedicationDispense",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMedicationDispense(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationDispenseTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityReactionObservation() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityReactionObservationTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityReactionObservation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityReactionObservation(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDrugVehicle() {

		ImmunizationActivity target = objectFactory.create();
		target.getDrugVehicle();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication() {

		ImmunizationActivity target = objectFactory.create();
		target.getIndication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		ImmunizationActivity target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationSupplyOrder() {

		ImmunizationActivity target = objectFactory.create();
		target.getMedicationSupplyOrder();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationDispense() {

		ImmunizationActivity target = objectFactory.create();
		target.getMedicationDispense();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReactionObservation() {

		ImmunizationActivity target = objectFactory.create();
		target.getReactionObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationRefusalReason() {

		ImmunizationActivity target = objectFactory.create();
		target.getImmunizationRefusalReason();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationActivity> {

		public ImmunizationActivity create() {
			return ConsolFactory.eINSTANCE.createImmunizationActivity();
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
	private static class ConstructorTestClass extends ImmunizationActivityOperations {
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

} // ImmunizationActivityOperations
