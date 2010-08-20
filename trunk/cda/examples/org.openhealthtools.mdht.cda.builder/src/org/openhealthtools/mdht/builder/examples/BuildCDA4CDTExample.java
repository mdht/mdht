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
package org.openhealthtools.mdht.builder.examples;

import java.util.ArrayList;

import org.openhealthtools.mdht.builder.ccd.helpers.BuildPatient;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.helpers.BuildAuthor;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;

/**
 * BuildCDA4CDTExample is an example implementation of the MDHT DocumentBuilder
 * based on the GOF BuilderPattern. see
 * http://en.wikipedia.org/wiki/Builder_pattern
 * 
 * The DocumentBuilder orchestrates the various CDA Builder components in order
 * to build a complete CDA document. The DocumentBuilder provides default
 * behavior requiring only the need to override the builder you need to created
 * the document while ignoring others.
 * 
 * 
 * This example duplicates the content distributed as part of NIST CDT test suite
 * 
 */
public class BuildCDA4CDTExample {

	/**
	 * Define a Patient Role Builder
	 *
	 */
	public static class CDA4CDTPatientRoleBuilder extends Builder<PatientRole> {

		@Override
		public PatientRole construct() {

			PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();

			II ii = DatatypesFactory.eINSTANCE.createII();

			ii.setRoot("ClinicOIDorUUID");

			ii.setExtension("PatientId");

			ii.setAssigningAuthorityName("MyClinicName");

			patientRole.getIds().add(ii);

			AD ad = DatatypesFactory.eINSTANCE.createAD();

			ad.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, "PatientAddressLine1"));

