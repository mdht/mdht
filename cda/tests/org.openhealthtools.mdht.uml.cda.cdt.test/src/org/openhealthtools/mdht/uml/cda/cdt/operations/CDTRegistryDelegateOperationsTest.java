/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import static org.junit.Assert.fail;

import org.eclipse.emf.ecore.EClass;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings({ "nls", "unused" })
public class CDTRegistryDelegateOperationsTest {

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.CDTRegistryDelegateOperations#getEClass(org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate, java.lang.String, java.lang.Object)}
	 * .
	 */
	@Test
	public void testGetEClass() {
		CDTRegistryDelegate cdtrd = CDTFactory.eINSTANCE.createCDTRegistryDelegate();
		EClass obj = CDTRegistryDelegateOperations.getEClass(cdtrd, "", null);
		fail("Not yet implemented");
	}

} // CDTRegistryDelegateOperationsTest
