/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProcedureActivityActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Procedure Activity Act</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActPerformer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Performer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#validateProcedureActivityActPatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#getProblemAct() <em>Get Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityActTest extends CDAValidationTest {

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
	* @generated
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
	* @generated
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
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEncounterLocation() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEncounterLocationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEncounterLocation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProcedureActivityActOperations.validateProcedureActivityActEncounterLocation(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEncounterLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActPerformer2() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPerformer2TestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPerformer2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PERFORMER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProcedureActivityActOperations.validateProcedureActivityActPerformer2(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPerformer2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProblemAct() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProblemActTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProcedureActivityActOperations.validateProcedureActivityActProblemAct(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProblemActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProblemObservation() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProblemObservationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProcedureActivityActOperations.validateProcedureActivityActProblemObservation(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActAgeObservation() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActAgeObservationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProcedureActivityActOperations.validateProcedureActivityActAgeObservation(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
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
	public void testValidateProcedureActivityActPatientInstruction() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPatientInstructionTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPatientInstruction",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ProcedureActivityActOperations.validateProcedureActivityActPatientInstruction(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPatientInstructionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemAct() {

		ProcedureActivityAct target = objectFactory.create();
		target.getProblemAct();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation() {

		ProcedureActivityAct target = objectFactory.create();
		target.getProblemObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		ProcedureActivityAct target = objectFactory.create();
		target.getAgeObservation();

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
	@Test
	public void testGetPatientInstructions() {

		ProcedureActivityAct target = objectFactory.create();
		target.getPatientInstructions();

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
			return CCDFactory.eINSTANCE.createProcedureActivityAct();
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

} // ProcedureActivityActOperations
