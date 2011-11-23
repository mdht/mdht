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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureEntryProcedureActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Entry Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedurePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Has Inversion Ind For Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Internal Reference Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedureMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#validateProcedureEntryProcedureActivityProcedurePatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Procedure Activity Procedure Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getInternalReference() <em>Get Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getInternalReferenceReasons() <em>Get Internal Reference Reasons</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getProblemAct() <em>Get Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureEntryProcedureActivityProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureMoodCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureMoodCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureMoodCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureHasTextReference() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureHasTextReferenceTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasTextReference(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedurePriorityCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedurePriorityCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedurePriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedurePriorityCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedurePriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounterTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounter(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureHasInversionIndForEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureTemplateId(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureClassCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureClassCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureClassCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureId() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureIdTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureId(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureText() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureTextTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureText(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureEffectiveTime() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureEffectiveTimeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureEffectiveTime(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureApproachSiteCode() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureApproachSiteCodeTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureApproachSiteCode(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureInternalReference() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureInternalReferenceTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureInternalReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReference(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureInternalReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureInternalReferenceReason() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureInternalReferenceReasonTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureInternalReferenceReason",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureInternalReferenceReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureProblemObservation() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureProblemObservationTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureProblemObservation(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureProblemAct() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureProblemActTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureProblemAct(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureProblemActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureAgeObservation() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureAgeObservationTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureAgeObservation(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureMedicationActivity() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedureMedicationActivityTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureMedicationActivity(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedureMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryProcedureActivityProcedurePatientInstruction() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> validateProcedureEntryProcedureActivityProcedurePatientInstructionTestCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedurePatientInstruction",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedurePatientInstruction(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryProcedureActivityProcedurePatientInstructionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInternalReference() {

		ProcedureEntryProcedureActivityProcedure target = objectFactory.create();
		target.getInternalReference();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInternalReferenceReasons() {

		ProcedureEntryProcedureActivityProcedure target = objectFactory.create();
		target.getInternalReferenceReasons();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation() {

		ProcedureEntryProcedureActivityProcedure target = objectFactory.create();
		target.getProblemObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemAct() {

		ProcedureEntryProcedureActivityProcedure target = objectFactory.create();
		target.getProblemAct();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		ProcedureEntryProcedureActivityProcedure target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		ProcedureEntryProcedureActivityProcedure target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientInstructions() {

		ProcedureEntryProcedureActivityProcedure target = objectFactory.create();
		target.getPatientInstructions();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureEntryProcedureActivityProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureEntryProcedureActivityProcedure> {

		public ProcedureEntryProcedureActivityProcedure create() {
			return ConsolFactory.eINSTANCE.createProcedureEntryProcedureActivityProcedure();
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
	private static class ConstructorTestClass extends ProcedureEntryProcedureActivityProcedureOperations {
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

} // ProcedureEntryProcedureActivityProcedureOperations
