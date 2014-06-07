/*******************************************************************************
 * Copyright (c) 2010, 2011 Sean Muir
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.builder;

import org.openhealthtools.mdht.uml.cda.builder.impl.DocumentBuilderImpl;
import org.openhealthtools.mdht.uml.cda.builder.impl.SectionBuilderImpl;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
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
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
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

public class CDTBuilderFactory {

	private static class AssessmentAndPlanSectionBuilder extends SectionBuilderImpl<AssessmentAndPlanSection> {
		@Override
		public AssessmentAndPlanSection buildSection() {
			AssessmentAndPlanSection section = CDTFactory.eINSTANCE.createAssessmentAndPlanSection().init();
			construct(section);
			return section;
		}
	}

	private static class AssessmentAndPlanSectionProcNoteBuilder extends
			SectionBuilderImpl<AssessmentAndPlanSectionProcNote> {
		@Override
		public AssessmentAndPlanSectionProcNote buildSection() {
			AssessmentAndPlanSectionProcNote section = CDTFactory.eINSTANCE.createAssessmentAndPlanSectionProcNote().init();
			construct(section);
			return section;
		}
	}

	private static class AssessmentSectionBuilder extends SectionBuilderImpl<AssessmentSection> {
		@Override
		public AssessmentSection buildSection() {
			AssessmentSection section = CDTFactory.eINSTANCE.createAssessmentSection().init();
			construct(section);
			return section;
		}
	}

	private static class AssessmentSectionProcNoteBuilder extends SectionBuilderImpl<AssessmentSectionProcNote> {
		@Override
		public AssessmentSectionProcNote buildSection() {
			AssessmentSectionProcNote section = CDTFactory.eINSTANCE.createAssessmentSectionProcNote().init();
			construct(section);
			return section;
		}
	}

	private static class ChiefComplaintSectionBuilder extends SectionBuilderImpl<ChiefComplaintSection> {
		@Override
		public ChiefComplaintSection buildSection() {
			ChiefComplaintSection section = CDTFactory.eINSTANCE.createChiefComplaintSection().init();
			construct(section);
			return section;
		}
	}

	private static class ChiefComplaintSectionProcNoteBuilder extends SectionBuilderImpl<ChiefComplaintSectionProcNote> {
		@Override
		public ChiefComplaintSectionProcNote buildSection() {
			ChiefComplaintSectionProcNote section = CDTFactory.eINSTANCE.createChiefComplaintSectionProcNote().init();
			construct(section);
			return section;
		}
	}

	private static class ConsultationNoteBuilder extends DocumentBuilderImpl<ConsultationNote> {

		@Override
		public ConsultationNote buildDocument() {
			ConsultationNote document = CDTFactory.eINSTANCE.createConsultationNote().init();
			construct(document);
			return document;
		}
	}

	private static class DiagnosticFindingsBuilder extends SectionBuilderImpl<DiagnosticFindings> {
		@Override
		public DiagnosticFindings buildSection() {
			DiagnosticFindings section = CDTFactory.eINSTANCE.createDiagnosticFindings().init();
			construct(section);
			return section;
		}
	}

	private static class GeneralHeaderConstraintsBuilder extends DocumentBuilderImpl<GeneralHeaderConstraints> {

		@Override
		public GeneralHeaderConstraints buildDocument() {
			GeneralHeaderConstraints document = CDTFactory.eINSTANCE.createGeneralHeaderConstraints().init();
			construct(document);
			return document;
		}
	}

	private static class GeneralStatusSectionBuilder extends SectionBuilderImpl<GeneralStatusSection> {
		@Override
		public GeneralStatusSection buildSection() {
			GeneralStatusSection section = CDTFactory.eINSTANCE.createGeneralStatusSection().init();
			construct(section);
			return section;
		}
	}

	private static class HistoryAndPhysicalBuilder extends DocumentBuilderImpl<HistoryAndPhysical> {

		@Override
		public HistoryAndPhysical buildDocument() {
			HistoryAndPhysical document = CDTFactory.eINSTANCE.createHistoryAndPhysical().init();
			construct(document);
			return document;
		}
	}

	private static class HistoryOfPresentIllnessBuilder extends SectionBuilderImpl<HistoryOfPresentIllness> {
		@Override
		public HistoryOfPresentIllness buildSection() {
			HistoryOfPresentIllness section = CDTFactory.eINSTANCE.createHistoryOfPresentIllness().init();
			construct(section);
			return section;
		}
	}

	private static class LevelOneConformanceBuilder extends DocumentBuilderImpl<LevelOneConformance> {

		@Override
		public LevelOneConformance buildDocument() {
			LevelOneConformance document = CDTFactory.eINSTANCE.createLevelOneConformance().init();
			construct(document);
			return document;
		}
	}

	private static class LevelThreeConformanceBuilder extends DocumentBuilderImpl<LevelThreeConformance> {

		@Override
		public LevelThreeConformance buildDocument() {
			LevelThreeConformance document = CDTFactory.eINSTANCE.createLevelThreeConformance().init();
			construct(document);
			return document;
		}
	}

	private static class LevelTwoConformanceBuilder extends DocumentBuilderImpl<LevelTwoConformance> {

		@Override
		public LevelTwoConformance buildDocument() {
			LevelTwoConformance document = CDTFactory.eINSTANCE.createLevelTwoConformance().init();
			construct(document);
			return document;
		}
	}

	private static class ObjectiveSectionBuilder extends SectionBuilderImpl<ObjectiveSection> {
		@Override
		public ObjectiveSection buildSection() {
			ObjectiveSection section = CDTFactory.eINSTANCE.createObjectiveSection().init();
			construct(section);
			return section;
		}
	}

	private static class PastMedicalHistorySectionBuilder extends SectionBuilderImpl<PastMedicalHistorySection> {
		@Override
		public PastMedicalHistorySection buildSection() {
			PastMedicalHistorySection section = CDTFactory.eINSTANCE.createPastMedicalHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class PastMedicalHistorySectionConsultBuilder extends
			SectionBuilderImpl<PastMedicalHistorySectionConsult> {
		@Override
		public PastMedicalHistorySectionConsult buildSection() {
			PastMedicalHistorySectionConsult section = CDTFactory.eINSTANCE.createPastMedicalHistorySectionConsult().init();
			construct(section);
			return section;
		}
	}

	private static class PhysicalExaminationSectionBuilder extends SectionBuilderImpl<PhysicalExaminationSection> {
		@Override
		public PhysicalExaminationSection buildSection() {
			PhysicalExaminationSection section = CDTFactory.eINSTANCE.createPhysicalExaminationSection().init();
			construct(section);
			return section;
		}
	}

	private static class PlanSectionBuilder extends SectionBuilderImpl<PlanSection> {
		@Override
		public PlanSection buildSection() {
			PlanSection section = CDTFactory.eINSTANCE.createPlanSection().init();
			construct(section);
			return section;
		}
	}

	private static class ProgressNoteBuilder extends DocumentBuilderImpl<ProgressNote> {

		@Override
		public ProgressNote buildDocument() {
			ProgressNote document = CDTFactory.eINSTANCE.createProgressNote().init();
			construct(document);
			return document;
		}
	}

	private static class ReasonForReferralSectionBuilder extends SectionBuilderImpl<ReasonForReferralSection> {
		@Override
		public ReasonForReferralSection buildSection() {
			ReasonForReferralSection section = CDTFactory.eINSTANCE.createReasonForReferralSection().init();
			construct(section);
			return section;
		}
	}

	private static class ReasonForVisitAndChiefComplaintSectionBuilder extends
			SectionBuilderImpl<ReasonForVisitAndChiefComplaintSection> {
		@Override
		public ReasonForVisitAndChiefComplaintSection buildSection() {
			ReasonForVisitAndChiefComplaintSection section = CDTFactory.eINSTANCE.createReasonForVisitAndChiefComplaintSection().init();
			construct(section);
			return section;
		}
	}

	private static class ReasonForVisitSectionBuilder extends SectionBuilderImpl<ReasonForVisitSection> {
		@Override
		public ReasonForVisitSection buildSection() {
			ReasonForVisitSection section = CDTFactory.eINSTANCE.createReasonForVisitSection().init();
			construct(section);
			return section;
		}
	}

	private static class ReasonForVisitSectionConsultBuilder extends SectionBuilderImpl<ReasonForVisitSectionConsult> {
		@Override
		public ReasonForVisitSectionConsult buildSection() {
			ReasonForVisitSectionConsult section = CDTFactory.eINSTANCE.createReasonForVisitSectionConsult().init();
			construct(section);
			return section;
		}
	}

	private static class ReviewOfSystemsSectionBuilder extends SectionBuilderImpl<ReviewOfSystemsSection> {
		@Override
		public ReviewOfSystemsSection buildSection() {
			ReviewOfSystemsSection section = CDTFactory.eINSTANCE.createReviewOfSystemsSection().init();
			construct(section);
			return section;
		}
	}

	private static class ReviewOfSystemsSectionIHEBuilder extends SectionBuilderImpl<ReviewOfSystemsSectionIHE> {
		@Override
		public ReviewOfSystemsSectionIHE buildSection() {
			ReviewOfSystemsSectionIHE section = CDTFactory.eINSTANCE.createReviewOfSystemsSectionIHE().init();
			construct(section);
			return section;
		}
	}

	private static class SubjectiveSectionBuilder extends SectionBuilderImpl<SubjectiveSection> {
		@Override
		public SubjectiveSection buildSection() {
			SubjectiveSection section = CDTFactory.eINSTANCE.createSubjectiveSection().init();
			construct(section);
			return section;
		}
	}

	private static class VitalSignsSectionBuilder extends SectionBuilderImpl<VitalSignsSection> {
		@Override
		public VitalSignsSection buildSection() {
			VitalSignsSection section = CDTFactory.eINSTANCE.createVitalSignsSection().init();
			construct(section);
			return section;
		}
	}

	public static AssessmentAndPlanSectionBuilder createAssessmentAndPlanSectionBuilder() {
		return new AssessmentAndPlanSectionBuilder();
	}

	public static AssessmentAndPlanSectionProcNoteBuilder createAssessmentAndPlanSectionProcNoteBuilder() {
		return new AssessmentAndPlanSectionProcNoteBuilder();
	}

	public static AssessmentSectionBuilder createAssessmentSectionBuilder() {
		return new AssessmentSectionBuilder();
	}

	public static AssessmentSectionProcNoteBuilder createAssessmentSectionProcNoteBuilder() {
		return new AssessmentSectionProcNoteBuilder();
	}

	public static ChiefComplaintSectionBuilder createChiefComplaintSectionBuilder() {
		return new ChiefComplaintSectionBuilder();
	}

	public static ChiefComplaintSectionProcNoteBuilder createChiefComplaintSectionProcNoteBuilder() {
		return new ChiefComplaintSectionProcNoteBuilder();
	}

	public static ConsultationNoteBuilder createConsultationNoteBuilder() {
		return new ConsultationNoteBuilder();
	}

	public static DiagnosticFindingsBuilder createDiagnosticFindingsBuilder() {
		return new DiagnosticFindingsBuilder();
	}

	public static GeneralHeaderConstraintsBuilder createGeneralHeaderConstraintsBuilder() {
		return new GeneralHeaderConstraintsBuilder();
	}

	public static GeneralStatusSectionBuilder createGeneralStatusSectionBuilder() {
		return new GeneralStatusSectionBuilder();
	}

	public static HistoryAndPhysicalBuilder createHistoryAndPhysicalBuilder() {
		return new HistoryAndPhysicalBuilder();
	}

	public static HistoryOfPresentIllnessBuilder createHistoryOfPresentIllnessBuilder() {
		return new HistoryOfPresentIllnessBuilder();
	}

	public static LevelOneConformanceBuilder createLevelOneConformanceBuilder() {
		return new LevelOneConformanceBuilder();
	}

	public static LevelThreeConformanceBuilder createLevelThreeConformanceBuilder() {
		return new LevelThreeConformanceBuilder();
	}

	public static LevelTwoConformanceBuilder createLevelTwoConformanceBuilder() {
		return new LevelTwoConformanceBuilder();
	}

	public static ObjectiveSectionBuilder createObjectiveSectionBuilder() {
		return new ObjectiveSectionBuilder();
	}

	public static PastMedicalHistorySectionBuilder createPastMedicalHistorySectionBuilder() {
		return new PastMedicalHistorySectionBuilder();
	}

	public static PastMedicalHistorySectionConsultBuilder createPastMedicalHistorySectionConsultBuilder() {
		return new PastMedicalHistorySectionConsultBuilder();
	}

	public static PhysicalExaminationSectionBuilder createPhysicalExaminationSectionBuilder() {
		return new PhysicalExaminationSectionBuilder();
	}

	public static PlanSectionBuilder createPlanSectionBuilder() {
		return new PlanSectionBuilder();
	}

	public static ProgressNoteBuilder createProgressNoteBuilder() {
		return new ProgressNoteBuilder();
	}

	public static ReasonForReferralSectionBuilder createReasonForReferralSectionBuilder() {
		return new ReasonForReferralSectionBuilder();
	}

	public static ReasonForVisitAndChiefComplaintSectionBuilder createReasonForVisitAndChiefComplaintSectionBuilder() {
		return new ReasonForVisitAndChiefComplaintSectionBuilder();
	}

	public static ReasonForVisitSectionBuilder createReasonForVisitSectionBuilder() {
		return new ReasonForVisitSectionBuilder();
	}

	public static ReasonForVisitSectionConsultBuilder createReasonForVisitSectionConsultBuilder() {
		return new ReasonForVisitSectionConsultBuilder();
	}

	public static ReviewOfSystemsSectionBuilder createReviewOfSystemsSectionBuilder() {
		return new ReviewOfSystemsSectionBuilder();
	}

	public static ReviewOfSystemsSectionIHEBuilder createReviewOfSystemsSectionIHEBuilder() {
		return new ReviewOfSystemsSectionIHEBuilder();
	}

	public static SubjectiveSectionBuilder createSubjectiveSectionBuilder() {
		return new SubjectiveSectionBuilder();
	}

	public static VitalSignsSectionBuilder createVitalSignsSectionBuilder() {
		return new VitalSignsSectionBuilder();
	}

}
