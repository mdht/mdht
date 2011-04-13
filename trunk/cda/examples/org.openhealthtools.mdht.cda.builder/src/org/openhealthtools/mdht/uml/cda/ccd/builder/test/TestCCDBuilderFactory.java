package org.openhealthtools.mdht.uml.cda.ccd.builder.test;

import org.junit.Assert;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.builder.SectionBuilder;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ccd.builder.CCDBuilderFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

@SuppressWarnings("unchecked")
public class TestCCDBuilderFactory {

	@Test
	public void testCreateAdvanceDirectivesSectionBuilder() throws Exception {		
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();					
			SectionBuilder<AdvanceDirectivesSection> sectionBuilder = CCDBuilderFactory.createAdvanceDirectivesSectionBuilder();			
			AdvanceDirectivesSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreateContinuityOfCareDocumentBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();			
			ContinuityOfCareDocument continuityOfCareDocument = clinicalDocumentBuilder.buildDocument();
			Assert.assertNotNull(continuityOfCareDocument );
			CDAUtil.save(continuityOfCareDocument , System.out);		
	}

	@Test
	public void testCreateEncountersSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<EncountersSection> sectionBuilder = CCDBuilderFactory.createEncountersSectionBuilder();			
			EncountersSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreateFamilyHistorySectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<FamilyHistorySection> sectionBuilder = CCDBuilderFactory.createFamilyHistorySectionBuilder();
			FamilyHistorySection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreateImmunizationsSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<ImmunizationsSection> sectionBuilder = CCDBuilderFactory.createImmunizationsSectionBuilder();
			ImmunizationsSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreateMedicalEquipmentSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<MedicalEquipmentSection> sectionBuilder = CCDBuilderFactory.createMedicalEquipmentSectionBuilder();
			MedicalEquipmentSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreateMedicationsSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<MedicationsSection> sectionBuilder = CCDBuilderFactory.createMedicationsSectionBuilder();
			MedicationsSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreatePayersSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<PayersSection> sectionBuilder = CCDBuilderFactory.createPayersSectionBuilder();
			PayersSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreatePlanOfCareSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<PlanOfCareSection> sectionBuilder = CCDBuilderFactory.createPlanOfCareSectionBuilder();
			PlanOfCareSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);	
	}

	@Test
	public void testCreateProblemSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<ProblemSection> sectionBuilder = CCDBuilderFactory.createProblemSectionBuilder();
			ProblemSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);		
	}

	@Test
	public void testCreateProceduresSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<ProceduresSection> sectionBuilder = CCDBuilderFactory.createProceduresSectionBuilder();
			ProceduresSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreatePurposeSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<PurposeSection> sectionBuilder = CCDBuilderFactory.createPurposeSectionBuilder();
			PurposeSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreateResultsSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<ResultsSection> sectionBuilder = CCDBuilderFactory.createResultsSectionBuilder();
			ResultsSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
	}

	@Test
	public void testCreateSocialHistorySectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<SocialHistorySection> sectionBuilder = CCDBuilderFactory.createSocialHistorySectionBuilder();
			SocialHistorySection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
		
	}

	@Test
	public void testCreateVitalSignsSectionBuilder() throws Exception {
			DocumentBuilder<ContinuityOfCareDocument> clinicalDocumentBuilder = CCDBuilderFactory.createContinuityOfCareDocumentBuilder();
			SectionBuilder<VitalSignsSection> sectionBuilder = CCDBuilderFactory.createVitalSignsSectionBuilder();
			VitalSignsSection section = sectionBuilder.buildSection();			
			Assert.assertNotNull(section);
			CDAUtil.save(clinicalDocumentBuilder.with(section).buildDocument(), System.out);
		
	}

}
