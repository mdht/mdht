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
package org.openhealthtools.mdht.uml.cda;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage
 * @generated
 */
public interface CDAFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDAFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.impl.CDAFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Document</em>'.
	 * @generated
	 */
	ClinicalDocument createClinicalDocument();

	/**
	 * Returns a new object of class '<em>Infrastructure Root Type Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Root Type Id</em>'.
	 * @generated
	 */
	InfrastructureRootTypeId createInfrastructureRootTypeId();

	/**
	 * Returns a new object of class '<em>Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Target</em>'.
	 * @generated
	 */
	RecordTarget createRecordTarget();

	/**
	 * Returns a new object of class '<em>Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Role</em>'.
	 * @generated
	 */
	PatientRole createPatientRole();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guardian</em>'.
	 * @generated
	 */
	Guardian createGuardian();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization</em>'.
	 * @generated
	 */
	Organization createOrganization();

	/**
	 * Returns a new object of class '<em>Organization Part Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Part Of</em>'.
	 * @generated
	 */
	OrganizationPartOf createOrganizationPartOf();

	/**
	 * Returns a new object of class '<em>Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Birthplace</em>'.
	 * @generated
	 */
	Birthplace createBirthplace();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language Communication</em>'.
	 * @generated
	 */
	LanguageCommunication createLanguageCommunication();

	/**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
	Author createAuthor();

	/**
	 * Returns a new object of class '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Author</em>'.
	 * @generated
	 */
	AssignedAuthor createAssignedAuthor();

	/**
	 * Returns a new object of class '<em>Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authoring Device</em>'.
	 * @generated
	 */
	AuthoringDevice createAuthoringDevice();

	/**
	 * Returns a new object of class '<em>Maintained Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintained Entity</em>'.
	 * @generated
	 */
	MaintainedEntity createMaintainedEntity();

	/**
	 * Returns a new object of class '<em>Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Enterer</em>'.
	 * @generated
	 */
	DataEnterer createDataEnterer();

	/**
	 * Returns a new object of class '<em>Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Entity</em>'.
	 * @generated
	 */
	AssignedEntity createAssignedEntity();

	/**
	 * Returns a new object of class '<em>SDTC Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SDTC Patient</em>'.
	 * @generated
	 */
	SDTCPatient createSDTCPatient();

	/**
	 * Returns a new object of class '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Informant12</em>'.
	 * @generated
	 */
	Informant12 createInformant12();

	/**
	 * Returns a new object of class '<em>Related Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Entity</em>'.
	 * @generated
	 */
	RelatedEntity createRelatedEntity();

	/**
	 * Returns a new object of class '<em>Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custodian</em>'.
	 * @generated
	 */
	Custodian createCustodian();

	/**
	 * Returns a new object of class '<em>Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assigned Custodian</em>'.
	 * @generated
	 */
	AssignedCustodian createAssignedCustodian();

	/**
	 * Returns a new object of class '<em>Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custodian Organization</em>'.
	 * @generated
	 */
	CustodianOrganization createCustodianOrganization();

	/**
	 * Returns a new object of class '<em>Information Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Recipient</em>'.
	 * @generated
	 */
	InformationRecipient createInformationRecipient();

	/**
	 * Returns a new object of class '<em>Intended Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intended Recipient</em>'.
	 * @generated
	 */
	IntendedRecipient createIntendedRecipient();

	/**
	 * Returns a new object of class '<em>Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Authenticator</em>'.
	 * @generated
	 */
	LegalAuthenticator createLegalAuthenticator();

	/**
	 * Returns a new object of class '<em>Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authenticator</em>'.
	 * @generated
	 */
	Authenticator createAuthenticator();

	/**
	 * Returns a new object of class '<em>Participant1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant1</em>'.
	 * @generated
	 */
	Participant1 createParticipant1();

	/**
	 * Returns a new object of class '<em>Associated Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Associated Entity</em>'.
	 * @generated
	 */
	AssociatedEntity createAssociatedEntity();

	/**
	 * Returns a new object of class '<em>In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Fulfillment Of</em>'.
	 * @generated
	 */
	InFulfillmentOf createInFulfillmentOf();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation Of</em>'.
	 * @generated
	 */
	DocumentationOf createDocumentationOf();

	/**
	 * Returns a new object of class '<em>Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Event</em>'.
	 * @generated
	 */
	ServiceEvent createServiceEvent();

	/**
	 * Returns a new object of class '<em>Performer1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performer1</em>'.
	 * @generated
	 */
	Performer1 createPerformer1();

	/**
	 * Returns a new object of class '<em>Related Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Document</em>'.
	 * @generated
	 */
	RelatedDocument createRelatedDocument();

	/**
	 * Returns a new object of class '<em>Parent Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Document</em>'.
	 * @generated
	 */
	ParentDocument createParentDocument();

	/**
	 * Returns a new object of class '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization</em>'.
	 * @generated
	 */
	Authorization createAuthorization();

	/**
	 * Returns a new object of class '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consent</em>'.
	 * @generated
	 */
	Consent createConsent();

	/**
	 * Returns a new object of class '<em>Component1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component1</em>'.
	 * @generated
	 */
	Component1 createComponent1();

	/**
	 * Returns a new object of class '<em>Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encompassing Encounter</em>'.
	 * @generated
	 */
	EncompassingEncounter createEncompassingEncounter();

	/**
	 * Returns a new object of class '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responsible Party</em>'.
	 * @generated
	 */
	ResponsibleParty createResponsibleParty();

	/**
	 * Returns a new object of class '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter Participant</em>'.
	 * @generated
	 */
	EncounterParticipant createEncounterParticipant();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Health Care Facility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Care Facility</em>'.
	 * @generated
	 */
	HealthCareFacility createHealthCareFacility();

	/**
	 * Returns a new object of class '<em>Component2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component2</em>'.
	 * @generated
	 */
	Component2 createComponent2();

	/**
	 * Returns a new object of class '<em>Non XML Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non XML Body</em>'.
	 * @generated
	 */
	NonXMLBody createNonXMLBody();

	/**
	 * Returns a new object of class '<em>Structured Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Body</em>'.
	 * @generated
	 */
	StructuredBody createStructuredBody();

	/**
	 * Returns a new object of class '<em>Component3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component3</em>'.
	 * @generated
	 */
	Component3 createComponent3();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Struc Doc Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Struc Doc Text</em>'.
	 * @generated
	 */
	StrucDocText createStrucDocText();

	/**
	 * Returns a new object of class '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject</em>'.
	 * @generated
	 */
	Subject createSubject();

	/**
	 * Returns a new object of class '<em>Related Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Subject</em>'.
	 * @generated
	 */
	RelatedSubject createRelatedSubject();

	/**
	 * Returns a new object of class '<em>Subject Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject Person</em>'.
	 * @generated
	 */
	SubjectPerson createSubjectPerson();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Act</em>'.
	 * @generated
	 */
	Act createAct();

	/**
	 * Returns a new object of class '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen</em>'.
	 * @generated
	 */
	Specimen createSpecimen();

	/**
	 * Returns a new object of class '<em>Specimen Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specimen Role</em>'.
	 * @generated
	 */
	SpecimenRole createSpecimenRole();

	/**
	 * Returns a new object of class '<em>Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Playing Entity</em>'.
	 * @generated
	 */
	PlayingEntity createPlayingEntity();

	/**
	 * Returns a new object of class '<em>Performer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performer2</em>'.
	 * @generated
	 */
	Performer2 createPerformer2();

	/**
	 * Returns a new object of class '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant2</em>'.
	 * @generated
	 */
	Participant2 createParticipant2();

	/**
	 * Returns a new object of class '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Role</em>'.
	 * @generated
	 */
	ParticipantRole createParticipantRole();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Relationship</em>'.
	 * @generated
	 */
	EntryRelationship createEntryRelationship();

	/**
	 * Returns a new object of class '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encounter</em>'.
	 * @generated
	 */
	Encounter createEncounter();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>External Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Act</em>'.
	 * @generated
	 */
	ExternalAct createExternalAct();

	/**
	 * Returns a new object of class '<em>External Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Observation</em>'.
	 * @generated
	 */
	ExternalObservation createExternalObservation();

	/**
	 * Returns a new object of class '<em>External Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Procedure</em>'.
	 * @generated
	 */
	ExternalProcedure createExternalProcedure();

	/**
	 * Returns a new object of class '<em>External Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Document</em>'.
	 * @generated
	 */
	ExternalDocument createExternalDocument();

	/**
	 * Returns a new object of class '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition</em>'.
	 * @generated
	 */
	Precondition createPrecondition();

	/**
	 * Returns a new object of class '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion</em>'.
	 * @generated
	 */
	Criterion createCriterion();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Range</em>'.
	 * @generated
	 */
	ReferenceRange createReferenceRange();

	/**
	 * Returns a new object of class '<em>Observation Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Range</em>'.
	 * @generated
	 */
	ObservationRange createObservationRange();

	/**
	 * Returns a new object of class '<em>Observation Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Media</em>'.
	 * @generated
	 */
	ObservationMedia createObservationMedia();

	/**
	 * Returns a new object of class '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizer</em>'.
	 * @generated
	 */
	Organizer createOrganizer();

	/**
	 * Returns a new object of class '<em>Component4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component4</em>'.
	 * @generated
	 */
	Component4 createComponent4();

	/**
	 * Returns a new object of class '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Procedure</em>'.
	 * @generated
	 */
	Procedure createProcedure();

	/**
	 * Returns a new object of class '<em>Region Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Of Interest</em>'.
	 * @generated
	 */
	RegionOfInterest createRegionOfInterest();

	/**
	 * Returns a new object of class '<em>Region Of Interest Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Of Interest Value</em>'.
	 * @generated
	 */
	RegionOfInterestValue createRegionOfInterestValue();

	/**
	 * Returns a new object of class '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substance Administration</em>'.
	 * @generated
	 */
	SubstanceAdministration createSubstanceAdministration();

	/**
	 * Returns a new object of class '<em>Consumable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consumable</em>'.
	 * @generated
	 */
	Consumable createConsumable();

	/**
	 * Returns a new object of class '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufactured Product</em>'.
	 * @generated
	 */
	ManufacturedProduct createManufacturedProduct();

	/**
	 * Returns a new object of class '<em>Labeled Drug</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Labeled Drug</em>'.
	 * @generated
	 */
	LabeledDrug createLabeledDrug();

	/**
	 * Returns a new object of class '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material</em>'.
	 * @generated
	 */
	Material createMaterial();

	/**
	 * Returns a new object of class '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply</em>'.
	 * @generated
	 */
	Supply createSupply();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Component5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component5</em>'.
	 * @generated
	 */
	Component5 createComponent5();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CDAPackage getCDAPackage();

} //CDAFactory
