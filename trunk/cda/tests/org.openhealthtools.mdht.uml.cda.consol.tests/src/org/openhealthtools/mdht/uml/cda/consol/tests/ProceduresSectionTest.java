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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionHasProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Has Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionProcedureActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Procedure Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getConsolProcedureActivityProcedures() <em>Get Consol Procedure Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getProcedureActivityObservations() <em>Get Procedure Activity Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#getConsolProcedureActivityActs() <em>Get Consol Procedure Activity Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSection#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSectionTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionHasProcedureActivity() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionHasProcedureActivityTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionHasProcedureActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_HAS_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionHasProcedureActivity(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionHasProcedureActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionTitle() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionTitleTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("Procedures");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionTitle(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionCodeP() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionCodePTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionCodeP(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionCode() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionCodeTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionCode(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionText() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionTextTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionText(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProceduresSectionProcedureActivityProcedure() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionProcedureActivityProcedureTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionProcedureActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionProcedureActivityProcedure(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProceduresSectionProcedureActivityObservation() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionProcedureActivityObservationTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionProcedureActivityObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionProcedureActivityObservation(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionProcedureActivityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProceduresSectionProcedureActivityAct() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionProcedureActivityActTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionProcedureActivityAct",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionProcedureActivityAct(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionProcedureActivityActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityProcedures() {

		ProceduresSection target = objectFactory.create();
		target.getConsolProcedureActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityObservations() {

		ProceduresSection target = objectFactory.create();
		target.getProcedureActivityObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolProcedureActivityActs() {

		ProceduresSection target = objectFactory.create();
		target.getConsolProcedureActivityActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSection> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSection>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSection target) {

			}

			@Override
			protected void updateToPass(ProceduresSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionOperations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSection> {
		public ProceduresSection create() {
			return ConsolFactory.eINSTANCE.createProceduresSection();
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
	private static class ConstructorTestClass extends ProceduresSectionOperations {
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

} // ProceduresSectionOperations
