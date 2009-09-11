/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CDAFactoryImpl extends EFactoryImpl implements CDAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CDAFactory init() {
		try {
			CDAFactory theCDAFactory = (CDAFactory)EPackage.Registry.INSTANCE.getEFactory("urn:hl7-org:v3"); 
			if (theCDAFactory != null) {
				return theCDAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CDAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CDAPackage.CLINICAL_DOCUMENT: return createClinicalDocument();
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID: return createInfrastructureRootTypeId();
			case CDAPackage.RECORD_TARGET: return createRecordTarget();
			case CDAPackage.PATIENT_ROLE: return createPatientRole();
			case CDAPackage.PATIENT: return createPatient();
			case CDAPackage.GUARDIAN: return createGuardian();
			case CDAPackage.PERSON: return createPerson();
			case CDAPackage.ORGANIZATION: return createOrganization();
			case CDAPackage.ORGANIZATION_PART_OF: return createOrganizationPartOf();
			case CDAPackage.BIRTHPLACE: return createBirthplace();
			case CDAPackage.PLACE: return createPlace();
			case CDAPackage.LANGUAGE_COMMUNICATION: return createLanguageCommunication();
			case CDAPackage.AUTHOR: return createAuthor();
			case CDAPackage.ASSIGNED_AUTHOR: return createAssignedAuthor();
			case CDAPackage.AUTHORING_DEVICE: return createAuthoringDevice();
			case CDAPackage.MAINTAINED_ENTITY: return createMaintainedEntity();
			case CDAPackage.DATA_ENTERER: return createDataEnterer();
			case CDAPackage.ASSIGNED_ENTITY: return createAssignedEntity();
			case CDAPackage.INFORMANT12: return createInformant12();
			case CDAPackage.RELATED_ENTITY: return createRelatedEntity();
			case CDAPackage.CUSTODIAN: return createCustodian();
			case CDAPackage.ASSIGNED_CUSTODIAN: return createAssignedCustodian();
			case CDAPackage.CUSTODIAN_ORGANIZATION: return createCustodianOrganization();
			case CDAPackage.INFORMATION_RECIPIENT: return createInformationRecipient();
			case CDAPackage.INTENDED_RECIPIENT: return createIntendedRecipient();
			case CDAPackage.LEGAL_AUTHENTICATOR: return createLegalAuthenticator();
			case CDAPackage.AUTHENTICATOR: return createAuthenticator();
			case CDAPackage.PARTICIPANT1: return createParticipant1();
			case CDAPackage.ASSOCIATED_ENTITY: return createAssociatedEntity();
			case CDAPackage.IN_FULFILLMENT_OF: return createInFulfillmentOf();
			case CDAPackage.ORDER: return createOrder();
			case CDAPackage.DOCUMENTATION_OF: return createDocumentationOf();
			case CDAPackage.SERVICE_EVENT: return createServiceEvent();
			case CDAPackage.PERFORMER1: return createPerformer1();
			case CDAPackage.RELATED_DOCUMENT: return createRelatedDocument();
			case CDAPackage.PARENT_DOCUMENT: return createParentDocument();
			case CDAPackage.AUTHORIZATION: return createAuthorization();
			case CDAPackage.CONSENT: return createConsent();
			case CDAPackage.COMPONENT1: return createComponent1();
			case CDAPackage.ENCOMPASSING_ENCOUNTER: return createEncompassingEncounter();
			case CDAPackage.RESPONSIBLE_PARTY: return createResponsibleParty();
			case CDAPackage.ENCOUNTER_PARTICIPANT: return createEncounterParticipant();
			case CDAPackage.LOCATION: return createLocation();
			case CDAPackage.HEALTH_CARE_FACILITY: return createHealthCareFacility();
			case CDAPackage.COMPONENT2: return createComponent2();
			case CDAPackage.NON_XML_BODY: return createNonXMLBody();
			case CDAPackage.STRUCTURED_BODY: return createStructuredBody();
			case CDAPackage.COMPONENT3: return createComponent3();
			case CDAPackage.SECTION: return createSection();
			case CDAPackage.STRUC_DOC_TEXT: return createStrucDocText();
			case CDAPackage.SUBJECT: return createSubject();
			case CDAPackage.RELATED_SUBJECT: return createRelatedSubject();
			case CDAPackage.SUBJECT_PERSON: return createSubjectPerson();
			case CDAPackage.ENTRY: return createEntry();
			case CDAPackage.ACT: return createAct();
			case CDAPackage.SPECIMEN: return createSpecimen();
			case CDAPackage.SPECIMEN_ROLE: return createSpecimenRole();
			case CDAPackage.PLAYING_ENTITY: return createPlayingEntity();
			case CDAPackage.PERFORMER2: return createPerformer2();
			case CDAPackage.PARTICIPANT2: return createParticipant2();
			case CDAPackage.PARTICIPANT_ROLE: return createParticipantRole();
			case CDAPackage.DEVICE: return createDevice();
			case CDAPackage.ENTITY: return createEntity();
			case CDAPackage.ENTRY_RELATIONSHIP: return createEntryRelationship();
			case CDAPackage.ENCOUNTER: return createEncounter();
			case CDAPackage.REFERENCE: return createReference();
			case CDAPackage.EXTERNAL_ACT: return createExternalAct();
			case CDAPackage.EXTERNAL_OBSERVATION: return createExternalObservation();
			case CDAPackage.EXTERNAL_PROCEDURE: return createExternalProcedure();
			case CDAPackage.EXTERNAL_DOCUMENT: return createExternalDocument();
			case CDAPackage.PRECONDITION: return createPrecondition();
			case CDAPackage.CRITERION: return createCriterion();
			case CDAPackage.OBSERVATION: return createObservation();
			case CDAPackage.REFERENCE_RANGE: return createReferenceRange();
			case CDAPackage.OBSERVATION_RANGE: return createObservationRange();
			case CDAPackage.OBSERVATION_MEDIA: return createObservationMedia();
			case CDAPackage.ORGANIZER: return createOrganizer();
			case CDAPackage.COMPONENT4: return createComponent4();
			case CDAPackage.PROCEDURE: return createProcedure();
			case CDAPackage.REGION_OF_INTEREST: return createRegionOfInterest();
			case CDAPackage.REGION_OF_INTEREST_VALUE: return createRegionOfInterestValue();
			case CDAPackage.SUBSTANCE_ADMINISTRATION: return createSubstanceAdministration();
			case CDAPackage.CONSUMABLE: return createConsumable();
			case CDAPackage.MANUFACTURED_PRODUCT: return createManufacturedProduct();
			case CDAPackage.LABELED_DRUG: return createLabeledDrug();
			case CDAPackage.MATERIAL: return createMaterial();
			case CDAPackage.SUPPLY: return createSupply();
			case CDAPackage.PRODUCT: return createProduct();
			case CDAPackage.COMPONENT5: return createComponent5();
			case CDAPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDocument createClinicalDocument() {
		ClinicalDocumentImpl clinicalDocument = new ClinicalDocumentImpl();
		return clinicalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId createInfrastructureRootTypeId() {
		InfrastructureRootTypeIdImpl infrastructureRootTypeId = new InfrastructureRootTypeIdImpl();
		return infrastructureRootTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget createRecordTarget() {
		RecordTargetImpl recordTarget = new RecordTargetImpl();
		return recordTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRole createPatientRole() {
		PatientRoleImpl patientRole = new PatientRoleImpl();
		return patientRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guardian createGuardian() {
		GuardianImpl guardian = new GuardianImpl();
		return guardian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationPartOf createOrganizationPartOf() {
		OrganizationPartOfImpl organizationPartOf = new OrganizationPartOfImpl();
		return organizationPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Birthplace createBirthplace() {
		BirthplaceImpl birthplace = new BirthplaceImpl();
		return birthplace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageCommunication createLanguageCommunication() {
		LanguageCommunicationImpl languageCommunication = new LanguageCommunicationImpl();
		return languageCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedAuthor createAssignedAuthor() {
		AssignedAuthorImpl assignedAuthor = new AssignedAuthorImpl();
		return assignedAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthoringDevice createAuthoringDevice() {
		AuthoringDeviceImpl authoringDevice = new AuthoringDeviceImpl();
		return authoringDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainedEntity createMaintainedEntity() {
		MaintainedEntityImpl maintainedEntity = new MaintainedEntityImpl();
		return maintainedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer createDataEnterer() {
		DataEntererImpl dataEnterer = new DataEntererImpl();
		return dataEnterer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedEntity createAssignedEntity() {
		AssignedEntityImpl assignedEntity = new AssignedEntityImpl();
		return assignedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Informant12 createInformant12() {
		Informant12Impl informant12 = new Informant12Impl();
		return informant12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedEntity createRelatedEntity() {
		RelatedEntityImpl relatedEntity = new RelatedEntityImpl();
		return relatedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian createCustodian() {
		CustodianImpl custodian = new CustodianImpl();
		return custodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedCustodian createAssignedCustodian() {
		AssignedCustodianImpl assignedCustodian = new AssignedCustodianImpl();
		return assignedCustodian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustodianOrganization createCustodianOrganization() {
		CustodianOrganizationImpl custodianOrganization = new CustodianOrganizationImpl();
		return custodianOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRecipient createInformationRecipient() {
		InformationRecipientImpl informationRecipient = new InformationRecipientImpl();
		return informationRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntendedRecipient createIntendedRecipient() {
		IntendedRecipientImpl intendedRecipient = new IntendedRecipientImpl();
		return intendedRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator createLegalAuthenticator() {
		LegalAuthenticatorImpl legalAuthenticator = new LegalAuthenticatorImpl();
		return legalAuthenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator createAuthenticator() {
		AuthenticatorImpl authenticator = new AuthenticatorImpl();
		return authenticator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant1 createParticipant1() {
		Participant1Impl participant1 = new Participant1Impl();
		return participant1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociatedEntity createAssociatedEntity() {
		AssociatedEntityImpl associatedEntity = new AssociatedEntityImpl();
		return associatedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InFulfillmentOf createInFulfillmentOf() {
		InFulfillmentOfImpl inFulfillmentOf = new InFulfillmentOfImpl();
		return inFulfillmentOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf createDocumentationOf() {
		DocumentationOfImpl documentationOf = new DocumentationOfImpl();
		return documentationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEvent createServiceEvent() {
		ServiceEventImpl serviceEvent = new ServiceEventImpl();
		return serviceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer1 createPerformer1() {
		Performer1Impl performer1 = new Performer1Impl();
		return performer1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedDocument createRelatedDocument() {
		RelatedDocumentImpl relatedDocument = new RelatedDocumentImpl();
		return relatedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentDocument createParentDocument() {
		ParentDocumentImpl parentDocument = new ParentDocumentImpl();
		return parentDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorization createAuthorization() {
		AuthorizationImpl authorization = new AuthorizationImpl();
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consent createConsent() {
		ConsentImpl consent = new ConsentImpl();
		return consent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component1 createComponent1() {
		Component1Impl component1 = new Component1Impl();
		return component1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncompassingEncounter createEncompassingEncounter() {
		EncompassingEncounterImpl encompassingEncounter = new EncompassingEncounterImpl();
		return encompassingEncounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsibleParty createResponsibleParty() {
		ResponsiblePartyImpl responsibleParty = new ResponsiblePartyImpl();
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterParticipant createEncounterParticipant() {
		EncounterParticipantImpl encounterParticipant = new EncounterParticipantImpl();
		return encounterParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthCareFacility createHealthCareFacility() {
		HealthCareFacilityImpl healthCareFacility = new HealthCareFacilityImpl();
		return healthCareFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 createComponent2() {
		Component2Impl component2 = new Component2Impl();
		return component2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonXMLBody createNonXMLBody() {
		NonXMLBodyImpl nonXMLBody = new NonXMLBodyImpl();
		return nonXMLBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredBody createStructuredBody() {
		StructuredBodyImpl structuredBody = new StructuredBodyImpl();
		return structuredBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component3 createComponent3() {
		Component3Impl component3 = new Component3Impl();
		return component3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrucDocText createStrucDocText() {
		StrucDocTextImpl strucDocText = new StrucDocTextImpl();
		return strucDocText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject createSubject() {
		SubjectImpl subject = new SubjectImpl();
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedSubject createRelatedSubject() {
		RelatedSubjectImpl relatedSubject = new RelatedSubjectImpl();
		return relatedSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectPerson createSubjectPerson() {
		SubjectPersonImpl subjectPerson = new SubjectPersonImpl();
		return subjectPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act createAct() {
		ActImpl act = new ActImpl();
		return act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen createSpecimen() {
		SpecimenImpl specimen = new SpecimenImpl();
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenRole createSpecimenRole() {
		SpecimenRoleImpl specimenRole = new SpecimenRoleImpl();
		return specimenRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayingEntity createPlayingEntity() {
		PlayingEntityImpl playingEntity = new PlayingEntityImpl();
		return playingEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer2 createPerformer2() {
		Performer2Impl performer2 = new Performer2Impl();
		return performer2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant2 createParticipant2() {
		Participant2Impl participant2 = new Participant2Impl();
		return participant2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole createParticipantRole() {
		ParticipantRoleImpl participantRole = new ParticipantRoleImpl();
		return participantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryRelationship createEntryRelationship() {
		EntryRelationshipImpl entryRelationship = new EntryRelationshipImpl();
		return entryRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter createEncounter() {
		EncounterImpl encounter = new EncounterImpl();
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAct createExternalAct() {
		ExternalActImpl externalAct = new ExternalActImpl();
		return externalAct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalObservation createExternalObservation() {
		ExternalObservationImpl externalObservation = new ExternalObservationImpl();
		return externalObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalProcedure createExternalProcedure() {
		ExternalProcedureImpl externalProcedure = new ExternalProcedureImpl();
		return externalProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocument createExternalDocument() {
		ExternalDocumentImpl externalDocument = new ExternalDocumentImpl();
		return externalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criterion createCriterion() {
		CriterionImpl criterion = new CriterionImpl();
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceRange createReferenceRange() {
		ReferenceRangeImpl referenceRange = new ReferenceRangeImpl();
		return referenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationRange createObservationRange() {
		ObservationRangeImpl observationRange = new ObservationRangeImpl();
		return observationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObservationMedia createObservationMedia() {
		ObservationMediaImpl observationMedia = new ObservationMediaImpl();
		return observationMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organizer createOrganizer() {
		OrganizerImpl organizer = new OrganizerImpl();
		return organizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component4 createComponent4() {
		Component4Impl component4 = new Component4Impl();
		return component4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure createProcedure() {
		ProcedureImpl procedure = new ProcedureImpl();
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionOfInterest createRegionOfInterest() {
		RegionOfInterestImpl regionOfInterest = new RegionOfInterestImpl();
		return regionOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionOfInterestValue createRegionOfInterestValue() {
		RegionOfInterestValueImpl regionOfInterestValue = new RegionOfInterestValueImpl();
		return regionOfInterestValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAdministration createSubstanceAdministration() {
		SubstanceAdministrationImpl substanceAdministration = new SubstanceAdministrationImpl();
		return substanceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumable createConsumable() {
		ConsumableImpl consumable = new ConsumableImpl();
		return consumable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturedProduct createManufacturedProduct() {
		ManufacturedProductImpl manufacturedProduct = new ManufacturedProductImpl();
		return manufacturedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabeledDrug createLabeledDrug() {
		LabeledDrugImpl labeledDrug = new LabeledDrugImpl();
		return labeledDrug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply createSupply() {
		SupplyImpl supply = new SupplyImpl();
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component5 createComponent5() {
		Component5Impl component5 = new Component5Impl();
		return component5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAPackage getCDAPackage() {
		return (CDAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CDAPackage getPackage() {
		return CDAPackage.eINSTANCE;
	}

} //CDAFactoryImpl
