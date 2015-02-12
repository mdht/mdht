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
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteSurgicalProcedureSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note Surgical Procedure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection#validateOperativeNoteSurgicalProcedureSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OperativeNoteSurgicalProcedureSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteSurgicalProcedureSectionTemplateId() {
		OperationsTestCase<OperativeNoteSurgicalProcedureSection> validateOperativeNoteSurgicalProcedureSectionTemplateIdTestCase = new OperationsTestCase<OperativeNoteSurgicalProcedureSection>(
			"validateOperativeNoteSurgicalProcedureSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteSurgicalProcedureSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteSurgicalProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionTemplateId(
					(OperativeNoteSurgicalProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteSurgicalProcedureSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteSurgicalProcedureSectionCode() {
		OperationsTestCase<OperativeNoteSurgicalProcedureSection> validateOperativeNoteSurgicalProcedureSectionCodeTestCase = new OperationsTestCase<OperativeNoteSurgicalProcedureSection>(
			"validateOperativeNoteSurgicalProcedureSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteSurgicalProcedureSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteSurgicalProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionCode(
					(OperativeNoteSurgicalProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteSurgicalProcedureSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteSurgicalProcedureSectionCodeP() {
		OperationsTestCase<OperativeNoteSurgicalProcedureSection> validateOperativeNoteSurgicalProcedureSectionCodePTestCase = new OperationsTestCase<OperativeNoteSurgicalProcedureSection>(
			"validateOperativeNoteSurgicalProcedureSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteSurgicalProcedureSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteSurgicalProcedureSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionCodeP(
					(OperativeNoteSurgicalProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteSurgicalProcedureSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteSurgicalProcedureSectionText() {
		OperationsTestCase<OperativeNoteSurgicalProcedureSection> validateOperativeNoteSurgicalProcedureSectionTextTestCase = new OperationsTestCase<OperativeNoteSurgicalProcedureSection>(
			"validateOperativeNoteSurgicalProcedureSectionText",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteSurgicalProcedureSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteSurgicalProcedureSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionText(
					(OperativeNoteSurgicalProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteSurgicalProcedureSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteSurgicalProcedureSectionTitle() {
		OperationsTestCase<OperativeNoteSurgicalProcedureSection> validateOperativeNoteSurgicalProcedureSectionTitleTestCase = new OperationsTestCase<OperativeNoteSurgicalProcedureSection>(
			"validateOperativeNoteSurgicalProcedureSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteSurgicalProcedureSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteSurgicalProcedureSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionTitle(
					(OperativeNoteSurgicalProcedureSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteSurgicalProcedureSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OperativeNoteSurgicalProcedureSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OperativeNoteSurgicalProcedureSection> {
		public OperativeNoteSurgicalProcedureSection create() {
			return ConsolFactory.eINSTANCE.createOperativeNoteSurgicalProcedureSection();
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
	private static class ConstructorTestClass extends OperativeNoteSurgicalProcedureSectionOperations {
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

} // OperativeNoteSurgicalProcedureSectionOperations
