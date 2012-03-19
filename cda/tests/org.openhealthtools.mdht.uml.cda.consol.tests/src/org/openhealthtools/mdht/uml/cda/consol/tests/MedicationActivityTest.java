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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantityorrateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantityorrate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimeIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityEffectiveTimePIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time PIVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDrugVehicleTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityInstructionsInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPreconditionSubstanceAdmTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition Substance Adm Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#validateMedicationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getMedicationSupplyOrders() <em>Get Medication Supply Orders</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getReactionObservation() <em>Get Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getMedicationDispense() <em>Get Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity#getDrugVehicles() <em>Get Drug Vehicles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityDoseQuantityorrateQuantity() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityDoseQuantityorrateQuantityTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityDoseQuantityorrateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITYORRATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.setRateQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityDoseQuantityorrateQuantity(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDoseQuantityorrateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityTextReference() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityTextReferenceTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityTextReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityTextReference(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimeIVLTS() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityEffectiveTimeIVLTSTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityEffectiveTimeIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityEffectiveTimeIVLTS(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimeIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityEffectiveTimePIVLTS() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityEffectiveTimePIVLTSTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityEffectiveTimePIVLTS",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME_PIVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createEIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityEffectiveTimePIVLTS(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityEffectiveTimePIVLTSTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityDoseQuantityUnit() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityDoseQuantityUnitTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityDoseQuantityUnit",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {
				target.init();
				IVL_PQ dq = DatatypesFactory.eINSTANCE.createIVL_PQ();
				dq.setUnit(null);
				target.setDoseQuantity(dq);
			}

			@Override
			protected void updateToPass(MedicationActivity target) {

				IVL_PQ dq = DatatypesFactory.eINSTANCE.createIVL_PQ();
				dq.setUnit("test");
				target.setDoseQuantity(dq);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityDoseQuantityUnit(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDoseQuantityUnitTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityDrugVehicleTypeCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityDrugVehicleTypeCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityDrugVehicleTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				p.setParticipantRole(ConsolFactory.eINSTANCE.createDrugVehicle());
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.getParticipants().clear();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				p.setParticipantRole(ConsolFactory.eINSTANCE.createDrugVehicle());
				p.setTypeCode(ParticipationType.CSM);
				target.getParticipants().add(p);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityDrugVehicleTypeCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDrugVehicleTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityInstructionsInversionInd() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityInstructionsInversionIndTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityInstructionsInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createInstructions());
			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityInstructionsInversionInd(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityInstructionsInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityPreconditionSubstanceAdmTypeCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityPreconditionSubstanceAdmTypeCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityPreconditionSubstanceAdmTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PRECONDITION_SUBSTANCE_ADM_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {
				target.init();
				PreconditionForSubstanceAdministration pc = ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
				pc.setTypeCode(ActRelationshipType.CAUS);
				target.getPreconditions().add(pc);

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.getPreconditions().clear();
				PreconditionForSubstanceAdministration pc = ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
				pc.setTypeCode(ActRelationshipType.PRCN);
				target.getPreconditions().add(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityPreconditionSubstanceAdmTypeCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionSubstanceAdmTypeCodeTestCase.doValidationTest();
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
	public void testValidateMedicationActivityClassCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityClassCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationActivityOperations.validateMedicationActivityClassCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityClassCodeTestCase.doValidationTest();
	}

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
	* @generated not
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
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

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
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityCodeTestCase.doValidationTest();
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
	* @generated not
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
				target.setRouteCode(DatatypesFactory.eINSTANCE.createCE("code", "codeSystem"));

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
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityApproachSiteCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityApproachSiteCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

				target.init();
				target.getApproachSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.getApproachSiteCodes().clear();
				target.getApproachSiteCodes().add(
					DatatypesFactory.eINSTANCE.createCD("code", "codeSystem", "codeSystemName", "displayName"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityApproachSiteCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
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
				target.setDoseQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());

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
	* @generated not
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
				target.setRateQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());

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
	* @generated not
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

				target.setMaxDoseQuantity(DatatypesFactory.eINSTANCE.createRTO_PQ_PQ());

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
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityAdministrationUnitCode() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.setAdministrationUnitCode(DatatypesFactory.eINSTANCE.createCE("code", "codeSystem"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityAdministrationUnitCode(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationActivityText() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityTextTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityText(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityRepeatNumber() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityRepeatNumberTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();

				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityRepeatNumber(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityMedicationSupplyOrder() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityMedicationSupplyOrderTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityMedicationSupplyOrder",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.init();
				target.addSupply(ConsolFactory.eINSTANCE.createMedicationSupplyOrder().init());
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityMedicationSupplyOrder(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationSupplyOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
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

				target.addObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				}

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
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityConsumable() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityConsumableTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityConsumable",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityConsumable(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityPerformer() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityPerformerTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityPerformer",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityPerformer(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityInstructions() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityInstructionsTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityInstructions",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				target.init();
				Instructions instruction = ConsolFactory.eINSTANCE.createInstructions().init();
				target.addAct(instruction);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityInstructions(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityIndication() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityIndicationTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityIndication",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {

				target.init();
				Indication indication = ConsolFactory.eINSTANCE.createIndication().init();
				target.addObservation(indication);
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityIndication(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityMedicationDispense() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityMedicationDispenseTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityMedicationDispense",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {

				target.init();
				MedicationDispense md = ConsolFactory.eINSTANCE.createMedicationDispense().init();
				target.addSupply(md);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityMedicationDispense(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityMedicationDispenseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityPrecondition() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityPreconditionTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityPrecondition",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				target.init();
				PreconditionForSubstanceAdministration pc = ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
				pc.setTypeCode(ActRelationshipType.PRCN);
				target.getPreconditions().add(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityPrecondition(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityPreconditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationActivityDrugVehicle() {
		OperationsTestCase<MedicationActivity> validateMedicationActivityDrugVehicleTestCase = new OperationsTestCase<MedicationActivity>(
			"validateMedicationActivityDrugVehicle",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationActivity target) {
				target.init();
				target.getParticipants().add(org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE.createParticipant2());

			}

			@Override
			protected void updateToPass(MedicationActivity target) {
				for (Participant2 p : target.getParticipants()) {
					p.setParticipantRole(ConsolFactory.eINSTANCE.createDrugVehicle().init());
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationActivityOperations.validateMedicationActivityDrugVehicle(
					(MedicationActivity) objectToTest, diagnostician, map);
			}

		};

		validateMedicationActivityDrugVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationSupplyOrders() {

		MedicationActivity target = objectFactory.create();
		target.getMedicationSupplyOrders();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReactionObservation() {

		MedicationActivity target = objectFactory.create();
		target.getReactionObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		MedicationActivity target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		MedicationActivity target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationDispense() {

		MedicationActivity target = objectFactory.create();
		target.getMedicationDispense();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDrugVehicles() {

		MedicationActivity target = objectFactory.create();
		target.getDrugVehicles();

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
			return ConsolFactory.eINSTANCE.createMedicationActivity();
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

} // MedicationActivityOperations
