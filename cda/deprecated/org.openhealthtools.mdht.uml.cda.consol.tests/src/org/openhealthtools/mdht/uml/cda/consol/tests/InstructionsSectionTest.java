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
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.InstructionsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instructions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#validateInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Section Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InstructionsSection#getInstructionss() <em>Get Instructionss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InstructionsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionTemplateId() {
		OperationsTestCase<InstructionsSection> validateInstructionsSectionTemplateIdTestCase = new OperationsTestCase<InstructionsSection>(
			"validateInstructionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {

			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations.validateInstructionsSectionTemplateId(
					(InstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionCode() {
		OperationsTestCase<InstructionsSection> validateInstructionsSectionCodeTestCase = new OperationsTestCase<InstructionsSection>(
			"validateInstructionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {

			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations.validateInstructionsSectionCode(
					(InstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionCodeP() {
		OperationsTestCase<InstructionsSection> validateInstructionsSectionCodePTestCase = new OperationsTestCase<InstructionsSection>(
			"validateInstructionsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {

			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations.validateInstructionsSectionCodeP(
					(InstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionText() {
		OperationsTestCase<InstructionsSection> validateInstructionsSectionTextTestCase = new OperationsTestCase<InstructionsSection>(
			"validateInstructionsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {

			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations.validateInstructionsSectionText(
					(InstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsSectionTitle() {
		OperationsTestCase<InstructionsSection> validateInstructionsSectionTitleTestCase = new OperationsTestCase<InstructionsSection>(
			"validateInstructionsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {

			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations.validateInstructionsSectionTitle(
					(InstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInstructionsSectionInstructions() {
		OperationsTestCase<InstructionsSection> validateInstructionsSectionInstructionsTestCase = new OperationsTestCase<InstructionsSection>(
			"validateInstructionsSectionInstructions",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.addAct(ConsolFactory.eINSTANCE.createInstructions().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations.validateInstructionsSectionInstructions(
					(InstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsSectionInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructionss() {

		InstructionsSection target = objectFactory.create();
		target.getInstructionss();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InstructionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InstructionsSection> {
		public InstructionsSection create() {
			return ConsolFactory.eINSTANCE.createInstructionsSection();
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
	private static class ConstructorTestClass extends InstructionsSectionOperations {
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

} // InstructionsSectionOperations
