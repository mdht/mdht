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
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings({ "unused", "nls" })
public abstract class ParticipationOperationsTest extends InfrastructureRootOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations#getTypeCode(org.openhealthtools.mdht.uml.hl7.rim.Participation)}
	 * .
	 */
	@Test
	public void testGetTypeCode() {
		Participation pr = (Participation) getObjectToTest();
		Enumerator obj = pr.getTypeCode();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations#getAct(org.openhealthtools.mdht.uml.hl7.rim.Participation)}
	 * .
	 */
	@Test
	public void testGetAct() {
		Participation pr = (Participation) getObjectToTest();
		Act obj = pr.getAct();
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations#getRole(org.openhealthtools.mdht.uml.hl7.rim.Participation)}
	 * .
	 */
	@Test
	public void testGetRole() {
		Participation pr = (Participation) getObjectToTest();
		Role obj = pr.getRole();
		fail("Not yet implemented");
	}

} // ParticipationOperationsTest
