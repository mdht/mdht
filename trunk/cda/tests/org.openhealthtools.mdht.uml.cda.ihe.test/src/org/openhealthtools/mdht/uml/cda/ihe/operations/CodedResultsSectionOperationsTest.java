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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperationsTest;

/**
 * This class is a JUnit4 test case. This should extend SectionOperationsTest
 */
@SuppressWarnings("nls")
public class CodedResultsSectionOperationsTest extends SectionOperationsTest {

	// private final static String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.3.28";
	//
	// private static final String CODE = "30954-2";
	//
	// private static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @SuppressWarnings("unused")
	// @Test
	// public final void testConstructor() {
	// CodedResultsSectionOperations obj = new CodedResultsSectionOperations();
	// assertTrue(true);
	// } // testConstructor
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new CCDValidationTest.TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return CodedResultsSectionOperations.validateCodedResultsSectionTemplateId(
	// (CodedResultsSection) objectToTest, diagnostician, map);
	// }
	// },
	//
	// // Code
	// // -------------------------------------------------------------
	// new CCDValidationTest.CodeCCDValidationTest(CODE, CODE_SYSTEM) {
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return CodedResultsSectionOperations.validateCodedResultsSectionCode(
	// (CodedResultsSection) objectToTest, diagnostician, map);
	// }
	// } };
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
	// return IHEFactory.eINSTANCE.createCodedResultsSection();
	// }
	//
	// /**
	// * @see org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest#getObjectInitToTest()
	// */
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createCodedResultsSection().init();
	// }

	public static class OperationsForOCL extends CodedResultsSectionOperations {
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

	public class ObjectFactory implements TestObjectFactory<CodedResultsSection> {
		public CodedResultsSection create() {
			return IHEFactory.eINSTANCE.createCodedResultsSection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations#validateCodedResultsSectionTemplateId(org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateCodedResultsSectionTemplateId() {
		OperationsTestCase<CodedResultsSection> testCase = new OperationsTestCase<CodedResultsSection>(
			"ValidateCodedResultsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedResultsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedResultsSection target) {

				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CodedResultsSectionOperations.validateCodedResultsSectionTemplateId(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations#validateCodedResultsSectionCode(org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateCodedResultsSectionCode() {
		OperationsTestCase<CodedResultsSection> testCase = new OperationsTestCase<CodedResultsSection>(
			"ValidateCodedResultsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedResultsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedResultsSection target) {

				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CodedResultsSectionOperations.validateCodedResultsSectionCode(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations#validateCodedResultsSectionExternalReference(org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateCodedResultsSectionExternalReference() {
		OperationsTestCase<CodedResultsSection> testCase = new OperationsTestCase<CodedResultsSection>(
			"ValidateCodedResultsSectionExternalReference",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_EXTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedResultsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedResultsSection target) {

				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CodedResultsSectionOperations.validateCodedResultsSectionExternalReference(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CodedResultsSectionOperations#validateCodedResultsSectionSimpleObservation(org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateCodedResultsSectionSimpleObservation() {
		OperationsTestCase<CodedResultsSection> testCase = new OperationsTestCase<CodedResultsSection>(
			"ValidateCodedResultsSectionSimpleObservation",
			operationsForOCL.getOCLValue("VALIDATE_CODED_RESULTS_SECTION_SIMPLE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CodedResultsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(CodedResultsSection target) {

				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CodedResultsSectionOperations.validateCodedResultsSectionSimpleObservation(
					(CodedResultsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

} // CodedResultsSectionOperationsTest
