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

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ChiefComplaintSectionOperationsTest extends SectionOperationsTest {

	private final static String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.1.13.2.1";

	private static final String CODE = "10154-3";

	private static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		ChiefComplaintSectionOperations obj = new ChiefComplaintSectionOperations();
		assertTrue(true);
	} // testConstructor

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new CCDValidationTest.TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ChiefComplaintSectionOperations.validateChiefComplaintSectionTemplateId(
						(ChiefComplaintSection) objectToTest, diagnostician, map);
				}
			},

			// Code
			// -------------------------------------------------------------
			new CCDValidationTest.CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ChiefComplaintSectionOperations.validateChiefComplaintSectionCode(
						(ChiefComplaintSection) objectToTest, diagnostician, map);
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

	@Override
	protected EObject getObjectToTest() {
		return IHEFactory.eINSTANCE.createChiefComplaintSection();
	}

	/**
	 * @see org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest#getObjectInitToTest()
	 */
	@Override
	protected EObject getObjectInitToTest() {
		return IHEFactory.eINSTANCE.createChiefComplaintSection().init();
	}

} // ChiefComplaintSectionOperationsTest
