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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityImmunizationRefusalReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Immunization Refusal Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getDrugVehicle() <em>Get Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getIndication() <em>Get Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getNonMedicinalSupplyActivity() <em>Get Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getMedicationDispense() <em>Get Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getReactionObservation() <em>Get Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getImmunizationRefusalReason() <em>Get Immunization Refusal Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
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
	public void testValidateImmunizationActivityClassCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityClassCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityClassCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityClassCodeTestCase.doValidationTest();
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
	* @generated not
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
	public void testValidateImmunizationActivityApproachSiteCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityApproachSiteCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityDoseQuantity() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDoseQuantityTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantity(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityNegationInd() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityNegationIndTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityNegationInd(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityText() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTextTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityText(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityRepeatNumber() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRepeatNumberTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityRepeatNumber(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodeTestCase.doValidationTest();
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
	public void testValidateImmunizationActivityNonMedicinalSupplyActivity() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityNonMedicinalSupplyActivityTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityNonMedicinalSupplyActivity(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityNonMedicinalSupplyActivityTestCase.doValidationTest();
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
	public void testValidateImmunizationActivityImmunizationRefusalReason() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityImmunizationRefusalReasonTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityImmunizationRefusalReason",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ImmunizationActivityOperations.validateImmunizationActivityImmunizationRefusalReason(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityImmunizationRefusalReasonTestCase.doValidationTest();
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
	public void testGetNonMedicinalSupplyActivity() {

		ImmunizationActivity target = objectFactory.create();
		target.getNonMedicinalSupplyActivity();

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
	@Test
	public void testGetMedicationSupplyOrder() {

		ImmunizationActivity target = objectFactory.create();
		target.getMedicationSupplyOrder();

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
