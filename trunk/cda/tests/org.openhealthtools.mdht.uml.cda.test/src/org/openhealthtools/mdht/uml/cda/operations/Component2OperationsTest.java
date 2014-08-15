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
package org.openhealthtools.mdht.uml.cda.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component2;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class Component2OperationsTest extends CDAValidationTest {

	/**
	 * The names of the references to include in the test.
	 */
	public static final Set<String> EREFERENCE_NAMES = new HashSet<String>(
		Arrays.asList("structuredBody", "nonXMLBody"));

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// UndefinedXOR
	// -------------------------------------------------------------
	new UndefinedXORValidationTestCase("Component2Operations", EREFERENCE_NAMES) {

		@Override
		protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return Component2Operations.validateBodyChoice((Component2) objectToTest, diagnostician, map);
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
		new Component2Operations();
		assertTrue(true);
	} // testConstructor

	@Override
	protected EObject getObjectToTest() {
		return CDAFactory.eINSTANCE.createComponent2();
	}

} // Component2OperationsTest
