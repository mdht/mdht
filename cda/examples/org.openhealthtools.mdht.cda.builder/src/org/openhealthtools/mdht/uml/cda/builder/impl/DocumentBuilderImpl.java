/*******************************************************************************
 * Copyright (c) 2010 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse private License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Sean Muir (JKM Software) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.builder.impl;

import java.util.ArrayList;
import java.util.List;

import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Authorization;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.builder.ArrayBuilder;
import org.openhealthtools.mdht.uml.cda.builder.DocumentBuilder;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public abstract class  DocumentBuilderImpl <Document> implements DocumentBuilder<Document>
{

	List<Authenticator> authenticators = new ArrayList<Authenticator>();

	List<Authorization> authorizations = new ArrayList<Authorization>();

	List<Author> authors = new ArrayList<Author>();

	Custodian custodian = null;

	DataEnterer dataEnterer = null;

	List<DocumentationOf> documentationOfs = new ArrayList<DocumentationOf>();

	public CE documentCode = null;

	private CE documentConfidentialityCode = null;

	private TS documentEffectiveTime = null;

	public II documentId = null;

	CS documentLanguageCode = null;

	II documentSetId = null;

	List<II> documentTemplateIds = new ArrayBuilder<II>().construct();

	private ST documentTitle = null;

	INT documentVersion = null;

	List<Informant12> informants = new ArrayList<Informant12>();

	List<InformationRecipient> informationRecipients = new ArrayList<InformationRecipient>();

	private InfrastructureRootTypeId infrastructureRootTypeId = null;

	List<InFulfillmentOf> inFulfillmentOfs = new ArrayList<InFulfillmentOf>();

	LegalAuthenticator legalAuthenticator = null;

	List<Participant1> participants = new ArrayList<Participant1>();

	Patient patient;

	List<CS> realmCodes = new ArrayList<CS>();

	List<Section> sections = new ArrayList<Section>();

	public abstract Document buildDocument();

	public void construct(ClinicalDocument clinicalDocument) {

		if (infrastructureRootTypeId != null) {
			clinicalDocument.setTypeId(infrastructureRootTypeId);
		}

		if (documentId != null) {
			clinicalDocument.setId(documentId);
		}

		for (II templateId : documentTemplateIds) {
			clinicalDocument.getTemplateIds().add(templateId);
		}

		if (documentCode != null) {
			clinicalDocument.setCode(documentCode);
		}

		if (documentTitle != null) {
			clinicalDocument.setTitle(documentTitle);
		}
		if (documentEffectiveTime != null) {
			clinicalDocument.setEffectiveTime(documentEffectiveTime);
		}

		if (documentConfidentialityCode != null) {
			clinicalDocument
					.setConfidentialityCode(documentConfidentialityCode);
		}

		if (documentLanguageCode != null) {
			clinicalDocument.setLanguageCode(documentLanguageCode);
		}

		if (documentSetId != null) {
			clinicalDocument.setSetId(documentSetId);
		}

		if (documentVersion != null) {
			clinicalDocument.setVersionNumber(documentVersion);
		}

		

		if (patient != null) {
			PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();;
			patientRole.setPatient(patient);
			clinicalDocument.addPatientRole(patientRole);
		}

		for (CS realmCode : realmCodes) {
			clinicalDocument.getRealmCodes().add(realmCode);
		}

		for (Author author : authors) {
			clinicalDocument.getAuthors().add(author);
		}

		if (custodian != null) {
			clinicalDocument.setCustodian(custodian);
		}

		for (Authenticator authenticator : authenticators) {
			clinicalDocument.getAuthenticators().add(authenticator);
		}

		for (Authorization authorization : authorizations) {
			clinicalDocument.getAuthorizations().add(authorization);
		}

		for (Participant1 participant : participants) {
			clinicalDocument.getParticipants().add(participant);
		}

		if (dataEnterer != null) {
			clinicalDocument.setDataEnterer(dataEnterer);
		}

		for (Informant12 informant : informants) {
			clinicalDocument.getInformants().add(informant);
		}

		for (InformationRecipient informationRecipient : informationRecipients) {
			clinicalDocument.getInformationRecipients().add(
					informationRecipient);
		}

		for (DocumentationOf documentationOf : documentationOfs) {
			clinicalDocument.getDocumentationOfs().add(documentationOf);
		}

		if (legalAuthenticator != null) {
			clinicalDocument.setLegalAuthenticator(legalAuthenticator);
		}

		for (InFulfillmentOf inFulfillmentOf : inFulfillmentOfs) {
			clinicalDocument.getInFulfillmentOfs().add(inFulfillmentOf);
		}

		// clinicalDocument.setComponent(buildComponentBuider());

		// appendSectionBuilder(getSectionDirector());

		for (Section section : sections) {
			clinicalDocument.addSection(section);
		}

	}

	public DocumentBuilderImpl<Document> with(Authenticator authenticator) {
		authenticators.add(authenticator);
		return this;
	}

	public DocumentBuilderImpl<Document> with(Author author) {
		authors.add(author);
		return this;
	}

	public DocumentBuilderImpl<Document> with(Authorization authorization) {
		authorizations.add(authorization);
		return this;
	}

	public DocumentBuilderImpl<Document> with(Custodian custodian) {
		this.custodian = custodian;
		return this;
	}

	public DocumentBuilderImpl<Document> with(DataEnterer dataEnterer) {
		this.dataEnterer = dataEnterer;
		return this;
	}

	public DocumentBuilderImpl<Document> with(DocumentationOf documentationsOf) {
		documentationOfs.add(documentationsOf);
		return this;
	}

	public DocumentBuilderImpl<Document> with(Informant12 informant) {
		this.informants.add(informant);
		return this;
	}

	public DocumentBuilderImpl<Document> with(
			InformationRecipient informationRecipient) {
		informationRecipients.add(informationRecipient);
		return this;
	}

	public DocumentBuilderImpl<Document> with(
			InfrastructureRootTypeId infrastructureRootTypeId) {
		this.infrastructureRootTypeId = infrastructureRootTypeId;
		return this;
	}

	public DocumentBuilderImpl<Document> with(InFulfillmentOf inFulfillmentOf) {
		inFulfillmentOfs.add(inFulfillmentOf);
		return this;
	}

	public DocumentBuilderImpl<Document> with(LegalAuthenticator legalAuthenticator) {
		this.legalAuthenticator = legalAuthenticator;
		return this;
	}

	public DocumentBuilderImpl<Document> with(List<DocumentationOf> DocumentationOfs) {
		documentationOfs.addAll(DocumentationOfs);
		return this;
	}

	public DocumentBuilderImpl<Document> with(Participant1 participant1) {
		participants.add(participant1);
		return this;
	}

	public DocumentBuilderImpl<Document> with(Section section) {
		sections.add(section);
		return this;
	}

	public DocumentBuilderImpl<Document> withAuthenticators(
			List<Authenticator> authenticators) {
		authenticators.addAll(authenticators);
		return this;
	}

	public DocumentBuilderImpl<Document> withAuthorizations(
			List<Authorization> authorizations) {
		authorizations.addAll(authorizations);
		return this;
	}

	public DocumentBuilderImpl<Document> withAuthors(List<Author> authors) {
		authors.addAll(authors);
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentCode(CE documentCode) {
		this.documentCode = documentCode;
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentConfidentialityCode(
			CE documentConfidentialityCode) {
		this.documentConfidentialityCode = documentConfidentialityCode;
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentEffectiveTime(
			TS documentEffectiveTime) {
		this.documentEffectiveTime = documentEffectiveTime;
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentId(II documentId) {
		this.documentId = documentId;
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentLanguageCode(
			CS documentLanguageCode) {
		this.documentLanguageCode = documentLanguageCode;
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentSetId(II documentSetId) {
		this.documentSetId = documentSetId;
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentTemplateId(II documentTemplateId) {
		documentTemplateIds.add(documentTemplateId);
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentTitle(ST documentTitle) {
		this.documentTitle = documentTitle;
		return this;
	}

	public DocumentBuilderImpl<Document> withDocumentVersion(INT documentVersion) {
		this.documentVersion = documentVersion;
		return this;
	}

	public DocumentBuilderImpl<Document> withInformants(List<Informant12> informants) {
		this.informants.addAll(informants);
		return this;
	}

	public DocumentBuilderImpl<Document> withInformationRecipients(
			List<InformationRecipient> informationRecipients) {
		informationRecipients.addAll(informationRecipients);
		return this;
	}

	public DocumentBuilderImpl<Document> withInFulfillmentOfs(
			List<InFulfillmentOf> inFulfillmentOfs) {
		this.inFulfillmentOfs.addAll(inFulfillmentOfs);
		return this;
	}

	public DocumentBuilderImpl<Document> with(Patient patient) {
		this.patient = patient;
		return this;
	}

	public DocumentBuilderImpl<Document> withRealmCode(CS cs) {
		realmCodes.add(cs);
		return this;
	}

	public DocumentBuilderImpl<Document> withRealmCodes(List<CS> realmCodes) {
		this.realmCodes.addAll(realmCodes);
		return this;
	}

	public DocumentBuilderImpl<Document> withSections(List<Section> sections) {
		sections.addAll(sections);
		return this;
	}

}
