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
package org.openhealthtools.mdht.uml.cda.tests;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openhealthtools.mdht.uml.cda.operations.AllCDAOperationsTests;

/**
 * This class represents a suite of JUnit 4 test cases for CDA document
 * processing.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( { CDADeserliazationTest.class, CDASerializationTest.class, AllCDAOperationsTests.class })
public class AllCDATests {
	
	/**
	 * Adapter
	 * @return a test for JUnit 3
	 */
	public static junit.framework.Test suite() { 		
	    return new JUnit4TestAdapter(AllCDATests.class); 
	}
	
	// Nothing
} // AllCDATests