/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf.util;

public interface IRIMProfileConstants {

	public static final String RIM_PROFILE_NAME = "RIM";

	/** Abstract general stereotype for RIM */
	public static final String HL7_RIM = "HL7RIM";

	/*
	 * RIM Act
	 */
	public static final String ACT = "Act";

	public static final String ACT_RELATIONSHIP = "ActRelationship";

	public static final String OBSERVATION = "Observation";

	public static final String PUBLIC_HEALTH_CARE = "PublicHealthCare";

	public static final String DIAGNOSTIC_IMAGE = "DiagnosticImage";

	public static final String SUPPLY = "Supply";

	public static final String DIET = "Diet";

	public static final String WORKING_LIST = "WorkingList";

	public static final String SUBSTANCE_ADMINISTRATION = "SubstanceAdministration";

	public static final String PATIENT_ENCOUNTER = "PatientEncounter";

	public static final String PROCEDURE = "Procedure";

	public static final String DEVICE_TASK = "DeviceTask";

	public static final String CONTROL_ACT = "ControlAct";

	public static final String FINANCIAL_CONTRACT = "FinancialContract";

	public static final String INVOICE_ELEMENT = "InvoiceElement";

	public static final String ACCOUNT = "Account";

	public static final String FINANCIAL_TRANSACTION = "FinancialTransaction";

	public static final String DOCUMENT = "Document";

	public static final String CLINICAL_DOCUMENT = "ClinicalDocument";

	/*
	 * RIM Entity
	 */
	public static final String ENTITY = "Entity";

	public static final String PLACE = "Place";

	public static final String ORGANIZATION = "Organization";

	public static final String LIVING_SUBJECT = "LivingSubject";

	public static final String PERSON = "Person";

	public static final String NONPERSON_LIVING_SUBJECT = "NonPersonLivingSubject";

	public static final String MATERIAL = "Material";

	public static final String MANUFACTURED_MATERIAL = "ManufacturedMaterial";

	public static final String DEVICE = "Device";

	public static final String CONTAINER = "Container";

	/*
	 * RIM Role
	 */
	public static final String ROLE = "Role";

	public static final String ROLE_HEIR = "RoleHeir";

	public static final String ROLE_LINK = "RoleLink";

	public static final String EMPLOYEE = "Employee";

	public static final String QUALIFIED_ENTITY = "QualifiedEntity";

	public static final String ACCESS = "Access";

	public static final String PATIENT = "Patient";

	public static final String LICENSED_ENTITY = "LicensedEntity";

	public static final String SCOPE = "Scope";

	/*
	 * RIM Participation
	 */
	public static final String PARTICIPATION = "Participation";

	public static final String MANAGED_PARTICIPATION = "ManagedParticipation";

	/*
	 * RIM Non-Core
	 */
	public static final String LANGUAGE_COMMUNICATION = "LanguageCommunication";

	public static final String COMMUNICATION_FUNCTION = "CommunicationFunction";

	public static final String ACKNOWLEDGEMENT = "Acknowledgement";

	public static final String ACKNOWLEDGEMENT_DETAIL = "AcknowledgementDetail";

	/*
	 * RIM Properties
	 */
	public static final String TARGET_ROLE_NAME = "targetRoleName";

	public static final String CLASS_CODE = "classCode";

	public static final String CLASS_CODE_SYSTEM = "classCodeSystem";

	public static final String CLASS_CONCEPT_DOMAIN = "classConceptDomain";

	public static final String MOOD_CODE = "moodCode";

	public static final String MOOD_COD_SYSTEM = "moodCodeSystem";

	public static final String MOOD_CONCEPT_DOMAIN = "moodConceptDomain";

	public static final String TYPE_CODE = "typeCode";

	public static final String TYPE_CODE_SYSTEM = "typeCodeSystem";

	public static final String TYPE_CONCEPT_DOMAIN = "typeConceptDomain";

	public static final String DETERMINER_CODE = "determinerCode";

	public static final String DETERMINER_CODE_SYSTEM = "determinerCodeSystem";

	public static final String DETERMINER_CONCEPT_DOMAIN = "determinerConceptDomain";

	/*
	 * RIM Enumerations
	 */

}
