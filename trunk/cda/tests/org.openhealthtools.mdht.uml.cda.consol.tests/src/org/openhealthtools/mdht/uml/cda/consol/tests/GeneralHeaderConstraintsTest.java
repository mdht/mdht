/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.Authorization;
import org.openhealthtools.mdht.uml.cda.Birthplace;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.Consent;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Order;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.Place;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsVersionNumberSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Version Number Set Id</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient US Realm Patient Name Mixed Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient US Realm Patient Name Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient US Realm Patient Name Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient US Realm Patient Name Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient US Realm Patient Name Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient US Realm Patient Name Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient US Realm Patient Name Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Mode Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Marital Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient SDTC Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has Assigned Person Or Assigned Authoring Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Assigned Authoring Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient Recieved Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Has Assigned Entity Or Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsParticipantSupportTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Participant Support Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer1 Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization Consent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraintsTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTypeIdRoot() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTypeIdRootTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTypeIdRoot",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				InfrastructureRootTypeId typeid = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
				typeid.setRoot("2.16.840.1.113883.1.3");
				typeid.setExtension("POCD_HD000040");
				target.setTypeId(typeid);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeIdRoot(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTypeIdRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTypeIdExtension() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTypeIdExtensionTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTypeIdExtension",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				InfrastructureRootTypeId typeid = CDAFactory.eINSTANCE.createInfrastructureRootTypeId();
				typeid.setRoot("2.16.840.1.113883.1.3");
				typeid.setExtension("POCD_HD000040");
				target.setTypeId(typeid);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeIdExtension(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTypeIdExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsSetIdVersionNumber() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsSetIdVersionNumberTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsSetIdVersionNumber",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				target.setSetId(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.setVersionNumber(DatatypesFactory.eINSTANCE.createINT());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdVersionNumber(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsSetIdVersionNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsVersionNumberSetId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsVersionNumberSetIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsVersionNumberSetId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_VERSION_NUMBER_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				target.setVersionNumber(DatatypesFactory.eINSTANCE.createINT());
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.setSetId(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsVersionNumberSetId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsVersionNumberSetIdTestCase.doValidationTest();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsConfidentialityCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConfidentialityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.setConfidentialityCode(DatatypesFactory.eINSTANCE.createCE("V", "2.16.840.1.113883.5.25"));

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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOf() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOf(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				target.getAuthorizations().add(CDAFactory.eINSTANCE.createAuthorization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						pr.getAddrs().add(ad);
						rt.setPatientRole(pr);
						target.getRecordTargets().add(rt);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						pr.getAddrs().add(ad);
						rt.setPatientRole(pr);
						target.getRecordTargets().add(rt);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(createUSRealmAddress());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(createUSRealmAddress());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(createUSRealmAddress());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(createUSRealmAddress());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(createUSRealmAddress());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getAddrs().add(createUSRealmAddress());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				pr.getAddrs().add(ad);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(PostalAddressUse.HP);
				pr.getAddrs().add(ad);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				pr.getAddrs().add(ad);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(PostalAddressUse.HP);
				pr.getAddrs().add(ad);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				pr.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				pr.getTelecoms().add(tel);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContentTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				name.addText("12");
				pat.getNames().add(name);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				pat.getNames().add(createUSRealmPatientName());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContent(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameMixedContentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamilyTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				pat.getNames().add(name);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				pat.getNames().add(createUSRealmPatientName());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamily(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameFamilyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGivenTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				pat.getNames().add(name);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				pat.getNames().add(createUSRealmPatientName());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGiven(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameGivenTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefixTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				pat.getNames().add(name);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				pat.getNames().add(createUSRealmPatientName());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefix(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNamePrefixTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffixTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				pat.getNames().add(name);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				pat.getNames().add(createUSRealmPatientName());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffix(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameSuffixTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				pat.getNames().add(name);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				pat.getNames().add(createUSRealmPatientName());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				PN name = DatatypesFactory.eINSTANCE.createPN();
				name.getUses().add(null);
				pat.getNames().add(name);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				pat.getNames().add(createUSRealmPatientName());
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientUSRealmPatientNameUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						Guardian guar = CDAFactory.eINSTANCE.createGuardian();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						guar.getAddrs().add(ad);
						pat.getGuardians().add(guar);
						pr.setPatient(pat);
						rt.setPatientRole(pr);
						target.getRecordTargets().add(rt);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						Guardian guar = CDAFactory.eINSTANCE.createGuardian();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						guar.getAddrs().add(ad);
						pat.getGuardians().add(guar);
						pr.setPatient(pat);
						rt.setPatientRole(pr);
						target.getRecordTargets().add(rt);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				guar.getAddrs().add(ad);
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				guar.getAddrs().add(ad);
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getAddrs().add(createUSRealmAddress());
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				guar.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				pat.getGuardians().add(guar);
				pr.setPatient(pat);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				Guardian guar = CDAFactory.eINSTANCE.createGuardian();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				guar.getTelecoms().add(tel);
				pat.getGuardians().add(guar);

				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUseTestCase.doValidationTest();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				Person person = CDAFactory.eINSTANCE.createPerson();
				aa.setAssignedPerson(person);

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				target.getAuthors().clear();

				Author author = CDAFactory.eINSTANCE.createAuthor();

				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				aa.setAssignedPerson(person);

				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

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
				CE ce = DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101");

				aa.setCode(ce);
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
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.6.101");

				aa.setCode(ce);
				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDeviceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				aa.setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());
				author.setAssignedAuthor(aa);

				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDevice(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedAuthoringDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author a = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();

				a.setAssignedAuthor(aa);
				target.getAuthors().add(a);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author a = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				aa.setAssignedPerson(ap);
				a.setAssignedAuthor(aa);
				target.getAuthors().add(a);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author a = CDAFactory.eINSTANCE.createAuthor();
				a.setTime(DatatypesFactory.eINSTANCE.createTS());
				target.getAuthors().add(a);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorTimeTestCase.doValidationTest();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ae.getAddrs().add(ad);
						de.setAssignedEntity(ae);
						target.setDataEnterer(de);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						ae.getAddrs().add(ad);
						de.setAssignedEntity(ae);
						target.setDataEnterer(de);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();

				ae.getAddrs().add(ad);
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				ae.getAddrs().add(ad);
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				ae.getTelecoms().add(tel);
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityTELUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person person = CDAFactory.eINSTANCE.createPerson();
				ae.setAssignedPerson(person);
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				ae.setAssignedPerson(person);
				de.setAssignedEntity(ae);
				target.setDataEnterer(de);

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
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityCodePTestCase.doValidationTest();
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
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				de.setAssignedEntity(ae);

				target.setDataEnterer(de);

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
	* @generated not
	*/
	// @Test
	// public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson() {
	// OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPersonTestCase = new
	// OperationsTestCase<GeneralHeaderConstraints>(
	// "validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson",
	// operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(GeneralHeaderConstraints target) {
	//
	// target.init();
	// DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// de.setAssignedEntity(ae);
	//
	// target.setDataEnterer(de);
	//
	// }
	//
	// @Override
	// protected void updateToPass(GeneralHeaderConstraints target) {
	// Person person = CDAFactory.eINSTANCE.createPerson();
	// target.getDataEnterer().getAssignedEntity().setAssignedPerson(person);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(
	// (GeneralHeaderConstraints) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPersonTestCase.doValidationTest();
	// }

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();

				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);

				target.setDataEnterer(de);
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
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Custodian cust = CDAFactory.eINSTANCE.createCustodian();
						AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
						CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						org.setAddr(ad);
						ac.setRepresentedCustodianOrganization(org);
						cust.setAssignedCustodian(ac);
						target.setCustodian(cust);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Custodian cust = CDAFactory.eINSTANCE.createCustodian();
						AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
						CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						org.setAddr(ad);
						ac.setRepresentedCustodianOrganization(org);
						cust.setAssignedCustodian(ac);
						target.setCustodian(cust);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(DatatypesFactory.eINSTANCE.createAD());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(DatatypesFactory.eINSTANCE.createAD());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(DatatypesFactory.eINSTANCE.createAD());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(DatatypesFactory.eINSTANCE.createAD());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(DatatypesFactory.eINSTANCE.createAD());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(DatatypesFactory.eINSTANCE.createAD());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				org.setAddr(ad);
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setAddr(createUSRealmAddress());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				org.setTelecom(DatatypesFactory.eINSTANCE.createTEL());
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				Custodian cust = CDAFactory.eINSTANCE.createCustodian();
				AssignedCustodian ac = CDAFactory.eINSTANCE.createAssignedCustodian();
				CustodianOrganization org = CDAFactory.eINSTANCE.createCustodianOrganization();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				org.setTelecom(tel);
				ac.setRepresentedCustodianOrganization(org);
				cust.setAssignedCustodian(ac);
				target.setCustodian(cust);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTELUseTestCase.doValidationTest();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				IntendedRecipient intended = CDAFactory.eINSTANCE.createIntendedRecipient();
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				intended.setReceivedOrganization(organization);
				Person person = CDAFactory.eINSTANCE.createPerson();
				intended.setInformationRecipient(person);
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
				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				intended.setInformationRecipient(person);
				ir.setIntendedRecipient(intended);

				target.getInformationRecipients().add(ir);

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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ae.getAddrs().add(ad);
						la.setAssignedEntity(ae);
						target.setLegalAuthenticator(la);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						ae.getAddrs().add(ad);
						la.setAssignedEntity(ae);
						target.setLegalAuthenticator(la);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				ae.getAddrs().add(ad);
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				ae.getTelecoms().add(tel);
				la.setAssignedEntity(ae);
				target.setLegalAuthenticator(la);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTELUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				LegalAuthenticator authenticator = CDAFactory.eINSTANCE.createLegalAuthenticator();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person ap = CDAFactory.eINSTANCE.createPerson();

				ae.setAssignedPerson(ap);
				authenticator.setAssignedEntity(ae);
				target.setLegalAuthenticator(authenticator);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {

				LegalAuthenticator authenticator = CDAFactory.eINSTANCE.createLegalAuthenticator();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				ae.setAssignedPerson(ap);
				authenticator.setAssignedEntity(ae);
				target.setLegalAuthenticator(authenticator);

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
	* @generated not
	*/
	// @Test
	// public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName() {
	// OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonNameTestCase = new
	// OperationsTestCase<GeneralHeaderConstraints>(
	// "validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName",
	// operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(GeneralHeaderConstraints target) {
	// target.init();
	// LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
	// target.setLegalAuthenticator(la);
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// Person person = CDAFactory.eINSTANCE.createPerson();
	//
	// ae.setAssignedPerson(person);
	// la.setAssignedEntity(ae);
	// }
	//
	// @Override
	// protected void updateToPass(GeneralHeaderConstraints target) {
	// LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
	// target.setLegalAuthenticator(la);
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// Person person = CDAFactory.eINSTANCE.createPerson();
	// person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
	// ae.setAssignedPerson(person);
	// la.setAssignedEntity(ae);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(
	// (GeneralHeaderConstraints) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonNameTestCase.doValidationTest();
	// }

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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodePTestCase.doValidationTest();
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
	* @generated not
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
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				la.setAssignedEntity(ae);

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
	* @generated  not
	*/
	// @Test
	// public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson() {
	// OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPersonTestCase = new
	// OperationsTestCase<GeneralHeaderConstraints>(
	// "validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson",
	// operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(GeneralHeaderConstraints target) {
	//
	// target.init();
	// LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
	// target.setLegalAuthenticator(la);
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// la.setAssignedEntity(ae);
	//
	// }
	//
	// @Override
	// protected void updateToPass(GeneralHeaderConstraints target) {
	// Person person = CDAFactory.eINSTANCE.createPerson();
	//
	// target.getLegalAuthenticator().getAssignedEntity().setAssignedPerson(person);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(
	// (GeneralHeaderConstraints) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPersonTestCase.doValidationTest();
	// }

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
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_SIGNATURE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCodePTestCase.doValidationTest();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ae.getAddrs().add(ad);
						auth.setAssignedEntity(ae);
						target.getAuthenticators().add(auth);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						ae.getAddrs().add(ad);
						auth.setAssignedEntity(ae);
						target.getAuthenticators().add(auth);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not 
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				ae.getAddrs().add(ad);
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator auth = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				ae.getTelecoms().add(tel);
				auth.setAssignedEntity(ae);
				target.getAuthenticators().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTELUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

				target.init();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person person = CDAFactory.eINSTANCE.createPerson();

				ae.setAssignedPerson(person);

				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthenticators().clear();
				Authenticator authenticator = CDAFactory.eINSTANCE.createAuthenticator();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

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
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.101"));
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
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.101"));
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ae.setAssignedPerson(ap);
				authenticator.setAssignedEntity(ae);
				target.getAuthenticators().add(authenticator);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAssignedPersonTestCase.doValidationTest();
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
				authenticator.setSignatureCode(DatatypesFactory.eINSTANCE.createCS("S"));
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
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ae.getAddrs().add(ad);
						inf.setAssignedEntity(ae);
						target.getInformants().add(inf);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						ae.getAddrs().add(ad);
						inf.setAssignedEntity(ae);
						target.getInformants().add(inf);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				ae.getAddrs().add(ad);
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				inf.setAssignedEntity(ae);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityUSRealmAddressUseTestCase.doValidationTest();
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
				guardian.setCode(DatatypesFactory.eINSTANCE.createCE("SPS", "2.16.840.1.113883.5.111"));

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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				patient.setAdministrativeGenderCode(DatatypesFactory.eINSTANCE.createCE("F", "2.16.840.1.113883.5.1"));
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCodeTestCase.doValidationTest();
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
				CDAFactory.eINSTANCE.createPlace();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				CDAFactory.eINSTANCE.createBirthplace();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				Person person = CDAFactory.eINSTANCE.createPerson();
				guardian.setGuardianPerson(person);

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
				CDAFactory.eINSTANCE.createBirthplace();
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				guardian.setGuardianPerson(person);

				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
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
					"E", "2.16.840.1.113883.5.61", "", ""));

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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
					"E", "2.16.840.1.113883.5.61", "", ""));

				patient.getLanguageCommunications().add(languageCommunication);

				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_MODE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodePTestCase.doValidationTest();
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
				patient.setEthnicGroupCode(DatatypesFactory.eINSTANCE.createCE("2135-2", "2.16.840.1.113883.6.238"));
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_MARITAL_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				patient.setEthnicGroupCode(DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.238"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RELIGIOUS_AFFILIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				patient.getSDTCRaceCodes().add(
					(DatatypesFactory.eINSTANCE.createCE("2058-6", "2.16.840.1.113883.6.238")));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getSDTCRaceCodes().add((DatatypesFactory.eINSTANCE.createCE()));
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
				patient.getSDTCRaceCodes().add(
					(DatatypesFactory.eINSTANCE.createCE("2058-6", "2.16.840.1.113883.6.238")));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Organization org = CDAFactory.eINSTANCE.createOrganization();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						org.getAddrs().add(ad);
						pr.setProviderOrganization(org);
						rt.setPatientRole(pr);
						target.getRecordTargets().add(rt);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Organization org = CDAFactory.eINSTANCE.createOrganization();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						org.getAddrs().add(ad);
						pr.setProviderOrganization(org);
						rt.setPatientRole(pr);
						target.getRecordTargets().add(rt);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				org.getAddrs().add(ad);
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getAddrs().add(createUSRealmAddress());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				org.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getRecordTargets().clear();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				org.getTelecoms().add(tel);
				pr.setProviderOrganization(org);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTELUseTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				pr.setProviderOrganization(org);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTestCase.doValidationTest();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Author auth = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						aa.getAddrs().add(ad);
						auth.setAssignedAuthor(aa);
						target.getAuthors().add(auth);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Author auth = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						aa.getAddrs().add(ad);
						auth.setAssignedAuthor(aa);
						target.getAuthors().add(auth);
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				aa.getAddrs().add(ad);
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(createUSRealmAddress());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthors().clear();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.getUses().add(TelecommunicationAddressUse.HP);
				aa.getTelecoms().add(tel);
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				CDAFactory.eINSTANCE.createAssignedEntity();

				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				Person person = CDAFactory.eINSTANCE.createPerson();
				re.setRelatedPerson(person);

				informant.setRelatedEntity(re);
				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				CDAFactory.eINSTANCE.createAssignedEntity();

				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				re.setRelatedPerson(person);

				informant.setRelatedEntity(re);
				target.getInformants().add(informant);

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
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityCodePTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
						RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						re.getAddrs().add(ad);
						inf.setRelatedEntity(re);
						target.getInformants().add(inf);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						target.init();
						Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
						RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						re.getAddrs().add(ad);
						inf.setRelatedEntity(re);
						target.getInformants().add(inf);

					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				re.getAddrs().add(ad);
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
				re.getAddrs().add(createUSRealmAddress());
				inf.setRelatedEntity(re);
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	// @Test
	// public void testValidateGeneralHeaderConstraintsInformantAssignedEntityPerson() {
	// OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityPersonTestCase = new
	// OperationsTestCase<GeneralHeaderConstraints>(
	// "validateGeneralHeaderConstraintsInformantAssignedEntityPerson",
	// operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(GeneralHeaderConstraints target) {
	// target.init();
	// Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// informant.setAssignedEntity(ae);
	// target.getInformants().add(informant);
	// }
	//
	// @Override
	// protected void updateToPass(GeneralHeaderConstraints target) {
	// target.getInformants().clear();
	// Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
	// ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
	// informant.setAssignedEntity(ae);
	// target.getInformants().add(informant);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityPerson(
	// (GeneralHeaderConstraints) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateGeneralHeaderConstraintsInformantAssignedEntityPersonTestCase.doValidationTest();
	// }

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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();

				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				informant.setAssignedEntity(ae);

				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();

				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();

				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();

				informant.setRelatedEntity(re);

				target.getInformants().add(informant);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityTestCase.doValidationTest();
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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getInformants().clear();
				Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				Person person = CDAFactory.eINSTANCE.createPerson();
				person.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				ae.setAssignedPerson(person);
				informant.setAssignedEntity(ae);
				target.getInformants().add(informant);

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
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifier(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);

				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);

				perf.setFunctionCode(DatatypesFactory.eINSTANCE.createCE("PRF", "2.16.840.1.113883.5.88"));

				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);

				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);

				perf.setFunctionCode(DatatypesFactory.eINSTANCE.createCE("PRF", "2.16.840.1.113883.5.88"));

				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1TypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLowTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLow(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				dof.setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTime(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				dof.setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.getPerformers().add(CDAFactory.eINSTANCE.createPerformer1());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOfServiceEvent() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDocumentationOfServiceEventTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				dof.setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDocumentationOfServiceEvent(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorizationConsentCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorizationConsentCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorizationConsentCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthorizations().clear();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				con.setCode(DatatypesFactory.eINSTANCE.createCE());
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorizationConsentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorizationConsentId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorizationConsentIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorizationConsentId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthorizations().clear();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				con.getIds().add(DatatypesFactory.eINSTANCE.createII());
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorizationConsentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorizationConsentStatusCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthorizations().clear();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				con.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorizationConsentStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorizationConsentStatusCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorizationConsentStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthorizations().clear();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				con.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsentStatusCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorizationConsentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorizationConsent() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorizationConsentTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorizationConsent",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				target.init();
				target.getAuthorizations().add(CDAFactory.eINSTANCE.createAuthorization());
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.getAuthorizations().clear();
				Consent con = CDAFactory.eINSTANCE.createConsent();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				auth.setConsent(con);
				target.getAuthorizations().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorizationConsent(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorizationConsentTestCase.doValidationTest();
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

	private AD createUSRealmAddress() {
		AD addr = DatatypesFactory.eINSTANCE.createAD();
		addr.getUses().add(PostalAddressUse.HP);
		addr.addStreetAddressLine("123 Main Street");
		addr.addCity("Boston");
		addr.addState("MA");
		addr.addCountry("US");
		addr.addPostalCode("01001");

		return addr;

	}

	private PN createUSRealmPatientName() {
		PN name = DatatypesFactory.eINSTANCE.createPN();
		name.addGiven("Aaron");
		name.addFamily("Rodgers");
		name.addPrefix("Mr.");
		name.addSuffix("QB");
		name.getUses().add(EntityNameUse.C);

		return name;
	}

} // GeneralHeaderConstraintsOperations
