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
package org.openhealthtools.mdht.builder.cda;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Authorization;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Entity;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

public class ClinicalDocumentBuilder {
	
	

	

	public static  final  void addID (SubstanceAdministration substanceAdministration,String root,String extension)
	{
		substanceAdministration.getIds().add(DatatypesFactory.eINSTANCE.createII(root, extension));
	}

	
	public static  final  void addID (Encounter encounter,String root)
	{
		encounter.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}
	
	public static  final  void addID (Supply supply,String root)
	{
		supply.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}
	
	
	
	
	public static  final  void addID (CustodianOrganization custodianOrganization,String root)
	{
		custodianOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}

	
	public static  final  void addID (Organizer organizer,String root)
	{
		organizer.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}

	public static  final  void addID (SubstanceAdministration substanceAdministration,String root)
	{
		substanceAdministration.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}

	
	public static  final  void addID (Entity entity,String root,String extension)
	{
		entity.getIds().add(DatatypesFactory.eINSTANCE.createII(root, extension));
	}

	public static  final  void addID (Entity entity,String root)
	{
		entity.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}

	
	public static  final  void addID (ParticipantRole participantRole,String root,String extension)
	{
		participantRole.getIds().add(DatatypesFactory.eINSTANCE.createII(root, extension));
	}

	public static  final  void addID (ParticipantRole participantRole,String root)
	{
		participantRole.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}

	
	public static  final  void addID (Procedure procedure,String root,String extension)
	{
		procedure.getIds().add(DatatypesFactory.eINSTANCE.createII(root, extension));
	}

	public static  final  void addID (Procedure procedure,String root)
	{
		procedure.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}

	public static  final  void addID (Observation observation,String root,String extension)
	{
		observation.getIds().add(DatatypesFactory.eINSTANCE.createII(root, extension));
	}

	public static  final  void addID (Observation observation,String root)
	{
		observation.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}
	
	public static  final  void addID (Act act,String root,String extension)
	{
		act.getIds().add(DatatypesFactory.eINSTANCE.createII(root, extension));
	}

	public static  final  void addID (Act act,String root)
	{
		act.getIds().add(DatatypesFactory.eINSTANCE.createII(root));
	}

	 public static final void addObservation(Observation target,Observation source,x_ActRelationshipEntryRelationship typecode)
		{
			EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
			
			entryRelationship.setTypeCode(typecode);

			entryRelationship.setObservation(source);
			
			target.getEntryRelationships().add(entryRelationship);
			
		}
	 
	 public static final void addAct(Observation target,Act act,x_ActRelationshipEntryRelationship typecode)
		{
			EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
			
			entryRelationship.setTypeCode(typecode);

			entryRelationship.setAct(act);
			
			target.getEntryRelationships().add(entryRelationship);
			
		}
	 
	 public static final void addObservation(Act act,Observation observation,x_ActRelationshipEntryRelationship typecode)
		{
			EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
			
			entryRelationship.setTypeCode(typecode);

			entryRelationship.setObservation(observation);
			
			act.getEntryRelationships().add(entryRelationship);
			
		}
	 
	 
	 
	 
	ArrayList<SectionDirector> sectionBuilders = new ArrayList<SectionDirector>();

	protected void appendSectionBuilder(SectionDirector sectionBuilder) {
		if (sectionBuilder != null) {
			sectionBuilders.add(sectionBuilder);
		}
	}

	public SectionDirector getSectionDirector() {
		return null;
	}

	public PatientRole buildPatientRole() {
		return CDAFactory.eINSTANCE.createPatientRole();
	}

	public Patient buildPatient() {
		return null;
	}

	public List<Author> buildAuthors() {
		return new ArrayBuilder<Author>().construct();
	}

	public List<Authenticator> buildAuthenticators() {
		return new ArrayBuilder<Authenticator>().construct();
	}

	public List<Authorization> buildAuthorizations() {
		return new ArrayBuilder<Authorization>().construct();
	}

	public List<Participant1> buildParticipants() {
		return new ArrayBuilder<Participant1>().construct();
	}

	public List<InformationRecipient> buildInformationRecipients() {
		return new ArrayBuilder<InformationRecipient>().construct();
	}

	public List<DocumentationOf> buildDocumentationsOf() {
		return new ArrayBuilder<DocumentationOf>().construct();
	}

	public List<InFulfillmentOf> buildInFulfillmentsOf() {
		return new ArrayBuilder<InFulfillmentOf>().construct();
	}

