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
package org.openhealthtools.mdht.uml.hl7.vocab.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabFactory;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class VocabFactoryTest {

	/**
	 * 
	 */
	@Test
	public void testInit() {
		org.junit.Assert.assertNotNull(VocabFactory.eINSTANCE.getVocabPackage());
	}

	/**
	 * 
	 */
	@Test
	public void testVocabFactoryImpl() {
		fail("Not yet implemented");
	}

}
