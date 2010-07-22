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
import org.openhealthtools.mdht.uml.hl7.datatypes.TN;

/**
 * This class is a JUnit4 test case.
 */
public class TNOperationsTest extends ENOperationsTest {

	@Override
	protected EObject getObjectToTest() {
		return DatatypesFactory.eINSTANCE.createTN();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.datatypes.operations.TNOperations#validateInvariant(org.openhealthtools.mdht.uml.hl7.datatypes.TN, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateInvariant() {
		// self.delimiter->isEmpty() and self.family->isEmpty() and
		// self.given->isEmpty() and self.prefix->isEmpty() and
		// self.suffix->isEmpty() and mixed->size() = 1

		final TN tn = (TN) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(tn);

		tn.addText(DatatypeTestCase.TEST_TEXT);

		boolean isValid = TNOperations
				.validateInvariant(tn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), isValid);

		// delimiter
		tn.addDelimiter(DatatypeTestCase.TEST_TEXT);

		isValid = TNOperations.validateInvariant(tn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		tn.getDelimiters().clear();

		// family
		tn.addFamily(DatatypeTestCase.TEST_TEXT);

		isValid = TNOperations.validateInvariant(tn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		tn.getFamilies().clear();

		// given
		tn.addGiven(DatatypeTestCase.TEST_TEXT);

		isValid = TNOperations.validateInvariant(tn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		tn.getGivens().clear();

		// prefix
		tn.addPrefix(DatatypeTestCase.TEST_TEXT);

		isValid = TNOperations.validateInvariant(tn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		tn.getPrefixes().clear();

		// suffix
		tn.addSuffix(DatatypeTestCase.TEST_TEXT);

		isValid = TNOperations.validateInvariant(tn, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
		// pn.getSuffixes().clear();
	} // testValidateInvariant

} // TNOperationsTest