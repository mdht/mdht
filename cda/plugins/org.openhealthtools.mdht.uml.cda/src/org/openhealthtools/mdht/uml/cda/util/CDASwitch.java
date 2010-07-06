/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.QTY;
import org.openhealthtools.mdht.uml.hl7.rim.ActRelationship;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage
 * @generated
 */
public class CDASwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDASwitch() {
		if (modelPackage == null) {
			modelPackage = CDAPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CDAPackage.CLINICAL_DOCUMENT: {
				ClinicalDocument clinicalDocument = (ClinicalDocument)theEObject;
				T result = caseClinicalDocument(clinicalDocument);
				if (result == null) result = caseRIM_Act(clinicalDocument);
				if (result == null) result = caseInfrastructureRoot(clinicalDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.INFRASTRUCTURE_ROOT_TYPE_ID: {
				InfrastructureRootTypeId infrastructureRootTypeId = (InfrastructureRootTypeId)theEObject;
				T result = caseInfrastructureRootTypeId(infrastructureRootTypeId);
				if (result == null) result = caseII(infrastructureRootTypeId);
				if (result == null) result = caseANY(infrastructureRootTypeId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.RECORD_TARGET: {
				RecordTarget recordTarget = (RecordTarget)theEObject;
				T result = caseRecordTarget(recordTarget);
				if (result == null) result = caseParticipation(recordTarget);
				if (result == null) result = caseInfrastructureRoot(recordTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PATIENT_ROLE: {
				PatientRole patientRole = (PatientRole)theEObject;
				T result = casePatientRole(patientRole);
				if (result == null) result = caseRole(patientRole);
				if (result == null) result = caseInfrastructureRoot(patientRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PATIENT: {
				Patient patient = (Patient)theEObject;
				T result = casePatient(patient);
				if (result == null) result = caseRIM_Entity(patient);
				if (result == null) result = caseInfrastructureRoot(patient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.GUARDIAN: {
				Guardian guardian = (Guardian)theEObject;
				T result = caseGuardian(guardian);
				if (result == null) result = caseRole(guardian);
				if (result == null) result = caseInfrastructureRoot(guardian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseRIM_Entity(person);
				if (result == null) result = caseInfrastructureRoot(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ORGANIZATION: {
				Organization organization = (Organization)theEObject;
				T result = caseOrganization(organization);
				if (result == null) result = caseRIM_Entity(organization);
				if (result == null) result = caseInfrastructureRoot(organization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ORGANIZATION_PART_OF: {
				OrganizationPartOf organizationPartOf = (OrganizationPartOf)theEObject;
				T result = caseOrganizationPartOf(organizationPartOf);
				if (result == null) result = caseRole(organizationPartOf);
				if (result == null) result = caseInfrastructureRoot(organizationPartOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.BIRTHPLACE: {
				Birthplace birthplace = (Birthplace)theEObject;
				T result = caseBirthplace(birthplace);
				if (result == null) result = caseRole(birthplace);
				if (result == null) result = caseInfrastructureRoot(birthplace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PLACE: {
				Place place = (Place)theEObject;
				T result = casePlace(place);
				if (result == null) result = caseRIM_Entity(place);
				if (result == null) result = caseInfrastructureRoot(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.LANGUAGE_COMMUNICATION: {
				LanguageCommunication languageCommunication = (LanguageCommunication)theEObject;
				T result = caseLanguageCommunication(languageCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.AUTHOR: {
				Author author = (Author)theEObject;
				T result = caseAuthor(author);
				if (result == null) result = caseParticipation(author);
				if (result == null) result = caseInfrastructureRoot(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ASSIGNED_AUTHOR: {
				AssignedAuthor assignedAuthor = (AssignedAuthor)theEObject;
				T result = caseAssignedAuthor(assignedAuthor);
				if (result == null) result = caseRole(assignedAuthor);
				if (result == null) result = caseInfrastructureRoot(assignedAuthor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.AUTHORING_DEVICE: {
				AuthoringDevice authoringDevice = (AuthoringDevice)theEObject;
				T result = caseAuthoringDevice(authoringDevice);
				if (result == null) result = caseRIM_Entity(authoringDevice);
				if (result == null) result = caseInfrastructureRoot(authoringDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.MAINTAINED_ENTITY: {
				MaintainedEntity maintainedEntity = (MaintainedEntity)theEObject;
				T result = caseMaintainedEntity(maintainedEntity);
				if (result == null) result = caseRole(maintainedEntity);
				if (result == null) result = caseInfrastructureRoot(maintainedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.DATA_ENTERER: {
				DataEnterer dataEnterer = (DataEnterer)theEObject;
				T result = caseDataEnterer(dataEnterer);
				if (result == null) result = caseParticipation(dataEnterer);
				if (result == null) result = caseInfrastructureRoot(dataEnterer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ASSIGNED_ENTITY: {
				AssignedEntity assignedEntity = (AssignedEntity)theEObject;
				T result = caseAssignedEntity(assignedEntity);
				if (result == null) result = caseRole(assignedEntity);
				if (result == null) result = caseInfrastructureRoot(assignedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SDTC_PATIENT: {
				SDTCPatient sdtcPatient = (SDTCPatient)theEObject;
				T result = caseSDTCPatient(sdtcPatient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.INFORMANT12: {
				Informant12 informant12 = (Informant12)theEObject;
				T result = caseInformant12(informant12);
				if (result == null) result = caseParticipation(informant12);
				if (result == null) result = caseInfrastructureRoot(informant12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.RELATED_ENTITY: {
				RelatedEntity relatedEntity = (RelatedEntity)theEObject;
				T result = caseRelatedEntity(relatedEntity);
				if (result == null) result = caseRole(relatedEntity);
				if (result == null) result = caseInfrastructureRoot(relatedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.CUSTODIAN: {
				Custodian custodian = (Custodian)theEObject;
				T result = caseCustodian(custodian);
				if (result == null) result = caseParticipation(custodian);
				if (result == null) result = caseInfrastructureRoot(custodian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ASSIGNED_CUSTODIAN: {
				AssignedCustodian assignedCustodian = (AssignedCustodian)theEObject;
				T result = caseAssignedCustodian(assignedCustodian);
				if (result == null) result = caseRole(assignedCustodian);
				if (result == null) result = caseInfrastructureRoot(assignedCustodian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.CUSTODIAN_ORGANIZATION: {
				CustodianOrganization custodianOrganization = (CustodianOrganization)theEObject;
				T result = caseCustodianOrganization(custodianOrganization);
				if (result == null) result = caseRIM_Entity(custodianOrganization);
				if (result == null) result = caseInfrastructureRoot(custodianOrganization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.INFORMATION_RECIPIENT: {
				InformationRecipient informationRecipient = (InformationRecipient)theEObject;
				T result = caseInformationRecipient(informationRecipient);
				if (result == null) result = caseParticipation(informationRecipient);
				if (result == null) result = caseInfrastructureRoot(informationRecipient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.INTENDED_RECIPIENT: {
				IntendedRecipient intendedRecipient = (IntendedRecipient)theEObject;
				T result = caseIntendedRecipient(intendedRecipient);
				if (result == null) result = caseRole(intendedRecipient);
				if (result == null) result = caseInfrastructureRoot(intendedRecipient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.LEGAL_AUTHENTICATOR: {
				LegalAuthenticator legalAuthenticator = (LegalAuthenticator)theEObject;
				T result = caseLegalAuthenticator(legalAuthenticator);
				if (result == null) result = caseParticipation(legalAuthenticator);
				if (result == null) result = caseInfrastructureRoot(legalAuthenticator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.AUTHENTICATOR: {
				Authenticator authenticator = (Authenticator)theEObject;
				T result = caseAuthenticator(authenticator);
				if (result == null) result = caseParticipation(authenticator);
				if (result == null) result = caseInfrastructureRoot(authenticator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PARTICIPANT1: {
				Participant1 participant1 = (Participant1)theEObject;
				T result = caseParticipant1(participant1);
				if (result == null) result = caseParticipation(participant1);
				if (result == null) result = caseInfrastructureRoot(participant1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ASSOCIATED_ENTITY: {
				AssociatedEntity associatedEntity = (AssociatedEntity)theEObject;
				T result = caseAssociatedEntity(associatedEntity);
				if (result == null) result = caseRole(associatedEntity);
				if (result == null) result = caseInfrastructureRoot(associatedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.IN_FULFILLMENT_OF: {
				InFulfillmentOf inFulfillmentOf = (InFulfillmentOf)theEObject;
				T result = caseInFulfillmentOf(inFulfillmentOf);
				if (result == null) result = caseActRelationship(inFulfillmentOf);
				if (result == null) result = caseInfrastructureRoot(inFulfillmentOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = caseRIM_Act(order);
				if (result == null) result = caseInfrastructureRoot(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.DOCUMENTATION_OF: {
				DocumentationOf documentationOf = (DocumentationOf)theEObject;
				T result = caseDocumentationOf(documentationOf);
				if (result == null) result = caseActRelationship(documentationOf);
				if (result == null) result = caseInfrastructureRoot(documentationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SERVICE_EVENT: {
				ServiceEvent serviceEvent = (ServiceEvent)theEObject;
				T result = caseServiceEvent(serviceEvent);
				if (result == null) result = caseRIM_Act(serviceEvent);
				if (result == null) result = caseInfrastructureRoot(serviceEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PERFORMER1: {
				Performer1 performer1 = (Performer1)theEObject;
				T result = casePerformer1(performer1);
				if (result == null) result = caseParticipation(performer1);
				if (result == null) result = caseInfrastructureRoot(performer1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.RELATED_DOCUMENT: {
				RelatedDocument relatedDocument = (RelatedDocument)theEObject;
				T result = caseRelatedDocument(relatedDocument);
				if (result == null) result = caseActRelationship(relatedDocument);
				if (result == null) result = caseInfrastructureRoot(relatedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PARENT_DOCUMENT: {
				ParentDocument parentDocument = (ParentDocument)theEObject;
				T result = caseParentDocument(parentDocument);
				if (result == null) result = caseRIM_Act(parentDocument);
				if (result == null) result = caseInfrastructureRoot(parentDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.AUTHORIZATION: {
				Authorization authorization = (Authorization)theEObject;
				T result = caseAuthorization(authorization);
				if (result == null) result = caseActRelationship(authorization);
				if (result == null) result = caseInfrastructureRoot(authorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.CONSENT: {
				Consent consent = (Consent)theEObject;
				T result = caseConsent(consent);
				if (result == null) result = caseRIM_Act(consent);
				if (result == null) result = caseInfrastructureRoot(consent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.COMPONENT1: {
				Component1 component1 = (Component1)theEObject;
				T result = caseComponent1(component1);
				if (result == null) result = caseActRelationship(component1);
				if (result == null) result = caseInfrastructureRoot(component1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ENCOMPASSING_ENCOUNTER: {
				EncompassingEncounter encompassingEncounter = (EncompassingEncounter)theEObject;
				T result = caseEncompassingEncounter(encompassingEncounter);
				if (result == null) result = caseRIM_Act(encompassingEncounter);
				if (result == null) result = caseInfrastructureRoot(encompassingEncounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.RESPONSIBLE_PARTY: {
				ResponsibleParty responsibleParty = (ResponsibleParty)theEObject;
				T result = caseResponsibleParty(responsibleParty);
				if (result == null) result = caseParticipation(responsibleParty);
				if (result == null) result = caseInfrastructureRoot(responsibleParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ENCOUNTER_PARTICIPANT: {
				EncounterParticipant encounterParticipant = (EncounterParticipant)theEObject;
				T result = caseEncounterParticipant(encounterParticipant);
				if (result == null) result = caseParticipation(encounterParticipant);
				if (result == null) result = caseInfrastructureRoot(encounterParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseParticipation(location);
				if (result == null) result = caseInfrastructureRoot(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.HEALTH_CARE_FACILITY: {
				HealthCareFacility healthCareFacility = (HealthCareFacility)theEObject;
				T result = caseHealthCareFacility(healthCareFacility);
				if (result == null) result = caseRole(healthCareFacility);
				if (result == null) result = caseInfrastructureRoot(healthCareFacility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.COMPONENT2: {
				Component2 component2 = (Component2)theEObject;
				T result = caseComponent2(component2);
				if (result == null) result = caseActRelationship(component2);
				if (result == null) result = caseInfrastructureRoot(component2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.NON_XML_BODY: {
				NonXMLBody nonXMLBody = (NonXMLBody)theEObject;
				T result = caseNonXMLBody(nonXMLBody);
				if (result == null) result = caseRIM_Act(nonXMLBody);
				if (result == null) result = caseInfrastructureRoot(nonXMLBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.STRUCTURED_BODY: {
				StructuredBody structuredBody = (StructuredBody)theEObject;
				T result = caseStructuredBody(structuredBody);
				if (result == null) result = caseRIM_Act(structuredBody);
				if (result == null) result = caseInfrastructureRoot(structuredBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.COMPONENT3: {
				Component3 component3 = (Component3)theEObject;
				T result = caseComponent3(component3);
				if (result == null) result = caseActRelationship(component3);
				if (result == null) result = caseInfrastructureRoot(component3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseRIM_Act(section);
				if (result == null) result = caseInfrastructureRoot(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.STRUC_DOC_TEXT: {
				StrucDocText strucDocText = (StrucDocText)theEObject;
				T result = caseStrucDocText(strucDocText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SUBJECT: {
				Subject subject = (Subject)theEObject;
				T result = caseSubject(subject);
				if (result == null) result = caseParticipation(subject);
				if (result == null) result = caseInfrastructureRoot(subject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.RELATED_SUBJECT: {
				RelatedSubject relatedSubject = (RelatedSubject)theEObject;
				T result = caseRelatedSubject(relatedSubject);
				if (result == null) result = caseRole(relatedSubject);
				if (result == null) result = caseInfrastructureRoot(relatedSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SUBJECT_PERSON: {
				SubjectPerson subjectPerson = (SubjectPerson)theEObject;
				T result = caseSubjectPerson(subjectPerson);
				if (result == null) result = caseRIM_Entity(subjectPerson);
				if (result == null) result = caseInfrastructureRoot(subjectPerson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ENTRY: {
				Entry entry = (Entry)theEObject;
				T result = caseEntry(entry);
				if (result == null) result = caseActRelationship(entry);
				if (result == null) result = caseInfrastructureRoot(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ACT: {
				Act act = (Act)theEObject;
				T result = caseAct(act);
				if (result == null) result = caseClinicalStatement(act);
				if (result == null) result = caseRIM_Act(act);
				if (result == null) result = caseInfrastructureRoot(act);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.CLINICAL_STATEMENT: {
				ClinicalStatement clinicalStatement = (ClinicalStatement)theEObject;
				T result = caseClinicalStatement(clinicalStatement);
				if (result == null) result = caseRIM_Act(clinicalStatement);
				if (result == null) result = caseInfrastructureRoot(clinicalStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SPECIMEN: {
				Specimen specimen = (Specimen)theEObject;
				T result = caseSpecimen(specimen);
				if (result == null) result = caseParticipation(specimen);
				if (result == null) result = caseInfrastructureRoot(specimen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SPECIMEN_ROLE: {
				SpecimenRole specimenRole = (SpecimenRole)theEObject;
				T result = caseSpecimenRole(specimenRole);
				if (result == null) result = caseRole(specimenRole);
				if (result == null) result = caseInfrastructureRoot(specimenRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PLAYING_ENTITY: {
				PlayingEntity playingEntity = (PlayingEntity)theEObject;
				T result = casePlayingEntity(playingEntity);
				if (result == null) result = caseRIM_Entity(playingEntity);
				if (result == null) result = caseInfrastructureRoot(playingEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PERFORMER2: {
				Performer2 performer2 = (Performer2)theEObject;
				T result = casePerformer2(performer2);
				if (result == null) result = caseParticipation(performer2);
				if (result == null) result = caseInfrastructureRoot(performer2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PARTICIPANT2: {
				Participant2 participant2 = (Participant2)theEObject;
				T result = caseParticipant2(participant2);
				if (result == null) result = caseParticipation(participant2);
				if (result == null) result = caseInfrastructureRoot(participant2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PARTICIPANT_ROLE: {
				ParticipantRole participantRole = (ParticipantRole)theEObject;
				T result = caseParticipantRole(participantRole);
				if (result == null) result = caseRole(participantRole);
				if (result == null) result = caseInfrastructureRoot(participantRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = caseRIM_Entity(device);
				if (result == null) result = caseInfrastructureRoot(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseRIM_Entity(entity);
				if (result == null) result = caseInfrastructureRoot(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ENTRY_RELATIONSHIP: {
				EntryRelationship entryRelationship = (EntryRelationship)theEObject;
				T result = caseEntryRelationship(entryRelationship);
				if (result == null) result = caseActRelationship(entryRelationship);
				if (result == null) result = caseInfrastructureRoot(entryRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseClinicalStatement(encounter);
				if (result == null) result = caseRIM_Act(encounter);
				if (result == null) result = caseInfrastructureRoot(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseActRelationship(reference);
				if (result == null) result = caseInfrastructureRoot(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.EXTERNAL_ACT: {
				ExternalAct externalAct = (ExternalAct)theEObject;
				T result = caseExternalAct(externalAct);
				if (result == null) result = caseRIM_Act(externalAct);
				if (result == null) result = caseInfrastructureRoot(externalAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.EXTERNAL_OBSERVATION: {
				ExternalObservation externalObservation = (ExternalObservation)theEObject;
				T result = caseExternalObservation(externalObservation);
				if (result == null) result = caseRIM_Act(externalObservation);
				if (result == null) result = caseInfrastructureRoot(externalObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.EXTERNAL_PROCEDURE: {
				ExternalProcedure externalProcedure = (ExternalProcedure)theEObject;
				T result = caseExternalProcedure(externalProcedure);
				if (result == null) result = caseRIM_Act(externalProcedure);
				if (result == null) result = caseInfrastructureRoot(externalProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.EXTERNAL_DOCUMENT: {
				ExternalDocument externalDocument = (ExternalDocument)theEObject;
				T result = caseExternalDocument(externalDocument);
				if (result == null) result = caseRIM_Act(externalDocument);
				if (result == null) result = caseInfrastructureRoot(externalDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PRECONDITION: {
				Precondition precondition = (Precondition)theEObject;
				T result = casePrecondition(precondition);
				if (result == null) result = caseActRelationship(precondition);
				if (result == null) result = caseInfrastructureRoot(precondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.CRITERION: {
				Criterion criterion = (Criterion)theEObject;
				T result = caseCriterion(criterion);
				if (result == null) result = caseRIM_Act(criterion);
				if (result == null) result = caseInfrastructureRoot(criterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = caseClinicalStatement(observation);
				if (result == null) result = caseRIM_Act(observation);
				if (result == null) result = caseInfrastructureRoot(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.REFERENCE_RANGE: {
				ReferenceRange referenceRange = (ReferenceRange)theEObject;
				T result = caseReferenceRange(referenceRange);
				if (result == null) result = caseActRelationship(referenceRange);
				if (result == null) result = caseInfrastructureRoot(referenceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.OBSERVATION_RANGE: {
				ObservationRange observationRange = (ObservationRange)theEObject;
				T result = caseObservationRange(observationRange);
				if (result == null) result = caseRIM_Act(observationRange);
				if (result == null) result = caseInfrastructureRoot(observationRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.OBSERVATION_MEDIA: {
				ObservationMedia observationMedia = (ObservationMedia)theEObject;
				T result = caseObservationMedia(observationMedia);
				if (result == null) result = caseClinicalStatement(observationMedia);
				if (result == null) result = caseRIM_Act(observationMedia);
				if (result == null) result = caseInfrastructureRoot(observationMedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.ORGANIZER: {
				Organizer organizer = (Organizer)theEObject;
				T result = caseOrganizer(organizer);
				if (result == null) result = caseClinicalStatement(organizer);
				if (result == null) result = caseRIM_Act(organizer);
				if (result == null) result = caseInfrastructureRoot(organizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.COMPONENT4: {
				Component4 component4 = (Component4)theEObject;
				T result = caseComponent4(component4);
				if (result == null) result = caseActRelationship(component4);
				if (result == null) result = caseInfrastructureRoot(component4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseClinicalStatement(procedure);
				if (result == null) result = caseRIM_Act(procedure);
				if (result == null) result = caseInfrastructureRoot(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.REGION_OF_INTEREST: {
				RegionOfInterest regionOfInterest = (RegionOfInterest)theEObject;
				T result = caseRegionOfInterest(regionOfInterest);
				if (result == null) result = caseClinicalStatement(regionOfInterest);
				if (result == null) result = caseRIM_Act(regionOfInterest);
				if (result == null) result = caseInfrastructureRoot(regionOfInterest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.REGION_OF_INTEREST_VALUE: {
				RegionOfInterestValue regionOfInterestValue = (RegionOfInterestValue)theEObject;
				T result = caseRegionOfInterestValue(regionOfInterestValue);
				if (result == null) result = caseINT(regionOfInterestValue);
				if (result == null) result = caseQTY(regionOfInterestValue);
				if (result == null) result = caseANY(regionOfInterestValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SUBSTANCE_ADMINISTRATION: {
				SubstanceAdministration substanceAdministration = (SubstanceAdministration)theEObject;
				T result = caseSubstanceAdministration(substanceAdministration);
				if (result == null) result = caseClinicalStatement(substanceAdministration);
				if (result == null) result = caseRIM_Act(substanceAdministration);
				if (result == null) result = caseInfrastructureRoot(substanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.CONSUMABLE: {
				Consumable consumable = (Consumable)theEObject;
				T result = caseConsumable(consumable);
				if (result == null) result = caseParticipation(consumable);
				if (result == null) result = caseInfrastructureRoot(consumable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.MANUFACTURED_PRODUCT: {
				ManufacturedProduct manufacturedProduct = (ManufacturedProduct)theEObject;
				T result = caseManufacturedProduct(manufacturedProduct);
				if (result == null) result = caseRole(manufacturedProduct);
				if (result == null) result = caseInfrastructureRoot(manufacturedProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.LABELED_DRUG: {
				LabeledDrug labeledDrug = (LabeledDrug)theEObject;
				T result = caseLabeledDrug(labeledDrug);
				if (result == null) result = caseRIM_Entity(labeledDrug);
				if (result == null) result = caseInfrastructureRoot(labeledDrug);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.MATERIAL: {
				Material material = (Material)theEObject;
				T result = caseMaterial(material);
				if (result == null) result = caseRIM_Entity(material);
				if (result == null) result = caseInfrastructureRoot(material);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.SUPPLY: {
				Supply supply = (Supply)theEObject;
				T result = caseSupply(supply);
				if (result == null) result = caseClinicalStatement(supply);
				if (result == null) result = caseRIM_Act(supply);
				if (result == null) result = caseInfrastructureRoot(supply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseParticipation(product);
				if (result == null) result = caseInfrastructureRoot(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.COMPONENT5: {
				Component5 component5 = (Component5)theEObject;
				T result = caseComponent5(component5);
				if (result == null) result = caseActRelationship(component5);
				if (result == null) result = caseInfrastructureRoot(component5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDAPackage.REGISTRY_DELEGATE: {
				RegistryDelegate registryDelegate = (RegistryDelegate)theEObject;
				T result = caseRegistryDelegate(registryDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root Type Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root Type Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRootTypeId(InfrastructureRootTypeId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTarget(RecordTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientRole(PatientRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardian(Guardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganization(Organization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Part Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Part Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationPartOf(OrganizationPartOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Birthplace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Birthplace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBirthplace(Birthplace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageCommunication(LanguageCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedAuthor(AssignedAuthor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authoring Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authoring Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthoringDevice(AuthoringDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintained Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintained Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainedEntity(MaintainedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Enterer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataEnterer(DataEnterer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedEntity(AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SDTC Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SDTC Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDTCPatient(SDTCPatient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informant12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informant12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformant12(Informant12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedEntity(RelatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodian(Custodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Custodian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Custodian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedCustodian(AssignedCustodian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodian Organization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodian Organization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodianOrganization(CustodianOrganization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationRecipient(InformationRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intended Recipient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intended Recipient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntendedRecipient(IntendedRecipient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalAuthenticator(LegalAuthenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authenticator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticator(Authenticator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant1(Participant1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Associated Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Associated Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociatedEntity(AssociatedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Fulfillment Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Fulfillment Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInFulfillmentOf(InFulfillmentOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationOf(DocumentationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceEvent(ServiceEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer1(Performer1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedDocument(RelatedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentDocument(ParentDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorization(Authorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsent(Consent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent1(Component1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encompassing Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encompassing Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncompassingEncounter(EncompassingEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsible Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsibleParty(ResponsibleParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterParticipant(EncounterParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Care Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Care Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthCareFacility(HealthCareFacility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent2(Component2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non XML Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non XML Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonXMLBody(NonXMLBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredBody(StructuredBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent3(Component3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struc Doc Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struc Doc Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrucDocText(StrucDocText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedSubject(RelatedSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectPerson(SubjectPerson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimen(Specimen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specimen Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specimen Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecimenRole(SpecimenRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Playing Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Playing Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayingEntity(PlayingEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performer2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer2(Performer2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant2(Participant2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRole(ParticipantRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryRelationship(EntryRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalAct(ExternalAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalObservation(ExternalObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalProcedure(ExternalProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocument(ExternalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecondition(Precondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterion(Criterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceRange(ReferenceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationRange(ObservationRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationMedia(ObservationMedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent4(Component4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Of Interest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionOfInterest(RegionOfInterest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Of Interest Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Of Interest Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionOfInterestValue(RegionOfInterestValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAdministration(SubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumable(Consumable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturedProduct(ManufacturedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Drug</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Drug</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledDrug(LabeledDrug object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupply(Supply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent5(Component5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistryDelegate(RegistryDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRIM_Act(org.openhealthtools.mdht.uml.hl7.rim.Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANY(ANY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>II</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>II</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseII(II object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRIM_Entity(org.openhealthtools.mdht.uml.hl7.rim.Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActRelationship(ActRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QTY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QTY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQTY(QTY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINT(INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CDASwitch
