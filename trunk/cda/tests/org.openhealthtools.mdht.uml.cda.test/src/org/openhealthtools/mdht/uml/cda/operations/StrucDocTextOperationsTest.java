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

import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class StrucDocTextOperationsTest {

	static final String TEST_TEXT = "Some text for testing";

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#addText(org.openhealthtools.mdht.uml.cda.StrucDocText, java.lang.String)}
	 * .
	 */
	@Test
	public final void testAddText() {
		final StrucDocText strcDocText = CDAFactory.eINSTANCE
				.createStrucDocText();
		assertTrue(StrucDocTextOperations.getText(strcDocText).equals(""));
		StrucDocTextOperations.addText(strcDocText, TEST_TEXT);
		assertTrue(StrucDocTextOperations.getText(strcDocText)
				.equals(TEST_TEXT));
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#getText(org.openhealthtools.mdht.uml.cda.StrucDocText)}
	 * .
	 */
	@Test
	public final void testGetText() {
		testAddText();
	}

} // StrucDocTextOperationsTest