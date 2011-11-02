/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.SDTCPatient;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Clinical Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DOCUMENT__CLASS_CODE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Clinical Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLINICAL_DOCUMENT__MOOD_CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Redefined Root' of 'Infrastructure Root Type Id'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Redefined Extension' of 'Infrastructure Root Type Id'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate II' of 'Infrastructure Root Type Id'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_ROOT_TYPE_ID__II = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Record Target'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECORD_TARGET__TYPE_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Record Target'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECORD_TARGET__CONTEXT_CONTROL_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Patient Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_ROLE__CLASS_CODE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Patient'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT__CLASS_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Patient'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT__DETERMINER_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Guardian Choice' of 'Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GUARDIAN__GUARDIAN_CHOICE = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Guardian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GUARDIAN__CLASS_CODE = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Person'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON__CLASS_CODE = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Person'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON__DETERMINER_CODE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Organization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORGANIZATION__CLASS_CODE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Organization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORGANIZATION__DETERMINER_CODE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Organization Part Of'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORGANIZATION_PART_OF__CLASS_CODE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Birthplace'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIRTHPLACE__CLASS_CODE = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Place'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLACE__CLASS_CODE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Place'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLACE__DETERMINER_CODE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHOR__TYPE_CODE = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHOR__CONTEXT_CONTROL_CODE = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assigned Author Choice' of 'Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSIGNED_AUTHOR__ASSIGNED_AUTHOR_CHOICE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Assigned Author'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSIGNED_AUTHOR__CLASS_CODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Authoring Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORING_DEVICE__CLASS_CODE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Authoring Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORING_DEVICE__DETERMINER_CODE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Maintained Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAINTAINED_ENTITY__CLASS_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Data Enterer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_ENTERER__TYPE_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Data Enterer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_ENTERER__CONTEXT_CONTROL_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Assigned Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSIGNED_ENTITY__CLASS_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Informant Choice' of 'Informant12'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMANT12__INFORMANT_CHOICE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Informant12'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMANT12__TYPE_CODE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Informant12'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFORMANT12__CONTEXT_CONTROL_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Custodian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CUSTODIAN__TYPE_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Assigned Custodian'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSIGNED_CUSTODIAN__CLASS_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Custodian Organization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CUSTODIAN_ORGANIZATION__CLASS_CODE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Custodian Organization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CUSTODIAN_ORGANIZATION__DETERMINER_CODE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Legal Authenticator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LEGAL_AUTHENTICATOR__TYPE_CODE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Legal Authenticator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LEGAL_AUTHENTICATOR__CONTEXT_CONTROL_CODE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Authenticator'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHENTICATOR__TYPE_CODE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Participant1'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT1__CONTEXT_CONTROL_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'In Fulfillment Of'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IN_FULFILLMENT_OF__TYPE_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ORDER__MOOD_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Documentation Of'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOCUMENTATION_OF__TYPE_CODE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Service Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_EVENT__MOOD_CODE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Parent Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARENT_DOCUMENT__CLASS_CODE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Parent Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARENT_DOCUMENT__MOOD_CODE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Authorization'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION__TYPE_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT__CLASS_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Consent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSENT__MOOD_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Component1'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT1__TYPE_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Encompassing Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOMPASSING_ENCOUNTER__CLASS_CODE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Encompassing Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOMPASSING_ENCOUNTER__MOOD_CODE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Responsible Party'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSIBLE_PARTY__TYPE_CODE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION__TYPE_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Body Choice' of 'Component2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT2__BODY_CHOICE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Component2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT2__TYPE_CODE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Conduction Ind' of 'Component2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT2__CONTEXT_CONDUCTION_IND = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Non XML Body'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NON_XML_BODY__CLASS_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Non XML Body'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NON_XML_BODY__MOOD_CODE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Structured Body'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURED_BODY__CLASS_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Structured Body'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STRUCTURED_BODY__MOOD_CODE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Component3'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT3__TYPE_CODE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Conduction Ind' of 'Component3'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT3__CONTEXT_CONDUCTION_IND = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECTION__CLASS_CODE = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SECTION__MOOD_CODE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Subject'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBJECT__TYPE_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Subject'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBJECT__CONTEXT_CONTROL_CODE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Subject Person'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBJECT_PERSON__CLASS_CODE = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Subject Person'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBJECT_PERSON__DETERMINER_CODE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Statement' of 'Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY__CLINICAL_STATEMENT = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Conduction Ind' of 'Entry'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY__CONTEXT_CONDUCTION_IND = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Specimen'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPECIMEN__TYPE_CODE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Specimen Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPECIMEN_ROLE__CLASS_CODE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Playing Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAYING_ENTITY__DETERMINER_CODE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Performer2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERFORMER2__TYPE_CODE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Control Code' of 'Participant2'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT2__CONTEXT_CONTROL_CODE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Playing Entity Choice' of 'Participant Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT_ROLE__PLAYING_ENTITY_CHOICE = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEVICE__DETERMINER_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTITY__DETERMINER_CODE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Statement' of 'Entry Relationship'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRY_RELATIONSHIP__CLINICAL_STATEMENT = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate External Act Choice' of 'Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE__EXTERNAL_ACT_CHOICE = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'External Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_ACT__MOOD_CODE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'External Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_OBSERVATION__MOOD_CODE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'External Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_PROCEDURE__CLASS_CODE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'External Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_PROCEDURE__MOOD_CODE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'External Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXTERNAL_DOCUMENT__MOOD_CODE = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Precondition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRECONDITION__TYPE_CODE = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Criterion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION__MOOD_CODE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Reference Range'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE_RANGE__TYPE_CODE = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Observation Range'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OBSERVATION_RANGE__MOOD_CODE = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Clinical Statement' of 'Component4'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT4__CLINICAL_STATEMENT = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Component4'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT4__TYPE_CODE = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Conduction Ind' of 'Component4'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT4__CONTEXT_CONDUCTION_IND = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Region Of Interest'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGION_OF_INTEREST__CLASS_CODE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mood Code' of 'Region Of Interest'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REGION_OF_INTEREST__MOOD_CODE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSTANCE_ADMINISTRATION__CLASS_CODE = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Consumable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSUMABLE__TYPE_CODE = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Manufactured Drug Or Other Material' of 'Manufactured Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUFACTURED_PRODUCT__MANUFACTURED_DRUG_OR_OTHER_MATERIAL = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Manufactured Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUFACTURED_PRODUCT__CLASS_CODE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Labeled Drug'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABELED_DRUG__CLASS_CODE = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Labeled Drug'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LABELED_DRUG__DETERMINER_CODE = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Material'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERIAL__CLASS_CODE = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Determiner Code' of 'Material'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MATERIAL__DETERMINER_CODE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Class Code' of 'Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY__CLASS_CODE = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__TYPE_CODE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Type Code' of 'Component5'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT5__TYPE_CODE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Context Conduction Ind' of 'Component5'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPONENT5__CONTEXT_CONDUCTION_IND = 108;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 108;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypesValidator datatypesValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDAValidator() {
		super();
		datatypesValidator = DatatypesValidator.INSTANCE;
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
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CDAPlugin.INSTANCE;
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
				return validateClinicalDocument((ClinicalDocument) value, diagnostics, context);
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID:
				return validateInfrastructureRootTypeId((InfrastructureRootTypeId) value, diagnostics, context);
			case CDAPackage.RECORD_TARGET:
				return validateRecordTarget((RecordTarget) value, diagnostics, context);
			case CDAPackage.PATIENT_ROLE:
				return validatePatientRole((PatientRole) value, diagnostics, context);
			case CDAPackage.PATIENT:
				return validatePatient((Patient) value, diagnostics, context);
			case CDAPackage.GUARDIAN:
				return validateGuardian((Guardian) value, diagnostics, context);
			case CDAPackage.PERSON:
				return validatePerson((Person) value, diagnostics, context);
			case CDAPackage.ORGANIZATION:
				return validateOrganization((Organization) value, diagnostics, context);
			case CDAPackage.ORGANIZATION_PART_OF:
				return validateOrganizationPartOf((OrganizationPartOf) value, diagnostics, context);
			case CDAPackage.BIRTHPLACE:
				return validateBirthplace((Birthplace) value, diagnostics, context);
			case CDAPackage.PLACE:
				return validatePlace((Place) value, diagnostics, context);
			case CDAPackage.LANGUAGE_COMMUNICATION:
				return validateLanguageCommunication((LanguageCommunication) value, diagnostics, context);
			case CDAPackage.AUTHOR:
				return validateAuthor((Author) value, diagnostics, context);
			case CDAPackage.ASSIGNED_AUTHOR:
				return validateAssignedAuthor((AssignedAuthor) value, diagnostics, context);
			case CDAPackage.AUTHORING_DEVICE:
				return validateAuthoringDevice((AuthoringDevice) value, diagnostics, context);
			case CDAPackage.MAINTAINED_ENTITY:
				return validateMaintainedEntity((MaintainedEntity) value, diagnostics, context);
			case CDAPackage.DATA_ENTERER:
				return validateDataEnterer((DataEnterer) value, diagnostics, context);
			case CDAPackage.ASSIGNED_ENTITY:
				return validateAssignedEntity((AssignedEntity) value, diagnostics, context);
			case CDAPackage.SDTC_PATIENT:
				return validateSDTCPatient((SDTCPatient) value, diagnostics, context);
			case CDAPackage.INFORMANT12:
				return validateInformant12((Informant12) value, diagnostics, context);
			case CDAPackage.RELATED_ENTITY:
				return validateRelatedEntity((RelatedEntity) value, diagnostics, context);
			case CDAPackage.CUSTODIAN:
				return validateCustodian((Custodian) value, diagnostics, context);
			case CDAPackage.ASSIGNED_CUSTODIAN:
				return validateAssignedCustodian((AssignedCustodian) value, diagnostics, context);
			case CDAPackage.CUSTODIAN_ORGANIZATION:
				return validateCustodianOrganization((CustodianOrganization) value, diagnostics, context);
			case CDAPackage.INFORMATION_RECIPIENT:
				return validateInformationRecipient((InformationRecipient) value, diagnostics, context);
			case CDAPackage.INTENDED_RECIPIENT:
				return validateIntendedRecipient((IntendedRecipient) value, diagnostics, context);
			case CDAPackage.LEGAL_AUTHENTICATOR:
				return validateLegalAuthenticator((LegalAuthenticator) value, diagnostics, context);
			case CDAPackage.AUTHENTICATOR:
				return validateAuthenticator((Authenticator) value, diagnostics, context);
			case CDAPackage.PARTICIPANT1:
				return validateParticipant1((Participant1) value, diagnostics, context);
			case CDAPackage.ASSOCIATED_ENTITY:
				return validateAssociatedEntity((AssociatedEntity) value, diagnostics, context);
			case CDAPackage.IN_FULFILLMENT_OF:
				return validateInFulfillmentOf((InFulfillmentOf) value, diagnostics, context);
			case CDAPackage.ORDER:
				return validateOrder((Order) value, diagnostics, context);
			case CDAPackage.DOCUMENTATION_OF:
				return validateDocumentationOf((DocumentationOf) value, diagnostics, context);
			case CDAPackage.SERVICE_EVENT:
				return validateServiceEvent((ServiceEvent) value, diagnostics, context);
			case CDAPackage.PERFORMER1:
				return validatePerformer1((Performer1) value, diagnostics, context);
			case CDAPackage.RELATED_DOCUMENT:
				return validateRelatedDocument((RelatedDocument) value, diagnostics, context);
			case CDAPackage.PARENT_DOCUMENT:
				return validateParentDocument((ParentDocument) value, diagnostics, context);
			case CDAPackage.AUTHORIZATION:
				return validateAuthorization((Authorization) value, diagnostics, context);
			case CDAPackage.CONSENT:
				return validateConsent((Consent) value, diagnostics, context);
			case CDAPackage.COMPONENT1:
				return validateComponent1((Component1) value, diagnostics, context);
			case CDAPackage.ENCOMPASSING_ENCOUNTER:
				return validateEncompassingEncounter((EncompassingEncounter) value, diagnostics, context);
			case CDAPackage.RESPONSIBLE_PARTY:
				return validateResponsibleParty((ResponsibleParty) value, diagnostics, context);
			case CDAPackage.ENCOUNTER_PARTICIPANT:
				return validateEncounterParticipant((EncounterParticipant) value, diagnostics, context);
			case CDAPackage.LOCATION:
				return validateLocation((Location) value, diagnostics, context);
			case CDAPackage.HEALTH_CARE_FACILITY:
				return validateHealthCareFacility((HealthCareFacility) value, diagnostics, context);
			case CDAPackage.COMPONENT2:
				return validateComponent2((Component2) value, diagnostics, context);
			case CDAPackage.NON_XML_BODY:
				return validateNonXMLBody((NonXMLBody) value, diagnostics, context);
			case CDAPackage.STRUCTURED_BODY:
				return validateStructuredBody((StructuredBody) value, diagnostics, context);
			case CDAPackage.COMPONENT3:
				return validateComponent3((Component3) value, diagnostics, context);
			case CDAPackage.SECTION:
				return validateSection((Section) value, diagnostics, context);
			case CDAPackage.STRUC_DOC_TEXT:
				return validateStrucDocText((StrucDocText) value, diagnostics, context);
			case CDAPackage.SUBJECT:
				return validateSubject((Subject) value, diagnostics, context);
			case CDAPackage.RELATED_SUBJECT:
				return validateRelatedSubject((RelatedSubject) value, diagnostics, context);
			case CDAPackage.SUBJECT_PERSON:
				return validateSubjectPerson((SubjectPerson) value, diagnostics, context);
			case CDAPackage.ENTRY:
				return validateEntry((Entry) value, diagnostics, context);
			case CDAPackage.ACT:
				return validateAct((Act) value, diagnostics, context);
			case CDAPackage.CLINICAL_STATEMENT:
				return validateClinicalStatement((ClinicalStatement) value, diagnostics, context);
			case CDAPackage.ENCOUNTER:
				return validateEncounter((Encounter) value, diagnostics, context);
			case CDAPackage.SPECIMEN:
				return validateSpecimen((Specimen) value, diagnostics, context);
			case CDAPackage.SPECIMEN_ROLE:
				return validateSpecimenRole((SpecimenRole) value, diagnostics, context);
			case CDAPackage.PLAYING_ENTITY:
				return validatePlayingEntity((PlayingEntity) value, diagnostics, context);
			case CDAPackage.PERFORMER2:
				return validatePerformer2((Performer2) value, diagnostics, context);
			case CDAPackage.PARTICIPANT2:
				return validateParticipant2((Participant2) value, diagnostics, context);
			case CDAPackage.PARTICIPANT_ROLE:
				return validateParticipantRole((ParticipantRole) value, diagnostics, context);
			case CDAPackage.DEVICE:
				return validateDevice((Device) value, diagnostics, context);
			case CDAPackage.ENTITY:
				return validateEntity((Entity) value, diagnostics, context);
			case CDAPackage.ENTRY_RELATIONSHIP:
				return validateEntryRelationship((EntryRelationship) value, diagnostics, context);
			case CDAPackage.OBSERVATION:
				return validateObservation((Observation) value, diagnostics, context);
			case CDAPackage.REFERENCE:
				return validateReference((Reference) value, diagnostics, context);
			case CDAPackage.EXTERNAL_ACT:
				return validateExternalAct((ExternalAct) value, diagnostics, context);
			case CDAPackage.EXTERNAL_OBSERVATION:
				return validateExternalObservation((ExternalObservation) value, diagnostics, context);
			case CDAPackage.EXTERNAL_PROCEDURE:
				return validateExternalProcedure((ExternalProcedure) value, diagnostics, context);
			case CDAPackage.EXTERNAL_DOCUMENT:
				return validateExternalDocument((ExternalDocument) value, diagnostics, context);
			case CDAPackage.PRECONDITION:
				return validatePrecondition((Precondition) value, diagnostics, context);
			case CDAPackage.CRITERION:
				return validateCriterion((Criterion) value, diagnostics, context);
			case CDAPackage.REFERENCE_RANGE:
				return validateReferenceRange((ReferenceRange) value, diagnostics, context);
			case CDAPackage.OBSERVATION_RANGE:
				return validateObservationRange((ObservationRange) value, diagnostics, context);
			case CDAPackage.OBSERVATION_MEDIA:
				return validateObservationMedia((ObservationMedia) value, diagnostics, context);
			case CDAPackage.ORGANIZER:
				return validateOrganizer((Organizer) value, diagnostics, context);
			case CDAPackage.COMPONENT4:
				return validateComponent4((Component4) value, diagnostics, context);
			case CDAPackage.PROCEDURE:
				return validateProcedure((Procedure) value, diagnostics, context);
			case CDAPackage.REGION_OF_INTEREST:
				return validateRegionOfInterest((RegionOfInterest) value, diagnostics, context);
			case CDAPackage.REGION_OF_INTEREST_VALUE:
				return validateRegionOfInterestValue((RegionOfInterestValue) value, diagnostics, context);
			case CDAPackage.SUBSTANCE_ADMINISTRATION:
				return validateSubstanceAdministration((SubstanceAdministration) value, diagnostics, context);
			case CDAPackage.CONSUMABLE:
				return validateConsumable((Consumable) value, diagnostics, context);
			case CDAPackage.MANUFACTURED_PRODUCT:
				return validateManufacturedProduct((ManufacturedProduct) value, diagnostics, context);
			case CDAPackage.LABELED_DRUG:
				return validateLabeledDrug((LabeledDrug) value, diagnostics, context);
			case CDAPackage.MATERIAL:
				return validateMaterial((Material) value, diagnostics, context);
			case CDAPackage.SUPPLY:
				return validateSupply((Supply) value, diagnostics, context);
			case CDAPackage.PRODUCT:
				return validateProduct((Product) value, diagnostics, context);
			case CDAPackage.COMPONENT5:
				return validateComponent5((Component5) value, diagnostics, context);
			case CDAPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot) value, diagnostics, context);
			case CDAPackage.REGISTRY_DELEGATE:
				return validateRegistryDelegate((RegistryDelegate) value, diagnostics, context);
			default:
				return true;
		}
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
	public boolean validateAssignedAuthor(AssignedAuthor assignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assignedAuthor, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(assignedAuthor, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(assignedAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(assignedAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(assignedAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(assignedAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(assignedAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(assignedAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssignedAuthor_validateAssignedAuthorChoice(assignedAuthor, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssignedAuthor_validateClassCode(assignedAuthor, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateAssignedAuthorChoice constraint of '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthor_validateAssignedAuthorChoice(AssignedAuthor assignedAuthor,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assignedAuthor.validateAssignedAuthorChoice(diagnostics, context);
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedAuthor_validateClassCode(AssignedAuthor assignedAuthor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assignedAuthor.validateClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedCustodian(AssignedCustodian assignedCustodian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assignedCustodian, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(assignedCustodian, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(assignedCustodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(assignedCustodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(assignedCustodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(assignedCustodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(assignedCustodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(assignedCustodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssignedCustodian_validateClassCode(assignedCustodian, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedCustodian_validateClassCode(AssignedCustodian assignedCustodian,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assignedCustodian.validateClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntity(AssignedEntity assignedEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assignedEntity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(assignedEntity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(assignedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(assignedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(assignedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(assignedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(assignedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(assignedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAssignedEntity_validateClassCode(assignedEntity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignedEntity_validateClassCode(AssignedEntity assignedEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return assignedEntity.validateClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociatedEntity(AssociatedEntity associatedEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associatedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticator(Authenticator authenticator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authenticator, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(authenticator, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(authenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(authenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(authenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(authenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(authenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(authenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthenticator_validateTypeCode(authenticator, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthenticator_validateTypeCode(Authenticator authenticator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return authenticator.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthor(Author author, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(author, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(author, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(author, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(author, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(author, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(author, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(author, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(author, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthor_validateTypeCode(author, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthor_validateContextControlCode(author, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthor_validateContextControlCode(Author author, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return author.validateContextControlCode(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthor_validateTypeCode(Author author, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return author.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthoringDevice(AuthoringDevice authoringDevice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authoringDevice, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(authoringDevice, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(authoringDevice, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(authoringDevice, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(authoringDevice, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(authoringDevice, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(authoringDevice, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(authoringDevice, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthoringDevice_validateClassCode(authoringDevice, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthoringDevice_validateDeterminerCode(authoringDevice, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthoringDevice_validateClassCode(AuthoringDevice authoringDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authoringDevice.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthoringDevice_validateDeterminerCode(AuthoringDevice authoringDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authoringDevice.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorization(Authorization authorization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authorization, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(authorization, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(authorization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(authorization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(authorization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(authorization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(authorization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(authorization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateAuthorization_validateTypeCode(authorization, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorization_validateTypeCode(Authorization authorization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return authorization.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthplace(Birthplace birthplace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(birthplace, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(birthplace, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(birthplace, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(birthplace, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(birthplace, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(birthplace, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(birthplace, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(birthplace, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateBirthplace_validateClassCode(birthplace, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBirthplace_validateClassCode(Birthplace birthplace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return birthplace.validateClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDocument(ClinicalDocument clinicalDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clinicalDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(clinicalDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(clinicalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(clinicalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(clinicalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(clinicalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(clinicalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(clinicalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDocument_validateClassCode(clinicalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateClinicalDocument_validateMoodCode(clinicalDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDocument_validateClassCode(ClinicalDocument clinicalDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDocument.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDocument_validateMoodCode(ClinicalDocument clinicalDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clinicalDocument.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalStatement(ClinicalStatement clinicalStatement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalStatement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent1(Component1 component1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component1, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(component1, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(component1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(component1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(component1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(component1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(component1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(component1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent1_validateTypeCode(component1, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Component1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent1_validateTypeCode(Component1 component1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component1.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent2(Component2 component2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component2, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(component2, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent2_validateBodyChoice(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent2_validateTypeCode(component2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent2_validateContextConductionInd(component2, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateBodyChoice constraint of '<em>Component2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent2_validateBodyChoice(Component2 component2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component2.validateBodyChoice(diagnostics, context);
	}

	/**
	 * Validates the validateContextConductionInd constraint of '<em>Component2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent2_validateContextConductionInd(Component2 component2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component2.validateContextConductionInd(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Component2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent2_validateTypeCode(Component2 component2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component2.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent3(Component3 component3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component3, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(component3, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(component3, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(component3, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(component3, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(component3, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(component3, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(component3, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent3_validateTypeCode(component3, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent3_validateContextConductionInd(component3, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextConductionInd constraint of '<em>Component3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent3_validateContextConductionInd(Component3 component3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component3.validateContextConductionInd(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Component3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent3_validateTypeCode(Component3 component3, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component3.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent4(Component4 component4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component4, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(component4, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent4_validateClinicalStatement(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent4_validateTypeCode(component4, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent4_validateContextConductionInd(component4, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClinicalStatement constraint of '<em>Component4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent4_validateClinicalStatement(Component4 component4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component4.validateClinicalStatement(diagnostics, context);
	}

	/**
	 * Validates the validateContextConductionInd constraint of '<em>Component4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent4_validateContextConductionInd(Component4 component4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component4.validateContextConductionInd(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Component4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent4_validateTypeCode(Component4 component4, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component4.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent5(Component5 component5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(component5, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(component5, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(component5, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(component5, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(component5, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(component5, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(component5, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(component5, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent5_validateTypeCode(component5, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateComponent5_validateContextConductionInd(component5, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextConductionInd constraint of '<em>Component5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent5_validateContextConductionInd(Component5 component5, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component5.validateContextConductionInd(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Component5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent5_validateTypeCode(Component5 component5, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return component5.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsent(Consent consent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consent, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(consent, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(consent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(consent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(consent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(consent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(consent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(consent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsent_validateClassCode(consent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsent_validateMoodCode(consent, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsent_validateClassCode(Consent consent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consent.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsent_validateMoodCode(Consent consent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consent.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumable(Consumable consumable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consumable, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(consumable, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(consumable, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(consumable, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(consumable, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(consumable, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(consumable, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(consumable, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateConsumable_validateTypeCode(consumable, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Consumable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumable_validateTypeCode(Consumable consumable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return consumable.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(criterion, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(criterion, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(criterion, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(criterion, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(criterion, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(criterion, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(criterion, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(criterion, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCriterion_validateMoodCode(criterion, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion_validateMoodCode(Criterion criterion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return criterion.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodian(Custodian custodian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(custodian, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(custodian, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(custodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(custodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(custodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(custodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(custodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(custodian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCustodian_validateTypeCode(custodian, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodian_validateTypeCode(Custodian custodian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return custodian.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganization(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(custodianOrganization, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(custodianOrganization, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(custodianOrganization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(custodianOrganization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(custodianOrganization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(custodianOrganization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(custodianOrganization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(custodianOrganization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCustodianOrganization_validateClassCode(custodianOrganization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateCustodianOrganization_validateDeterminerCode(custodianOrganization, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganization_validateClassCode(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return custodianOrganization.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianOrganization_validateDeterminerCode(CustodianOrganization custodianOrganization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return custodianOrganization.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataEnterer(DataEnterer dataEnterer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataEnterer, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(dataEnterer, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(dataEnterer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(dataEnterer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(dataEnterer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(dataEnterer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(dataEnterer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(dataEnterer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDataEnterer_validateTypeCode(dataEnterer, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDataEnterer_validateContextControlCode(dataEnterer, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataEnterer_validateContextControlCode(DataEnterer dataEnterer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dataEnterer.validateContextControlCode(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataEnterer_validateTypeCode(DataEnterer dataEnterer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dataEnterer.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(device, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(device, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(device, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(device, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(device, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(device, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(device, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(device, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDevice_validateDeterminerCode(device, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice_validateDeterminerCode(Device device, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return device.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentationOf(DocumentationOf documentationOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentationOf, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(documentationOf, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(documentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(documentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(documentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(documentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(documentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(documentationOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateDocumentationOf_validateTypeCode(documentationOf, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentationOf_validateTypeCode(DocumentationOf documentationOf,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return documentationOf.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter(EncompassingEncounter encompassingEncounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encompassingEncounter, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(encompassingEncounter, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(encompassingEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(encompassingEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(encompassingEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(encompassingEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(encompassingEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(encompassingEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncompassingEncounter_validateClassCode(encompassingEncounter, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEncompassingEncounter_validateMoodCode(encompassingEncounter, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter_validateClassCode(EncompassingEncounter encompassingEncounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encompassingEncounter.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncompassingEncounter_validateMoodCode(EncompassingEncounter encompassingEncounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encompassingEncounter.validateMoodCode(diagnostics, context);
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
	public boolean validateEncounterParticipant(EncounterParticipant encounterParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encounterParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(entity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(entity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(entity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEntity_validateDeterminerCode(entity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_validateDeterminerCode(Entity entity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entity.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry(Entry entry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entry, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(entry, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(entry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(entry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(entry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(entry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(entry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(entry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEntry_validateClinicalStatement(entry, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEntry_validateContextConductionInd(entry, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClinicalStatement constraint of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry_validateClinicalStatement(Entry entry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entry.validateClinicalStatement(diagnostics, context);
	}

	/**
	 * Validates the validateContextConductionInd constraint of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntry_validateContextConductionInd(Entry entry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return entry.validateContextConductionInd(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryRelationship(EntryRelationship entryRelationship, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entryRelationship, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(entryRelationship, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(entryRelationship, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(entryRelationship, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(entryRelationship, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(entryRelationship, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(entryRelationship, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(entryRelationship, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateEntryRelationship_validateClinicalStatement(entryRelationship, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClinicalStatement constraint of '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryRelationship_validateClinicalStatement(EntryRelationship entryRelationship,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entryRelationship.validateClinicalStatement(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalAct(ExternalAct externalAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalAct, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(externalAct, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(externalAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(externalAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(externalAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(externalAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(externalAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(externalAct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalAct_validateMoodCode(externalAct, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>External Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalAct_validateMoodCode(ExternalAct externalAct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return externalAct.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocument(ExternalDocument externalDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(externalDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(externalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(externalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(externalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(externalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(externalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(externalDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalDocument_validateMoodCode(externalDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>External Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocument_validateMoodCode(ExternalDocument externalDocument,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalDocument.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalObservation(ExternalObservation externalObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalObservation, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(externalObservation, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(externalObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(externalObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(externalObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(externalObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(externalObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(externalObservation, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalObservation_validateMoodCode(externalObservation, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>External Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalObservation_validateMoodCode(ExternalObservation externalObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalObservation.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalProcedure(ExternalProcedure externalProcedure, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(externalProcedure, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(externalProcedure, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(externalProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(externalProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(externalProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(externalProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(externalProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(externalProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalProcedure_validateClassCode(externalProcedure, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateExternalProcedure_validateMoodCode(externalProcedure, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>External Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalProcedure_validateClassCode(ExternalProcedure externalProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalProcedure.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>External Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalProcedure_validateMoodCode(ExternalProcedure externalProcedure,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return externalProcedure.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardian(Guardian guardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(guardian, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(guardian, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(guardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(guardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(guardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(guardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(guardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(guardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGuardian_validateGuardianChoice(guardian, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateGuardian_validateClassCode(guardian, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardian_validateClassCode(Guardian guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return guardian.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateGuardianChoice constraint of '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardian_validateGuardianChoice(Guardian guardian, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return guardian.validateGuardianChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthCareFacility(HealthCareFacility healthCareFacility, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(healthCareFacility, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformant12(Informant12 informant12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(informant12, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(informant12, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformant12_validateInformantChoice(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformant12_validateTypeCode(informant12, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInformant12_validateContextControlCode(informant12, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformant12_validateContextControlCode(Informant12 informant12, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informant12.validateContextControlCode(diagnostics, context);
	}

	/**
	 * Validates the validateInformantChoice constraint of '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformant12_validateInformantChoice(Informant12 informant12, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informant12.validateInformantChoice(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformant12_validateTypeCode(Informant12 informant12, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return informant12.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationRecipient(InformationRecipient informationRecipient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(informationRecipient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureRootTypeId(InfrastructureRootTypeId infrastructureRootTypeId,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureRootTypeId, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(infrastructureRootTypeId, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfrastructureRootTypeId_validateII(infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfrastructureRootTypeId_validateRedefinedRoot(
				infrastructureRootTypeId, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInfrastructureRootTypeId_validateRedefinedExtension(
				infrastructureRootTypeId, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateII constraint of '<em>Infrastructure Root Type Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateInfrastructureRootTypeId_validateII(InfrastructureRootTypeId infrastructureRootTypeId,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return datatypesValidator.validateII_validateII(infrastructureRootTypeId, diagnostics, context);
	}

	/**
	 * Validates the validateRedefinedExtension constraint of '<em>Infrastructure Root Type Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureRootTypeId_validateRedefinedExtension(
			InfrastructureRootTypeId infrastructureRootTypeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infrastructureRootTypeId.validateRedefinedExtension(diagnostics, context);
	}

	/**
	 * Validates the validateRedefinedRoot constraint of '<em>Infrastructure Root Type Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureRootTypeId_validateRedefinedRoot(
			InfrastructureRootTypeId infrastructureRootTypeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infrastructureRootTypeId.validateRedefinedRoot(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInFulfillmentOf(InFulfillmentOf inFulfillmentOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inFulfillmentOf, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(inFulfillmentOf, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(inFulfillmentOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(inFulfillmentOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(inFulfillmentOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(inFulfillmentOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(inFulfillmentOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(inFulfillmentOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateInFulfillmentOf_validateTypeCode(inFulfillmentOf, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInFulfillmentOf_validateTypeCode(InFulfillmentOf inFulfillmentOf,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inFulfillmentOf.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntendedRecipient(IntendedRecipient intendedRecipient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intendedRecipient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledDrug(LabeledDrug labeledDrug, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(labeledDrug, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(labeledDrug, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(labeledDrug, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(labeledDrug, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(labeledDrug, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(labeledDrug, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(labeledDrug, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(labeledDrug, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLabeledDrug_validateClassCode(labeledDrug, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLabeledDrug_validateDeterminerCode(labeledDrug, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Labeled Drug</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledDrug_validateClassCode(LabeledDrug labeledDrug, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return labeledDrug.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Labeled Drug</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledDrug_validateDeterminerCode(LabeledDrug labeledDrug, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return labeledDrug.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCommunication(LanguageCommunication languageCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalAuthenticator(LegalAuthenticator legalAuthenticator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legalAuthenticator, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(legalAuthenticator, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(legalAuthenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(legalAuthenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(legalAuthenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(legalAuthenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(legalAuthenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(legalAuthenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLegalAuthenticator_validateTypeCode(legalAuthenticator, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLegalAuthenticator_validateContextControlCode(legalAuthenticator, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalAuthenticator_validateContextControlCode(LegalAuthenticator legalAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return legalAuthenticator.validateContextControlCode(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalAuthenticator_validateTypeCode(LegalAuthenticator legalAuthenticator,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return legalAuthenticator.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(location, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(location, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(location, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(location, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(location, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(location, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(location, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(location, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateLocation_validateTypeCode(location, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation_validateTypeCode(Location location, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return location.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaintainedEntity(MaintainedEntity maintainedEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maintainedEntity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(maintainedEntity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(maintainedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(maintainedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(maintainedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(maintainedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(maintainedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(maintainedEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaintainedEntity_validateClassCode(maintainedEntity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Maintained Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaintainedEntity_validateClassCode(MaintainedEntity maintainedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maintainedEntity.validateClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturedProduct(ManufacturedProduct manufacturedProduct, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manufacturedProduct, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(manufacturedProduct, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(manufacturedProduct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(manufacturedProduct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(manufacturedProduct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(manufacturedProduct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(manufacturedProduct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(manufacturedProduct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(
				manufacturedProduct, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateManufacturedProduct_validateClassCode(manufacturedProduct, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturedProduct_validateClassCode(ManufacturedProduct manufacturedProduct,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manufacturedProduct.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateManufacturedDrugOrOtherMaterial constraint of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(
			ManufacturedProduct manufacturedProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manufacturedProduct.validateManufacturedDrugOrOtherMaterial(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial(Material material, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(material, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(material, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(material, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(material, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(material, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(material, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(material, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(material, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaterial_validateClassCode(material, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateMaterial_validateDeterminerCode(material, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial_validateClassCode(Material material, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return material.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial_validateDeterminerCode(Material material, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return material.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonXMLBody(NonXMLBody nonXMLBody, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nonXMLBody, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(nonXMLBody, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(nonXMLBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(nonXMLBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(nonXMLBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(nonXMLBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(nonXMLBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(nonXMLBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNonXMLBody_validateClassCode(nonXMLBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateNonXMLBody_validateMoodCode(nonXMLBody, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Non XML Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonXMLBody_validateClassCode(NonXMLBody nonXMLBody, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return nonXMLBody.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Non XML Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonXMLBody_validateMoodCode(NonXMLBody nonXMLBody, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return nonXMLBody.validateMoodCode(diagnostics, context);
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
	public boolean validateObservationMedia(ObservationMedia observationMedia, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationMedia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRange(ObservationRange observationRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(observationRange, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(observationRange, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(observationRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(observationRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(observationRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(observationRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(observationRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(observationRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateObservationRange_validateMoodCode(observationRange, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Observation Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationRange_validateMoodCode(ObservationRange observationRange,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return observationRange.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(order, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(order, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(order, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(order, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(order, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(order, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(order, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(order, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOrder_validateMoodCode(order, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder_validateMoodCode(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return order.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization(Organization organization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(organization, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(organization, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(organization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(organization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(organization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(organization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(organization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(organization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOrganization_validateClassCode(organization, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOrganization_validateDeterminerCode(organization, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization_validateClassCode(Organization organization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return organization.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganization_validateDeterminerCode(Organization organization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return organization.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationPartOf(OrganizationPartOf organizationPartOf, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(organizationPartOf, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(organizationPartOf, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(organizationPartOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(organizationPartOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(organizationPartOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(organizationPartOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(organizationPartOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(organizationPartOf, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateOrganizationPartOf_validateClassCode(organizationPartOf, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Organization Part Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationPartOf_validateClassCode(OrganizationPartOf organizationPartOf,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return organizationPartOf.validateClassCode(diagnostics, context);
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
	public boolean validateParentDocument(ParentDocument parentDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(parentDocument, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(parentDocument, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(parentDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(parentDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(parentDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(parentDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(parentDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(parentDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateParentDocument_validateClassCode(parentDocument, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateParentDocument_validateMoodCode(parentDocument, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Parent Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentDocument_validateClassCode(ParentDocument parentDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return parentDocument.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Parent Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParentDocument_validateMoodCode(ParentDocument parentDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return parentDocument.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant1(Participant1 participant1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(participant1, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(participant1, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(participant1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(participant1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(participant1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(participant1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(participant1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(participant1, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateParticipant1_validateContextControlCode(participant1, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Participant1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant1_validateContextControlCode(Participant1 participant1,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant1.validateContextControlCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant2(Participant2 participant2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(participant2, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(participant2, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(participant2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(participant2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(participant2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(participant2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(participant2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(participant2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateParticipant2_validateContextControlCode(participant2, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant2_validateContextControlCode(Participant2 participant2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant2.validateContextControlCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRole(ParticipantRole participantRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(participantRole, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(participantRole, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(participantRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(participantRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(participantRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(participantRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(participantRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(participantRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateParticipantRole_validatePlayingEntityChoice(participantRole, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validatePlayingEntityChoice constraint of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRole_validatePlayingEntityChoice(ParticipantRole participantRole,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participantRole.validatePlayingEntityChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient(Patient patient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patient, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(patient, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(patient, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(patient, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(patient, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(patient, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(patient, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(patient, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatient_validateClassCode(patient, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatient_validateDeterminerCode(patient, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient_validateClassCode(Patient patient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patient.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatient_validateDeterminerCode(Patient patient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patient.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRole(PatientRole patientRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientRole, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(patientRole, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(patientRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(patientRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(patientRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(patientRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(patientRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(patientRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePatientRole_validateClassCode(patientRole, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientRole_validateClassCode(PatientRole patientRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return patientRole.validateClassCode(diagnostics, context);
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
	public boolean validatePerformer2(Performer2 performer2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(performer2, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(performer2, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(performer2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(performer2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(performer2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(performer2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(performer2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(performer2, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePerformer2_validateTypeCode(performer2, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Performer2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformer2_validateTypeCode(Performer2 performer2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return performer2.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(person, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(person, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(person, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(person, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePerson_validateClassCode(person, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePerson_validateDeterminerCode(person, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_validateClassCode(Person person, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return person.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_validateDeterminerCode(Person person, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return person.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(place, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(place, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(place, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(place, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(place, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(place, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(place, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(place, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlace_validateClassCode(place, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlace_validateDeterminerCode(place, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace_validateClassCode(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return place.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace_validateDeterminerCode(Place place, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return place.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayingEntity(PlayingEntity playingEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(playingEntity, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(playingEntity, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(playingEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(playingEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(playingEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(playingEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(playingEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(playingEntity, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePlayingEntity_validateDeterminerCode(playingEntity, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayingEntity_validateDeterminerCode(PlayingEntity playingEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return playingEntity.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecondition(Precondition precondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(precondition, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(precondition, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(precondition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(precondition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(precondition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(precondition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(precondition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(precondition, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validatePrecondition_validateTypeCode(precondition, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrecondition_validateTypeCode(Precondition precondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return precondition.validateTypeCode(diagnostics, context);
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
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(product, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateProduct_validateTypeCode(product, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateTypeCode(Product product, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return product.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordTarget(RecordTarget recordTarget, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recordTarget, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(recordTarget, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(recordTarget, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(recordTarget, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(recordTarget, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(recordTarget, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(recordTarget, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(recordTarget, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRecordTarget_validateTypeCode(recordTarget, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRecordTarget_validateContextControlCode(recordTarget, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordTarget_validateContextControlCode(RecordTarget recordTarget,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recordTarget.validateContextControlCode(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordTarget_validateTypeCode(RecordTarget recordTarget, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return recordTarget.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reference, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(reference, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(reference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(reference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(reference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(reference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(reference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(reference, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReference_validateExternalActChoice(reference, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateExternalActChoice constraint of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference_validateExternalActChoice(Reference reference, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return reference.validateExternalActChoice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceRange(ReferenceRange referenceRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referenceRange, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(referenceRange, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(referenceRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(referenceRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(referenceRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(referenceRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(referenceRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(referenceRange, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateReferenceRange_validateTypeCode(referenceRange, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceRange_validateTypeCode(ReferenceRange referenceRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return referenceRange.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionOfInterest(RegionOfInterest regionOfInterest, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionOfInterest, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(regionOfInterest, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(regionOfInterest, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(regionOfInterest, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(regionOfInterest, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(regionOfInterest, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(regionOfInterest, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(regionOfInterest, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRegionOfInterest_validateClassCode(regionOfInterest, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateRegionOfInterest_validateMoodCode(regionOfInterest, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Region Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionOfInterest_validateClassCode(RegionOfInterest regionOfInterest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return regionOfInterest.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Region Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionOfInterest_validateMoodCode(RegionOfInterest regionOfInterest,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return regionOfInterest.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionOfInterestValue(RegionOfInterestValue regionOfInterestValue,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(regionOfInterestValue, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(regionOfInterestValue, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(regionOfInterestValue, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(regionOfInterestValue, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(regionOfInterestValue, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(regionOfInterestValue, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(regionOfInterestValue, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(regionOfInterestValue, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= datatypesValidator.validateINT_validateINT(regionOfInterestValue, diagnostics, context);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistryDelegate(RegistryDelegate registryDelegate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(registryDelegate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedDocument(RelatedDocument relatedDocument, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedDocument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedEntity(RelatedEntity relatedEntity, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedSubject(RelatedSubject relatedSubject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedSubject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibleParty(ResponsibleParty responsibleParty, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsibleParty, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(responsibleParty, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(responsibleParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(responsibleParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(responsibleParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(responsibleParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(responsibleParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(responsibleParty, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateResponsibleParty_validateTypeCode(responsibleParty, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsibleParty_validateTypeCode(ResponsibleParty responsibleParty,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return responsibleParty.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDTCPatient(SDTCPatient sdtcPatient, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sdtcPatient, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(section, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(section, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(section, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(section, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(section, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(section, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(section, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(section, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSection_validateClassCode(section, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSection_validateMoodCode(section, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection_validateClassCode(Section section, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return section.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection_validateMoodCode(Section section, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return section.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent(ServiceEvent serviceEvent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceEvent, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(serviceEvent, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(serviceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(serviceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(serviceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(serviceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(serviceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(serviceEvent, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateServiceEvent_validateMoodCode(serviceEvent, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent_validateMoodCode(ServiceEvent serviceEvent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return serviceEvent.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimen(Specimen specimen, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specimen, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(specimen, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(specimen, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(specimen, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(specimen, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(specimen, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(specimen, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(specimen, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSpecimen_validateTypeCode(specimen, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimen_validateTypeCode(Specimen specimen, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return specimen.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenRole(SpecimenRole specimenRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specimenRole, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(specimenRole, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(specimenRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(specimenRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(specimenRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(specimenRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(specimenRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(specimenRole, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSpecimenRole_validateClassCode(specimenRole, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Specimen Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecimenRole_validateClassCode(SpecimenRole specimenRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return specimenRole.validateClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrucDocText(StrucDocText strucDocText, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strucDocText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredBody(StructuredBody structuredBody, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(structuredBody, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(structuredBody, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(structuredBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(structuredBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(structuredBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(structuredBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(structuredBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(structuredBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStructuredBody_validateClassCode(structuredBody, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateStructuredBody_validateMoodCode(structuredBody, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Structured Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredBody_validateClassCode(StructuredBody structuredBody, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return structuredBody.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMoodCode constraint of '<em>Structured Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredBody_validateMoodCode(StructuredBody structuredBody, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return structuredBody.validateMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubject(Subject subject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subject, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(subject, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(subject, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(subject, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(subject, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(subject, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(subject, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(subject, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSubject_validateTypeCode(subject, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSubject_validateContextControlCode(subject, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateContextControlCode constraint of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubject_validateContextControlCode(Subject subject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return subject.validateContextControlCode(diagnostics, context);
	}

	/**
	 * Validates the validateTypeCode constraint of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubject_validateTypeCode(Subject subject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return subject.validateTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectPerson(SubjectPerson subjectPerson, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subjectPerson, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(subjectPerson, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(subjectPerson, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(subjectPerson, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(subjectPerson, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(subjectPerson, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(subjectPerson, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(subjectPerson, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSubjectPerson_validateClassCode(subjectPerson, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSubjectPerson_validateDeterminerCode(subjectPerson, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Subject Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectPerson_validateClassCode(SubjectPerson subjectPerson, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return subjectPerson.validateClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateDeterminerCode constraint of '<em>Subject Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectPerson_validateDeterminerCode(SubjectPerson subjectPerson,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subjectPerson.validateDeterminerCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceAdministration(SubstanceAdministration substanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(substanceAdministration, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(substanceAdministration, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(substanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(substanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(substanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(substanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(substanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(substanceAdministration, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSubstanceAdministration_validateClassCode(substanceAdministration, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceAdministration_validateClassCode(SubstanceAdministration substanceAdministration,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return substanceAdministration.validateClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupply(Supply supply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supply, diagnostics, context)) {
			return false;
		}
		boolean result = validate_EveryMultiplicityConforms(supply, diagnostics, context);
		if (result || diagnostics != null) {
			result &= validate_EveryDataValueConforms(supply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryReferenceIsContained(supply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryProxyResolves(supply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_UniqueID(supply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryKeyUnique(supply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validate_EveryMapEntryUnique(supply, diagnostics, context);
		}
		if (result || diagnostics != null) {
			result &= validateSupply_validateClassCode(supply, diagnostics, context);
		}
		return result;
	}

	/**
	 * Validates the validateClassCode constraint of '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupply_validateClassCode(Supply supply, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return supply.validateClassCode(diagnostics, context);
	}

} // CDAValidator
