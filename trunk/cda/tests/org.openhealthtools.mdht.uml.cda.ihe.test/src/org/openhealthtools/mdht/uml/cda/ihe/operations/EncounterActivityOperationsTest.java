/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * This class
 */
@SuppressWarnings("nls")
public class EncounterActivityOperationsTest extends EncounterEntryOperationsTest {

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		EncounterActivityOperations obj = new EncounterActivityOperations();
		assertTrue(true);
	} // testConstructor

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterActivityOperations#validateEncountersActivityTemplateId(org.openhealthtools.mdht.uml.cda.ihe.EncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateEncountersActivityTemplateId() {
		fail("Not yet implemented");
	}

} // EncounterActivityOperationsTest
