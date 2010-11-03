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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * This class
 */
@SuppressWarnings("nls")
public class PHRUpdateOperationsTest extends MedicalSummaryOperationsTest {

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		PHRUpdateOperations obj = new PHRUpdateOperations();
		assertTrue(true);
	} // testConstructor
	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PHRUpdateOperations#validatePHRUpdateTemplateId(org.openhealthtools.mdht.uml.cda.ihe.PHRUpdate, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidatePHRUpdateTemplateId() {
		fail("Not yet implemented");
	}

} // PHRUpdateOperationsTest