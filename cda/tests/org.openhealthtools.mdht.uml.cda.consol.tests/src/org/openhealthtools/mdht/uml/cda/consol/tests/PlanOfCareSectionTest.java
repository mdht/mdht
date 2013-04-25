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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionPlanOfCareActivitySupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#validatePlanOfCareSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityActs() <em>Get Plan Of Care Activity Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityEncounters() <em>Get Plan Of Care Activity Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityObservations() <em>Get Plan Of Care Activity Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivityProcedures() <em>Get Plan Of Care Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySubstanceAdministrations() <em>Get Plan Of Care Activity Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getPlanOfCareActivitySupplies() <em>Get Plan Of Care Activity Supplies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection#getInstructionss() <em>Get Instructionss</em>}</li>
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
	public void testValidatePlanOfCareSectionTemplateId() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfCareSectionOperations.validatePlanOfCareSectionTemplateId(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCode() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionCodeTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfCareSectionOperations.validatePlanOfCareSectionCode(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCodeP() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionCodePTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfCareSectionOperations.validatePlanOfCareSectionCodeP(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionTitle() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTitleTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionTitle(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionText() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTextTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionText(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityAct() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityActTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityAct",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityAct ActivityAct = ConsolFactory.eINSTANCE.createPlanOfCareActivityAct().init();
				target.addAct(ActivityAct);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityAct(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityEncounter() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityEncounterTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityEncounter Actent = ConsolFactory.eINSTANCE.createPlanOfCareActivityEncounter().init();
				target.addEncounter(Actent);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityEncounter(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityObservation",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityObservation ActObs = ConsolFactory.eINSTANCE.createPlanOfCareActivityObservation().init();
				target.addObservation(ActObs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityObservation(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityProcedure() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivityProcedureTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivityProcedure ActProc = ConsolFactory.eINSTANCE.createPlanOfCareActivityProcedure().init();
				target.addProcedure(ActProc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivityProcedure(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivitySubstanceAdministration ActObs = ConsolFactory.eINSTANCE.createPlanOfCareActivitySubstanceAdministration().init();
				target.addSubstanceAdministration(ActObs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivitySupply() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionPlanOfCareActivitySupplyTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionPlanOfCareActivitySupply",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				PlanOfCareActivitySupply ActSupply = ConsolFactory.eINSTANCE.createPlanOfCareActivitySupply().init();
				target.addSupply(ActSupply);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionPlanOfCareActivitySupply(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySupplyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePlanOfCareSectionInstructions() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionInstructionsTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createInstructions().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionInstructions(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityActs() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityEncounters() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityEncounters();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityObservations() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityProcedures() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivitySubstanceAdministrations() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivitySubstanceAdministrations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivitySupplies() {

		PlanOfCareSection target = objectFactory.create();
		target.getPlanOfCareActivitySupplies();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructionss() {

		PlanOfCareSection target = objectFactory.create();
		target.getInstructionss();

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
			return ConsolFactory.eINSTANCE.createPlanOfCareSection();
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
	private static class ConstructorTestClass extends PlanOfCareSectionOperations {
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

} // PlanOfCareSectionOperations
