/*******************************************************************************
 * Copyright (c) 2010 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealttools.mdht.uml.cda.util.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import junit.framework.TestCase;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class TestCDAUtil extends TestCase {
	final static String SAMPLECCDDOCUMENT = "platform:/fragment/org.openhealthtools.mdht.uml.cda.util.test/resource/SampleCCDDocument.xml";

	public TestCDAUtil(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
	}

	@Override
	protected void tearDown() throws Exception {
	}

	public void testLoadInputStream() {
		URI sampleCCDURI = URI.createURI(SAMPLECCDDOCUMENT, false);
		sampleCCDURI = CommonPlugin.resolve(sampleCCDURI);
		ClinicalDocument testDocument = null;
		InputStream input;
		if (sampleCCDURI.isFile()) {
			try {
				input = new FileInputStream(sampleCCDURI.path());
				testDocument = CDAUtil.load(input);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		assertNotNull(testDocument);
		assertFalse(
			"CDAUtil.load did not create CCD document, instead created document of type " +
					testDocument.getClass().getName(),
			testDocument.getClass().getName().equals(ClinicalDocumentImpl.class.getName()));
	}
}
