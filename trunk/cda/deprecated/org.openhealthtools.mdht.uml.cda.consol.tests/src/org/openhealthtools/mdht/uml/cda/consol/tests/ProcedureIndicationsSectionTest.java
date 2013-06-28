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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureIndicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Indications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection#validateProcedureIndicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection#validateProcedureIndicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection#validateProcedureIndicationsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection#validateProcedureIndicationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection#validateProcedureIndicationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection#validateProcedureIndicationsSectionIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Indications Section Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection#getIndications() <em>Get Indications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureIndicationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionTemplateId() {
		OperationsTestCase<ProcedureIndicationsSection> validateProcedureIndicationsSectionTemplateIdTestCase = new OperationsTestCase<ProcedureIndicationsSection>(
			"validateProcedureIndicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSectionOperations.validateProcedureIndicationsSectionTemplateId(
					(ProcedureIndicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionCode() {
		OperationsTestCase<ProcedureIndicationsSection> validateProcedureIndicationsSectionCodeTestCase = new OperationsTestCase<ProcedureIndicationsSection>(
			"validateProcedureIndicationsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSectionOperations.validateProcedureIndicationsSectionCode(
					(ProcedureIndicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionCodeP() {
		OperationsTestCase<ProcedureIndicationsSection> validateProcedureIndicationsSectionCodePTestCase = new OperationsTestCase<ProcedureIndicationsSection>(
			"validateProcedureIndicationsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSectionOperations.validateProcedureIndicationsSectionCodeP(
					(ProcedureIndicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionText() {
		OperationsTestCase<ProcedureIndicationsSection> validateProcedureIndicationsSectionTextTestCase = new OperationsTestCase<ProcedureIndicationsSection>(
			"validateProcedureIndicationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSectionOperations.validateProcedureIndicationsSectionText(
					(ProcedureIndicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureIndicationsSectionTitle() {
		OperationsTestCase<ProcedureIndicationsSection> validateProcedureIndicationsSectionTitleTestCase = new OperationsTestCase<ProcedureIndicationsSection>(
			"validateProcedureIndicationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection target) {

			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSectionOperations.validateProcedureIndicationsSectionTitle(
					(ProcedureIndicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureIndicationsSectionIndication() {
		OperationsTestCase<ProcedureIndicationsSection> validateProcedureIndicationsSectionIndicationTestCase = new OperationsTestCase<ProcedureIndicationsSection>(
			"validateProcedureIndicationsSectionIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_INDICATIONS_SECTION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureIndicationsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureIndicationsSection target) {

				target.addObservation(ConsolFactory.eINSTANCE.createIndication().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureIndicationsSectionOperations.validateProcedureIndicationsSectionIndication(
					(ProcedureIndicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateProcedureIndicationsSectionIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureIndicationsSection target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureIndicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureIndicationsSection> {
		public ProcedureIndicationsSection create() {
			return ConsolFactory.eINSTANCE.createProcedureIndicationsSection();
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
	private static class ConstructorTestClass extends ProcedureIndicationsSectionOperations {
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

} // ProcedureIndicationsSectionOperations
