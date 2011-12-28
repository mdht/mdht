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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Consol Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Consol Authoring Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Consol Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Consol Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Consol Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Consol Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConsolAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Consol Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Data Enterer Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedDataEntererCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Data Enterer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedDataEntererId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Data Enterer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Data Enterer Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Consol Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Consol Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Consol Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Consol Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Consol Assigned Custodian Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConsolCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Consol Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Consol Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Consol Intended Recipient Recieved Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConsolLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Consol Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConsolAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Consol Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConsolAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Consol Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Consol Guardian Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Consol Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Consol Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Consol Place Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Consol Birthplace Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Consol Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Consol Language Communication Mode Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Consol Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Consol Patient Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Consol Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Consol Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Consol Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Consol Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Consol Patient Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Consol Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Consol Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Consol Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Consol Patient Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConsolRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Consol Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Consol Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Consol Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedInformantAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Informant Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedInformantCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Informant Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedInformantId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Informant Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfConsolOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Consol Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConsolInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Consol In Fulfillment Of Order</em>}</li>
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLanguageCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLanguageCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
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
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceManufacturerModelNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorConsolAuthoringDeviceSoftwareNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_CONSOL_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_CONSOL_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorConsolAssignedAuthorId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_CONSOL_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_CONSOL_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorConsolAssignedAuthorTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConsolAuthorAssignedAuthor() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConsolAuthorAssignedAuthorTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConsolAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONSOL_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolAuthorAssignedAuthor(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConsolAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_DATA_ENTERER_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedDataEntererCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedDataEntererCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedDataEntererCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_DATA_ENTERER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedDataEntererCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedDataEntererId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedDataEntererIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedDataEntererId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_DATA_ENTERER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedDataEntererIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_DATA_ENTERER_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedDataEntererTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedDataEntererAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianConsolCustodianOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_CONSOL_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianConsolAssignedCustodianCustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConsolCustodianAssignedCustodian() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConsolCustodianAssignedCustodianTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConsolCustodianAssignedCustodian",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONSOL_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolCustodianAssignedCustodian(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConsolCustodianAssignedCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_CONSOL_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_CONSOL_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientConsolIntendedRecipientRecievedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConsolLegalAuthenticatorTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConsolLegalAuthenticatorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConsolLegalAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONSOL_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolLegalAuthenticatorTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConsolLegalAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConsolAuthenticatorTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConsolAuthenticatorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConsolAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONSOL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolAuthenticatorTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConsolAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConsolAuthenticatorSignatureCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConsolAuthenticatorSignatureCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConsolAuthenticatorSignatureCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONSOL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolAuthenticatorSignatureCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConsolAuthenticatorSignatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolGuardianGuardianPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTHPLACE_CONSOL_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplaceConsolPlaceAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlace() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlaceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlace",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_CONSOL_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlace(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolBirthplacePlaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceInd() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceIndTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceInd",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceInd(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationPreferenceIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientConsolLanguageCommunicationModeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_CONSOL_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_CONSOL_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientEthnicGroupCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_CONSOL_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_CONSOL_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientReligiousAffiliationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardian() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardianTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardian",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_CONSOL_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardian(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientGuardianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplace() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplaceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplace",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_CONSOL_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplace(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientBirthplaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunication() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunicationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunication",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_CONSOL_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunication(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleConsolPatientLanguageCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_CONSOL_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetConsolPatientRoleId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_CONSOL_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecom() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecomTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_CONSOL_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecom(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetConsolPatientRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatient() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_CONSOL_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetConsolPatientRolePatientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConsolRecordTargetPatientRole() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConsolRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConsolRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONSOL_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolRecordTargetPatientRole(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConsolRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_CONSOL_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_CONSOL_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfConsolEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOfEncompassingEncounter() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsComponentOfEncompassingEncounterTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	public void testValidateGeneralHeaderConstraintsInformantAssignedInformantAddr() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedInformantAddrTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedInformantAddr",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedInformantAddr(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedInformantAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedInformantCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedInformantCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedInformantCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedInformantCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedInformantCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedInformantId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedInformantIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedInformantId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_INFORMANT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedInformantId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedInformantIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsParticipantSupportTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsParticipantSupportTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsParticipantSupportTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsParticipantSupportTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsParticipantSupportTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInFulfillmentOfConsolOrderId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInFulfillmentOfConsolOrderIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInFulfillmentOfConsolOrderId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF_CONSOL_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInFulfillmentOfConsolOrderId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInFulfillmentOfConsolOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConsolInFulfillmentOfOrder() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConsolInFulfillmentOfOrderTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConsolInFulfillmentOfOrder",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONSOL_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConsolInFulfillmentOfOrder(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConsolInFulfillmentOfOrderTestCase.doValidationTest();
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
