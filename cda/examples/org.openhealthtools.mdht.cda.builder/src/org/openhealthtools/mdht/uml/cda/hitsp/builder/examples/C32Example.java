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
package org.openhealthtools.mdht.uml.cda.hitsp.builder.examples;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.builder.BuilderUtil;
import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.builder.SectionBuilder;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.builder.HITSPBuilderFactory;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

public class C32Example {

	private static void addID(Act act, String value) {
		act.getIds().add(DatatypesFactory.eINSTANCE.createII(value));
	}

	private static void addID(Observation observation, String value) {
		observation.getIds().add(DatatypesFactory.eINSTANCE.createII(value));
	}

	private static Participant2 buildDrugParticipation(String id, String name) {

		Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();

		participant.setTypeCode(ParticipationType.CSM);

		ParticipantRole participantRole = CDAFactory.eINSTANCE.createParticipantRole();

		participantRole.setClassCode(RoleClassRoot.MANU);

		participantRole.setPlayingEntity(BuilderUtil.buildPlayingEntity(name));

		participantRole.getPlayingEntity().setClassCode(EntityClassRoot.MMAT);

		participantRole.getPlayingEntity().setCode(BuilderUtil.buildRxNORM(id, name));

		participant.setParticipantRole(participantRole);

		return participant;
	}

	private static EntryRelationship buildActiveStatus() {

		EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

		status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

		AlertStatusObservation observationStatus = CCDFactory.eINSTANCE.createAlertStatusObservation().init();

		observationStatus.getValues().add(DatatypesFactory.eINSTANCE.createCE("55561003", "2.16.840.1.113883.6.96", "", "Active"));

		status.setObservation(observationStatus);

		return status;

	}

	private static EntryRelationship buildObservationSource() {
		EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

		status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

		Observation observation = CDAFactory.eINSTANCE.createObservation();

		observation.getValues().add(DatatypesFactory.eINSTANCE.createCE("48766-0", "2.16.840.1.113883.6.96", "", "Source of Information"));

		status.setObservation(observation);

		return status;

	}

	private static List<Entry> getEntries() {
		ArrayList<Entry> entries = new ArrayList<Entry>();

		// Add Penicillin/Hives Alert
		Entry entry = CDAFactory.eINSTANCE.createEntry();

		entry.setTypeCode(x_ActRelationshipEntry.DRIV);

		ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();

		addID(problemAct, "5adc1020-7b14-11db-9fe1-0800200c9a66");

		EntryRelationship subject = CDAFactory.eINSTANCE.createEntryRelationship();

		subject.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

		AlertObservation alertObservation = CCDFactory.eINSTANCE.createAlertObservation().init();

		alertObservation.setClassCode(ActClassObservation.OBS);

		addID(alertObservation, "4adc1020-7b14-11db-9fe1-0800200c9a66");

		alertObservation.setCode(BuilderUtil.buildSNOMEDCT("416098002", "drug allergy"));

		alertObservation.setText(DatatypesFactory.eINSTANCE.createED("<reference value=\"PtrToValueInSectionText\"/>"));

		alertObservation.getParticipants().add(buildDrugParticipation("70618", "Penicillin"));

		Reference reference = CDAFactory.eINSTANCE.createReference();

		reference.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("zzzzzzzzzzzzzzzzzzzzzz"));

		reference.setTypeCode(x_ActRelationshipExternalReference.XCRPT);

		alertObservation.getReferences().add(reference);

		EntryRelationship hives = CDAFactory.eINSTANCE.createEntryRelationship();

		hives.setTypeCode(x_ActRelationshipEntryRelationship.MFST);

		hives.setInversionInd(true);

		ReactionObservation hivesReaction = CCDFactory.eINSTANCE.createReactionObservation().init();

		hivesReaction.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4", "", ""));

		hivesReaction.getValues().add(DatatypesFactory.eINSTANCE.createCD("247472004", "2.16.840.1.113883.6.96", "", "Hives"));

		hives.setObservation(hivesReaction);

		alertObservation.getEntryRelationships().add(hives);

		alertObservation.getEntryRelationships().add(buildActiveStatus());

		alertObservation.getEntryRelationships().add(buildObservationSource());

