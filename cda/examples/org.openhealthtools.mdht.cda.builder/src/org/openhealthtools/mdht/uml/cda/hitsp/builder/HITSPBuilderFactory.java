package org.openhealthtools.mdht.uml.cda.hitsp.builder;

import org.openhealthtools.mdht.uml.cda.builder.impl.DocumentBuilderImpl;
import org.openhealthtools.mdht.uml.cda.builder.impl.SectionBuilderImpl;
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
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
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

public class HITSPBuilderFactory {

	private static class AdmissionMedicationHistorySectionBuilder extends SectionBuilderImpl<AdmissionMedicationHistorySection> {
		@Override
		public AdmissionMedicationHistorySection buildSection() {
			AdmissionMedicationHistorySection section = HITSPFactory.eINSTANCE.createAdmissionMedicationHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class AdvanceDirectivesSectionBuilder extends SectionBuilderImpl<AdvanceDirectivesSection> {
		@Override
		public AdvanceDirectivesSection buildSection() {
			AdvanceDirectivesSection section = HITSPFactory.eINSTANCE.createAdvanceDirectivesSection().init();
			construct(section);
			return section;
		}
	}

	private static class AllergiesReactionsSectionBuilder extends SectionBuilderImpl<AllergiesReactionsSection> {
		@Override
		public AllergiesReactionsSection buildSection() {
			AllergiesReactionsSection section = HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();
			construct(section);
			return section;
		}
	}

	private static class AssessmentAndPlanSectionBuilder extends SectionBuilderImpl<AssessmentAndPlanSection> {
		@Override
		public AssessmentAndPlanSection buildSection() {
			AssessmentAndPlanSection section = HITSPFactory.eINSTANCE.createAssessmentAndPlanSection().init();
			construct(section);
			return section;
		}
	}

	private static class ChiefComplaintSectionBuilder extends SectionBuilderImpl<ChiefComplaintSection> {
		@Override
		public ChiefComplaintSection buildSection() {
			ChiefComplaintSection section = HITSPFactory.eINSTANCE.createChiefComplaintSection().init();
			construct(section);
			return section;
		}
	}

	private static class DiagnosticResultsSectionBuilder extends SectionBuilderImpl<DiagnosticResultsSection> {
		@Override
		public DiagnosticResultsSection buildSection() {
			DiagnosticResultsSection section = HITSPFactory.eINSTANCE.createDiagnosticResultsSection().init();
			construct(section);
			return section;
		}
	}

	private static class DischargeDiagnosisSectionBuilder extends SectionBuilderImpl<DischargeDiagnosisSection> {
		@Override
		public DischargeDiagnosisSection buildSection() {
			DischargeDiagnosisSection section = HITSPFactory.eINSTANCE.createDischargeDiagnosisSection().init();
			construct(section);
			return section;
		}
	}

	private static class EncountersSectionBuilder extends SectionBuilderImpl<EncountersSection> {
		@Override
		public EncountersSection buildSection() {
			EncountersSection section = HITSPFactory.eINSTANCE.createEncountersSection().init();
			construct(section);
			return section;
		}
	}

	private static class FamilyHistorySectionBuilder extends SectionBuilderImpl<FamilyHistorySection> {
		@Override
		public FamilyHistorySection buildSection() {
			FamilyHistorySection section = HITSPFactory.eINSTANCE.createFamilyHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class FunctionalStatusSectionBuilder extends SectionBuilderImpl<FunctionalStatusSection> {
		@Override
		public FunctionalStatusSection buildSection() {
			FunctionalStatusSection section = HITSPFactory.eINSTANCE.createFunctionalStatusSection().init();
			construct(section);
			return section;
		}
	}

	private static class HistoryOfPastIllnessSectionBuilder extends SectionBuilderImpl<HistoryOfPastIllnessSection> {
		@Override
		public HistoryOfPastIllnessSection buildSection() {
			HistoryOfPastIllnessSection section = HITSPFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();
			construct(section);
			return section;
		}
	}

	private static class HospitalAdmissionDiagnosisSectionBuilder extends SectionBuilderImpl<HospitalAdmissionDiagnosisSection> {
		@Override
		public HospitalAdmissionDiagnosisSection buildSection() {
			HospitalAdmissionDiagnosisSection section = HITSPFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
			construct(section);
			return section;
		}
	}

	private static class HospitalCourseSectionBuilder extends SectionBuilderImpl<HospitalCourseSection> {
		@Override
		public HospitalCourseSection buildSection() {
			HospitalCourseSection section = HITSPFactory.eINSTANCE.createHospitalCourseSection().init();
			construct(section);
			return section;
		}
	}

	private static class HospitalDischargeMedicationsSectionBuilder extends SectionBuilderImpl<HospitalDischargeMedicationsSection> {
		@Override
		public HospitalDischargeMedicationsSection buildSection() {
			HospitalDischargeMedicationsSection section = HITSPFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init();
			construct(section);
			return section;
		}
	}

	private static class ImmunizationsSectionBuilder extends SectionBuilderImpl<ImmunizationsSection> {
		@Override
		public ImmunizationsSection buildSection() {
			ImmunizationsSection section = HITSPFactory.eINSTANCE.createImmunizationsSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicalEquipmentSectionBuilder extends SectionBuilderImpl<MedicalEquipmentSection> {
		@Override
		public MedicalEquipmentSection buildSection() {
			MedicalEquipmentSection section = HITSPFactory.eINSTANCE.createMedicalEquipmentSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicationsAdministeredSectionBuilder extends SectionBuilderImpl<MedicationsAdministeredSection> {
		@Override
		public MedicationsAdministeredSection buildSection() {
			MedicationsAdministeredSection section = HITSPFactory.eINSTANCE.createMedicationsAdministeredSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicationsSectionBuilder extends SectionBuilderImpl<MedicationsSection> {
		@Override
		public MedicationsSection buildSection() {
			MedicationsSection section = HITSPFactory.eINSTANCE.createMedicationsSection().init();
			construct(section);
			return section;
		}
	}

	
	private static class PatientSummaryBuilder extends DocumentBuilderImpl<PatientSummary> {

		@Override
		public PatientSummary buildDocument() {
			PatientSummary document = HITSPFactory.eINSTANCE.createPatientSummary().init();
			construct(document);
			return document;
		}
	}

	
	private static class PayersSectionBuilder extends SectionBuilderImpl<PayersSection> {
		@Override
		public PayersSection buildSection() {
			PayersSection section = HITSPFactory.eINSTANCE.createPayersSection().init();
			construct(section);
			return section;
		}
	}

	private static class PhysicalExamSectionBuilder extends SectionBuilderImpl<PhysicalExamSection> {
		@Override
		public PhysicalExamSection buildSection() {
			PhysicalExamSection section = HITSPFactory.eINSTANCE.createPhysicalExamSection().init();
			construct(section);
			return section;
		}
	}

	private static class PlanOfCareSectionBuilder extends SectionBuilderImpl<PlanOfCareSection> {
		@Override
		public PlanOfCareSection buildSection() {
			PlanOfCareSection section = HITSPFactory.eINSTANCE.createPlanOfCareSection().init();
			construct(section);
			return section;
		}
	}

	private static class ProblemListSectionBuilder extends SectionBuilderImpl<ProblemListSection> {
		@Override
		public ProblemListSection buildSection() {
			ProblemListSection section = HITSPFactory.eINSTANCE.createProblemListSection().init();
			construct(section);
			return section;
		}
	}

	private static class ReasonForReferralSectionBuilder extends SectionBuilderImpl<ReasonForReferralSection> {
		@Override
		public ReasonForReferralSection buildSection() {
			ReasonForReferralSection section = HITSPFactory.eINSTANCE.createReasonForReferralSection().init();
			construct(section);
			return section;
		}
	}

	private static class ReviewOfSystemsSectionBuilder extends SectionBuilderImpl<ReviewOfSystemsSection> {
		@Override
		public ReviewOfSystemsSection buildSection() {
			ReviewOfSystemsSection section = HITSPFactory.eINSTANCE.createReviewOfSystemsSection().init();
			construct(section);
			return section;
		}
	}

	private static class SocialHistorySectionBuilder extends SectionBuilderImpl<SocialHistorySection> {
		@Override
		public SocialHistorySection buildSection() {
			SocialHistorySection section = HITSPFactory.eINSTANCE.createSocialHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class SurgeriesSectionBuilder extends SectionBuilderImpl<SurgeriesSection> {
		@Override
		public SurgeriesSection buildSection() {
			SurgeriesSection section = HITSPFactory.eINSTANCE.createSurgeriesSection().init();
			construct(section);
			return section;
		}
	}

	private static class UnstructuredDocumentBuilder extends DocumentBuilderImpl<UnstructuredDocument> {

		@Override
		public UnstructuredDocument buildDocument() {
			UnstructuredDocument document = HITSPFactory.eINSTANCE.createUnstructuredDocument().init();
			construct(document);
			return document;
		}
	}

	private static class VitalSignsSectionBuilder extends SectionBuilderImpl<VitalSignsSection> {
		@Override
		public VitalSignsSection buildSection() {
			VitalSignsSection section = HITSPFactory.eINSTANCE.createVitalSignsSection().init();
			construct(section);
			return section;
		}
	}

	public static AdmissionMedicationHistorySectionBuilder createAdmissionMedicationHistorySectionBuilder() {
		return new AdmissionMedicationHistorySectionBuilder();
	}

	public static AdvanceDirectivesSectionBuilder createAdvanceDirectivesSectionBuilder() {
		return new AdvanceDirectivesSectionBuilder();
	}

	public static AllergiesReactionsSectionBuilder createAllergiesReactionsSectionBuilder() {
		return new AllergiesReactionsSectionBuilder();
	}

	public static AssessmentAndPlanSectionBuilder createAssessmentAndPlanSectionBuilder() {
		return new AssessmentAndPlanSectionBuilder();
	}

	public static ChiefComplaintSectionBuilder createChiefComplaintSectionBuilder() {
		return new ChiefComplaintSectionBuilder();
	}

	public static DiagnosticResultsSectionBuilder createDiagnosticResultsSectionBuilder() {
		return new DiagnosticResultsSectionBuilder();
	}

	public static DischargeDiagnosisSectionBuilder createDischargeDiagnosisSectionBuilder() {
		return new DischargeDiagnosisSectionBuilder();
	}

	public static EncountersSectionBuilder createEncountersSectionBuilder() {
		return new EncountersSectionBuilder();
	}

	public static FamilyHistorySectionBuilder createFamilyHistorySectionBuilder() {
		return new FamilyHistorySectionBuilder();
	}

	public static FunctionalStatusSectionBuilder createFunctionalStatusSectionBuilder() {
		return new FunctionalStatusSectionBuilder();
	}

	public static HistoryOfPastIllnessSectionBuilder createHistoryOfPastIllnessSectionBuilder() {
		return new HistoryOfPastIllnessSectionBuilder();
	}

	public static HospitalAdmissionDiagnosisSectionBuilder createHospitalAdmissionDiagnosisSectionBuilder() {
		return new HospitalAdmissionDiagnosisSectionBuilder();
	}

	public static HospitalCourseSectionBuilder createHospitalCourseSectionBuilder() {
		return new HospitalCourseSectionBuilder();
	}

	public static HospitalDischargeMedicationsSectionBuilder createHospitalDischargeMedicationsSectionBuilder() {
		return new HospitalDischargeMedicationsSectionBuilder();
	}

	public static ImmunizationsSectionBuilder createImmunizationsSectionBuilder() {
		return new ImmunizationsSectionBuilder();
	}

	public static MedicalEquipmentSectionBuilder createMedicalEquipmentSectionBuilder() {
		return new MedicalEquipmentSectionBuilder();
	}

	public static MedicationsAdministeredSectionBuilder createMedicationsAdministeredSectionBuilder() {
		return new MedicationsAdministeredSectionBuilder();
	}

	public static MedicationsSectionBuilder createMedicationsSectionBuilder() {
		return new MedicationsSectionBuilder();
	}

	public static PatientSummaryBuilder createPatientSummaryBuilder() {
		return new PatientSummaryBuilder();
	}

	public static PayersSectionBuilder createPayersSectionBuilder() {
		return new PayersSectionBuilder();
	}

	public static PhysicalExamSectionBuilder createPhysicalExamSectionBuilder() {
		return new PhysicalExamSectionBuilder();
	}

	public static PlanOfCareSectionBuilder createPlanOfCareSectionBuilder() {
		return new PlanOfCareSectionBuilder();
	}

	public static ProblemListSectionBuilder createProblemListSectionBuilder() {
		return new ProblemListSectionBuilder();
	}

	public static ReasonForReferralSectionBuilder createReasonForReferralSectionBuilder() {
		return new ReasonForReferralSectionBuilder();
	}

	public static ReviewOfSystemsSectionBuilder createReviewOfSystemsSectionBuilder() {
		return new ReviewOfSystemsSectionBuilder();
	}

	public static SocialHistorySectionBuilder createSocialHistorySectionBuilder() {
		return new SocialHistorySectionBuilder();
	}

	public static SurgeriesSectionBuilder createSurgeriesSectionBuilder() {
		return new SurgeriesSectionBuilder();
	}

	public static UnstructuredDocumentBuilder createUnstructuredDocumentBuilder() {
		return new UnstructuredDocumentBuilder();
	}

	public static VitalSignsSectionBuilder createVitalSignsSectionBuilder() {
		return new VitalSignsSectionBuilder();
	}

}
