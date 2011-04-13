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
package org.openhealthtools.mdht.uml.cda.builder;

import java.util.List;

import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Authorization;
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
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.builder.impl.DocumentBuilderImpl;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public interface DocumentBuilder <Document>{

	public abstract Document buildDocument();

	void construct(ClinicalDocument clinicalDocument);

	
	public DocumentBuilder<Document> with(Authenticator authenticator);

	public DocumentBuilder<Document> with(Author author);

	public DocumentBuilder<Document> with(Authorization authorization);

	public DocumentBuilder<Document> with(Custodian custodian);

	public DocumentBuilder<Document> with(DataEnterer dataEnterer);

	public DocumentBuilder<Document> with(DocumentationOf documentationsOf);

	public DocumentBuilder<Document> with(Informant12 informant);

	public DocumentBuilder<Document> with(
			InformationRecipient informationRecipient);


	public DocumentBuilder<Document> with(
			InfrastructureRootTypeId infrastructureRootTypeId);

	public DocumentBuilder<Document> with(InFulfillmentOf inFulfillmentOf);

	public DocumentBuilder<Document> with(LegalAuthenticator legalAuthenticator);

	public DocumentBuilder<Document> with(List<DocumentationOf> DocumentationOfs);

	public DocumentBuilder<Document> with(Participant1 participant1);

	public DocumentBuilder<Document> with(Section section);

	

	public DocumentBuilder<Document> withAuthenticators(
			List<Authenticator> authenticators);



	public DocumentBuilder<Document> withAuthorizations(
			List<Authorization> authorizations);

	public DocumentBuilder<Document> withAuthors(List<Author> authors);

	public DocumentBuilder<Document> withDocumentCode(CE documentCode);

	public DocumentBuilder<Document> withDocumentConfidentialityCode(
			CE documentConfidentialityCode);

	public DocumentBuilder<Document> withDocumentEffectiveTime(
			TS documentEffectiveTime);


	public DocumentBuilder<Document> withDocumentId(II documentId);

	public DocumentBuilder<Document> withDocumentLanguageCode(
			CS documentLanguageCode);

	public DocumentBuilder<Document> withDocumentSetId(II documentSetId);

	public DocumentBuilder<Document> withDocumentTemplateId(II documentTemplateId);

	public DocumentBuilder<Document> withDocumentTitle(ST documentTitle);


	public DocumentBuilder<Document> withDocumentVersion(INT documentVersion);

	public DocumentBuilder<Document> withInformants(List<Informant12> informants);
	public DocumentBuilder<Document> withInformationRecipients(
			List<InformationRecipient> informationRecipients);
	public DocumentBuilder<Document> withInFulfillmentOfs(
			List<InFulfillmentOf> inFulfillmentOfs);

	public DocumentBuilderImpl<Document> with(Patient patient);
	
	public DocumentBuilder<Document> withRealmCode(CS cs);

	public DocumentBuilder<Document> withRealmCodes(List<CS> realmCodes);

	public DocumentBuilder<Document> withSections(List<Section> sections);

}
