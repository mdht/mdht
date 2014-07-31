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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureImplantsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Implants Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection#validateProcedureImplantsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Implants Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection#validateProcedureImplantsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Implants Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection#validateProcedureImplantsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Implants Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection#validateProcedureImplantsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Implants Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection#validateProcedureImplantsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Implants Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureImplantsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureImplantsSectionTemplateId() {
		OperationsTestCase<ProcedureImplantsSection> validateProcedureImplantsSectionTemplateIdTestCase = new OperationsTestCase<ProcedureImplantsSection>(
			"validateProcedureImplantsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_IMPLANTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureImplantsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureImplantsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureImplantsSectionOperations.validateProcedureImplantsSectionTemplateId(
					(ProcedureImplantsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureImplantsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureImplantsSectionCode() {
		OperationsTestCase<ProcedureImplantsSection> validateProcedureImplantsSectionCodeTestCase = new OperationsTestCase<ProcedureImplantsSection>(
			"validateProcedureImplantsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_IMPLANTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureImplantsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureImplantsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureImplantsSectionOperations.validateProcedureImplantsSectionCode(
					(ProcedureImplantsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureImplantsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureImplantsSectionCodeP() {
		OperationsTestCase<ProcedureImplantsSection> validateProcedureImplantsSectionCodePTestCase = new OperationsTestCase<ProcedureImplantsSection>(
			"validateProcedureImplantsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_IMPLANTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureImplantsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureImplantsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureImplantsSectionOperations.validateProcedureImplantsSectionCodeP(
					(ProcedureImplantsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureImplantsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureImplantsSectionText() {
		OperationsTestCase<ProcedureImplantsSection> validateProcedureImplantsSectionTextTestCase = new OperationsTestCase<ProcedureImplantsSection>(
			"validateProcedureImplantsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_IMPLANTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureImplantsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureImplantsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureImplantsSectionOperations.validateProcedureImplantsSectionText(
					(ProcedureImplantsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureImplantsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureImplantsSectionTitle() {
		OperationsTestCase<ProcedureImplantsSection> validateProcedureImplantsSectionTitleTestCase = new OperationsTestCase<ProcedureImplantsSection>(
			"validateProcedureImplantsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_IMPLANTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureImplantsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureImplantsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureImplantsSectionOperations.validateProcedureImplantsSectionTitle(
					(ProcedureImplantsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureImplantsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureImplantsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureImplantsSection> {
		public ProcedureImplantsSection create() {
			return ConsolFactory.eINSTANCE.createProcedureImplantsSection();
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
	private static class ConstructorTestClass extends ProcedureImplantsSectionOperations {
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

} // ProcedureImplantsSectionOperations
