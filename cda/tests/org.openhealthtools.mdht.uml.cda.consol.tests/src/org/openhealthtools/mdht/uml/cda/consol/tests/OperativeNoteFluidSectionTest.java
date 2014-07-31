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
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteFluidSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note Fluid Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection#validateOperativeNoteFluidSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OperativeNoteFluidSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteFluidSectionTemplateId() {
		OperationsTestCase<OperativeNoteFluidSection> validateOperativeNoteFluidSectionTemplateIdTestCase = new OperationsTestCase<OperativeNoteFluidSection>(
			"validateOperativeNoteFluidSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteFluidSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteFluidSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionTemplateId(
					(OperativeNoteFluidSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteFluidSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteFluidSectionCode() {
		OperationsTestCase<OperativeNoteFluidSection> validateOperativeNoteFluidSectionCodeTestCase = new OperationsTestCase<OperativeNoteFluidSection>(
			"validateOperativeNoteFluidSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteFluidSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteFluidSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionCode(
					(OperativeNoteFluidSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteFluidSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteFluidSectionCodeP() {
		OperationsTestCase<OperativeNoteFluidSection> validateOperativeNoteFluidSectionCodePTestCase = new OperationsTestCase<OperativeNoteFluidSection>(
			"validateOperativeNoteFluidSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteFluidSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteFluidSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionCodeP(
					(OperativeNoteFluidSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteFluidSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteFluidSectionText() {
		OperationsTestCase<OperativeNoteFluidSection> validateOperativeNoteFluidSectionTextTestCase = new OperationsTestCase<OperativeNoteFluidSection>(
			"validateOperativeNoteFluidSectionText",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteFluidSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteFluidSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionText(
					(OperativeNoteFluidSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteFluidSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteFluidSectionTitle() {
		OperationsTestCase<OperativeNoteFluidSection> validateOperativeNoteFluidSectionTitleTestCase = new OperationsTestCase<OperativeNoteFluidSection>(
			"validateOperativeNoteFluidSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_FLUID_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNoteFluidSection target) {

			}

			@Override
			protected void updateToPass(OperativeNoteFluidSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteFluidSectionOperations.validateOperativeNoteFluidSectionTitle(
					(OperativeNoteFluidSection) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteFluidSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OperativeNoteFluidSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OperativeNoteFluidSection> {
		public OperativeNoteFluidSection create() {
			return ConsolFactory.eINSTANCE.createOperativeNoteFluidSection();
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
	private static class ConstructorTestClass extends OperativeNoteFluidSectionOperations {
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

} // OperativeNoteFluidSectionOperations
