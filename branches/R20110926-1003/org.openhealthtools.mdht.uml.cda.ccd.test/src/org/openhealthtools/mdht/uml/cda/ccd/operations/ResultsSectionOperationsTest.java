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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ResultsSectionOperationsTest extends CCDValidationTest {

	protected static final String RESULTS_SECTION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.14";

	protected static final String CODE = "30954-2";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		ResultsSectionOperations obj = new ResultsSectionOperations();
		assertTrue(true);
	} // testConstructor

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(RESULTS_SECTION_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ResultsSectionOperations.validateResultsSectionTemplateId(
						(ResultsSection) objectToTest, diagnostician, map);
				}

			},

			// Title
			// -------------------------------------------------------------
			new TitleCCDValidationTest() {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ResultsSectionOperations.validateResultsSectionTitle(
						(ResultsSection) objectToTest, diagnostician, map);
				}
			},

			// Text
			// -------------------------------------------------------------
			new TextCCDValidationTest() {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ResultsSectionOperations.validateResultsSectionText(
						(ResultsSection) objectToTest, diagnostician, map);
				}

			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ResultsSectionOperations.validateResultsSectionCode(
						(ResultsSection) objectToTest, diagnostician, map);
				}
			},

			// Entry
			// -------------------------------------------------------------
			new EntryCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ResultsSectionOperations.validateResultsSectionResultOrganizer(
						(ResultsSection) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<Entry> retValue = new BasicEList<Entry>();
					final Entry entry = CDAFactory.eINSTANCE.createEntry();
					entry.setOrganizer(CCDFactory.eINSTANCE.createResultOrganizer());
					retValue.add(entry);
					return retValue;
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

	@Override
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createResultsSection();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createResultsSection().init();
	}

} // ResultsSectionOperationsTest
