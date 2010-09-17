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

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.openhealthtools.mdht.builder.ccd.helpers.BuildPatient;
import org.openhealthtools.mdht.builder.cda.ArrayBuilder;
import org.openhealthtools.mdht.builder.cda.Builder;
import org.openhealthtools.mdht.builder.cda.helpers.BuilderUtil;
import org.openhealthtools.mdht.builder.hitsp.DocumentBuilder;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Criterion;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.Device;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Entity;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.SDTCPatient;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubjectPerson;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDose;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CR;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.CV;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryOrganizer;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntry;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * BuildHITSPC32V25Example is an example implementation of the MDHT
 * DocumentBuilder based on the GOF BuilderPattern. see
 * http://en.wikipedia.org/wiki/Builder_pattern
 * 
 * The DocumentBuilder orchestrates the various CDA Builder components in order
 * to build a complete CDA document. The DocumentBuilder provides default
 * behavior requiring only the need to override the builder you need to created
 * the document while ignoring others.
 * 
 * 
 * This example duplicates the content distributed as part of NIST CDT test
 * suite
 * 
 */
public class BuildHITSPC32V25Example {

	/**
	 * Define a Patient Role Builder
	 * 
	 */
	public static class HITSPC32PatientRoleBuilder extends Builder<PatientRole> {

		@Override
		public PatientRole construct() {

			PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();

			II ii = DatatypesFactory.eINSTANCE.createII();

			ii.setRoot("CLINICID");

			ii.setExtension("PatientId");

			patientRole.getIds().add(ii);

			AD ad = DatatypesFactory.eINSTANCE.createAD();

			ad.getUses().add(PostalAddressUse.HP);

			ad.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, "100 Bureau Drive"));

