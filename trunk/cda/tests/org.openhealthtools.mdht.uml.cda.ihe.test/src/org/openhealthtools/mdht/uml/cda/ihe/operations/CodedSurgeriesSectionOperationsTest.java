/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class CodedSurgeriesSectionOperationsTest extends SurgeriesSectionOperationsTest {

	// protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.3.12";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return CodedSurgeriesSectionOperations.validateCodedSurgeriesSectionTemplateId(
	// (CodedSurgeriesSection) objectToTest, diagnostician, map);
	// }
	//
	// }
	//
	// }; // TEST_CASE_ARRAY
	//
	// @Override
	// protected List<CDATestCase> getTestCases() {
	// // Return a new List because the one returned by Arrays.asList is
	// // unmodifiable so a sub-class can't append their test cases.
	// final List<CDATestCase> retValue = super.getTestCases();
	// retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
	// return retValue;
	// }
	//
	// @Override
	// protected EObject getObjectToTest() {
	// return IHEFactory.eINSTANCE.createCodedSurgeriesSection();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createCodedSurgeriesSection().init();
	// }
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @Override
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// CodedSurgeriesSectionOperations obj = new CodedSurgeriesSectionOperations();
	// assertTrue(true);
	// } // testConstructor

	public static class OperationsForOCL extends CodedSurgeriesSectionOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<CodedSurgeriesSection> {
		public CodedSurgeriesSection create() {
			return IHEFactory.eINSTANCE.createCodedSurgeriesSection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CodedSurgeriesSectionOperations#validateCodedSurgeriesSectionTemplateId(org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateCodedSurgeriesSectionTemplateId() {
		OperationsTestCase<CodedSurgeriesSection> testCase = new OperationsTestCase<CodedSurgeriesSection>(
			"ValidateCodedSurgeriesSectionTemplateId",
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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CodedSurgeriesSectionOperations#validateCodedSurgeriesSectionExternalReference(org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateCodedSurgeriesSectionExternalReference() {
		OperationsTestCase<CodedSurgeriesSection> testCase = new OperationsTestCase<CodedSurgeriesSection>(
			"ValidateCodedSurgeriesSectionExternalReference",
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

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CodedSurgeriesSectionOperations#validateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure(org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure() {
		OperationsTestCase<CodedSurgeriesSection> testCase = new OperationsTestCase<CodedSurgeriesSection>(
			"ValidateCodedSurgeriesSectionProcedureEntryProcedureActivityProcedure",
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

		testCase.doValidationTest();
	}

} // CodedSurgeriesSectionOperationsTest
