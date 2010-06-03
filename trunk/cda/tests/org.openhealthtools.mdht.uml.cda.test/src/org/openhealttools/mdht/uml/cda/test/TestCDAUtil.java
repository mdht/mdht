package org.openhealttools.mdht.uml.cda.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

import junit.framework.TestCase;

public class TestCDAUtil extends TestCase {

	final static String SAMPLECCDDOCUMENT = "platform:/fragment/org.openhealthtools.mdht.uml.cda.test/resource/SampleCCDDocument.xml";

	public TestCDAUtil(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
	}

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
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		assertNotNull(testDocument);
		
		assertFalse("CDAUtil.load did not create CCD document, instead created document of type "+testDocument.getClass().getName(),testDocument.getClass().getName().equals(ClinicalDocumentImpl.class.getName()));

	}

}