			ad.getCities().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, "Gaithersburg"));

			ad.getStates().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, "MD"));

			ad.getPostalCodes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, "20899"));

			patientRole.getAddrs().add(ad);

			TEL homePhone = DatatypesFactory.eINSTANCE.createTEL();

			homePhone.setValue("tel:+1-301-555-5555");

			homePhone.getUses().add(TelecommunicationAddressUse.HP);

			patientRole.getTelecoms().add(homePhone);

			return patientRole;
		}

	}

	/**
	 * Extend BuildPatient utility implementation
	 * 
	 */
	public static class HITSPC32PatientBuilder extends BuildPatient {

		public HITSPC32PatientBuilder(String[] givenNames, String familyName, String suffix, String dob, String gender) {
			super(givenNames, familyName, suffix, dob, gender);
		}

		@Override
		public Patient construct() {
			Patient patient = super.construct();

			patient.setMaritalStatusCode(DatatypesFactory.eINSTANCE.createCE("S", "2.16.840.1.113883.5.2", "HL7 MaritalStatus", "Single"));

			LanguageSpoken languageSpoken = HITSPFactory.eINSTANCE.createLanguageSpoken().init();

			languageSpoken.setModeCode(DatatypesFactory.eINSTANCE.createCE("EWR", "2.16.840.1.113883.5.60"));
			
			
			languageSpoken.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("en-US"));

			patient.getLanguageCommunications().add(languageSpoken);

			return patient;
		}

	}

	/**
	 * Define Author Builder
	 * 
	 */
	public static class HITSPC32BuildAuthor extends ArrayBuilder<Author> {

		@Override
		public ArrayList<Author> construct() {
			ArrayList<Author> authors = new ArrayList<Author>();

			Author author = CDAFactory.eINSTANCE.createAuthor();

			author.setTime(new BuilderUtil.BuildEffectiveTime().construct());

			AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();

			assignedAuthor.getIds().add(DatatypesFactory.eINSTANCE.createII());

			author.setAssignedAuthor(assignedAuthor);

			Person assignedPerson = CDAFactory.eINSTANCE.createPerson();

			assignedAuthor.setAssignedPerson(assignedPerson);

			PN name = DatatypesFactory.eINSTANCE.createPN();

			name.addText("Auto Generated");

			assignedPerson.getNames().add(name);

			TEL authorPhone = DatatypesFactory.eINSTANCE.createTEL();

			authorPhone.setValue("tel:+1-301-975-3251");

			authorPhone.getUses().add(TelecommunicationAddressUse.HP);

			assignedAuthor.getTelecoms().add(authorPhone);

			AD authorAddresss = DatatypesFactory.eINSTANCE.createAD();

			assignedAuthor.getAddrs().add(authorAddresss);

			Organization organization = CDAFactory.eINSTANCE.createOrganization();

			ON on = DatatypesFactory.eINSTANCE.createON();

			on.addText("NIST Healthcare Testing Laboratory");

			organization.getNames().add(on);

			organization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());

			organization.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			assignedAuthor.setRepresentedOrganization(organization);

			authors.add(author);

			return authors;
		}

	}

	public static void main(String[] args) {

		/*
		 * Define and override various builders
		 */
		DocumentBuilder exampleHITSPC32 = new DocumentBuilder() {

			@Override
			public DiagnosticResultsSectionBuilder getDiagnosticResultsSectionBuilder() {

				return new DiagnosticResultsSectionBuilder() {

					@Override
					public ArrayBuilder<Organizer> getOrganizerBuilder() {
						return new ArrayBuilder<Organizer>() {

							@Override
							public ArrayList<Organizer> construct() {
								ArrayList<Organizer> organizers = new ArrayList<Organizer>();

								ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer().init();

								resultOrganizer.setClassCode(x_ActClassDocumentEntryOrganizer.BATTERY);
								
								addID(resultOrganizer, "7d5a02b0-67a4-11db-bd13-0800200c9a66");

								resultOrganizer.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
								
								resultOrganizer.setCode(BuilderUtil.buildSNOMEDCT("43789009", "CBC WO DIFFERENTIAL"));

								ProcedureEntryProcedureActivityProcedure pepap = IHEFactory.eINSTANCE.createProcedureEntryProcedureActivityProcedure().init();

								pepap.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.17"));

								pepap.setCode(BuilderUtil.buildSNOMEDCT("43789009", "CBC WO DIFFERENTIAL"));

								pepap.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Extract blood for CBC test"));

								pepap.setText(DatatypesFactory.eINSTANCE
										.createED("Extract blood for CBC test. Note that IHE rules require description and reference to go here rather than in originalText of code."));

								pepap.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();

								performer.setTypeCode(ParticipationPhysicalPerformer.PRF);

								AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();

								assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5.2", "PseudoMD-1"));

								performer.setAssignedEntity(assignedEntity);

								pepap.getPerformers().add(performer);

								resultOrganizer.addProcedure(pepap);

								Result result = HITSPFactory.eINSTANCE.createResult().init();

								addID(result, "107c2dc0-67a5-11db-bd13-0800200c9a66");

								result.setCode(BuilderUtil.buildLOINC("30313-1", "HGB"));

								result.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								result.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("200003231430"));

								result.getValues().add(DatatypesFactory.eINSTANCE.createPQ(13.2, "g/dl"));

								ReferenceRange e = CDAFactory.eINSTANCE.createReferenceRange();

								ObservationRange value = CDAFactory.eINSTANCE.createObservationRange();

								value.setText(DatatypesFactory.eINSTANCE.createED("M 13-18 g/dl; F 12-16 g/dl"));

								e.setObservationRange(value);

								result.getReferenceRanges().add(e);

								resultOrganizer.addObservation(result);

								organizers.add(resultOrganizer);

								return organizers;

							}

						};
					}

				};
			}

			@Override
			public EncoutersSectionBuilder getEncoutersSectionBuilder() {
			return new EncoutersSectionBuilder ()
			{
				
				@Override
				public ArrayBuilder<Encounter> getEncounterBuilder() {
					return new ArrayBuilder<Encounter>() {

						@Override
						public ArrayList<Encounter> construct() {
							ArrayList<Encounter> encounters = new ArrayList<Encounter>();

							EncountersActivity encountersActivity = CCDFactory.eINSTANCE.createEncountersActivity().init();

							encountersActivity.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.16"));

							encountersActivity.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.14"));

							addID(encountersActivity, "2a620155-9d11-439e-92b3-5d9815ff4de8");
							
							encountersActivity.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));

							encountersActivity.setCode(DatatypesFactory.eINSTANCE.createCD("99241", "2.16.840.1.113883.6.12", "C4", "Office consultation - 15 minutes"));

							encountersActivity.getCode().getTranslations()
									.add(DatatypesFactory.eINSTANCE.createCD("AMB", "2.16.840.1.113883.5.4", "HL7 ActEncounterCode", "Ambulatory"));

							encountersActivity.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("20000407"));

							Participant2 participant = CCDFactory.eINSTANCE.createEncounterLocation().init();

							participant.setTypeCode(ParticipationType.LOC);

							ParticipantRole participantRole = CDAFactory.eINSTANCE.createParticipantRole();

							participantRole.setClassCode(RoleClassRoot.SDLOC);

							participantRole.setPlayingEntity(BuilderUtil.buildPlayingEntity("Good Health clinic"));

							addID(participantRole, "2.16.840.1.113883.19.5");

							participant.setParticipantRole(participantRole);

							encountersActivity.getParticipants().add(participant);

							encounters.add(encountersActivity);

							return encounters;

						}

					};
				}
				
			};
			}

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
				return new BuilderUtil.BuildII("2.16.840.1.113883.3.72", "HITSP_C32v2.5_Rev6_16Sections_Entries_MinimalErrors", "NIST Healthcare Project");
			}

			@Override
			public Builder<CE> getDocumentCodeBuilder() {
				return new BuilderUtil.BuildCE("34133-9", "2.16.840.1.113883.6.1", "LOINC", "Summarization of episode note");
			}

			@Override
			public Builder<ST> getDocumentTitleBuilder() {
				return new BuilderUtil.BuildST("Example Healthcare Record");
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
				return new BuilderUtil.BuildCS("nn-CC");
			}

			@Override
			public Builder<PatientRole> getPatientRoleBuilder() {
				return new HITSPC32PatientRoleBuilder();
			}

			@Override
			public Builder<Patient> getPatientBuilder() {
				return new HITSPC32PatientBuilder(new String[] { "FirstName", "MiddleName" }, "PatientLastName", "", "19840704", "M");
			}

			@Override
			public ArrayBuilder<Author> getAuthorBuilder() {
				return new HITSPC32BuildAuthor();
			}

			public Builder<Custodian> getCustodianBuilder() {

				return new Builder<Custodian>() {

					@Override
					public Custodian construct() {

						Custodian custodian = CDAFactory.eINSTANCE.createCustodian();

						AssignedCustodian assignedCustodian = CDAFactory.eINSTANCE.createAssignedCustodian();

//						assignedCustodian.set
						custodian.setAssignedCustodian(assignedCustodian);

						CustodianOrganization custodianOrganization = CDAFactory.eINSTANCE.createCustodianOrganization();

						custodianOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("NIST"));
						ON on = DatatypesFactory.eINSTANCE.createON();

						on.addText("NIST Registry");

						custodianOrganization.setName(on);

						AD ad = DatatypesFactory.eINSTANCE.createAD();

						ad.getUses().add(PostalAddressUse.HP);

						ad.getStreetAddressLines().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STR, "100 Bureau Drive"));

						ad.getCities().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.CTY, "Gaithersburg"));

						ad.getStates().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.STA, "MD"));

						ad.getPostalCodes().add(DatatypesFactory.eINSTANCE.createADXP(AddressPartType.ZIP, "20899"));

						custodianOrganization.setAddr(ad);

						TEL phone = DatatypesFactory.eINSTANCE.createTEL();

						phone.setValue("tel:+1-301-555-5555");

						phone.getUses().add(TelecommunicationAddressUse.HP);

						custodianOrganization.setTelecom(phone);

						assignedCustodian.setRepresentedCustodianOrganization(custodianOrganization);

						return custodian;
					}

				};
			}

			public ArrayBuilder<Participant1> getParticipantBuilder() {
				return new ArrayBuilder<Participant1>() {

					@Override
					public ArrayList<Participant1> construct() {
						ArrayList<Participant1> participants = new ArrayList<Participant1>();

						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();

						II ii = DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.3");
						ii.setAssigningAuthorityName("HITSP/C83");

						participant.getTemplateIds().add(ii);

						ii = DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.2.4");
						ii.setAssigningAuthorityName("IHE/PCC");

						participant.getTemplateIds().add(ii);

						participant.setTime(DatatypesFactory.eINSTANCE.createIVL_TS("19840704", ""));

						participant.setTypeCode(ParticipationType.IND);

						AssociatedEntity associatedEntity = CDAFactory.eINSTANCE.createAssociatedEntity();
						RoleClassAssociative ra;

						associatedEntity.setClassCode(RoleClassAssociative.NOK);

						associatedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("NOTCHECKED", "2.16.840.1.113883.5.111", "HL7 RoleCode (Personal Relationship value set)",
								"Mother"));

						associatedEntity.getAddrs().add(BuilderUtil.buildHomeAddress("Gaithersburg", "MD"));

						associatedEntity.getTelecoms().add(BuilderUtil.buildHomePhone("tel:+1-301-555-5555"));

						associatedEntity.setAssociatedPerson(BuilderUtil.buildPerson("Paitents", "Mother"));

						participant.setAssociatedEntity(associatedEntity);

						participants.add(participant);

						return participants;
					}

				};
			}

			private HealthcareProvider createHealthCareProvider(String ID, String givenName, String familyName) {
				HealthcareProvider healthcareProvider = HITSPFactory.eINSTANCE.createHealthcareProvider().init();

				CE ce = DatatypesFactory.eINSTANCE.createCE("PP", "2.16.840.1.113883.12.443", "Provider Role", "Primary Care Provider");

				ce.setOriginalText(DatatypesFactory.eINSTANCE.createED("Primary Care Provider"));

				healthcareProvider.setFunctionCode(ce);

				healthcareProvider.setTime(DatatypesFactory.eINSTANCE.createIVL_TS("20020601", "20070915"));

				AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();

				assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5.2", ID));

				assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("200000000X", "Provider Codes", "2.16.840.1.113883.6.101", "Allopathic and Osteopathic Physicians"));

				assignedEntity.getTelecoms().add(BuilderUtil.buildHomePhone("tel:+1-301-975-3251"));

				assignedEntity.setAssignedPerson(BuilderUtil.buildPerson("Dr.", givenName, familyName));

				// how do we set this ? <sdtc:birthTime nullFlavor="ASKU"/>

				healthcareProvider.setAssignedEntity(assignedEntity);

				Organization representedOrganization = CDAFactory.eINSTANCE.createOrganization();

				representedOrganization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5"));

				ON on = DatatypesFactory.eINSTANCE.createON();

				on.addText("NIST HL7 Test Laboratory");

				representedOrganization.getNames().add(on);

				representedOrganization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());

				representedOrganization.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				assignedEntity.getRepresentedOrganizations().add(representedOrganization);

				SDTCPatient patient = CDAFactory.eINSTANCE.createSDTCPatient();

				patient.setId(DatatypesFactory.eINSTANCE.createII());

				assignedEntity.setSDTCPatient(patient);

				return healthcareProvider;

			}

			@Override
			public ArrayBuilder<DocumentationOf> getDocumentationOfBuilder() {
				return new ArrayBuilder<DocumentationOf>() {

					@Override
					public ArrayList<DocumentationOf> construct() {

						ArrayList<DocumentationOf> documentationOfs = new ArrayList<DocumentationOf>();

						DocumentationOf documentationOf = CDAFactory.eINSTANCE.createDocumentationOf();

						documentationOf.setTypeCode(ActRelationshipType.DOC);

						ServiceEvent serviceEvent = CDAFactory.eINSTANCE.createServiceEvent();

						serviceEvent.setClassCode(ActClassRoot.PCPR);

						serviceEvent.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("20020601", "20070915"));

						serviceEvent.getPerformers().add(createHealthCareProvider("PseudoMD-1", "Psuedo", "Physician-1"));

						serviceEvent.getPerformers().add(createHealthCareProvider("PseudoMD-3", "Psuedo", "Physician-3"));

						documentationOf.setServiceEvent(serviceEvent);

						documentationOfs.add(documentationOf);

						return documentationOfs;
					}

				};
			}

			@Override
			public PurposeSectionBuilder getPurposeSectionBuilder() {
				return new PurposeSectionBuilder() {

					@Override
					public ArrayBuilder<Entry> getEntryBuilder() {

						return new ArrayBuilder<Entry>() {

							@Override
							public ArrayList<Entry> construct() {
								ArrayList<Entry> entries = new ArrayList<Entry>();

								Entry entry = CDAFactory.eINSTANCE.createEntry();

								entry.setTypeCode(x_ActRelationshipEntry.DRIV);

								PurposeActivity purposeActivity = CCDFactory.eINSTANCE.createPurposeActivity().init();

								EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.RSON);

								Act act = CDAFactory.eINSTANCE.createAct();

								act.setCode(BuilderUtil.buildSNOMEDCT("308292007", "Transfer of care"));

								act.setStatusCode(DatatypesFactory.eINSTANCE.createCS("closed"));

								entryRelationship.setAct(act);

								purposeActivity.getEntryRelationships().add(entryRelationship);

								entry.setAct(purposeActivity);

								entries.add(entry);

								return entries;

							}

						};

					}

				};
			}

			@Override
			public PayersSectionBuilder getPayersSectionBuilder() {

				return new PayersSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Insurance Providers");
					}

					@Override
					public ArrayBuilder<Entry> getEntryBuilder() {
						return new ArrayBuilder<Entry>() {

							@Override
							public ArrayList<Entry> construct() {
								ArrayList<Entry> entries = new ArrayList<Entry>();
//
//								Entry entry = CDAFactory.eINSTANCE.createEntry();
//
//								
//								entry.setTypeCode(x_ActRelationshipEntry.DRIV);
//
//								CoverageEntry coverageEntry = IHEFactory.eINSTANCE.createCoverageEntry().init();
//
//								coverageEntry.getIds().add(DatatypesFactory.eINSTANCE.createII("9e676a50-7aac-11db-9fe1-0800200c9a66"));
//								
//								EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
//
//								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
//
//								InsuranceProvider insuranceProvider = HITSPFactory.eINSTANCE.createInsuranceProvider().init();
//								
//								insuranceProvider.getIds().add(DatatypesFactory.eINSTANCE.createII("3e676a50-7aac-11db-9fe1-0800200c9a66", "Group or Contract Number"));
//
//								entryRelationship.setAct(insuranceProvider);
//
//								Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
//
//								performer.setTypeCode(ParticipationPhysicalPerformer.PRF);
//
//								AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
//
//								assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("329fcdf0-7ab3-11db-9fe1-0800200c9a66"));
//
//								assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("PAYOR", "2.16.840.1.113883.5.110", "HL7 RoleClassRelationship", ""));
//
//								assignedEntity.getAddrs().add(BuilderUtil.AD_UNK);
//
//								assignedEntity.getTelecoms().add(BuilderUtil.TEL_UNK);
//
//								Organization organization = CDAFactory.eINSTANCE.createOrganization();
//
//								ON name = DatatypesFactory.eINSTANCE.createON();
//
//								name.addText("Good Health Insurance");
//
//								organization.getNames().add(name);
//
//								assignedEntity.getRepresentedOrganizations().add(organization);
//
//								SDTCPatient patient = CDAFactory.eINSTANCE.createSDTCPatient();
//
//								patient.setId(DatatypesFactory.eINSTANCE.createII("PatientIdAsKnownToPayor"));
//
//								assignedEntity.setSDTCPatient(patient);
//
//								performer.setAssignedEntity(assignedEntity);
//
//								insuranceProvider.getPerformers().add(performer);
//
//								// Add Patients Moms Participation
//								Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();
//
//								participant.setTypeCode(ParticipationType.HLD);
//
//								ParticipantRole participantRole = CDAFactory.eINSTANCE.createParticipantRole();
//
//								participantRole.getIds().add(DatatypesFactory.eINSTANCE.createII("PayorAuthorityID", "SubscriberIDAsKnownToPayor"));
//
//								participantRole.setPlayingEntity(BuilderUtil.buildPlayingEntity("Patients Mom"));
//
//								participantRole.getPlayingEntity().setSDTCBirthTime(DatatypesFactory.eINSTANCE.createTS());
//
//								participant.setParticipantRole(participantRole);
//
//								insuranceProvider.getParticipants().add(participant);
//
//								// Add Patient Self Participation
//								participant = CDAFactory.eINSTANCE.createParticipant2();
//
//								participant.setTypeCode(ParticipationType.COV);
//
//								participantRole = CDAFactory.eINSTANCE.createParticipantRole();
//
//								participantRole.setClassCode(RoleClassRoot.PAT);
//
//								participantRole.getIds().add(DatatypesFactory.eINSTANCE.createII("14d4a520-7aae-11db-9fe1-0800200c9a66ID", "1138345"));
//
//								participantRole.setCode(DatatypesFactory.eINSTANCE.createCE("SELF", "2.16.840.1.113883.5.111", "", "SELF"));
//
//								participantRole.setPlayingEntity(BuilderUtil.buildPlayingEntity("Self"));
//
//								participantRole.getPlayingEntity().setSDTCBirthTime(DatatypesFactory.eINSTANCE.createTS());
//
//								participant.setParticipantRole(participantRole);
//
//								insuranceProvider.getParticipants().add(participant);
//
//								// Add Authorization
//								EntryRelationship authorizationRelationship = CDAFactory.eINSTANCE.createEntryRelationship();
//
//								AuthorizationActivity authorizationActivity = CCDFactory.eINSTANCE.createAuthorizationActivity().init();
//
//								authorizationActivity.getIds().add(DatatypesFactory.eINSTANCE.createII("f4dce790-8328-11db-9fe1-0800200c9a66"));
//
//								authorizationActivity.setCode(BuilderUtil.CD_NA);
//
//								EntryRelationship subject = CDAFactory.eINSTANCE.createEntryRelationship();
//
//								subject.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
//
//								Procedure procedure = CDAFactory.eINSTANCE.createProcedure();
//
//								procedure.setClassCode(ActClass.PROC);
//								
//								procedure.setMoodCode(x_DocumentProcedureMood.PRMS);
//
//								procedure.setCode(DatatypesFactory.eINSTANCE.createCD("73761001", "2.16.840.1.113883.6.96", "", "Colonoscopy"));
//
//								subject.setProcedure(procedure);
//
//								authorizationActivity.getEntryRelationships().add(subject);
//
//								authorizationRelationship.setAct(authorizationActivity);
//
//								insuranceProvider.getEntryRelationships().add(authorizationRelationship);
//
//								// Add Referral
//								EntryRelationship referal = CDAFactory.eINSTANCE.createEntryRelationship();
//
//								Act act = CDAFactory.eINSTANCE.createAct();
//
//								act.setClassCode(x_ActClassDocumentEntryAct.ACT);
//
//								act.setMoodCode(x_DocumentActMood.DEF);
//
//								act.getIds().add(DatatypesFactory.eINSTANCE.createII("f4dce790-8328-11db-9fe1-0800200c9a66"));
//
//								act.setCode(BuilderUtil.CD_UNK);
//
//								act.setText(DatatypesFactory.eINSTANCE.createED("Health Plan Name<reference value=\"PntrToHealthPlanNameInSectionText\"/>"));
//
//								act.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));
//
//								referal.setAct(act);
//
//								insuranceProvider.getEntryRelationships().add(referal);
//
//								coverageEntry.getEntryRelationships().add(entryRelationship);
//
//								entry.setAct(coverageEntry);
//
//								entries.add(entry);

								return entries;
							}

						};
					}

				};
			}

			@Override
			public AllergiesReactionSectionBuilder getAllergiesReactionSectionBuilder() {

				return new AllergiesReactionSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Allergies and Adverse Reactions");
					}

					private Participant2 buildDrugParticipation(String id, String name) {
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

					private EntryRelationship buildActiveStatus() {
						EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

						status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

						AlertStatusObservation observationStatus = CCDFactory.eINSTANCE.createAlertStatusObservation().init();

						observationStatus.getValues().add(DatatypesFactory.eINSTANCE.createCE("55561003", "2.16.840.1.113883.6.96", "", "Active"));

						status.setObservation(observationStatus);

						return status;

					}
					
					
					private EntryRelationship buildObservationSource() {
						EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

						status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

						Observation observation= CDAFactory.eINSTANCE.createObservation();

						observation.getValues().add(DatatypesFactory.eINSTANCE.createCE("48766-0", "2.16.840.1.113883.6.96", "", "Source of Information"));

						status.setObservation(observation);

						return status;

					}


					@Override
					public ArrayBuilder<Entry> getEntryBuilder() {
						return new ArrayBuilder<Entry>() {

							@Override
							public ArrayList<Entry> construct() {
								ArrayList<Entry> entries = new ArrayList<Entry>();

								// Add Penicillin/Hives Alert
								Entry entry = CDAFactory.eINSTANCE.createEntry();

								entry.setTypeCode(x_ActRelationshipEntry.DRIV);

								ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();
								
								addID(problemAct,"5adc1020-7b14-11db-9fe1-0800200c9a66");

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
								
								
//								problemObservation.gets
								
								
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

								alertObservation.setText(DatatypesFactory.eINSTANCE
										.createED("Duplication of pointer in originalText of Value below<reference value=\"PtrToValueInSectionText\"/>"));

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

						};
					}

				};
			}

			@Override
			public ProblemSectionBuilder getProblemSectionBuilder() {
				return new ProblemSectionBuilder() {
					IVL_TS lowUnknown = DatatypesFactory.eINSTANCE.createIVL_TS();

					{
						lowUnknown.setLow(BuilderUtil.getTS_UNK());
					}

					private Performer2 createPerformer(String extension) {
						Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();

						performer.setTypeCode(ParticipationPhysicalPerformer.PRF);

						AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();

						assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.72.5.2", extension));

						performer.setAssignedEntity(assignedEntity);

						return performer;
					}

					private Performer2 createPerformer(String extension, String time) {
						Performer2 performer = createPerformer(extension);

						performer.setTime(BuilderUtil.buildIVL_TSLow(time, null));

						return performer;
					}


					@Override
					public ArrayBuilder<ProblemAct> getProblemActBuilder() {
						return new ArrayBuilder<ProblemAct>() {

							@Override
							public ArrayList<ProblemAct> construct() {
								ArrayList<ProblemAct> problemActs = new ArrayList<ProblemAct>();

								// New ProblemAct
								ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();

								addID(problemAct, "6a2fa88d-4174-4909-aece-db44b60a3abb");

								problemAct.getPerformers().add(createPerformer("PseudoMD-2"));

								ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();

								problemObservation.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));
								
								addID(problemObservation, "d11275e7-67ae-11db-bd13-0800200c9a66");
								
								problemObservation.setCode(BuilderUtil.buildSNOMEDCT("64572001", "Condition"));

								problemObservation.setEffectiveTime(BuilderUtil.buildIVL_TSLow("1950", null));

								problemObservation.getValues().add(BuilderUtil.buildSNOMEDCT("195967001", "Asthma"));

								ProblemStatusObservation problemStatusObservation = CCDFactory.eINSTANCE.createProblemStatusObservation().init();

								problemStatusObservation.getValues().add(BuilderUtil.buildSNOMEDCE("55561003", "Active"));

								addObservation(problemObservation, problemStatusObservation, x_ActRelationshipEntryRelationship.REFR);

								addObservation(problemAct, problemObservation, x_ActRelationshipEntryRelationship.SUBJ);

								problemActs.add(problemAct);

								// New Condition
								Condition condition = HITSPFactory.eINSTANCE.createCondition().init();

								addID(condition, "ab1791b0-5c71-11db-b0de-0800200c9a66");

								condition.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

								condition.setEffectiveTime(lowUnknown);

								condition.getPerformers().add(createPerformer("PseudoMD-1", "2006"));

								ProblemEntry problemEntry = IHEFactory.eINSTANCE.createProblemEntry().init();

								problemEntry.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));
								
								addID(problemEntry, "ab1791b0-5c71-11db-b0de-0800200c9a66");

								problemEntry.setCode(BuilderUtil.buildSNOMEDCT("64572001", "Condition"));

								problemEntry.setEffectiveTime(BuilderUtil.buildIVL_TSLow("199701", BuilderUtil.getTS_UNK()));

								problemEntry.getValues().add(BuilderUtil.buildSNOMEDCT("233604007", "Pneumonia"));

								problemStatusObservation = CCDFactory.eINSTANCE.createProblemStatusObservation().init();

								problemObservation.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));
								
								problemStatusObservation.getValues().add(BuilderUtil.buildSNOMEDCE("413322009", "Resolved"));

								addObservation(problemEntry, problemStatusObservation, x_ActRelationshipEntryRelationship.REFR);

								addObservation(condition, problemEntry, x_ActRelationshipEntryRelationship.SUBJ);

								problemActs.add(condition);

								// New Condition
								condition = HITSPFactory.eINSTANCE.createCondition().init();

								addID(condition, "d11275e9-67ae-11db-bd13-0800200c9a66");

								condition.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

								condition.setEffectiveTime(lowUnknown);

								condition.getPerformers().add(createPerformer("PseudoMD-1", "2006"));

								problemEntry = IHEFactory.eINSTANCE.createProblemEntry().init();

								problemEntry.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));
								
								addID(problemEntry, "9d3d416d-45ab-4da1-912f-4583e0632000");

								problemEntry.setCode(BuilderUtil.buildSNOMEDCT("64572001", "Condition"));

								problemEntry.setEffectiveTime(BuilderUtil.buildIVL_TSLow("199903", BuilderUtil.getTS_UNK()));

								problemEntry.getValues().add(BuilderUtil.buildSNOMEDCT("233604007", "Pneumonia"));

								problemStatusObservation = CCDFactory.eINSTANCE.createProblemStatusObservation().init();

								problemStatusObservation.getValues().add(BuilderUtil.buildSNOMEDCE("413322009", "Resolved"));

								addObservation(problemEntry, problemStatusObservation, x_ActRelationshipEntryRelationship.REFR);

								addObservation(condition, problemEntry, x_ActRelationshipEntryRelationship.SUBJ);

								EpisodeObservation episodeObservation = CCDFactory.eINSTANCE.createEpisodeObservation().init();

								
								episodeObservation.setClassCode(ActClassObservation.OBS);
								
								episodeObservation.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));
								
								CD cd = BuilderUtil.buildSNOMEDCT("404684003", "Clinical finding");

								CR cr = DatatypesFactory.eINSTANCE.createCR();

								CV value = DatatypesFactory.eINSTANCE.createCV();

								value.setCode("246456000");

								value.setDisplayName("Episodicity");

								cr.setName(value);

								cr.setValue(BuilderUtil.buildSNOMEDCT("288527008", "New episode"));

								cd.getQualifiers().add(cr);

								episodeObservation.getValues().add(cd);

								Act act =CCDFactory.eINSTANCE.createProblemAct().init();
