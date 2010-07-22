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

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

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
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.cda.ClinicalStatement, org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship, java.lang.Object)}
	 * .
	 */
	@Test
	public void testGetEntryRelationshipTargetsClinicalStatementX_ActRelationshipEntryRelationshipObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations#getEntryRelationshipTargets(org.openhealthtools.mdht.uml.cda.ClinicalStatement, java.lang.Object)}
	 * .
	 */
	@Test
	public void testGetEntryRelationshipTargetsClinicalStatementObject() {
		fail("Not yet implemented");
	}

} // ClinicalStatementOperationsTest