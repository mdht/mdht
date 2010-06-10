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

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * This class is a JUnit 4 test case for CDA document deserialization.
 */
@SuppressWarnings("nls")
public class CDADeserliazationTest {

	/**
	 * The sample CDA document.
	 */
	public final static String SAMPLE_DOCUMENT = "resources/SampleCDADocument.xml";

	/**
	 * Test that the sample document can be trivially deserialized.
	 */
	@Test
	public void deserializeSampleCDADocment() {
		try {
			final ClinicalDocument clinicalDocument = CDAUtil
					.load(new FileInputStream(SAMPLE_DOCUMENT));
			assertNotNull(clinicalDocument);
		} catch (FileNotFoundException e) {
			fail(e.getMessage());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	} // deserializeSampleCDADocment
	
} // CDADeserliazationTest