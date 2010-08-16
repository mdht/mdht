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
package org.openhealthtools.mdht.builder.cda;

import java.util.ArrayList;

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
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

public class DocumentBuilder {

	ArrayList<SectionBuilder> sectionBuilders = new ArrayList<SectionBuilder>();

	protected void appendSectionBuilder(SectionBuilder sectionBuilder) {
		if (sectionBuilder != null) {
			sectionBuilders.add(sectionBuilder);
		}
	}

	public SectionBuilder getSectionBuilder() {
		return null;
	}

	public Builder<PatientRole> getPatientRoleBuilder() {
		return new Builder<PatientRole>() {
			@Override
			public PatientRole construct() {
				return CDAFactory.eINSTANCE.createPatientRole();
			}

		};
	}

	public Builder<Patient> getPatientBuilder() {
		return new Builder<Patient>();
	}

	public ArrayBuilder<Author> getAuthorBuilder() {
		return new ArrayBuilder<Author>();
	}

	public ArrayBuilder<Authenticator> getAuthenticatorBuilder() {
		return new ArrayBuilder<Authenticator>();
	}

	public ArrayBuilder<Authorization> getAuthorizationBuilder() {
		return new ArrayBuilder<Authorization>();
	}

	public ArrayBuilder<Participant1> getParticipantBuilder() {
		return new ArrayBuilder<Participant1>();
	}

	public ArrayBuilder<InformationRecipient> getInformationRecipientBuilder() {
		return new ArrayBuilder<InformationRecipient>();
	}

	public ArrayBuilder<DocumentationOf> getDocumentationOfBuilder() {
		return new ArrayBuilder<DocumentationOf>();
	}

	public ArrayBuilder<InFulfillmentOf> getInFulfillmentOfBuilder() {
		return new ArrayBuilder<InFulfillmentOf>();
	}

	public Builder<Custodian> getCustodianBuilder() {
		return new Builder<Custodian>();
	}

	public ArrayBuilder<Informant12> getInformantBuilder() {
		return new ArrayBuilder<Informant12>();
	}

	public ArrayBuilder<CS> getRealmCodeBuilder() {
		return new ArrayBuilder<CS>();
	}

	public Builder<DataEnterer> getDataEntererBuilder() {
		return new Builder<DataEnterer>();
	}

	public Builder<LegalAuthenticator> getLegalAuthenticatorBuilder() {
		return new Builder<LegalAuthenticator>();
	}

	public Builder<CS> getDocumentLanguageCode() {
		return new Builder<CS>();
	}

	public Builder<II> getDocumentSetIdBuilder() {
		return new Builder<II>();
	}

	public Builder<INT> getDocumentVersionBuilder() {
		return new Builder<INT>();
	}

	protected void construct(ClinicalDocument clinicalDocument) {

		clinicalDocument.setTypeId(getDocumentTypeBuilder().construct());

		clinicalDocument.setId(getDocumentIdBuilder().construct());

		for (II templateId : getDocumentTemplateIdBuilder().construct()) {
			clinicalDocument.getTemplateIds().add(templateId);
		}

		clinicalDocument.setCode(getDocumentCodeBuilder().construct());

		clinicalDocument.setTitle(getDocumentTitleBuilder().construct());

		clinicalDocument.setEffectiveTime(getDocumentEffectiveTimeBuilder().construct());

		clinicalDocument.setConfidentialityCode(getDocumentConfidentialityCodeBuilder().construct());

		clinicalDocument.setLanguageCode(getDocumentLanguageCode().construct());

		clinicalDocument.setSetId(getDocumentSetIdBuilder().construct());

		clinicalDocument.setVersionNumber(getDocumentVersionBuilder().construct());

		Patient patient = getPatientBuilder().construct();

		if (patient != null) {
			PatientRole patientRole = getPatientRoleBuilder().construct();
			patientRole.setPatient(patient);
			clinicalDocument.addPatientRole(patientRole);
		}

		for (CS realmCode : getRealmCodeBuilder().construct()) {
			clinicalDocument.getRealmCodes().add(realmCode);
		}

		for (Author author : getAuthorBuilder().construct()) {
			clinicalDocument.getAuthors().add(author);
		}

		clinicalDocument.setCustodian(getCustodianBuilder().construct());

		for (Authenticator authenticator : getAuthenticatorBuilder().construct()) {
			clinicalDocument.getAuthenticators().add(authenticator);
		}

		for (Authorization authorization : getAuthorizationBuilder().construct()) {
			clinicalDocument.getAuthorizations().add(authorization);
		}

		for (Participant1 participant : getParticipantBuilder().construct()) {
			clinicalDocument.getParticipants().add(participant);
		}

		clinicalDocument.setDataEnterer(getDataEntererBuilder().construct());

		for (Informant12 informant : getInformantBuilder().construct()) {
			clinicalDocument.getInformants().add(informant);
		}

		for (InformationRecipient informationRecipient : getInformationRecipientBuilder().construct()) {
			clinicalDocument.getInformationRecipients().add(informationRecipient);
		}

		for (DocumentationOf documentationOf : getDocumentationOfBuilder().construct()) {
			clinicalDocument.getDocumentationOfs().add(documentationOf);
		}

		clinicalDocument.setLegalAuthenticator(getLegalAuthenticatorBuilder().construct());

		for (InFulfillmentOf inFulfillmentOf : getInFulfillmentOfBuilder().construct()) {
			clinicalDocument.getInFulfillmentOfs().add(inFulfillmentOf);
		}

		appendSectionBuilder(getSectionBuilder());

		for (SectionBuilder sectionBuilder : sectionBuilders) {
			for (Section section : sectionBuilder.constructSections()) {
				clinicalDocument.addSection(section);
			}
		}

	}

	public Builder<InfrastructureRootTypeId> getDocumentTypeBuilder() {
		return new Builder<InfrastructureRootTypeId>();
	}

	public Builder<II> getDocumentIdBuilder() {
		return new Builder<II>();
	}

	public Builder<CE> getDocumentCodeBuilder() {
		return new Builder<CE>();
	}

	public Builder<ST> getDocumentTitleBuilder() {
		return new Builder<ST>();
	}

	public Builder<TS> getDocumentEffectiveTimeBuilder() {
		return new Builder<TS>();
	}

	public Builder<CE> getDocumentConfidentialityCodeBuilder() {
		return new Builder<CE>();
	}

	public ArrayBuilder<II> getDocumentTemplateIdBuilder() {
		return new ArrayBuilder<II>();
	}

	public ClinicalDocument buildDocument() {

		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();

		construct(clinicalDocument);

		return clinicalDocument;

	}

}
