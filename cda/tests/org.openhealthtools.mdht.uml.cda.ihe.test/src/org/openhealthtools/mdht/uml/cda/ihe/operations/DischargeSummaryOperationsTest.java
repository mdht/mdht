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

import static org.junit.Assert.fail;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class DischargeSummaryOperationsTest extends MedicalSummaryOperationsTest {

	public static class OperationsForOCL extends DischargeSummaryOperations {
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

	public class ObjectFactory implements TestObjectFactory<DischargeSummary> {
		public DischargeSummary create() {
			return IHEFactory.eINSTANCE.createDischargeSummary();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeSummaryOperations#validateDischargeSummaryTemplateId(org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateDischargeSummaryTemplateId() {
		OperationsTestCase<DischargeSummary> testCase = new OperationsTestCase<DischargeSummary>(
			"ValidateDischargeSummaryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return DischargeSummaryOperations.validateDischargeSummaryTemplateId(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeSummaryOperations#validateDischargeSummaryActiveProblemsSection(org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateDischargeSummaryActiveProblemsSection() {

		OperationsTestCase<DischargeSummary> testCase = new OperationsTestCase<DischargeSummary>(
			"ValidateDischargeSummaryActiveProblemsSection",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY_ACTIVE_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return DischargeSummaryOperations.validateDischargeSummaryActiveProblemsSection(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateGeneralHeaderConstraintsCodeDischargeSummaryDiagnosticChainMapOfObjectObject() {
		OperationsTestCase<DischargeSummary> testCase = new OperationsTestCase<DischargeSummary>(
			"testValidateGeneralHeaderConstraintsCodeDischargeSummary",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary target) {

			}

			@Override
			protected void updateToPass(DischargeSummary target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return DischargeSummaryOperations.validateGeneralHeaderConstraintsCode(
					(DischargeSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeSummaryOperations#getActiveProblemsSection(org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary)}.
	 */
	@Test
	public void testGetActiveProblemsSection() {
		fail("Not yet implemented");
	}

} // DischargeSummaryOperationsTest
