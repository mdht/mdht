package org.openhealthtools.mdht.uml.cda.hitsp.builder.test;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.builder.SectionBuilder;
import org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.builder.HITSPBuilderFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

@SuppressWarnings("unchecked")
public class TestHITSPBuilderFactory {
	

	@Test
	public void testPatientSummaryBuilder() throws Exception {
			DocumentBuilder<PatientSummary> documentBuilder = HITSPBuilderFactory.createPatientSummaryBuilder();			
			PatientSummary document = documentBuilder.buildDocument();
			Assert.assertNotNull(document );
			Diagnostician.INSTANCE.validate(document);
			CDAUtil.save(document , System.out);		
	}

	
	@Test
	public void testUnstructuredDocumentBuilder() throws Exception {
			DocumentBuilder<UnstructuredDocument> documentBuilder = HITSPBuilderFactory.createUnstructuredDocumentBuilder();			
			UnstructuredDocument document = documentBuilder.buildDocument();
			Assert.assertNotNull(document );
			Diagnostician.INSTANCE.validate(document);
			CDAUtil.save(document , System.out);		
	}

	

	@Test
	public void testCreateAdmissionMedicationHistorySectionBuilder() throws Exception {		
		SectionBuilder<AdmissionMedicationHistorySection> sectionBuilder = HITSPBuilderFactory.createAdmissionMedicationHistorySectionBuilder();
		AdmissionMedicationHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateAdvanceDirectivesSectionBuilder() throws Exception {
		SectionBuilder<AdvanceDirectivesSection> sectionBuilder = HITSPBuilderFactory.createAdvanceDirectivesSectionBuilder();
		AdvanceDirectivesSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateAllergiesReactionsSectionBuilder() throws Exception {
		SectionBuilder<AllergiesReactionsSection> sectionBuilder = HITSPBuilderFactory.createAllergiesReactionsSectionBuilder();
		AllergiesReactionsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateAssessmentAndPlanSectionBuilder() throws Exception {
		SectionBuilder<AssessmentAndPlanSection> sectionBuilder = HITSPBuilderFactory.createAssessmentAndPlanSectionBuilder();
		AssessmentAndPlanSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateChiefComplaintSectionBuilder() throws Exception {
		SectionBuilder<ChiefComplaintSection> sectionBuilder = HITSPBuilderFactory.createChiefComplaintSectionBuilder();
		ChiefComplaintSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateDiagnosticResultsSectionBuilder() throws Exception {
		SectionBuilder<DiagnosticResultsSection> sectionBuilder = HITSPBuilderFactory.createDiagnosticResultsSectionBuilder();
		DiagnosticResultsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateDischargeDiagnosisSectionBuilder() throws Exception {
		SectionBuilder<DischargeDiagnosisSection> sectionBuilder = HITSPBuilderFactory.createDischargeDiagnosisSectionBuilder();
		DischargeDiagnosisSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateEncountersSectionBuilder() throws Exception {
		SectionBuilder<EncountersSection> sectionBuilder = HITSPBuilderFactory.createEncountersSectionBuilder();
		EncountersSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateFamilyHistorySectionBuilder() throws Exception {
		SectionBuilder<FamilyHistorySection> sectionBuilder = HITSPBuilderFactory.createFamilyHistorySectionBuilder();
		FamilyHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateFunctionalStatusSectionBuilder() throws Exception {
		SectionBuilder<FunctionalStatusSection> sectionBuilder = HITSPBuilderFactory.createFunctionalStatusSectionBuilder();
		FunctionalStatusSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateHistoryOfPastIllnessSectionBuilder() throws Exception {
		SectionBuilder<HistoryOfPastIllnessSection> sectionBuilder = HITSPBuilderFactory.createHistoryOfPastIllnessSectionBuilder();
		HistoryOfPastIllnessSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateHospitalAdmissionDiagnosisSectionBuilder() throws Exception {
		SectionBuilder<HospitalAdmissionDiagnosisSection> sectionBuilder = HITSPBuilderFactory.createHospitalAdmissionDiagnosisSectionBuilder();
		HospitalAdmissionDiagnosisSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateHospitalCourseSectionBuilder() throws Exception {
		SectionBuilder<HospitalCourseSection> sectionBuilder = HITSPBuilderFactory.createHospitalCourseSectionBuilder();
		HospitalCourseSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateHospitalDischargeMedicationsSectionBuilder() throws Exception {
		SectionBuilder<HospitalDischargeMedicationsSection> sectionBuilder = HITSPBuilderFactory.createHospitalDischargeMedicationsSectionBuilder();
		HospitalDischargeMedicationsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateImmunizationsSectionBuilder() throws Exception {
		SectionBuilder<ImmunizationsSection> sectionBuilder = HITSPBuilderFactory.createImmunizationsSectionBuilder();
		ImmunizationsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateMedicalEquipmentSectionBuilder() throws Exception {
		SectionBuilder<MedicalEquipmentSection> sectionBuilder = HITSPBuilderFactory.createMedicalEquipmentSectionBuilder();
		MedicalEquipmentSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateMedicationsAdministeredSectionBuilder() throws Exception {
		SectionBuilder<MedicationsAdministeredSection> sectionBuilder = HITSPBuilderFactory.createMedicationsAdministeredSectionBuilder();
		MedicationsAdministeredSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateMedicationsSectionBuilder() throws Exception {
		SectionBuilder<MedicationsSection> sectionBuilder = HITSPBuilderFactory.createMedicationsSectionBuilder();
		MedicationsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreatePayersSectionBuilder() throws Exception {
		SectionBuilder<PayersSection> sectionBuilder = HITSPBuilderFactory.createPayersSectionBuilder();
		PayersSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreatePhysicalExamSectionBuilder() throws Exception {
		SectionBuilder<PhysicalExamSection> sectionBuilder = HITSPBuilderFactory.createPhysicalExamSectionBuilder();
		PhysicalExamSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreatePlanOfCareSectionBuilder() throws Exception {
		SectionBuilder<PlanOfCareSection> sectionBuilder = HITSPBuilderFactory.createPlanOfCareSectionBuilder();
		PlanOfCareSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateProblemListSectionBuilder() throws Exception {
		SectionBuilder<ProblemListSection> sectionBuilder = HITSPBuilderFactory.createProblemListSectionBuilder();
		ProblemListSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateReasonForReferralSectionBuilder() throws Exception {
		SectionBuilder<ReasonForReferralSection> sectionBuilder = HITSPBuilderFactory.createReasonForReferralSectionBuilder();
		ReasonForReferralSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateReviewOfSystemsSectionBuilder() throws Exception {
		SectionBuilder<ReviewOfSystemsSection> sectionBuilder = HITSPBuilderFactory.createReviewOfSystemsSectionBuilder();
		ReviewOfSystemsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateSocialHistorySectionBuilder() throws Exception {
		SectionBuilder<SocialHistorySection> sectionBuilder = HITSPBuilderFactory.createSocialHistorySectionBuilder();
		SocialHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateSurgeriesSectionBuilder() throws Exception {
		SectionBuilder<SurgeriesSection> sectionBuilder = HITSPBuilderFactory.createSurgeriesSectionBuilder();
		SurgeriesSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateVitalSignsSectionBuilder() throws Exception {
		SectionBuilder<VitalSignsSection> sectionBuilder = HITSPBuilderFactory.createVitalSignsSectionBuilder();
		VitalSignsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

}
