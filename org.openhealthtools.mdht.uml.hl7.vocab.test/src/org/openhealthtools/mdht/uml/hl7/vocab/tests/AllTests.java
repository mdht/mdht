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

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openhealthtools.mdht.uml.hl7.vocab.tests.ActClassTest;
import org.openhealthtools.mdht.uml.hl7.vocab.tests.VocabFactoryTest;

// Nothing
/**
 * This class represents a suite of Junit 4 test cases for HL7 Datatypes.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ActClassTest.class, VocabFactoryTest.class })
public class AllTests {
	/**
	 * @return nothing
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests.class);
	}
}
