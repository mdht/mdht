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

import org.eclipse.emf.common.util.Enumerator;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings({ "unused", "nls" })
public abstract class ActRelationshipOperationsTest extends InfrastructureRootOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActRelationshipOperations#getTypeCode(org.openhealthtools.mdht.uml.hl7.rim.ActRelationship)}
	 * .
	 */
	@Test
	public void testGetTypeCode() {
		ActRelationship ar = (ActRelationship) getObjectToTest();
		Enumerator obj = ar.getTypeCode();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActRelationshipOperations#getTarget(org.openhealthtools.mdht.uml.hl7.rim.ActRelationship)}
	 * .
	 */
	@Test
	public void testGetTarget() {
		ActRelationship ar = (ActRelationship) getObjectToTest();
		Act obj = ar.getTarget();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActRelationshipOperations#getSource(org.openhealthtools.mdht.uml.hl7.rim.ActRelationship)}
	 * .
	 */
	@Test
	public void testGetSource() {
		ActRelationship ar = (ActRelationship) getObjectToTest();
		Act obj = ar.getSource();
		fail("Not yet implemented");
	}

} // ActRelationshipOperationsTest
