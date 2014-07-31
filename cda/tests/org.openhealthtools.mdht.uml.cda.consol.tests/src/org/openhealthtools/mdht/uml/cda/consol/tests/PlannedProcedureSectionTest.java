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
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedProcedureSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Procedure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#validatePlannedProcedureSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Procedure Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection#getPlanOfCareActivityProcedures() <em>Get Plan Of Care Activity Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedProcedureSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionTemplateId() {
		OperationsTestCase<PlannedProcedureSection> validatePlannedProcedureSectionTemplateIdTestCase = new OperationsTestCase<PlannedProcedureSection>(
			"validatePlannedProcedureSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSectionOperations.validatePlannedProcedureSectionTemplateId(
					(PlannedProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionCode() {
		OperationsTestCase<PlannedProcedureSection> validatePlannedProcedureSectionCodeTestCase = new OperationsTestCase<PlannedProcedureSection>(
			"validatePlannedProcedureSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSectionOperations.validatePlannedProcedureSectionCode(
					(PlannedProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionCodeP() {
		OperationsTestCase<PlannedProcedureSection> validatePlannedProcedureSectionCodePTestCase = new OperationsTestCase<PlannedProcedureSection>(
			"validatePlannedProcedureSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSectionOperations.validatePlannedProcedureSectionCodeP(
					(PlannedProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionText() {
		OperationsTestCase<PlannedProcedureSection> validatePlannedProcedureSectionTextTestCase = new OperationsTestCase<PlannedProcedureSection>(
			"validatePlannedProcedureSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSectionOperations.validatePlannedProcedureSectionText(
					(PlannedProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedProcedureSectionTitle() {
		OperationsTestCase<PlannedProcedureSection> validatePlannedProcedureSectionTitleTestCase = new OperationsTestCase<PlannedProcedureSection>(
			"validatePlannedProcedureSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection target) {

			}

			@Override
			protected void updateToPass(PlannedProcedureSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSectionOperations.validatePlannedProcedureSectionTitle(
					(PlannedProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePlannedProcedureSectionPlanOfCareActivityProcedure() {
		OperationsTestCase<PlannedProcedureSection> validatePlannedProcedureSectionPlanOfCareActivityProcedureTestCase = new OperationsTestCase<PlannedProcedureSection>(
			"validatePlannedProcedureSectionPlanOfCareActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_PROCEDURE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedProcedureSection target) {
				target.init();

			}

			@Override
			protected void updateToPass(PlannedProcedureSection target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createPlanOfCareActivityProcedure().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedProcedureSectionOperations.validatePlannedProcedureSectionPlanOfCareActivityProcedure(
					(PlannedProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validatePlannedProcedureSectionPlanOfCareActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareActivityProcedures() {

		PlannedProcedureSection target = objectFactory.create();
		target.getPlanOfCareActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedProcedureSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedProcedureSection> {
		public PlannedProcedureSection create() {
			return ConsolFactory.eINSTANCE.createPlannedProcedureSection();
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
	private static class ConstructorTestClass extends PlannedProcedureSectionOperations {
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

} // PlannedProcedureSectionOperations