			ad.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, "PatientAddressLine2"));

			ad.getCities().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, "PatientCity"));

			ad.getStates().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, "PatientState"));

			ad.getPostalCodes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, "PatientZipCode"));

			ad.getCountries().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CNT, "USA"));

			patientRole.getAddrs().add(ad);

			TEL homePhone = DatatypesFactory.eINSTANCE.createTEL();

			homePhone.setValue("tel:+1-999-999-9999");

			homePhone.getUses().add(TelecommunicationAddressUse.HP);

			TEL workPhone = DatatypesFactory.eINSTANCE.createTEL();

			workPhone.setValue("tel:+1-999-999-9999");

			workPhone.getUses().add(TelecommunicationAddressUse.WP);

			patientRole.getTelecoms().add(workPhone);

			Organization providerOrganization = CDAFactory.eINSTANCE.createOrganization();

			ON on = DatatypesFactory.eINSTANCE.createON();

			on.addText("PatientsClinicName");

			providerOrganization.getNames().add(on);

			providerOrganization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL("tel:+1-"));

			AD organizationAddress = DatatypesFactory.eINSTANCE.createAD();

			organizationAddress.addText("PatientsClinicAddress");

			providerOrganization.getAddrs().add(organizationAddress);

			patientRole.setProviderOrganization(providerOrganization);

			return patientRole;
		}

	}

	/**
	 * Extend BuildPatient utility implementation
	 *
	 */
	public static class CDA4CDTPatientBuilder extends BuildPatient {

		public CDA4CDTPatientBuilder(String givenName, String familyName, String suffix, String dob, String gender) {
			super(givenName, familyName, suffix, dob, gender);
		}

		@Override
		public Patient construct() {
			Patient patient = super.construct();

			patient.setMaritalStatusCode(DatatypesFactory.eINSTANCE.createCE("S", "2.16.840.1.113883.5.2", "HL7 MaritalStatus", "Never Married"));

			patient.setReligiousAffiliationCode(BuilderUtil.RomanCatholicAffiliationCode);
			
			patient.setRaceCode(DatatypesFactory.eINSTANCE.createCE("2113-9", "2.16.840.1.113883.5.104", "HL7 Race", "Irish"));

			patient.setEthnicGroupCode(DatatypesFactory.eINSTANCE.createCE("2186-5", "2.16.840.1.113883.5.50", "HL7 Ethnicity", "Not Hispanic or Latino"));

			Guardian guardian = CDAFactory.eINSTANCE.createGuardian();

			AD guardianAddress = DatatypesFactory.eINSTANCE.createAD();

			guardianAddress.addText("Guardian Address");

			guardian.getAddrs().add(guardianAddress);

			guardian.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL("tel:+1-"));

			Person person = CDAFactory.eINSTANCE.createPerson();

			PN pn = DatatypesFactory.eINSTANCE.createPN();

			pn.addText("Guardian Recommended For Minor Patients");

			person.getNames().add(pn);

			guardian.setGuardianPerson(person);

			patient.getGuardians().add(guardian);

			Birthplace birthplace = CDAFactory.eINSTANCE.createBirthplace();

			Place place = CDAFactory.eINSTANCE.createPlace();

			AD birthplaceAddress = DatatypesFactory.eINSTANCE.createAD();

			birthplaceAddress.addCity("Jacksonville");

			birthplaceAddress.addState("Florida");

			place.setAddr(birthplaceAddress);

			birthplace.setPlace(place);

			patient.setBirthplace(birthplace);

			return patient;
		}

	}

	/**
	 * Define Author Builder
	 *
	 */
	public static class CDA4CDTBuildAuthor extends ArrayBuilder<Author> {

		@Override
		public ArrayList<Author> construct() {
			ArrayList<Author> authors = new ArrayList<Author>();

			Author author = CDAFactory.eINSTANCE.createAuthor();

			author.setTime(new BuilderUtil.BuildEffectiveTime().construct());

			AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();

			II ii = DatatypesFactory.eINSTANCE.createII();

			ii.setRoot("ClinicOIDorUUID");

			ii.setExtension("AuthorId");

			ii.setAssigningAuthorityName("MyClinicName");

			assignedAuthor.getIds().add(ii);

			author.setAssignedAuthor(assignedAuthor);

			Person assignedPerson = CDAFactory.eINSTANCE.createPerson();

			assignedAuthor.setAssignedPerson(assignedPerson);

			PN name = DatatypesFactory.eINSTANCE.createPN();

			name.addFamily("AuthorName");

			assignedPerson.getNames().add(name);

			TEL authorPhone = DatatypesFactory.eINSTANCE.createTEL();

			authorPhone.setValue("tel:+1-999-999-9999");

			authorPhone.getUses().add(TelecommunicationAddressUse.HP);

			assignedAuthor.getTelecoms().add(authorPhone);

			AD authorAddresss = DatatypesFactory.eINSTANCE.createAD();

			authorAddresss.addText("Guardian Address");

			assignedAuthor.getAddrs().add(authorAddresss);

			authors.add(author);

			return authors;
		}

	}

	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		DocumentBuilder exampleCDA4CDTBuilder = new DocumentBuilder() {

			@Override
			public Builder<InfrastructureRootTypeId> getDocumentTypeBuilder() {
				return new Builder<InfrastructureRootTypeId>() {

					@Override
					public InfrastructureRootTypeId construct() {

						InfrastructureRootTypeId infrastructureRootTypeId = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();

						infrastructureRootTypeId.setRoot("2.16.840.1.113883.1.3");

						infrastructureRootTypeId.setExtension("POCD_HD000040");

						return infrastructureRootTypeId;
					}

				};
			}

			@Override
			public Builder<II> getDocumentIdBuilder() {
				return new BuilderUtil.BuildII("2.16.840.1.113883.3.72", "CDA4CDT_RepresentativeContent", "NIST Healthcare Project");
			}

			@Override
			public Builder<CE> getDocumentCodeBuilder() {
				return new BuilderUtil.BuildCE("34117-2", "2.16.840.1.113883.6.1", "LOINC", "History and Physical");
			}

			@Override
			public Builder<ST> getDocumentTitleBuilder() {
				return new BuilderUtil.BuildST("Personal History and Physical");
			}

			@Override
			public Builder<TS> getDocumentEffectiveTimeBuilder() {
				return new BuilderUtil.BuildEffectiveTime();
			}

			@Override
			public Builder<CE> getDocumentConfidentialityCodeBuilder() {
				return new BuilderUtil.BuildCE("N", "2.16.840.1.113883.5.25", "HL7 Confidentiality", "normal");
			}

			@Override
			public Builder<CS> getDocumentLanguageCode() {
				return new BuilderUtil.BuildCS("en-US");
			}

			@Override
			public Builder<II> getDocumentSetIdBuilder() {
				return new BuilderUtil.BuildII("2.16.840.1.113883.3.72", "CDA4CDT_RepresentativeContent_AllVersions");
			}

			@Override
			public Builder<INT> getDocumentVersionBuilder() {
				return BuilderUtil.BuilderVersion;
			}

			@Override
			public Builder<PatientRole> getPatientRoleBuilder() {
				return new CDA4CDTPatientRoleBuilder();
			}

			@Override
			public Builder<Patient> getPatientBuilder() {
				return new CDA4CDTPatientBuilder("PatientFirstName", "PatientLastName", "", "19971123", "M");
			}

			@Override
			public ArrayBuilder<Author> getAuthorBuilder() {
				return new BuildAuthor("AuthorName");
			}

			@Override
			public Builder<Custodian> getCustodianBuilder() {

				return new Builder<Custodian>() {

					@Override
					public Custodian construct() {

						Custodian custodian = CDAFactory.eINSTANCE.createCustodian();

						AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();

						custodian.setAssignedCustodian(assignedCustodian);

						CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();

						ON on = DatatypesFactory.eINSTANCE.createON();

						on.addText("NIST Healthcare Testing Laboratory");

						custodianOrganization.setName(on);

						assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);

						return custodian;
					}

				};
			}

		};

		try {

			ClinicalDocument clinicalDocument = exampleCDA4CDTBuilder.buildDocument();

			CDAUtil.save(clinicalDocument, System.out);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
