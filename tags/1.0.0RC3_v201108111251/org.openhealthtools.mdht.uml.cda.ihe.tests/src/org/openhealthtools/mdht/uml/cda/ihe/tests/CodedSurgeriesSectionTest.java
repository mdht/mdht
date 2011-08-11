/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedSurgeriesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#validateCodedSurgeriesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#validateCodedSurgeriesSectionExternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Surgeries Section Procedure Entry Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#getExternalReference() <em>Get External Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection#getProcedureEntryProcedureActivityProcedures() <em>Get Procedure Entry Procedure Activity Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CodedSurgeriesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCodedSurgeriesSectionTemplateId() {
		OperationsTestCase<CodedSurgeriesSection> validateCodedSurgeriesSectionTemplateIdTestCase = new OperationsTestCase<CodedSurgeriesSection>(
			"validateCodedSurgeriesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedSurgeriesSection target) {

			}

			@Override
			protected void updateToPass(CodedSurgeriesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedSurgeriesSectionOperations.validateCodedSurgeriesSectionTemplateId(
					(CodedSurgeriesSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedSurgeriesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCodedSurgeriesSectionExternalReference() {
		OperationsTestCase<CodedSurgeriesSection> validateCodedSurgeriesSectionExternalReferenceTestCase = new OperationsTestCase<CodedSurgeriesSection>(
			"validateCodedSurgeriesSectionExternalReference",
			operationsForOCL.getOCLValue("VALIDATE_CODED_SURGERIES_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedSurgeriesSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedSurgeriesSection target) {

				ExternalReference er = IHEFactory.eINSTANCE.createExternalReference().init();

				target.addAct(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedSurgeriesSectionOperations.validateCodedSurgeriesSectionExternalReference(
					(CodedSurgeriesSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedSurgeriesSectionExternalReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure() {
		OperationsTestCase<CodedSurgeriesSection> validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedureTestCase = new OperationsTestCase<CodedSurgeriesSection>(
			"validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_CODED_SURGERIES_SECTION_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedSurgeriesSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedSurgeriesSection target) {

				ProcedureEntryProcedureActivityProcedure pepap = IHEFactory.eINSTANCE.createProcedureEntryProcedureActivityProcedure().init();

				target.addProcedure(pepap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CodedSurgeriesSectionOperations.validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(
					(CodedSurgeriesSection) objectToTest, diagnostician, map);
			}

		};

		validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExternalReference() {

		CodedSurgeriesSection target = objectFactory.create();
		target.getExternalReference();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEntryProcedureActivityProcedures() {

		CodedSurgeriesSection target = objectFactory.create();
		target.getProcedureEntryProcedureActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CodedSurgeriesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CodedSurgeriesSection> {

		public CodedSurgeriesSection create() {
			return IHEFactory.eINSTANCE.createCodedSurgeriesSection();
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
	private static class ConstructorTestClass extends CodedSurgeriesSectionOperations {
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

} // CodedSurgeriesSectionOperations
