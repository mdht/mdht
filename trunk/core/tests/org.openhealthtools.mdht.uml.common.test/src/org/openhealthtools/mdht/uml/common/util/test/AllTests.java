package org.openhealthtools.mdht.uml.common.util.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses( {UMLUtilTest.class })
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.openhealthtools.mdht.uml.common.util.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(UMLUtilTest.class);
		//$JUnit-END$
		return suite;
	}

}
