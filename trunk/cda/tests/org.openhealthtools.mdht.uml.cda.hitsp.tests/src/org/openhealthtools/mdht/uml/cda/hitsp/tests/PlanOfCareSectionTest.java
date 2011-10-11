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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.PlanOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Plan Of Care Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#validateHITSPPlanOfCareSectionProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Plan Of Care Section Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getMedication() <em>Get Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getImmunization() <em>Get Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getEncounter() <em>Get Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection#getProcedure() <em>Get Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPPlanOfCareSectionTemplateId() {
		OperationsTestCase<PlanOfCareSection> validateHITSPPlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validateHITSPPlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validateHITSPPlanOfCareSectionTemplateId(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPPlanOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPPlanOfCareSectionMedication() {
		OperationsTestCase<PlanOfCareSection> validateHITSPPlanOfCareSectionMedicationTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validateHITSPPlanOfCareSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PLAN_OF_CARE_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				Medication medication = HITSPFactory.eINSTANCE.createMedication().init();

				target.addSubstanceAdministration(medication);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validateHITSPPlanOfCareSectionMedication(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPPlanOfCareSectionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPPlanOfCareSectionImmunization() {
		OperationsTestCase<PlanOfCareSection> validateHITSPPlanOfCareSectionImmunizationTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validateHITSPPlanOfCareSectionImmunization",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PLAN_OF_CARE_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				Immunization immunization = HITSPFactory.eINSTANCE.createImmunization().init();

				target.addSubstanceAdministration(immunization);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validateHITSPPlanOfCareSectionImmunization(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPPlanOfCareSectionImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPPlanOfCareSectionEncounter() {
		OperationsTestCase<PlanOfCareSection> validateHITSPPlanOfCareSectionEncounterTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validateHITSPPlanOfCareSectionEncounter",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PLAN_OF_CARE_SECTION_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				Encounter encounter = HITSPFactory.eINSTANCE.createEncounter().init();
				target.addEncounter(encounter);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validateHITSPPlanOfCareSectionEncounter(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPPlanOfCareSectionEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPPlanOfCareSectionProcedure() {
		OperationsTestCase<PlanOfCareSection> validateHITSPPlanOfCareSectionProcedureTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validateHITSPPlanOfCareSectionProcedure",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PLAN_OF_CARE_SECTION_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				Procedure procedure = HITSPFactory.eINSTANCE.createProcedure().init();

				target.addProcedure(procedure);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validateHITSPPlanOfCareSectionProcedure(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPPlanOfCareSectionProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedication() {

		PlanOfCareSection target = objectFactory.create();
		target.getMedication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunization() {

		PlanOfCareSection target = objectFactory.create();
		target.getImmunization();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncounter() {

		PlanOfCareSection target = objectFactory.create();
		target.getEncounter();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedure() {

		PlanOfCareSection target = objectFactory.create();
		target.getProcedure();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PlanOfCareSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareSection> {

		public PlanOfCareSection create() {
			return HITSPFactory.eINSTANCE.createPlanOfCareSection();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends PlanOfCareSectionOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // PlanOfCareSectionOperations
