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
import org.openhealthtools.mdht.builder.cda.GenericSectionDirector;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class PatientSummaryBuilder extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder {
	
	public static String RXNORM= "2.16.840.1.113883.6.88"; // RxNorm
	public static String SNOMEDCT =	"2.16.840.1.113883.6.96"; // SNOMED Controlled Terminology
	public static String HL7ACTCODE = "2.16.840.1.113883.5.4"; // HL7 ActCode vocabulary
	
	
	static public EntryRelationship createActiveStatus() {

		EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

		status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

		AlertStatusObservation observationStatus = CCDFactory.eINSTANCE.createAlertStatusObservation().init();

		observationStatus.getValues().add(DatatypesFactory.eINSTANCE.createCE("55561003", SNOMEDCT, "", "Active"));

		status.setObservation(observationStatus);

		return status;

	}
	
	static public AllergyDrugSensitivity createActiveAllergyDrugSensitivity(CE drug, CD[] reactions) {

		AllergyDrugSensitivity allergyDrugSensitivity = HITSPFactory.eINSTANCE.createAllergyDrugSensitivity().init();

		AlertObservation alertObservation = CCDFactory.eINSTANCE.createAlertObservation().init();

		allergyDrugSensitivity.addObservation(alertObservation);

		Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();

		participant.setTypeCode(ParticipationType.CSM);

		ParticipantRole participantRole = CDAFactory.eINSTANCE.createParticipantRole();

		participantRole.setClassCode(RoleClassRoot.MANU);

		PlayingEntity playingEntity = CDAFactory.eINSTANCE.createPlayingEntity();

		PN pn = DatatypesFactory.eINSTANCE.createPN();

		pn.addText(drug.getDisplayName());

		playingEntity.getNames().add(pn);

		participantRole.setPlayingEntity(playingEntity);

		participantRole.getPlayingEntity().setClassCode(EntityClassRoot.MMAT);

		participantRole.getPlayingEntity().setCode(drug);

		participant.setParticipantRole(participantRole);

		alertObservation.getParticipants().add(participant);

		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

		entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.MFST);

		entryRelationship.setInversionInd(true);

		ReactionObservation reactionObservations = CCDFactory.eINSTANCE.createReactionObservation().init();

		reactionObservations.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", HL7ACTCODE, "", ""));
		
		for (CD reaction : reactions)
		{
			reactionObservations.getValues().add(reaction);			
		}

		entryRelationship.setObservation(reactionObservations);

		alertObservation.getEntryRelationships().add(entryRelationship);

		alertObservation.getEntryRelationships().add(createActiveStatus());

		return allergyDrugSensitivity;
	}

	public static class ProblemSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.ProblemSectionDirector {

		@Override
		protected ProblemSection createSection() {
			return HITSPFactory.eINSTANCE.createProblemListSection().init();
		}

	}

	public static class AdvanceDirectivesSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.AdvanceDirectivesSectionDirector {

		protected AdvanceDirectivesSection createSection() {
			return HITSPFactory.eINSTANCE.createAdvanceDirectivesSection().init();
		}

	};

	public static class EncoutersSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.EncountersSectionDirector {

		@Override
		protected EncountersSection createSection() {
			return HITSPFactory.eINSTANCE.createEncountersSection().init();
		}

	};

	public static class ProcedureSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.ProcedureSectionDirector {

		@Override
		protected ProceduresSection createSection() {
			return super.createSection();
		}

	}

	public static class SurgeriesSectionDirector extends GenericSectionDirector<SurgeriesSection> {

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Diagnostic Section").construct();
		}

		@Override
		protected SurgeriesSection createSection() {
			return HITSPFactory.eINSTANCE.createSurgeriesSection().init();
		}

	}

	public static class DiagnosticResultsSectionDirector extends GenericSectionDirector<DiagnosticResultsSection> {

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Diagnostic Section").construct();
		}

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		protected DiagnosticResultsSection createSection() {
			return HITSPFactory.eINSTANCE.createDiagnosticResultsSection().init();
		}

	};

	public static class AllergiesReactionSectionDirector extends GenericSectionDirector<AllergiesReactionsSection> {

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Allergies Section").construct();
		}

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		protected AllergiesReactionsSection createSection() {
			return HITSPFactory.eINSTANCE.createAllergiesReactionsSection().init();
		}

	}

	public static class ProblemListSectionDirector extends GenericSectionDirector<ProblemListSection> {

		@Override
		public ST buildSectionTitle() {
			return new BuilderUtil.BuildST("Problem List Section").construct();
		}

		@Override
		public StrucDocText buildSectionText() {
			return new BuilderUtil.BuildStrucDocText("DISPLAY TEXT OF CONTENT").construct();
		}

		@Override
		protected ProblemListSection createSection() {
			return HITSPFactory.eINSTANCE.createProblemListSection().init();
		}

	}

	public static class ImmunizationsSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.ImmunizationsSectionDirector {

		@Override
		protected ImmunizationsSection createSection() {
			return HITSPFactory.eINSTANCE.createImmunizationsSection().init();
		}

	}

	public static class VitalSignsSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.VitalSignsSectionDirector {

		@Override
		protected VitalSignsSection createSection() {
			return HITSPFactory.eINSTANCE.createVitalSignsSection().init();
		}

	}

	public static class FunctionalStatusSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.FunctionalStatusSectionDirector {

		@Override
		protected FunctionalStatusSection createSection() {
			return HITSPFactory.eINSTANCE.createFunctionalStatusSection().init();
		}

	}

	public static class FamilyHistorySectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.FamilyHistorySectionDirector {

		@Override
		protected FamilyHistorySection createSection() {
			return HITSPFactory.eINSTANCE.createFamilyHistorySection().init();
		}

	}

	public static class PlanOfCareSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.PlanOfCareSectionDirector {

		@Override
		protected PlanOfCareSection createSection() {
			return HITSPFactory.eINSTANCE.createPlanOfCareSection().init();
		}
	}

	public static class MedicalEquipmentSectionDirector extends org.openhealthtools.mdht.builder.ccd.ContinuitOfCareDocumentBuilder.MedicalEquipmentSectionDirector {

		@Override
		protected MedicalEquipmentSection createSection() {
			return HITSPFactory.eINSTANCE.createMedicalEquipmentSection().init();
		}

	}

	public AllergiesReactionSectionDirector getAllergiesReactionSectionDirector() {
		return null;
	}

	public ProblemListSectionDirector getProblemListSectionDirector() {
		return null;
	}

	@Override
	protected void construct(ClinicalDocument clinicalDocument) {

		super.construct(clinicalDocument);
	}

	@Override
	public ClinicalDocument buildDocument() {

		PatientSummary clinicalDocument = HITSPFactory.eINSTANCE.createPatientSummary().init();

		for (Adapter adapter : buildAdapters()) {
			clinicalDocument.eAdapters().add(adapter);
		}
	
		appendSectionBuilder(getAllergiesReactionSectionDirector());

		appendSectionBuilder(getProblemListSectionDirector());

		appendSectionBuilder(getDiagnosticResultsSection());

		appendSectionBuilder(getEncoutersSection());

		appendSectionBuilder(getSurgeriesSection());

		construct(clinicalDocument);

		return clinicalDocument;

	}

	public SurgeriesSectionDirector getSurgeriesSection() {
		return null;
	}

	public DiagnosticResultsSectionDirector getDiagnosticResultsSection() {
		return null;
	}

	public EncoutersSectionDirector getEncoutersSection() {
		return null;
	}

}
