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
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperationsTest;

/**
 * This class is a JUnit4 test case. This should extend SectionOperationsTest
 */
@SuppressWarnings("nls")
public class CodedResultsSectionOperationsTest extends SectionOperationsTest {

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

			}

			@Override
			protected void updateToPass(CodedResultsSection target) {
				target.init();
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

			}

			@Override
			protected void updateToPass(CodedResultsSection target) {
				target.init();
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

				ExternalReference er = IHEFactory.eINSTANCE.createExternalReference().init();

				target.addAct(er);

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
				VitalSignObservation vso = IHEFactory.eINSTANCE.createVitalSignObservation().init();
				target.addObservation(vso);
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
