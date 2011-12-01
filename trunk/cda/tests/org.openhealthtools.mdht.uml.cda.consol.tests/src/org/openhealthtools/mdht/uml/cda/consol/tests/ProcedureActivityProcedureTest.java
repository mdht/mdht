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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedureOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedurePriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedureMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#validateProcedureActivityProcedurePatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getProblemAct() <em>Get Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTemplateId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureClassCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureClassCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureClassCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureMoodCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureMoodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMoodCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureText() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTextTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureText(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureStatusCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureStatusCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureStatusCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureEffectiveTime() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureEffectiveTime(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedurePriorityCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedurePriorityCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedurePriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePriorityCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureMethodCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureMethodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMethodCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTargetSiteCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTargetSiteCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureIndication() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureIndicationTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureIndication(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureProblemObservation() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProblemObservationTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProblemObservation(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureProblemAct() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureProblemActTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureProblemAct(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureProblemActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureAgeObservation() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureAgeObservationTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureAgeObservation(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureMedicationActivity() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureMedicationActivity(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedurePatientInstruction() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedurePatientInstructionTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedurePatientInstruction",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedurePatientInstruction(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePatientInstructionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getProblemObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemAct() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getProblemAct();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getMedicationActivity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientInstructions() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getPatientInstructions();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityProcedure> {
		public ProcedureActivityProcedure create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityProcedure();
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
	private static class ConstructorTestClass extends ProcedureActivityProcedureOperations {
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

} // ProcedureActivityProcedureOperations
