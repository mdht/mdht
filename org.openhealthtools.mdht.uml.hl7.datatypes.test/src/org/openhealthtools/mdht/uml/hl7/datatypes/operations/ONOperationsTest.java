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
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;

/**
 * This class is a JUnit4 test case.
 */
public class ONOperationsTest extends ENOperationsTest {

	@Override
	protected EObject getObjectToTest() {
		return DatatypesFactory.eINSTANCE.createON();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Test
	public final void testConstructor() {
		@SuppressWarnings("unused")
		ONOperations obj = new ONOperations();
		assertTrue(true);
	} // testConstructor
	
	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.datatypes.operations.ONOperations#validateInvariant(org.openhealthtools.mdht.uml.hl7.datatypes.ON, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateInvariant() {
		final ON on = (ON) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(on);

		boolean isValid = ONOperations
				.validateInvariant(on, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), isValid);

		on.addFamily(DatatypeTestCase.TEST_TEXT);

		isValid = ONOperations.validateInvariant(on, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

	} // testValidateInvariant

} // ONOperationsTest