	public Custodian buildCustodian() {
		return null;
	}

	public List<Informant12> buildInformants() {
		return new ArrayBuilder<Informant12>().construct();
	}

	public List<CS> buildRealmCodes() {
		return new ArrayBuilder<CS>().construct();
	}

	public DataEnterer buildDataEnterer() {
		return null;
	}

	public LegalAuthenticator buildLegalAuthenticator() {
		return null;
	}

	public CS buildDocumentLanguageCode() {
		return null;
	}

	public II buildDocumentSetId() {
		return null;
	}

	public INT buildDocumentVersion() {
		return null;
	}
	
	
	public Component2 buildComponentBuider()
	{
		return null; 
	}
	
	public List<Adapter> buildAdapters() {
		return new ArrayBuilder<Adapter>().construct();
	}


	protected void construct(ClinicalDocument clinicalDocument) {

		clinicalDocument.setTypeId(buildDocumentType());

		clinicalDocument.setId(buildDocumentId());

		for (II templateId : buildDocumentTemplateIds()) {
			clinicalDocument.getTemplateIds().add(templateId);
		}

		clinicalDocument.setCode(buildDocumentCode());

		clinicalDocument.setTitle(buildDocumentTitle());

		clinicalDocument.setEffectiveTime(buildDocumentEffectiveTime());

		clinicalDocument.setConfidentialityCode(buildDocumentConfidentialityCode());

		clinicalDocument.setLanguageCode(buildDocumentLanguageCode());

		clinicalDocument.setSetId(buildDocumentSetId());

		clinicalDocument.setVersionNumber(buildDocumentVersion());

		Patient patient = buildPatient();

		if (patient != null) {
			PatientRole patientRole = buildPatientRole();
			patientRole.setPatient(patient);
		
			
//			clinicalDocument.getPatientRoles().add(patientRole);
		}

		for (CS realmCode : buildRealmCodes()) {
			clinicalDocument.getRealmCodes().add(realmCode);
		}

		for (Author author : buildAuthors()) {
			clinicalDocument.getAuthors().add(author);
		}

		clinicalDocument.setCustodian(buildCustodian());

		for (Authenticator authenticator : buildAuthenticators()) {
			clinicalDocument.getAuthenticators().add(authenticator);
		}

		for (Authorization authorization : buildAuthorizations()) {
			clinicalDocument.getAuthorizations().add(authorization);
		}

		for (Participant1 participant : buildParticipants()) {
			clinicalDocument.getParticipants().add(participant);
		}

		clinicalDocument.setDataEnterer(buildDataEnterer());

		for (Informant12 informant : buildInformants()) {
			clinicalDocument.getInformants().add(informant);
		}

		for (InformationRecipient informationRecipient : buildInformationRecipients()) {
			clinicalDocument.getInformationRecipients().add(informationRecipient);
		}

		for (DocumentationOf documentationOf : buildDocumentationsOf()) {
			clinicalDocument.getDocumentationOfs().add(documentationOf);
		}

		clinicalDocument.setLegalAuthenticator(buildLegalAuthenticator());

		for (InFulfillmentOf inFulfillmentOf : buildInFulfillmentsOf()) {
			clinicalDocument.getInFulfillmentOfs().add(inFulfillmentOf);
		}
		
		clinicalDocument.setComponent(buildComponentBuider());
		

		appendSectionBuilder(getSectionDirector());

		for (SectionDirector sectionBuilder : sectionBuilders) {
			for (Section section : sectionBuilder.constructSections()) {
				clinicalDocument.addSection(section);
			}
		}

	}

	public InfrastructureRootTypeId buildDocumentType() {
		return null;
	}

	public II buildDocumentId() {
		return null;
	}

	public CE buildDocumentCode() {
		return null;
	}

	public ST buildDocumentTitle() {
		return null;
	}

	public TS buildDocumentEffectiveTime() {
		return null;
	}

	public CE buildDocumentConfidentialityCode() {
		return null;
	}

	public List<II> buildDocumentTemplateIds() {
		return new ArrayBuilder<II>().construct();
	}

	public ClinicalDocument buildDocument() {

		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
	
		//  Add hook to have eadapters added to build - this needs to be called in each buildDocument versus part of the construct to make sure all notifications are received
		for (Adapter adapter : buildAdapters()) {
			clinicalDocument.eAdapters().add(adapter);
		}

		construct(clinicalDocument);

		return clinicalDocument;

	}

}
