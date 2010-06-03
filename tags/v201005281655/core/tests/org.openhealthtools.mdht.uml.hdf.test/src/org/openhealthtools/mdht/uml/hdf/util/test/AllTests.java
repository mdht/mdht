package org.openhealthtools.mdht.uml.hdf.util.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.openhealthtools.mdht.uml.hdf.util.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(RIMProfileUtilTest.class);
		suite.addTestSuite(NamedElementUtilTest.class);
		suite.addTestSuite(HL7ResourceUtilTest.class);
		suite.addTestSuite(XSDDatatypeUtilTest.class);
		suite.addTestSuite(MultiplicityElementUtilTest.class);
		suite.addTestSuite(PropertyUtilTest.class);
		//$JUnit-END$
		return suite;
	}

}
