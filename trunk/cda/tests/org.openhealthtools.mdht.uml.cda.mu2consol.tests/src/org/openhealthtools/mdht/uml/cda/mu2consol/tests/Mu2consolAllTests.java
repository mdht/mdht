/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class Mu2consolAllTests extends TestSuite {

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new Mu2consolAllTests(" Mu2 Consol Tests");
		suite.addTest(Mu2consolTests.suite());
		return suite;
	}

	public Mu2consolAllTests(String name) {
		super(name);
	}
}
