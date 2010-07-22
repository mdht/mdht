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

import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public abstract class SimpleObservationOperationsTest extends ObservationOperationsTest {

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

//	@Override
//	protected EObject getObjectToTest() {
//		return IHEFactory.eINSTANCE.createSimpleObservation();
//	}
//	
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