//
//								act.setClassCode(x_ActClassDocumentEntryAct.ACT);
//
//								act.setMoodCode(x_DocumentActMood.EVN);

								addID(act, "ec8a6ff8-ed4b-4f7e-82c3-e98e58b45de7");

								act.setCode(BuilderUtil.CD_NA);

								addAct(episodeObservation, act, x_ActRelationshipEntryRelationship.SUBJ);

								addObservation(condition, episodeObservation, x_ActRelationshipEntryRelationship.SUBJ);

								problemActs.add(condition);

								// New Condition
								condition = HITSPFactory.eINSTANCE.createCondition().init();

								addID(condition, "5a2c903c-bd77-4bd1-ad9d-452383fbfefa");

								condition.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

								condition.setEffectiveTime(lowUnknown);

								condition.getPerformers().add(createPerformer("PseudoMD-1"));

								problemEntry = IHEFactory.eINSTANCE.createProblemEntry().init();

								problemEntry.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));
								
								problemEntry.setCode(BuilderUtil.buildSNOMEDCT("64572001", "Condition"));

								problemEntry.setEffectiveTime(BuilderUtil.buildIVL_TSLow("1111", BuilderUtil.getTS_UNK()));

								problemEntry.getValues().add(BuilderUtil.buildSNOMEDCT("22298006", "Myocardial infarction"));

								problemStatusObservation = CCDFactory.eINSTANCE.createProblemStatusObservation().init();

								problemStatusObservation.getValues().add(BuilderUtil.buildSNOMEDCE("413322009", "Resolved"));

								addObservation(problemEntry, problemStatusObservation, x_ActRelationshipEntryRelationship.REFR);

								addObservation(condition, problemEntry, x_ActRelationshipEntryRelationship.SUBJ);

								problemActs.add(condition);

								// New Condition
								condition = HITSPFactory.eINSTANCE.createCondition().init();

								addID(condition, "5a2c903c-bd77-4bd1-ad9d-452383fbfefa");

								condition.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

								condition.setEffectiveTime(lowUnknown);

								condition.getPerformers().add(createPerformer("PseudoMD-1", "2006"));

								problemEntry = IHEFactory.eINSTANCE.createProblemEntry().init();

								problemEntry.setText(DatatypesFactory.eINSTANCE.createED("DISPLAY TEXT"));
								
								problemEntry.setCode(BuilderUtil.buildSNOMEDCT("64572001", "Condition"));

								problemEntry.setEffectiveTime(BuilderUtil.buildIVL_TSHigh(BuilderUtil.getTS_UNK(), "20091209"));

								problemEntry.getValues().add(BuilderUtil.buildSNOMEDCT("77386006", "Patient currently pregnant"));

								problemEntry.getPerformers().add(createPerformer("PseudoMD-1"));

								addObservation(condition, problemEntry, x_ActRelationshipEntryRelationship.SUBJ);

								problemActs.add(condition);

								return problemActs;
							}

						};
					}

				};
			}



			
			
			@Override
			public SurgeriesSectionBuilder getSurgeriesSectionBuilder() {
				return new SurgeriesSectionBuilder()
				{

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Surgeries/Procedures");
					}

					@Override
					public ArrayBuilder<Procedure> getProcedureBuilder() {
						return new ArrayBuilder<Procedure>()
						{

							@Override
							public ArrayList<Procedure> construct() {
								ArrayList<Procedure> procedures = new ArrayList<Procedure>();

								ProcedureEntryProcedureActivityProcedure pepap = IHEFactory.eINSTANCE.createProcedureEntryProcedureActivityProcedure().init();

								pepap.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.17"));

								addID(pepap, "e401f340-7be2-11db-9fe1-0800200c9a66");

								CD cd = BuilderUtil.buildSNOMEDCT("52734007", "Total hip replacement");

								CR cr = DatatypesFactory.eINSTANCE.createCR();

								CV value = DatatypesFactory.eINSTANCE.createCV();

								value.setCode("272741003");

								value.setDisplayName("Laterality");

								cr.setName(value);

								cr.setValue(BuilderUtil.buildSNOMEDCT("7771000", "Left"));

								cd.getQualifiers().add(cr);

								pepap.setCode(cd);

								pepap.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("1998"));

								Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();

								ProductInstance productInstance = CCDFactory.eINSTANCE.createProductInstance().init();

								addID(productInstance, "03ca01b0-7be1-11db-9fe1-0800200c9a66");

								Device device = CDAFactory.eINSTANCE.createDevice();

								device.setCode(BuilderUtil.buildSNOMEDCE("304120007", "Total hip replacement prosthesis"));

								productInstance.setPlayingDevice(device);

								Entity entity = CDAFactory.eINSTANCE.createEntity();

								addID(entity, "0abea950-5b40-4b7e-b8d9-2a5ea3ac5500");

								entity.setDesc(DatatypesFactory.eINSTANCE.createED("Good Health Prostheses Company"));

								productInstance.setScopingEntity(entity);

								participant.setParticipantRole(productInstance);

								pepap.getParticipants().add(participant);

								EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

								Act act = CDAFactory.eINSTANCE.createAct();

								act.setClassCode(x_ActClassDocumentEntryAct.ACT);

								act.setMoodCode(x_DocumentActMood.EVN);

								act.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.4"));

								act.setCode(BuilderUtil.CD_NA);

								Reference reference = CDAFactory.eINSTANCE.createReference();

								reference.setTypeCode(x_ActRelationshipExternalReference.REFR);

								ExternalDocument externalDocument = CDAFactory.eINSTANCE.createExternalDocument();

								externalDocument.setText(DatatypesFactory.eINSTANCE.createED("Location of Documentation -  URL or other"));

								reference.setExternalDocument(externalDocument);

								act.getReferences().add(reference);

								entryRelationship.setAct(act);

								pepap.getEntryRelationships().add(entryRelationship);

								pepap.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								pepap.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("200003231430"));

								procedures.add(pepap);

								return procedures;
							}
							
						};
					}
					
				};
			}

			@Override
			public MedicationsSectionBuilder getMedicationsSectionBuilder() {
				return new MedicationsSectionBuilder() {

					private EntryRelationship buildMedicationObservation(String code, String displayName) {

						EntryRelationship entry = CDAFactory.eINSTANCE.createEntryRelationship();

						entry.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

						Observation medicationObservation = CDAFactory.eINSTANCE.createObservation();

						medicationObservation.setClassCode(ActClassObservation.OBS);

						medicationObservation.setMoodCode(x_ActMoodDocumentObservation.EVN);

						medicationObservation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.8.1"));

						medicationObservation.setCode(BuilderUtil.buildSNOMEDCT(code, displayName));

						entry.setObservation(medicationObservation);

						return entry;

					}

					private EntryRelationship buildActiveMedicationStatusObservation() {

						EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

						status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

						MedicationStatusObservation observationStatus = CCDFactory.eINSTANCE.createMedicationStatusObservation().init();

						observationStatus.getValues().add(DatatypesFactory.eINSTANCE.createCE("55561003", "2.16.840.1.113883.6.96", "", "Active"));

						status.setObservation(observationStatus);

						return status;

					}

					private EntryRelationship buildSupplyActivity(String id, String date, int repeat, double quantity, String unit) {

						EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

						status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

						SupplyActivity supplyActivity = CCDFactory.eINSTANCE.createSupplyActivity().init();

						addID(supplyActivity,id);
						
						supplyActivity.setMoodCode(x_DocumentSubstanceMood.INT);

						supplyActivity.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.8.3"));

						supplyActivity.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.7.3"));

						supplyActivity.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

						supplyActivity.getEffectiveTimes().add(BuilderUtil.buildIVL_TSLow(date, BuilderUtil.getTS_UNK()));

						IVL_INT repeatNumber = DatatypesFactory.eINSTANCE.createIVL_INT();

						repeatNumber.setValue(repeat);

						supplyActivity.setRepeatNumber(repeatNumber);

						PQ pq = DatatypesFactory.eINSTANCE.createPQ(quantity, unit);

						supplyActivity.setQuantity(pq);

						status.setSupply(supplyActivity);

						return status;

					}

					private CE buildFDARouteOfAdministrationCode(String fdaCode, String fdaDisplayName, String hl7Code, String hl7DisplayName) {
						CE ce = DatatypesFactory.eINSTANCE.createCE(fdaCode, "2.16.840.1.113883.3.26.1.1", "FDA RouteOfAdministration", fdaDisplayName);

						CD cd = DatatypesFactory.eINSTANCE.createCD(hl7Code, "2.16.840.1.113883.5.112", "HL7 RouteOfAdministration", hl7DisplayName);

						ce.getTranslations().add(cd);

						return ce;
					}

					@Override
					public ArrayBuilder<SubstanceAdministration> getSubstanceAdministrationBuilder() {
						return new ArrayBuilder<SubstanceAdministration>() {

							@Override
							public ArrayList<SubstanceAdministration> construct() {
								ArrayList<SubstanceAdministration> medications = new ArrayList<SubstanceAdministration>();

								NormalDose dose = IHEFactory.eINSTANCE.createNormalDose().init();

								dose.setText(DatatypesFactory.eINSTANCE.createED("******************************* Albuterol *************************************"));

								addID(dose, "cdbd33f0-6cde-11db-9fe1-0800200c9a66");

								dose.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

								// TODO Effective Times

								// CE DatatypesFactory.;
								dose.setRouteCode(DatatypesFactory.eINSTANCE.createCE("IPINHL", "2.16.840.1.113883.5.112", "HL7 RouteOfAdministration", "Inhalation, oral"));

								IVL_PQ doseQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								doseQuantity.setValue(2.0);

								dose.setDoseQuantity(doseQuantity);

								dose.setAdministrationUnitCode(BuilderUtil.buildSNOMEDCE("415215001", "Puff"));

								Consumable consumable = CDAFactory.eINSTANCE.createConsumable();

								Product product = CCDFactory.eINSTANCE.createProduct().init();

								Material material = CDAFactory.eINSTANCE.createMaterial();

								material.setCode(BuilderUtil.buildRxNORM("307782", "Albuterol 0.09 MG/ACTUAT inhalant solution"));

								material.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Albuterol inhalant"));

								product.setManufacturedMaterial(material);

								consumable.setManufacturedProduct(product);

								dose.setConsumable(consumable);

								dose.getEntryRelationships().add(buildActiveMedicationStatusObservation());

								
								Precondition precondition = CDAFactory.eINSTANCE.createPrecondition();

								precondition.setTypeCode(ActRelationshipType.PRCN);

								Criterion criterion = CDAFactory.eINSTANCE.createCriterion();

								criterion.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4", null, null));

								criterion.setValue(BuilderUtil.buildSNOMEDCE("56018004", "Wheezing"));

								precondition.setCriterion(criterion);

								dose.getPreconditions().add(precondition);

								medications.add(dose);

								// New Medication

								Medication medication = HITSPFactory.eINSTANCE.createMedication().init();

								addID(medication, "cdbd5b05-6cde-11db-9fe1-0800200c9a66");

								medication.setText(DatatypesFactory.eINSTANCE.createED("******************************* Plavix *************************************"));

								medication.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								medication.setRouteCode(buildFDARouteOfAdministrationCode("C38288", "Oral", "PO", "Swallow, oral"));

								doseQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								doseQuantity.setValue(1.0);

								medication.setDoseQuantity(doseQuantity);

								IVL_PQ rateQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								rateQuantity.setNullFlavor(NullFlavor.NA);

								medication.setRateQuantity(rateQuantity);

								consumable = CDAFactory.eINSTANCE.createConsumable();

								product = IHEFactory.eINSTANCE.createProductEntry().init();

								material = CDAFactory.eINSTANCE.createMaterial();

								material.setCode(BuilderUtil.buildRxNORM("309362", "Clopidogrel 75 MG oral tablet"));

								material.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Clopidogrel"));

								material.getCode().getTranslations().add(BuilderUtil.buildRxNORM("174742", "Plavix"));

								product.setManufacturedMaterial(material);

								consumable.setManufacturedProduct(product);

								medication.setConsumable(consumable);

								medication.getEntryRelationships().add(buildActiveMedicationStatusObservation());

								medication.getEntryRelationships().add(buildSupplyActivity("adbd5b01-6cde-11db-9fe1-0800200c9a66","20020101", 1, 75, "mg"));

								medication.getEntryRelationships().add(buildMedicationObservation("73639000", "Prescription Drug"));

								// TODO Effective Times

								medications.add(medication);

								// New Medication
								medication = HITSPFactory.eINSTANCE.createMedication().init();

								addID(medication, "cdbd5b01-6cde-11db-9fe1-0800200c9a66");

								medication.setText(DatatypesFactory.eINSTANCE.createED("******************************* Metoprolol *************************************"));

								medication.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								// TODO Effective Times

								medication.setRouteCode(buildFDARouteOfAdministrationCode("C38288", "Oral", "PO", "Swallow, oral"));

								doseQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								doseQuantity.setValue(1.0);

								medication.setDoseQuantity(doseQuantity);

								rateQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								rateQuantity.setNullFlavor(NullFlavor.NA);

								medication.setRateQuantity(rateQuantity);

								consumable = CDAFactory.eINSTANCE.createConsumable();

								product = IHEFactory.eINSTANCE.createProductEntry().init();

								material = CDAFactory.eINSTANCE.createMaterial();

								material.setCode(BuilderUtil.buildRxNORM("430618", "Metoprolol 25 MG oral tablet"));

								material.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Metoprolol"));
								EN en = DatatypesFactory.eINSTANCE.createEN();
								en.addText("Generic Brand");
								material.setName(en);

								product.setManufacturedMaterial(material);

								consumable.setManufacturedProduct(product);

								medication.setConsumable(consumable);

								medication.getEntryRelationships().add(buildActiveMedicationStatusObservation());

								medication.getEntryRelationships().add(buildSupplyActivity("5dbd5b01-6cde-11db-9fe1-0800200c9a66","20020101", 1, 5, "mg"));

								medication.getEntryRelationships().add(buildMedicationObservation("73639000", "Prescription Drug"));

								EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

								PatientInstruction patientInstruction = CCDFactory.eINSTANCE.createPatientInstruction().init();

								patientInstruction.setClassCode(x_ActClassDocumentEntryAct.INFRM); 
								
								patientInstruction.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.3"));

								patientInstruction.setCode(DatatypesFactory.eINSTANCE.createCD("PINSTRUCT", "1.3.6.1.4.1.19376.1.5.3.2", "IHEActCode", ""));

								patientInstruction
										.setText(DatatypesFactory.eINSTANCE
												.createED("This is the text of the Patient Instruction coded in this Act. Note that this instruction is printed in the narrative text of the parent Section and is refereced by the following pointer to it."));

								patientInstruction.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								org.openhealthtools.mdht.uml.cda.ihe.Comment comment = IHEFactory.eINSTANCE.createComment().init();
								
//								comment.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.1.40"));

//								comment.setCode(DatatypesFactory.eINSTANCE.createCD("48767-8", "LOINC", "2.16.840.1.113883.6.1", "comment"));

								comment.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("ccccccccccccccccccccccccccccccccccccccc Reference goes on text element rather than here."));

								comment.setText(DatatypesFactory.eINSTANCE
										.createED("This is the only formal \"Free Text comment\" in this document! Note that ALL such comments must appear in the narrative text of the parent Section and be referenced by the following pointer to it."));
								patientInstruction.addAct(comment);

								entryRelationship.setAct(patientInstruction);

								medication.getEntryRelationships().add(entryRelationship);

								entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

								FulfillmentInstruction fulfillmentInstruction = CCDFactory.eINSTANCE.createFulfillmentInstruction().init();

								fulfillmentInstruction.setClassCode(x_ActClassDocumentEntryAct.INFRM);
								
								fulfillmentInstruction.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.3.1"));

								fulfillmentInstruction.setCode(DatatypesFactory.eINSTANCE.createCD("FINSTRUCT", "1.3.6.1.4.1.19376.1.5.3.2", "IHEActCode", ""));

								fulfillmentInstruction.setText(DatatypesFactory.eINSTANCE.createED("IHE Requires reference to go here instead of originalText of code."));

								fulfillmentInstruction.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								entryRelationship.setAct(fulfillmentInstruction);

								medication.getEntryRelationships().add(entryRelationship);

								medications.add(medication);

								// New Medication
								medication = HITSPFactory.eINSTANCE.createMedication().init();

								addID(medication, "cdbd5b03-6cde-11db-9fe1-0800200c9a66");

								medication.setText(DatatypesFactory.eINSTANCE.createED("******************************* Prednisone *************************************"));

								medication.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

								// TODO Effective Times

								medication.setRouteCode(buildFDARouteOfAdministrationCode("C38288", "Oral", "PO", "Swallow, oral"));

								doseQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								doseQuantity.setValue(1.0);

								medication.setDoseQuantity(doseQuantity);

								rateQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								rateQuantity.setNullFlavor(NullFlavor.NA);

								medication.setRateQuantity(rateQuantity);

								consumable = CDAFactory.eINSTANCE.createConsumable();

								product = IHEFactory.eINSTANCE.createProductEntry().init();

								material = CDAFactory.eINSTANCE.createMaterial();

								material.setCode(BuilderUtil.buildRxNORM("312615", "Prednisone 20 MG oral tablet"));

								material.getCode().getTranslations().add(BuilderUtil.buildRxNORM("227730", "Deltasone"));

								material.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Prednisone"));

								product.setManufacturedMaterial(material);

								consumable.setManufacturedProduct(product);

								medication.setConsumable(consumable);

								medication.getEntryRelationships().add(buildActiveMedicationStatusObservation());

								medication.getEntryRelationships().add(buildSupplyActivity("edbd5b01-6cde-11db-9fe1-0800200c9a66","20020101", 1, 1, "tablet"));

								medication.getEntryRelationships().add(buildMedicationObservation("329505003", "Over the counter product"));

								medications.add(medication);

								// New Medication
								medication = HITSPFactory.eINSTANCE.createMedication().init();

								addID(medication, "cdbd5b07-6cde-11db-9fe1-0800200c9a66");

								medication.setText(DatatypesFactory.eINSTANCE.createED("******************************* Cephalexin *************************************"));

								medication.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));

								// TODO Effective Times

								medication.setRouteCode(buildFDARouteOfAdministrationCode("C38288", "Oral", "PO", "Swallow, oral"));

								doseQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								doseQuantity.setValue(1.0);

								medication.setDoseQuantity(doseQuantity);

								rateQuantity = DatatypesFactory.eINSTANCE.createIVL_PQ();

								rateQuantity.setNullFlavor(NullFlavor.NA);

								medication.setRateQuantity(rateQuantity);

								consumable = CDAFactory.eINSTANCE.createConsumable();

								product = IHEFactory.eINSTANCE.createProductEntry().init();

								material = CDAFactory.eINSTANCE.createMaterial();

								material.setCode(BuilderUtil.buildRxNORM("197454", "Cephalexin 500 MG oral tablet"));

								material.getCode().getTranslations().add(BuilderUtil.buildRxNORM("203167", "Keflex"));

								material.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED("Cephalexin"));

								product.setManufacturedMaterial(material);

								consumable.setManufacturedProduct(product);

								medication.setConsumable(consumable);

								medication.getEntryRelationships().add(buildActiveMedicationStatusObservation());

								medication.getEntryRelationships().add(buildSupplyActivity("hdbd5b01-6cde-11db-9fe1-0800200c9a66","20020101", 1, 1, "tablet"));

								medication.getEntryRelationships().add(buildMedicationObservation("73639000", "Prescription Drug"));

								entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

								ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();

								addID(problemObservation, "cdbd5b08-6cde-11db-9fe1-0800200c9a66");

								problemObservation.setCode(BuilderUtil.buildSNOMEDCT("VA/KPproblemList", "VA/KP"));

								problemObservation.getCode().setOriginalText(
										DatatypesFactory.eINSTANCE.createED("VA/KP ProblemList subset of SNOMED http://evs.nci.nih.gov/ftp1/FDA/ProblemList/"));

								problemObservation.getCode().getTranslations().add(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4", null, null));

								problemObservation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								problemObservation.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("20000328", null));

								problemObservation.getValues().add(DatatypesFactory.eINSTANCE.createCE("32398004", "2.16.840.1.113883.6.96", null, "Bronchitis"));

								entryRelationship.setObservation(problemObservation);

								medication.getEntryRelationships().add(entryRelationship);

								medications.add(medication);

								return medications;

							}

						};
					}

				};
			}

			@Override
			public AdvanceDirectivesSectionBuilder getAdvanceDirectivesSectionBuilder() {

				return new AdvanceDirectivesSectionBuilder() {

					@Override
					public ArrayBuilder<Observation> getObservationBuilder() {
						return new ArrayBuilder<Observation>() {

							@Override
							public ArrayList<Observation> construct() {
								ArrayList<Observation> observations = new ArrayList<Observation>();

								AdvanceDirectiveObservation observation = CCDFactory.eINSTANCE.createAdvanceDirectiveObservation().init();

								observation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.12"));

								observation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.13"));

								observation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.13.7"));

								addID(observation, "9b54c3c9-1673-49c7-aef9-b037ed72ed27");

								observation.setCode(BuilderUtil.buildSNOMEDCT("304251008", "Resuscitation"));

								observation
										.getCode()
										.setOriginalText(
												DatatypesFactory.eINSTANCE
														.createED("<reference value=\"Points to Resuscitation in narrative text of parent Section? cf C83-[225]. Shouldn't the value element contain the words used for what to do about resuscitation?\"/>"));

								observation
										.setText(DatatypesFactory.eINSTANCE
												.createED("Pointer in this location recommended by IHE - rather than originalText in Value below<reference value=\"PtrToValueInsectionText\"/>"));

								observation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								observation.setEffectiveTime(BuilderUtil.buildIVL_TSLow("19991107", BuilderUtil.getTS_NA()));

								observation.getValues().add(BuilderUtil.buildSNOMEDCT("304253006", "Do not resuscitate"));

								// Add Patients Moms Participation
								Participant2 participant = CDAFactory.eINSTANCE.createParticipant2();

								participant.setTypeCode(ParticipationType.CST);

								ParticipantRole participantRole = CDAFactory.eINSTANCE.createParticipantRole();

								participantRole.setClassCode(RoleClassRoot.AGNT);

								participantRole.setPlayingEntity(BuilderUtil.buildPlayingEntity("Good Health clinic"));

								participant.setParticipantRole(participantRole);

								observation.getParticipants().add(participant);

								AdvanceDirectiveVerification advanceDirectiveVerification = CCDFactory.eINSTANCE.createAdvanceDirectiveVerification().init();

								participantRole = CDAFactory.eINSTANCE.createParticipantRole();

								addID(participantRole, "20cf14fb-b65c-4c8c-a54d-b0cca834c18c");

								participantRole.setPlayingEntity(BuilderUtil.buildPlayingEntity("Good Health clinic"));

								advanceDirectiveVerification.setParticipantRole(participantRole);

								AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation = CCDFactory.eINSTANCE.createAdvanceDirectiveStatusObservation().init();

								advanceDirectiveStatusObservation.setCode(DatatypesFactory.eINSTANCE.createCD("33999-4", "2.16.840.1.113883.6.1", "LOINC", "Status"));
								;

								advanceDirectiveStatusObservation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								advanceDirectiveStatusObservation.getValues().add(BuilderUtil.buildSNOMEDCE("15240007", "Current and verified"));

								observation.addObservation(advanceDirectiveStatusObservation);

								Observation newObservation = CDAFactory.eINSTANCE.createObservation();

								newObservation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.1.36"));

								addID(newObservation, "b50b7910-7ffb-4f4c-bbe4-177ed68cbbf3");

								newObservation.setCode(BuilderUtil.buildSNOMEDCT("371538006", "Advance directive"));

								ED value = DatatypesFactory.eINSTANCE.createED("<reference value=\"AdvanceDirective.b50b7910-7ffb-4f4c-bbe4-177ed68cbbf3.pdf\"/>");

								value.setMediaType("application/pdf");

								newObservation.setText(value);

								observation.addObservation(newObservation);

								observations.add(observation);

								return observations;
							}

						};

					}

				};
			}

			@Override
			public ImmunizationsSectionBuilder getImmunizationsSectionBuilder() {
				return new ImmunizationsSectionBuilder() {


					private Consumable createCDCImmunization(String code, String originalText, String translationCode) {
						Consumable consumable = CDAFactory.eINSTANCE.createConsumable();

						Product product = IHEFactory.eINSTANCE.createProductEntry().init();

						Material material = CDAFactory.eINSTANCE.createMaterial();

						material.setCode(BuilderUtil.createCDCCVXCE(code));

						material.getCode().setOriginalText(DatatypesFactory.eINSTANCE.createED(originalText));

						material.getCode().getTranslations().add(BuilderUtil.createCDCCVXCE(translationCode));

						product.setManufacturedMaterial(material);

						consumable.setManufacturedProduct(product);

						return consumable;

					}


					@Override
					public ArrayBuilder<SubstanceAdministration> getSubstanceAdministrationBuilder() {
						return new ArrayBuilder<SubstanceAdministration>() {

							@Override
							public ArrayList<SubstanceAdministration> construct() {

								ArrayList<SubstanceAdministration> immunizations = new ArrayList<SubstanceAdministration>();

								MedicationActivity medicationActivity = CCDFactory.eINSTANCE.createMedicationActivity().init();

								addID(medicationActivity, "e6f1ba43-c0ed-4b9b-9f12-f435d8ad8f92");

								medicationActivity.setDoseQuantity(BuilderUtil.buildIVL_PQUNK());

								medicationActivity.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								medicationActivity.setRouteCode(DatatypesFactory.eINSTANCE.createCE("IM", "2.16.840.1.113883.5.112", "HL7 RouteOfAdministration",
										"Intramuscular injection"));

								medicationActivity.setConsumable(createCDCImmunization("88", "Influenza virus vaccine", "111"));

								immunizations.add(medicationActivity);

								Immunization immunization = HITSPFactory.eINSTANCE.createImmunization().init();

								addID(immunization, "115f0f70-1343-4938-b62f-631de9749a0a");

								immunization.setCode(DatatypesFactory.eINSTANCE.createCD("IMMUNIZ", "2.16.840.1.113883.5.4", "HL7 ActCode", ""));

								immunization.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								immunization.setRouteCode(DatatypesFactory.eINSTANCE.createCE("IM", "2.16.840.1.113883.5.112", "HL7 RouteOfAdministration",
										"Intramuscular injection"));

								immunization.getApproachSiteCodes().add(BuilderUtil.buildCDUNK());

								immunization.setDoseQuantity(BuilderUtil.buildIVL_PQUNK());

								immunization.setConsumable(createCDCImmunization("88", "Influenza virus vaccine", "111"));

								EN en = DatatypesFactory.eINSTANCE.createEN();
								en.addText("Unknown Brand Name");
								immunization.getConsumable().getManufacturedProduct().getManufacturedMaterial().setName(en);

								immunization.getConsumable().getManufacturedProduct().getManufacturedMaterial().setLotNumberText(DatatypesFactory.eINSTANCE.createST("Unknown"));

								immunizations.add(immunization);

								immunization = HITSPFactory.eINSTANCE.createImmunization().init();

								addID(immunization, "78598407-9f16-42d5-8ffd-09281a60fe33");

								immunization.setCode(DatatypesFactory.eINSTANCE.createCD("IMMUNIZ", "2.16.840.1.113883.5.4", "HL7 ActCode", ""));

								immunization.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								immunization.setRouteCode(DatatypesFactory.eINSTANCE.createCE("IM", "2.16.840.1.113883.5.112", "HL7 RouteOfAdministration",
										"Intramuscular injection"));

								immunization.getApproachSiteCodes().add(BuilderUtil.buildCDUNK());

								immunization.setDoseQuantity(BuilderUtil.buildIVL_PQUNK());

								immunization.setConsumable(createCDCImmunization("33", "Pneumococcal polysaccharide vaccine", "109"));

								immunizations.add(immunization);

								immunization = HITSPFactory.eINSTANCE.createImmunization().init();

								addID(immunization, "261e94a0-95fb-4975-b5a5-c8e12c01c1bc");

								immunization.setCode(DatatypesFactory.eINSTANCE.createCD("IMMUNIZ", "2.16.840.1.113883.5.4", "HL7 ActCode", ""));

								immunization.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								immunization.setRouteCode(DatatypesFactory.eINSTANCE.createCE("IM", "2.16.840.1.113883.5.112", "HL7 RouteOfAdministration",
										"Intramuscular injection"));

								immunization.getApproachSiteCodes().add(BuilderUtil.buildCDUNK());

								immunization.setDoseQuantity(BuilderUtil.buildIVL_PQUNK());

								immunization.setConsumable(createCDCImmunization("09", "Tetanus and diphtheria toxoids", "113"));

								ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();

								addID(problemAct,"6adc1020-7b14-11db-9fe1-0800200c9a66");
								
								problemAct.setCode(DatatypesFactory.eINSTANCE.createCD("PATOBJ", "2.16.840.1.113883.11.19725", "HL7 ActNoImmunizationReason", "Patient Objection"));

								problemAct.getCode().setNullFlavor(NullFlavor.NA);

								ProblemObservation observation = CCDFactory.eINSTANCE.createProblemObservation().init();

								observation
										.setCode(DatatypesFactory.eINSTANCE.createCD("PATOBJ", "2.16.840.1.113883.11.19725", "HL7 ActNoImmunizationReason", "Patient Objection"));

								observation.getCode().setNullFlavor(NullFlavor.NA);

								observation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								problemAct.addObservation(observation);

								immunization.addAct(problemAct);

								immunizations.add(immunization);

								return immunizations;
							}

						};
					}

				};
			}

			@Override
			public VitalSignsSectionBuilder getVitalSignsSectionBuilder() {
				return new VitalSignsSectionBuilder() {

					private VitalSign createVitalSign(String id, String code, String displayName, String translationCode, String translactionDisplayName, String time) {
						VitalSign vitalSign = HITSPFactory.eINSTANCE.createVitalSign().init();

						addID(vitalSign, id);

						vitalSign.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

						IVL_TS effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS();

						effectiveTime.setValue(time);

						vitalSign.setEffectiveTime(effectiveTime);

						vitalSign.setCode(DatatypesFactory.eINSTANCE.createCE(code, "2.16.840.1.113883.6.1", "LOINC", displayName));

						vitalSign.getCode().getTranslations().add(BuilderUtil.buildSNOMEDCT("27113001", "Body Weight"));

						CE ce = DatatypesFactory.eINSTANCE.createCE();

						ce.setDisplayName("Normal");

						vitalSign.getInterpretationCodes().add(ce);

						ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();

						ObservationRange value = CDAFactory.eINSTANCE.createObservationRange();

						value.setNullFlavor(NullFlavor.UNK);

						rr.setObservationRange(value);

						vitalSign.getReferenceRanges().add(rr);

						return vitalSign;

					}

					@Override
					public ArrayBuilder<Organizer> getOrganizerBuilder() {
						return new ArrayBuilder<Organizer>() {

							@Override
							public ArrayList<Organizer> construct() {

								ArrayList<Organizer> organizers = new ArrayList<Organizer>();

								VitalSignsOrganizer vitalSignsOrganizer = IHEFactory.eINSTANCE.createVitalSignsOrganizer().init();

								vitalSignsOrganizer.setCode(BuilderUtil.buildSNOMEDCT("46680005", "Vital signs"));

								addID(vitalSignsOrganizer, "c6f88320-67ad-11db-bd13-0800200c9a66");

								vitalSignsOrganizer.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								IVL_TS effectiveTime = DatatypesFactory.eINSTANCE.createIVL_TS();

								effectiveTime.setValue("19991114");

								vitalSignsOrganizer.setEffectiveTime(effectiveTime);

								VitalSign vitalSign = createVitalSign("c6f88321-67ad-11db-bd13-0800200c9a66", "8302-2", "Patient Body Height", "50373000", "Body Height",
										"19991114");

								PQ pq = DatatypesFactory.eINSTANCE.createPQ(177, "cm");

								vitalSign.getValues().add(pq);

								vitalSignsOrganizer.addObservation(vitalSign);
								// .getVitalSignObservations().add(vitalSign);

								vitalSign = createVitalSign("c6f88322-67ad-11db-bd13-0800200c9a66", "3141-9", "Patient Body Weight", "27113001", "Body Weight", "19991114");

								pq = DatatypesFactory.eINSTANCE.createPQ(86, "kg");

								vitalSign.getValues().add(pq);

								vitalSignsOrganizer.addObservation(vitalSign);

								vitalSign = createVitalSign("c6f88323-67ad-11db-bd13-0800200c9a66", "8480-6", "Intravascular Systolic", "271649006", "Body Height", "Systolic BP");

								pq = DatatypesFactory.eINSTANCE.createPQ(132, "mm[Hg]");

								vitalSign.getValues().add(pq);

								vitalSignsOrganizer.addObservation(vitalSign);

								vitalSign = createVitalSign("c6f88324-67ad-11db-bd13-0800200c9a66", "11377-9", "Intravascular Diastolic", "271650006", "Diastolic BP", "19991114");

								pq = DatatypesFactory.eINSTANCE.createPQ(86, "mm[Hg]");

								vitalSign.getValues().add(pq);

								vitalSignsOrganizer.addObservation(vitalSign);

								organizers.add(vitalSignsOrganizer);

								return organizers;

							}

						};
					}

				};
			}

			@Override
			public FunctionalStatusSectionBuilder getFunctionalStatusSectionBuilder() {
				return new FunctionalStatusSectionBuilder() {

					private EntryRelationship buildActiveStatus() {
						EntryRelationship status = CDAFactory.eINSTANCE.createEntryRelationship();

						status.setTypeCode(x_ActRelationshipEntryRelationship.REFR);

						FunctionalStatusObservation observationStatus = CCDFactory.eINSTANCE.createFunctionalStatusObservation().init();

						observationStatus.getValues().add(DatatypesFactory.eINSTANCE.createCE("55561003", "2.16.840.1.113883.6.96", "", "Active"));

						status.setObservation(observationStatus);

						return status;

					}

					@Override
					public ArrayBuilder<Act> getActBuilder() {
						return new ArrayBuilder<Act>() {

							@Override
							public ArrayList<Act> construct() {
								ArrayList<Act> acts = new ArrayList<Act>();

								ProblemAct problemAct = CCDFactory.eINSTANCE.createProblemAct().init();

								addID(problemAct, "6z2fa88d-4174-4909-aece-db44b60a3abb");

								problemAct.setCode(BuilderUtil.buildCDNA());

								ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation().init();

								addID(problemObservation, "fd07111a-b15b-4dce-8518-1274d07f142a");

								problemObservation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								problemObservation.setEffectiveTime(BuilderUtil.buildIVL_TS("1998", null));

								problemObservation.getEntryRelationships().add(buildActiveStatus());

								problemObservation.getValues().add(BuilderUtil.buildSNOMEDCT("105504002", "Dependence on cane"));

								problemAct.addObservation(problemObservation);

								acts.add(problemAct);

								return acts;

							}

						};
					}

				};
			}

			@Override
			public FamilyHistorySectionBuilder getFamilyHistorySectionBuilder() {
				return new FamilyHistorySectionBuilder() {

					@Override
					public ArrayBuilder<Organizer> getOrganizerBuilder() {
						return new ArrayBuilder<Organizer>() {

							@Override
							public ArrayList<Organizer> construct() {
								ArrayList<Organizer> organizers = new ArrayList<Organizer>();

								FamilyHistoryOrganizer organizer = CCDFactory.eINSTANCE.createFamilyHistoryOrganizer().init();
								
								organizer.setClassCode(x_ActClassDocumentEntryOrganizer.BATTERY);
								
								organizer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.15"));
								
								organizer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.18"));

								organizer.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								Subject subject = CDAFactory.eINSTANCE.createSubject();

								RelatedSubject relatedSubject = CDAFactory.eINSTANCE.createRelatedSubject();

								relatedSubject.setCode(DatatypesFactory.eINSTANCE.createCE("FTH", "2.16.840.1.113883.5.111"));

								relatedSubject.getCode().getTranslations().add(BuilderUtil.buildSNOMEDCT("9947008", "Biological father"));

								SubjectPerson subjectPerson = CDAFactory.eINSTANCE.createSubjectPerson();

								subjectPerson.setAdministrativeGenderCode(DatatypesFactory.eINSTANCE.createCE("M", "2.16.840.1.113883.5.1"));

								subjectPerson.setBirthTime(DatatypesFactory.eINSTANCE.createTS("1912"));

								relatedSubject.setSubject(subjectPerson);

								subject.setRelatedSubject(relatedSubject);

								FamilyHistoryObservation familyhistoryobservation = CCDFactory.eINSTANCE.createFamilyHistoryObservation().init();

								familyhistoryobservation.setClassCode(ActClassObservation.OBS);
								
								familyhistoryobservation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.13"));
								
								familyhistoryobservation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.13.3"));

								addID(familyhistoryobservation, "d42ebf70-5c89-11db-b0de-0800200c9a66");

								familyhistoryobservation.setCode(BuilderUtil.buildSNOMEDCT("55607006", "Problem"));

//								familyhistoryobservation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								familyhistoryobservation.getValues().add(BuilderUtil.buildSNOMEDCT("22298006"));

								EntryRelationship entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.RSON);

								Observation observation = CDAFactory.eINSTANCE.createObservation();

								addID(observation, "6898fae0-5c8a-11db-b0de-0800200c9a66");

								observation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								observation.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4", "", ""));

								observation.getValues().add(BuilderUtil.buildSNOMEDCT("419099009", "Dead"));

								entryRelationship.setObservation(observation);

								familyhistoryobservation.getEntryRelationships().add(entryRelationship);

								entryRelationship = CDAFactory.eINSTANCE.createEntryRelationship();

								entryRelationship.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

								AgeObservation ageObservation = CCDFactory.eINSTANCE.createAgeObservation().init();

								INT age = DatatypesFactory.eINSTANCE.createINT();

								age.setValue(57);

								ageObservation.getValues().add(age);

								entryRelationship.setObservation(ageObservation);

								familyhistoryobservation.getEntryRelationships().add(entryRelationship);

								organizer.addObservation(familyhistoryobservation);

								organizer.setSubject(subject);

								organizers.add(organizer);

								return organizers;
							}

						};
					}

				};
			}

			@Override
			public MedicalEquipmentSectionBuilder getMedicalEquipmentSectionBuilder() {
				return new MedicalEquipmentSectionBuilder() {

					@Override
					public Builder<ST> getSectionTitleBuilder() {
						return new BuilderUtil.BuildST("Medical Equipment");
					}

					@Override
					public ArrayBuilder<Supply> getSupplyBuilder() {
						return new ArrayBuilder<Supply>() {

							@Override
							public ArrayList<Supply> construct() {
								ArrayList<Supply> supplies = new ArrayList<Supply>();
								SupplyActivity supply = CCDFactory.eINSTANCE.createSupplyActivity().init();

								addID(supply, "2413773c-2372-4299-bbe6-5b0f60664446");

								supply.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));

								supplies.add(supply);

								Participant2 participant = CCDFactory.eINSTANCE.createEncounterLocation().init();

								participant.setTypeCode(ParticipationType.LOC);

								ProductInstance productInstance = CCDFactory.eINSTANCE.createProductInstance().init();

								Device device = CDAFactory.eINSTANCE.createDevice();

								device.setCode(BuilderUtil.buildSNOMEDCE("72506001", "Automatic implantable cardioverter/defibrillator"));

								productInstance.setPlayingDevice(device);

								participant.setParticipantRole(productInstance);

								supply.getParticipants().add(participant);

								return supplies;
							}

						};
					}

				};

			}

			@Override
			public SocialHistorySectionBuilder getSocialHistorySectionBuilder() {

				return new SocialHistorySectionBuilder() {

					@Override
					public ArrayBuilder<Observation> getObservationBuilder() {
						return new ArrayBuilder<Observation>() {

							@Override
							public ArrayList<Observation> construct() {
//
								ArrayList<Observation> observations = new ArrayList<Observation>();
//
////								SocialHistoryObservation observation = HITSPFactory.eINSTANCE.createSocialHistoryObservation().init();
//
////								observation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("1.3.6.1.4.1.19376.1.5.3.1.4.13.4"));
////								observation.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.3.88.11.83.19"));
//
//								addID(observation, "9b56c25d-9104-45ee-9fa4-e0f3afaa01c1");
//
//								observation.setCode(BuilderUtil.buildSNOMEDCT("230056004", "Cigarette smoking"));
//
//								observation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
//
//								observation.setEffectiveTime(BuilderUtil.buildIVL_TS("1947", "1972"));
//
//								ST st = DatatypesFactory.eINSTANCE.createST("1 pack per day");
//
//								observation.getValues().add(st);
//
//								observations.add(observation);
//
								return observations;

							}

						};
					}

				};
			}

			@Override
			public PlanOfCareSectionBuilder getPlanOfCareSectionBuilder() {
				return new PlanOfCareSectionBuilder() {

					@Override
					public ArrayBuilder<Observation> getObservationBuilder() {
						return new ArrayBuilder<Observation>() {

							@Override
							public ArrayList<Observation> construct() {

								ArrayList<Observation> observations = new ArrayList<Observation>();
								
								PlanOfCareActivityObservation observation = CCDFactory.eINSTANCE.createPlanOfCareActivityObservation().init();
								
								observation.setClassCode(ActClassObservation.OBS);
								
								observation.setMoodCode(x_ActMoodDocumentObservation.INT);
								
								addID(observation, "9a6d1bac-17d3-4195-89a4-1121bc809b4a");
								
								observation.setCode(BuilderUtil.buildSNOMEDCT("23426006", "Pulmonary function test"));
								
								observation.setStatusCode(DatatypesFactory.eINSTANCE.createCS("new"));
								
								observation.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("20000421"));

								observations.add(observation);

								return observations;
							}

						};
					}

				};
			}

		};

		try {

			
			System.out.println("Start C32 Document Build Example");
			ClinicalDocument clinicalDocument = exampleHITSPC32.buildDocument();
// 
			CDAUtil.save(clinicalDocument, new FileOutputStream("/home/eclipse/heliosworkspaceG/org.openhealthtools.mdht.cda.builder/resource/c32.xml"));
			System.out.println("Completed C32 Document Build Example");
//			boolean valid = CDAUtil.validate(clinicalDocument, new BasicValidationHandler() {
//				@Override
//				public void handleError(Diagnostic diagnostic) {
//					System.out.println("ERROR: " + diagnostic.getMessage());
//				}
//				@Override
//				public void handleWarning(Diagnostic diagnostic) {
//					System.out.println("WARNING: " + diagnostic.getMessage());
//				}
//			});

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
