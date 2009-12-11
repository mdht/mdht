package org.openhealthtools.mdht.uml.common.util.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.openhealthtools.mdht.uml.common.util.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(UMLUtilTest.class);
		//$JUnit-END$
		return suite;
	}

}
