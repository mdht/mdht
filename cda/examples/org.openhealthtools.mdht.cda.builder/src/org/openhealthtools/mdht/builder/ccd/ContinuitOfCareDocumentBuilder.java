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

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.GenericSectionDirector;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;

public class ContinuitOfCareDocumentBuilder extends org.openhealthtools.mdht.builder.cda.ClinicalDocumentBuilder {

	public static class ProblemSectionDirector extends GenericSectionDirector<ProblemSection> {

		
		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Problems Section").construct();
		}
		
		public List<ProblemAct> buildProblemActs() {
			return new ArrayBuilder<ProblemAct>().construct();
		}

		@Override
		protected void construct(ProblemSection problemSection) {
			for (Act act : buildProblemActs()) {
				Entry entry = CDAFactory.eINSTANCE.createEntry();
				
				entry.setTypeCode(x_ActRelationshipEntry.DRIV);
				
				entry.setAct(act);
				
				problemSection.getEntries().add(entry);

			}
		}

		@Override
		protected ProblemSection createSection() {
			return CCDFactory.eINSTANCE.createProblemSection().init();
		}

	}

	public static class EncountersSectionDirector extends GenericSectionDirector<EncountersSection> {
		
		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Encounters Section").construct();
		}

		@Override
		protected EncountersSection createSection() {
			return CCDFactory.eINSTANCE.createEncountersSection().init();
		}

	}

	public static class FamilyHistorySectionDirector extends GenericSectionDirector<FamilyHistorySection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Family History Section").construct();
		}

		
		@Override
		protected FamilyHistorySection createSection() {
			return CCDFactory.eINSTANCE.createFamilyHistorySection().init();
		}

	}

	public static class FunctionalStatusSectionDirector extends GenericSectionDirector<FunctionalStatusSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST  buildSectionTitle() {
			return new BuilderUtil.BuildST("Functional Status Section").construct();
		}

		@Override
		protected FunctionalStatusSection createSection() {
			return CCDFactory.eINSTANCE.createFunctionalStatusSection().init();
		}

	}

	public static class ImmunizationsSectionDirector extends GenericSectionDirector<ImmunizationsSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Immunizations Section").construct();
		}

		@Override
		protected ImmunizationsSection createSection() {
			return CCDFactory.eINSTANCE.createImmunizationsSection().init();
		}

	}

	public static class MedicalEquipmentSectionDirector extends GenericSectionDirector<MedicalEquipmentSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Medical Equipment Section").construct();
		}

		@Override
		protected MedicalEquipmentSection createSection() {
			return CCDFactory.eINSTANCE.createMedicalEquipmentSection().init();
		}

	}

	public static class MedicationsSectionDirector extends GenericSectionDirector<MedicationsSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Medications Section").construct();
		}

		@Override
		protected MedicationsSection createSection() {
			return CCDFactory.eINSTANCE.createMedicationsSection().init();
		}

	}

	public static class PayersSectionDirector extends GenericSectionDirector<PayersSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Payers Section").construct();
		}

		@Override
		protected PayersSection createSection() {
			return HITSPFactory.eINSTANCE.createPayersSection().init();
		}

	}

	public static class PlanOfCareSectionDirector extends GenericSectionDirector<PlanOfCareSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Plan of Care Section").construct();
		}

		@Override
		protected PlanOfCareSection createSection() {
			return CCDFactory.eINSTANCE.createPlanOfCareSection().init();
		}

	}

	public static class ProcedureSectionDirector extends GenericSectionDirector<ProceduresSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Procedure Section").construct();
		}

		@Override
		protected ProceduresSection createSection() {
			return CCDFactory.eINSTANCE.createProceduresSection().init();
		}

	}

	public static class PurposeSectionDirector extends GenericSectionDirector<PurposeSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Purpose Section").construct();
		}

		@Override
		protected PurposeSection createSection() {
			return CCDFactory.eINSTANCE.createPurposeSection().init();
		}
		

		
	}

	public static class ResultsSectionDirector extends GenericSectionDirector<ResultsSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Results Section").construct();
		}

		@Override
		protected ResultsSection createSection() {
			return CCDFactory.eINSTANCE.createResultsSection().init();
		}

	}

	public static class SocialHistorySectionDirector extends GenericSectionDirector<SocialHistorySection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Social History Section").construct();
		}

		@Override
		protected SocialHistorySection createSection() {
			return CCDFactory.eINSTANCE.createSocialHistorySection().init();
		}

	}

	public static class VitalSignsSectionDirector extends GenericSectionDirector<VitalSignsSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Vital Signs Section").construct();
		}

		@Override
		protected VitalSignsSection createSection() {
			return CCDFactory.eINSTANCE.createVitalSignsSection().init();
		}

	}

	public static class AlertsSectionDirector extends GenericSectionDirector<AlertsSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Alerts Section").construct();
		}

		@Override
		protected AlertsSection createSection() {
			return CCDFactory.eINSTANCE.createAlertsSection().init();
		}

	}

	public static class AdvanceDirectivesSectionDirector extends GenericSectionDirector<AdvanceDirectivesSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Advance Directives Section").construct();
		}

		@Override
		protected AdvanceDirectivesSection createSection() {
			return CCDFactory.eINSTANCE.createAdvanceDirectivesSection().init();
		}

	}

	public ProblemSectionDirector getProblemSectionDirector() {
		return null;
	}

	public FamilyHistorySectionDirector getFamilyHistorySectionDirector() {
		return null;
	}

	public FunctionalStatusSectionDirector getFunctionalStatusSectionDirector() {
		return null;
	}

	public ImmunizationsSectionDirector getImmunizationsSectionDirector() {
		return null;
	}

	public MedicalEquipmentSectionDirector getMedicalEquipmentSectionDirector() {
		return null;
	}

	public MedicationsSectionDirector getMedicationsSectionDirector() {
		return null;
	}

	public PayersSectionDirector getPayersSectionDirector() {
		return null;
	}

	public PlanOfCareSectionDirector getPlanOfCareSectionDirector() {
		return null;
	}

	public ProcedureSectionDirector getProcedureSectionDirector() {
		return null;
	}

	public PurposeSectionDirector getPurposeSectionDirector() {
		return null;
	}

	public ResultsSectionDirector getResultsSectionDirector() {
		return null;
	}

	public SocialHistorySectionDirector getSocialHistorySectionDirector() {
		return null;
	}

	public VitalSignsSectionDirector getVitalSignsSectionDirector() {
		return null;
	}

	public AlertsSectionDirector getAlertsSectionDirector() {
		return null;
	}

	public AdvanceDirectivesSectionDirector getAdvanceDirectivesSectionDirector() {
		return null;
	}
	
	public EncountersSectionDirector getEncountersSectionDirector() {
		return null;
	}

	@Override
	protected void construct(ClinicalDocument clinicalDocument) {

		appendSectionBuilder(getProblemSectionDirector());

		appendSectionBuilder(getFamilyHistorySectionDirector());

		appendSectionBuilder(getFunctionalStatusSectionDirector());

		appendSectionBuilder(getImmunizationsSectionDirector());

		appendSectionBuilder(getMedicalEquipmentSectionDirector());

		appendSectionBuilder(getMedicationsSectionDirector());

		appendSectionBuilder(getPayersSectionDirector());

		appendSectionBuilder(getPlanOfCareSectionDirector());

		appendSectionBuilder(getProcedureSectionDirector());

		appendSectionBuilder(getPurposeSectionDirector());

		appendSectionBuilder(getResultsSectionDirector());

		appendSectionBuilder(getSocialHistorySectionDirector());

		appendSectionBuilder(getVitalSignsSectionDirector());

		appendSectionBuilder(getAlertsSectionDirector());

		appendSectionBuilder(getAdvanceDirectivesSectionDirector());
		
		appendSectionBuilder(getEncountersSectionDirector());
		

		super.construct(clinicalDocument);
	}

	@Override
	public ClinicalDocument buildDocument() {

		ContinuityOfCareDocument clinicalDocument = CCDFactory.eINSTANCE.createContinuityOfCareDocument().init();
		
		for (Adapter adapter : buildAdapters()) {
			clinicalDocument.eAdapters().add(adapter);
		}


		construct(clinicalDocument);

		return clinicalDocument;

	}

}
