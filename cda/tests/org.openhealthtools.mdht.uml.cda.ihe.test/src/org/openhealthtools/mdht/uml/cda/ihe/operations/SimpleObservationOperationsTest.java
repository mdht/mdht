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
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class SimpleObservationOperationsTest extends ObservationOperationsTest {

	private static final CDATestCase TEST_CASE_ARRAY[] = {

	};

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	// @Override
	// protected EObject getObjectToTest() {
	// return IHEFactory.eINSTANCE.createSimpleObservation();
	// }
	//
	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		SimpleObservationOperations obj = new SimpleObservationOperations();
		assertTrue(true);
	} // testConstructor

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations#validateSimpleObservationTemplateId(org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateSimpleObservationTemplateId() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations#validateSimpleObservationId(org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateSimpleObservationId() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SimpleObservationOperations#validateSimpleObservationStatusCode(org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateSimpleObservationStatusCode() {
		fail("Not yet implemented"); // TODO
	}

} // SimpleObservationOperationsTest
