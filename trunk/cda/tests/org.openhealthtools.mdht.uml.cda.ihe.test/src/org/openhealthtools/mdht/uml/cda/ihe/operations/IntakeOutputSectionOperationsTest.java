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
import org.openhealthtools.mdht.uml.cda.operations.SectionOperationsTest;

/**
 * This class
 */
@SuppressWarnings("nls")
public class IntakeOutputSectionOperationsTest extends SectionOperationsTest {

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		IntakeOutputSectionOperations obj = new IntakeOutputSectionOperations();
		assertTrue(true);
	} // testConstructor

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.IntakeOutputSectionOperations#validateIntakeOutputSectionTemplateId(org.openhealthtools.mdht.uml.cda.ihe.IntakeOutputSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateIntakeOutputSectionTemplateId() {
		fail("Not yet implemented");
	}

} // IntakeOutputSectionOperationsTest
