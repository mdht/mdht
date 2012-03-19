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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getProcedureEncounters() <em>Get Procedure Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityActTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCodeCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCodeCodeSystems(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActCodeOriginalText() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeOriginalTextTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCodeOriginalText(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActOriginalTextReferenceValue() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActOriginalTextReferenceValueTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ref.setValue("test");
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActOriginalTextReferenceValue(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActReferenceValue() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActReferenceValueTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActReferenceValue(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActEncounterInversion() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEncounterInversionTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEncounterInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				er.setEncounter(ConsolFactory.eINSTANCE.createProcedureEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setEncounter(ConsolFactory.eINSTANCE.createProcedureEncounter());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEncounterInversion(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEncounterInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				par.setTypeCode(ParticipationType.LOC);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocationTypeCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActInstructionsInversion() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActInstructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {

				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActInstructionsInversion(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActTemplateId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActTemplateIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActTemplateId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActClassCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActClassCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActClassCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActMoodCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActMoodCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActMoodCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActStatusCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActStatusCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				cs.setCodeSystem("2.16.840.1.113883.5.14");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActStatusCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEffectiveTime() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEffectiveTime(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActPriorityCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPriorityCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE();
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPriorityCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActPerformer() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPerformerTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPerformer(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActServiceDeliveryLocation() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActServiceDeliveryLocationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActServiceDeliveryLocation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActServiceDeliveryLocation(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActProcedureEncounter() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureEncounterTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(ConsolFactory.eINSTANCE.createProcedureEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureEncounter(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActInstructions() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActInstructionsTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActInstructions(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActIndication() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIndicationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActIndication(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityActMedicationActivity() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActMedicationActivity(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetServiceDeliveryLocations() {

		ProcedureActivityAct target = objectFactory.create();
		target.getServiceDeliveryLocations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEncounters() {

		ProcedureActivityAct target = objectFactory.create();
		target.getProcedureEncounters();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		ProcedureActivityAct target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureActivityAct target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity() {

		ProcedureActivityAct target = objectFactory.create();
		target.getMedicationActivity();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityAct> {
		public ProcedureActivityAct create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityAct();
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
	private static class ConstructorTestClass extends ProcedureActivityActOperations {
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

} // ProcedureActivityActOperations
