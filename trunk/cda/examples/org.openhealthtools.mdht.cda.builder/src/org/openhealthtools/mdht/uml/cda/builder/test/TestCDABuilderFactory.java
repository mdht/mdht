package org.openhealthtools.mdht.uml.cda.builder.test;

import org.junit.Assert;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.builder.CDABuilderFactory;
import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.builder.SectionBuilder;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

public class TestCDABuilderFactory {

	@Test
	public void testCreateClinicalDocumentBuilder() throws Exception {
		DocumentBuilder<ClinicalDocument> clinicalDocumentBuilder = CDABuilderFactory.createClinicalDocumentBuilder();		
		ClinicalDocument clinicalDocument = clinicalDocumentBuilder.buildDocument();
		Assert.assertNotNull(clinicalDocument );
		CDAUtil.save(clinicalDocument , System.out);

	}

	@Test
	public void testCreateSectionBuilder() throws Exception {
		DocumentBuilder<ClinicalDocument> clinicalDocumentBuilder = CDABuilderFactory.createClinicalDocumentBuilder();			
		SectionBuilder<Section> sectionBuilder = CDABuilderFactory.createSectionBuilder();			
		Section section = sectionBuilder.buildSection();			
		Assert.assertNotNull(section);
		CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);	}

}
