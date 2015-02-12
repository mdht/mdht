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
package org.openhealthtools.mdht.uml.cda.ihe.builder;

import org.openhealthtools.mdht.uml.cda.builder.impl.SectionBuilderImpl;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
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

public class IHEBuilderFactory {

	private static class ActiveProblemsSectionBuilder extends SectionBuilderImpl<ActiveProblemsSection> {
		@Override
		public ActiveProblemsSection buildSection() {
			ActiveProblemsSection section = IHEFactory.eINSTANCE.createActiveProblemsSection().init();
			construct(section);
			return section;
		}
	}

	private static class AdmissionMedicationHistorySectionBuilder extends
			SectionBuilderImpl<AdmissionMedicationHistorySection> {
		@Override
		public AdmissionMedicationHistorySection buildSection() {
			AdmissionMedicationHistorySection section = IHEFactory.eINSTANCE.createAdmissionMedicationHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class AdvanceDirectivesSectionBuilder extends SectionBuilderImpl<AdvanceDirectivesSection> {
		@Override
		public AdvanceDirectivesSection buildSection() {
			AdvanceDirectivesSection section = IHEFactory.eINSTANCE.createAdvanceDirectivesSection().init();
			construct(section);
			return section;
		}
	}

	private static class AllergiesReactionsSectionBuilder extends SectionBuilderImpl<AllergiesReactionsSection> {
		@Override
		public AllergiesReactionsSection buildSection() {
			AllergiesReactionsSection section = IHEFactory.eINSTANCE.createAllergiesReactionsSection().init();
			construct(section);
			return section;
		}
	}

	private static class AssessmentAndPlanSectionBuilder extends SectionBuilderImpl<AssessmentAndPlanSection> {
		@Override
		public AssessmentAndPlanSection buildSection() {
			AssessmentAndPlanSection section = IHEFactory.eINSTANCE.createAssessmentAndPlanSection().init();
			construct(section);
			return section;
		}
	}

	private static class CarePlanSectionBuilder extends SectionBuilderImpl<CarePlanSection> {
		@Override
		public CarePlanSection buildSection() {
			CarePlanSection section = IHEFactory.eINSTANCE.createCarePlanSection().init();
			construct(section);
			return section;
		}
	}

	private static class ChiefComplaintSectionBuilder extends SectionBuilderImpl<ChiefComplaintSection> {
		@Override
		public ChiefComplaintSection buildSection() {
			ChiefComplaintSection section = IHEFactory.eINSTANCE.createChiefComplaintSection().init();
			construct(section);
			return section;
		}
	}

	private static class CodedAdvanceDirectivesSectionBuilder extends SectionBuilderImpl<CodedAdvanceDirectivesSection> {
		@Override
		public CodedAdvanceDirectivesSection buildSection() {
			CodedAdvanceDirectivesSection section = IHEFactory.eINSTANCE.createCodedAdvanceDirectivesSection().init();
			construct(section);
			return section;
		}
	}

	private static class CodedResultsSectionBuilder extends SectionBuilderImpl<CodedResultsSection> {
		@Override
		public CodedResultsSection buildSection() {
			CodedResultsSection section = IHEFactory.eINSTANCE.createCodedResultsSection().init();
			construct(section);
			return section;
		}
	}

	private static class CodedSurgeriesSectionBuilder extends SectionBuilderImpl<CodedSurgeriesSection> {
		@Override
		public CodedSurgeriesSection buildSection() {
			CodedSurgeriesSection section = IHEFactory.eINSTANCE.createCodedSurgeriesSection().init();
			construct(section);
			return section;
		}
	}

	private static class CodedVitalSignsSectionBuilder extends SectionBuilderImpl<CodedVitalSignsSection> {
		@Override
		public CodedVitalSignsSection buildSection() {
			CodedVitalSignsSection section = IHEFactory.eINSTANCE.createCodedVitalSignsSection().init();
			construct(section);
			return section;
		}
	}

	private static class DischargeDiagnosisSectionBuilder extends SectionBuilderImpl<DischargeDiagnosisSection> {
		@Override
		public DischargeDiagnosisSection buildSection() {
			DischargeDiagnosisSection section = IHEFactory.eINSTANCE.createDischargeDiagnosisSection().init();
			construct(section);
			return section;
		}
	}

	private static class EncounterHistorySectionBuilder extends SectionBuilderImpl<EncounterHistorySection> {
		@Override
		public EncounterHistorySection buildSection() {
			EncounterHistorySection section = IHEFactory.eINSTANCE.createEncounterHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class FamilyMedicalHistorySectionBuilder extends SectionBuilderImpl<FamilyMedicalHistorySection> {
		@Override
		public FamilyMedicalHistorySection buildSection() {
			FamilyMedicalHistorySection section = IHEFactory.eINSTANCE.createFamilyMedicalHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class HistoryOfPastIllnessSectionBuilder extends SectionBuilderImpl<HistoryOfPastIllnessSection> {
		@Override
		public HistoryOfPastIllnessSection buildSection() {
			HistoryOfPastIllnessSection section = IHEFactory.eINSTANCE.createHistoryOfPastIllnessSection().init();
			construct(section);
			return section;
		}
	}

	private static class HospitalAdmissionDiagnosisSectionBuilder extends
			SectionBuilderImpl<HospitalAdmissionDiagnosisSection> {
		@Override
		public HospitalAdmissionDiagnosisSection buildSection() {
			HospitalAdmissionDiagnosisSection section = IHEFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init();
			construct(section);
			return section;
		}
	}

	private static class HospitalCourseSectionBuilder extends SectionBuilderImpl<HospitalCourseSection> {
		@Override
		public HospitalCourseSection buildSection() {
			HospitalCourseSection section = IHEFactory.eINSTANCE.createHospitalCourseSection().init();
			construct(section);
			return section;
		}
	}

	private static class HospitalDischargeMedicationsSectionBuilder extends
			SectionBuilderImpl<HospitalDischargeMedicationsSection> {
		@Override
		public HospitalDischargeMedicationsSection buildSection() {
			HospitalDischargeMedicationsSection section = IHEFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init();
			construct(section);
			return section;
		}
	}

	private static class ImmunizationsSectionBuilder extends SectionBuilderImpl<ImmunizationsSection> {
		@Override
		public ImmunizationsSection buildSection() {
			ImmunizationsSection section = IHEFactory.eINSTANCE.createImmunizationsSection().init();
			construct(section);
			return section;
		}
	}

	private static class IntakeOutputSectionBuilder extends SectionBuilderImpl<IntakeOutputSection> {
		@Override
		public IntakeOutputSection buildSection() {
			IntakeOutputSection section = IHEFactory.eINSTANCE.createIntakeOutputSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicalDevicesSectionBuilder extends SectionBuilderImpl<MedicalDevicesSection> {
		@Override
		public MedicalDevicesSection buildSection() {
			MedicalDevicesSection section = IHEFactory.eINSTANCE.createMedicalDevicesSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicationsAdministeredSectionBuilder extends
			SectionBuilderImpl<MedicationsAdministeredSection> {
		@Override
		public MedicationsAdministeredSection buildSection() {
			MedicationsAdministeredSection section = IHEFactory.eINSTANCE.createMedicationsAdministeredSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicationsSectionBuilder extends SectionBuilderImpl<MedicationsSection> {
		@Override
		public MedicationsSection buildSection() {
			MedicationsSection section = IHEFactory.eINSTANCE.createMedicationsSection().init();
			construct(section);
			return section;
		}
	}

	private static class PayersSectionBuilder extends SectionBuilderImpl<PayersSection> {
		@Override
		public PayersSection buildSection() {
			PayersSection section = IHEFactory.eINSTANCE.createPayersSection().init();
			construct(section);
			return section;
		}
	}

	private static class PhysicalExamNarrativeSectionBuilder extends SectionBuilderImpl<PhysicalExamNarrativeSection> {
		@Override
		public PhysicalExamNarrativeSection buildSection() {
			PhysicalExamNarrativeSection section = IHEFactory.eINSTANCE.createPhysicalExamNarrativeSection().init();
			construct(section);
			return section;
		}
	}

	private static class PhysicalExamSectionBuilder extends SectionBuilderImpl<PhysicalExamSection> {
		@Override
		public PhysicalExamSection buildSection() {
			PhysicalExamSection section = IHEFactory.eINSTANCE.createPhysicalExamSection().init();
			construct(section);
			return section;
		}
	}

	private static class PregnancyHistorySectionBuilder extends SectionBuilderImpl<PregnancyHistorySection> {
		@Override
		public PregnancyHistorySection buildSection() {
			PregnancyHistorySection section = IHEFactory.eINSTANCE.createPregnancyHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class ReasonForReferralSectionBuilder extends SectionBuilderImpl<ReasonForReferralSection> {
		@Override
		public ReasonForReferralSection buildSection() {
			ReasonForReferralSection section = IHEFactory.eINSTANCE.createReasonForReferralSection().init();
			construct(section);
			return section;
		}
	}

	private static class ReviewOfSystemsSectionBuilder extends SectionBuilderImpl<ReviewOfSystemsSection> {
		@Override
		public ReviewOfSystemsSection buildSection() {
			ReviewOfSystemsSection section = IHEFactory.eINSTANCE.createReviewOfSystemsSection().init();
			construct(section);
			return section;
		}
	}

	private static class SocialHistorySectionBuilder extends SectionBuilderImpl<SocialHistorySection> {
		@Override
		public SocialHistorySection buildSection() {
			SocialHistorySection section = IHEFactory.eINSTANCE.createSocialHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class SurgeriesSectionBuilder extends SectionBuilderImpl<SurgeriesSection> {
		@Override
		public SurgeriesSection buildSection() {
			SurgeriesSection section = IHEFactory.eINSTANCE.createSurgeriesSection().init();
			construct(section);
			return section;
		}
	}

	private static class VitalSignsSectionBuilder extends SectionBuilderImpl<VitalSignsSection> {
		@Override
		public VitalSignsSection buildSection() {
			VitalSignsSection section = IHEFactory.eINSTANCE.createVitalSignsSection().init();
			construct(section);
			return section;
		}
	}

	public static ActiveProblemsSectionBuilder createActiveProblemsSectionBuilder() {
		return new ActiveProblemsSectionBuilder();
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

	public static CarePlanSectionBuilder createCarePlanSectionBuilder() {
		return new CarePlanSectionBuilder();
	}

	public static ChiefComplaintSectionBuilder createChiefComplaintSectionBuilder() {
		return new ChiefComplaintSectionBuilder();
	}

	public static CodedResultsSectionBuilder createCodedResultsSectionBuilder() {
		return new CodedResultsSectionBuilder();
	}

	public static CodedVitalSignsSectionBuilder createCodedVitalSignsSectionBuilder() {
		return new CodedVitalSignsSectionBuilder();
	}

	public static DischargeDiagnosisSectionBuilder createDischargeDiagnosisSectionBuilder() {
		return new DischargeDiagnosisSectionBuilder();
	}

	public static EncounterHistorySectionBuilder createEncounterHistorySectionBuilder() {
		return new EncounterHistorySectionBuilder();
	}

	public static FamilyMedicalHistorySectionBuilder createFamilyMedicalHistorySectionBuilder() {
		return new FamilyMedicalHistorySectionBuilder();
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

	public static IntakeOutputSectionBuilder createIntakeOutputSectionBuilder() {
		return new IntakeOutputSectionBuilder();
	}

	public static MedicalDevicesSectionBuilder createMedicalDevicesSectionBuilder() {
		return new MedicalDevicesSectionBuilder();
	}

	public static MedicationsAdministeredSectionBuilder createMedicationsAdministeredSectionBuilder() {
		return new MedicationsAdministeredSectionBuilder();
	}

	public static MedicationsSectionBuilder createMedicationsSectionBuilder() {
		return new MedicationsSectionBuilder();
	}

	public static PayersSectionBuilder createPayersSectionBuilder() {
		return new PayersSectionBuilder();
	}

	public static PhysicalExamNarrativeSectionBuilder createPhysicalExamNarrativeSectionBuilder() {
		return new PhysicalExamNarrativeSectionBuilder();
	}

	public static PhysicalExamSectionBuilder createPhysicalExamSectionBuilder() {
		return new PhysicalExamSectionBuilder();
	}

	public static PregnancyHistorySectionBuilder createPregnancyHistorySectionBuilder() {
		return new PregnancyHistorySectionBuilder();
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

	public static VitalSignsSectionBuilder createVitalSignsSectionBuilder() {
		return new VitalSignsSectionBuilder();
	}

	public static CodedAdvanceDirectivesSectionBuilder ncreateCodedAdvanceDirectivesSectionBuilder() {
		return new CodedAdvanceDirectivesSectionBuilder();
	}

	public static CodedSurgeriesSectionBuilder ncreateCodedSurgeriesSectionBuilder() {
		return new CodedSurgeriesSectionBuilder();
	}

}
