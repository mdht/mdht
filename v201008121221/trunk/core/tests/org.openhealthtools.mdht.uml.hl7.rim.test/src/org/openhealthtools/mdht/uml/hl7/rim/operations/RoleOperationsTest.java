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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.rim.Entity;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;
import org.openhealthtools.mdht.uml.hl7.rim.RoleLink;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings( { "unused", "nls" })
public abstract class RoleOperationsTest extends
		InfrastructureRootOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations#getClassCode(org.openhealthtools.mdht.uml.hl7.rim.Role)}
	 * .
	 */
	@Test
	public void testGetClassCode() {
		Role role = (Role) getObjectToTest();
		Enumerator obj = role.getClassCode();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations#getPlayer(org.openhealthtools.mdht.uml.hl7.rim.Role)}
	 * .
	 */
	@Test
	public void testGetPlayer() {
		Role role = (Role) getObjectToTest();
		Entity obj = role.getPlayer();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations#getScoper(org.openhealthtools.mdht.uml.hl7.rim.Role)}
	 * .
	 */
	@Test
	public void testGetScoper() {
		Role role = (Role) getObjectToTest();
		Entity obj = role.getScoper();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations#getParticipations(org.openhealthtools.mdht.uml.hl7.rim.Role)}
	 * .
	 */
	@Test
	public void testGetParticipations() {
		Role role = (Role) getObjectToTest();
		EList<Participation> obj = role.getParticipations();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations#getOutboundLinks(org.openhealthtools.mdht.uml.hl7.rim.Role)}
	 * .
	 */
	@Test
	public void testGetOutboundLinks() {
		Role role = (Role) getObjectToTest();
		EList<RoleLink> obj = role.getOutboundLinks();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations#getInboundLinks(org.openhealthtools.mdht.uml.hl7.rim.Role)}
	 * .
	 */
	@Test
	public void testGetInboundLinks() {
		Role role = (Role) getObjectToTest();
		EList<RoleLink> obj = role.getInboundLinks();
		fail("Not yet implemented");
	}

} // RoleOperationsTest