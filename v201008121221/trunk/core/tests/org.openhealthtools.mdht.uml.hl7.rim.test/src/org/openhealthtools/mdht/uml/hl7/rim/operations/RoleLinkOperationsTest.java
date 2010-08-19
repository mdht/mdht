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
package org.openhealthtools.mdht.uml.hl7.rim.operations;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.Enumerator;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.rim.Role;
import org.openhealthtools.mdht.uml.hl7.rim.RoleLink;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings( { "unused", "nls" })
public abstract class RoleLinkOperationsTest extends
		InfrastructureRootOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleLinkOperations#getTypeCode(org.openhealthtools.mdht.uml.hl7.rim.RoleLink)}
	 * .
	 */
	@Test
	public void testGetTypeCode() {
		RoleLink rl = (RoleLink) getObjectToTest();
		Enumerator obj = rl.getTypeCode();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleLinkOperations#getTarget(org.openhealthtools.mdht.uml.hl7.rim.RoleLink)}
	 * .
	 */
	@Test
	public void testGetTarget() {
		RoleLink rl = (RoleLink) getObjectToTest();
		Role obj = rl.getTarget();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleLinkOperations#getSource(org.openhealthtools.mdht.uml.hl7.rim.RoleLink)}
	 * .
	 */
	@Test
	public void testGetSource() {
		RoleLink rl = (RoleLink) getObjectToTest();
		Role obj = rl.getSource();
		fail("Not yet implemented");
	}

} // RoleLinkOperationsTest