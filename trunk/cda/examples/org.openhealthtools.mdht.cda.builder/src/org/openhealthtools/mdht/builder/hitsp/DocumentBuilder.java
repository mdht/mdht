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
package org.openhealthtools.mdht.builder.hitsp;

import org.eclipse.emf.common.notify.Adapter;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.GenericSectionBuilder;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

public class DocumentBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder {

	public static class ProblemSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.ProblemSectionBuilder {

		@Override
		protected ProblemSection createSection() {
			return HITSPFactory.eINSTANCE.createProblemListSection().init();
		}

	}

	public static class AdvanceDirectivesSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.AdvanceDirectivesSectionBuilder {

		protected AdvanceDirectivesSection createSection() {
			return HITSPFactory.eINSTANCE.createAdvanceDirectivesSection().init();
		}

	};

	public static class EncoutersSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.EncountersSectionBuilder {

		@Override
		protected EncountersSection createSection() {
			return HITSPFactory.eINSTANCE.createEncountersSection().init();
		}

	};

	public static class ProcedureSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.ProcedureSectionBuilder {

		@Override
		protected ProceduresSection createSection() {
			return super.createSection();
		}

	}

	public static class SurgeriesSectionBuilder extends GenericSectionBuilder<SurgeriesSection> {

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Diagnostic Section");
		}

		@Override
		protected SurgeriesSection createSection() {
			return HITSPFactory.eINSTANCE.createSurgeriesSection().init();
		}

	}

	public static class DiagnosticResultsSectionBuilder extends GenericSectionBuilder<DiagnosticResultsSection> {

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Diagnostic Section");
		}

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		protected DiagnosticResultsSection createSection() {
			return HITSPFactory.eINSTANCE.createDiagnosticResultsSection().init();
		}

	};

	public static class AllergiesReactionSectionBuilder extends GenericSectionBuilder<AllergiesReactionsSection> {

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Allergies Section");
		}

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		protected AllergiesReactionsSection createSection() {
			return HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();
		}

	}

	public static class ProblemListSectionBuilder extends GenericSectionBuilder<ProblemListSection> {

		@Override
		public Builder<ST> getSectionTitleBuilder() {
			return new BuilderUtil.BuildST("Problem List Section");
		}

		@Override
		public Builder<StrucDocText> getSectionTextBuilder() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT");
		}

		@Override
		protected ProblemListSection createSection() {
			return HITSPFactory.eINSTANCE.createProblemListSection().init();
		}

	}

	public static class ImmunizationsSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.ImmunizationsSectionBuilder {

		@Override
		protected ImmunizationsSection createSection() {
			return HITSPFactory.eINSTANCE.createImmunizationsSection().init();
		}

	}

	public static class VitalSignsSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.VitalSignsSectionBuilder {

		@Override
		protected VitalSignsSection createSection() {
			return HITSPFactory.eINSTANCE.createVitalSignsSection().init();
		}

	}

	public static class FunctionalStatusSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.FunctionalStatusSectionBuilder {

		@Override
		protected FunctionalStatusSection createSection() {
			return HITSPFactory.eINSTANCE.createFunctionalStatusSection().init();
		}

	}

	public static class FamilyHistorySectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.FamilyHistorySectionBuilder {

		@Override
		protected FamilyHistorySection createSection() {
			return HITSPFactory.eINSTANCE.createFamilyHistorySection().init();
		}

	}

	public static class PlanOfCareSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.PlanOfCareSectionBuilder {

		@Override
		protected PlanOfCareSection createSection() {
			return HITSPFactory.eINSTANCE.createPlanOfCareSection().init();
		}
	}

	public static class MedicalEquipmentSectionBuilder extends org.openhealthtools.mdht.builder.ccd.DocumentBuilder.MedicalEquipmentSectionBuilder {

		@Override
		protected MedicalEquipmentSection createSection() {
			return HITSPFactory.eINSTANCE.createMedicalEquipmentSection().init();
		}

	}

	public AllergiesReactionSectionBuilder getAllergiesReactionSectionBuilder() {
		return null;
	}

	public ProblemListSectionBuilder getProblemListSectionBuilder() {
		return null;
	}

	@Override
	protected void construct(ClinicalDocument clinicalDocument) {

		super.construct(clinicalDocument);
	}

	@Override
	public ClinicalDocument buildDocument() {

		PatientSummary clinicalDocument = HITSPFactory.eINSTANCE.createPatientSummary().init();

		for (Adapter adapter : getAdaptersBuilder().construct()) {
			clinicalDocument.eAdapters().add(adapter);
		}

		

		
		
		appendSectionBuilder(getAllergiesReactionSectionBuilder());

		appendSectionBuilder(getProblemListSectionBuilder());

		appendSectionBuilder(getDiagnosticResultsSectionBuilder());

		appendSectionBuilder(getEncoutersSectionBuilder());

		appendSectionBuilder(getSurgeriesSectionBuilder());

		construct(clinicalDocument);

		return clinicalDocument;

	}

	public SurgeriesSectionBuilder getSurgeriesSectionBuilder() {
		return null;
	}

	public DiagnosticResultsSectionBuilder getDiagnosticResultsSectionBuilder() {
		return null;
	}

	public EncoutersSectionBuilder getEncoutersSectionBuilder() {
		return null;
	}

}
