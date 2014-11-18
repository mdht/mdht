/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
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

	static final String TEXT_ID = "medicationDescriptionID0";

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#addText(org.openhealthtools.mdht.uml.cda.StrucDocText, java.lang.String)}
	 * .
	 */
	@Test
	public final void testAddText() {
		final StrucDocText strcDocText = CDAFactory.eINSTANCE.createStrucDocText();
		assertTrue(StrucDocTextOperations.getText(strcDocText).equals(""));
		StrucDocTextOperations.addText(strcDocText, TEST_TEXT);
		assertTrue(StrucDocTextOperations.getText(strcDocText).equals(TEST_TEXT));
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#addText(org.openhealthtools.mdht.uml.cda.StrucDocText, java.lang.String)}
	 * .
	 */
	@Test(expected = IllegalArgumentException.class)
	public final void testAddTextNull() {
		final StrucDocText strcDocText = CDAFactory.eINSTANCE.createStrucDocText();
		assertTrue(StrucDocTextOperations.getText(strcDocText).equals(""));
		StrucDocTextOperations.addText(strcDocText, null);
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

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#setID(org.openhealthtools.mdht.uml.cda.StrucDocText)}
	 * and
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#getID(org.openhealthtools.mdht.uml.cda.StrucDocText)}
	 */
	@Test
	public final void testGetAndSetID() {
		final StrucDocText strcDocText = CDAFactory.eINSTANCE.createStrucDocText();
		strcDocText.setID(TEXT_ID);
		assertTrue(strcDocText.getID().equals(TEXT_ID));
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#getText(org.openhealthtools.mdht.uml.cda.StrucDocText)}
	 * .
	 */
	@Test
	public final void testGetText_StructDocText() {
		final StrucDocText strcDocText = CDAFactory.eINSTANCE.createStrucDocText();
		assertTrue(StrucDocTextOperations.getText(strcDocText, "foo") == null);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.StrucDocTextOperations#getText(org.openhealthtools.mdht.uml.cda.StrucDocText)}
	 * .
	 */
	@Test
	public final void testGetText_StructDocTextMatchingID() {
		final StrucDocText strcDocText = CDAFactory.eINSTANCE.createStrucDocText();
		// set the ID
		strcDocText.setID(TEXT_ID);
		// set the text to a random string which we will return if the id matches
		strcDocText.addText(TEST_TEXT);
		// send in the same ID that was set. It should be a match, if so, it will return the matching TEST_TEXT string
		assertTrue(StrucDocTextOperations.getText(strcDocText, TEXT_ID).equals(TEST_TEXT));
	}

} // StrucDocTextOperationsTest
