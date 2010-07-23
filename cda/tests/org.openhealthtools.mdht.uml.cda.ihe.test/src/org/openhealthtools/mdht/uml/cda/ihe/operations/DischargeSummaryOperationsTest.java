/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
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
public class DischargeSummaryOperationsTest extends
		MedicalSummaryOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.1.4";

	private static final CDATestCase TEST_CASE_ARRAY[] = {

	// Template ID
	new TemplateIDValidationTest(TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return DischargeSummaryOperations
					.validateDischargeSummaryTemplateId(
							(DischargeSummary) objectToTest, diagnostician, map);
		}
	} };

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	/**
	 * @see org.openhealthtools.mdht.uml.cda.operations.MutualExclusionValidationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return IHEFactory.eINSTANCE.createDischargeSummary();
	}

	/**
	 * @see org.openhealthtools.mdht.uml.cda.ihe.operations.MedicalDocumentOperationsTest#getObjectInitToTest()
	 */
	@Override
	protected EObject getObjectInitToTest() {
		return IHEFactory.eINSTANCE.createDischargeSummary().init();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeSummaryOperations#validateDischargeSummaryActiveProblemsSection(org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateDischargeSummaryActiveProblemsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeSummaryOperations#validateMedicalSummaryCode(org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateMedicalSummaryCodeDischargeSummaryDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

} // DischargeSummaryOperationsTest