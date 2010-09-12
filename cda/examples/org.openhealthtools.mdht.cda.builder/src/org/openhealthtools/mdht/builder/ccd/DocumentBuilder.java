/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
 package org.openhealthtools.mdht.builder.ccd;

import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.GenericSectionBuilder;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;

public class DocumentBuilder extends org.openhealthtools.mdht.builder.cda.DocumentBuilder {

	public static class ProblemSectionBuilder extends GenericSectionBuilder<ProblemSection> {

		
		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Problems Section");
		}
		
		public ArrayBuilder<ProblemAct> getProblemActBuilder() {
			return new ArrayBuilder<ProblemAct>();
		}

		@Override
		protected void construct(ProblemSection problemSection) {
			for (Act act : getProblemActBuilder().construct()) {
				Entry entry = CDAFactory.eINSTANCE.createEntry();
				
				entry.setTypeCode(x_ActRelationshipEntry.DRIV);
				
				entry.setAct(act);
				
				problemSection.getEntries().add(entry);
//				
//				problemSection.addAct(act);
				
//				act.gete
			}
		}

		@Override
		protected ProblemSection createSection() {
			return CCDFactory.eINSTANCE.createProblemSection().init();
		}

	}

	public static class EncountersSectionBuilder extends GenericSectionBuilder<EncountersSection> {
		
		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Encounters Section");
		}

		@Override
		protected EncountersSection createSection() {
			return CCDFactory.eINSTANCE.createEncountersSection().init();
		}

	}

	public static class FamilyHistorySectionBuilder extends GenericSectionBuilder<FamilyHistorySection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Family History Section");
		}

		
		@Override
		protected FamilyHistorySection createSection() {
			return CCDFactory.eINSTANCE.createFamilyHistorySection().init();
		}

	}

	public static class FunctionalStatusSectionBuilder extends GenericSectionBuilder<FunctionalStatusSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Functional Status Section");
		}

		@Override
		protected FunctionalStatusSection createSection() {
			return CCDFactory.eINSTANCE.createFunctionalStatusSection().init();
		}

	}

	public static class ImmunizationsSectionBuilder extends GenericSectionBuilder<ImmunizationsSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Immunizations Section");
		}

		@Override
		protected ImmunizationsSection createSection() {
			return CCDFactory.eINSTANCE.createImmunizationsSection().init();
		}

	}

	public static class MedicalEquipmentSectionBuilder extends GenericSectionBuilder<MedicalEquipmentSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Medical Equipment Section");
		}

		@Override
		protected MedicalEquipmentSection createSection() {
			return CCDFactory.eINSTANCE.createMedicalEquipmentSection().init();
		}

	}

	public static class MedicationsSectionBuilder extends GenericSectionBuilder<MedicationsSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Medications Section");
		}

		@Override
		protected MedicationsSection createSection() {
			return CCDFactory.eINSTANCE.createMedicationsSection().init();
		}

	}

	public static class PayersSectionBuilder extends GenericSectionBuilder<PayersSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Payers Section");
		}

		@Override
		protected PayersSection createSection() {
			return HITSPFactory.eINSTANCE.createPayersSection().init();
		}

	}

	public static class PlanOfCareSectionBuilder extends GenericSectionBuilder<PlanOfCareSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Plan of Care Section");
		}

		@Override
		protected PlanOfCareSection createSection() {
			return CCDFactory.eINSTANCE.createPlanOfCareSection().init();
		}

	}

	public static class ProcedureSectionBuilder extends GenericSectionBuilder<ProceduresSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Procedure Section");
		}

		@Override
		protected ProceduresSection createSection() {
			return CCDFactory.eINSTANCE.createProceduresSection().init();
		}

	}

	public static class PurposeSectionBuilder extends GenericSectionBuilder<PurposeSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Purpose Section");
		}

		@Override
		protected PurposeSection createSection() {
			return CCDFactory.eINSTANCE.createPurposeSection().init();
		}
		

		
	}

	public static class ResultsSectionBuilder extends GenericSectionBuilder<ResultsSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Results Section");
		}

		@Override
		protected ResultsSection createSection() {
			return CCDFactory.eINSTANCE.createResultsSection().init();
		}

	}

	public static class SocialHistorySectionBuilder extends GenericSectionBuilder<SocialHistorySection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Social History Section");
		}

		@Override
		protected SocialHistorySection createSection() {
			return CCDFactory.eINSTANCE.createSocialHistorySection().init();
		}

	}

	public static class VitalSignsSectionBuilder extends GenericSectionBuilder<VitalSignsSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Vital Signs Section");
		}

		@Override
		protected VitalSignsSection createSection() {
			return CCDFactory.eINSTANCE.createVitalSignsSection().init();
		}

	}

	public static class AlertsSectionBuilder extends GenericSectionBuilder<AlertsSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Alertis Section");
		}

		@Override
		protected AlertsSection createSection() {
			return CCDFactory.eINSTANCE.createAlertsSection().init();
		}

	}

	public static class AdvanceDirectivesSectionBuilder extends GenericSectionBuilder<AdvanceDirectivesSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Advance Directives Section");
		}

		@Override
		protected AdvanceDirectivesSection createSection() {
			return CCDFactory.eINSTANCE.createAdvanceDirectivesSection().init();
		}

	}

	public ProblemSectionBuilder getProblemSectionBuilder() {
		return null;
	}

	public FamilyHistorySectionBuilder getFamilyHistorySectionBuilder() {
		return null;
	}

	public FunctionalStatusSectionBuilder getFunctionalStatusSectionBuilder() {
		return null;
	}

	public ImmunizationsSectionBuilder getImmunizationsSectionBuilder() {
		return null;
	}

	public MedicalEquipmentSectionBuilder getMedicalEquipmentSectionBuilder() {
		return null;
	}

	public MedicationsSectionBuilder getMedicationsSectionBuilder() {
		return null;
	}

	public PayersSectionBuilder getPayersSectionBuilder() {
		return null;
	}

	public PlanOfCareSectionBuilder getPlanOfCareSectionBuilder() {
		return null;
	}

	public ProcedureSectionBuilder getProcedureSectionBuilder() {
		return null;
	}

	public PurposeSectionBuilder getPurposeSectionBuilder() {
		return null;
	}

	public ResultsSectionBuilder getResultsSectionBuilder() {
		return null;
	}

	public SocialHistorySectionBuilder getSocialHistorySectionBuilder() {
		return null;
	}

	public VitalSignsSectionBuilder getVitalSignsSectionBuilder() {
		return null;
	}

	public AlertsSectionBuilder getAlertsSectionBuilder() {
		return null;
	}

	public AdvanceDirectivesSectionBuilder getAdvanceDirectivesSectionBuilder() {
		return null;
	}
	
	public EncountersSectionBuilder getEncountersSectionBuilder() {
		return null;
	}

	@Override
	protected void construct(ClinicalDocument clinicalDocument) {

		appendSectionBuilder(getProblemSectionBuilder());

		appendSectionBuilder(getFamilyHistorySectionBuilder());

		appendSectionBuilder(getFunctionalStatusSectionBuilder());

		appendSectionBuilder(getImmunizationsSectionBuilder());

		appendSectionBuilder(getMedicalEquipmentSectionBuilder());

		appendSectionBuilder(getMedicationsSectionBuilder());

		appendSectionBuilder(getPayersSectionBuilder());

		appendSectionBuilder(getPlanOfCareSectionBuilder());

		appendSectionBuilder(getProcedureSectionBuilder());

		appendSectionBuilder(getPurposeSectionBuilder());

		appendSectionBuilder(getResultsSectionBuilder());

		appendSectionBuilder(getSocialHistorySectionBuilder());

		appendSectionBuilder(getVitalSignsSectionBuilder());

		appendSectionBuilder(getAlertsSectionBuilder());

		appendSectionBuilder(getAdvanceDirectivesSectionBuilder());
		
		appendSectionBuilder(getEncountersSectionBuilder());
		

		super.construct(clinicalDocument);
	}

	@Override
	public ClinicalDocument buildDocument() {

		ContinuityOfCareDocument clinicalDocument = CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();

		// appendSectionBuilder(getProblemSectionBuilder());
		//
		// appendSectionBuilder(getFamilyHistorySectionBuilder());
		//
		// appendSectionBuilder(getFunctionalStatusSectionBuilder());
		//
		// appendSectionBuilder(getImmunizationsSectionBuilder());
		//
		// appendSectionBuilder(getMedicalEquipmentSectionBuilder());
		//
		// appendSectionBuilder(getMedicationsSectionBuilder());
		//
		// appendSectionBuilder(getPayersSectionBuilder());
		//
		// appendSectionBuilder(getPlanOfCareSectionBuilder());
		//
		// appendSectionBuilder(getProcedureSectionBuilder());
		//
		// appendSectionBuilder(getPurposeSectionBuilder());
		//
		// appendSectionBuilder(getResultsSectionBuilder());
		//
		// appendSectionBuilder(getSocialHistorySectionBuilder());
		//
		// appendSectionBuilder(getVitalSignsSectionBuilder());

		construct(clinicalDocument);

		return clinicalDocument;

	}

}
