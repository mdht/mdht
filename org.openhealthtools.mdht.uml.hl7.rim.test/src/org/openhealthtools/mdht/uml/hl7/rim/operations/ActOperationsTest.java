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

import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("unused")
public abstract class ActOperationsTest extends InfrastructureRootOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations#getClassCode(org.openhealthtools.mdht.uml.hl7.rim.Act)}
	 * .
	 */
	@Test
	public void testGetClassCode() {
		Act act = (Act) getObjectToTest();
		Enumerator obj = act.getClassCode();
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations#getMoodCode(org.openhealthtools.mdht.uml.hl7.rim.Act)}
	 * .
	 */
	@Test
	public void testGetMoodCode() {
		Act act = (Act) getObjectToTest();
		Enumerator obj = act.getMoodCode();
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations#getNegationInd(org.openhealthtools.mdht.uml.hl7.rim.Act)}
	 * .
	 */
	@Test
	public void testGetNegationInd() {
		Act act = (Act) getObjectToTest();
		Boolean obj = act.getNegationInd();
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations#getParticipations(org.openhealthtools.mdht.uml.hl7.rim.Act)}
	 * .
	 */
	@Test
	public void testGetParticipations() {
		Act act = (Act) getObjectToTest();
		EList<Participation> obj = act.getParticipations();
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations#getOutboundRelationships(org.openhealthtools.mdht.uml.hl7.rim.Act)}
	 * .
	 */
	@Test
	public void testGetOutboundRelationships() {
		Act act = (Act) getObjectToTest();
		EList<ActRelationship> obj = act.getOutboundRelationships();
		fail("Not yet implemented"); //$NON-NLS-1$
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.hl7.rim.operations.ActOperations#getInboundRelationships(org.openhealthtools.mdht.uml.hl7.rim.Act)}
	 * .
	 */
	@Test
	public void testGetInboundRelationships() {
		Act act = (Act) getObjectToTest();
		EList<ActRelationship> obj = act.getInboundRelationships();
		fail("Not yet implemented"); //$NON-NLS-1$
	}

} // ActOperationsTest
