package org.openhealthtools.mdht.uml.hl7.vocab.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openhealthtools.mdht.uml.hl7.vocab.VocabFactory;

public class VocabFactoryTest {

	@Test
	public void testInit() {
		org.junit.Assert.assertNotNull(VocabFactory.eINSTANCE.getVocabPackage());
	}

	@Test
	public void testVocabFactoryImpl() {
		fail("Not yet implemented");
	}

}
