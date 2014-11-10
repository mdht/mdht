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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.operations.InstructionsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Instructions#validateInstructionsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Instructions Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InstructionsTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInstructionsTextReference() {
		OperationsTestCase<Instructions> validateInstructionsTextReferenceTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsTextReference",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

				target.init();

				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(Instructions target) {

				target.getText().setReference(DatatypesFactory.eINSTANCE.createTEL("aa"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsTextReference(
					(Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInstructionsReferenceValue() {
		OperationsTestCase<Instructions> validateInstructionsReferenceValueTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(Instructions target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsReferenceValue(
					(Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInstructionsTextReferenceValue() {
		OperationsTestCase<Instructions> validateInstructionsTextReferenceValueTestCase = new NarrativeReferenceTestCase<Instructions>(
			"validateInstructionsTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular instructions provided.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(Instructions target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular instructions provided.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsTextReferenceValue(
					(Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsTemplateId() {
		OperationsTestCase<Instructions> validateInstructionsTemplateIdTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

			}

			@Override
			protected void updateToPass(Instructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsTemplateId(
					(Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsClassCode() {
		OperationsTestCase<Instructions> validateInstructionsClassCodeTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

			}

			@Override
			protected void updateToPass(Instructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsClassCode(
					(Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsMoodCode() {
		OperationsTestCase<Instructions> validateInstructionsMoodCodeTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

			}

			@Override
			protected void updateToPass(Instructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsMoodCode(
					(Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsCodeP() {
		OperationsTestCase<Instructions> validateInstructionsCodePTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

			}

			@Override
			protected void updateToPass(Instructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsCodeP((Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInstructionsCode() {
		OperationsTestCase<Instructions> validateInstructionsCodeTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsCode",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

			}

			@Override
			protected void updateToPass(Instructions target) {
				target.init();

				target.setCode(DatatypesFactory.eINSTANCE.createCE(
					"", "2.16.840.1.113883.6.96", "codeSystemName", "displayName"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsCode((Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInstructionsText() {
		OperationsTestCase<Instructions> validateInstructionsTextTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsText",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

			}

			@Override
			protected void updateToPass(Instructions target) {
				target.init();

				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setText(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsText((Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInstructionsStatusCode() {
		OperationsTestCase<Instructions> validateInstructionsStatusCodeTestCase = new OperationsTestCase<Instructions>(
			"validateInstructionsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Instructions target) {

			}

			@Override
			protected void updateToPass(Instructions target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsOperations.validateInstructionsStatusCode(
					(Instructions) objectToTest, diagnostician, map);
			}

		};

		validateInstructionsStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InstructionsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Instructions> {
		public Instructions create() {
			return ConsolFactory.eINSTANCE.createInstructions();
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
	private static class ConstructorTestClass extends InstructionsOperations {
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

} // InstructionsOperations