		subject.setObservation(alertObservation);

		problemAct.getEntryRelationships().add(subject);

		entry.setAct(problemAct);

		entries.add(entry);

		// Add Aspirin Problem Observation

		entry = CDAFactory.eINSTANCE.createEntry();

		entry.setTypeCode(x_ActRelationshipEntry.DRIV);

		AllergyDrugSensitivity allergyDrugSensitivity = HITSPFactory.eINSTANCE.createAllergyDrugSensitivity().init();

		allergyDrugSensitivity.getIds().add(DatatypesFactory.eINSTANCE.createII("eb936010-7b17-11db-9fe1-0800200c9a66"));

		addID(allergyDrugSensitivity, "eb936010-7b17-11db-9fe1-0800200c9a66");

		IVL_TS effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS();

		effectiveTime.setLow(BuilderUtil.getTS_UNK());

		allergyDrugSensitivity.setEffectiveTime(effectiveTime);

		subject = CDAFactory.eINSTANCE.createEntryRelationship();

		subject.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

		ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();

		addID(problemObservation, "eb936011-7b17-11db-9fe1-0800200c9a66");

		problemObservation.setCode(BuilderUtil.buildSNOMEDCT("282291009", "propensity to adverse reactions to drug"));

		problemObservation.getCode().getTranslations().add(BuilderUtil.buildSNOMEDCT("282291009", "Diagnosis"));

		problemObservation.setText(DatatypesFactory.eINSTANCE.createED("<reference value=\"PtrToValueInSectionText\"/>"));

		problemObservation.setEffectiveTime(effectiveTime);

		problemObservation.getValues().add(DatatypesFactory.eINSTANCE.createCD());

		problemObservation.getParticipants().add(buildDrugParticipation("1191", "Aspirin"));

		problemObservation.getEntryRelationships().add(buildActiveStatus());

		alertObservation.getEntryRelationships().add(buildObservationSource());

		// problemObservation.gets

		subject.setObservation(problemObservation);

		allergyDrugSensitivity.getEntryRelationships().add(subject);

		entry.setAct(allergyDrugSensitivity);

		entries.add(entry);

		// Add Codiene / Nausea Alert

		// Create Entry
		entry = CDAFactory.eINSTANCE.createEntry();

		entry.setTypeCode(x_ActRelationshipEntry.DRIV);

		// Create Drug Sensitivity Template
		allergyDrugSensitivity = HITSPFactory.eINSTANCE.createAllergyDrugSensitivity().init();

		addID(allergyDrugSensitivity, "c3df3b61-7b18-11db-9fe1-0800200c9a66");

		allergyDrugSensitivity.setEffectiveTime(effectiveTime);

		// Create Alert Observation Template
		alertObservation = CCDFactory.eINSTANCE.createAlertObservation().init();

		alertObservation.setClassCode(ActClassObservation.OBS);

		addID(alertObservation, "c3df3b60-7b18-11db-9fe1-0800200c9a66");

		alertObservation.setCode(BuilderUtil.buildSNOMEDCT("59037007", "drug intolerance"));

		alertObservation.getCode().getTranslations().add(BuilderUtil.buildSNOMEDCT("404684003", "Clinical finding"));

		alertObservation.setText(DatatypesFactory.eINSTANCE.createED("Duplication of pointer in originalText of Value below<reference value=\"PtrToValueInSectionText\"/>"));

