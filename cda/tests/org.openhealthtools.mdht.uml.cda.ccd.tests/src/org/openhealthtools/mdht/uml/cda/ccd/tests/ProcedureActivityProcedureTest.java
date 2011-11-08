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
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProcedureActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Procedure Activity Procedure</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedurePatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getProblemAct() <em>Get Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
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
	public void testGetMedicationActivities() {

		ProcedureActivityProcedure target = objectFactory.create();
		target.getMedicationActivities();

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
			return CCDFactory.eINSTANCE.createProcedureActivityProcedure();
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

} // ProcedureActivityProcedureOperations
