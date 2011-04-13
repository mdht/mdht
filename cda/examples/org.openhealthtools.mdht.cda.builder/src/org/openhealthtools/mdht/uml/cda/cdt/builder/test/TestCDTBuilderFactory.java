package org.openhealthtools.mdht.uml.cda.cdt.builder.test;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Assert;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.builder.SectionBuilder;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance;
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.PlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.ProgressNote;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.builder.CDTBuilderFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

@SuppressWarnings("unchecked")
public class TestCDTBuilderFactory {

	
	@Test
	public void testCreateAssessmentAndPlanSectionBuilder() throws Exception {
		SectionBuilder<AssessmentAndPlanSection> sectionBuilder = CDTBuilderFactory.createAssessmentAndPlanSectionBuilder();
		AssessmentAndPlanSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateAssessmentAndPlanSectionProcNoteBuilder() throws Exception {
		SectionBuilder<AssessmentAndPlanSectionProcNote> sectionBuilder = CDTBuilderFactory.createAssessmentAndPlanSectionProcNoteBuilder();
		AssessmentAndPlanSectionProcNote section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateAssessmentSectionBuilder() throws Exception {
		SectionBuilder<AssessmentSection> sectionBuilder = CDTBuilderFactory.createAssessmentSectionBuilder();
		AssessmentSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateAssessmentSectionProcNoteBuilder() throws Exception {
		SectionBuilder<AssessmentSectionProcNote> sectionBuilder = CDTBuilderFactory.createAssessmentSectionProcNoteBuilder();
		AssessmentSectionProcNote section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateChiefComplaintSectionBuilder() throws Exception {
		SectionBuilder<ChiefComplaintSection> sectionBuilder = CDTBuilderFactory.createChiefComplaintSectionBuilder();
		ChiefComplaintSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateChiefComplaintSectionProcNoteBuilder() throws Exception {
		SectionBuilder<ChiefComplaintSectionProcNote> sectionBuilder = CDTBuilderFactory.createChiefComplaintSectionProcNoteBuilder();
		ChiefComplaintSectionProcNote section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateConsultationNoteBuilder() throws Exception {
		DocumentBuilder<ConsultationNote> documentBuilder = CDTBuilderFactory.createConsultationNoteBuilder();
		ConsultationNote document = documentBuilder.buildDocument();
		Assert.assertNotNull(document);
		CDAUtil.save(document, System.out);

	}

	@Test
	public void testCreateDiagnosticFindingsBuilder() throws Exception {

		SectionBuilder<DiagnosticFindings> sectionBuilder = CDTBuilderFactory.createDiagnosticFindingsBuilder();
		DiagnosticFindings section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateGeneralHeaderConstraintsBuilder() throws Exception {
		DocumentBuilder<GeneralHeaderConstraints> documentBuilder = CDTBuilderFactory.createGeneralHeaderConstraintsBuilder();
		GeneralHeaderConstraints document = documentBuilder.buildDocument();
		Assert.assertNotNull(document);
		Diagnostician.INSTANCE.validate(document);

		CDAUtil.save(document, System.out);

	}

	@Test
	public void testCreateGeneralStatusSectionBuilder() throws Exception {
		SectionBuilder<GeneralStatusSection> sectionBuilder = CDTBuilderFactory.createGeneralStatusSectionBuilder();
		GeneralStatusSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateHistoryAndPhysicalBuilder() throws Exception {
		DocumentBuilder<HistoryAndPhysical> documentBuilder = CDTBuilderFactory.createHistoryAndPhysicalBuilder();
		HistoryAndPhysical document = documentBuilder.buildDocument();
		Assert.assertNotNull(document);
		Diagnostician.INSTANCE.validate(document);
		CDAUtil.save(document, System.out);

	}

	@Test
	public void testCreateHistoryOfPresentIllnessBuilder() throws Exception {

		SectionBuilder<HistoryOfPresentIllness> sectionBuilder = CDTBuilderFactory.createHistoryOfPresentIllnessBuilder();
		HistoryOfPresentIllness section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);

	}

	@Test
	public void testCreateLevelOneConformanceBuilder() throws Exception {
		DocumentBuilder<LevelOneConformance> documentBuilder = CDTBuilderFactory.createLevelOneConformanceBuilder();
		LevelOneConformance document = documentBuilder.buildDocument();
		Assert.assertNotNull(document);
		Diagnostician.INSTANCE.validate(document);
		CDAUtil.save(document, System.out);

	}

	@Test
	public void testCreateLevelThreeConformanceBuilder() throws Exception {
		DocumentBuilder<LevelThreeConformance> documentBuilder = CDTBuilderFactory.createLevelThreeConformanceBuilder();
		LevelThreeConformance document = documentBuilder.buildDocument();
		Assert.assertNotNull(document);
		Diagnostician.INSTANCE.validate(document);
		CDAUtil.save(document, System.out);

	}

	@Test
	public void testCreateLevelTwoConformanceBuilder() throws Exception {
		DocumentBuilder<LevelTwoConformance> documentBuilder = CDTBuilderFactory.createLevelTwoConformanceBuilder();
		LevelTwoConformance document = documentBuilder.buildDocument();
		Assert.assertNotNull(document);
		Diagnostician.INSTANCE.validate(document);
		CDAUtil.save(document, System.out);

	}

	@Test
	public void testCreateObjectiveSectionBuilder() throws Exception {
		SectionBuilder<ObjectiveSection> sectionBuilder = CDTBuilderFactory.createObjectiveSectionBuilder();
		ObjectiveSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreatePastMedicalHistorySectionBuilder() throws Exception {
		SectionBuilder<PastMedicalHistorySection> sectionBuilder = CDTBuilderFactory.createPastMedicalHistorySectionBuilder();
		PastMedicalHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreatePastMedicalHistorySectionConsultBuilder() throws Exception {
		SectionBuilder<PastMedicalHistorySection> sectionBuilder = CDTBuilderFactory.createPastMedicalHistorySectionBuilder();
		PastMedicalHistorySection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreatePhysicalExaminationSectionBuilder() throws Exception {
		SectionBuilder<PhysicalExaminationSection> sectionBuilder = CDTBuilderFactory.createPhysicalExaminationSectionBuilder();
		PhysicalExaminationSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreatePlanSectionBuilder() throws Exception {
		SectionBuilder<PlanSection> sectionBuilder = CDTBuilderFactory.createPlanSectionBuilder();
		PlanSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateProgressNoteBuilder() throws Exception {
		DocumentBuilder<ProgressNote> documentBuilder = CDTBuilderFactory.createProgressNoteBuilder();
		ProgressNote document = documentBuilder.buildDocument();
		Assert.assertNotNull(document);
		Diagnostician.INSTANCE.validate(document);
		CDAUtil.save(document, System.out);

	}

	@Test
	public void testCreateReasonForReferralSectionBuilder() throws Exception {
		SectionBuilder<ReasonForReferralSection> sectionBuilder = CDTBuilderFactory.createReasonForReferralSectionBuilder();
		ReasonForReferralSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateReasonForVisitAndChiefComplaintSectionBuilder() throws Exception {
		SectionBuilder<ReasonForVisitAndChiefComplaintSection> sectionBuilder = CDTBuilderFactory.createReasonForVisitAndChiefComplaintSectionBuilder();
		ReasonForVisitAndChiefComplaintSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateReasonForVisitSectionBuilder() throws Exception {
		SectionBuilder<ReasonForVisitSection> sectionBuilder = CDTBuilderFactory.createReasonForVisitSectionBuilder();
		ReasonForVisitSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateReasonForVisitSectionConsultBuilder() throws Exception {
		SectionBuilder<ReasonForVisitSectionConsult> sectionBuilder = CDTBuilderFactory.createReasonForVisitSectionConsultBuilder();
		ReasonForVisitSectionConsult section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateReviewOfSystemsSectionBuilder() throws Exception {
		SectionBuilder<ReviewOfSystemsSection> sectionBuilder = CDTBuilderFactory.createReviewOfSystemsSectionBuilder();
		ReviewOfSystemsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateReviewOfSystemsSectionIHEBuilder() throws Exception {
		SectionBuilder<ReviewOfSystemsSectionIHE> sectionBuilder = CDTBuilderFactory.createReviewOfSystemsSectionIHEBuilder();
		ReviewOfSystemsSectionIHE section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateSubjectiveSectionBuilder() throws Exception {
		SectionBuilder<SubjectiveSection> sectionBuilder = CDTBuilderFactory.createSubjectiveSectionBuilder();
		SubjectiveSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

	@Test
	public void testCreateVitalSignsSectionBuilder() throws Exception {
		SectionBuilder<VitalSignsSection> sectionBuilder = CDTBuilderFactory.createVitalSignsSectionBuilder();
		VitalSignsSection section = sectionBuilder.buildSection();
		Assert.assertNotNull(section);
		Diagnostician.INSTANCE.validate(section);
		CDAUtil.saveSnippet(section, System.out);
	}

}
