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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureDescriptionSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Description Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection#validateProcedureDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection#validateProcedureDescriptionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection#validateProcedureDescriptionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection#validateProcedureDescriptionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection#validateProcedureDescriptionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Description Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureDescriptionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDescriptionSectionTemplateId() {
		OperationsTestCase<ProcedureDescriptionSection> validateProcedureDescriptionSectionTemplateIdTestCase = new OperationsTestCase<ProcedureDescriptionSection>(
			"validateProcedureDescriptionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDescriptionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDescriptionSectionOperations.validateProcedureDescriptionSectionTemplateId(
					(ProcedureDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDescriptionSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDescriptionSectionCode() {
		OperationsTestCase<ProcedureDescriptionSection> validateProcedureDescriptionSectionCodeTestCase = new OperationsTestCase<ProcedureDescriptionSection>(
			"validateProcedureDescriptionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDescriptionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDescriptionSectionOperations.validateProcedureDescriptionSectionCode(
					(ProcedureDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDescriptionSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDescriptionSectionCodeP() {
		OperationsTestCase<ProcedureDescriptionSection> validateProcedureDescriptionSectionCodePTestCase = new OperationsTestCase<ProcedureDescriptionSection>(
			"validateProcedureDescriptionSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DESCRIPTION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDescriptionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDescriptionSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDescriptionSectionOperations.validateProcedureDescriptionSectionCodeP(
					(ProcedureDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDescriptionSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDescriptionSectionText() {
		OperationsTestCase<ProcedureDescriptionSection> validateProcedureDescriptionSectionTextTestCase = new OperationsTestCase<ProcedureDescriptionSection>(
			"validateProcedureDescriptionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDescriptionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDescriptionSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDescriptionSectionOperations.validateProcedureDescriptionSectionText(
					(ProcedureDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDescriptionSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureDescriptionSectionTitle() {
		OperationsTestCase<ProcedureDescriptionSection> validateProcedureDescriptionSectionTitleTestCase = new OperationsTestCase<ProcedureDescriptionSection>(
			"validateProcedureDescriptionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureDescriptionSection target) {

			}

			@Override
			protected void updateToPass(ProcedureDescriptionSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureDescriptionSectionOperations.validateProcedureDescriptionSectionTitle(
					(ProcedureDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureDescriptionSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureDescriptionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureDescriptionSection> {
		public ProcedureDescriptionSection create() {
			return ConsolFactory.eINSTANCE.createProcedureDescriptionSection();
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
	private static class ConstructorTestClass extends ProcedureDescriptionSectionOperations {
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

} // ProcedureDescriptionSectionOperations
