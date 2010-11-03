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
package org.openhealthtools.mdht.uml.cda.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component4;

/**
 * This class is a JUnit4 test case.
 */
public class Component4OperationsTest extends CDAValidationTest {

	@SuppressWarnings("nls")
	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// CDAMutualExclusionValidationTestCase
	// -------------------------------------------------------------
	new CDAMutualExclusionValidationTestCase("Component4") {

		@Override
		protected boolean validate(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return Component4Operations.validateClinicalStatement(
					(Component4) objectToTest, diagnostician, map);
		}

		@Override
		protected void initializeobjectToTest(final EObject objectToTest) {
			((Component4) objectToTest).setAct(CDAFactory.eINSTANCE
					.createAct());
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
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		Component4Operations obj = new Component4Operations();
		assertTrue(true);
	} // testConstructor
	
	/**
	 * @return the EObject instance to be validated
	 */
	@Override
	protected EObject getObjectToTest() {
		return CDAFactory.eINSTANCE.createComponent4();
	} // getObjectToTest()

} // Component4OperationsTest