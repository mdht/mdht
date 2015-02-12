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
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalProcedureAcivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Acivity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#validateProceduresSectionEntriesOptionalProcedureActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures Section Entries Optional Procedure Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#getProcedureActivityProcedures() <em>Get Procedure Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#getProcedureAcivityObservations() <em>Get Procedure Acivity Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional#getProcedureActivityActs() <em>Get Procedure Activity Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTemplateId() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalTemplateId(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCode() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalCodeTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalCode(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalCodeP() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalCodePTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalCodeP(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalTitle() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalTitleTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalTitle(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalText() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalTextTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();

				StrucDocText value = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalText(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityProcedure() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalProcedureActivityProcedureTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalProcedureActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();
				target.addProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureActivityProcedure(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureAcivityObservation() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalProcedureAcivityObservationTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalProcedureAcivityObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureAcivityObservation(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureAcivityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProceduresSectionEntriesOptionalProcedureActivityAct() {
		OperationsTestCase<ProceduresSectionEntriesOptional> validateProceduresSectionEntriesOptionalProcedureActivityActTestCase = new OperationsTestCase<ProceduresSectionEntriesOptional>(
			"validateProceduresSectionEntriesOptionalProcedureActivityAct",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_SECTION_ENTRIES_OPTIONAL_PROCEDURE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(ProceduresSectionEntriesOptional target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createProcedureActivityAct().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureActivityAct(
					(ProceduresSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateProceduresSectionEntriesOptionalProcedureActivityActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedures() {

		ProceduresSectionEntriesOptional target = objectFactory.create();
		target.getProcedureActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureAcivityObservations() {

		ProceduresSectionEntriesOptional target = objectFactory.create();
		target.getProcedureAcivityObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityActs() {

		ProceduresSectionEntriesOptional target = objectFactory.create();
		target.getProcedureActivityActs();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresSectionEntriesOptional> {
		public ProceduresSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional();
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
	private static class ConstructorTestClass extends ProceduresSectionEntriesOptionalOperations {
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

} // ProceduresSectionEntriesOptionalOperations
