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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class PayersSectionOperationsTest extends CCDValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.9";

	protected static final String CODE = "48768-6";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PayersSectionOperations.validatePayersSectionTemplateId(
						(PayersSection) objectToTest, diagnostician, map);
				}

			},

			// Title
			// -------------------------------------------------------------
			new TitleCCDValidationTest() {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PayersSectionOperations.validatePayersSectionTitle(
						(PayersSection) objectToTest, diagnostician, map);
				}

			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PayersSectionOperations.validatePayersSectionCode(
						(PayersSection) objectToTest, diagnostician, map);
				}
			}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePayersSectionText() {
		// This is not fully implemented.
		final PayersSection ps = (PayersSection) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ps);

		boolean isValid = PayersSectionOperations.validatePayersSectionText(ps, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePayersSectionCoverageActivity() {
		// This is not fully implemented.
		final PayersSection ps = (PayersSection) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ps);

		boolean isValid = PayersSectionOperations.validatePayersSectionCoverageActivity(ps, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	@Override
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createPayersSection();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createPayersSection().init();
	}

} // PayersSectionOperationsTest
