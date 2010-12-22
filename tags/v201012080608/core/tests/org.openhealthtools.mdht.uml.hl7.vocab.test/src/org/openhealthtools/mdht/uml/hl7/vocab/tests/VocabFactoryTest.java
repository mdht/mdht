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
		org.junit.Assert
				.assertNotNull(VocabFactory.eINSTANCE.getVocabPackage());
	}

	/**
	 * 
	 */
	@Test
	public void testVocabFactoryImpl() {
		fail("Not yet implemented");
	}

}
