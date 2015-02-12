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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureSpecimensTakenSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Specimens Taken Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection#validateProcedureSpecimensTakenSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Specimens Taken Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection#validateProcedureSpecimensTakenSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Specimens Taken Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection#validateProcedureSpecimensTakenSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Specimens Taken Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection#validateProcedureSpecimensTakenSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Specimens Taken Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection#validateProcedureSpecimensTakenSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Specimens Taken Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureSpecimensTakenSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSpecimensTakenSectionTemplateId() {
		OperationsTestCase<ProcedureSpecimensTakenSection> validateProcedureSpecimensTakenSectionTemplateIdTestCase = new OperationsTestCase<ProcedureSpecimensTakenSection>(
			"validateProcedureSpecimensTakenSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SPECIMENS_TAKEN_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSpecimensTakenSection target) {

			}

			@Override
			protected void updateToPass(ProcedureSpecimensTakenSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionTemplateId(
					(ProcedureSpecimensTakenSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSpecimensTakenSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSpecimensTakenSectionCode() {
		OperationsTestCase<ProcedureSpecimensTakenSection> validateProcedureSpecimensTakenSectionCodeTestCase = new OperationsTestCase<ProcedureSpecimensTakenSection>(
			"validateProcedureSpecimensTakenSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SPECIMENS_TAKEN_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSpecimensTakenSection target) {

			}

			@Override
			protected void updateToPass(ProcedureSpecimensTakenSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionCode(
					(ProcedureSpecimensTakenSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSpecimensTakenSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSpecimensTakenSectionCodeP() {
		OperationsTestCase<ProcedureSpecimensTakenSection> validateProcedureSpecimensTakenSectionCodePTestCase = new OperationsTestCase<ProcedureSpecimensTakenSection>(
			"validateProcedureSpecimensTakenSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SPECIMENS_TAKEN_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSpecimensTakenSection target) {

			}

			@Override
			protected void updateToPass(ProcedureSpecimensTakenSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionCodeP(
					(ProcedureSpecimensTakenSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSpecimensTakenSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSpecimensTakenSectionText() {
		OperationsTestCase<ProcedureSpecimensTakenSection> validateProcedureSpecimensTakenSectionTextTestCase = new OperationsTestCase<ProcedureSpecimensTakenSection>(
			"validateProcedureSpecimensTakenSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SPECIMENS_TAKEN_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSpecimensTakenSection target) {

			}

			@Override
			protected void updateToPass(ProcedureSpecimensTakenSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionText(
					(ProcedureSpecimensTakenSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSpecimensTakenSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureSpecimensTakenSectionTitle() {
		OperationsTestCase<ProcedureSpecimensTakenSection> validateProcedureSpecimensTakenSectionTitleTestCase = new OperationsTestCase<ProcedureSpecimensTakenSection>(
			"validateProcedureSpecimensTakenSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_SPECIMENS_TAKEN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureSpecimensTakenSection target) {

			}

			@Override
			protected void updateToPass(ProcedureSpecimensTakenSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureSpecimensTakenSectionOperations.validateProcedureSpecimensTakenSectionTitle(
					(ProcedureSpecimensTakenSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureSpecimensTakenSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureSpecimensTakenSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureSpecimensTakenSection> {
		public ProcedureSpecimensTakenSection create() {
			return ConsolFactory.eINSTANCE.createProcedureSpecimensTakenSection();
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
	private static class ConstructorTestClass extends ProcedureSpecimensTakenSectionOperations {
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

} // ProcedureSpecimensTakenSectionOperations
