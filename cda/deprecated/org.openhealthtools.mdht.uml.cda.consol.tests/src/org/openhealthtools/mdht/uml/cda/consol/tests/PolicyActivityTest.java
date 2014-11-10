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
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Person Name And Or Org Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role Coverage Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageLowTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Low Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageHighTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage High Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCoverageCoverageRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Coverage Coverage Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityHolderHolderRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Holder Holder Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationshipTargetActActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target Act Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Description Coverage Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PolicyActivityTest extends CDAValidationTest {

	public static final String PAYER_PERFORMER_ROOT = "2.16.840.1.113883.10.20.22.4.87";

	public static final String GUARANTOR_PERFORMER_ROOT = "2.16.840.1.113883.10.20.22.4.88";

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityClassCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityClassCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityClassCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				CE cd = DatatypesFactory.eINSTANCE.createCE("AP", "2.16.840.1.113883.6.1", null, null);
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCodeP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCodePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCodeP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII("12345678-0");
				target.getIds().add(ii);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityMoodCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityMoodCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityMoodCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityStatusCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityStatusCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityStatusCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayer() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayer",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// does not contain any payer or any guarantor performer elements
						target.init();
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 2 payers and Contains 1 guarantor
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);

						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 2 payers and Contains 0 guarantor
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 0 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 2 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);

						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

				Performer2 payer = createPerformer();
				AssignedEntity aePay = CDAFactory.eINSTANCE.createAssignedEntity();
				aePay.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				payer.setAssignedEntity(aePay);
				target.getPerformers().add(payer);

				II iiPay = DatatypesFactory.eINSTANCE.createII();
				iiPay.setRoot(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);

				Performer2 guarantor = createPerformer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				guarantor.setAssignedEntity(ae);
				target.getPerformers().add(guarantor);

				II iiGuar = DatatypesFactory.eINSTANCE.createII();
				iiGuar.setRoot(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayer(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantor() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantor",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// does not contain any payer or any guarantor performer elements
						target.init();
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 1 payer and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);

						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 2 payers and Contains 0 guarantor
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 0 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						// Contains 2 payers and Contains 2 guarantors
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						Performer2 guarantor2 = createPerformer();
						guarantor2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor2);

						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						Performer2 payer2 = createPerformer();
						payer2.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer2);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				// Contains 1 payer and 1 guarantor
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				AssignedEntity aePay = CDAFactory.eINSTANCE.createAssignedEntity();
				aePay.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				payer.setAssignedEntity(aePay);
				target.getPerformers().add(payer);

				II iiPay = DatatypesFactory.eINSTANCE.createII();
				iiPay.setRoot(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);

				Performer2 guarantor = createPerformer();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));

				guarantor.setAssignedEntity(ae);
				target.getPerformers().add(guarantor);

				II iiGuar = DatatypesFactory.eINSTANCE.createII();
				iiGuar.setRoot(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantor(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCoverage() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverage",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getParticipants().add(createCoverage());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverage(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityHolder() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolder",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolder(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityEntryRelationship() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityEntryRelationshipTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityEntryRelationship(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						target.getPerformers().add(payer);
						AssignedEntity payerEntity = createPayerAssignedEntity();
						payerEntity.getAddrs().add(ad);
						payer.setAssignedEntity(payerEntity);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						target.getPerformers().add(payer);
						AssignedEntity payerEntity = createPayerAssignedEntity();
						payerEntity.getAddrs().clear();
						payerEntity.getAddrs().add(ad);
						payer.setAssignedEntity(payerEntity);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);

			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();

				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);

			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				payerEntity.getAddrs().add(ad);
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payerEntity.getAddrs().add(createUSRealmAddress());
				payer.setAssignedEntity(payerEntity);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationNameTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				payerEntity.getRepresentedOrganizations().add(repOrg);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				ON name = DatatypesFactory.eINSTANCE.createON();
				repOrg.getNames().add(name);

				payerEntity.getRepresentedOrganizations().add(repOrg);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getIds().clear();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with payer/assignedEntity/code
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						AssignedEntity payerEntity = createPayerAssignedEntity();
						payer.setAssignedEntity(payerEntity);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with payer/assignedEntity/code="GUAR" AND guarantor/assignedEntity/code="GUAR"
					// to ensure there is no confusion between the two identities.
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						// payer
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						payer.setAssignedEntity(createPayerAssignedEntity());
						target.getPerformers().add(payer);
						// guarantor
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.setCode(null);
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with payer/assignedEntity/code
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						target.getPerformers().add(payer);
						AssignedEntity payerEntity = createPayerAssignedEntity();
						payer.setAssignedEntity(payerEntity);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with payer/assignedEntity/code="GUAR" AND guarantor/assignedEntity/code="GUAR"
					// to ensure there is no confusion between the two identities.
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						// payer
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						payer.setAssignedEntity(createPayerAssignedEntity());
						target.getPerformers().add(payer);
						// guarantor
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityCodeP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityCodePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.setCode(null);
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityCodeP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getTelecoms().clear();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityTelecom(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityPayerOrganization() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityPayerOrganization",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				payerEntity.getRepresentedOrganizations().add(repOrg);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Checks if the template ID exists or not, but the template ID must exist in order to differentiate between the two different types of
			// performers, payer and guarantor. So, it is not possible to not include a template ID and for the code to know to fail it for not
			// specifically having a payer or a guarantor. Due to the identification issue, the fail test has been skipped.

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				// target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				// Although the correct PAYER performer template ID is provided, any ID will pass, as the test only ensures an ID is there.
				// The real check for the actual ID is done with testValidatePolicyActivityPayer()
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				payer.setTypeCode(ParticipationPhysicalPerformer.SPRF);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
				target.getPerformers().add(payer);
				payer.setTypeCode(ParticipationPhysicalPerformer.PRF);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				II iiPay = DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);
				target.getPerformers().add(payer);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = CDAFactory.eINSTANCE.createPerformer2();
				II iiPay = DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT);
				payer.getTemplateIds().add(0, iiPay);
				payer.setAssignedEntity(createPayerAssignedEntity());
				target.getPerformers().add(payer);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						AssignedEntity gEntity = createGuarantorAssignedEntity();
						gEntity.getAddrs().clear();
						gEntity.getAddrs().add(ad);
						guarantor.setAssignedEntity(gEntity);
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						AssignedEntity gEntity = createGuarantorAssignedEntity();
						gEntity.getAddrs().clear();
						gEntity.getAddrs().add(ad);
						guarantor.setAssignedEntity(gEntity);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				gEntity.getAddrs().add(ad);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().clear();
				gEntity.getAddrs().add(createUSRealmAddress());
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgNameTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_PERSON_NAME_AND_OR_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				// Case with assignedPerson with no name. Does not contain represented organization at all.
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(guarantorEntity);

				Person person = CDAFactory.eINSTANCE.createPerson();
				guarantorEntity.setAssignedPerson(person);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with Person & Represented Organization
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
						guarantor.setAssignedEntity(guarantorEntity);

						Person person = CDAFactory.eINSTANCE.createPerson();
						PN pn11 = DatatypesFactory.eINSTANCE.createPN();
						person.getNames().add(pn11);
						guarantorEntity.setAssignedPerson(person);

						Organization org = CDAFactory.eINSTANCE.createOrganization();
						guarantorEntity.getRepresentedOrganizations().add(org);
						ON on1 = DatatypesFactory.eINSTANCE.createON();
						org.getNames().add(on1);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with Person only
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
						guarantor.setAssignedEntity(guarantorEntity);

						Person person = CDAFactory.eINSTANCE.createPerson();
						PN pn11 = DatatypesFactory.eINSTANCE.createPN();
						person.getNames().add(pn11);
						guarantorEntity.setAssignedPerson(person);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with RepresentedOrganization only
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						target.getPerformers().add(guarantor);
						AssignedEntity guarantorEntity = createGuarantorAssignedEntity();
						guarantor.setAssignedEntity(guarantorEntity);

						Organization org = CDAFactory.eINSTANCE.createOrganization();
						guarantorEntity.getRepresentedOrganizations().add(org);
						ON on1 = DatatypesFactory.eINSTANCE.createON();
						org.getNames().add(on1);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgName(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityPersonNameAndOrOrgNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				guarantor.setAssignedEntity(createGuarantorAssignedEntity());
				guarantor.getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.XXX"));
				target.getPerformers().add(guarantor);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code="GUAR" AND payer/assignedEntity/code="GUAR"
					// to ensure there is no confusion between the two identities.
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						// payer
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						payer.setAssignedEntity(createPayerAssignedEntity());
						target.getPerformers().add(payer);
						// guarantor
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityCodeP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityCodePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				guarantor.setAssignedEntity(createGuarantorAssignedEntity());
				guarantor.getAssignedEntity().setCode(null);
				target.getPerformers().add(guarantor);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

				addPassTest(new PassTest() {

					@Override
					// Case with guarantor/assignedEntity/code="GUAR" AND payer/assignedEntity/code="GUAR"
					// to ensure there is no confusion between the two identities.
					public void updateToPass(PolicyActivity target) {
						target.init();
						target.getPerformers().clear();
						// payer
						Performer2 payer = createPerformer();
						payer.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(PAYER_PERFORMER_ROOT));
						payer.setAssignedEntity(createPayerAssignedEntity());
						target.getPerformers().add(payer);
						// guarantor
						Performer2 guarantor = createPerformer();
						guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
						guarantor.setAssignedEntity(createGuarantorAssignedEntity());
						target.getPerformers().add(guarantor);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityCodeP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
				// gEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				gEntity.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// Checks if the template ID exists or not, but the template ID must exist in order to differentiate between the two different types of
			// performers, payer and guarantor. So, it is not possible to not include a template ID and for the code to know to fail it for not
			// specifically having a payer or a guarantor. Due to the identification issue, the fail test has been skipped.

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				// target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
				// Although the correct GUARANTOR performer template ID is provided, any ID will pass, as the test only ensures an ID is there.
				// The real check for the actual ID is done with testValidatePolicyActivityGuarantor()
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				guarantor.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				guarantor.setTypeCode(ParticipationPhysicalPerformer.PPRF);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				guarantor.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT));
				target.getPerformers().add(guarantor);
				guarantor.setTypeCode(ParticipationPhysicalPerformer.PRF);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				II iiGuar = DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
				target.getPerformers().add(guarantor);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 guarantor = createPerformer();
				II iiGuar = DatatypesFactory.eINSTANCE.createII(GUARANTOR_PERFORMER_ROOT);
				guarantor.getTemplateIds().add(0, iiGuar);
				target.getPerformers().add(guarantor);
				AssignedEntity gEntity = createGuarantorAssignedEntity();
				guarantor.setAssignedEntity(gEntity);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.init();
						target.getParticipants().clear();
						Participant2 coverage = createCoverage();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						coverage.getParticipantRole().getAddrs().add(ad);
						target.getParticipants().add(coverage);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.init();
						target.getParticipants().clear();
						Participant2 coverage = createCoverage();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						coverage.getParticipantRole().getAddrs().add(ad);
						target.getParticipants().add(coverage);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountry(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressState(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUse(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				coverage.getParticipantRole().getAddrs().add(ad);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(createUSRealmAddress());

			}

		};

		validatePolicyActivityCoverageCoverageRoleGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityNameTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				// coverage.getParticipantRole().getPlayingEntity().getNames().add(DatatypesFactory.eINSTANCE.createPN());

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getPlayingEntity().getNames().add(DatatypesFactory.eINSTANCE.createPN());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityName(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				coverage.setParticipantRole(pr);

				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				pr.setCode(DatatypesFactory.eINSTANCE.createCE("FAMDEP", "2.16.840.1.113883.5.111"));
				coverage.setParticipantRole(pr);
				// 2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleCodeP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleCodePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleCodeP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				pr.setCode(DatatypesFactory.eINSTANCE.createCE("FAMDEP", "2.16.840.1.113883.5.111"));
				coverage.setParticipantRole(pr);
				// 2.16.840.1.113883.5.111' and (value.code = 'FAMDEP' or
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCodeP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				// coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected void updateToPass(PolicyActivity target) {

				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = createCoverage();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				coverage.setParticipantRole(pr);
				target.getParticipants().add(coverage);
				coverage.getParticipantRole().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleCoveragePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageLowTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageLowTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageLowTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_LOW_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				coverage.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				time.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				coverage.setTime(time);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageLowTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageLowTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageHighTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageHighTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageHighTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_HIGH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				coverage.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				time.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				coverage.setTime(time);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageHighTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageHighTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				coverage.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				coverage.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.22.4.89"));
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();

				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityCoverageCoverageRole() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoverageCoverageRoleTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCoverageCoverageRole",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERAGE_COVERAGE_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				CDAFactory.eINSTANCE.createParticipantRole();
				CDAFactory.eINSTANCE.createPlayingEntity();
				// role.setPlayingEntity(pEntity);
				// coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {

				target.getParticipants().clear();
				Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
				role.setPlayingEntity(pEntity);
				coverage.setParticipantRole(role);
				coverage.setTypeCode(ParticipationType.COV);
				target.getParticipants().add(coverage);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCoverageCoverageRole(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCoverageCoverageRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.getParticipants().clear();
						Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
						holder.setTypeCode(ParticipationType.HLD);
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						pr.getAddrs().add(ad);
						holder.setParticipantRole(pr);
						target.getParticipants().add(holder);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(PolicyActivity target) {
						target.getParticipants().clear();
						Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
						holder.setTypeCode(ParticipationType.HLD);
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						pr.getAddrs().add(ad);
						holder.setParticipantRole(pr);
						target.getParticipants().add(holder);
					}
				});

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				pr.getAddrs().add(ad);
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountry(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				pr.getAddrs().add(ad);
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				pr.getAddrs().add(ad);
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressState(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				pr.getAddrs().add(ad);
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				pr.getAddrs().add(ad);
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseP(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				pr.getAddrs().add(ad);
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUse(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);
				pr.getAddrs().add(ad);
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				pr.getAddrs().add(createUSRealmAddress());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

		};

		validatePolicyActivityHolderHolderRoleGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderHolderRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRoleAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				holder.setParticipantRole(pr);
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRoleAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderHolderRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				holder.getTemplateIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.22.4.90"));
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);

				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				holder.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.getParticipants().add(holder);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityHolderHolderRole() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityHolderHolderRoleTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityHolderHolderRole",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_HOLDER_HOLDER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				target.getParticipants().add(holder);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getParticipants().clear();
				Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
				holder.setTypeCode(ParticipationType.HLD);
				holder.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				target.getParticipants().add(holder);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityHolderHolderRole(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityHolderHolderRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityEntryRelationshipTargetActActivity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityEntryRelationshipTargetActActivityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityEntryRelationshipTargetActActivity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET_ACT_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createAuthorizationActivity().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityEntryRelationshipTargetActActivity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityEntryRelationshipTargetActActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityEntryRelationshipDescriptionCoveragePlan() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityEntryRelationshipDescriptionCoveragePlanTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityEntryRelationshipDescriptionCoveragePlan",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_DESCRIPTION_COVERAGE_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				Act act = CDAFactory.eINSTANCE.createAct();
				act.setClassCode(x_ActClassDocumentEntryAct.ACT);
				act.setMoodCode(x_DocumentActMood.DEF);

				er.setAct(act);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				Act act = CDAFactory.eINSTANCE.createAct();
				act.setClassCode(x_ActClassDocumentEntryAct.ACT);
				act.setMoodCode(x_DocumentActMood.DEF);
				act.setText(DatatypesFactory.eINSTANCE.createED());
				act.getIds().add(DatatypesFactory.eINSTANCE.createII());
				er.setAct(act);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityEntryRelationshipDescriptionCoveragePlan(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityEntryRelationshipDescriptionCoveragePlanTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePolicyActivityEntryRelationshipTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityEntryRelationshipTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityEntryRelationshipTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PolicyActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PolicyActivity> {
		public PolicyActivity create() {
			return ConsolFactory.eINSTANCE.createPolicyActivity();
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
	private static class ConstructorTestClass extends PolicyActivityOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

	/**
	 * Convenience Method for creating AssignedEntity for Payer
	 */
	private static AssignedEntity createPayerAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
		assignedEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
		assignedEntity.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
		return assignedEntity;
	}

	private static AssignedEntity createGuarantorAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.110"));
		return assignedEntity;
	}

	private static Performer2 createPerformer() {
		Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
		return performer;
	}

	private static Participant2 createCoverage() {
		Participant2 coverage = CDAFactory.eINSTANCE.createParticipant2();
		ParticipantRole role = CDAFactory.eINSTANCE.createParticipantRole();
		PlayingEntity pEntity = CDAFactory.eINSTANCE.createPlayingEntity();
		role.setPlayingEntity(pEntity);
		coverage.setParticipantRole(role);
		coverage.setTypeCode(ParticipationType.COV);
		return coverage;
	}

	private static Participant2 createHolder() {
		Participant2 holder = CDAFactory.eINSTANCE.createParticipant2();
		return holder;
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

} // PolicyActivityOperations
