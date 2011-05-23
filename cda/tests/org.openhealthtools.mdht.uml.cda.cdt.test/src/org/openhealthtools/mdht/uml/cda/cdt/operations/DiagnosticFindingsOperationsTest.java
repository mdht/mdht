/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperationsTest;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class DiagnosticFindingsOperationsTest extends ResultsSectionOperationsTest {

	private static final CDATestCase TEST_CASE_ARRAY[] = {

	// Title
	// -------------------------------------------------------------
	new TitleCCDValidationTest() {

		@Override
		protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return DiagnosticFindingsOperations.validateDiagnosticFindingsTitle(
				(DiagnosticFindings) objectToTest, diagnostician, map);
		}

		/**
		 * @see org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest.TitleCCDValidationTest#getValueToSet()
		 */
		@Override
		protected Object getValueToSet() {
			final ST title = (ST) super.getValueToSet();
			title.addText("Encounters");
			return title;
		}
	} }; // TEST_CASE_ARRAY

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
		return CDTFactory.eINSTANCE.createDiagnosticFindings();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		DiagnosticFindingsOperations obj = new DiagnosticFindingsOperations();
		assertTrue(true);
	} // testConstructor
} // DiagnosticFindingsOperationsTest
