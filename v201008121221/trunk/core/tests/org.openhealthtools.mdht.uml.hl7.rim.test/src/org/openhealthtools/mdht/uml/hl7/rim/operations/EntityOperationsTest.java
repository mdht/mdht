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
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("unused")
public abstract class EntityOperationsTest extends
		InfrastructureRootOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.EntityOperations#getClassCode(org.openhealthtools.mdht.uml.hl7.rim.Entity)}
	 * .
	 */
	@Test
	public void testGetClassCode() {
		Entity entity = (Entity) getObjectToTest();
		Enumerator obj = EntityOperations.getClassCode(entity);
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.EntityOperations#getDeterminerCode(org.openhealthtools.mdht.uml.hl7.rim.Entity)}
	 * .
	 */
	@Test
	public void testGetDeterminerCode() {
		Entity entity = (Entity) getObjectToTest();
		Enumerator obj = EntityOperations.getDeterminerCode(entity);
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.EntityOperations#getPlayedRoles(org.openhealthtools.mdht.uml.hl7.rim.Entity)}
	 * .
	 */
	@Test
	public void testGetPlayedRoles() {
		Entity entity = (Entity) getObjectToTest();
		EList<Role> obj = EntityOperations.getPlayedRoles(entity);
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.EntityOperations#getScopedRoles(org.openhealthtools.mdht.uml.hl7.rim.Entity)}
	 * .
	 */
	@Test
	public void testGetScopedRoles() {
		Entity entity = (Entity) getObjectToTest();
		EList<Role> obj = EntityOperations.getScopedRoles(entity);
		fail("Not yet implemented"); //$NON-NLS-1$
	}

} // EntityOperationsTest