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
import org.openhealthtools.mdht.uml.hl7.datatypes.BN;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * This class is a JUnit4 test case.
 */
public class BNOperationsTest extends DatatypesOperationsTest {

	/**
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.operations.DatatypesOperationsTest#getobjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return DatatypesFactory.eINSTANCE.createBN();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.datatypes.operations.BNOperations#validateNullFlavor(org.openhealthtools.mdht.uml.hl7.datatypes.BN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateNullFlavor() {
		final BN bn = (BN) getObjectToTest();
		final EObject objectToTest = getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(objectToTest);

		boolean isValid = BNOperations.validateNullFlavor(bn, diagnostician,
				map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

		bn.setNullFlavor(NullFlavor.ASKU);

		isValid = BNOperations.validateNullFlavor(bn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

	}
} // BNOperationsTest