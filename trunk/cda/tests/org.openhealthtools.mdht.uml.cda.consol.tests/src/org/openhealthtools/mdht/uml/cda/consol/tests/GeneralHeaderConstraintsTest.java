/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedCustodian;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Order;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsUSRealmPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints US Realm Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSupportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has Assigned Person Or Assigned Authoring Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraintsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsUSRealmAddress() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsUSRealmAddressTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsUSRealmAddress",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsUSRealmAddress(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsUSRealmAddressTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsUSRealmPatientName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsUSRealmPatientNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsUSRealmPatientName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsUSRealmPatientName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsUSRealmPatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTemplateId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRealmCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRealmCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRealmCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRealmCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRealmCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTypeId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTypeIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTypeId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

				target.setTypeId(CDAFactory.eINSTANCE.createInfrastructureRootTypeId());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setId(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTitle() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTitleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTitle",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTitle(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsEffectiveTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsEffectiveTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsEffectiveTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConfidentialityCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConfidentialityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setConfidentialityCode(DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConfidentialityCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConfidentialityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLanguageCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLanguageCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("value"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLanguageCodeTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated not
	// */
	// @Test
	// public void testValidateGeneralHeaderConstraintsLanguageCode() {
	// OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLanguageCodeTestCase = new
	// OperationsTestCase<GeneralHeaderConstraints>(
	// "validateGeneralHeaderConstraintsLanguageCode",
	// operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(GeneralHeaderConstraints target) {
	//
	// }
	//
	// @Override
	// protected void updateToPass(GeneralHeaderConstraints target) {
	// target.init();
	// target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS());
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCode(
	// (GeneralHeaderConstraints) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateGeneralHeaderConstraintsLanguageCodeTestCase.doValidationTest();
	// }

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsSetId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsSetIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsSetId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setSetId(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsSetIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsVersionNumber() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsVersionNumberTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsVersionNumber",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setVersionNumber(DatatypesFactory.eINSTANCE.createINT());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsVersionNumber(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsVersionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthor() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthor",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthor(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEnterer() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEnterer",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setDataEnterer(CDAFactory.eINSTANCE.createDataEnterer());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEnterer(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodian() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodian",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setCustodian(CDAFactory.eINSTANCE.createCustodian());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodian(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.getInformationRecipients().add(CDAFactory.eINSTANCE.createInformationRecipient());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticator() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticator",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setLegalAuthenticator(CDAFactory.eINSTANCE.createLegalAuthenticator());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticator(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticator() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticator",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.getAuthenticators().add(CDAFactory.eINSTANCE.createAuthenticator());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticator(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTarget() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.getRecordTargets().add(CDAFactory.eINSTANCE.createRecordTarget());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTarget(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOf() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponentOfTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOf(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformant() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformant",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.getInformants().add(CDAFactory.eINSTANCE.createInformant12());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformant(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsSupportParticipant() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsSupportParticipantTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsSupportParticipant",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSupportParticipant(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsSupportParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInFulfillmentOf() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInFulfillmentOfTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInFulfillmentOf",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				InFulfillmentOf iff = CDAFactory.eINSTANCE.createInFulfillmentOf();
				target.getInFulfillmentOfs().add(iff);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOf(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();

				aa.setAssignedAuthoringDevice(device);

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();

				device.setManufacturerModelName(DatatypesFactory.eINSTANCE.createSC());
				aa.setAssignedAuthoringDevice(device);

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();

				aa.setAssignedAuthoringDevice(device);

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();

				device.setSoftwareName(DatatypesFactory.eINSTANCE.createSC());
				aa.setAssignedAuthoringDevice(device);

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDeviceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						aa.setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				});

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				}

				);

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						aa.setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());
						target.getAuthors().add(author);
					}
				}

				);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));

				author.setAssignedAuthor(aa);
				aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				aa.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				aa.setCode(DatatypesFactory.eINSTANCE.createCE());
				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				aa.getIds().add(DatatypesFactory.eINSTANCE.createII());

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				aa.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthor() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				target.getAuthors().add(author);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthor(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);

				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDataEnterer().getAssignedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDataEnterer().getAssignedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);

				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDataEnterer().getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.101"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
				target.getDataEnterer().getAssignedEntity().getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDataEnterer().getAssignedEntity().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);

				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDataEnterer().getAssignedEntity().getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);

				target.setDataEnterer(de);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Person person = CDAFactory.eINSTANCE.createPerson();
				target.getDataEnterer().getAssignedEntity().setAssignedPerson(person);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(organization);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().getIds().add(
					DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(organization);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setAddr(
					DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(organization);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().getIds().add(
					DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(organization);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setName(
					DatatypesFactory.eINSTANCE.createON());
				;

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				ac.setRepresentedCustodianOrganization(organization);
				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getCustodian().getAssignedCustodian().getRepresentedCustodianOrganization().setTelecom(
					DatatypesFactory.eINSTANCE.createTEL());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();

				custodian.setAssignedCustodian(ac);
				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CustodianOrganization organization = CDAFactory.eINSTANCE.createCustodianOrganization();
				target.getCustodian().getAssignedCustodian().setRepresentedCustodianOrganization(organization);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodian() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodian",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian custodian = CDAFactory.eINSTANCE.createCustodian();

				target.setCustodian(custodian);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				target.getCustodian().setAssignedCustodian(ac);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodian(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				intended.setReceivedOrganization(organization);
				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformationRecipients().clear();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				organization.getNames().add(DatatypesFactory.eINSTANCE.createON());
				intended.setReceivedOrganization(organization);
				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();

				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformationRecipients().clear();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();
				Person person = CDAFactory.eINSTANCE.createPerson();
				intended.setInformationRecipient(person);
				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();

				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getInformationRecipients().clear();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				intended.setReceivedOrganization(organization);
				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformationRecipients().clear();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				intended.setReceivedOrganization(organization);
				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				la.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getLegalAuthenticator().getAssignedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				la.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getLegalAuthenticator().getAssignedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				la.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getLegalAuthenticator().getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("207X00000X", "2.16.840.1.113883.6.101"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				la.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getLegalAuthenticator().getAssignedEntity().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				la.setAssignedEntity(ae);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getLegalAuthenticator().getAssignedEntity().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				la.setAssignedEntity(ae);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Person person = CDAFactory.eINSTANCE.createPerson();

				target.getLegalAuthenticator().getAssignedEntity().setAssignedPerson(person);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getLegalAuthenticator().setTime(DatatypesFactory.eINSTANCE.createTS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getLegalAuthenticator().setSignatureCode(DatatypesFactory.eINSTANCE.createCS("S"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE());
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				target.getAuthenticators().add(authenticator);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				authenticator.setTime(DatatypesFactory.eINSTANCE.createTS());
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorSignatureCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorSignatureCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorSignatureCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				authenticator.setSignatureCode(DatatypesFactory.eINSTANCE.createCS("s"));
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorSignatureCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorSignatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				authenticator.setSignatureCode(DatatypesFactory.eINSTANCE.createCS("s"));
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				authenticator.setSignatureCode(DatatypesFactory.eINSTANCE.createCS("s"));
				target.getAuthenticators().add(authenticator);

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				authenticator.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				organization.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				guardian.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				guardian.setCode(DatatypesFactory.eINSTANCE.createCE("HUSB", "2.16.840.1.113883.5.111"));

				guardian.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				guardian.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				guardian.setGuardianPerson(CDAFactory.eINSTANCE.createPerson());
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYearTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("10"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("1980"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYearTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDayTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS());
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("19800101"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Birthplace birthplace = CDAFactory.eINSTANCE.createBirthplace();
				Place place = CDAFactory.eINSTANCE.createPlace();
				birthplace.setPlace(place);
				patient.setBirthplace(birthplace);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Birthplace birthplace = CDAFactory.eINSTANCE.createBirthplace();
				Place place = CDAFactory.eINSTANCE.createPlace();
				place.setAddr(DatatypesFactory.eINSTANCE.createAD());
				birthplace.setPlace(place);
				patient.setBirthplace(birthplace);
				pr.setPatient(patient);
				re.setPatientRole(pr);

				target.getRecordTargets().add(re);

				// patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole))
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Birthplace birthplace = CDAFactory.eINSTANCE.createBirthplace();
				Place place = CDAFactory.eINSTANCE.createPlace();
				patient.setBirthplace(birthplace);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Birthplace birthplace = CDAFactory.eINSTANCE.createBirthplace();
				Place place = CDAFactory.eINSTANCE.createPlace();
				birthplace.setPlace(place);
				patient.setBirthplace(birthplace);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceIndTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication languageCommunication = CDAFactory.eINSTANCE.createLanguageCommunication();

				patient.getLanguageCommunications().add(languageCommunication);

				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication languageCommunication = CDAFactory.eINSTANCE.createLanguageCommunication();
				languageCommunication.setPreferenceInd(DatatypesFactory.eINSTANCE.createBL(true));

				patient.getLanguageCommunications().add(languageCommunication);

				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication languageCommunication = CDAFactory.eINSTANCE.createLanguageCommunication();

				patient.getLanguageCommunications().add(languageCommunication);

				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication languageCommunication = CDAFactory.eINSTANCE.createLanguageCommunication();
				languageCommunication.setProficiencyLevelCode(DatatypesFactory.eINSTANCE.createCE(
					"E", "2.16.840.1.113883.6.1", "", ""));

				patient.getLanguageCommunications().add(languageCommunication);

				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication languageCommunication = CDAFactory.eINSTANCE.createLanguageCommunication();
				patient.getLanguageCommunications().add(languageCommunication);

				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication languageCommunication = CDAFactory.eINSTANCE.createLanguageCommunication();

				// 2.16.840.1.113883.5.60' and (value.code = 'ESGN'
				languageCommunication.setModeCode(DatatypesFactory.eINSTANCE.createCE(
					"ESGN", "2.16.840.1.113883.5.60", "", ""));
				patient.getLanguageCommunications().add(languageCommunication);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS());
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setEthnicGroupCode(DatatypesFactory.eINSTANCE.createCE());
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setMaritalStatusCode(DatatypesFactory.eINSTANCE.createCE("A", "2.16.840.1.113883.5.2"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			// Test for 0 ( lower bound) Marital Status
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.getRecordTargets().clear();
						RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						patient.setMaritalStatusCode(DatatypesFactory.eINSTANCE.createCE("A", "2.16.840.1.113883.5.2"));
						pr.setPatient(patient);
						re.setPatientRole(pr);
						target.getRecordTargets().add(re);
					}
				}

				);

			}

			// =======

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setRaceCode(DatatypesFactory.eINSTANCE.createCE("2058-6", "2.16.840.1.113883.6.238"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setReligiousAffiliationCode(DatatypesFactory.eINSTANCE.createCE(
					"1026", "2.16.840.1.113883.5.1076"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();

				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Birthplace birthplace = CDAFactory.eINSTANCE.createBirthplace();
				patient.setBirthplace(birthplace);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getLanguageCommunications().add(CDAFactory.eINSTANCE.createLanguageCommunication());
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				organization.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				organization.getIds().add(DatatypesFactory.eINSTANCE.createII());
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();

				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				organization.getNames().add(DatatypesFactory.eINSTANCE.createON());
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				re.setPatientRole(pr);
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				pr.setProviderOrganization(organization);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				organization.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				pr.setProviderOrganization(organization);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				patient.getLanguageCommunications().add(CDAFactory.eINSTANCE.createLanguageCommunication());
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				LanguageCommunication languageCommunication = CDAFactory.eINSTANCE.createLanguageCommunication();
				languageCommunication.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("code"));
				patient.getLanguageCommunications().add(languageCommunication);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRole() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();

				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRole(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Component1 value = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				value.setEncompassingEncounter(ee);
				target.setComponentOf(value);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOfEncompassingEncounterId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Component1 value = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				value.setEncompassingEncounter(ee);
				target.setComponentOf(value);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOfEncompassingEncounter() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponentOfEncompassingEncounterTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();

				Component1 value = CDAFactory.eINSTANCE.createComponent1();

				target.setComponentOf(value);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				target.getComponentOf().setEncompassingEncounter(ee);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ae.setCode(DatatypesFactory.eINSTANCE.createCE("207L00000X", "2.16.840.1.113883.6.101"));
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();

						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();

						target.getInformants().add(informant);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();

						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						informant.setAssignedEntity(ae);
						RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();

						informant.setRelatedEntity(re);

						target.getInformants().add(informant);

					}
				});

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();

						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						informant.setAssignedEntity(ae);

						target.getInformants().add(informant);

					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();

						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();

						RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();

						informant.setRelatedEntity(re);

						target.getInformants().add(informant);

					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						ae.setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
						ae.setScopingOrganization(CDAFactory.eINSTANCE.createOrganization());
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);
					}
				});

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						ae.setScopingOrganization(CDAFactory.eINSTANCE.createOrganization());
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						ae.setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();

				informant.setRelatedEntity(re);

				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				informant.setRelatedEntity(re);

				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();

				informant.setRelatedEntity(re);

				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.setRelatedPerson(CDAFactory.eINSTANCE.createPerson());

				informant.setRelatedEntity(re);

				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));

				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsParticipantSupportTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsParticipantSupportTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsParticipantSupportTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(participant);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getParticipants().clear();
				Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
				participant.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getParticipants().add(participant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsParticipantSupportTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsParticipantSupportTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInFulfillmentOfOrderId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInFulfillmentOfOrderIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInFulfillmentOfOrderId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				InFulfillmentOf iff = CDAFactory.eINSTANCE.createInFulfillmentOf();
				Order order = CDAFactory.eINSTANCE.createOrder();

				iff.setOrder(order);
				target.getInFulfillmentOfs().add(iff);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getInFulfillmentOfs().clear();
				InFulfillmentOf iff = CDAFactory.eINSTANCE.createInFulfillmentOf();
				Order order = CDAFactory.eINSTANCE.createOrder();
				order.getIds().add(DatatypesFactory.eINSTANCE.createII());

				iff.setOrder(order);
				target.getInFulfillmentOfs().add(iff);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOfOrderId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInFulfillmentOfOrder() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInFulfillmentOfOrderTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInFulfillmentOfOrder",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				InFulfillmentOf iff = CDAFactory.eINSTANCE.createInFulfillmentOf();

				target.getInFulfillmentOfs().add(iff);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getInFulfillmentOfs().clear();
				InFulfillmentOf iff = CDAFactory.eINSTANCE.createInFulfillmentOf();
				Order order = CDAFactory.eINSTANCE.createOrder();
				order.getIds().add(DatatypesFactory.eINSTANCE.createII());

				iff.setOrder(order);
				target.getInFulfillmentOfs().add(iff);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOfOrder(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralHeaderConstraintsOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints> {
		public GeneralHeaderConstraints create() {
			return ConsolFactory.eINSTANCE.createGeneralHeaderConstraints();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends GeneralHeaderConstraintsOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // GeneralHeaderConstraintsOperations
