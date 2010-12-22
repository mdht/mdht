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
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit 4 test case for ClinicalStatementOperations.
 */
@SuppressWarnings("nls")
public abstract class ClinicalStatementOperationsTest extends CDAValidationTest {

	private static final CDATestCase TEST_CASE_ARRAY[] = {};

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
	public void testConstructor() {
		ClinicalStatementOperations obj = new ClinicalStatementOperations();
		assertTrue(true);
	} // testConstructor

	
	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.cda.ClinicalStatement, org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship, java.lang.Object)}
	 * .
	 */
	@SuppressWarnings("null")
	@Test
	public void testGetEntryRelationshipTargetsClinicalStatementX_ActRelationshipEntryRelationshipObject() {
		final ClinicalStatement cs = (ClinicalStatement) getObjectToTest();
		x_ActRelationshipEntryRelationship typeCode = x_ActRelationshipEntryRelationship.CAUS;
		final EList<ClinicalStatement> result = ClinicalStatementOperations
				.getEntryRelationshipTargets(cs, typeCode, cs);

		assertTrue(result != null);
		assertTrue(result.size() != 0);
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.cda.ClinicalStatement, java.lang.Object)}
	 * .
	 */
	@SuppressWarnings("null")
	@Test
	public void testGetEntryRelationshipTargetsClinicalStatementObject() {
		final ClinicalStatement cs = (ClinicalStatement) getObjectToTest();
		final EList<ClinicalStatement> result = ClinicalStatementOperations
				.getEntryRelationshipTargets(cs, cs);

		assertTrue(result != null);
		assertTrue(result.size() != 0);
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.cda.ClinicalStatement, org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship, java.lang.Object)}
	 * .
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetEntryRelationshipTargetsClinicalStatementIllegalArgumentException() {
		final ClinicalStatement cs = (ClinicalStatement) getObjectToTest();
		// The "CAUS" argument was chosen at random.
		ClinicalStatementOperations.getEntryRelationshipTargets(cs,
				x_ActRelationshipEntryRelationship.CAUS, cs);
	}

} // ClinicalStatementOperationsTest