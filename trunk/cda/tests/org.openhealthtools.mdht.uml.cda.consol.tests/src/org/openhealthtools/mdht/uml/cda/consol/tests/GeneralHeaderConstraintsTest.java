/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
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
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNameUse;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code P</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Birth Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient TS Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name US Realm Patient Name Mixed Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient General Header Constraints US Realm Patient Name Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Guardian General Header Constraints US Realm Address Use</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Provider Organization General Header Constraints US Realm Address Use</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Authoring Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has One Assigned Person Or One Assigned Authoring Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian Assigned Custodian Custodian Organization General Header Constraints US Realm Address Use</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant Related Entity General Header Constraints Informant Assigned Entity Person Name</em>}</li>
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
 * @generated not
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
	* @generated not not
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
	* @generated not
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
	* @generated not
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
	* @generated not
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
	* @generated not
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
	public void testValidateGeneralHeaderConstraintsConfidentialityCodeP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConfidentialityCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsConfidentialityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConfidentialityCodeP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsConfidentialityCodePTestCase.doValidationTest();
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
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// original test
						target.init();
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// test incorrect (non-existing) codeSystem OID
						target.init();
						target.setConfidentialityCode(DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.6.66"));
					}
				});

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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
				createUSRealmAddress();
				AD ad1 = DatatypesFactory.eINSTANCE.createAD();
				ad1.setNullFlavor(NullFlavor.NA);

				pr.getAddrs().add(ad1);
				rt.setPatientRole(pr);
				target.getRecordTargets().add(rt);

				// --
				// ad.getCities().get(0).setNullFlavor(NullFlavor.NA);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYearTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				// fails if value is less than required number of digits (4)
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("123")); // fails as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				// passes if value is more than or equal to required number of digits (6)
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("1234")); // passes as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYearTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDayTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				// fails if value is less than required number of digits (6)
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("12345")); // fails as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				// passes if value is more than or equal to required number of digits (6)
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("123456")); // passes as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValueTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				// fails if there is an empty birthTime element. Would also fail if it had more than 1 value (would need to deserialize a document)
				target.init();
				TS btTS = DatatypesFactory.eINSTANCE.createTS(); // added
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(btTS); // add empty TS
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				// passes if it has a value (or doesn't, 0..1, and has a nullFlavor instead)
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("AnyString"));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTSValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContentTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_US_REALM_PATIENT_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContent(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUSRealmPatientNameMixedContentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamilyTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamily(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameFamilyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGivenTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGiven(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameGivenTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefixTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefix(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNamePrefixTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffixTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffix(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameSuffixTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_US_REALM_PATIENT_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGeneralHeaderConstraintsUSRealmPatientNameUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	* @generated not  not
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
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDeviceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_ONE_ASSIGNED_PERSON_OR_ONE_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
						// empty assignedAuthor element (does not contain assignedPerson or assignedAuthoringDevice)
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
						// contains both assignedPerson and assignedAuthoringDevice
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						aa.setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// nullflavor test with both elements at the same time
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.setNullFlavor(NullFlavor.UNK);
						AuthoringDevice aad = CDAFactory.eINSTANCE.createAuthoringDevice();
						aad.setNullFlavor(NullFlavor.UNK);
						aa.setAssignedPerson(ap);
						aa.setAssignedAuthoringDevice(aad);
						target.getAuthors().add(author);
					}
				}

				);

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
						// contains assignedPerson only
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
						// contains assignedAuthoringDevice only
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						aa.setAssignedAuthoringDevice(CDAFactory.eINSTANCE.createAuthoringDevice());
						target.getAuthors().add(author);
					}
				}

				);

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// nullflavor test assignedAuthoringDevice only
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						AuthoringDevice aad = CDAFactory.eINSTANCE.createAuthoringDevice();
						aad.setNullFlavor(NullFlavor.UNK);
						aa.setAssignedAuthoringDevice(aad);
						target.getAuthors().add(author);
					}
				}

				);

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// nullflavor test assignedPerson only
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.setNullFlavor(NullFlavor.UNK);
						aa.setAssignedPerson(ap);
						target.getAuthors().add(author);
					}
				}

				);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDevice(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorHasOneAssignedPersonOrOneAssignedAuthoringDeviceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifierTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// CONF:16786

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// Id is NOT equal to 2.16.840.1.113883.4.6 (or does not have a nullFlavor set instead) (has assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// Id does not have an attribute root (or any attribute) (or does not have a nullFlavor set instead) (has assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// Has Id but has two roots (has assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("222222"));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// Has Id but has zero roots (has assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Id is equal to 2.16.840.1.113883.4.6 (without assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Id is equal to 2.16.840.1.113883.4.6 (with assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						Person person = CDAFactory.eINSTANCE.createPerson();
						aa.setAssignedPerson(person);
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Has assignedPerson and No Id is present (0..1)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Does not Have assignedPerson and No is Id present (No Id in general) (0..1)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// nullFlavor on Id with assignedPerson
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII(NullFlavor.ASKU));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// nullFlavor on Id without assignedPerson
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII(NullFlavor.ASKU));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				// SME recommendation (with my CONFs inserted by relation):
				// 1. If this assignedAuthor is an assignedPerson, the assignedAuthor SHOULD contain zero to one [0..1] id such that it (CONF:19521).
				// // // // SHALL contain exactly one 1..1] @root="2.16.840.1.113883.4.6" National Provider Identifier (CONF:16786).

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Id is NOT equal to 2.16.840.1.113883.4.6 (or does not have a nullFlavor set instead) (no assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Id does not have an attribute root (or any attribute) (or does not have a nullFlavor set instead) (no assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Has Id but has two roots (no assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("111111"));
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("222222"));
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// Has Id but has zero roots (no assignedPerson)
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

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
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorIfHasAssignedPersonEnforceId() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorIfHasAssignedPersonEnforceIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorIfHasAssignedPersonEnforceId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_IF_HAS_ASSIGNED_PERSON_ENFORCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// CONF:19521

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// If there's an assignedPerson element and the assignedAuthor has two ids
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// If there's an assignedPerson element and the assignedAuthor has one id
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// If there's NO assignedPerson element and the assignedAuthor has one id
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// If there's an assignedPerson element and the assignedAuthor has zero (no) ids
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						author.setAssignedAuthor(aa);
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// If there's NO assignedPerson element and the assignedAuthor has zero (no) ids
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// If there's NO assignedPerson element and the assignedAuthor has two ids
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
						author.setAssignedAuthor(aa);
						target.getAuthors().add(author);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// If there's NO assignedPerson element and the assignedAuthor has an incorrect root
						target.init();
						Author author = CDAFactory.eINSTANCE.createAuthor();
						AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
						aa.getIds().add(DatatypesFactory.eINSTANCE.createII("666"));
						author.setAssignedAuthor(aa);
						aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
						target.getAuthors().add(author);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorIfHasAssignedPersonEnforceId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorIfHasAssignedPersonEnforceIdTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsDataEntererAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	* @generated not  not
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
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthenticatorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	* @generated not  not
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
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				// -has guardian and has no code element at all
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
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has guardian and has code element
						RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
						guardian.setCode(DatatypesFactory.eINSTANCE.createCE());
						patient.getGuardians().add(guardian);
						pr.setPatient(patient);
						re.setPatientRole(pr);
						target.getRecordTargets().add(re);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -does not have guardian and does not have code element at all
						RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(patient);
						re.setPatientRole(pr);
						target.getRecordTargets().add(re);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -nullFlavor code element
						target.getRecordTargets().clear();
						RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
						CE code = DatatypesFactory.eINSTANCE.createCE();
						code.setNullFlavor(NullFlavor.UNK);
						guardian.setCode(code);
						patient.getGuardians().add(guardian);
						pr.setPatient(patient);
						re.setPatientRole(pr);
						target.getRecordTargets().add(re);
					}
				});

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
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsiblePartyTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// define constants

			private static final String VALID_CODESYSTEM_ID = "2.16.840.1.113883.5.111";

			private static final String VALID_PERSONALRELATIONSHIP_CODE = "ADOPT";

			private static final String VALID_PERSONALRELATIONSHIP_CODE2 = "GPARNT";

			private static final String VALID_RESPONSIBLEPARTY_CODE = "RESPRSN";

			private static final String VALID_RESPONSIBLEPARTY_CODE2 = "SPOWATT";

			// define fields used in every test

			private RecordTarget re;

			private PatientRole pr;

			private Patient patient;

			private Guardian guardian;

			/**
			 * Sets up fields and ensures they are fresh for each test so there is no chance of interference
			 * and initializes the target.
			 */
			private void setup(GeneralHeaderConstraints target) {
				target.init();
				re = CDAFactory.eINSTANCE.createRecordTarget();
				pr = CDAFactory.eINSTANCE.createPatientRole();
				patient = CDAFactory.eINSTANCE.createPatient();
				guardian = CDAFactory.eINSTANCE.createGuardian();
			}

			/**
			 * Adds elements to the hierarchy for code reuse
			 */
			private void addElements(GeneralHeaderConstraints target) {
				guardian.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				patient.getGuardians().add(guardian);
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// -has guardian and an incorrect codeSystem ID with a valid code
						setup(target);
						guardian.setCode(DatatypesFactory.eINSTANCE.createCE(
							VALID_PERSONALRELATIONSHIP_CODE, CDAValidationTest.BAD_CODESYSTEM_ID));
						addElements(target);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// -has guardian, an invalid code, and a valid codeSystem ID
						setup(target);
						guardian.setCode(DatatypesFactory.eINSTANCE.createCE(
							CDAValidationTest.BAD_CODE_VALUE, VALID_CODESYSTEM_ID));
						addElements(target);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// -has guardian, an incorrect codeSystem ID, and invalid code
						setup(target);
						guardian.setCode(DatatypesFactory.eINSTANCE.createCE(
							CDAValidationTest.BAD_CODE_VALUE, CDAValidationTest.BAD_CODESYSTEM_ID));
						addElements(target);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -does not have guardian and does not have code element at all
						// (only checking if we have guardian/code)
						target.init();
						RecordTarget recordTarget = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole patientRole = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						patientRole.setPatient(patient);
						recordTarget.setPatientRole(patientRole);
						target.getRecordTargets().add(recordTarget);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has guardian and a correct codeSystem and a valid (PersonalRelationship) code
						setup(target);
						guardian.setCode(DatatypesFactory.eINSTANCE.createCE(
							VALID_PERSONALRELATIONSHIP_CODE2, VALID_CODESYSTEM_ID));
						addElements(target);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has guardian and a correct codeSystem and a valid (ResponsibleParty) code
						setup(target);
						guardian.setCode(DatatypesFactory.eINSTANCE.createCE(
							VALID_RESPONSIBLEPARTY_CODE, VALID_CODESYSTEM_ID));
						addElements(target);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has guardian and a correct codeSystem and a different valid (ResponsibleParty) code
						setup(target);
						guardian.setCode(DatatypesFactory.eINSTANCE.createCE(
							VALID_RESPONSIBLEPARTY_CODE2, VALID_CODESYSTEM_ID));
						addElements(target);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has guardian and no code element at all.
						// Note: This passes because this OCL is not checking if code exists, only for the
						// codeSystem, codes, and type. And we only make the extra checks if code exists.
						// The existence is checked by the modeled attribute.
						setup(target);
						addElements(target);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -nullFlavor code element
						setup(target);
						CE code = DatatypesFactory.eINSTANCE.createCE();
						code.setNullFlavor(NullFlavor.ASKU);
						guardian.setCode(code);
						addElements(target);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsiblePartyTestCase.doValidationTest();
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
				// fails if no birthTime element exists (SHALL contain exactly one [1..1] birthTime)
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
				// passes if a birthTime element exists; threw nullFlavor in for an extra test to ensure it works
				TS btTS = DatatypesFactory.eINSTANCE.createTS();
				btTS.setNullFlavor(NullFlavor.NAV);
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS());
				patient.setBirthTime(btTS); // add TS with null flavor
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
				// contains 0 name elements
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// contains 1 name element
						target.getRecordTargets().clear();
						RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						patient.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						pr.setPatient(patient);
						re.setPatientRole(pr);
						target.getRecordTargets().add(re);
					}
				}

				);

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// contains 2 name elements
						target.getRecordTargets().clear();
						RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						Patient patient = CDAFactory.eINSTANCE.createPatient();
						patient.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						patient.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						pr.setPatient(patient);
						re.setPatientRole(pr);
						target.getRecordTargets().add(re);
					}
				}

				);

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
				CE raceCE = DatatypesFactory.eINSTANCE.createCE();
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getSDTCRaceCodes().add(raceCE); // this constraint only checks to see if element is there
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
				CE raceCE = DatatypesFactory.eINSTANCE.createCE();
				raceCE.setCode("Must Exist"); // passes since it is only required to exist
				raceCE.setCodeSystem("9.8.7.6.5.4.3.2.1"); // fails due to incorrect codeSystem

				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getSDTCRaceCodes().add((raceCE));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CE raceCE = DatatypesFactory.eINSTANCE.createCE();
				raceCE.setCode("2058-6"); // although a correct code, not required to be accurate, just to exist
				raceCE.setCodeSystem("2.16.840.1.113883.6.238"); // correct passing codeSystem

				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getSDTCRaceCodes().add(raceCE);
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
	* 
	* Note: Not part of additional constraint in the model, just an additional test to ensure a code exists
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeCustomCheckCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeCustomCheckCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeCustomCheckCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_SDTC_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {
				CE raceCE = DatatypesFactory.eINSTANCE.createCE();
				raceCE.setCodeSystem("2.16.840.1.113883.6.238"); // correct passing codeSystem, fails due to no code existing
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getSDTCRaceCodes().add((raceCE));
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				CE raceCE = DatatypesFactory.eINSTANCE.createCE();
				raceCE.setCode("code exists"); // passing due to having a code
				raceCE.setCodeSystem("2.16.840.1.113883.6.238"); // correct passing codeSystem
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.getSDTCRaceCodes().add(raceCE);
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

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientSDTCRaceCodeCustomCheckCodeTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PROVIDER_ORGANIZATION_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_IF_SDTC_ENFORCE_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// -has sdtcRaceCode (without data) but does not have raceCode
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						target.getRecordTargets().add(rt);
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						rt.setPatientRole(pr);
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(pat);
						CE sdtcRaceCode = DatatypesFactory.eINSTANCE.createCE();
						pat.getSDTCRaceCodes().add(sdtcRaceCode);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// -has sdtcRaceCode (with data) but does not have raceCode
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						target.getRecordTargets().add(rt);
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						rt.setPatientRole(pr);
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(pat);
						CE sdtcRaceCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcRaceCode.setCode("HASACODE");
						sdtcRaceCode.setCodeSystem("HASACODESYSTEM.123");
						pat.getSDTCRaceCodes().add(sdtcRaceCode);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(GeneralHeaderConstraints target) {
						// -has sdtcRaceCode (with a nullFlavor set) but does not have raceCode
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						target.getRecordTargets().add(rt);
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						rt.setPatientRole(pr);
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(pat);
						CE sdtcRaceCode = DatatypesFactory.eINSTANCE.createCE();
						sdtcRaceCode.setNullFlavor(NullFlavor.NAV);
						pat.getSDTCRaceCodes().add(sdtcRaceCode);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has sdtcRaceCode and has raceCode
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						target.getRecordTargets().add(rt);
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						rt.setPatientRole(pr);
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(pat);
						CE sdtcRaceCode = DatatypesFactory.eINSTANCE.createCE();
						CE raceCode = DatatypesFactory.eINSTANCE.createCE();
						pat.getSDTCRaceCodes().add(sdtcRaceCode);
						pat.setRaceCode(raceCode);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has raceCode but does not have sdtcRaceCode
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						target.getRecordTargets().add(rt);
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						rt.setPatientRole(pr);
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(pat);
						CE raceCode = DatatypesFactory.eINSTANCE.createCE();
						pat.setRaceCode(raceCode);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -patient has neither raceCode nor sdtcRaceCode (should be irrelevant for this case specifically)
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						target.getRecordTargets().add(rt);
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						rt.setPatientRole(pr);
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(pat);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// -has sdtcRaceCode and has raceCode but with a nullFlavor set
						target.init();
						RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
						target.getRecordTargets().add(rt);
						PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
						rt.setPatientRole(pr);
						Patient pat = CDAFactory.eINSTANCE.createPatient();
						pr.setPatient(pat);
						CE sdtcRaceCode = DatatypesFactory.eINSTANCE.createCE();
						CE raceCode = DatatypesFactory.eINSTANCE.createCE();
						raceCode.setNullFlavor(NullFlavor.ASKU);
						pat.getSDTCRaceCodes().add(sdtcRaceCode);
						pat.setRaceCode(raceCode);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientIfSdtcEnforceRaceCodeTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsAuthorAssignedAuthorGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
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
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonName() {
		OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonNameTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonName",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT_RELATED_ENTITY_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonName(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

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

		};

		validateGeneralHeaderConstraintsInformantRelatedEntityGeneralHeaderConstraintsInformantAssignedEntityPersonNameTestCase.doValidationTest();
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
	* @generated not  not
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
	* @generated not
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
						// Does not contain an associatedPerson element or a scopingOrganization element
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
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
						// associatedPerson element and scopingOrganization element
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						ae.setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
						ae.setScopingOrganization(CDAFactory.eINSTANCE.createOrganization());
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(GeneralHeaderConstraints target) {
						// scopingOrganization element only
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
						// associatedPerson element only
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
	* @generated not  not
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
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "Just Has To Be Something"));
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
				// codeSystem must be accurate
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
