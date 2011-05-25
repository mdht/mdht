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
package org.openhealthtools.mdht.uml.cda.ccd.builder;

import org.openhealthtools.mdht.uml.cda.builder.impl.DocumentBuilderImpl;
import org.openhealthtools.mdht.uml.cda.builder.impl.SectionBuilderImpl;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
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

public class CCDBuilderFactory {

	private static class AdvanceDirectivesSectionBuilder extends SectionBuilderImpl<AdvanceDirectivesSection> {
		@Override
		public AdvanceDirectivesSection buildSection() {
			AdvanceDirectivesSection section = CCDFactory.eINSTANCE.createAdvanceDirectivesSection().init();
			construct(section);
			return section;
		}
	}

	private static class ContinuityOfCareDocumentBuilder extends DocumentBuilderImpl<ContinuityOfCareDocument> {

		@Override
		public ContinuityOfCareDocument buildDocument() {
			ContinuityOfCareDocument clinicalDocument = CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();
			construct(clinicalDocument);
			return clinicalDocument;
		}
	}

	private static class EncountersSectionBuilder extends SectionBuilderImpl<EncountersSection> {
		@Override
		public EncountersSection buildSection() {
			EncountersSection section = CCDFactory.eINSTANCE.createEncountersSection().init();
			construct(section);
			return section;
		}
	}

	private static class FamilyHistorySectionBuilder extends SectionBuilderImpl<FamilyHistorySection> {
		@Override
		public FamilyHistorySection buildSection() {
			FamilyHistorySection section = CCDFactory.eINSTANCE.createFamilyHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class ImmunizationsSectionBuilder extends SectionBuilderImpl<ImmunizationsSection> {
		@Override
		public ImmunizationsSection buildSection() {
			ImmunizationsSection section = CCDFactory.eINSTANCE.createImmunizationsSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicalEquipmentSectionBuilder extends SectionBuilderImpl<MedicalEquipmentSection> {
		@Override
		public MedicalEquipmentSection buildSection() {
			MedicalEquipmentSection section = CCDFactory.eINSTANCE.createMedicalEquipmentSection().init();
			construct(section);
			return section;
		}
	}

	private static class MedicationsSectionBuilder extends SectionBuilderImpl<MedicationsSection> {
		@Override
		public MedicationsSection buildSection() {
			MedicationsSection section = CCDFactory.eINSTANCE.createMedicationsSection().init();
			construct(section);
			return section;
		}
	}

	private static class PayersSectionBuilder extends SectionBuilderImpl<PayersSection> {
		@Override
		public PayersSection buildSection() {
			PayersSection section = CCDFactory.eINSTANCE.createPayersSection().init();
			construct(section);
			return section;
		}
	}

	private static class PlanOfCareSectionBuilder extends SectionBuilderImpl<PlanOfCareSection> {
		@Override
		public PlanOfCareSection buildSection() {
			PlanOfCareSection section = CCDFactory.eINSTANCE.createPlanOfCareSection().init();
			construct(section);
			return section;
		}
	}

	private static class ProblemSectionBuilder extends SectionBuilderImpl<ProblemSection> {
		@Override
		public ProblemSection buildSection() {
			ProblemSection section = CCDFactory.eINSTANCE.createProblemSection().init();
			construct(section);
			return section;
		}
	}

	private static class ProceduresSectionBuilder extends SectionBuilderImpl<ProceduresSection> {
		@Override
		public ProceduresSection buildSection() {
			ProceduresSection section = CCDFactory.eINSTANCE.createProceduresSection().init();
			construct(section);
			return section;
		}
	}

	private static class PurposeSectionBuilder extends SectionBuilderImpl<PurposeSection> {
		@Override
		public PurposeSection buildSection() {
			PurposeSection section = CCDFactory.eINSTANCE.createPurposeSection().init();
			construct(section);
			return section;
		}
	}

	private static class ResultsSectionBuilder extends SectionBuilderImpl<ResultsSection> {
		@Override
		public ResultsSection buildSection() {
			ResultsSection section = CCDFactory.eINSTANCE.createResultsSection().init();
			construct(section);
			return section;
		}
	}

	private static class SocialHistorySectionBuilder extends SectionBuilderImpl<SocialHistorySection> {
		@Override
		public SocialHistorySection buildSection() {
			SocialHistorySection section = CCDFactory.eINSTANCE.createSocialHistorySection().init();
			construct(section);
			return section;
		}
	}

	private static class VitalSignsSectionBuilder extends SectionBuilderImpl<VitalSignsSection> {
		@Override
		public VitalSignsSection buildSection() {
			VitalSignsSection section = CCDFactory.eINSTANCE.createVitalSignsSection().init();
			construct(section);
			return section;
		}
	}

	public static AdvanceDirectivesSectionBuilder createAdvanceDirectivesSectionBuilder() {
		return new AdvanceDirectivesSectionBuilder();
	}

	public static ContinuityOfCareDocumentBuilder createContinuityOfCareDocumentBuilder() {
		return new ContinuityOfCareDocumentBuilder();
	}

	public static EncountersSectionBuilder createEncountersSectionBuilder() {
		return new EncountersSectionBuilder();
	}

	public static FamilyHistorySectionBuilder createFamilyHistorySectionBuilder() {
		return new FamilyHistorySectionBuilder();
	}

	public static ImmunizationsSectionBuilder createImmunizationsSectionBuilder() {
		return new ImmunizationsSectionBuilder();
	}

	public static MedicalEquipmentSectionBuilder createMedicalEquipmentSectionBuilder() {
		return new MedicalEquipmentSectionBuilder();
	}

	public static MedicationsSectionBuilder createMedicationsSectionBuilder() {
		return new MedicationsSectionBuilder();
	}

	public static PayersSectionBuilder createPayersSectionBuilder() {
		return new PayersSectionBuilder();
	}

	public static PlanOfCareSectionBuilder createPlanOfCareSectionBuilder() {
		return new PlanOfCareSectionBuilder();
	}

	public static ProblemSectionBuilder createProblemSectionBuilder() {
		return new ProblemSectionBuilder();
	}

	public static ProceduresSectionBuilder createProceduresSectionBuilder() {
		return new ProceduresSectionBuilder();
	}

	public static PurposeSectionBuilder createPurposeSectionBuilder() {
		return new PurposeSectionBuilder();
	}

	public static ResultsSectionBuilder createResultsSectionBuilder() {
		return new ResultsSectionBuilder();
	}

	public static SocialHistorySectionBuilder createSocialHistorySectionBuilder() {
		return new SocialHistorySectionBuilder();
	}

	public static VitalSignsSectionBuilder createVitalSignsSectionBuilder() {
		return new VitalSignsSectionBuilder();
	}

}
