package org.openhealthtools.mdht.uml.cda.ihe.builder.test;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.builder.SectionBuilder;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IntakeOutputSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.PayersSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.builder.IHEBuilderFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

@SuppressWarnings("unchecked")
public class TestIHEBuilderFactory {

	@Test
	public void testCreateActiveProblemsSectionBuilder() throws Exception {
		SectionBuilder<ActiveProblemsSection> sectionBuilder = IHEBuilderFactory.createActiveProblemsSectionBuilder();
		ActiveProblemsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateAdmissionMedicationHistorySectionBuilder() throws Exception {
		SectionBuilder<AdmissionMedicationHistorySection> sectionBuilder = IHEBuilderFactory.createAdmissionMedicationHistorySectionBuilder();
		AdmissionMedicationHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateAdvanceDirectivesSectionBuilder() throws Exception {
		SectionBuilder<AdvanceDirectivesSection> sectionBuilder = IHEBuilderFactory.createAdvanceDirectivesSectionBuilder();
		AdvanceDirectivesSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateAllergiesReactionsSectionBuilder() throws Exception {
		SectionBuilder<AllergiesReactionsSection> sectionBuilder = IHEBuilderFactory.createAllergiesReactionsSectionBuilder();
		AllergiesReactionsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateAssessmentAndPlanSectionBuilder() throws Exception {
		SectionBuilder<AssessmentAndPlanSection> sectionBuilder = IHEBuilderFactory.createAssessmentAndPlanSectionBuilder();
		AssessmentAndPlanSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateCarePlanSectionBuilder() throws Exception {
		SectionBuilder<CarePlanSection> sectionBuilder = IHEBuilderFactory.createCarePlanSectionBuilder();
		CarePlanSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateChiefComplaintSectionBuilder() throws Exception {
		SectionBuilder<ChiefComplaintSection> sectionBuilder = IHEBuilderFactory.createChiefComplaintSectionBuilder();
		ChiefComplaintSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateCodedResultsSectionBuilder() throws Exception {
		SectionBuilder<CodedResultsSection> sectionBuilder = IHEBuilderFactory.createCodedResultsSectionBuilder();
		CodedResultsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateCodedVitalSignsSectionBuilder() throws Exception {
		SectionBuilder<CodedVitalSignsSection> sectionBuilder = IHEBuilderFactory.createCodedVitalSignsSectionBuilder();
		CodedVitalSignsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateDischargeDiagnosisSectionBuilder() throws Exception {
		SectionBuilder<DischargeDiagnosisSection> sectionBuilder = IHEBuilderFactory.createDischargeDiagnosisSectionBuilder();
		DischargeDiagnosisSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateEncounterHistorySectionBuilder() throws Exception {
		SectionBuilder<EncounterHistorySection> sectionBuilder = IHEBuilderFactory.createEncounterHistorySectionBuilder();
		EncounterHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateFamilyMedicalHistorySectionBuilder() throws Exception {
		SectionBuilder<FamilyMedicalHistorySection> sectionBuilder = IHEBuilderFactory.createFamilyMedicalHistorySectionBuilder();
		FamilyMedicalHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateHistoryOfPastIllnessSectionBuilder() throws Exception {
		SectionBuilder<HistoryOfPastIllnessSection> sectionBuilder = IHEBuilderFactory.createHistoryOfPastIllnessSectionBuilder();
		HistoryOfPastIllnessSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateHospitalAdmissionDiagnosisSectionBuilder() throws Exception {
		SectionBuilder<HospitalAdmissionDiagnosisSection> sectionBuilder = IHEBuilderFactory.createHospitalAdmissionDiagnosisSectionBuilder();
		HospitalAdmissionDiagnosisSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateHospitalCourseSectionBuilder() throws Exception {
		SectionBuilder<HospitalCourseSection> sectionBuilder = IHEBuilderFactory.createHospitalCourseSectionBuilder();
		HospitalCourseSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateHospitalDischargeMedicationsSectionBuilder() throws Exception {
		SectionBuilder<HospitalDischargeMedicationsSection> sectionBuilder = IHEBuilderFactory.createHospitalDischargeMedicationsSectionBuilder();
		HospitalDischargeMedicationsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateImmunizationsSectionBuilder() throws Exception {
		SectionBuilder<ImmunizationsSection> sectionBuilder = IHEBuilderFactory.createImmunizationsSectionBuilder();
		ImmunizationsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateIntakeOutputSectionBuilder() throws Exception {
		SectionBuilder<IntakeOutputSection> sectionBuilder = IHEBuilderFactory.createIntakeOutputSectionBuilder();
		IntakeOutputSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateMedicalDevicesSectionBuilder() throws Exception {
		SectionBuilder<MedicalDevicesSection> sectionBuilder = IHEBuilderFactory.createMedicalDevicesSectionBuilder();
		MedicalDevicesSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateMedicationsAdministeredSectionBuilder() throws Exception {
		SectionBuilder<MedicationsAdministeredSection> sectionBuilder = IHEBuilderFactory.createMedicationsAdministeredSectionBuilder();
		MedicationsAdministeredSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateMedicationsSectionBuilder() throws Exception {
		SectionBuilder<MedicationsSection> sectionBuilder = IHEBuilderFactory.createMedicationsSectionBuilder();
		MedicationsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreatePayersSectionBuilder() throws Exception {
		SectionBuilder<PayersSection> sectionBuilder = IHEBuilderFactory.createPayersSectionBuilder();
		PayersSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreatePhysicalExamNarrativeSectionBuilder() throws Exception {
		SectionBuilder<PhysicalExamNarrativeSection> sectionBuilder = IHEBuilderFactory.createPhysicalExamNarrativeSectionBuilder();
		PhysicalExamNarrativeSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreatePhysicalExamSectionBuilder() throws Exception {
		SectionBuilder<PhysicalExamSection> sectionBuilder = IHEBuilderFactory.createPhysicalExamSectionBuilder();
		PhysicalExamSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreatePregnancyHistorySectionBuilder() throws Exception {
		SectionBuilder<PregnancyHistorySection> sectionBuilder = IHEBuilderFactory.createPregnancyHistorySectionBuilder();
		PregnancyHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateReasonForReferralSectionBuilder() throws Exception {
		SectionBuilder<ReasonForReferralSection> sectionBuilder = IHEBuilderFactory.createReasonForReferralSectionBuilder();
		ReasonForReferralSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateReviewOfSystemsSectionBuilder() throws Exception {
		SectionBuilder<ReviewOfSystemsSection> sectionBuilder = IHEBuilderFactory.createReviewOfSystemsSectionBuilder();
		ReviewOfSystemsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateSocialHistorySectionBuilder() throws Exception {
		SectionBuilder<SocialHistorySection> sectionBuilder = IHEBuilderFactory.createSocialHistorySectionBuilder();
		SocialHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateSurgeriesSectionBuilder() throws Exception {
		SectionBuilder<SurgeriesSection> sectionBuilder = IHEBuilderFactory.createSurgeriesSectionBuilder();
		SurgeriesSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateVitalSignsSectionBuilder() throws Exception {
		SectionBuilder<VitalSignsSection> sectionBuilder = IHEBuilderFactory.createVitalSignsSectionBuilder();
		VitalSignsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

}
