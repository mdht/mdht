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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.DatatypesValidationOperationsText.DatatypeTestCase;

/**
 * This class is a JUnit4 test case.
 */
public class EDOperationsTest extends DatatypesOperationsTest {

	/**
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.operations.DatatypesOperationsTest#getobjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return DatatypesFactory.eINSTANCE.createED();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Test
	public final void testConstructor() {
		@SuppressWarnings("unused")
		EDOperations obj = new EDOperations();
		assertTrue(true);
	} // testConstructor

	@Test
	public final void testMatches() {
		@SuppressWarnings("unused")
		ED ed = (ED) getObjectToTest();

		ed.addText("true");

		assertTrue(EDOperations.matches(ed, "[Tt]rue"));

		ed = (ED) getObjectToTest();

		ed.addText("false");

		assertFalse(EDOperations.matches(ed, "[Tt]rue"));

		ed = (ED) getObjectToTest();

		ed.addText("1.3.6.1.4.1.19376.1.5.3.1.1.11.2.3.2");

		assertTrue(EDOperations.matches(ed, "([0-2])(.([1-9][0-9]*|0))+"));

		ed = (ED) getObjectToTest();

		ed.addText("cfbf1712-5a5f-4948-bb97-da2bad618223");

		assertTrue(EDOperations.matches(ed, "([A-Fa-f0-9]{8})(\\-[A-Fa-f0-9]{4}){3}(\\-[A-Fa-f0-9]{12})"));

		ed.setLanguage("true");
		assertTrue(ANYOperations.matches(ed, "language", "[Tt]rue"));

		ed.setLanguage("1.3.6.1.4.1.19376.1.5.3.1.1.11.2.3.2");
		assertTrue(ANYOperations.matches(ed, "language", "([0-2])(.([1-9][0-9]*|0))+"));

		ed.setLanguage("cfbf1712-5a5f-4948-bb97-da2bad618223");
		assertTrue(ANYOperations.matches(ed, "language", "([A-Fa-f0-9]{8})(\\-[A-Fa-f0-9]{4}){3}(\\-[A-Fa-f0-9]{12})"));

		ed.setLanguage("shouldbefalse");
		assertFalse(ANYOperations.matches(ed, "language", "[Tt]rue"));

		assertFalse(ANYOperations.matches(ed, "language", "([0-2])(.([1-9][0-9]*|0))+"));

		assertFalse(ANYOperations.matches(ed, "language", "([A-Fa-f0-9]{8})(\\-[A-Fa-f0-9]{4}){3}(\\-[A-Fa-f0-9]{12})"));

	}

	/**
	 * test addText and getText
	 */
	@Test
	public final void testAddTextGetText() {
		final ED ed = (ED) getObjectToTest();

		ed.addText(DatatypeTestCase.TEST_TEXT);
		assertTrue(ed.getText().equals(DatatypeTestCase.TEST_TEXT));
	}
} // EDOperationsTest
