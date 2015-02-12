/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivityEncounterOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter#validatePlanOfCareActivityEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivityEncounterTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterTemplateId() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
			"validatePlanOfCareActivityEncounterTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterTemplateId(
					(PlanOfCareActivityEncounter) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterClassCode() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterClassCodeTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
			"validatePlanOfCareActivityEncounterClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the class
				// code is non-null and of type ActClass but EMF and Java enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterClassCode(
					(PlanOfCareActivityEncounter) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterMoodCode() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterMoodCodeTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
			"validatePlanOfCareActivityEncounterMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// we cannot violate the constraint because it only checks that the mood
				// code is non-null and of type x_DocumentEncounterMood but EMF and Java
				// enforce this
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();
				target.setMoodCode(x_DocumentEncounterMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterMoodCode(
					(PlanOfCareActivityEncounter) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterId() {
		OperationsTestCase<PlanOfCareActivityEncounter> validatePlanOfCareActivityEncounterIdTestCase = new OperationsTestCase<PlanOfCareActivityEncounter>(
			"validatePlanOfCareActivityEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivityEncounter target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivityEncounter target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterId(
					(PlanOfCareActivityEncounter) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareActivityEncounterOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareActivityEncounter> {
		public PlanOfCareActivityEncounter create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareActivityEncounter();
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
	private static class ConstructorTestClass extends PlanOfCareActivityEncounterOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PlanOfCareActivityEncounterOperations