		alertObservation.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("200512", "200601"));

		// Add Drug Participation
		alertObservation.getParticipants().add(buildDrugParticipation("2670", "Codeine"));

		// Add Severity
		EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

		entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.MFST);

		entryRelationship.setInversionInd(true);

		ReactionObservation reactionObservation = CCDFactory.eINSTANCE.createReactionObservation().init();

		reactionObservation.getValues().add(BuilderUtil.buildSNOMEDCT("73879007", "Nausea"));

		subject = CDAFactory.eINSTANCE.createEntryRelationship();

		subject.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

		SeverityObservation severityObservation = CCDFactory.eINSTANCE.createSeverityObservation().init();

		severityObservation.getValues().add(BuilderUtil.buildSNOMEDCT("6736007", "moderate"));

		subject.setObservation(severityObservation);

		reactionObservation.getEntryRelationships().add(subject);

		entryRelationship.setObservation(reactionObservation);

		alertObservation.getEntryRelationships().add(entryRelationship);

		// Add Status

		alertObservation.getEntryRelationships().add(buildActiveStatus());

		alertObservation.getEntryRelationships().add(buildObservationSource());

		subject = CDAFactory.eINSTANCE.createEntryRelationship();

		subject.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

		subject.setInversionInd(true);

		subject.setObservation(alertObservation);

		allergyDrugSensitivity.getEntryRelationships().add(subject);

		// Add Act to Entry
		entry.setAct(allergyDrugSensitivity);

		entries.add(entry);

		return entries;

	}

	public static AllergiesReactionsSection getAllergiesSection() {
		SectionBuilder<AllergiesReactionsSection> sectionBuilder = HITSPBuilderFactory.createAllergiesReactionsSectionBuilder();

		sectionBuilder.with(DatatypesFactory.eINSTANCE.createST("Allergies and Adverse Reactions"));

		
		for (Entry entry : getEntries())
		{
			sectionBuilder.with(entry);	
		}
		
		

		return sectionBuilder.buildSection();


	}

	public static List<Author> getAuthors() {

		ArrayList<Author> authors = new ArrayList<Author>();

		Author author = CDAFactory.eINSTANCE.createAuthor();

		author.setTime(new BuilderUtil.BuildEffectiveTime().construct());

		AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();

		assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

		assignedAuthor.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

		assignedAuthor.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());

		Person person = CDAFactory.eINSTANCE.createPerson();

		person.getNames().add(DatatypesFactory.eINSTANCE.createPN());

		assignedAuthor.setAssignedPerson(person);

		author.setAssignedAuthor(assignedAuthor);

		authors.add(author);

		return authors;
	}

	public static List<DocumentationOf> getDocumentationsOf() {

		ArrayList<DocumentationOf> documentationOfs = new ArrayList<DocumentationOf>();

		DocumentationOf documentationOf = CDAFactory.eINSTANCE.createDocumentationOf();

		ServiceEvent serviceEvent = CDAFactory.eINSTANCE.createServiceEvent();

		serviceEvent.setClassCode(ActClassRoot.PCPR);

		String effectiveTime = BuilderUtil.TSDF.format(Calendar.getInstance().getTime());

		serviceEvent.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS(effectiveTime, effectiveTime));

		documentationOf.setServiceEvent(serviceEvent);

		documentationOfs.add(documentationOf);

		return documentationOfs;

	}

	public static Custodian getCustodian() {

		Custodian custodian = CDAFactory.eINSTANCE.createCustodian();

		AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();

		custodian.setAssignedCustodian(assignedCustodian);

		CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();

		custodianOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString()));

		ON on = DatatypesFactory.eINSTANCE.createON();

		custodianOrganization.setName(on);

		custodianOrganization.setAddr(DatatypesFactory.eINSTANCE.createAD());

		custodianOrganization.setTelecom(DatatypesFactory.eINSTANCE.createTEL());

		assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);

		return custodian;

	}

	public static void main(String[] args) {

		try {

			II documentId = DatatypesFactory.eINSTANCE.createII(java.util.UUID.randomUUID().toString());

			InfrastructureRootTypeId documentType = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();

			documentType.setRoot("2.16.840.1.113883.1.3");

			documentType.setExtension("POCD_HD000040");

			// Create an instance of the PatientSummaryBuilder
			DocumentBuilder<PatientSummary> patientSummarybuilder = HITSPBuilderFactory.createPatientSummaryBuilder();

			// Set the builder Sections and call the buildDocument method to
			// create the Continuity Of Care Document
			PatientSummary patientSummaryDocument = patientSummarybuilder.withDocumentId(documentId)
																		 .with(documentType)
																		 .withAuthors(getAuthors())
																		 .with(getDocumentationsOf())
																		 .with(getCustodian())
																		 .with(getAllergiesSection()).buildDocument();

			// Use the CDAUtil method to save instance to System.out, You can
			// use the same method to save to a file
			CDAUtil.save(patientSummaryDocument, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
