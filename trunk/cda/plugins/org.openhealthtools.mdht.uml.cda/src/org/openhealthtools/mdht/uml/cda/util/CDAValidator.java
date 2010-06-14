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
package org.openhealthtools.mdht.uml.cda.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.Authorization;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.CDAPlugin;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Component3;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Component5;
import org.openhealthtools.mdht.uml.cda.Consent;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Criterion;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.Device;
import org.openhealthtools.mdht.uml.cda.DocumentRoot;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.Entity;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ExternalAct;
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.ExternalObservation;
import org.openhealthtools.mdht.uml.cda.ExternalProcedure;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.HealthCareFacility;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.LabeledDrug;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.MaintainedEntity;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.NonXMLBody;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.Order;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.OrganizationPartOf;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.ParentDocument;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.RegionOfInterestValue;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.RelatedDocument;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.RelatedSubject;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.Specimen;
import org.openhealthtools.mdht.uml.cda.SpecimenRole;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.StructuredBody;
import org.openhealthtools.mdht.uml.cda.Subject;
import org.openhealthtools.mdht.uml.cda.SubjectPerson;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage
 * @generated
 */
public class CDAValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CDAValidator INSTANCE = new CDAValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Guardian Choice' of 'Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GUARDIAN__GUARDIAN_CHOICE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assigned Author Choice' of 'Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSIGNED_AUTHOR__ASSIGNED_AUTHOR_CHOICE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Informant Choice' of 'Informant12'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMANT12__INFORMANT_CHOICE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Choice' of 'Component2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT2__BODY_CHOICE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Statement' of 'Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY__CLINICAL_STATEMENT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Playing Entity Choice' of 'Participant Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT_ROLE__PLAYING_ENTITY_CHOICE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Statement' of 'Entry Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY_RELATIONSHIP__CLINICAL_STATEMENT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Act Choice' of 'Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE__EXTERNAL_ACT_CHOICE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Statement' of 'Component4'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT4__CLINICAL_STATEMENT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Manufactured Drug Or Other Material' of 'Manufactured Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUFACTURED_PRODUCT__MANUFACTURED_DRUG_OR_OTHER_MATERIAL = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CDAPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CDAPackage.CLINICAL_DOCUMENT:
				return validateClinicalDocument((ClinicalDocument)value, diagnostics, context);
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID:
				return validateInfrastructureRootTypeId((InfrastructureRootTypeId)value, diagnostics, context);
			case CDAPackage.RECORD_TARGET:
				return validateRecordTarget((RecordTarget)value, diagnostics, context);
			case CDAPackage.PATIENT_ROLE:
				return validatePatientRole((PatientRole)value, diagnostics, context);
			case CDAPackage.PATIENT:
				return validatePatient((Patient)value, diagnostics, context);
			case CDAPackage.GUARDIAN:
				return validateGuardian((Guardian)value, diagnostics, context);
			case CDAPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case CDAPackage.ORGANIZATION:
				return validateOrganization((Organization)value, diagnostics, context);
			case CDAPackage.ORGANIZATION_PART_OF:
				return validateOrganizationPartOf((OrganizationPartOf)value, diagnostics, context);
			case CDAPackage.BIRTHPLACE:
				return validateBirthplace((Birthplace)value, diagnostics, context);
			case CDAPackage.PLACE:
				return validatePlace((Place)value, diagnostics, context);
			case CDAPackage.LANGUAGE_COMMUNICATION:
				return validateLanguageCommunication((LanguageCommunication)value, diagnostics, context);
			case CDAPackage.AUTHOR:
				return validateAuthor((Author)value, diagnostics, context);
			case CDAPackage.ASSIGNED_AUTHOR:
				return validateAssignedAuthor((AssignedAuthor)value, diagnostics, context);
			case CDAPackage.AUTHORING_DEVICE:
				return validateAuthoringDevice((AuthoringDevice)value, diagnostics, context);
			case CDAPackage.MAINTAINED_ENTITY:
				return validateMaintainedEntity((MaintainedEntity)value, diagnostics, context);
			case CDAPackage.DATA_ENTERER:
				return validateDataEnterer((DataEnterer)value, diagnostics, context);
			case CDAPackage.ASSIGNED_ENTITY:
				return validateAssignedEntity((AssignedEntity)value, diagnostics, context);
			case CDAPackage.INFORMANT12:
				return validateInformant12((Informant12)value, diagnostics, context);
			case CDAPackage.RELATED_ENTITY:
				return validateRelatedEntity((RelatedEntity)value, diagnostics, context);
			case CDAPackage.CUSTODIAN:
				return validateCustodian((Custodian)value, diagnostics, context);
			case CDAPackage.ASSIGNED_CUSTODIAN:
				return validateAssignedCustodian((AssignedCustodian)value, diagnostics, context);
			case CDAPackage.CUSTODIAN_ORGANIZATION:
				return validateCustodianOrganization((CustodianOrganization)value, diagnostics, context);
			case CDAPackage.INFORMATION_RECIPIENT:
				return validateInformationRecipient((InformationRecipient)value, diagnostics, context);
			case CDAPackage.INTENDED_RECIPIENT:
				return validateIntendedRecipient((IntendedRecipient)value, diagnostics, context);
			case CDAPackage.LEGAL_AUTHENTICATOR:
				return validateLegalAuthenticator((LegalAuthenticator)value, diagnostics, context);
			case CDAPackage.AUTHENTICATOR:
				return validateAuthenticator((Authenticator)value, diagnostics, context);
			case CDAPackage.PARTICIPANT1:
				return validateParticipant1((Participant1)value, diagnostics, context);
			case CDAPackage.ASSOCIATED_ENTITY:
				return validateAssociatedEntity((AssociatedEntity)value, diagnostics, context);
			case CDAPackage.IN_FULFILLMENT_OF:
				return validateInFulfillmentOf((InFulfillmentOf)value, diagnostics, context);
			case CDAPackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case CDAPackage.DOCUMENTATION_OF:
				return validateDocumentationOf((DocumentationOf)value, diagnostics, context);
			case CDAPackage.SERVICE_EVENT:
				return validateServiceEvent((ServiceEvent)value, diagnostics, context);
			case CDAPackage.PERFORMER1:
				return validatePerformer1((Performer1)value, diagnostics, context);
			case CDAPackage.RELATED_DOCUMENT:
				return validateRelatedDocument((RelatedDocument)value, diagnostics, context);
			case CDAPackage.PARENT_DOCUMENT:
				return validateParentDocument((ParentDocument)value, diagnostics, context);
			case CDAPackage.AUTHORIZATION:
				return validateAuthorization((Authorization)value, diagnostics, context);
			case CDAPackage.CONSENT:
				return validateConsent((Consent)value, diagnostics, context);
			case CDAPackage.COMPONENT1:
				return validateComponent1((Component1)value, diagnostics, context);
			case CDAPackage.ENCOMPASSING_ENCOUNTER:
				return validateEncompassingEncounter((EncompassingEncounter)value, diagnostics, context);
			case CDAPackage.RESPONSIBLE_PARTY:
				return validateResponsibleParty((ResponsibleParty)value, diagnostics, context);
			case CDAPackage.ENCOUNTER_PARTICIPANT:
				return validateEncounterParticipant((EncounterParticipant)value, diagnostics, context);
			case CDAPackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case CDAPackage.HEALTH_CARE_FACILITY:
				return validateHealthCareFacility((HealthCareFacility)value, diagnostics, context);
			case CDAPackage.COMPONENT2:
				return validateComponent2((Component2)value, diagnostics, context);
			case CDAPackage.NON_XML_BODY:
				return validateNonXMLBody((NonXMLBody)value, diagnostics, context);
			case CDAPackage.STRUCTURED_BODY:
				return validateStructuredBody((StructuredBody)value, diagnostics, context);
			case CDAPackage.COMPONENT3:
				return validateComponent3((Component3)value, diagnostics, context);
			case CDAPackage.SECTION:
				return validateSection((Section)value, diagnostics, context);
			case CDAPackage.STRUC_DOC_TEXT:
				return validateStrucDocText((StrucDocText)value, diagnostics, context);
			case CDAPackage.SUBJECT:
				return validateSubject((Subject)value, diagnostics, context);
			case CDAPackage.RELATED_SUBJECT:
				return validateRelatedSubject((RelatedSubject)value, diagnostics, context);
			case CDAPackage.SUBJECT_PERSON:
				return validateSubjectPerson((SubjectPerson)value, diagnostics, context);
			case CDAPackage.ENTRY:
				return validateEntry((Entry)value, diagnostics, context);
			case CDAPackage.ACT:
				return validateAct((Act)value, diagnostics, context);
			case CDAPackage.CLINICAL_STATEMENT:
				return validateClinicalStatement((ClinicalStatement)value, diagnostics, context);
			case CDAPackage.SPECIMEN:
				return validateSpecimen((Specimen)value, diagnostics, context);
			case CDAPackage.SPECIMEN_ROLE:
				return validateSpecimenRole((SpecimenRole)value, diagnostics, context);
			case CDAPackage.PLAYING_ENTITY:
				return validatePlayingEntity((PlayingEntity)value, diagnostics, context);
			case CDAPackage.PERFORMER2:
				return validatePerformer2((Performer2)value, diagnostics, context);
			case CDAPackage.PARTICIPANT2:
				return validateParticipant2((Participant2)value, diagnostics, context);
			case CDAPackage.PARTICIPANT_ROLE:
				return validateParticipantRole((ParticipantRole)value, diagnostics, context);
			case CDAPackage.DEVICE:
				return validateDevice((Device)value, diagnostics, context);
			case CDAPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case CDAPackage.ENTRY_RELATIONSHIP:
				return validateEntryRelationship((EntryRelationship)value, diagnostics, context);
			case CDAPackage.ENCOUNTER:
				return validateEncounter((Encounter)value, diagnostics, context);
			case CDAPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case CDAPackage.EXTERNAL_ACT:
				return validateExternalAct((ExternalAct)value, diagnostics, context);
			case CDAPackage.EXTERNAL_OBSERVATION:
				return validateExternalObservation((ExternalObservation)value, diagnostics, context);
			case CDAPackage.EXTERNAL_PROCEDURE:
				return validateExternalProcedure((ExternalProcedure)value, diagnostics, context);
			case CDAPackage.EXTERNAL_DOCUMENT:
				return validateExternalDocument((ExternalDocument)value, diagnostics, context);
			case CDAPackage.PRECONDITION:
				return validatePrecondition((Precondition)value, diagnostics, context);
			case CDAPackage.CRITERION:
				return validateCriterion((Criterion)value, diagnostics, context);
			case CDAPackage.OBSERVATION:
				return validateObservation((Observation)value, diagnostics, context);
			case CDAPackage.REFERENCE_RANGE:
				return validateReferenceRange((ReferenceRange)value, diagnostics, context);
			case CDAPackage.OBSERVATION_RANGE:
				return validateObservationRange((ObservationRange)value, diagnostics, context);
			case CDAPackage.OBSERVATION_MEDIA:
				return validateObservationMedia((ObservationMedia)value, diagnostics, context);
			case CDAPackage.ORGANIZER:
				return validateOrganizer((Organizer)value, diagnostics, context);
			case CDAPackage.COMPONENT4:
				return validateComponent4((Component4)value, diagnostics, context);
			case CDAPackage.PROCEDURE:
				return validateProcedure((Procedure)value, diagnostics, context);
			case CDAPackage.REGION_OF_INTEREST:
				return validateRegionOfInterest((RegionOfInterest)value, diagnostics, context);
			case CDAPackage.REGION_OF_INTEREST_VALUE:
				return validateRegionOfInterestValue((RegionOfInterestValue)value, diagnostics, context);
			case CDAPackage.SUBSTANCE_ADMINISTRATION:
				return validateSubstanceAdministration((SubstanceAdministration)value, diagnostics, context);
			case CDAPackage.CONSUMABLE:
				return validateConsumable((Consumable)value, diagnostics, context);
			case CDAPackage.MANUFACTURED_PRODUCT:
				return validateManufacturedProduct((ManufacturedProduct)value, diagnostics, context);
			case CDAPackage.LABELED_DRUG:
				return validateLabeledDrug((LabeledDrug)value, diagnostics, context);
			case CDAPackage.MATERIAL:
				return validateMaterial((Material)value, diagnostics, context);
			case CDAPackage.SUPPLY:
				return validateSupply((Supply)value, diagnostics, context);
			case CDAPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case CDAPackage.COMPONENT5:
				return validateComponent5((Component5)value, diagnostics, context);
			case CDAPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case CDAPackage.REGISTRY_DELEGATE:
				return validateRegistryDelegate((RegistryDelegate)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDocument(ClinicalDocument clinicalDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureRootTypeId(InfrastructureRootTypeId infrastructureRootTypeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infrastructureRootTypeId, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordTarget(RecordTarget recordTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recordTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRole(PatientRole patientRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardian(Guardian guardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(guardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(guardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(guardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(guardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(guardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(guardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(guardian, diagnostics, context);
		if (result || diagnostics != null) result &= validateGuardian_validateGuardianChoice(guardian, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGuardianChoice constraint of '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardian_validateGuardianChoice(Guardian guardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return guardian.validateGuardianChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationPartOf(OrganizationPartOf organizationPartOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationPartOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthplace(Birthplace birthplace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(birthplace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(place, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunication(LanguageCommunication languageCommunication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthor(Author author, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(author, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthor(AssignedAuthor assignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssignedAuthor_validateAssignedAuthorChoice(assignedAuthor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssignedAuthorChoice constraint of '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthor_validateAssignedAuthorChoice(AssignedAuthor assignedAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assignedAuthor.validateAssignedAuthorChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthoringDevice(AuthoringDevice authoringDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authoringDevice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaintainedEntity(MaintainedEntity maintainedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maintainedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataEnterer(DataEnterer dataEnterer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataEnterer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntity(AssignedEntity assignedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformant12(Informant12 informant12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(informant12, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(informant12, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(informant12, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(informant12, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(informant12, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(informant12, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(informant12, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformant12_validateInformantChoice(informant12, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInformantChoice constraint of '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformant12_validateInformantChoice(Informant12 informant12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return informant12.validateInformantChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedEntity(RelatedEntity relatedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodian(Custodian custodian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(custodian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedCustodian(AssignedCustodian assignedCustodian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignedCustodian, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganization(CustodianOrganization custodianOrganization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(custodianOrganization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationRecipient(InformationRecipient informationRecipient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationRecipient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntendedRecipient(IntendedRecipient intendedRecipient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intendedRecipient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalAuthenticator(LegalAuthenticator legalAuthenticator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legalAuthenticator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticator(Authenticator authenticator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authenticator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant1(Participant1 participant1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participant1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedEntity(AssociatedEntity associatedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associatedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInFulfillmentOf(InFulfillmentOf inFulfillmentOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inFulfillmentOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentationOf(DocumentationOf documentationOf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentationOf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent(ServiceEvent serviceEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformer1(Performer1 performer1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performer1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedDocument(RelatedDocument relatedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentDocument(ParentDocument parentDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parentDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorization(Authorization authorization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsent(Consent consent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent1(Component1 component1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter(EncompassingEncounter encompassingEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encompassingEncounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibleParty(ResponsibleParty responsibleParty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsibleParty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterParticipant(EncounterParticipant encounterParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(location, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthCareFacility(HealthCareFacility healthCareFacility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthCareFacility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent2(Component2 component2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(component2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component2, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent2_validateBodyChoice(component2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateBodyChoice constraint of '<em>Component2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent2_validateBodyChoice(Component2 component2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return component2.validateBodyChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonXMLBody(NonXMLBody nonXMLBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonXMLBody, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredBody(StructuredBody structuredBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredBody, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent3(Component3 component3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(section, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrucDocText(StrucDocText strucDocText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strucDocText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubject(Subject subject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedSubject(RelatedSubject relatedSubject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectPerson(SubjectPerson subjectPerson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectPerson, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry(Entry entry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entry, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntry_validateClinicalStatement(entry, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClinicalStatement constraint of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry_validateClinicalStatement(Entry entry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entry.validateClinicalStatement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAct(Act act, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(act, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalStatement(ClinicalStatement clinicalStatement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimen(Specimen specimen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimen, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenRole(SpecimenRole specimenRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specimenRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayingEntity(PlayingEntity playingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playingEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformer2(Performer2 performer2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performer2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant2(Participant2 participant2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participant2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRole(ParticipantRole participantRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participantRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipantRole_validatePlayingEntityChoice(participantRole, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlayingEntityChoice constraint of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRole_validatePlayingEntityChoice(ParticipantRole participantRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participantRole.validatePlayingEntityChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(device, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryRelationship(EntryRelationship entryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntryRelationship_validateClinicalStatement(entryRelationship, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClinicalStatement constraint of '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryRelationship_validateClinicalStatement(EntryRelationship entryRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entryRelationship.validateClinicalStatement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounter(Encounter encounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		if (result || diagnostics != null) result &= validateReference_validateExternalActChoice(reference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateExternalActChoice constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_validateExternalActChoice(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reference.validateExternalActChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalAct(ExternalAct externalAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalAct, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalObservation(ExternalObservation externalObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalProcedure(ExternalProcedure externalProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalProcedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocument(ExternalDocument externalDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecondition(Precondition precondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(precondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(criterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservation(Observation observation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceRange(ReferenceRange referenceRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRange(ObservationRange observationRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationMedia(ObservationMedia observationMedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationMedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizer(Organizer organizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent4(Component4 component4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(component4, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(component4, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(component4, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(component4, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(component4, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(component4, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(component4, diagnostics, context);
		if (result || diagnostics != null) result &= validateComponent4_validateClinicalStatement(component4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClinicalStatement constraint of '<em>Component4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent4_validateClinicalStatement(Component4 component4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return component4.validateClinicalStatement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedure(Procedure procedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionOfInterest(RegionOfInterest regionOfInterest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionOfInterest, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionOfInterestValue(RegionOfInterestValue regionOfInterestValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionOfInterestValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceAdministration(SubstanceAdministration substanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(substanceAdministration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumable(Consumable consumable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consumable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturedProduct(ManufacturedProduct manufacturedProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(manufacturedProduct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateManufacturedDrugOrOtherMaterial constraint of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(ManufacturedProduct manufacturedProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manufacturedProduct.validateManufacturedDrugOrOtherMaterial(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledDrug(LabeledDrug labeledDrug, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labeledDrug, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial(Material material, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(material, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupply(Supply supply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supply, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent5(Component5 component5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryDelegate(RegistryDelegate registryDelegate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registryDelegate, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CDAPlugin.INSTANCE;
	}

} //CDAValidator
