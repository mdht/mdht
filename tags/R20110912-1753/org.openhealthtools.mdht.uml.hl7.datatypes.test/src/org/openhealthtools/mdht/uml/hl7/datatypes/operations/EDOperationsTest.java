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