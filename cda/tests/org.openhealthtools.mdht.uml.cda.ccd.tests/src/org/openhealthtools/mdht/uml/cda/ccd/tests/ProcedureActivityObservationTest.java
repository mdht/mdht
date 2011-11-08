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
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProcedureActivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Procedure Activity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationPatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#validateProcedureActivityObservationProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Observation Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#getProblemObservation() <em>Get Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation#getProblemAct() <em>Get Problem Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProcedureActivityObservationTemplateId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationTemplateIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

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
	public void testValidateProcedureActivityObservationMoodCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationMoodCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationMoodCode(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationCode() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationCodeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
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
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationEffectiveTime() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

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
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationId() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationIdTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
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
	public void testValidateProcedureActivityObservationProblemObservation() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProblemObservationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProblemObservation(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationAgeObservation() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationAgeObservationTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationAgeObservation(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
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
	public void testValidateProcedureActivityObservationPatientInstruction() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationPatientInstructionTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationPatientInstruction",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationPatientInstruction(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationPatientInstructionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityObservationProblemAct() {
		OperationsTestCase<ProcedureActivityObservation> validateProcedureActivityObservationProblemActTestCase = new OperationsTestCase<ProcedureActivityObservation>(
			"validateProcedureActivityObservationProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_OBSERVATION_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityObservationOperations.validateProcedureActivityObservationProblemAct(
					(ProcedureActivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityObservationProblemActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservation() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getProblemObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientInstructions() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getPatientInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemAct() {

		ProcedureActivityObservation target = objectFactory.create();
		target.getProblemAct();

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
			return CCDFactory.eINSTANCE.createProcedureActivityObservation();
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

} // ProcedureActivityObservationOperations
