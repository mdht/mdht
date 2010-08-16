/*******************************************************************************
2 	* Copyright (c) 2010 Sean Muir.
3 	* All rights reserved. This program and the accompanying materials
4 	* are made available under the terms of the Eclipse Public License v1.0
5 	* which accompanies this distribution, and is available at
6 	* http://www.eclipse.org/legal/epl-v10.html
7 	*
8 	* Contributors:
9 	* Sean Muir (JKM Software) - initial API and implementation
10 	*
11 	* $Id$
12 	*******************************************************************************/
package org.openhealthtools.mdht.builder.ccd;

import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.GenericSectionBuilder;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
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

public class DocumentBuilder extends org.openhealthtools.mdht.builder.cda.DocumentBuilder {

	public static class ProblemSectionBuilder extends GenericSectionBuilder<ProblemSection> {

		public ArrayBuilder<ProblemAct> getProblemActBuilder() {
			return new ArrayBuilder<ProblemAct>();
		}

		@Override
		protected void construct(ProblemSection problemSection) {
			for (Act act : getProblemActBuilder().construct()) {
				problemSection.addAct(act);
			}
		}

		@Override
		protected ProblemSection createSection() {
			return CCDFactory.eINSTANCE.createProblemSection().init();
		}

	}

	public static class EncountersSectionBuilder extends GenericSectionBuilder<EncountersSection> {

		@Override
		protected EncountersSection createSection() {
			return CCDFactory.eINSTANCE.createEncountersSection().init();
		}

	}

	public static class FamilyHistorySectionBuilder extends GenericSectionBuilder<FamilyHistorySection> {

		@Override
		protected FamilyHistorySection createSection() {
			return CCDFactory.eINSTANCE.createFamilyHistorySection().init();
		}

	}

	public static class FunctionalStatusSectionBuilder extends GenericSectionBuilder<FunctionalStatusSection> {

		@Override
		protected FunctionalStatusSection createSection() {
			return CCDFactory.eINSTANCE.createFunctionalStatusSection().init();
		}

	}

	public static class ImmunizationsSectionBuilder extends GenericSectionBuilder<ImmunizationsSection> {

		@Override
		protected ImmunizationsSection createSection() {
			return CCDFactory.eINSTANCE.createImmunizationsSection().init();
		}

	}

	public static class MedicalEquipmentSectionBuilder extends GenericSectionBuilder<MedicalEquipmentSection> {

		@Override
		protected MedicalEquipmentSection createSection() {
			return CCDFactory.eINSTANCE.createMedicalEquipmentSection().init();
		}

	}

	public static class MedicationsSectionBuilder extends GenericSectionBuilder<MedicationsSection> {

		@Override
		protected MedicationsSection createSection() {
			return CCDFactory.eINSTANCE.createMedicationsSection().init();
		}

	}

	public static class PayersSectionBuilder extends GenericSectionBuilder<PayersSection> {

		@Override
		protected PayersSection createSection() {
			return CCDFactory.eINSTANCE.createPayersSection().init();
		}

	}

	public static class PlanOfCareSectionBuilder extends GenericSectionBuilder<PlanOfCareSection> {

		@Override
		protected PlanOfCareSection createSection() {
			return CCDFactory.eINSTANCE.createPlanOfCareSection().init();
		}

	}

	public static class ProcedureSectionBuilder extends GenericSectionBuilder<ProceduresSection> {

		@Override
		protected ProceduresSection createSection() {
			return CCDFactory.eINSTANCE.createProceduresSection().init();
		}

	}

	public static class PurposeSectionBuilder extends GenericSectionBuilder<PurposeSection> {

		@Override
		protected PurposeSection createSection() {
			return CCDFactory.eINSTANCE.createPurposeSection().init();
		}

	}

	public static class ResultsSectionBuilder extends GenericSectionBuilder<ResultsSection> {

		@Override
		protected ResultsSection createSection() {
			return CCDFactory.eINSTANCE.createResultsSection().init();
		}

	}

	public static class SocialHistorySectionBuilder extends GenericSectionBuilder<SocialHistorySection> {

		@Override
		protected SocialHistorySection createSection() {
			return CCDFactory.eINSTANCE.createSocialHistorySection().init();
		}

	}

	public static class VitalSignsSectionBuilder extends GenericSectionBuilder<VitalSignsSection> {

		@Override
		protected VitalSignsSection createSection() {
			return CCDFactory.eINSTANCE.createVitalSignsSection().init();
		}

	}

	public static class AlertsSectionBuilder extends GenericSectionBuilder<AlertsSection> {

		@Override
		protected AlertsSection createSection() {
			return CCDFactory.eINSTANCE.createAlertsSection().init();
		}

	}

	public static class AdvanceDirectivesSectionBuilder extends GenericSectionBuilder<AdvanceDirectivesSection> {

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
