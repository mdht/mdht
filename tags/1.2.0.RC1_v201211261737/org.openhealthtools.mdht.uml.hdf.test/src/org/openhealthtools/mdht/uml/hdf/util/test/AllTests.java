package org.openhealthtools.mdht.uml.hdf.util.test;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses( {RIMProfileUtilTest.class,NamedElementUtilTest.class,HL7ResourceUtilTest.class,XSDDatatypeUtilTest.class,MultiplicityElementUtilTest.class,PropertyUtilTest.class})
public class AllTests {
	
	public static junit.framework.Test suite() { 
	    return new JUnit4TestAdapter(AllTests.class); 
	}

}
