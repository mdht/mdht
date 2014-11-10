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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureDispositionSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection#validateProcedureDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Disposition Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureDispositionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDispositionSectionTemplateId() {
		OperationsTestCase<ProcedureDispositionSection> validateProcedureDispositionSectionTemplateIdTestCase = new OperationsTestCase<ProcedureDispositionSection>(
			"validateProcedureDispositionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDispositionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDispositionSectionOperations.validateProcedureDispositionSectionTemplateId(
					(ProcedureDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDispositionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDispositionSectionCode() {
		OperationsTestCase<ProcedureDispositionSection> validateProcedureDispositionSectionCodeTestCase = new OperationsTestCase<ProcedureDispositionSection>(
			"validateProcedureDispositionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDispositionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDispositionSectionOperations.validateProcedureDispositionSectionCode(
					(ProcedureDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDispositionSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDispositionSectionCodeP() {
		OperationsTestCase<ProcedureDispositionSection> validateProcedureDispositionSectionCodePTestCase = new OperationsTestCase<ProcedureDispositionSection>(
			"validateProcedureDispositionSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDispositionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDispositionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDispositionSectionOperations.validateProcedureDispositionSectionCodeP(
					(ProcedureDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDispositionSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDispositionSectionText() {
		OperationsTestCase<ProcedureDispositionSection> validateProcedureDispositionSectionTextTestCase = new OperationsTestCase<ProcedureDispositionSection>(
			"validateProcedureDispositionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDispositionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDispositionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDispositionSectionOperations.validateProcedureDispositionSectionText(
					(ProcedureDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDispositionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDispositionSectionTitle() {
		OperationsTestCase<ProcedureDispositionSection> validateProcedureDispositionSectionTitleTestCase = new OperationsTestCase<ProcedureDispositionSection>(
			"validateProcedureDispositionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDispositionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDispositionSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDispositionSectionOperations.validateProcedureDispositionSectionTitle(
					(ProcedureDispositionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDispositionSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureDispositionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureDispositionSection> {
		public ProcedureDispositionSection create() {
			return ConsolFactory.eINSTANCE.createProcedureDispositionSection();
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
	private static class ConstructorTestClass extends ProcedureDispositionSectionOperations {
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

} // ProcedureDispositionSectionOperations
