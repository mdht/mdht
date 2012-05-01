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
package org.openhealthtools.mdht.uml.cda.toc.tests;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>toc</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		DischargeSummaryTest.class, DischargeInstructionsTest.class, ConsultationSummaryTest.class,
		ConsultationRequestTest.class })
public class ToCTests {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(ToCTests.class);
	}

} // ToCTests
