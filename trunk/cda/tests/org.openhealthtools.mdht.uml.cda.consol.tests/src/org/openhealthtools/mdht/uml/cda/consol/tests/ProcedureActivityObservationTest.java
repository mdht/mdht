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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEncounterInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Encounter Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationServiceDeliveryLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Service Delivery Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationProcedureEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Procedure Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#validateProcedureActivityObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getServiceDeliveryLocations() <em>Get Service Delivery Locations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getProcedureEncounters() <em>Get Procedure Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationCodeCodeSystems() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCodeCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeCodeSystems(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationCodeOriginalText() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeOriginalTextTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCodeOriginalText(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationOriginalTextReferenceValue() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationOriginalTextReferenceValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL();
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
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

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationOriginalTextReferenceValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationReferenceValue() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationReferenceValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationReferenceValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationReferenceValueTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationEncounterInversion() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEncounterInversionTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEncounterInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ENCOUNTER_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				er.setEncounter(ConsolFactory.eINSTANCE.createProcedureEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setEncounter(ConsolFactory.eINSTANCE.createProcedureEncounter());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEncounterInversion(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEncounterInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				par.setTypeCode(ParticipationType.LOC);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocationTypeCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationInstructionsInversion() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationInstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationInstructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructionsInversion(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationInstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationTemplateId() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTemplateIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTemplateId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationClassCode() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationClassCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationClassCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationClassCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationId() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
			
				II ii  = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationId(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationCode() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationStatusCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationStatusCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				cs.setCodeSystem("2.16.840.1.113883.5.14");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationStatusCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationValue() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationValueTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationValue(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationValueTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEffectiveTime() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationEffectiveTime(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationEffectiveTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationPriorityCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPriorityCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				CE pc = DatatypesFactory.eINSTANCE.createCE();
				target.setPriorityCode(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPriorityCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationMethodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMethodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMethodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationTargetSiteCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.getTargetSiteCodes().clear();
				CD tsc = DatatypesFactory.eINSTANCE.createCD();
				tsc.setCodeSystem("2.16.840.1.113883.6.96");
				tsc.setCode("test");
				target.getTargetSiteCodes().add(tsc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationTargetSiteCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationPerformer() {
			OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPerformerTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPerformer(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPerformerTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationServiceDeliveryLocation() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationServiceDeliveryLocationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationServiceDeliveryLocation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_SERVICE_DELIVERY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation());
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationServiceDeliveryLocation(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationServiceDeliveryLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationProcedureEncounter() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProcedureEncounterTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProcedureEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(ConsolFactory.eINSTANCE.createProcedureEncounter());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProcedureEncounter(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProcedureEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationInstructions() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationInstructionsTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationInstructions(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationIndication() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationIndicationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationIndication(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityObservationMedicationActivity() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMedicationActivity(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetServiceDeliveryLocations() {


ProcedureActivityObservation target = objectFactory.create();
target.getServiceDeliveryLocations();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEncounters() {


ProcedureActivityObservation target = objectFactory.create();
target.getProcedureEncounters();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {


ProcedureActivityObservation target = objectFactory.create();
target.getInstructions();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {


ProcedureActivityObservation target = objectFactory.create();
target.getIndications();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity() {


ProcedureActivityObservation target = objectFactory.create();
target.getMedicationActivity();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityObservation> {
		public ProcedureActivityObservation create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityObservation();
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
	private static class ConstructorTestClass extends ProcedureActivityObservationOperations {
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

} // ProcedureActivityObservationOperations
