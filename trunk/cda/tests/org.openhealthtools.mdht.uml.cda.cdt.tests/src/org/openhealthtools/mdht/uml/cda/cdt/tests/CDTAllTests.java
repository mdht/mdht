/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>CDT</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDTAllTests extends TestSuite {

	/**
	* <!-- begin-user-doc --> <!-- end-user-doc -->
	* @generated
	*/
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	* <!-- begin-user-doc --> <!-- end-user-doc -->
	* @generated
	*/
	public static Test suite() {
		TestSuite suite = new CDTAllTests("CDT Tests");
		suite.addTest(CDTTests.suite());
		return suite;
	}

	/**
	* <!-- begin-user-doc --> <!-- end-user-doc -->
	* @generated
	*/
	public CDTAllTests(String name) {
		super(name);
	}

} // CDTAllTests
