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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounters Activity</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityHasIndications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Has Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityHasPractitioners(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Has Practitioners</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityPractitionerRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Practitioner Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityPatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#validateEncountersActivityAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Activity Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#getAgeObservation() <em>Get Age Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncountersActivityTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersActivityHasIndications() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityHasIndicationsTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityHasIndications",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_HAS_INDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityHasIndications(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityHasIndicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersActivityHasPractitioners() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityHasPractitionersTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityHasPractitioners",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_HAS_PRACTITIONERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {
				// AFAICT There is no way to make this constraint fail
				// KP Sethi.
			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityHasPractitioners(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityHasPractitionersTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersActivityPractitionerRole() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityPractitionerRoleTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityPractitionerRole",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_PRACTITIONER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

				Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				performer.setAssignedEntity(ae);
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ae.setCode(ce);
				target.getPerformers().add(performer);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityPractitionerRole(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityPractitionerRoleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityTemplateId() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityTemplateIdTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityTemplateId(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityClassCode() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityClassCodeTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityClassCode(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityMoodCode() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityMoodCodeTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityMoodCode(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateEncountersActivityId() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityIdTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityId(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncountersActivityEffectiveTime() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityEffectiveTimeTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityEffectiveTime(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersActivityPatientInstruction() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityPatientInstructionTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityPatientInstruction",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();
				target.addAct(CCDFactory.eINSTANCE.createPatientInstruction());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityPatientInstruction(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityPatientInstructionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncountersActivityAgeObservation() {
		OperationsTestCase<EncountersActivity> validateEncountersActivityAgeObservationTestCase = new OperationsTestCase<EncountersActivity>(
			"validateEncountersActivityAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTERS_ACTIVITY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncountersActivity target) {

			}

			@Override
			protected void updateToPass(EncountersActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CCDFactory.eINSTANCE.createAgeObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncountersActivityOperations.validateEncountersActivityAgeObservation(
					(EncountersActivity) objectToTest, diagnostician, map);
			}

		};

		validateEncountersActivityAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientInstructions() {

		EncountersActivity target = objectFactory.create();
		target.getPatientInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		EncountersActivity target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EncountersActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncountersActivity> {
		public EncountersActivity create() {
			return CCDFactory.eINSTANCE.createEncountersActivity();
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
	private static class ConstructorTestClass extends EncountersActivityOperations {
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

} // EncountersActivityOperations
