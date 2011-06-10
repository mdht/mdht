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
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Problem Act</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActSubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemActTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActEntryRelationshipRequired() {
		OperationsTestCase<ProblemAct> validateProblemActEntryRelationshipRequiredTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActEntryRelationshipRequired",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActEntryRelationshipRequired(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActEntryRelationshipRequiredTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActSubjectOfTarget() {
		OperationsTestCase<ProblemAct> validateProblemActSubjectOfTargetTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActSubjectOfTarget",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActSubjectOfTarget(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActSubjectOfTargetTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActContainsProblemObservation() {
		OperationsTestCase<ProblemAct> validateProblemActContainsProblemObservationTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActContainsProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActContainsProblemObservation(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActContainsProblemObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActContainsAlertObservation() {
		OperationsTestCase<ProblemAct> validateProblemActContainsAlertObservationTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActContainsAlertObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActContainsAlertObservation(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActContainsAlertObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActContainsPatientAwareness() {
		OperationsTestCase<ProblemAct> validateProblemActContainsPatientAwarenessTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActContainsPatientAwareness",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActContainsPatientAwareness(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActContainsPatientAwarenessTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActTemplateId() {
		OperationsTestCase<ProblemAct> validateProblemActTemplateIdTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActTemplateId((ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActClassCode() {
		OperationsTestCase<ProblemAct> validateProblemActClassCodeTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActClassCode((ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActMoodCode() {
		OperationsTestCase<ProblemAct> validateProblemActMoodCodeTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActMoodCode((ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActId() {
		OperationsTestCase<ProblemAct> validateProblemActIdTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActId((ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActCodeNullFlavor() {
		OperationsTestCase<ProblemAct> validateProblemActCodeNullFlavorTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActCodeNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActCodeNullFlavor(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActCodeNullFlavorTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActEffectiveTime() {
		OperationsTestCase<ProblemAct> validateProblemActEffectiveTimeTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActEffectiveTime(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProblemActEpisodeObservation() {
		OperationsTestCase<ProblemAct> validateProblemActEpisodeObservationTestCase = new OperationsTestCase<ProblemAct>(
			"validateProblemActEpisodeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ACT_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemAct target) {

			}

			@Override
			protected void updateToPass(ProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemActOperations.validateProblemActEpisodeObservation(
					(ProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateProblemActEpisodeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEpisodeObservation() {

		ProblemAct target = objectFactory.create();
		target.getEpisodeObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProblemActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemAct> {
		public ProblemAct create() {
			return CCDFactory.eINSTANCE.createProblemAct();
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
	private static class ConstructorTestClass extends ProblemActOperations {
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

} // ProblemActOperations
