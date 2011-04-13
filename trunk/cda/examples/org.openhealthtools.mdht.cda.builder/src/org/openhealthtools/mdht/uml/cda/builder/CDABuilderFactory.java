package org.openhealthtools.mdht.uml.cda.builder;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.builder.impl.DocumentBuilderImpl;
import org.openhealthtools.mdht.uml.cda.builder.impl.PatientBuilderImpl;
import org.openhealthtools.mdht.uml.cda.builder.impl.SectionBuilderImpl;

public class CDABuilderFactory {

	public static class ClinicalDocumentBuilder extends DocumentBuilderImpl<ClinicalDocument> {

		public ClinicalDocument buildDocument() {
			ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
			construct(clinicalDocument);
			return clinicalDocument;

		}

	}

	public static class SectionBuilder extends SectionBuilderImpl<Section> {

		@Override
		public Section buildSection() {
			Section section = CDAFactory.eINSTANCE.createSection();
			construct(section);
			return section;
		}

	}

	public static DocumentBuilder<ClinicalDocument> createClinicalDocumentBuilder() {
		return new ClinicalDocumentBuilder();
	}

	public static org.openhealthtools.mdht.uml.cda.builder.SectionBuilder<Section>  createSectionBuilder() {
		return new SectionBuilder();
	}
	
	public static PatientBuilder  createPatientBuilder() {
		return new PatientBuilderImpl();
	}

}
