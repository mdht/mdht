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
package org.openhealthtools.mdht.uml.hl7.rim.operations;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings({ "nls", "unused" })
public abstract class InfrastructureRootOperationsTest extends RIMOperationTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.InfrastructureRootOperations#getRealmCodes(org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot)}
	 * .
	 */
	@Test
	public void testGetRealmCodes() {
		InfrastructureRoot ir = (InfrastructureRoot) getObjectToTest();
		EList<CS> obj = ir.getRealmCodes();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.InfrastructureRootOperations#getTypeId(org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot)}
	 * .
	 */
	@Test
	public void testGetTypeId() {
		InfrastructureRoot ir = (InfrastructureRoot) getObjectToTest();
		II obj = ir.getTypeId();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.InfrastructureRootOperations#getTemplateIds(org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot)}
	 * .
	 */
	@Test
	public void testGetTemplateIds() {
		InfrastructureRoot ir = (InfrastructureRoot) getObjectToTest();
		EList<II> obj = ir.getTemplateIds();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.InfrastructureRootOperations#getNullFlavor(org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot)}
	 * .
	 */
	@Test
	public void testGetNullFlavor() {
		InfrastructureRoot ir = (InfrastructureRoot) getObjectToTest();
		NullFlavor obj = ir.getNullFlavor();
		fail("Not yet implemented");
	}

} // InfrastructureRootOperationsTest
